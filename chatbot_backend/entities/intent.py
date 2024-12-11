from django.db import models

# Create your models here.

class Intent(models.Model):
    tag = models.CharField(max_length=50, unique=True)
    patterns = models.JSONField()  # Store patterns as a list of strings
    responses = models.JSONField()  # Store responses as a list of strings

    def __str__(self):
        return self.tag