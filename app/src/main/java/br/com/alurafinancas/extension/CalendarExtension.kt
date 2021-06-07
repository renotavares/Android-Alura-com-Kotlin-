package br.com.alurafinancas.extension

import java.text.SimpleDateFormat
import java.util.Calendar

fun Calendar.formatBR(): String {
    return SimpleDateFormat("dd/MM/yyyy").format(this.time)
}