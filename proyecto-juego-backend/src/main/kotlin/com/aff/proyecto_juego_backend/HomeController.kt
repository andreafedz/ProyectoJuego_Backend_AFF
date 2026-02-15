package com.aff.proyecto_juego_backend

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HomeController {

    @GetMapping("/")
    fun home(): Map<String, String> {
        return mapOf(
            "message" to "Backend Proyecto Juego AFF funcionando correctamente",
            "endpointEjemplo" to "/api/juego/jugar?eleccion=piedra"
        )
    }
}
