package udb.sv.tallerpractico01

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import udb.sv.tallerpractico01.controller.EmpleadoController

class SalarioActivity : AppCompatActivity() {
    lateinit var empleadoController: EmpleadoController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.op_salario)

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        val id = item.itemId

        if(id == R.id.login) {
            Toast.makeText(this, "Selecciono iniciar sesion", Toast.LENGTH_SHORT).show()
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)


        }
        if(id == R.id.logup){
            Toast.makeText(this,"Selecciono registrarse", Toast.LENGTH_SHORT).show()
            val intent = Intent(this, RegistrationActivity::class.java)
            startActivity(intent)
        }


        if(id == R.id.promedioOp) {
            Toast.makeText(this, "Selecciono la opcion para obtener promedios", Toast.LENGTH_SHORT).show()
            val intent = Intent(this, PromedioActivity::class.java)
            startActivity(intent)
        }
        if (id == R.id.salarioOp) {
            Toast.makeText(this, "Selecciono la opcion para obtener salario base", Toast.LENGTH_SHORT).show()
            val intent = Intent(this, SalarioActivity::class.java)
            startActivity(intent)
        }
        return super.onOptionsItemSelected(item)
    }
}