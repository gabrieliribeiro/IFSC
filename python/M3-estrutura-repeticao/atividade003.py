#3 - Solicite que o usuário digite um número par e positivo. Repita a operação enquanto ele não digitar um número correto

numero=1

while(numero%2!=0 or numero<0):
    numero=int(input("Informe um número:\n"))
    if(numero%2 != 0 or numero<=0 ):
        print("Por-favor informe um número par e positivo!")
        numero=int(input("Informe um número:\n"))
