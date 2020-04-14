import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.ap1.R
import kotlinx.android.synthetic.main.activity_main.view.*

class CervejaViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){

    val nome: TextView = itemView!!.findViewById(R.id.txtNome)
    val ml: TextView = itemView!!.findViewById(R.id.txtMl)
    val valor: TextView = itemView!!.findViewById(R.id.txtValor)
}