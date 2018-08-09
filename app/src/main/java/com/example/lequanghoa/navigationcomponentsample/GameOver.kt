package com.example.lequanghoa.navigationcomponentsample

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation

class GameOver : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val rootView = inflater.inflate(R.layout.fragment_game_over, container, false)

        rootView.findViewById<View>(R.id.play_btn4).setOnClickListener {
            Navigation.findNavController(rootView).navigate(R.id.action_gameOver_to_match)
        }
        return rootView
    }
}