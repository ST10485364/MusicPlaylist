package za.co.varsitycollege.musicplaylist

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class DetailedViewScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_detailed_view_screen)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val ShowBtn = findViewById<Button>(R.id.ShowBtn)
        val AverageBtn = findViewById<Button>(R.id.AverageBtn)
        val Result = findViewById<TextView>(R.id.Result)
        val ReturnBtn = findViewById<Button>(R.id.ReturnBtn)

        ShowBtn.setOnClickListener {
            val song = intent.getStringArrayListExtra("song")
            val artist = intent.getStringArrayListExtra("artist")
            val rating = intent.getStringArrayListExtra("rating")
            val coment = intent.getStringArrayListExtra("coment")

            if (song != null && artist != null && rating != null && coment != null) {
                val resultBuilder = StringBuilder()
                for (i in song.indices) {
                    resultBuilder.append("song:${song[1]}\n")
                    resultBuilder.append("artist:${artist[1]}\n")
                    resultBuilder.append("rating:${rating[1]}\n")
                    resultBuilder.append("coment:${coment[1]}\n")
                }
                Result.text = resultBuilder.toString()
            } else {
                Result.text = "data wasn't received"
            }
            AverageBtn.setOnClickListener {
                var Average = Result.text.toString().toDoubleOrNull()
            }
           
            ReturnBtn.setOnClickListener {
                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
            }
        }
    }}