package udb.sv.tallerpractico01

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.WindowManager
import android.widget.ImageView
import com.bumptech.glide.Glide

class MainActivity2 : AppCompatActivity() {

    val DURACION: Long= 150000;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        supportActionBar?.hide()
        this.window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN)

//        val logo = findViewById<ImageView>(R.id.logo)

  //      Glide.with(this).load(R.drawable.universidad_udb).into(logo)

        cambiarActivity()
    }

    private fun cambiarActivity(){
        Handler().postDelayed(Runnable {
            val intent = Intent (this, MainActivity::class.java)
            startActivity(intent)
        }, DURACION)
    }
}