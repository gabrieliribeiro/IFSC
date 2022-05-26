# Faça um algoritmo que leia o nome, o sexo e o estado civil de uma pessoa. Caso sexo seja “F” e
#estado civil seja “CASADA”, solicitar o tempo de casada (anos)

nome=(input("Qual o seu nome? \n"))
genero=(input("Qual o seu gênero F/M ?  \n"))
estadoCivil=(input("Você é casado(a) S/N? \n"))

if(genero =="F"):
    anos=input("Está a quanto tempo casada? \n")
    print("Olá",nome,"! \nVocê está casada há", anos, "anos!")
else:
    print("Olá", nome ,"!")