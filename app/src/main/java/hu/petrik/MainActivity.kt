package hu.petrik

import android.graphics.Color
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

    var red = 0;
    var green = 0;
    var blue = 0;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        init()
        redSeek.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener{
            override fun onProgressChanged(p0: SeekBar?, p1: Int, p2: Boolean) {
                red = redSeek.progress
                textView.setText("(" +red.toString() + "," + green.toString() + "," + blue.toString() + ")")
                layout.setBackgroundColor(Color.rgb(red, green, blue))
                if (red + green + blue > 300) textView.setTextColor(Color.BLACK)
                else textView.setTextColor(Color.WHITE)
            }

            override fun onStartTrackingTouch(p0: SeekBar?) {
            }

            override fun onStopTrackingTouch(p0: SeekBar?) {
            }

        })

        greenSeek.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener{
            override fun onProgressChanged(p0: SeekBar?, p1: Int, p2: Boolean) {
                green = greenSeek.progress
                textView.setText("(" +red.toString() + "," + green.toString() + "," + blue.toString() + ")")
                layout.setBackgroundColor(Color.rgb(red, green, blue))
                if (red + green + blue > 300) textView.setTextColor(Color.BLACK)
                else textView.setTextColor(Color.WHITE)
            }

            override fun onStartTrackingTouch(p0: SeekBar?) {
            }

            override fun onStopTrackingTouch(p0: SeekBar?) {
            }

        })

        blueSeek.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener{
            override fun onProgressChanged(p0: SeekBar?, p1: Int, p2: Boolean) {
                blue = blueSeek.progress
                textView.setText("(" +red.toString() + "," + green.toString() + "," + blue.toString() + ")")
                layout.setBackgroundColor(Color.rgb(red, green, blue))
                if (red + green + blue > 300) textView.setTextColor(Color.BLACK)
                else textView.setTextColor(Color.WHITE)
            }

            override fun onStartTrackingTouch(p0: SeekBar?) {
            }

            override fun onStopTrackingTouch(p0: SeekBar?) {
            }

        })
    }




    fun init() {
        redSeek = findViewById(R.id.seek_red)
        greenSeek = findViewById(R.id.seek_green)
        blueSeek = findViewById(R.id.seek_blue)
        textView = findViewById(R.id.text_view)
        layout = findViewById(R.id.color_layout)
    }
}