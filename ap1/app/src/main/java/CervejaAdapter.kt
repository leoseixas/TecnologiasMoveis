import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.ap1.R

class CervejaAdapter(val context: Context, val item: ArrayList<Cerveja>) : RecyclerView.Adapter<CervejaViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CervejaViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.linha_de_cerveja, parent, false)
        val holder = CervejaViewHolder(view)
        return holder
    }

    override fun getItemCount(): Int {

        return item.size

    }

    override fun onBindViewHolder(holder: CervejaViewHolder, position: Int) {
        val cerveja = item.get(position)
        holder.nome.text = cerveja.nome
        holder.ml.text = cerveja.ml.toString()
        holder.valor.text = cerveja.valor.toString()

    }
}