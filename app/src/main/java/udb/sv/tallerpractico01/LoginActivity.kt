package udb.sv.tallerpractico01

import android.content.Intent
import android.os.Bundle
import android.text.TextUtils
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.ProgressBar
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.gms.tasks.OnCompleteListener
import com.google.android.gms.tasks.Task
import com.google.firebase.auth.AuthResult
import com.google.firebase.auth.FirebaseAuth

class LoginActivity: AppCompatActivity() {

    private var emailTV: EditText? = null
    private var passwordTV: EditText? = null
    private var loginBtn: Button? = null
    private var progressBar: ProgressBar? = null
    private var mAuth: FirebaseAuth? = null

    protected override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        mAuth = FirebaseAuth.getInstance()
        initializeUI()
        loginBtn!!.setOnClickListener { loginUserAccount() }
    }

    private fun loginUserAccount() {
        progressBar?.setVisibility(View.VISIBLE)
        val email: String
        val password: String
        email = emailTV?.getText().toString()
        password = passwordTV?.getText().toString()
        if (TextUtils.isEmpty(email)) {
            Toast.makeText(applicationContext, "Please enter email...", Toast.LENGTH_LONG)
                .show()
            return
        }
        if (TextUtils.isEmpty(password)) {
            Toast.makeText(applicationContext, "Please enter password!", Toast.LENGTH_LONG)
                .show()
            return
        }
        mAuth?.signInWithEmailAndPassword(email, password)
            ?.addOnCompleteListener { task ->
                if (task.isSuccessful) {
                    Toast.makeText(
                        applicationContext,
                        "Login successful!",
                        Toast.LENGTH_LONG
                    ).show()
                    progressBar?.setVisibility(View.GONE)
                    val intent = Intent(this@LoginActivity, DashboardActivity::class.java)
                    startActivity(intent)
                } else {
                    Toast.makeText(
                        getApplicationContext(),
                        "Login failed! Please try again later",
                        Toast.LENGTH_LONG
                    ).show()
                    progressBar?.setVisibility(View.GONE)
                }
            }
    }

    private fun initializeUI() {
        emailTV = findViewById<EditText>(R.id.email)
        passwordTV = findViewById<EditText>(R.id.password)
        loginBtn = findViewById<Button>(R.id.login)
        progressBar = findViewById<ProgressBar>(R.id.progressBar)
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