package cl.svasquezm.virusnavcomponent.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import cl.svasquezm.virusnavcomponent.R
import cl.svasquezm.virusnavcomponent.data.Virus

class VirusListAdapter(private val viruses: List<Virus>, private val onClickListener: (Virus) -> Unit) : RecyclerView.Adapter<VirusViewHolder>() {
    override fun getItemCount() = viruses.size

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VirusViewHolder {
        return VirusViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.layout_virus_item, parent, false))
    }

    override fun onBindViewHolder(holder: VirusViewHolder, position: Int) {
        holder.bind(viruses[position], onClickListener)
    }
}

class VirusViewHolder(view: View) : RecyclerView.ViewHolder(view) {
    val title: TextView = view.findViewById(R.id.title)
    fun bind(virus: Virus, onClickListener: (Virus) -> Unit) {
        title.text = virus.name
        itemView.setOnClickListener {
            onClickListener(virus)
        }
    }
}