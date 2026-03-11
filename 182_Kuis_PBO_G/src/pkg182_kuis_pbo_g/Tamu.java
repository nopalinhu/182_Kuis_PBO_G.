/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg182_kuis_pbo_g;

/**
 *
 * @author Lab Informatika
 */
public class Tamu {
    private String nik, nama, telp;
    
    public Tamu(String nik, String nama, String telp){
        this.nama = nama;
        this.nik = nik;
        this.telp = telp;
    }
    
    public String tampilkanTamu(){
        return "NIK                : " + this.nik + 
             "\nNAMA               : " + this.nama + 
             "\nNO. TELP           : " + this.telp;
    }
}
