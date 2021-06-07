package br.com.alurafinancas.ui.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import br.com.alurafinancas.R
import br.com.alurafinancas.model.Tipo
import br.com.alurafinancas.model.Transacao
import br.com.alurafinancas.ui.adapter.ListaTransacoesAdapter
import kotlinx.android.synthetic.main.activity_lista_transacoes.*
import java.math.BigDecimal

class ListaTransacoesActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lista_transacoes)

        val transacoes = listOf(
                Transacao(valor = BigDecimal(20.5), categoria = "Comida", tipo = Tipo.DESPESA),
                Transacao(valor = BigDecimal(100.0), categoria = "Economia", tipo = Tipo.RECEITA)
        )

        lista_transacoes_listview.adapter = ListaTransacoesAdapter(transacoes, this)
    }

}