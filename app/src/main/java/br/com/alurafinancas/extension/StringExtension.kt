package br.com.alurafinancas.extension

fun String.limit(caracteres: Int): String {
    if (this.length > caracteres) {
        return "${this.substring(0, caracteres)}.."
    }
    return this
}