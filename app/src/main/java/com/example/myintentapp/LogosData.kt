package com.example.myintentapp

import android.media.tv.TvContract

object LogosData {
    private val LogosName = arrayOf("Biznet",
        "Biznet Metronet",
        "Biznet Home",
        "Biznet Gio",
        "Biznet Data Center",
        "Biznet Technovillage",
        "Biznet Wifi",
        "Biznet Hotspot")

    private val LogosDetail = arrayOf("Biznet merupakan perusahaan infrastruktur digital terintegrasi di Indonesia, menyediakan layanan Internet, Data Center, Cloud Computing dan IPTV. Kami memiliki komitmen untuk membangun infrastruktur modern dengan tujuan mengurangi kesenjangan digital Indonesia dengan negara berkembang lainnya. Biznet memiliki dan mengoperasikan jaringan Fiber Optic tercanggih dan data center terbesar di Indonesia.",
        "Biznet Metronet merupakan layanan Broadband Internet Super Cepat khusus untuk keperluan bisnis UKM. Dengan pilihan layanan dari 50 hingga 750 Mbps dan menggunakan jaringan Biznet Fiber, memastikan bisnis Anda akan selalu berjalan dengan lancar.",
        "Biznet Home Internet merupakan layanan Internet WiFi Ultra Cepat untuk pengguna perumahan dan apartemen dengan kecepatan koneksi mencapai 150 Mbps baik untuk download maupun upload.",
        "Beroperasi di atas Tier-3 Data Center, seluruh arsitektur cloud kami dirancang untuk menghadirkan infrastruktur yang stabil, aman, dan andal. Sistem bisnis Anda terintegrasi dengan fasilitas network dan didukung koneksi yang luas untuk memenuhi kebutuhan multi-cloud. Lokasi data center kami berada di Indonesia dan memiliki ketersediaan yang tinggi (High Availability) dengan fitur Multiple Regions dan Availability Zone yang siap digunakan. Kami juga menghadirkan integrasi server on-premise dengan skema hybrid cloud ataupun menghubungkan layanan hyperscaler cloud yang kami kelola dengan profesional.",
        "Biznet has complete infrastructure to manage your digital business requirements, from Biznet Fiber that spans over 36,000 KM in 110+ cities throughout Indonesia; from backbone network to distribution network to offices/homes, Biznet Data Center in three (3) locations and Biznet Gio Cloud that offers managed cloud computing service infrastructure for an easier operation.",
        "Biznet Technovillage menggunakan beberapa teknologi green building untuk mengurangi limbah dan kekuasaan seperti bahan furniture dari kayu palet, bola lampu LED berbasis ada untuk mengurangi konsumsi daya, Dynamic Rotary Uninterruptible Power Supply (DRUPS) untuk memberikan 100% tenaga cadangan tanpa menggunakan baterai berbasis timah (Pb). Timah, pada tingkat paparan tertentu, adalah zat beracun bagi hewan serta bagi manusia. Fasilitas ini juga telah ditinjau oleh sertifikasi Green Building Council Indonesia.",
        "Biznet Wifi adalah layanan wifi turbo dengan kecepatan sampai dengan 150 Mbps khusus untuk pelanggan Biznet.",
        "Biznet Hotspot, layanan Wi-Fi gratis dari Biznet kini tersedia di lebih banyak lokasi di beberapa kota di Pulau Jawa, Bali, Sumatera, dan Batam yang didukung oleh jaringan Biznet Fiber.")

    private val LogosImage = intArrayOf(R.drawable.biznet_logo,
        R.drawable.biznet_metronet_logo,
        R.drawable.biznet_home_logo,
        R.drawable.biznet_giocloud_logo,
        R.drawable.biznet_datacenter_logo,
        R.drawable.biznet_technovillage_logo,
        R.drawable.biznet_wifi_logo,
        R.drawable.biznet_hotspot_logo)

    val listData: ArrayList<Logos>
        get() {
            val list = arrayListOf<Logos>()
            for (position in LogosName.indices){
                val logos = Logos()
                logos.name = LogosName[position]
                logos.detail = LogosDetail[position]
                logos.photo = LogosImage[position]
                list.add(logos)
            }
            return list
        }
}