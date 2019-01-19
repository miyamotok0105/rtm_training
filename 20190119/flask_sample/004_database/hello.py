import os
from flask import Flask, render_template, request
#from flask.ext.pymongo import PyMongo
from flaskext.mysql import MySQL

app = Flask(__name__)
mysql = MySQL()
#app.config['MONGO_URI'] = os.environ['MONGO_URI']
#mongo = PyMongo(app)
app.config['MYSQL_DATABASE_USER'] = 'user1'
app.config['MYSQL_DATABASE_PASSWORD'] = 'password'
app.config['MYSQL_DATABASE_DB'] = 'db1'
app.config['MYSQL_DATABASE_HOST'] = '150.95.186.132'
app.config['MYSQL_DATABASE_PORT'] = 3306
mysql.init_app(app)

def ExecuteQuery(sql):
  cur = mysql.connect().cursor()
  cur.execute(sql)
  results = [dict((cur.description[i][0], value)
    for i, value in enumerate(row)) for row in cur.fetchall()]
  return results

@app.route('/', methods=['GET', 'POST'])
def index():
    name = None
    new = False
    if request.method == 'POST' and 'name' in request.form:
        shain_id = request.form['shain_id']
        name = request.form['name']

        conn = mysql.connect()
        cursor = conn.cursor()
        cursor.execute('insert into hyou1 values (\'{shainID}\', \'{na\
me}\', \'\', \'\')'.format(shainID=shain_id, name=name))
        conn.commit()
        #print(results)
        new = True
    return render_template('index.html')

@app.route('/users')
def users():
    results = ExecuteQuery('select * from hyou1')
    for row in results:
      print(row)
      print(row["shainID"])
      print(row["name"])
      print(row["yakusyoku"])
    return render_template('users.html', results=results)
  
if __name__ == '__main__':
    app.run(debug=True, host='150.95.186.132', port=8080)
    
