package com.example.lequanghoa.navigationcomponentsample

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class Leaderboard : Fragment() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var viewAdapter: MyAdapter
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val rootView = inflater.inflate(R.layout.fragment_leaderboard, container, false)

        viewAdapter = MyAdapter(arrayOf("Flo", "Fly", "Jo"))
        recyclerView = rootView.findViewById<RecyclerView>(R.id.leaderboard_list).apply {
            setHasFixedSize(true)

            adapter = viewAdapter
            layoutManager = LinearLayoutManager(rootView.context)
        }
        return rootView
    }


}

class MyAdapter(private val myDataBase: Array<String>) : RecyclerView.Adapter<MyAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.list_view_item, parent, false)
        return ViewHolder(itemView)
    }

    override fun getItemCount(): Int = myDataBase.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.item.findViewById<TextView>(R.id.user_name_text).text = myDataBase[position]
        holder.item.findViewById<ImageView>(R.id.user_avatar_image).setImageResource(listOfAvatars[position])

        holder.item.setOnClickListener {
            val bundle = Bundle().apply {
                putString("userName", myDataBase[position])
            }

            Navigation.findNavController(holder.item).apply {

                navigate(R.id.action_leaderboard_to_userProfile, bundle)
            }
        }
    }


    // Provide a reference to the views for each data item
    // Complex data items may need more than one view per item, and
    // you provide access to all the views for a data item in a view holder.
    // Each data item is just a string in this case that is shown in a TextView
    class ViewHolder(val item: View) : RecyclerView.ViewHolder(item)
}

private val listOfAvatars = listOf(R.drawable.avatar_1_raster, R.drawable.avatar_2_raster, R.drawable.avatar_3_raster)