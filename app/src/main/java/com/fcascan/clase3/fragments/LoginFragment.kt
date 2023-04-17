package com.fcascan.clase3.fragments

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.navigation.fragment.findNavController
import com.fcascan.clase3.R
import com.fcascan.clase3.entities.UserRepository
import com.google.android.material.snackbar.Snackbar

class LoginFragment : Fragment() {
    lateinit var v: View
    lateinit var btnNext: Button
    lateinit var editTextEmail: TextView
    lateinit var editTextPass: TextView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        v = inflater.inflate(R.layout.login_fragment, container, false)
        btnNext = v.findViewById(R.id.btnNext)
        editTextEmail = v.findViewById(R.id.editTextEmail)
        editTextPass = v.findViewById(R.id.editTextPass)
        return v
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val usersRepo = UserRepository()
        var successFlag = false

        btnNext.setOnClickListener {
            Log.d("LoginFragment", "Credentials: ${editTextEmail.text}; ${editTextPass.text}")
            loop@ for(user in usersRepo.usersList){
                if (editTextEmail.text.toString().trim() == user.email && editTextPass.text.toString() == user.password){
                    displayMessage("Logged in Successfully")
                    Log.d("LoginFragment", "Credentials match with DB")
                    val bundle = Bundle()
                    bundle.putString("paramUserMail", user.email)
                    findNavController().navigate(
                        LoginFragmentDirections.actionLoginFragmentToPlayerDashboardFragment().actionId,
                        bundle
                    )
                    successFlag = true
                    break@loop
                }
            }
            if (!successFlag){
                displayMessage("Wrong Credentials")
                Log.d("LoginFragment", "Wrong Credentials!")
            }
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
    }

    fun displayMessage(message: String) {
        Snackbar.make(v, message, Snackbar.LENGTH_SHORT).show()
    }

}