package ilham.mi2a.detailmovie

import android.content.Intent
import android.media.Image
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class DetailMovieActivity : AppCompatActivity() {

    private lateinit var image: ImageView
    private lateinit var sinopsis: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_detail_movie)

        image=findViewById(R.id.imageDetailMovie)
        sinopsis=findViewById(R.id.txtSinopsis)

        val detailImage = intent.getIntExtra("image", 0)
        val detailSinopsis = intent.getStringExtra("sinopsis")

        image.setImageResource(detailImage)
        sinopsis.setText(detailSinopsis)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}