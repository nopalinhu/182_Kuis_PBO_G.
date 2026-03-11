/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg182_kuis_pbo_g;

/**
 *
 * @author Lab Informatika
 */
public class KamarSuite extends Reservasi implements LayananEkslusif {
    
    public KamarSuite(String kode, int durasi, String nama, String nik, String telp) throws DataTidakValidException{
        super(kode, durasi, nama, nik, telp);
        super.fasilitas = "Sarapan Prasmanan & Akses Kolam Renang VIP";
    }
    
    @Override
    public int getHarga(){
        return durasi * 1000000;
    }
    
}
