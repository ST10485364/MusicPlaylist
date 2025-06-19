package za.co.varsitycollege.musicplaylist

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    var SongTitle = ArrayList<String>()
    var ArtistName = ArrayList<String>()
    var Ratings = ArrayList<Int>()
    var Coments = ArrayList<String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        //Declaring the variables
        var SongTitle = findViewById<EditText>(R.id.SongTitle)
        var ArtistName = findViewById<EditText>(R.id.ArtistName)
        var Ratings = findViewById<EditText>(R.id.Ratings)
        var Coments = findViewById<EditText>(R.id.Coments)
        val AddBtn = findViewById<Button>(R.id.AddBtn)
        val NextBtn = findViewById<Button>(R.id.NextBtn)
        val ExitBtn = findViewById<Button>(R.id.ExitBtn)



        AddBtn.setOnClickListener {
            val song = SongTitle.text.toString()
            val artist = ArtistName.text.toString()
            val rating = Ratings.text.toString().toInt()
            val coment = Coments.text.toString()
        }
        SongTitle
        ArtistName
        Ratings
        Coments

        NextBtn.setOnClickListener {
            //navigates you to the second screen
        }

        ExitBtn.setOnClickListener {
            finishAffinity() // Close the app
        }
    }}