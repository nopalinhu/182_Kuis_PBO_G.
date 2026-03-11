/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg182_kuis_pbo_g;

/**
 *
 * @author Lab Informatika
 */
public abstract class Reservasi extends Tamu implements LayananEkslusif{
    private String kode;
    protected int durasi;
    String fasilitas;
    
    //private Tamu tamu;
    
    public Reservasi(String kode, int durasi, String nama, String nik, String telp) throws DataTidakValidException{
        super(nik, nama, telp);
        if (!kode.startsWith("HTL")){
            throw new DataTidakValidException("Kode harus diawali dengan HTL");
        }
        this.kode = kode;
        if(durasi <= 0){
            throw new DataTidakValidException("Lama menginap tidak boleh kurang dari 1 hari!");
        }
        this.durasi = durasi;
    }
    
    //public abstract void setHarga(int harga);
    
    public String getKode(){
        return kode;
    }
    
    public int getDurasi(){
        return durasi;
    }
    
    public abstract int getHarga();
    
    @Override
    public String FasilitasTambahan(){
        return fasilitas;
    }
}
