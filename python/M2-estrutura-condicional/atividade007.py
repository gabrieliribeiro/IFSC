peso=int(input("Qual o seu peso? \n"))
altura=float(input("Qual a sua altura? \n"))

imc= peso/altura**2

if(imc < 18.5):
    print("O seu IMC é:", round(imc,2), "\nVocê está abaixo do peso!")
elif(imc >= 18.5 and imc <25 ):
    print("O seu IMC é:", round(imc,2), "\nVocê está no seu peso normal!")
elif(imc >= 25 and imc <30 ):
    print("O seu IMC é:", round(imc,2), "\nVocê está acima do peso!")
else:
    print("O seu IMC é:", round(imc,2), "\nVocê está obeso!!!")
