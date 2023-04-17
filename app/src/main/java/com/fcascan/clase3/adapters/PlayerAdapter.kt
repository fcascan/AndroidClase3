package com.fcascan.clase3.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.fcascan.clase3.R
import com.fcascan.clase3.entities.Player

class PlayerAdapter(
    var playerList : MutableList <Player>,
    var onClick: (Int) -> Unit
) : RecyclerView.Adapter<PlayerAdapter.PlayerHolder>() {
    class PlayerHolder (v: View) : RecyclerView.ViewHolder(v) {
        // PlayerHolder: Es un objeto que se comunica con la vista.
        // Es la modelizacion del Player adaptada a la vista del Dashboard.
        private var view: View
        init {
            this.view = v
        }

        fun setName(name: String) {
            val txtName: TextView = view.findViewById(R.id.txtName)
            txtName.text = name
        }

        fun setLastName(lastName: String) {
            val txtLastName: TextView = view.findViewById(R.id.txtLastName)
            txtLastName.text = lastName
        }

        fun setTeam(team: String) {
            val txtTeam: TextView = view.findViewById(R.id.txtTeam)
            txtTeam.text = team
        }

        fun getCard(): CardView {
            return view.findViewById(R.id.cardPlayer)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PlayerHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_player, parent, false)
        return (PlayerHolder(view))
    }

    override fun getItemCount(): Int {
        return playerList.size
    }

    override fun onBindViewHolder(holder: PlayerHolder, index: Int) {
        holder.setName(playerList[index].name)
        holder.setLastName(playerList[index].lastName)
        holder.setTeam(playerList[index].team)
        holder.getCard().setOnClickListener {
            onClick(index)
        }
    }
}