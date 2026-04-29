"""
Ejercicio: Análisis de Ventas Mensuales con NumPy
Analista: [Nombre del Analista Jr]
Revisado por: [Analista Senior]
Fecha: [Fecha]
"""

import numpy as np

print("\n" + "="*90)
print("EJERCICIO: ANÁLISIS DE VENTAS MENSUALES CON NUMPY")
print("="*90)

# ============================================================================
# PASO 1: CREAR ARRAYS CON DATOS DE VENTAS
# ============================================================================
print("\n" + "="*90)
print("PASO 1: CREAR ARRAYS CON DATOS DE VENTAS")
print("="*90)

# Array con nombres de meses
meses = np.array(['ene', 'feb', 'mar', 'abr', 'may', 'jun', 
                  'jul', 'ago', 'sep', 'oct', 'nov', 'dic'])

# Arrays de ventas mensuales para tres productos (A, B, C como se solicita)
ventas_A = np.array([1000, 5000, 2344, 2510, 123, 50,
                     200, 1781, 780, 5340, 20, 212])

ventas_B = np.array([1000, 5454, 244, 250, 2344, 5080,
                     210, 114, 7330, 5478, 25, 212])

ventas_C = np.array([100, 4780, 5454, 2560, 1230, 5004,
                     2030, 1187, 781, 2510, 203, 2254])

# Matriz 2D con todas las ventas (3 productos × 12 meses)
ventas_array = np.array([ventas_A, ventas_B, ventas_C])

# Total de ventas por mes (se calcula una vez para reutilizar)
total_por_mes = np.sum(ventas_array, axis=0)

print(f"\nMeses:    {meses}")
print(f"\nVentas Producto A: {ventas_A}")
print(f"\nVentas Producto B: {ventas_B}")
print(f"\nVentas Producto C: {ventas_C}")
print(f"\nMatriz de ventas (3 productos × 12 meses\n):")
print(ventas_array)
print(f"\nForma de la matriz: {ventas_array.shape}")

# ============================================================================
# PASO 2: ESTADÍSTICAS BÁSICAS
# ============================================================================
print("\n" + "="*90)
print("PASO 2: ESTADÍSTICAS BÁSICAS")
print("="*90)

# Calcular medias y sumas para cada producto
media_A = np.mean(ventas_A)
suma_A = np.sum(ventas_A)

media_B = np.mean(ventas_B)
suma_B = np.sum(ventas_B)

media_C = np.mean(ventas_C)
suma_C = np.sum(ventas_C)

print("\nMEDIA Y SUMA DE VENTAS POR PRODUCTO:")
print("-" * 50)
print(f"Media de ventas Producto A: ${media_A:,.2f}")
print(f"Suma de ventas Producto A: ${suma_A:,.0f}")
print(f"\nMedia de ventas Producto B: ${media_B:,.2f}")
print(f"Suma de ventas Producto B: ${suma_B:,.0f}")
print(f"\nMedia de ventas Producto C: ${media_C:,.2f}")
print(f"Suma de ventas Producto C: ${suma_C:,.0f}")

# Estadísticas totales
media_total = np.mean(ventas_array)
suma_total = np.sum(ventas_array)

print("\n" + "-" * 50)
print("ESTADÍSTICAS GENERALES:")
print("-" * 50)
print(f"Media total de ventas: ${media_total:,.2f}")
print(f"Suma total de ventas: ${suma_total:,.0f}")

# ============================================================================
# PASO 3: MANIPULACIÓN Y ANÁLISIS DE DATOS
# ============================================================================
print("\n" + "="*90)
print("PASO 3: MANIPULACIÓN Y ANÁLISIS DE DATOS")
print("="*90)

print("\nTOTAL DE VENTAS POR MES:")
print("-" * 50)
for mes, total in zip(meses, total_por_mes): #zip: funcion que combina 2 o mas listas
                                            #Toma elementos en la misma posición de cada lista y los empareja
    print(f"{mes}: ${total:>9,.0f}")
'''EJEMPLO ZIP 
meses = ["Enero", "Febrero", "Marzo"]
total_por_mes = [1000, 1500, 2000]

zip() crea pares: ("Enero", 1000), ("Febrero", 1500), ("Marzo", 2000)

FOR MES, TOTAL IN : desempaquetado de tuplas,
    mes recibe el primer elemento del par (el nombre del mes)
    total recibe el segundo elemento (el valor numérico)
    
print(f"{mes}: ${total:>9,.0f}")
{mes} → imprime el nombre del mes
: $ → texto literal ": $"
{total:>9,.0f} → formatea el número:
> → alineación a la derecha
9 → ancho total de 9 caracteres
, → separador de miles (1,000, 2,500)
.0f → 0 decimales (formato entero)
'''

print("\nPROMEDIO DE VENTAS POR PRODUCTO:")
print("-" * 50)
productos = ['Producto A', 'Producto B', 'Producto C']
medias_productos = [media_A, media_B, media_C]
for producto, media in zip(productos, medias_productos):
    print(f"{producto}: ${media:>9,.2f}")

print("\nMES CON MAYOR Y MENOR VENTAS:")
print("-" * 50)
# Usar índices para encontrar meses extremos
indice_max = np.argmax(total_por_mes)
indice_min = np.argmin(total_por_mes)

print(f"• Mes con MAYOR ventas totales: {meses[indice_max]} (${total_por_mes[indice_max]:,.0f})")
print(f"• Mes con MENOR ventas totales: {meses[indice_min]} (${total_por_mes[indice_min]:,.0f})")

# ============================================================================
# PASO 4: OPERACIONES AVANZADAS CON NUMPY
# ============================================================================
print("\n" + "="*90)
print("PASO 4: OPERACIONES AVANZADAS CON NUMPY")
print("="*90)

# Reshape a array tridimensional (3, 4, 3)
print("\n1. RESHAPE A 3 DIMENSIONES (3, 4, 3):")
print("-" * 50)
ventas_3d = ventas_array.reshape(3, 4, 3)
print(f"Forma original: {ventas_array.shape}")
print(f"Forma después de reshape: {ventas_3d.shape}")
print("\nContenido del array 3D:")
for i, producto in enumerate(productos): #bucle
    '''productos → lista con nombres de productos
       enumerate(productos) → genera pares (índice, valor)
       ejemplo: productos = ["Laptop", "Mouse", "Teclado"]
                 enumerate genera: (0, "Laptop"), (1, "Mouse"), (2, "Teclado")
'''
    print(f"\n{producto}:") # Imprimir nombre del producto 
    print(f"{'='*30}") #Crea una línea visual para separar secciones
    print(ventas_3d[i])
    '''ventas_3d[i] → accede a la sección i del array 3D
        Como i viene de enumerate(), coincide con el índice del producto'''
'''ESTRUCTURA DEL ARRAY 3D: 
1 CAPA O DIMENSION: producto A, producto B, producto C
2 CAPA O DIMENSION: periodo de tiempo Meses
3 CAPA O DIMENSION: categoria Ventas '''

# Transposición
print("\n2. TRANSPOSICIÓN DE LA MATRIZ:")
print("-" * 50)
ventas_transpuesta = ventas_array.T
print("Matriz original (productos × meses):")
print(ventas_array)
print(f"\nForma: {ventas_array.shape}")
print("\nMatriz transpuesta (meses × productos):")
print(ventas_transpuesta)
print(f"Forma: {ventas_transpuesta.shape}")

# Invertir arrays
print("\n3. INVERTIR VENTAS POR PRODUCTO:")
print("-" * 50)
ventas_A_invertido = ventas_A[::-1]
ventas_B_invertido = ventas_B[::-1]
ventas_C_invertido = ventas_C[::-1]
meses_invertidos = meses[::-1]

print("Ventas en orden inverso (de diciembre a enero):")
for i, mes in enumerate(meses_invertidos):
    print(f"{mes}: A=${ventas_A_invertido[i]:>5}, B=${ventas_B_invertido[i]:>5}, C=${ventas_C_invertido[i]:>5}")

# Aplanar la matriz
print("\n4. APLANAR LA MATRIZ:")
print("-" * 50)
ventas_aplanadas = ventas_array.flatten()
print(f"Array aplanado (1D): {ventas_aplanadas}")
print(f"Longitud: {len(ventas_aplanadas)}")

# ============================================================================
# PASO 5: ANÁLISIS DE ELEMENTOS ÚNICOS
# ============================================================================
print("\n" + "="*90)
print("PASO 5: ANÁLISIS DE ELEMENTOS ÚNICOS")
print("="*90)

valores_unicos, conteos = np.unique(ventas_array, return_counts=True)

print("\nVALORES ÚNICOS EN LOS DATOS DE VENTAS:")
print("-" * 50)
print(f"Número de valores únicos: {len(valores_unicos)}")

# Mostrar los 10 valores más comunes
print("\nTOP 10 VALORES MÁS FRECUENTES:")
print("-" * 30)
indices_ordenados = np.argsort(-conteos)  # Orden descendente
for i in range(min(10, len(valores_unicos))):
    idx = indices_ordenados[i]
    print(f"${valores_unicos[idx]:>5}: aparece {conteos[idx]:>2} vez/veces")

# ============================================================================
# PASO 6: INDEXACIÓN Y SLICING
# ============================================================================
print("\n" + "="*90)
print("PASO 6: INDEXACIÓN Y SLICING")
print("="*90)

# Ventas del primer trimestre
print("\n1. VENTAS DEL PRIMER TRIMESTRE (Enero-Marzo):")
print("-" * 50)
ventas_trimestre = ventas_transpuesta[:3]  # Primeros 3 meses
for i, mes in enumerate(meses[:3]):
    print(f"{mes}: A=${ventas_A[i]:>5}, B=${ventas_B[i]:>5}, C=${ventas_C[i]:>5}")

# Indexación booleana: meses con ventas totales > 800
print("\n2. MESES CON VENTAS TOTALES SUPERIORES A $800:")
print("-" * 50)
mascara_mayor_800 = total_por_mes > 800
meses_mayor_800 = meses[mascara_mayor_800]
totales_mayor_800 = total_por_mes[mascara_mayor_800]

if len(meses_mayor_800) > 0:
    print("Meses que superan los $800 en ventas totales:")
    for mes, total in zip(meses_mayor_800, totales_mayor_800):
        print(f"  • {mes}: ${total:,.0f}")
else:
    print("No hay meses con ventas totales superiores a $800")

# Selección avanzada: meses pares (feb, abr, jun, ago, oct, dic)
print("\n3. VENTAS DE MESES PARES (Febrero, Abril, Junio, Agosto, Octubre, Diciembre):")
print("-" * 50)
indices_meses_pares = list(range(1, 12, 2))  # Índices 1, 3, 5, 7, 9, 11
print(f"Índices de meses pares: {indices_meses_pares}")
print("Ventas totales por mes par:")
for idx in indices_meses_pares:
    venta_mes = ventas_A[idx] + ventas_B[idx] + ventas_C[idx]
    print(f"  • {meses[idx]}: ${venta_mes:,.0f}")

# Crear nueva matriz con meses pares
ventas_meses_pares = ventas_transpuesta[indices_meses_pares]
print(f"\nMatriz de ventas para meses pares (6 meses × 3 productos):")
print(ventas_meses_pares)
print(f"Forma: {ventas_meses_pares.shape}")

# ============================================================================
# RESUMEN EJECUTIVO
# ============================================================================
print("\n" + "="*90)
print("RESUMEN EJECUTIVO DEL ANÁLISIS")
print("="*90)

print("\n📊 ESTADÍSTICAS CLAVE:")
print("-" * 40)

# Producto con mayor ventas totales
sumas_productos = [suma_A, suma_B, suma_C]
producto_max = productos[np.argmax(sumas_productos)]
suma_max = max(sumas_productos)

# Producto con mayor promedio
medias_productos = [media_A, media_B, media_C]
producto_max_media = productos[np.argmax(medias_productos)]
media_max = max(medias_productos)

print(f"• Producto con MAYOR ventas totales: {producto_max} (${suma_max:,.0f})")
print(f"• Producto con MAYOR promedio mensual: {producto_max_media} (${media_max:,.2f})")
print(f"• Mes más fuerte: {meses[indice_max]} (${total_por_mes[indice_max]:,.0f})")
print(f"• Mes más débil: {meses[indice_min]} (${total_por_mes[indice_min]:,.0f})")
print(f"• Rango de ventas mensuales totales: ${total_por_mes.min():,.0f} - ${total_por_mes.max():,.0f}")

print("\n📈 DISTRIBUCIÓN DE VENTAS:")
print("-" * 40)
print(f"• Ventas totales anuales: ${suma_total:,.0f}")
print(f"• Promedio mensual total: ${np.mean(total_por_mes):,.0f}")
print(f"• Desviación estándar mensual: ${np.std(total_por_mes):,.0f}")

print("\n" + "="*90)
print("="*90)