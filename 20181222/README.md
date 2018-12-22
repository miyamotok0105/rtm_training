
# 急遽rails girlsをやります。

バージョン
ruby 2.5.3
Rails 5.2.1

awsか仮想環境でcentosを使用。

## rbenv入れます。

アップデート

```
sudo yum update
```

rbenv入れる

```
git clone https://github.com/sstephenson/rbenv.git ~/.rbenv
git clone https://github.com/sstephenson/ruby-build.git ~/.rbenv/plugins/ruby-build
sudo ~/.rbenv/plugins/ruby-build/install.sh
```

設定。

```
echo '# rbenv' >> ~/.bash_profile
echo 'export PATH="$HOME/.rbenv/bin:$PATH"' >> ~/.bash_profile
echo 'eval "$(rbenv init -)"' >> ~/.bash_profile
```

```
source ~/.bash_profile
```

必要なモジュールを入れる。
yumはcentosのパッケージマネージャ。

```
sudo yum install -y bzip2 gcc openssl-devel readline-devel zlib-devel make libffi-devel git sqlite-devel
curl --silent --location https://rpm.nodesource.com/setup_8.x | sudo bash -
sudo yum -y install nodejs
```

railsとbundlerを入れる。
gemはrubyのパッケージマネージャ。

```
gem install -v 5.2.1 rails
gem install bundler
```

Gemfileの内容をinstallする。

```
bundle install
```

# 1.アプリケージョンを作る

```
mkdir projects
cd projects
rails new railsgirls
cd railsgirls
rails server
```


実行する。

```
rails server -p 8080 -b 172.31.57.210
```


# 2.Ideaのscaffoldをする

```
rails generate scaffold idea name:string description:text picture:string
```

```
rails db:migrate
```

接続

http://3.83.83.152:8080/


## mvcとは

画面に入力されるとViewを通ってControllerに行く。
Controllerは入力内容を受け取り、ViewとModelの対を選定。

例1.
トップ画面からユーザー情報画面へのリンクをクリック
→
UserController
→
UserViewへ移動



- Model

ビジネスロジックの実行
データの操作

- View

画面側の操作


- Controller

処理を行うModelと結果を返すViewを選定する。
司令する側








