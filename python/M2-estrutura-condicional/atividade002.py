velocidade=int(input("Qual a velocidade do veículo? "))
limiteVel=int(input("Qual o limite de velocidade da via? "))

if velocidade<limiteVel:
     print("Sem multa")

elif velocidade<=limiteVel*1.2:
    print("Falta leve")

elif velocidade>limiteVel*1.2:
    print("Falta Grave")