package ilham.mi2a.detailmovie.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import ilham.mi2a.detailmovie.R
import ilham.mi2a.detailmovie.model.MovieModel

class TrendingAdapter (
    val trendingList: ArrayList<MovieModel>
) : RecyclerView.Adapter<TrendingAdapter.TrendingViewHolder>() {
    class TrendingViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var trendingImage: ImageView = itemView.findViewById(R.id.trendimage)
        var trendingJudul: TextView = itemView.findViewById(R.id.trendingJudul)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TrendingViewHolder {
        val tView = LayoutInflater.from(parent.context)
            .inflate(R.layout.trending_now, parent, false)
        return TrendingViewHolder(tView)
    }

    override fun onBindViewHolder(holder: TrendingViewHolder, position: Int) {
        holder.trendingImage.setImageResource(trendingList[position].image)
        holder.trendingJudul.text = trendingList[position].judul
    }

    override fun getItemCount(): Int {
        return trendingList.size
    }
}
