import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.example.temperature.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val celsiusEditText: EditText = findViewById(R.id.celsiusEditText)
        val fahrenheitEditText: EditText = findViewById(R.id.fahrenheitEditText)
        val convertButton: Button = findViewById(R.id.convertButton)
        val resultTextView: TextView = findViewById(R.id.resultTextView)

        convertButton.setOnClickListener {
            val celsius = celsiusEditText.text.toString().toDoubleOrNull()
            val fahrenheit = fahrenheitEditText.text.toString().toDoubleOrNull()

            if (celsius != null) {
                val convertedFahrenheit = celsius * 9 / 5 + 32
                resultTextView.text = "Fahrenheit: $convertedFahrenheit"
            } else if (fahrenheit != null) {
                val convertedCelsius = (fahrenheit - 32) * 5 / 9
                resultTextView.text = "Celsius: $convertedCelsius"
            } else {
                resultTextView.text = "Invalid input"
            }
        }
    }
}
