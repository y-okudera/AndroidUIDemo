package com.personal.yuki.androiduidemo

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem

class FirstActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first)

        // 戻るボタンを表示
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        // タイトルを表示
        supportActionBar?.title = "FirstActivity"
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        when (item?.itemId) {

            // 戻るボタンのIDの場合、Activityを終了する
            android.R.id.home -> finish()

            else -> return super.onOptionsItemSelected(item)
        }
        return true
    }
}
