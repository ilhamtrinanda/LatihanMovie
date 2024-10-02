package ilham.mi2a.detailmovie.model

import android.content.Context
import ilham.mi2a.detailmovie.R

class MovieModel (
    val image : Int,
    val judul : String,
    val sinopsis : String
)

//kita mock data untuk array
object Mocklist {
    fun getModel(context: Context): List<MovieModel> {
        val itemModel1 = MovieModel(
            R.drawable.spiderman,
            "Spiderman",
            "Spiderman No Way Home menceritakan kembali seorang Peter Parker. Saat itu ia di fitnah oleh Mysterio musuh spiderman di film sebelumnya yaitu Spider-Man Far From Home. Mysterio mengungkap idientitas di balik kostum Spiderman dan memfitnahnya bahwa Peter adalah pembunuh dan Villain."
        )
        val itemModel2 = MovieModel(
            R.drawable.avatar,
            "Avatar",
            "Seorang Marinir lumpuh dikirim ke bulan Pandora untuk menjalani misi khusus namun, ia justru dilema antara mengikuti perintah atau melindungi dunia baru yang iya rasakan seperti rumah."
        )
        val itemModel3 = MovieModel(
            R.drawable.hulk,
            "Hulk",
            "Doktor Bruce Banner tak sengaja terpapar radiasi gamma dan memiliki efek samping sangat unik. Setiap amarahnya memuncak, Bruce berubah menjadi sesosok monster hijau rakasa yang siap mengamuk."
        )
        val itemModel4 = MovieModel(
            R.drawable.inception,
            "Inception",
            "Cobb, mata-mata ahli, mencuri informasi dari targetnya dengan masuk ke dalam mimpi mereka. Ia diburu atas pembunuhan istrinya, dan satu-satunya cara untuk menebus semua ini, adalah degan Inception."
        )
        val itemModel5 = MovieModel(
            R.drawable.jumanji,
            "Jumanji",
            "Dalam sebuah petualangan Jumanji yang baru, empat anak sekolah menengah menemukan sebuah konsol video game tua dan ditarik ke dalam setting hutan permainan, yang secara harfiah menjadi avatar dewasa yang mereka pilih. Apa yang mereka temukan adalah bahwa Anda tidak hanya bermain Jumanji - Anda harus bisa bertahan. Untuk mengalahkan permainan dan kembali ke dunia nyata, mereka harus menjalani petualangan paling berbahaya dalam hidup mereka, menemukan apa yang Alan Parrish tinggalkan 20 tahun yang lalu, dan mengubah cara mereka memikirkan diri mereka sendiri - atau mereka akan terjebak. dalam permainan selamanya, untuk dimainkan oleh orang lain tanpa henti."
        )
        val itemModel6 = MovieModel(
            R.drawable.jurassic_world,
            "Jurassic Word",
            "Taman safari yang berisi dinosaurus rekayasa genetik jadi gempar ketika salah satu dinosaurus lepas dari kandang. Seorang ahli hewan sekaligus mantan militer pun berusaha menyelamatkan semua orang."
        )
        val itemModel7 = MovieModel(
            R.drawable.lucy,
            "Lucy",
            "Sejenis zat eksperimen canggih tak sengaja justru membuat kekuatan dan kemampuan otak Lucy tiba-tiba meningkat drastis. Kini, ia siap untuk memburu para pengedarnya satu persatu."
        )
        val itemModel8 = MovieModel(
            R.drawable.venom,
            "Venom",
            "Seorang jurnalis, Eddie Brock (Tom Hardy) ingin melakukan sebuah investasi kasus terhadap penemuan yang dipimpin oleh Dr. Carlton Drake (Riz Ahmed). Karena investigasinya, Eddie mengunjungi lab milik Dr. Calrlton Drake. Semuanya ditujukan untuk membuktikan bahwa Dr. Carlton Drake sedang sedang melakukan tindakan jahat menggunakan Symbiote."
        )
        val itemList: ArrayList<MovieModel> = ArrayList()
        itemList.add(itemModel1)
        itemList.add(itemModel2)
        itemList.add(itemModel3)
        itemList.add(itemModel4)
        itemList.add(itemModel5)
        itemList.add(itemModel6)
        itemList.add(itemModel7)
        itemList.add(itemModel8)
        return itemList
    }
}


