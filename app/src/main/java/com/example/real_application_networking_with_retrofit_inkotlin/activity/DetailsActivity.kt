package com.example.real_application_networking_with_retrofit_inkotlin.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.bumptech.glide.Glide
import com.example.real_application_networking_with_retrofit_inkotlin.R

class DetailsActivity : AppCompatActivity() {

    lateinit var sh_img : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details)
        initViews()
    }

    private fun initViews() {
        sh_img = findViewById(R.id.sh_img)
        var intent = intent.getStringExtra("image_name")
        Glide.with(this).load(intent).into(sh_img)
    }
}