package com.example.session6

import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.VideoView
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.view.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val video : VideoView = findViewById(R.id.videoView)

        video.setVideoURI(Uri.parse("http://cinema.areas.su/up/video/trailer.mp4"))
        video.requestFocus()
        video.stopPlayback()

    }

    fun clickToVid(view: View) {
        imageView8.visibility = View.INVISIBLE
        imageView.visibility = View.INVISIBLE
        textView.visibility = View.INVISIBLE
        imageView2.visibility = View.VISIBLE
        videoView.visibility = View.VISIBLE
        videoView.start()
    }
}