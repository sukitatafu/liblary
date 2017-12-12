package com.splash.billy.liblary;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    private TextView nama,anggota,email,judul,author,publisher,tglpinjam,tglkembali;
    private pinjaman pinjaman;
    private user user;
    private String id = "id";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        anggota =(TextView)findViewById(R.id.tv_anggota);
        nama = (TextView) findViewById(R.id.tv_nama);
        email = (TextView) findViewById(R.id.tv_email);
        judul = (TextView) findViewById(R.id.tv_judul);
        author = (TextView)findViewById(R.id.tv_author);
        publisher = (TextView) findViewById(R.id.tv_publisher);
        tglpinjam=(TextView) findViewById(R.id.tgl_pinjam);
        tglkembali=(TextView) findViewById(R.id.tgl_kembali);

        Bundle extras = getIntent().getExtras();
        id = extras.getString(id);
        email.setText(id);
        String id_email = email.getText().toString().trim();

        if(!TextUtils.isEmpty(id_email)){
            user = new user(id_email);
            nama.setText(user.getNama());
            anggota.setText(user.getId_member());
        }
        String id_member = anggota.getText().toString().trim();
        pinjaman = new pinjaman((id_member));

        if(pinjaman.getIdm()=="1"){
            judul.setText(pinjaman.getBuku().getJudul());
            author.setText(pinjaman.getBuku().getAuthor());
            publisher.setText(pinjaman.getBuku().getPublisher());
            tglpinjam.setText(pinjaman.getTanggalpin());
            tglkembali.setText(pinjaman.getTanngalkem());
        }
    }
}
