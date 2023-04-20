package com.fcascan.clase3.fragments

import android.annotation.SuppressLint
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.navigation.fragment.findNavController
import com.fcascan.clase3.R
import com.fcascan.clase3.entities.Player
import com.fcascan.clase3.entities.PlayerRepository
import com.bumptech.glide.Glide

class PlayerDetailFragment : Fragment() {
    private var playerID: Int? = null   //Input Parameter

    lateinit var v : View
    lateinit var txtName : TextView
    lateinit var txtLastName : TextView
    lateinit var txtAge : TextView
    lateinit var txtPosition : TextView
    lateinit var txtTeam : TextView
    lateinit var imgAvatar : ImageView
    lateinit var btnBack : Button

    var playersRepository: PlayerRepository = PlayerRepository()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        playerID = arguments?.getInt("playerID")
        Log.d("PlayerDetailFragment", "PlayerID: $playerID")
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        v = inflater.inflate(R.layout.player_detail_fragment, container, false)
        txtName = v.findViewById(R.id.txtName)
        txtLastName = v.findViewById(R.id.txtLastName)
        txtAge = v.findViewById(R.id.txtAge)
        txtPosition = v.findViewById(R.id.txtPosition)
        txtTeam = v.findViewById(R.id.txtTeam)
        imgAvatar = v.findViewById(R.id.imgAvatar)
        btnBack = v.findViewById(R.id.btnBack)
        return v
    }

    @SuppressLint("SetTextI18n")
    override fun onStart() {
        super.onStart()

        var player : Player? = playersRepository.players.find{ it.id == playerID }
        if (player == null) {
            player = playersRepository.players.find{ it.id == -1 }
            if (player == null) {
                player = Player(0, "Name", "LastName", 0, "Position", "Team", "AvatarURL")
            }
        }
        txtName.text = player.name
        txtLastName.text = player.lastName
        txtAge.text = "Age: " + player.age.toString()
        txtPosition.text = "Position: " + player.position
        txtTeam.text = "Country: " + player.team

        Glide.with(this)
            .load(player.imageUrl)
            .centerCrop()
            .circleCrop()
            .sizeMultiplier(0.25f)
            .into(imgAvatar)

        btnBack.setOnClickListener {
            findNavController().navigate(PlayerDetailFragmentDirections.actionPlayerDetailFragmentToPlayerDashboardFragment())
        }
    }


}