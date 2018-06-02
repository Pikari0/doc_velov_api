import requests

email=input("email : ")
password=input("password : ")

headerAuth = {"Authorization":"Taknv1 eyJhbGciOiJSUzI1NiIsInppcCI6IkRFRiJ9.eNqUkd1OhDAQRt9lroEE15_Yax_A7K3xokxnTd3SYmlhCeHdLYjsrgasd8D55szX0kPtC2DQqDprqchUZzR73j9BAtyLALzVzPGjToUpudQMO1RmTtCpApbf3Tw83u92-W0CDdkwkgdU2RJYD2jK7B0FIfenbBpF6boMjXaWo6vHjCMN7AXGzfCagDVqfF0izBIXI8AqgH4YkjWrJU0tV-vOOcBaKx1FKQ_8Y6PjSOPrCYO-JH156LNqgXO55OJL9AaOaHyYKOWb5U4avdH9O5su4ZRXctm-gqOrFPJIG9snHG-TIlyEdHJLec4wVDI8R5lrNx2Omusf81N-FYvvPY_9Lf6H0xwOZDeMX_yXbxg-AQAA__8.d9fYSPi5Ms95AHIShOZocd6cE-qnesv2hfq-8G5v0N1q_lXsr8PZ2142san6oFfRLZsMUGiOSUcQla16gOdW8P5ncn9hgfQTifZ3L5oebJ231VwLOFH9ts8Wvv-2TsijR2GgnaSRvLCWediOJV59ahI9tb_ARCUpDSoP1pvf_e9H85Rfq29XbOmZDmu6uzGepVOvbuVZd08FDmP77Q2vmAHp9aKtvdT1QpAPkE2vA1yhurCvmGu_Sw4pcEqikmM__vidfwehpLo_Gr9EcEhrTB--iaBNofaaPChRUFV0qhA194Lw4Pz1X3K9sKvO3d4QK0EY42700N7S9p3ARKlRVQ"}
headerAuth = {"Authorization":"Taknv1 eyJhbGciOiJSUzI1NiIsInppcCI6IkRFRiJ9.eNqUkcFOhDAQht9lzkDcjZuNPfsAxqvxUKaDqVtaLC0sIby7BZHd1YD1Bnz_fPO39FD7HBg0qs5ayjPVGc2enh8hAe5FAN5q5vhJp8KUXGqGHSozJ-hcAdsd9seH491hf59AQzaM7AKqbAmsBzRl9o6CkPtzNo2idF2GRjvL0dVjxpEG9gLjZnhNwBo1vi4RZomLEWAVQD8MyZrVkqaWq3XnHGCtlY6ilAX_2Og40vh6wqAvSV8f-qJa4FwuufoSvYEjGh8mSvlmuZNGb3T_zqZLOOWVXLav4OgquTzRxvYJx9ukCBchndxSXjIMlQzPUebaTYej5vbH_JTfxOJ7z2N_i__hNEVBdsP4xX_5huETAAD__w.aoUJ6o7A6oCVMjmbqPw0Q_0KXN4ZP1O-dIYWQo_oAxjpv95D8hrVcCkf19ugPUf__Udl5P0niLP7fLB9nTL2WOEz5x7C95f5ltKmaG8d1WW77AqMCtwjJ12ijDDoP25ksphD0yoItfYi3QU5RD1O4IgnwxsQJbm0TvVlf2cdx8JhA30b4rYPZ100QMN8LJV3V0JFWjBdtOMT1Grx4NqtQFmcT7LDfMobdYNCz9fReCSyUIUD0NiW7mbYfSgP5p-zYl2h7uDYs4D0T-PdC0IQhFlpmAYBPZ9vOSX364SCat-oWr_pKAx3m9db3YF93Ub5euv6Q3sywb4Jbn7FXzfQJg"}

s = requests.session()

tokensRequest = s.post("https://api.cyclocity.fr/auth/environments/PRD/client_tokens",json={"code": "vls.web.lyon:PRD", "key": "c3d9f5c22a9157a7cc7fe0e38269573bdd2f13ec48f867360ecdcbd35b196f87"})
tokens = tokensRequest.json()

#loginRequest = s.get("https://api.cyclocity.fr/identities/users/login",data={"takn":tokens['accessToken'],"email":email,"password":password})
loginRequest = s.get("https://api.cyclocity.fr/identities/users/login?takn="+tokens['accessToken']+"&email="+email+"&password="+password+"&redirect_uri=https://velov.grandlyon.com/openid_connect_login")
#print(loginRequest.__dict__)
codeOpenID=loginRequest.url.split("code=")[1]

# TODO : understand how to obtain Authorization header
authorizationRequest = s.post("https://api.cyclocity.fr/identities/token?grant_type=authorization_code&code="+codeOpenID+"&redirect_uri=https://velov.grandlyon.com/openid_connect_login",cookies=s.cookies,headers=headerAuth)
#print(authorizationRequest.text)
headerAuth['Identity']=authorizationRequest.json()['id_token']

#accountRequest = s.get("https://api.cyclocity.fr/contracts/lyon/accounts/"+email,headers=headerAuth)
#print(accountRequest.text)


#stationRequest = s.get("https://api.cyclocity.fr/contracts/lyon/stations/3018",headers=headerAuth)
#print(stationRequest.text)

#tripRequest = s.get("https://api.cyclocity.fr/contracts/lyon/accounts/"+email+"/trips",headers=headerAuth)
#print(tripRequest.text)

#rentRequest = s.get("https://api.cyclocity.fr/contracts/lyon/accounts/"+email+"/subscriptions/"+"8511079/trips",headers=headerAuth)
#print(rentRequest.text)

#rentCurrentRequest = s.get("https://api.cyclocity.fr/contracts/lyon/accounts/"+email+"/subscriptions/"+"8511079/rentbike",headers=headerAuth)
#print(rentCurrentRequest.text)

#subscriptionsRequest = s.get("https://api.cyclocity.fr/contracts/lyon/accounts/"+email+"/subscriptions",headers=headerAuth)
#print(subscriptionsRequest.text)

listBikeRequest = s.get("https://api.cyclocity.fr/contracts/lyon/stations/3018",headers=headerAuth)
print(listBikeRequest.text)


