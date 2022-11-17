package com.stefanus.glidestefanus

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.engine.DiskCacheStrategy

class MainActivity : AppCompatActivity() {

    //URL atau link gambar yang akan dipanggil
    private val imageUrl = "https://cdn.pixabay.com/photo/2018/05/03/21/49/android-3372580_960_720.png"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val imageOne = findViewById<ImageView>(R.id.image_one)
        val imageTwo = findViewById<ImageView>(R.id.image_two)
        val imageThree = findViewById<ImageView>(R.id.image_three)

        //Glide.with untuk memulai menggunakan Glide membutuhkan lifecycle, sehingga perlu memasukkan
        //parameter berupa activity/fragmen
        //.load untuk memuat gambar yang akan di tampilkan
        //.into untuk komponen tujuan untuk menampilkan gambar, berupa imageOne
        //.placeholder digunakan untuk menampilkan gambar pengganti ketika gambar utama belum selesai
        //di load
        //.circleCrop untuk memotong gambar
        Glide.with(this)
            .load(imageUrl)
            .into(imageOne)

        Glide.with(this)
            .load(imageUrl)
            .fitCenter()
            .circleCrop()
            .diskCacheStrategy(DiskCacheStrategy.ALL)
            .placeholder(R.drawable.img_placeholder)
            .into(imageTwo)

        //.override untuk
        Glide.with(this)
            .load(imageUrl)
            .override(300,400)
            .centerCrop()
            .error(R.drawable.img_placeholder)
            .into(imageThree)
    }
}