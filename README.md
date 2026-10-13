# 📒 Sistema Agenda de Contactos en Java

## 📌 Descripción del Proyecto

Este proyecto consiste en un **sistema de agenda de contactos** desarrollado en **Java**, que permite gestionar una lista de contactos con un máximo de **10 registros**. El sistema funciona mediante un **menú interactivo en consola**, donde el usuario puede registrar, buscar, listar, modificar y eliminar contactos, así como consultar el estado de la agenda (llena o con espacios disponibles).

El proyecto está compuesto por tres clases principales:

- **`Contacto`** → Modela un contacto individual (nombre, apellido, teléfono).
- **`Agenda`** → Contiene la lógica de gestión de contactos.
- **`Main`** → Ejecuta el menú interactivo y conecta al usuario con la agenda.
  
---

## 👥 Integrantes del Equipo y Roles Scrum

| Integrante | Rol Scrum | Responsabilidad principal |
|---|---|---|
| **Efraín Sagol** | **Scrum Master** | Facilitar el trabajo del equipo, eliminar impedimentos y asegurar la correcta aplicación de Scrum. |
| **Selene Kanagusico** | **Product Owner** | Priorizar el backlog, definir los requerimientos y representar los intereses del usuario. |
| **Adriana Benítez** | **Development Team** | Desarrollo de funcionalidades, pruebas y mantenimiento del código. |
| **Hannia Reyes** | **Development Team** | Desarrollo de funcionalidades, pruebas y mantenimiento del código. |
 (El código se escribió colaborativamente utilizando la extencion "Code With Me" de IntelliJ DEA)
---

## 🧩 Estructura del Código

### 1️⃣ Clase `Contacto`

Representa a un contacto con los siguientes atributos:

- `nombre`
- `apellido`
- `telefono`

**Características:**

- Constructor que inicializa los atributos usando los métodos `set`.
- Métodos `get` y `set` para cada atributo.
- Los `set` aplican validaciones:
    - Si el valor está vacío o en blanco, **no se asigna**.
    - El nombre y apellido se convierten a **MAYÚSCULAS**.
    - El teléfono se almacena con `trim()`.
- Sobrescritura de `toString()` para imprimir el contacto con formato: `NOMBRE APELLIDO TELEFONO`.

---

### 2️⃣ Clase `Agenda`

Administra un arreglo de contactos con capacidad máxima de **10**.

#### 🔧 Atributos

- `Contacto[] contactos` → Arreglo de contactos.
- `int contador` → Número de contactos registrados.

#### ⚙️ Métodos

| Método | Descripción |
|---|---|
| `Agenda()` | Constructor. Inicializa el arreglo con tamaño 10 y el contador en 0. |
| `existeContacto(Contacto c)` | Verifica si un contacto ya existe comparando nombre y apellido (sin distinguir mayúsculas). |
| `agregarContacto(Contacto c)` | Agrega un contacto validando: que no exista, que la agenda no esté llena y que los campos no estén vacíos. |
| `listarContactos()` | Ordena los contactos alfabéticamente por nombre + apellido (método burbuja) y los imprime. |
| `buscaContacto(String nombre, String apellido)` | Busca un contacto y muestra su información si lo encuentra. |
| `eliminarContacto(Contacto c)` | Elimina un contacto y reorganiza el arreglo. |
| `modificarTelefono(String nombre, String apellido, String nuevoTelefono)` | Actualiza el teléfono de un contacto existente. |
| `agendaLlena()` | Devuelve `true` si la agenda tiene 10 contactos. |
| `espacioLibres()` | Muestra cuántos contactos más se pueden agregar. |

---

### 3️⃣ Clase `Main`

Contiene el **menú principal** con las siguientes opciones:

```
1. Registrar un nuevo contacto
2. Verificar contacto existente
3. Listar contactos
4. Buscar contacto
5. Eliminar contacto
6. Modificar teléfono
7. Verificar si la agenda está llena
8. Mostrar espacios libres
9. Salir
```

El menú se ejecuta en un bucle `while` hasta que el usuario selecciona la opción **9**.

---

## ▶️ Ejemplo de Uso

```
════════════════════════════════════════════
          SISTEMA AGENDA
════════════════════════════════════════════
  1. Registrar un nuevo contacto
  2. Verificar contacto existente
  ...
  9. Salir
   SELECCIONA UNA OPCIÓN
════════════════════════════════════════════
1
------Agregar Contacto------
Nombre: Juan
Apellido: Pérez
Telefono: 5551234567
Contacto agregado con exito
```

---

## 🚀 Cómo Ejecutar

1. Guarda los archivos como:
    - `Contacto.java`
    - `Agenda.java`
    - `Main.java`
2. Compila los archivos:
   ```bash
   javac Contacto.java Agenda.java Main.java
   ```
3. Ejecuta el programa:
   ```bash
   java Main
   ```

---

## 📋 Reglas del Sistema

- La agenda admite **máximo 10 contactos**.
- No se permiten **contactos duplicados** (mismo nombre y apellido).
- Los campos **nombre**, **apellido** y **teléfono** no pueden estar vacíos.
- Los nombres y apellidos se almacenan en **MAYÚSCULAS**.
- La lista se ordena **alfabéticamente** al visualizarla.

---

## 🛠️ Tecnologías Utilizadas

- **Java** (JDK 8 o superior)
- **Programación Orientada a Objetos (POO)**
- **Scanner** para entrada de datos por consola
- **Arreglos** para almacenamiento de contactos

---

## ✅ Conclusión

Este proyecto permitió al equipo aplicar conceptos fundamentales de **Programación Orientada a Objetos**, manejo de **arreglos**, **validaciones**, **ordenamiento** y **menús interactivos** en Java, además de reforzar el trabajo colaborativo bajo la metodología **Scrum**.

---
