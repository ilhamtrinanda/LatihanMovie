package ilham.mi2a.detailmovie.adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import ilham.mi2a.detailmovie.DetailMovieActivity
import ilham.mi2a.detailmovie.MainActivity
import ilham.mi2a.detailmovie.R
import ilham.mi2a.detailmovie.model.MovieModel

class MovieAdapter (
    val itemList: ArrayList<MovieModel>,
    val getActivity:MainActivity
)   : RecyclerView.Adapter<MovieAdapter.MyViewHolder>() {

    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var itemImage: ImageView = itemView.findViewById(R.id.gambar)
        var itemJudul: TextView = itemView.findViewById(R.id.Judul)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val nView = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_list_movie, parent, false)
        return MyViewHolder(nView)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.itemImage.setImageResource(itemList[position].image)
        holder.itemJudul.text = itemList[position].judul
        holder.itemView.setOnClickListener {
            val intent = Intent(getActivity, DetailMovieActivity::class.java)
            intent.putExtra("image", itemList[position].image)
            intent.putExtra("judul", itemList[position].judul)
            intent.putExtra("sinopsis", itemList[position].sinopsis)
            getActivity.startActivity(intent)
        }
    }

    override fun getItemCount(): Int {
        return itemList.size
    }

}