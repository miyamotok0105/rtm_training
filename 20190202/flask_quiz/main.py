import os
from flask import send_from_directory
from flask import Flask, render_template
app = Flask(__name__)

@app.route('/')
def index():
    return render_template('index.html')

@app.route('/favicon.ico')
def favicon():
    return send_from_directory(os.path.join(app.root_path, 'static'),
                               'favicon.ico', mimetype='image/vnd.microsoft.icon')
    
#@app.route('/user/<name>')
#def user(name):
#    return render_template('user.html', name=name)

if __name__ == '__main__':
    app.run(debug=True, host='0.0.0.0', port=8080)
    # app.run(debug=True, host='150.95.186.132', port=8080)
    
