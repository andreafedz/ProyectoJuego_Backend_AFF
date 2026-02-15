package com.aff.proyecto_juego_backend

import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/juego")
class GameController(private val gameService: GameService) {

    @GetMapping("/jugar")
    open fun jugar(@RequestParam eleccion: String): ResultadoJuego {

        return gameService.jugar(eleccion)
    }
}
