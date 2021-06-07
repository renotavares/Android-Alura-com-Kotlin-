package br.com.alurafinancas.ui.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import androidx.core.content.ContextCompat
import br.com.alurafinancas.R
import br.com.alurafinancas.extension.formatBR
import br.com.alurafinancas.extension.limit
import br.com.alurafinancas.model.Tipo
import br.com.alurafinancas.model.Transacao
import kotlinx.android.synthetic.main.transacao_item.view.*

class ListaTransacoesAdapter(private val transacoes: List<Transacao>,
                             private val context: Context) : BaseAdapter() {

    override fun getCount(): Int {
        return transacoes.size
    }

    override fun getItem(position: Int): Transacao {
        return transacoes[position]
    }

    override fun getItemId(position: Int): Long {
        return 0
    }

    override fun getView(position: Int, view: View?, parent: ViewGroup?): View {
        val viewCriada = LayoutInflater.from(context).inflate(R.layout.transacao_item, parent, false)

        val transacao = getItem(position)

        if (transacao.tipo == Tipo.RECEITA){
            viewCriada.transacao_valor
                    .setTextColor(ContextCompat.getColor(context, R.color.receita))
            viewCriada.transacao_icone
                    .setBackgroundResource(R.drawable.icone_transacao_item_receita)
        }else{
            viewCriada.transacao_valor
                    .setTextColor(ContextCompat.getColor(context, R.color.despesa))
            viewCriada.transacao_icone
                    .setBackgroundResource(R.drawable.icone_transacao_item_despesa)
        }

        viewCriada.transacao_valor.text = transacao.valor.formatBR()
        viewCriada.transacao_categoria.text = transacao.categoria.limit(14)
        viewCriada.transacao_data.text = transacao.data.formatBR()

        return viewCriada
    }


}