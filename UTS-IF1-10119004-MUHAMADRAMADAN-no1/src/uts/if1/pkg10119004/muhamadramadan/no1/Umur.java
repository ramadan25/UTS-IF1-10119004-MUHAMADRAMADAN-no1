/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts.if1.pkg10119004.muhamadramadan.no1;

/**
 *
 * @author ENDOG
 * Nama         : Muhamad Ramadan
 * Nim          : 10119004
 * Kelas        : IF1
 * Deskripsi    : Program ini berisi tentang tandanya kamu berdasarkan umur
 */
class Umur {
    private int yearBirth, yearNow;
    private static String red = "\033[0;31m";
    
    public Umur(int yearNow) {
        this.yearNow = yearNow;
    }
    
    public int getYearBirth() {
        return this.yearBirth;
    }
        
    public void setYearBirth(int yearBirth) {
        this.yearBirth = yearBirth;
    }
    
    public int getYearNow() {
        return this.yearNow;
    }
    
    public int hitungUmur() {
        return yearNow - yearBirth;
    }
    
    public String tandanyaKamu(int umur) {
        String tandanyaKamu;
        
        if (umur >= 0 && umur <= 5) {
            tandanyaKamu = "Lagi lucu-lucu nya";
        } else if (umur > 5 && umur <= 10) {
            tandanyaKamu = "Masih anak-anak";
        } else if (umur > 10 && umur <= 13) {
            tandanyaKamu = "Masih remaja";
        } else if (umur > 13 && umur <= 19) {
            tandanyaKamu = "Alay";
        } else if (umur > 19 && umur <= 29) {
            tandanyaKamu = "Lagi galau nyari jodoh";
        } else if (umur > 29 && umur <= 35) {
            tandanyaKamu = "Lagi sibuk nyari uang";
        } else if (umur > 35 && umur <= 150) {
            tandanyaKamu = "Sudah tua";
        } else {
            tandanyaKamu = "Tidak terdeteksi di kehidupan";
        }
        String kapital = tandanyaKamu.toUpperCase();
        return red.concat(kapital);
    }
    
}
