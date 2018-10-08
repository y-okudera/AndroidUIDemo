package com.personal.yuki.androiduidemo

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // xmlで設定したIDを指定して、TextViewのインスタンスを取得する
        val mTextView: TextView = findViewById(R.id.textView)
        println(mTextView.text)

        val button: Button = findViewById(R.id.button)

        // ボタンのタップイベントを登録する
        button.setOnClickListener {
            launchFirstActivity()
        }

        val imageView: ImageView = findViewById(R.id.imageView)
        imageView.setOnClickListener {
            println("画像タップ")
        }
    }

    /**
     * FirstActivityに遷移する
     */
    fun launchFirstActivity() {
        val intent = Intent(this, FirstActivity::class.java)
        startActivity(intent)
    }
}
