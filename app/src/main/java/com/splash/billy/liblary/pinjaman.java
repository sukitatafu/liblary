package com.splash.billy.liblary;

/**
 * Created by Billy on 05/12/2017.
 */

public class pinjaman {
    private String buku;
    private String tanggalpin;
    private String tanngalkem;
    private String id_member;

    private String [][] data = new String[][]{
            {"001","05 Desembert 2017","10 Desember 2017", "001"},
            {"002","03 Desembert 2017","12 Desember 2017", "002"},
    };

    public pinjaman (String id_member)
    {
      this.id_member = id_member;
      this.carikode();
    };

    private void carikode()
    {

    }


    public String getBuku() {
        return buku;
    }

    public void setBuku(String buku) {
        this.buku = buku;
    }

    public String getTanggalpin() {
        return tanggalpin;
    }

    public void setTanggalpin(String tanggalpin) {
        this.tanggalpin = tanggalpin;
    }

    public String getTanngalkem() {
        return tanngalkem;
    }

    public void setTanngalkem(String tanngalkem) {
        this.tanngalkem = tanngalkem;
    }

    public String getId_member() {
        return id_member;
    }

    public void setId_member(String id_member) {
        this.id_member = id_member;
    }
}
