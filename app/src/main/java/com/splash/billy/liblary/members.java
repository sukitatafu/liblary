package com.splash.billy.liblary;

import android.renderscript.ScriptIntrinsicYuvToRGB;

/**
 * Created by Billy on 05/12/2017.
 */

public class members {
    private String id_member;
    private pinjaman pinjaman;

    public String getId_member() {
        return id_member;
    }

    public void setId_member(String id_member) {
        this.id_member = id_member;
    }

    public pinjaman getPinjaman(){return pinjaman; }

    public void setPinjaman(pinjaman pinjaman){this.pinjaman=pinjaman;}
}
