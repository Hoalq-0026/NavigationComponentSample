package com.example.lequanghoa.navigationcomponentsample

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation

class ResultsWinner : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_result_winner, container, false)

        view.findViewById<Button>(R.id.play_btn2).setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_resultsWinner_to_match)
        }

        view.findViewById<Button>(R.id.leaderboard_btn2).setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_resultsWinner_to_leaderboard)
        }
        return view
    }
}