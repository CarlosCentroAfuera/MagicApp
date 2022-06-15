package com.example.pokemonapp

import com.google.gson.Gson
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class ObtenerListadoCartasRequest {

    companion object {

        private var gson = Gson()

        suspend fun getInString(): ListadoCartasString = withContext(Dispatchers.IO) {
            // TODO hacer la request
            return@withContext ListadoCartasString(listOf())
        }
    }
}