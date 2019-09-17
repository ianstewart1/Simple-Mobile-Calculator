package us.istewart.aithello

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnAdd.setOnClickListener{
            var num1 = etName1.text.toString()
            var num2 = etName2.text.toString()

            var result = Integer.parseInt(num1) + Integer.parseInt(num2)
            tvData.text = "Result: %d".format(result)
        }

        btnMinus.setOnClickListener{
            var num1 = etName1.text.toString()
            var num2 = etName2.text.toString()

            var result = Integer.parseInt(num1) - Integer.parseInt(num2)
            tvData.text = "Result: %d".format(result)
        }
    }
}
