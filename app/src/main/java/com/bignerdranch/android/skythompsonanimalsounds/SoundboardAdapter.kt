package com.bignerdranch.android.skythompsonanimalsounds

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class SoundboardAdapter(
    private val context: Context,
    private val soundButtons: List<SoundButton>
) : RecyclerView.Adapter<SoundboardAdapter.ViewHolder>() {

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val imageView: ImageView = view.findViewById(R.id.sound_button_image)
        //val label: TextView = view.findViewById(R.id.sound_button_label)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.sound_button_item, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val soundButton = soundButtons[position]
        //holder.label.text = soundButton.label
        holder.imageView.setImageResource(soundButton.imageResId) // Set unique image

        holder.itemView.setOnClickListener {
            AudioUtils.playSound(context, soundButton.soundResId)
        }
    }

    override fun getItemCount(): Int = soundButtons.size
}
