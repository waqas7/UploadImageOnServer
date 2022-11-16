package net.genericapps.imageuploader

data class UploadResponse(

    val error: Boolean,
    val message: String,
    val image: String
)
