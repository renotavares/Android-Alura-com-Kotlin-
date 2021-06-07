package br.com.alurafinancas.extension

import java.math.BigDecimal
import java.text.DecimalFormat
import java.util.Locale

fun BigDecimal.formatBR(): String {
    return DecimalFormat
            .getCurrencyInstance(Locale("br", "br"))
            .format(this)
            .replace("R$", "R$ ")
}