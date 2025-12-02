# 🪐 Proyecto de Integración SOAP con Spring Boot & Spring Integration

Este proyecto es un ejemplo funcional que demuestra cómo **exponer un servicio SOAP**, consumirlo internamente desde Spring usando **Spring Integration**, y finalmente mostrar los datos procesados con **Thymeleaf** en una interfaz web amigable.

El sistema permite consultar información detallada sobre los planetas del sistema solar a través de SOAP y visualizarla en un frontend limpio y moderno.

---

## 🚀 Tecnologías utilizadas

### **Backend (Java / Spring)**
- Spring Boot 4
- Spring Web MVC
- Spring Web Services (SOAP)
- Spring Integration
- Spring XML / WSDL auto-generation
- JAXB
- Lombok

### **Frontend**
- Thymeleaf
- HTML + CSS

---

## 📁 Arquitectura del proyecto

<img width="659" height="458" alt="image" src="https://github.com/user-attachments/assets/3ea788b4-686b-40bc-9591-8654819f1e72" />


    
---

## 🔌 Flujo general del proyecto

1. El usuario ingresa un planeta desde el frontend:  
   **`/planet?name=marte`**

2. El controller llama al `PlanetInfoGateway`.

3. El mensaje viaja por el canal **planetRequestChannel**.

4. El `ServiceActivator` envía la solicitud al cliente SOAP.

5. El cliente SOAP usa `WebServiceTemplate` para enviar un request a:  
   **`http://localhost:8080/ws`**

6. El endpoint SOAP procesa la solicitud y devuelve un **PlanetResponse**.

7. Spring Integration retorna el resultado al controller.

8. Thymeleaf muestra una **tarjeta bonita y estilizada** con la información del planeta.

---

## 🧪 Endpoint SOAP (WSDL)

El WSDL está disponible en:

👉 **http://localhost:8080/ws/planetinfo.wsdl**

Ejemplo de request SOAP:

```xml
<PlanetRequest xmlns="http://udb.edu.sv/planetinfo">
    <name>Marte</name>
</PlanetRequest>

