package com.bignerdranch.android.skythompsonanimalsounds

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Initialize RecyclerView
        val recyclerView: RecyclerView = findViewById(R.id.soundboard_recycler_view)
        recyclerView.layoutManager = GridLayoutManager(this, 3) // 3 columns

        // Create dummy sound button data
        val soundButtons = listOf(
            SoundButton(1, "Tiger", R.raw.tiger_sound, R.drawable.tiger_image),
            SoundButton(2, "Elephant", R.raw.elephant_sound, R.drawable.elephant_image),
            SoundButton(3, "Owl", R.raw.owl_sound, R.drawable.owl_image),
            SoundButton(4, "Parrot", R.raw.parrot_sound, R.drawable.parrot_image),
            SoundButton(5, "Hyena", R.raw.hyena_sound, R.drawable.hyena_image),
            SoundButton(6, "Monkey", R.raw.monkey_sound, R.drawable.monkey_image),
            SoundButton(7, "Lion", R.raw.lion_sound, R.drawable.lion_image),
            SoundButton(8, "Gator", R.raw.gator_sound, R.drawable.gator_image),
            SoundButton(9, "Wolf", R.raw.wolf_sound, R.drawable.wolf_image),
            SoundButton(10, "Gorilla", R.raw.gorilla_sound, R.drawable.gorilla_image),
            SoundButton(11, "Frog", R.raw.frog_sound, R.drawable.frog_image),
            SoundButton(12, "Bear", R.raw.bear_sound, R.drawable.bear_image),
            SoundButton(13, "T-rex", R.raw.trex_sound, R.drawable.trex_image),
            SoundButton(14, "Cat", R.raw.cat_sound, R.drawable.cat_image),
            SoundButton(15, "Capybara", R.raw.capy_sound, R.drawable.capy_image)
        )

        // Attach adapter to RecyclerView
        val adapter = SoundboardAdapter(this, soundButtons)
        recyclerView.adapter = adapter
    }
}