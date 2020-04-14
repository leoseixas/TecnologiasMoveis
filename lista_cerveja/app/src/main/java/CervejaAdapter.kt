import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.recyclerview.widget.RecyclerView
import com.example.lista_cerveja.R
import kotlinx.android.synthetic.main.linha_de_cerveja.view.*

class CervejaAdapter (private val cervejas: List<Cerveja>): RecyclerView.Adapter<CervejaAdapter.VH> () {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VH {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.linha_de_cerveja,parent,false)
        val vh = VH(v)
        return  vh
    }

    override fun getItemCount(): Int {
        return cervejas.size
    }

    override fun onBindViewHolder(holder: CervejaAdapter.VH, position: Int) {
        val cerveja = cervejas[position]
        holder.txtNome.text = cerveja.nome
        holder.txtVolume.text = cerveja.volume.toString()
        holder.txtValor.text = cerveja.valor.toString()

    }

    class VH (itemView: View): RecyclerView.ViewHolder(itemView){
        var txtNome: TextView = itemView.txtNome
        var txtVolume: TextView = itemView.txtVolume
        var txtValor: TextView = itemView.txtValor
    }
}