/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg182_kuis_pbo_g;

/**
 *
 * @author Lab Informatika
 */
public class KamarDeluxe extends Reservasi implements LayananEkslusif {
    
    public KamarDeluxe(String kode, int durasi, String nama, String nik, String telp) throws DataTidakValidException{
        super(kode, durasi, nama, nik, telp);
        super.fasilitas = "Sarapan Prasmanan";
    }
    
    @Override
    public int getHarga(){
        return durasi * 700000;
    }
    
    
}
