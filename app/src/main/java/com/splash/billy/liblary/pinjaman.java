package com.splash.billy.liblary;

/**
 * Created by Billy on 05/12/2017.
 */

public class pinjaman {
    private buku buku;
    private String tanggalpin;
    private String tanngalkem;
    private String id_member;
    private String idm;

    private String [][] data = new String[][]{
            {"0011","05 Desembert 2017","10 Desember 2017","0001"},
            {"0022","03 Desembert 2017","12 Desember 2017","0002"},
    };

    public pinjaman (String id_member)
    {
      this.id_member = id_member;
      this.caripinjam();
    };

    private void caripinjam()
    {
        for(int i=0; i < data.length; i++){
            if (this.id_member.equals(data[i][0])){
                this.tanggalpin = this.data[i][1];
                this.tanngalkem = this.data[i][2];
                this.buku = new buku(data[i][3]);
                this.idm="1";
                break;
            }else{this.idm="0";}
        }
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
    public com.splash.billy.liblary.buku getBuku() {
        return buku;
    }

    public void setBuku(com.splash.billy.liblary.buku buku) {
        this.buku = buku;
    }

    public void setId_member(String id_member) {
        this.id_member = id_member;
    }

    public String getIdm() {
        return idm;
    }

    public void setIdm(String idm) {
        this.idm = idm;
    }
}
