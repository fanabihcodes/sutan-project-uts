/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.app.uts.npm222;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author ASUS
 */
@Entity 
@Table (name = "Buku")
public class Buku {
    @Id
    @Column(name = "Idbuku")
    private String Idbuku;
    
    @Column(name = "Judul")
    private String Judul;
    
    @Column(name = "Pengarang")
    private String Pengarang;
    
    @Column(name = "Penerbit")
    private String Penerbit;
    
    @Column(name = "Tahun")
    private String Tahun;
    
    
    public Buku() {
    }

    public Buku(String Idbuku, String Judul, String Pengarang,String Penerbit,String Tahun) {
        this.Idbuku = Idbuku;
        this.Judul = Judul;
        this.Pengarang = Pengarang;
        this.Penerbit = Penerbit;
        this.Tahun = Tahun;
       
    }

    public String getIdbuku() {
        return Idbuku;
    }

    public void setIdbuku(String Idbuku) {
        this.Idbuku = Idbuku;
    }

    public String getJudul() {
        return Judul;
    }

    public void setJudul(String Judul) {
        this.Judul = Judul;
    }

    public String getPengarang() {
        return Pengarang;
    }

    public void setPengarang(String Pengarang) {
        this.Pengarang = Pengarang;
    }

    public String getPenerbit() {
        return Penerbit;
    }

    public void setPenerbit(String Penerbit) {
        this.Penerbit = Penerbit;
    }

    public String getTahun() {
        return Tahun;
    }

    public void setTahun(String Tahun) {
        this.Tahun = Tahun;
    }
    
    
}