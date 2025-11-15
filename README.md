# ⚡ Conversor de Monedas | Challenge ONE

<p align="center">
  <img src="https://img.shields.io/badge/Java-21-red?style=for-the-badge" />
  <img src="https://img.shields.io/badge/Status-Finalizado-brightgreen?style=for-the-badge" />
  <img src="https://img.shields.io/badge/Proyecto-Oracle%20ONE-blue?style=for-the-badge" />
  <img src="https://img.shields.io/badge/Tool-IntelliJ%20IDEA-purple?style=for-the-badge" />
</p>

---

## 🌍 Descripción del Proyecto

Este proyecto es un **Conversor de Monedas en Java**, desarrollado como parte del programa  
**Oracle Next Education (ONE) – Alura Latam**.

El conversor obtiene tasas reales mediante una API externa y permite convertir divisas desde consola.

---

## ✨ Vista Previa (Consola)

```bash
===============================
   CONVERSOR DE MONEDAS 💱
===============================

1) USD → MXN
2) MXN → USD
3) EUR → USD
4) Salir

Selecciona una opción:
```
---
## 🚀 Tecnologías Utilizadas

- Java 21  
- Gson (procesamiento de JSON)  
- Java HTTPClient  
- API Exchange Rates  
- IntelliJ IDEA  
- Git & GitHub  

---

## 📁 Estructura del Proyecto

```text
📦 mi-proyecto
┣ 📂 src
┃ ┣ 📄 ClienteApi.java
┃ ┣ 📄 ServicioMoneda.java
┃ ┗ 📄 ConversorMoneda.java
┣ 📄 .gitignore
┗ 📄 README.md
```

___


---

## 🧠 Arquitectura del Código

| Clase | Función |
|-------|---------|
| **ClienteApi** | Realiza la solicitud HTTP para obtener las tasas de la API. |
| **ServicioMoneda** | Procesa el JSON recibido y obtiene los valores necesarios. |
| **ConversorMoneda** | Controla el menú, entrada de usuario y operaciones de conversión. |

---

## 🔧 Instalación y Ejecución

### 1️⃣ Clonar el repositorio
```bash
git clone https://github.com/Jesus645363/mi-proyecto.git
```
### 2️⃣ Abrir en IntelliJ IDEA

### 3️⃣ Ejecutar la clase principal
 ````java
ConversorMoneda.java
````
___

## 🧩 Posibles mejoras Futuras
- Implementar interfaz gráfica (JavaFX)

- Historial de conversiones

- Soporte para más divisas

- Manejo de errores avanzados
___

## 👤 Autor 
>**Jesús Castillo**

>>Participante de Oracle ONE – Alura LATAM

>>>GitHub: https://github.com/Jesus645363
___

*⭐ Si te sirvió, deja una estrella*
