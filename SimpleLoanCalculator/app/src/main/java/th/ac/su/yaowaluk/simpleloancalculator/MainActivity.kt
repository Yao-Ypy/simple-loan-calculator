package th.ac.su.yaowaluk.simpleloancalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import th.ac.su.yaowaluk.simpleloancalculator.Utils.getJsonDataFromAsset
import th.ac.su.yaowaluk.simpleloancalculator.data.SimpleLoan

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val jsonFileString = getJsonDataFromAsset(applicationContext,"promotion.json")

        val gson = Gson()
        val listItemType = object  : TypeToken<ArrayList<SimpleLoan>>(){}.type

        var SimpleList : ArrayList<SimpleLoan> = gson.fromJson(jsonFileString,listItemType)



    }
}