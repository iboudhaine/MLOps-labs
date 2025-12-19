from locust import HttpUser, task 
from random import choice 
from string import ascii_uppercase

class User(HttpUser):
    @task 
    def predict(self): 
        # Payload for the Question Answering model
        # Endpoint: /question_answering
        # payload = {
        #     "question": "What is being tested?",
        #     "context": "The student is currently performing model testing in a lab."
        # } 

        # Endpoint: /sentiment
        # payload = {"text": "This lab is working perfectly!"} 
        payload = {"text": ''.join(choice(ascii_uppercase) for i in range(20))}

        self.client.post("/sentiment", json=payload)
