# Función para sumar dos números
def sumar(a, b):
    return a + b
# Función para restar dos números
def restar(a, b):
    return a - b
# Función para multiplicar dos números
def multiplicar(a, b):
    return a * b
# Función para dividir dos números
def dividir(a, b):
    if b != 0:
        return a / b
    else:
        return "Error: No se puede dividir entre cero"
#funcion  principal del programa
def calculadora():
    print("1. sumar")
    print("2. restar")
    print("3. multiplicar")
    print("4. dividir")
    print("5. salir")
    while True:
        opcion = input("Seleccione una opcion: ")
        if opcion == "1":
            num1 = float(input("Ingrese el primer numero: "))
            num2 = float(input("Ingrese el segundo numero: "))
            resultado = sumar(num1, num2)
            print("El resultado es: ", resultado)
        elif opcion == "2":
            num1 = float(input("Ingrese el primer numero: "))
            num2 = float(input("Ingrese el segundo numero: "))
            resultado = restar(num1, num2)
            print("El resultado es: ", resultado)
        elif opcion == "3":
            num1 = float(input("Ingrese el primer numero: "))
            num2 = float(input("Ingrese el segundo numero: "))
            resultado = multiplicar(num1, num2)
            print("El resultado es: ", resultado)
        elif opcion == "4":
            num1 = float(input("Ingrese el primer numero: "))
            num2 = float(input("Ingrese el segundo numero: "))
            resultado = dividir(num1, num2)
            print("El resultado es: ", resultado)
        elif opcion == "5":
            print("Gracias por usar la clculadora. ¡Hata luego!")
            break
        else:
            print("Opcion invalida. Por favor, seleccione una opcion valida.")
calculadora()