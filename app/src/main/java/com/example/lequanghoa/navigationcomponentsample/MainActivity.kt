package com.example.lequanghoa.navigationcomponentsample

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val toolbar = findViewById<Toolbar>(R.id.toolbar)
        setSupportActionBar(toolbar)

        val host:NavHostFragment = supportFragmentManager.findFragmentById(R.id.my_nav_host_fragment) as NavHostFragment ?: return

        // set up Action Bar
        val navController = host.navController.also {
            NavigationUI.setupActionBarWithNavController(this, it)
        }
    }

  /*  private fun setupActionBar(navController: NavController){
        NavigationUI.setupActionBarWithNavController(this, navController)
    }
*/

    override fun onSupportNavigateUp(): Boolean {
        return Navigation.findNavController(this, R.id.my_nav_host_fragment).navigateUp()
    }
}
