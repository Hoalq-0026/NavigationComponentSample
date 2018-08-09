package com.example.lequanghoa.navigationcomponentsample

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.fragment.NavHostFragment

/**
 * Shows the main title screen.
 */
class TitleScreen : Fragment() {


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val rootView = inflater.inflate(R.layout.fragment_title_screen, container, false)

        return rootView
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        view.findViewById<Button>(R.id.play_btn).setOnClickListener {

            NavHostFragment.findNavController(this).navigate(R.id.action_titleScreen_to_register)

        }

        view.findViewById<Button>(R.id.leaderboard_btn).setOnClickListener {
            NavHostFragment.findNavController(this).navigate(R.id.action_titleScreen_to_leaderboard)
        }
    }

}