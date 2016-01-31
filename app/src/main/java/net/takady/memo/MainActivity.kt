package net.takady.memo

import android.graphics.Color
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        myButton.text = "Clear!"
        myButton.setOnClickListener {
            editText.setText("")
        }

        editText.setText("Write some text here.")
        editText.setTextColor(Color.parseColor("gray"))
        editText.setOnClickListener {
            editText.setText("")
            editText.setTextColor(Color.parseColor("black"))
        }
    }
}
