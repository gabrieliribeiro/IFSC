#1- Faça um programa que leia o nome de uma pessoa, o sexo e
#a altura. O programa deve calcular o peso ideal: 
# Peso ideal=  IMC*altura². 
# Considere o  IMC ideal do homem é 22 e o da mulher é 21.


nome=(input("Informe seu nome: "))
altura=float(input("Informe sua altura: "))
genero=(input("Informe sua sexo(fem/masc): "))


if genero == "fem":
    IMC=21
    ideal=IMC*altura**2
    print(round(ideal,2))

elif genero == "masc":
    IMC = 22
    ideal=IMC*altura**2
    print("Seu peso ideal",nome,"é de:",round(ideal,2))

else:
    print("Genero não valido")
    