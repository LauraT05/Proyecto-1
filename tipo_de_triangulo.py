

from datetime import date
hoy =  date.today()
print()
print("Hoy es el día: ", hoy)
print()


a=int(input("Digite el valor de A: "))
b=int(input("Digite el valor de B: "))
c=int(input("Digite el valor de C: "))

perimetro=(a+b+c)
area=(a*b)/2
print()
if a <= 0 or b <= 0 or c <= 0:
    print("¡Error! Los lados deben ser mayores a cero")
else:
    if a==b and a==c and b==c:
        print("El triangulo es EQUILATERO")
    elif a==b or b==c or a==c:
        print("El triangulo es ISOCELES")
    else:
        print("El triangulo es ESCALENO")

print("El perimetro del triangulo es: ",perimetro)
print("El área del triangulo es: ",area)

print()
animal=input("Digite un animal: ")
animal=animal.upper()
if len(animal) > 10:
    print("¡Nombre demasiado largo!")
elif animal=="PERRO":
    print("El",animal,"es el mejor amigo del hombre")
elif animal=="GATO":
    print("El",animal,"usualmente persigue ratones o insectos")
else:
    print("No es un PERRO, no es un GATO, es un", animal)
     
print()
print("FIN")
