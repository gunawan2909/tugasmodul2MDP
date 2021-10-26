package com.example.modul2_kel10;

public class Data {
    String Nama;
    String Nim;

    public Data(String NAMA, String NIM) {
        Nama=NAMA;
        Nim=NIM;
    }

    public String getNama() {
        return Nama;
    }

    public void setNama(String nama) {
        Nama = nama;
    }

    public String getNim() {
        return Nim;
    }

    public void setNim(String nim) {
        Nim = nim;
    }
}


