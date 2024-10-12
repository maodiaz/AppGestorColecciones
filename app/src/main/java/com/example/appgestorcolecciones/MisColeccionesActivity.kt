package com.example.appgestorcolecciones

import android.net.Uri
import android.os.Bundle
import android.widget.MediaController
import android.widget.VideoView
import androidx.appcompat.app.AppCompatActivity

class MisColeccionesActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mis_colecciones)

        val videoView: VideoView = findViewById(R.id.video_view)
        val mediaController = MediaController(this)
        mediaController.setAnchorView(videoView)
        val videoUri: Uri = Uri.parse("android.resource://" + packageName + "/" + R.raw.sample_video)
        videoView.setMediaController(mediaController)
        videoView.setVideoURI(videoUri)
        videoView.requestFocus()
        videoView.start()
    }
}