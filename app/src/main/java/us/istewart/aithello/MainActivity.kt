package us.istewart.aithello

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*
import androidx.core.app.ComponentActivity
import androidx.core.app.ComponentActivity.ExtraData
import androidx.core.content.ContextCompat.getSystemService
import android.icu.lang.UCharacter.GraphemeClusterBreak.T
import android.util.Log
import android.view.inputmethod.InputMethodManager


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        etName1.hint = getString(R.string.firstOp)
        etName2.hint = getString(R.string.secondOp)

        fun onButtonPress() :Pair<Double, Double> {
            try {
                val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
                imm.hideSoftInputFromWindow(currentFocus!!.windowToken, 0)
            } catch (e: Exception) {
                Log.d("INPUT_ERR", "Keyboard already hidden")
            }

            var num1 = etName1.text.toString().toDouble()
            var num2 = etName2.text.toString().toDouble()
            etName1.text.clear()
            etName2.text.clear()

            return Pair(num1, num2)
        }

        btnAdd.setOnClickListener{

            var (num1, num2) = onButtonPress()

            var result = num1 + num2

            tvData.text = "%.2f + %.2f = %.2f".format(num1, num2, result)
        }

        btnMinus.setOnClickListener{
            var (num1, num2) = onButtonPress()

            var result = num1 - num2

            tvData.text = "%.2f - %.2f = %.2f".format(num1, num2, result)
        }

        btnMult.setOnClickListener{
            var (num1, num2) = onButtonPress()

            var result = num1 * num2

            tvData.text = "%.2f * %.2f = %.2f".format(num1, num2, result)
        }

        btnDiv.setOnClickListener{
            var (num1, num2) = onButtonPress()

            var result = num1 / num2

            tvData.text = "%.2f / %.2f = %.2f".format(num1, num2, result)
        }
    }
}
