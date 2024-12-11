import json
import random
import numpy as np
from tensorflow.keras.models import load_model
from chatbot_backend.repositories.intent_repositories import IntentRepository
from nltk.stem import LancasterStemmer
from string import punctuation

class ChatbotService:
    def __init__(self, intents_path, model_path, words_path, classes_path):
        self.stemmer = LancasterStemmer()
        self.intents_path = intents_path
        self.model = self.load_model(model_path)
        self.words = self.load_json(words_path)
        self.classes = self.load_json(classes_path)
        self.intents = self.load_intents()
    
    def load_json(self, filepath):
        try:
            with open(filepath, 'r') as file:
                return json.load(file)
        except FileNotFoundError:
            print(f"Error: The file {filepath} was not found.")
            return []
        except json.JSONDecodeError:
            print(f"Error: The file {filepath} contains invalid JSON.")
            return []
    
    def load_intents(self):
        try:
            with open(self.intents_path, 'r') as f:
                return json.load(f)['intents']
        except FileNotFoundError:
            print("Error: The intents.json file was not found.")
            return []
        except json.JSONDecodeError:
            print("Error: The intents.json file contains invalid JSON.")
            return []
    
    def load_model(self, model_path):
        try:
            model = load_model(model_path)
            print("Model loaded successfully.")
            return model
        except Exception as e:
            print(f"Error loading model: {str(e)}")
            return None
    
    def bag_of_words(self, sentence):
        # Tokenize and stem the sentence
        sentence_words = self.tokenize_and_stem(sentence)
        # Initialize bag with 0 for each word in vocabulary
        bag = [0] * len(self.words)
        for s in sentence_words:
            for i, word in enumerate(self.words):
                if word == s:
                    bag[i] = 1
        return np.array(bag)
    
    def tokenize_and_stem(self, sentence):
        return [self.stemmer.stem(word.lower()) for word in sentence.split() if word not in punctuation]
    
    def get_response(self, user_input):
        if not self.model:
            return "Model is not loaded."
        
        bow = self.bag_of_words(user_input)
        bow = np.expand_dims(bow, axis=0)  # Add batch dimension
        
        # Predict using the model
        predictions = self.model.predict(bow)[0]
        result_index = np.argmax(predictions)
        tag = self.classes[result_index]
        
        if predictions[result_index] > 0.65:
            intent = IntentRepository.get_intent_by_tag(tag)
            if intent:
                return random.choice(intent['responses'])
        
        return "I did not understand you!"
