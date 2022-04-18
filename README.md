# Tenpo crud transaction API
App for visualization of transactions
<p align="center">
  <a href="https://github.com/Avesousa/crud-transactions/graphs/contributors"><img alt="Contributors" src="https://img.shields.io/github/contributors/andreasbm/readme.svg" height="20"/></a>
  <a href="https://github.com/Avesousa/crud-transactions/graphs/commit-activity"><img alt="Maintained" src="https://img.shields.io/badge/Maintained%3F-yes-green.svg" height="20"/></a>
</p>

### ➤ Getting Started

* Install Java, JDK, NODE and maven
* Run for build app
```
./starup_back.sh
./starup_front.sh
```

### ➤ Login

```
{context-path}/tenpo/auth/register
``` 
body:
``` 
    {
        "username":"username",
        "email": "email@gmail.com",
        "password":"password"
    }
``` 

Take the token here.
```
{context-path}/tenpo/auth/login
``` 
body:
``` 
    {
        "username":"username",
        "password":"password"
    }
``` 


For any request
Header:
``` 
    {
        "Authorization":"Bearer {token}"
    }
``` 
### ➤ Documentation of API

```
{context-path}/tenpo/docs.html
```

