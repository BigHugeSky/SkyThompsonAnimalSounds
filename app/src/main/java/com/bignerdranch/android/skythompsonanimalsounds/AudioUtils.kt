package com.bignerdranch.android.skythompsonanimalsounds

import android.content.Context
import android.media.MediaPlayer

object AudioUtils {
    private var mediaPlayer: MediaPlayer? = null

    fun playSound(context: Context, soundResId: Int) {
        mediaPlayer?.release() // Release any previously playing sound
        mediaPlayer = MediaPlayer.create(context, soundResId)
        mediaPlayer?.start()
    }

    fun stopSound() {
        mediaPlayer?.stop()
        mediaPlayer?.release()
        mediaPlayer = null
    }
}
