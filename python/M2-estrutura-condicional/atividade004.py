angulo1=90
angulo2=60
angulo3=45

if(angulo1 > 90):
    print("Obtuso")
elif(angulo1 < 90):
    print("Agudo")
else:
    print("Reto")

if(angulo2 > 90):
    print("Obtuso")
elif(angulo2 < 90):
    print("Agudo")
else:
    print("Reto")

if(angulo3 > 90):
    print("Obtuso")
elif(angulo3 < 90):
    print("Agudo")
else:
    print("Reto")

if(angulo1+angulo2+angulo3==180):
    print("É um triangulo!")
else:
    print("Não é um triangulo!")
