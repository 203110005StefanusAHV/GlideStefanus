package com.stefanus.glidestefanus

import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide

class SecondActivity : AppCompatActivity() {

    //URL atau link gambar yang akan dipanggil
    val gifUrl = "https://media.giphy.com/media/IIv3NuURRxgJO/giphy.gif"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val imageGif = findViewById<ImageView>(R.id.image_gif)

        //Glide.with untuk memulai menggunakan Glide membutuhkan lifecycle, sehingga perlu memasukkan
        //parameter berupa activity/fragmen
        //.load untuk memuat gambar yang akan di tampilkan
        //.into untuk komponen tujuan untuk menampilkan gambar, berupa imageOne
        //.placeholder digunakan untuk menampilkan gambar pengganti ketika gambar utama belum selesai
        //di load
        Glide.with(this)
        Glide.with(this)
                .load(gifUrl)
                .placeholder(R.drawable.img_placeholder)
                .error(R.drawable.img_placeholder)
                .into(imageGif)

    }
}

