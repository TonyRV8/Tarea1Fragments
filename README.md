# 1 Activity 5 Fragments

Una aplicación Android educativa que demuestra el uso de fragmentos y diferentes componentes de Material Design 3. La app está construida en Kotlin y utiliza Navigation Component para la navegación entre fragmentos.

## 📱 Características

- **5 Fragmentos diferentes** que muestran diversos componentes de UI
- **Material Design 3** con tema personalizado
- **Bottom Navigation** para navegación intuitiva
- **Navegación entre fragmentos** usando Navigation Component
- **Interfaz responsive** y moderna

## 🏗️ Arquitectura

La aplicación sigue el patrón de arquitectura de fragmentos únicos con:
- `MainActivity`: Activity principal que contiene el NavHostFragment
- **5 Fragmentos especializados**:
  - `TextFieldsFragment`: Campos de texto interactivos
  - `ButtonsFragment`: Diferentes tipos de botones
  - `SelectionElementsFragment`: Controles de selección
  - `ListFragment`: Lista con RecyclerView
  - `InfoFragment`: Información con componentes visuales

## 📋 Funcionalidades por Fragmento

### 🖊️ Text Fields
- Campo de texto con Material Design
- Actualización en tiempo real del texto ingresado
- Ejemplo de `TextInputLayout` y `TextInputEditText`

### 🔘 Botones
- **Botón Relleno**: Botón principal con fondo sólido
- **Botón con Contorno**: Botón secundario con borde
- **Botón de Texto**: Botón terciario solo texto
- **FAB Extendido**: Floating Action Button con texto e ícono
- Feedback visual al presionar cada botón

### ☑️ Controles de Selección
- **CheckBox**: Selección múltiple
- **RadioButton**: Selección única entre opciones
- **Switch**: Activar/desactivar funcionalidad
- Estado de selección mostrado dinámicamente

### 📋 Lista
- `RecyclerView` con adaptador personalizado
- Cards con Material Design
- Lista de elementos con íconos
- Layout optimizado para rendimiento

### ℹ️ Información
- `TextView` informativo
- `ProgressBar` horizontal
- Ejemplo de componentes de visualización de datos

## 🛠️ Tecnologías Utilizadas

- **Kotlin**: Lenguaje de programación principal
- **Android SDK**: API level 24-36
- **Material Design 3**: Sistema de diseño moderno
- **Navigation Component**: Navegación entre fragmentos
- **ViewBinding**: Acceso seguro a las vistas
- **RecyclerView**: Listas eficientes

## 📱 Capturas de Pantalla

> **Instrucciones para capturas**: Crea una carpeta llamada `screenshots` en la raíz del proyecto y agrega las siguientes imágenes:

### Navegación Principal
![Imagen de WhatsApp 2025-09-08 a las 00 57 56_b07cd922](https://github.com/user-attachments/assets/1fa6b30b-2f38-47f2-9dd9-79537a96e9b5)

### Text Fields
![Text Fields Fragment](screenshots/text_fields.png)

### Botones
![Imagen de WhatsApp 2025-09-08 a las 00 57 57_9a3645d9](https://github.com/user-attachments/assets/5fee698f-7a76-49e4-8c3d-5434e46fa7cc)


### Controles de Selección
![Imagen de WhatsApp 2025-09-08 a las 00 57 57_3fc30e34](https://github.com/user-attachments/assets/dc77c95d-5613-414f-985f-7a57df17821b)


### Lista
![Imagen de WhatsApp 2025-09-08 a las 00 57 57_f9137a91](https://github.com/user-attachments/assets/a2726e63-13b5-4909-a338-fe5d86966a23)


### Información
![Imagen de WhatsApp 2025-09-08 a las 00 57 57_44d004ee](https://github.com/user-attachments/assets/38f79675-0121-40e5-8d36-18c68642746a)


## 🚀 Instalación y Uso

### Requisitos
- Android Studio Hedgehog | 2023.1.1 o superior
- Android SDK 24+
- Dispositivo Android o emulador con API 24+

### Pasos para ejecutar

1. **Clonar el repositorio**
   ```bash
   git clone https://github.com/TU_USUARIO/Tarea1Fragments.git
   cd Tarea1Fragments
   ```

2. **Abrir en Android Studio**
   - Abre Android Studio
   - Selecciona "Open an existing project"
   - Navega hasta la carpeta del proyecto

3. **Sincronizar dependencias**
   - Android Studio sincronizará automáticamente las dependencias Gradle
   - Espera a que termine el proceso

4. **Ejecutar la aplicación**
   - Conecta tu dispositivo Android o inicia un emulador
   - Presiona el botón "Run" (▶️) o usa `Shift + F10`

### Usando depuración inalámbrica (WiFi)
1. Activa "Opciones de desarrollador" en tu dispositivo
2. Habilita "Depuración inalámbrica"
3. En Android Studio: Device Manager → "Pair Devices Using Wi-Fi"
4. Escanea el código QR mostrado en tu dispositivo

## 🎯 Cómo usar la aplicación

1. **Navegación**: Usa la barra inferior para navegar entre fragmentos
2. **Text Fields**: Escribe texto y observa la actualización en tiempo real
3. **Botones**: Presiona diferentes botones para ver los mensajes de feedback
4. **Selección**: Interactúa con checkboxes, radios y switches
5. **Lista**: Observa la implementación de RecyclerView con cards
6. **Info**: Revisa los componentes informativos y la barra de progreso

## 📝 Notas de Desarrollo

- **Versión mínima**: Android 7.0 (API 24)
- **Versión objetivo**: Android 14 (API 36)
- **Compilación**: Java 11
- **Gradle**: 8.11.1

---
