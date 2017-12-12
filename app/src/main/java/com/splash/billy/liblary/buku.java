package com.splash.billy.liblary;

/**
 * Created by Billy on 05/12/2017.
 */

public class buku {
    private String id_buku;
    private String judul;
    private String author;
    private String publisher;

    private String[][] data = new String[][]{
            {"0001","pembelajaran","billy","rockmaster"},
            {"0002","cara belajar","biily","rockmaster"}
    };

    public buku (String id_buku){
        this.id_buku = id_buku;
        this.caribuku();
    }

    private void caribuku() {
        for (int i = 0; i < this.data.length; i++){
            if (this.id_buku.equals(data[i][0])){
                this.judul = this.data[i][1];
                this.author = this.data[i][2];
                this.publisher = this.data[i][3];
            }
        }
    }

    public String getId_buku() {
        return id_buku;
    }

    public void setId_buku(String id_buku) {
        this.id_buku = id_buku;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
}
