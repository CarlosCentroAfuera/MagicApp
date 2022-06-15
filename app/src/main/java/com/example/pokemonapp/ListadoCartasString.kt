package com.example.pokemonapp

// To parse the JSON, install kotlin's serialization plugin and do:
//
// val json = Json(JsonConfiguration.Stable)
// val type = json.parse(Type.serializer(), jsonString)
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
@SerialName("Card")
data class ListadoCartasString (
    val cards: List<Card>
)

@Serializable
data class Card (
    val name: String,
    val manaCost: String,
    val cmc: Long,
    val type: String,
    val subtypes: List<String>? = null,
    val text: String,
    val artist: String,
    val number: String,
    val power: String? = null,
    val toughness: String? = null,
    val multiverseid: String? = null,

    @SerialName("imageUrl")
    val imageURL: String? = null,

    val variations: List<String>? = null,
    val foreignNames: List<ForeignNameString>? = null,
    val printings: List<String>,
    val originalText: String? = null,
    val originalType: String? = null,
    val id: String,
    val flavor: String? = null,
    val supertypes: List<String>? = null
)

@Serializable
@SerialName("ForeignName")
data class ForeignNameString (
    val name: String,
    val text: String,
    val type: String,
    val flavor: String? = null,

    @SerialName("imageUrl")
    val imageURL: String,

    val language: String,
    val multiverseid: Long
)

