package udb.sv.tallerpractico01

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.*
import com.google.firebase.database.FirebaseDatabase
import udb.sv.tallerpractico01.view.IusuarioVista


abstract class PromedioActivity : AppCompatActivity(), IusuarioVista {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.op_promedio)

        val Nota1 =findViewById<EditText>(R.id.editTextNumber)
        val Nota2= findViewById<EditText>(R.id.editTextNumber2)
        val Nota3= findViewById<EditText>(R.id.editTextNumber3)
        var Nota4= findViewById<EditText>(R.id.editTextNumber4)
        var Nota5= findViewById<EditText>(R.id.editTextNumber5)
        var Nombre= findViewById<EditText>(R.id.editTextTextPersonName2)

        var texto= findViewById<TextView>(R.id.textView2)
        var Lista = findViewById<ListView>(R.id.lista)

        var btnAgregar= findViewById<Button>(R.id.floatingActionButton6)
        var btnGuardar= findViewById<Button>(R.id.floatingActionButton8)
        var btnActualizar= findViewById<Button>(R.id.floatingActionButton7)
        var btnBorra= findViewById<Button>(R.id.floatingActionButton9)

        var notafinal: Int = 0;


        btnAgregar.setOnClickListener(View.OnClickListener {




        var notafinal =  ( Nota1.text.toString().toDouble() +Nota2.text.toString().toDouble()
                + Nota3.text.toString().toDouble()+Nota4.text.toString().toDouble() +Nota5.text.toString().toDouble()) /5

        if (notafinal>= 6 ){

            Toast.makeText(this, "a aprobado con nota de ${notafinal}", Toast.LENGTH_SHORT).show()

            var database = FirebaseDatabase.getInstance().getReference("nota final")


        }
        else{

            Toast.makeText(this, "Usted a reprobado con nota de ${notafinal}", Toast.LENGTH_SHORT).show()
            var database = FirebaseDatabase.getInstance().getReference("nota final")
        }


    })



    }

    override fun nota1(double: Double) {
        TODO("Not yet implemented")
    }

    override fun nota2(double: Double) {
        TODO("Not yet implemented")
    }

    override fun nota3(double: Double) {
        TODO("Not yet implemented")
    }

    override fun nota4(double: Double) {
        TODO("Not yet implemented")
    }

    override fun nota5(double: Double) {
        TODO("Not yet implemented")
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu, menu)
        return true
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

