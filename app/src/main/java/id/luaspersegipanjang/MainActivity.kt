package id.luaspersegipanjang

import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast

import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.content_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

        fab.setOnClickListener { view ->
            //Toast
            Toast.makeText(this, getString(R.string.string_version), Toast.LENGTH_SHORT).show()
            //Snackbar
            Snackbar.make(view, getString(R.string.string_version), Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show()
        }

        btnHitung.setOnClickListener { view ->
            if(etPanjang.text.isEmpty()) {
                etPanjang.setError("Harap dimasukkan nilai panjang")
                return@setOnClickListener
            }

            if(etLebar.text.isEmpty()) {
                etLebar.setError("Harap dimasukkan nilai panjang")
                return@setOnClickListener
            }

            var panjang = etPanjang.text.toString().toFloat()
            var lebar = etLebar.text.toString().toFloat()

            var hasil = hitungLuas(panjang, lebar)
            tvHasil.text = hasil.toString()

        }
    }

    fun hitungLuas(panjang: Float, lebar: Float): Float {
        return panjang*lebar
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        return when (item.itemId) {
            R.id.action_settings -> true
            else -> super.onOptionsItemSelected(item)
        }
    }
}
