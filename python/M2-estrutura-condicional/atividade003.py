ladoA=5
ladoB=7
ladoC=4

if(ladoA==ladoB and ladoB==ladoC):
    print("Triangulo equilatero")
elif(ladoA==ladoB or ladoB==ladoC or ladoA==ladoC):
    print("Triangulo isoceles")
else:
    print("Triangulo escaleno")
