
package vcmsa.projects.prog7311

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var strnum1: EditText
    private lateinit var strnum2: EditText
    private lateinit var output: EditText
    private lateinit var button: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        strnum1 = findViewById(R.id.strNum1)
        strnum2 = findViewById(R.id.strNum2)
        output = findViewById(R.id.output)
        button = findViewById(R.id.button)


        button.setOnClickListener {

            performAddition()
        }
    }


    fun performAddition() {

        val num1Str = strnum1.text.toString()
        val num2Str = strnum2.text.toString()


        val num1 = num1Str.toIntOrNull() ?: 0
        val num2 = num2Str.toIntOrNull() ?: 0


        val result = num1 + num2


        output.setText(result.toString())
    }
}
