package com.example.lequanghoa.navigationcomponentsample

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment

class UserProfile : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_user_profile, container, false)

        val name = arguments?.getString("userName") ?: "Le Thai Bao"
        view.findViewById<TextView>(R.id.profile_user_name).text = name
        return view
    }
}