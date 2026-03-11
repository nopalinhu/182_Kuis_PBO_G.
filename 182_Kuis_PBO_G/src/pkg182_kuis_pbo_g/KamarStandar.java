/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg182_kuis_pbo_g;

/**
 *
 * @author Lab Informatika
 */
public class KamarStandar extends Reservasi implements LayananEkslusif {
    //private String fasilitas = "-";
    
    public KamarStandar(String kode, int durasi, String nama, String nik, String telp) throws DataTidakValidException{
        super(kode, durasi, nama, nik, telp);
        super.fasilitas = "-";
    }
    
    @Override
    public int getHarga(){
        return durasi * 400000;
    }
    
    /*@Override
    public void FasilitasTambahan(){
        System.out.print(fasilitas);
    }*/
}
