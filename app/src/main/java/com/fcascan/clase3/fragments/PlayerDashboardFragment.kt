package com.fcascan.clase3.fragments

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.core.os.bundleOf
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.fcascan.clase3.R
import com.fcascan.clase3.adapters.PlayerAdapter
import com.fcascan.clase3.entities.PlayerRepository
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar

class PlayerDashboardFragment : Fragment() {
    private var paramUserMail: String? = null   //Input Parameter

    lateinit var v : View
    lateinit var txtUserLoggedIn : TextView
    lateinit var btnBack : FloatingActionButton
    lateinit var playerAdapter: PlayerAdapter
    lateinit var recPlayer: RecyclerView

    var playersRepository: PlayerRepository = PlayerRepository()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        paramUserMail = arguments?.getString("paramUserMail")
        Log.d("PlayerDashboardFragment", "UserMail: $paramUserMail")
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        v = inflater.inflate(R.layout.player_dashboard_fragment, container, false)
        txtUserLoggedIn = v.findViewById(R.id.txtUserLoggedIn)
        btnBack = v.findViewById(R.id.btnBack)
        recPlayer = v.findViewById(R.id.recPlayer)
        return v
    }

    override fun onStart() {
        super.onStart()
        playerAdapter = PlayerAdapter(playersRepository.players.subList(1, playersRepository.players.size)){
            index -> onItemClicked(index+1)
        }
        recPlayer.setHasFixedSize(true)
        recPlayer.layoutManager = LinearLayoutManager(context)
        recPlayer.adapter = playerAdapter

        txtUserLoggedIn.text = paramUserMail

        btnBack.setOnClickListener {
            findNavController().navigate(PlayerDashboardFragmentDirections.actionPlayerDashboardFragmentToLoginFragment())
        }
    }

    private fun onItemClicked(index: Int) {
        val player = playersRepository.players[index]
        Snackbar.make(v, "Click en ${player.name}", Snackbar.LENGTH_LONG).show()
        findNavController().navigate(PlayerDashboardFragmentDirections.actionPlayerDashboardFragmentToPlayerDetailFragment().actionId, bundleOf("playerID" to player.id))
    }
}