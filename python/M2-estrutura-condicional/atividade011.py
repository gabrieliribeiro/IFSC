saldo=100
operacao="saque"
valor=120

if(operacao=="deposito"):
    saldo=saldo+valor
elif(operacao=="saque"):
    saldo=saldo-valor
    if(saldo<0):
        print("Conta sem fundos \n Chegue especial")

print(saldo)