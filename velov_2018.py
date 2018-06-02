import requests

email=input("email : ")
password=input("password : ")


s = requests.session()

tokensRequest = s.post("https://api.cyclocity.fr/auth/environments/PRD/client_tokens",json={"code": "vls.web.lyon:PRD", "key": "c3d9f5c22a9157a7cc7fe0e38269573bdd2f13ec48f867360ecdcbd35b196f87"})
tokens = tokensRequest.json()

#loginRequest = s.get("https://api.cyclocity.fr/identities/users/login",data={"takn":tokens['accessToken'],"email":email,"password":password})
loginRequest = s.get("https://api.cyclocity.fr/identities/users/login?takn="+tokens['accessToken']+"&email="+email+"&password="+password+"&redirect_uri=https://velov.grandlyon.com/openid_connect_login")
#print(loginRequest.__dict__)
codeOpenID=loginRequest.url.split("code=")[1]

authorizationRequest = s.get("https://api.cyclocity.fr/identities/token?grant_type=authorization_code&code="+codeOpenID+"&redirect_uri=https://velov.grandlyon.com/openid_connect_login",cookies=s.cookies)
print(authorizationRequest.json())
