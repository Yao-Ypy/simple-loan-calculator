package th.ac.su.yaowaluk.simpleloancalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import th.ac.su.yaowaluk.simpleloancalculator.Utils.getJsonDataFromAsset

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val jsonFileString = getJsonDataFromAsset(applicationContext,"foodlove_data.json")
    }
}