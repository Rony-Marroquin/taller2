package udb.sv.tallerpractico01

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class DashboardActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        val id = item.itemId

        if (id == R.id.promedioOp) {
            Toast.makeText(this, "Selecciono la opcion para obtener promedios", Toast.LENGTH_SHORT)
                .show()
            val intent = Intent(this, PromedioActivity::class.java)
            startActivity(intent)
        }
        if (id == R.id.salarioOp) {
            Toast.makeText(
                this,
                "Selecciono la opcion para obtener salario base",
                Toast.LENGTH_SHORT
            ).show()
            val intent = Intent(this, SalarioActivity::class.java)
            startActivity(intent)
        }
        return super.onOptionsItemSelected(item)
    }
    }