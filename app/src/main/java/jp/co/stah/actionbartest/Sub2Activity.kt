package jp.co.stah.actionbartest

import android.os.Bundle
import android.support.v7.app.AppCompatActivity

class Sub2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sub2)

        title = "sub2"
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

    }
}
