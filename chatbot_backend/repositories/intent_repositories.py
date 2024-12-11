import json
from chatbot_backend.entities.intent import Intent

class IntentRepository:
    @staticmethod
    def get_all_intents():
        return Intent.objects.all()

    @staticmethod
    def get_intent_by_tag(tag):
        try:
            with open('C:/Users/udit shahi/Downloads/RailwayBot/intents.json', 'r') as f:
                intents_data = json.load(f)
            for intent in intents_data['intents']:
                if intent['tag'] == tag:
                    return intent
            return None  # Return None if no matching tag is found
        except FileNotFoundError:
            print("Error: The intents.json file was not found.")
            return None
        except json.JSONDecodeError:
            print("Error: The intents.json file contains invalid JSON.")
            return None

    @staticmethod
    def save_intent(intent):
        intent.save()