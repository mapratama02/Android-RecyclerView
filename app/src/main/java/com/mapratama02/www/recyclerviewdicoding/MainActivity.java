package com.mapratama02.www.recyclerviewdicoding;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<Integer> mId = new ArrayList<>();
    private ArrayList<String> mNames = new ArrayList<>();
    private ArrayList<String> mDesc = new ArrayList<>();
    private ArrayList<String> mImages = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initDataRecycler();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.about:
                startActivity(new Intent(this, AboutActivity.class));
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    private void initDataRecycler() {
        mId.add(1);
        mNames.add("Matematika\nSejarah");
        mDesc.add("Matematika adalah alat yang dapat membantu memecahkan berbagai permasalahan (dalam pemerintahan,industri, sains). Sejarah matematika adalah penyelidikan terhadap asalmula penemuan di dalam matematika dansedikit perluasannya, penyelidikan terhadap metode dan notasi matematika dimasa silam. Dalam perjalanan sejarahnya, matematika berperan membangun peradaban manusia sepanjang masa.\n\n" +
                "Kata “matematika” berasal dari kata μάθημα(mÃ¡thema) dalam bahasa Yunani yang diartikan sebagai “sains, ilmu pengetahuan, atau belajar” juga μαθηματικός (mathematikÃ³s) yang diartikan sebagai “suka belajar”.\n\n" +
                "Sebelum zaman modern dan penyebaran ilmu pengetahuan ke seluruh dunia, contoh-contoh tertulis dari pengembangan matematika telah mengalami kemilau hanya di beberapa tempat.Tulisan matematika terkuno yang telah ditemukan adalah Plimpton322 (matematika Babilonia sekitar 1900 SM), Lembaran Matematika Rhind (Matematika Mesir sekitar 2000-1800 SM) dan Lembaran Matematika Moskwa (matematika Mesir sekitar 1890 SM). Semua tulisan itu membahas teorema yang umum dikenal sebagai teorema Pythagoras,yang tampaknya menjadi pengembangan matematika tertua dan paling tersebar luas setelah aritmetika dasar dan geometri.");
        mImages.add("https://rumusrumus.com/wp-content/uploads/2017/08/sifat-sifat-bangun-ruang-matematika-lengkap.jpg");

        mId.add(2);
        mNames.add("Bangun Ruang\nSejarah");
        mDesc.add("bangun ruang merupakan bangun matematika yang mempunyai volume atau pun sisi yang juga sering disebut dengan bangun tiga dimensi karena bangun ruang memiliki tiga buah komponen utama yakni mempunyai sisi, titik sudut dan kemudian rusuk. Sisi adalah bidang yang terdapat pada bangun ruang yang menjadi batas di antara bangun ruang dengan ruangan yang terdapat di sekitarnya. Sementara rusuk merupakan pertemuan dua sisi yang merupakan ruas garis yang terdapat pada bangun ruang, dan titik sudut adalah titik hasil dari pertemuan rusuk yang berjumlah tiga atau lebih.");
        mImages.add("https://i.ytimg.com/vi/hHv3KLqgmmo/hqdefault.jpg");

        mId.add(3);
        mNames.add("Kubus");
        mDesc.add("Kubus adalah bangun ruang tiga dimensi yang dibatasi oleh enam bidang sisi yang " +
                "kongruen berbentuk bujur sangkar. Kubus memiliki 6 sisi, 12 rusuk dan 8 titik sudut. " +
                "Kubus juga disebut bidang enam beraturan, selain itu juga merupakan bentuk khusus dalam " +
                "prisma segiempat\n\n" +
                "Ada beberapa sifat-sifat balok, berikut diantaranya :\n" +
                "1). Sisi-sisi kubus berbentuk persegi.\n" +
                "2). Semua rusuk mempunyai ukuran sama panjang.\n" +
                "3). semua diagonal mempunyai ukuran sama panjang.\n");
        mImages.add("https://rumus.co.id/wp-content/uploads/2018/09/Screenshot_4-630x380.png");

        mId.add(4);
        mNames.add("Balok");
        mDesc.add("Balok merupakan bangun ruang 3 (tiga) dimensi yang dibentuk oleh persegi panjang, paling tidak satu pasang di antaranya berukuran berbeda. Balok memliki 6 sisi, 12 rusuk dan 8 titik sudut. Balok yang dibentuk oleh 6 (enam) persegi sama dan sebangun disebut sebagai kubus. \n\n" +
                "Ada beberapa sifat-sifat balok, berikut diantaranya :\n" +
                "1). Sisi-sisi balok berbentuk persegi panjang.\n" +
                "2). Rusuk-rusuk yang sejajar mempunyai ukuran sama panjang.\n" +
                "3). semua diagonal bidang pada sisi yang berhadapan mempunyai ukuran sama panjang.\n" +
                "4). Setiap diagonal ruang pada balok mempunyai ukuran sama panjang.\n" +
                "5). Setiap bidang diagonal pada balok mempunyai bentuk persegi panjang.");
        mImages.add("https://rumusrumus.com/wp-content/uploads/2015/11/Balok.png");

        mId.add(5);
        mNames.add("Prisma Segitiga");
        mDesc.add("Prisma yaitu suatu bangun ruang tiga dimensi yang memiliki alas dan atap yang berbentuk " +
                "segitiga dengan ukuran yang sama. Pada prisma segitiga ini memiliki ciri-ciri diantaranya " +
                "yaitu memiliki sembilan buah rusuk, memiliki lima bidang sisi dan memiliki enam buah titik sudut.\n\n" +
                "Unsur-unsur Prisma Segitiga\n" +
                "1). Terdapat 5 sisi atau bidang\n" +
                "2). Terdapat 9 Rusuk\n" +
                "3). Terdapat 6 titik sudut\n" +
                "4). Atap dan alas berbentuk segitiga");
        mImages.add("https://rumus.co.id/wp-content/uploads/2018/09/Screenshot_26.png");

        mId.add(6);
        mNames.add("Prisma Segiempat");
        mDesc.add("Prisma yaitu suatu bangun ruang tiga dimensi yang memiliki alas dan atap yang berbentuk segiempat " +
                "dengan ukuran yang sama. Pada prisma emapt ini memiliki ciri-ciri diantaranya yaitu memiliki 12 buah rusuk, " +
                "memiliki enam bidang sisi dan memiliki 8 buah titik sudut.\n\n" +
                "Unsur-unsur Prisma Segiempat\n" +
                "1). Terdapat 6 sisi atau bidang\n" +
                "2). Terdapat 12 Rusuk\n" +
                "3). Terdapat 8 titik sudut\n" +
                "4). Atap dan alas berbentuk segiempat");
        mImages.add("https://id-static.z-dn.net/files/d9b/c2c958a0d3621b06017558225c865f74.png");

        mId.add(7);
        mNames.add("Limas Segitiga");
        mDesc.add("Dalam geometri, limas adalah bangun ruang tiga dimensi yang dibatasi oleh alas berbentuk segi-n dan sisi-sisi " +
                "tegak berbentuk segitiga. Limas memiliki n + 1 sisi, 2n rusuk dan n + 1 titik sudut. \n\n" +
                "Kerucut dapat disebut sebagai limas dengan alas berbentuk lingkaran.\n\n" +
                "Unsur-unsur Limas Segitiga\n" +
                "1). Terdapat 4 sisi atau bidang\n" +
                "2). Terdapat 6 Rusuk\n" +
                "3). Terdapat 4 titik sudut\n" +
                "4). Alas berbentuk segitigas dan mengkerucut di atas");
        mImages.add("https://rumusrumus.com/wp-content/uploads/2017/12/Rumus-Volume-Limas-Segitiga.png");

        mId.add(8);
        mNames.add("Kerucut");
        mDesc.add("Kerucut adalah sebuah bangun ruang yang memiliki sebuah alas dengan bentuk lingkaran dan memiliki selimut yang " +
                "berbentuk irisan dari suatu lingkaran. Pada bangun ruang kerucut ini terdapat dua buah bidang sisi yaitu bidang " +
                "sisi lingkaran yang merupakan alasnya dan bidang selimut. Pada kerucut ini terdapat satu titik sudut dan memiliki " +
                "dua buah rusuk.\n\n" +
                "Unsur-unsur Kerucut\n" +
                "1). Terdapat 2 sisi atau bidang\n" +
                "2). Terdapat 2 Rusuk\n" +
                "3). Terdapat 1 titik sudut\n" +
                "4). Alas berbentuk lingkaran dan mengkerucut di atas");
        mImages.add("https://www.ayoksinau.com/wp-content/uploads/2017/10/gambar-kerucut.png");

        mId.add(9);
        mNames.add("Tabung");
        mDesc.add("Dalam geometri, tabung atau silinder adalah bangun ruang tiga dimensi yang dibentuk oleh dua " +
                "buah lingkaran identik yang sejajar dan sebuah persegi " +
                "panjang yang mengelilingi kedua lingkaran tersebut. Tabung memiliki 3 sisi dan 2 rusuk.\n\n" +
                "Unsur-unsur Tabung\n" +
                "1). Terdapat 3 sisi atau bidang\n" +
                "2). Terdapat 3 Rusuk\n" +
                "3). tidak memiliki titik sudut\n" +
                "4). Atap dan alas berbentuk lingkaran");
        mImages.add("https://antonwidawan.com/wp-content/uploads/2018/09/rumus-volume-tabung.jpg");

        mId.add(10);
        mNames.add("Limas Segiempat");
        mDesc.add("Dalam geometri, limas adalah bangun ruang tiga dimensi yang dibatasi oleh alas berbentuk segi-n dan sisi-sisi tegak berbentuk " +
                "segitiga. Limas memiliki n + 1 sisi, 2n rusuk dan n + 1 titik sudut. " +
                "Kerucut dapat disebut sebagai limas dengan alas berbentuk lingkaran. Limas dengan alas berupa persegi disebut juga piramida.\n\n" +
                "Unsur-unsur Limas Segiempat: " +
                "1). Terdapat 5 sisi atau bidang\n" +
                "2). Terdapat 8 Rusuk\n" +
                "3). Terdapat 5 titik sudut\n" +
                "4). Alas berbentuk segiempat dan mengkerucut di atas");
        mImages.add("https://i1.wp.com/www.mahirmatematika.com/wp-content/uploads/2018/09/limas-segiempat.jpg?fit=374%2C435&ssl=1");

        mId.add(11);
        mNames.add("Bola");
        mDesc.add("Dalam geometri, bola adalah bangun ruang tiga dimensi yang dibentuk oleh tak " +
                "hingga lingkaran berjari-jari sama panjang dan berpusat pada satu titik yang sama. Bola hanya memiliki 1 sisi.\n\n" +
                "Unsur-unsur Bola: \n" +
                "1). Terdapat 5 sisi atau bidang\n" +
                "2). Terdapat 8 Rusuk\n" +
                "3). Terdapat 5 titik sudut\n" +
                "4). Alas berbentuk segiempat dan mengkerucut di atas");
        mImages.add("https://rimasetiawati29.files.wordpress.com/2016/12/201612151204331002.jpg?w=685");

        initRecyclerView();
    }

    private void initRecyclerView() {
        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(mId, mNames, mDesc, mImages, this);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}
