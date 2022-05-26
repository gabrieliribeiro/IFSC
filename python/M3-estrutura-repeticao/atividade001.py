#1 - Leia os valores de produtos num carrinho de compra e exiba o valor total da compra;

total= 0
preco = 1

while(preco>0):   
    preco=int(input("Valor:"))
    if(preco>=0):
        total=total+preco
print("Total da compra:", total)
