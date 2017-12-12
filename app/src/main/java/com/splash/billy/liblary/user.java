package com.splash.billy.liblary;

/**
 * Created by Billy on 05/12/2017.
 */

public class user extends members{
    private String email;
    private String password;
    private String nama;
    private String telepon;
    private String id_member;



    private String [][] data = new String[][]{
            {"billy@kharisma.ac.id","billy","Billy Tanyawan","0011","084873299"},
            {"Anto@gmail.com","anto","Aprianto","0022","97657369"},
            {"ivan","ivan","Ivan Dharmawan","003","08738573944"}
    };

    public user(String email){
        this.email = email;
        this.cariuser();
    }
    public void setData(String[][] data){this.data = data;}

    private void cariuser(){
        for (int i=0; i< this.data.length;i++){
            if (this.email.equals(data[i][0])){
                this.password = this.data[i][1];
                this.nama = this.data[i][2];
                this.id_member = this.data[i][3];
                this.telepon = this.data[i][4];
            }
        }
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }



    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getTelepon() {
        return telepon;
    }

    public void setTelepon(String telepon) {
        this.telepon = telepon;
    }

    @Override
    public String getId_member() {
        return id_member;
    }

    @Override
    public void setId_member(String id_member) {
        this.id_member = id_member;
    }
}
