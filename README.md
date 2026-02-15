# ProyectoJuego Backend AFF

Backend desarrollado con **Spring Boot + Kotlin** para el juego de Piedra, Papel o Tijera.

Este servicio está desplegado en la nube usando **Render** y es accesible públicamente.

---

##  URL Pública del Backend

https://proyectojuego-backend-aff.onrender.com/

---

## Endpoint Principal

### Jugar Piedra, Papel o Tijera

**Endpoint:**

GET /api/juego/jugar


**Parámetro requerido:**

- `eleccion` → piedra | papel | tijera

---

###  Ejemplo desde navegador

https://proyectojuego-backend-aff.onrender.com/api/juego/jugar?eleccion=piedra

### Ejemplo de respuesta

```json
{
  "eleccionUsuario": "piedra",
  "eleccionCpu": "tijera",
  "resultado": "Ganaste"
}

