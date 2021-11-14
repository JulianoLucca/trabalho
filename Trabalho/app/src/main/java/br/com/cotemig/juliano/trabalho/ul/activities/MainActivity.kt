package br.com.cotemig.juliano.trabalho.ul.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import br.com.cotemig.juliano.trabalho.R
import br.com.cotemig.juliano.trabalho.models.Account

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var account = intent.getSerializableExtra("account") as Account

        var welcome = findViewById<TextView>(R.id.welcome)
        welcome.text = resources.getString(R.string.main_welcomemessage, account.name)

    }
}