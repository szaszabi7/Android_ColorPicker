package hu.petrik

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Layout
import android.widget.RelativeLayout
import android.widget.SeekBar
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var redSeek : SeekBar
    lateinit var greenSeek : SeekBar
    lateinit var blueSeek : SeekBar
    lateinit var textView: TextView
    lateinit var layout : RelativeLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        init()

    }



    fun init() {
        redSeek = findViewById(R.id.seek_red)
        greenSeek = findViewById(R.id.seek_green)
        blueSeek = findViewById(R.id.seek_blue)
        textView = findViewById(R.id.text_view)
        layout = findViewById(R.id.color_layout)
    }
}