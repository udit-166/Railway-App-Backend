from django.http import JsonResponse
from django.views.decorators.csrf import csrf_exempt
from chatbot_backend.services.chatbot_service import ChatbotService
import json

intents_path = 'C:/Users/udit shahi/Downloads/RailwayBot/intents.json'
words_path = 'C:/Users/udit shahi/Downloads/RailwayBot/words.json'
classes_path = 'C:/Users/udit shahi/Downloads/RailwayBot/classes.json'
model_path = "C:/Users/udit shahi/model.h5"

chatbot_service = ChatbotService(intents_path, model_path, words_path, classes_path)

@csrf_exempt
def chatbot_response(request):
    if request.method == "POST":
        # Handle both form data and JSON payload
        if request.content_type == 'application/json':
            try:
                data = json.loads(request.body)
                user_input = data.get("message", "")
            except json.JSONDecodeError:
                return JsonResponse({"error": "Invalid JSON"}, status=400)
        else:
            user_input = request.POST.get("message", "")
        
        if not user_input or not user_input.strip():
            return JsonResponse({"error": "Empty or invalid message"}, status=400)
        
        try:
            # Get response from chatbot
            response = chatbot_service.get_response(user_input)
            return JsonResponse({"response": response})
        except Exception as e:
            print("Error during processing:", str(e))
            return JsonResponse({"error": "Internal server error"}, status=500)
    
    return JsonResponse({"error": "Invalid request"}, status=400)