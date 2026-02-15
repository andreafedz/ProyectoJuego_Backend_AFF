package com.aff.proyecto_juego_backend

import org.springframework.stereotype.Service
import kotlin.random.Random

@Service
class GameService {

    fun jugar(eleccion: String): ResultadoJuego {
        val opciones = listOf("piedra", "papel", "tijera")
        val cpu = opciones.random()

        val resultado = when {
            eleccion == cpu -> "Empate"
            eleccion == "piedra" && cpu == "tijera" -> "Ganaste"
            eleccion == "papel" && cpu == "piedra" -> "Ganaste"
            eleccion == "tijera" && cpu == "papel" -> "Ganaste"
            else -> "Perdiste"
        }

        return ResultadoJuego(
            eleccionUsuario = eleccion,
            eleccionCpu = cpu,
            resultado = resultado
        )
    }
}
