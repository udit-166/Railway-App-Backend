"""
ASGI config for chatbot_backend project.

It exposes the ASGI callable as a module-level variable named ``application``.

For more information on this file, see
https://docs.djangoproject.com/en/5.1/howto/deployment/asgi/
"""

import os
import asyncio
from django.core.asgi import get_asgi_application
from py_eureka_client.eureka_client import EurekaClient

async def register_service():
    client = EurekaClient(
        eureka_server="http://localhost:8761/eureka",
        app_name="CHATBOT-SERVICE",
        instance_port=8000,
        instance_ip="127.0.0.1",
        # instance_host="localhost",  # Set host explicitly
        # prefer_ip_address=True      # Explicitly prefer IP address
    )
    await client.start()

# Register Eureka client
asyncio.run(register_service())

os.environ.setdefault("DJANGO_SETTINGS_MODULE", "chatbot_backend.settings")

application = get_asgi_application()
