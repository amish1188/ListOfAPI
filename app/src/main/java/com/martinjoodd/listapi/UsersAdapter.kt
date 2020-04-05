package com.martinjoodd.listapi

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.user_row.view.*

class UsersAdapter(private val users: MutableList<User>) : RecyclerView.Adapter<UsersAdapter.ViewHolder>() {

     override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
         val view = LayoutInflater.from(parent.context).inflate(R.layout.user_row, parent, false)
         return ViewHolder(view)
     }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.firstName.text = users[position].firstName
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val firstName : TextView = itemView.firstName
    }

}
