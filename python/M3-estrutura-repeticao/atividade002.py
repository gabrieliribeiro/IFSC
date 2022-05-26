#2 - Leia as notas de um aluno e imprima a média de notas;

soma=0
nota=0
quantidade=0


while(nota!=-1):
    nota=float(input("Digite uma nota:"))
    if(nota>=0):
        soma=soma+nota
        quantidade=quantidade+1
        media=soma/quantidade

print("Soma é:", soma)
print("Quantidade é: ", quantidade)    
print("A média é de: ", media) 
    