Here's an example of how you can implement a method to reset user data to a predefined state using Flask API in Python:

```python
from flask import Flask, request, jsonify

app = Flask(__name__)

# Predefined user data
predefined_data = {
    "users": [
        {"id": 1, "name": "John"},
        {"id": 2, "name": "Jane"},
        {"id": 3, "name": "Bob"}
    ]
}

# Route to reset user data
@app.route('/reset-data', methods=['POST'])
def reset_data():
    # Check if the request has the required authentication token
    auth_token = request.headers.get('Authorization')
    if auth_token != 'your_authentication_token':
        return jsonify({'message': 'Unauthorized'}), 401

    # Reset user data to predefined state
    global predefined_data
    user_data = predefined_data.copy()

    return jsonify({'message': 'User data has been reset to predefined state'})

if __name__ == '__main__':
    app.run()
```

In this example, we define a Flask API endpoint `/reset-data` that accepts a POST request. The request should include an `Authorization` header with a pre-defined authentication token to ensure responsible usage.

If the authentication token is valid, the user data is reset to the predefined state by copying the `predefined_data` dictionary to a new `user_data` dictionary.

You can modify the `predefined_data` dictionary to match your desired predefined user data structure.

Please note that this is a basic implementation and does not include any persistence or error handling. You can add additional functionality and error handling as per your requirements.