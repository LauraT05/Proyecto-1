from datetime import date
hoy =  date.today()
print()
print("Hoy es el día: ", hoy)
print()

a=int(input("Digite el valor de A: "))
b=int(input("Digite el valor de B: "))
c=int(input("Digite el valor de C: "))
x=[a, b, c]
print()
if a<b and a<c:
    print("A es menor a B y C")
elif b<a and b<c:
    print("B es menor que A y C")
elif a==b or b==c or a==c:
    print("Hay números iguales, intenta de nuevo")
else:
    print("C es menor que A y B")
 
print()
print("El valor máximo es: ", max(x))
print("El valor mínimo es: ", min(x))
print()

print("Cursos disponibles")
print()
print("1. Requerimientos, 2. Algoritmos, 3. Quimica")
print()

seleccion=int(input("Digita el número correspondiente al curso <1, 2 o 3>: "))
print()

if seleccion==1:
    print("Usted estudia Programación de Software")
elif seleccion==2:
    print("Usted estudia Programación de Software")
elif seleccion==3:
    print("Usted estudia otro programa diferente a Programación de Software")
else:
    print("Opción no válida")
print()

print("***   Final del Análisis de programa de formación SENA   ***")
print()

frase= input("Digite una oración: ")
print()
print(frase.center(25))
print("La frase en mayúscula es: ", frase.upper())
longitud= len(frase)
print("La longitud de la frase es: ", len(frase), "caracteres")

if longitud>10:
    print("La frase contine mas de 10 carácteres")
else:
    print("La frase contiene menos de 11 carácteres")
print()
print("FIN")
