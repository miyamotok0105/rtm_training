# encoding: utf-8
import os
import io
import json
import flask
from flask import Flask, render_template, request, redirect, url_for, send_from_directory, session
# from werkzeug import secure_filename

app = flask.Flask(__name__)
   
#http://0.0.0.0:8888/hello
@app.route('/hello')
def hello():
    name = "Hello World. !"
    return name

@app.route('/hello2')
def render_static():
    return render_template('hello2.html')

if __name__ == "__main__":
    # awsにでぷろい：awsのプライベートip 
    app.run(port=os.environ.get('PORT', 8888), host="0.0.0.0")

