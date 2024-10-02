package ilham.mi2a.detailmovie

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import ilham.mi2a.detailmovie.adapter.MovieAdapter
import ilham.mi2a.detailmovie.adapter.TrendingAdapter
import ilham.mi2a.detailmovie.model.Mocklist
import ilham.mi2a.detailmovie.model.MovieModel

class MainActivity : AppCompatActivity() {

    private lateinit var rv_listMovie : RecyclerView
    private lateinit var rv_trendingNow : RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        rv_listMovie = findViewById(R.id.rv_listMovie)
        rv_trendingNow = findViewById(R.id.rv_trendingNow)

        // Mengatur layout manager untuk masing-masing RecyclerView
        rv_listMovie.layoutManager = GridLayoutManager(this, 1, GridLayoutManager.VERTICAL, false)
        rv_trendingNow.layoutManager = GridLayoutManager(this, 1, GridLayoutManager.HORIZONTAL, false)

        // Menggunakan adapter yang berbeda untuk masing-masing RecyclerView
        val movieAdapter = MovieAdapter(Mocklist.getModel(this) as ArrayList<MovieModel>, this)
        val trendingAdapter = TrendingAdapter(Mocklist.getModel(this) as ArrayList<MovieModel>)

        rv_listMovie.adapter = movieAdapter
        rv_trendingNow.adapter = trendingAdapter

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}