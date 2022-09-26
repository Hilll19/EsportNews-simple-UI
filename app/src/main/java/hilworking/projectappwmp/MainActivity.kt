package hilworking.projectappwmp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var nameEditText: EditText
    private lateinit var sayhelloButtonView: Button
    private lateinit var sayhelloTextView: TextView

    private fun initComponents(){
        nameEditText = findViewById(R.id.nameEditText)
        sayhelloButtonView = findViewById(R.id.sayhelloButtonView)
        sayhelloTextView = findViewById(R.id.sayhelloTextView)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.project_app_wmp)


        initComponents()

        sayhelloTextView.text = resources.getString(R.string.app_name)

        sayhelloButtonView.setOnClickListener {

            Log.d("WMP", "This is Debug Log")
            Log.i("WMP", "This is Debug Log")
            Log.w("WMP", "This is Debug Log")
            Log.e("WMP", "This is Debug Log")

            Log.i("ValueResource", resources.getInteger(R.integer.maxPage).toString())
            Log.i("ValueResource", resources.getBoolean(R.bool.isProductMode).toString())
            Log.i("ValueResource", resources.getIntArray(R.array.numbers).toString())
            Log.i("ValueResource", resources.getColor(R.color.background, theme).toString())

            sayhelloButtonView.setBackgroundColor(resources.getColor(R.color.background, theme))

            val name = nameEditText.text.toString()
            sayhelloTextView.text = resources.getString(R.string.sayhelloTextView, name)
        }
        sayhelloButtonView.setOnClickListener(this)
    }
    override fun onClick(p0: View) {
        when(p0.id){
            R.id.sayhelloButtonView -> {
                val intentBiasa = Intent(this@MainActivity, Slide2APP_WMP::class.java)
                startActivity(intentBiasa)
            }

        }
    }
}