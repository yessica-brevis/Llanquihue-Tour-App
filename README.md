# Llanquihue-Tour-App
# 🧠 Evaluación Desarrollo Orientado a Objetos I – Semana 7

## 👤 Autor del proyecto

- **Nombre completo:** Yessica Ximena Brevis Garnica
- **Sección:** 008A
- **Carrera:** Analista Programador Computacional
- **Sede:** Online

---

# 📘 Descripción general del sistema

Este proyecto corresponde a la Evaluación de la Semana 7 de la asignatura **Desarrollo Orientado a Objetos I**.

El sistema fue desarrollado en Java para representar los distintos servicios turísticos ofrecidos por la agencia **Llanquihue Tour**.

En esta versión se aplican los principios de **Programación Orientada a Objetos**, utilizando:

- Herencia.
- Polimorfismo.
- Sobrescritura de métodos (@Override).
- Colecciones genéricas (`List<ServicioTuristico>`).

El sistema permite almacenar diferentes tipos de servicios turísticos en una única colección y recorrerlos de forma polimórfica, mostrando la información específica de cada servicio mediante el método `mostrarInformacion()`.

---

# 🧱 Estructura general del proyecto

```plaintext
📁 src/
├── data/
│   └── GestorServicios.java
│      # Administra la colección de servicios turísticos.

├── model/
│   ├── ServicioTuristico.java
│   │   # Superclase con los atributos y métodos comunes.
│   │
│   ├── ExcursionCultural.java
│   │   # Subclase Representa excursión cultural.
│   │
│   ├── PaseoLacustre.java
│   │   # Subclase Representa paseo por lagos.
│   │
│   └── RutaGastronomica.java
│       # Subclase Representa ruta gastronómica.

└── ui/
    └── Main.java
       # Punto de entrada del programa.
```

---

# ✅ Funcionalidades desarrolladas

- Creación de una jerarquía de clases mediante herencia.
- Sobrescritura del método `mostrarInformacion()` en cada subclase.
- Uso de una colección `List<ServicioTuristico>`.
- Almacenamiento de distintos tipos de servicios turísticos en una misma lista.
- Recorrido de la colección utilizando un ciclo **for-each**.
- Aplicación de polimorfismo para mostrar la información correspondiente a cada objeto.

---

# ⚙️ Instrucciones para compilar y ejecutar

1. Clonar o descargar el repositorio desde GitHub.

```bash
https://github.com/yessica-brevis/Llanquihue-Tour-App.git
```

2. Abrir el proyecto en **NetBeans**.

3. Compilar el proyecto.

4. Ejecutar la clase **Main.java** ubicada en el paquete **ui**.

5. Observar la salida del programa en la consola.

---

# 📂 Repositorio GitHub

```
https://github.com/yessica-brevis/Llanquihue-Tour-App.git
```

---

# 📅 Fecha de entrega

06/07/2026
