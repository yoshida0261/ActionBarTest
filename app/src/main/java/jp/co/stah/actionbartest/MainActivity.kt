package jp.co.stah.actionbartest

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //supportActionBar?.setDisplayHomeAsUpEnabled(true)

        title = "main"

        findViewById<Button>(R.id.button).setOnClickListener {
            val i  = Intent(this,SubActivity::class.java)
            startActivity(i)
        }


    }
}
