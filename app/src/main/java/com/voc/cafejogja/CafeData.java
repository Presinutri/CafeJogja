package com.voc.cafejogja;

import java.util.ArrayList;

public class CafeData {

    private static int[] idCafe = {
            0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13
    };

    private static String[] namaCafe = {
            "Mezzanine Eatery and Coffee",
            "Filosofi Kopi",
            "Brick Cafe",
            "Secret Garden Coffee and Chocolate",
            "Roaster And Bear Cafe",
            "Lawas 613 kafe",
            "Tempo Gelato",
            "ViaVia",
            "Ekologi Desk and Coffee",
            "Saorsa Kopi",
            "Kafe 80’s Bocor Alus",
            "Blanco Coffee and Books",
            "The Captain Urban Jogja",
            "Makan Minum Jogja"
    };

    private static String[] detailCafe = {
            "Bangunan Mezzanine Eatrery and Coffee sangat menarik perhatian setiap pengendara yang lewat di depannya. Bagaimana tidak? Bangunan Mezzanine terlihat mencolok karena didominasi oleh eksterior kaca yang sangat unik. Kafe ini merupakan satu-satunya kafe berkonsep glass house yang ada di Jogja. Meskipun didominasi oleh bahan kaca, kafe ini jauh dari kata ‘panas’ karena di dalamnya tumbuh banyak pepohonan dan tanaman hijau yang menyejukkan. Kafe berlantai dua ini memiliki banyak ruang makan dengan konsep yang unik dan tentunya sangat instagenik, seperti area makan yang dibuat menyerupai sangkar burung yang bisa ditemukan di lantai dua. Dijamin kamu tidak akan kehabisan spot untuk berfoto di sini deh!",
            "Buat para pecinta kopi, pasti sudah tidak asing lagi dengan Kedai Filosofi Kopi. Setelah sukses berkibar di Jakarta, Filosofi Kopi hadir di Jogja dengan desain kafe unik yang menggabungkan budaya Jawa dan suasana moderen. Joglo eksentrik yang menjadi pusat bangunan Kedai Filosofi Kopi ini berada di tengah pedesaan yang jauh dari keramaian Kota Jogja. Suasana yang santai dan sepi inilah yang membuat ngopi di Kedai Filosofi Kopi Jogja terasa lebih nikmat. Suasana ndeso di area outdoor selalu menjadi spot favorit untuk berfoto di sini. Nggak heran kalau kedai ini juga menjadi tujuan ngopi para wisatawan dari luar kota.",
            "Lokasinya yang berada di pojok jalan tidak membuat Brick Cafe kehilangan pamor. Tampilan depan kafe ini akan langsung mengingatkan kita pada suasana vintage british style ala kafe-kafe di Inggris dan juga Eropa, lengkap dengan red telephone box khas negara inggris dan kendaraan roda dua serta roda empat jadul. Interiornya juga tidak kalah menarik untuk dijadikan tempat berfoto, lho. Kalau masih belum puas berfoto ria, kamu bisa jalan ke bagian samping kafe dan berpose di depan miniatur rumah warna warni ala Notting Hill. Sangat instagramworthy sekali, bukan? Setelah puas berfoto, kamu bisa mencicipi snack, makanan lokal dan western yang sangat menggiurkan. Jangan khawatir terlambat karena Brick Cafe buka 24 jam. Bahkan ada menu spesial di malam hari yang diberi nama midnight menu, yaitu bubur kacang ijo alias burjo yang jadi andalan mahasiswa Jogja untuk mengisi perut di malam hari.",
            "Kafe dengan suasana outdoor kini mulai digemari orang banyak. Salah satu kafe outdoor yang terkenal di Jogja adalah Secret Garden Coffee and Chocolate. Mengusung tema yang romantis, kafe ini sukses menjadi tempat favorit pelaksanaan acara pernikahan. Berlokasi di atas lahan rumput hijau yang luas, kafe ini dijamin cocok untuk kamu yang suka foto-foto dengan pemandangan hijau. Bukan cuma tempat makan outdoor, dapur kafe ini juga mengusung tema open kitchen, sehingga kamu bisa melihat para chef sedang memasak makanan kita secara langsung. Suasana romantispun semakin terasa pada malam hari, dengan lampu-lampu taman yang berkilauan menghiasi kafe ini.",
            "Saat memasuki area kafe, kita akan disambut oleh beruang besar yang lucu dan menggemaskan. Berfoto di dekat beruang tentunya tidak boleh dilewatkan. Sesuai dengan namanya, interior kafe ini juga didominasi oleh si beruang sebagai tokoh utama. Suasana kafe ini juga sangat cozy, sehingga akan membuatmu betah berlama-lama nongkrong di sini. Kamu bisa memesan camilan ataupun makan makanan yang berat. Lukisan beruang yang ada di dinding juga bisa menjadi tempat untuk mengabadikan momenmu saat berkunjung ke sini.",
            "Walaupun memiliki ukuran yang cukup mungil, pesona Lawas 613 kafe tidak tertandingi. Berlokasi di kawasan Prawirotaman atau yang sering dijuluki kampung bule, tampak luar kafe ini terkesan moderen, namun ketika masuk ke dalam, kamu bisa merasakan suasana vintage yang unik dan timeless. Di sini kamu bisa menemukan banyak lokasi berfoto yang unik, mulai dari ruang makan dengan jendela tempoe doeloe ataupun deretan sepeda ontel klasik yang terpajang di lantai bawah. Suasananya yang tenang dijamin akan membuatmu betah berlama-lama di sini!",
            "Gelato tentu menjadi dessert yang pas untuk menawar cuaca yang sangat panas di Jogja.  Salah satu tempat yang wajib kamu kunjungi jika ingin makan gelato adalah Tempo Gelato.  Tempo Gelato telah memiliki tiga cabang di kota Jogja dengan suasana dan interior yang identik. Salah satu cabang Tempo Gelato ternyata berdekatan dengan Lawas 631 kafe lho; jadi kamu bisa saja mengunjungi keduanya sekaligus! Di sini, kamu tidak perlu khawatir kehilangan momen untuk berfoto ria. Eksterior yang didominasi oleh kaca membuat sinar matahari yang terang bisa masuk ke bagian dalam bangunan, membuat vibe di dalam kafe menjadi semakin menyenangkan. Di bagian dalam bangunan, kamu akan dimanjakan dengan interior gaya Eropa yang mewah.  Dari segi rasa, gelato yang ada di sini juga sudah sangat terkenal enaknya. Harganya pun tidak terlalu mahal.",
            "Masih berlokasi di daerah Prawirotaman, kafe satu ini memiliki nuansa ‘rumahan’. Meskipun terlihat seperti rumah biasa, interiornya ternyata sangat eksotik dan etnik, lho. Tidak heran jika banyak wisatawan asing datang untuk makan di sini. Kebanyakan menu yang ditawarkan adalah menu masakan western, tetapi mereka juga menyediakan menu vegetarian. Makanan khas Indonesia seperti nasi goreng, sop buntut dan juga mangut ikan juga bisa kamu pesan di sini. Selain menjual makanan, kafe ini juga menyediakan berbagai macam jenis roti seperti roti baget, pita roti, foccacia, white dan brown bread di Artisan Bakery miliknya. Jika kamu datang hari Jumat, kamu akan dimanjakan dengan Live Music Jazz yang merdu lho!",
            "Ekologi tentu telah menjadi salah satu tempat ngopi yang instagram-worthy di kawasan utara Jogja. Selain tempatnya yang luas, nuansa exposed material juga menjadi tema yang dibanggakan oleh kafe ini. Bagian outdoor juga ditata sedemikian rupa sehingga tampak rapi dan sejuk, layaknya hutan hujan tropis. Jika kamu senang dengan nuansa alam yang semi-moderen, Ekologi Desk&Coffee tidak boleh kamu lewatkan!",
            "Sesuai dengan arti Saorsa dalam bahasa Skotlandia yang berarti “kebebasan”, kafe ini sering dijadikan tempat berpikir dan berbicara secara bebas untuk mendapatkan ide yang cemerlang. Lokasinya yang berada di dalam kawasan perumahan membuat Saorsa terkesan homy. Saorsa Kopi memiliki pilihan ruangan outdoor, semi outdoor dan indoor. Ketiganya memiliki ciri khas tersendiri dan sangat instagrammable. Setiap sudutnya memiliki ciri khas unik yang bisa kamu jadikan tempat berfoto. Dijamin nggak rugi deh datang kemari!",
            "Di kafe ini, kamu akan diajak kembali ke suasana tahun 1980-an. Dari tampak depan, kafe ini sangat nyentrik dengan tampilan bertuliskan quote-quote yang unik. Tidak heran bila banyak orang suka berfoto di area ini. Area lain yang bagus untuk dijadikan spot foto adalah bagian dalam dan samping kafe yang tidak kalah uniknya. Jangan mengaku hipster kalau belum pernah mengunjungi tempat ini!",
            "Minum kopi di kafe tentu telah menjadi hal yang biasa untuk para generasi milenial. Namun bagaimana jika minum kopi sambil membaca buku di kafe? Nah, Blanco Coffee and Books menawarkan keduanya. Menu kopi di sini juga sudah sangat terkenal seantero Jogja. Tempatnya bukan hanya asyik untuk ngobrol dan nongkrong lho, tapi juga bisa jadi tempat berfoto yang instagramworthy. Tidak hanya kenikmatan kopinya yang terkenal, kecepatan wifi nya juga membuat Blanco sukses jadi tempat favorit buat nugas, rapat maupun kerja.",
            "Pernah bermimpi jadi pilot? Atau ingin berfoto di dalam kokpit pesawat? Datang saja ke The Captain Urban Jogja. Kafe unik dengan moncong pesawat yang terlihat dari luar ini hanya bisa kamu temukan di Jogja lho! Selain tampak depan bangunan yang dibuat mirip hanggar, interiornya juga didominasi oleh interior pesawat terbang, termasuk toiletnya yang menyerupai toilet di pesawat terbang.",
            "Pernah melihat mie yang bisa terbang sendiri? Kalau belum pernah coba, datang saja langsung ke Makan Minum Jogja. Kafe dengan menu andalan mie terbang ini tidak hanya menawarkan mie unik, tetapi juga suasana kafe yang ceria dan penuh warna. Harga menu yang terjangkau menjadikan Makan Minum menjadi tempat favorit makan-makan besar di Jogja. Selain berfoto dengan latar belakang kafe yang penuh warna, kamu juga wajib berfoto dengan mie terbang alias flying noodle-nya yang fenomenal."
    };

    private static int[] fotoCafe = {
            R.drawable.mezzanine,
            R.drawable.filkop,
            R.drawable.brick,
            R.drawable.secret,
            R.drawable.bear,
            R.drawable.lawas,
            R.drawable.tempo,
            R.drawable.via,
            R.drawable.ekologi,
            R.drawable.saorsa,
            R.drawable.bocor,
            R.drawable.blanco,
            R.drawable.captain,
            R.drawable.makan
    };

    private static String[] lokasiCafe = {
            "Jalan Palagan Tentara Pelajar KM via No.30, Sariharjo, Ngaglik, Yogyakarta",
            "Jalan Pandhawa, Palagan KM via.filkop,Sariharjo, Ngaglik, Yogyakarta",
            "Jl. Damai No.via, Sinduharjo, Ngaglik, Yogyakarta",
            "Jl. Amri Yahya No. filkop, Pakuncen, Wirobrajan, Yogyakarta",
            "Jl. P. Mangkubumi No.52, Gowongan, Jetis, Yogyakarta",
            "Jl. Prawirotaman filkop No.613, Brontokusuman, Mergangsan, Yogyakarta",
            "Jl. Prawirotaman No.43, Brontokusuman, Mergangsan, Yogyakarta",
            "Jl. Prawirotaman No.30, Brontokusuman, Mergangsan, Yogyakarta",
            "Jl. Pandean Sari Blok IV No. 10A Condong Catur",
            "Jalan Sulawesi No.16, Sinduadi, Mlati,Yogyakarta",
            "Jalan Parangtritis Km.bear,bear, Tarudan, Bangunharjo, Sewon, Yogyakarta",
            "Jl. Kranggan No.30, Cokrodiningratan, Jetis, Kota Yogyakarta",
            "Jalan Damai No. 41, Sari Harjo, Ngaglik, Sariharjo, Yogyakarta",
            "Jl. Taman Siswa No.156, Wirogunan, Mergangsan, Yogyakarta"
    };

    private static String[] jamBukaCafe = {
            "Setiap hari mulai pukul 09.00 hingga pukul 23.00 WIB (kecuali Senin buka mulai pukul 15.00 WIB)",
            "Setiap hari mulai pukul 11.00 hingga 23.00 WIB",
            "24 jam setiap hari",
            "Setiap hari mulai pukul 17.00 hingga 00.00 WIB",
            "Setiap hari mulai pukul 07.00 hingga 23.00 WIB",
            "Setiap hari mulai pukul 11.00 hingga 02.00 WIB",
            "Setiap hari mulai pukul 10.00 hingga 23.00 WIB",
            "Setiap hari mulai pukul 07.30 hingga 23.00 WIB",
            "Setiap hari mulai pukul 10.00 hingga 00.00 WIB",
            "Setiap hari Minggu sampai Jumat mulai pukul 10.00 hingga 23.00 WIB",
            "Setiap hari mulai pukul 11.00 hingga 23.30 WIB",
            "Setiap hari mulai pukul 07.00 hingga 01.00 WIB",
            "Setiap hari mulai pukul 17.00 hingga 00.00 WIB",
            "Setiap hari mulai pukul 10.00 hingga 22.00 WIB"
    };

    static ArrayList<Cafe> getListData() {
        ArrayList<Cafe> list = new ArrayList<>();
        for (int i = 0; i < namaCafe.length; i++) {
            Cafe cafe = new Cafe();
            cafe.setId(idCafe[i]);
            cafe.setNama(namaCafe[i]);
            cafe.setLokasi(lokasiCafe[i]);
            cafe.setDetail(detailCafe[i]);
            cafe.setJamBuka(jamBukaCafe[i]);
            cafe.setFoto(fotoCafe[i]);
            list.add(cafe);
        }
        return list;
    }
}
