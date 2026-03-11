/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg182_kuis_pbo_g;

import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author Lab Informatika
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner(System.in);
        ArrayList<Reservasi> antrean = new ArrayList<>();
        
        System.out.println("==== SISTEM RESERVASI HOTEL ====");
        
        Boolean lloop = true;
        int i = 0;
        
        while(lloop && antrean.size() < 100){
            
            try {
                
                System.out.print("\nReservasi Ke-" + i+1 + "\n");
                System.out.print("\nNomor Reservasi                    : ");
                String kode = input.nextLine();
                System.out.print("Lama Menginap                      : ");
                int durasi = input.nextInt();
                input.nextLine();
                System.out.print("Nama Pemesan                       : ");
                String nama = input.nextLine();
                System.out.print("NIK                                : ");
                String nik = input.nextLine();
                System.out.print("No. Telepon                        : ");
                String telp= input.nextLine();
                System.out.print("Tipe (1=Standar, 2=Deluxe,3=Suite) : ");
                int tipe = input.nextInt();
                input.nextLine();
                
                if(tipe == 1){
                    antrean.add(new KamarStandar(kode, durasi, nama, nik, telp));// = new KamarStandar(kode, durasi, nama, nik, telp);
                } else if (tipe == 2){
                    antrean.add(new KamarDeluxe(kode, durasi, nama, nik, telp));
                } else if (tipe == 3){
                    antrean.add(new KamarSuite(kode, durasi, nama, nik, telp));
                }
                
                System.out.print("Masukkan Pesanan Selanjutnya : (y/n) ");
                String aa = input.nextLine();

                if(aa.equalsIgnoreCase("y")){
                    lloop = true;
                }else if(aa.equalsIgnoreCase("n")){
                    lloop = false;
                }else{
                    System.out.println("input Invalid!");
                    input.nextLine();
                }
                
                i++;
                
            } catch (DataTidakValidException e){
                System.out.println("[ERROR] " + e.getMessage());
            } catch (Exception e) {
                System.out.println("[ERROR] " + e.getMessage());
            }
                 
        }
        
        System.out.println("\n---- KAPITULASI RESERVASI ----");
        
        if(antrean.isEmpty()){
            System.out.println("Belum ada reservasi yang dibuat!");
        } else{
            int j = 0;
            for(var obj : antrean){
                System.out.println("RESERVASI KE-" + j + 1);
                System.out.println("NOMOR RESERVASI    : " + obj.getKode());
                System.out.println("LAMA MENGINAP      : " + obj.getDurasi());
                System.out.println(obj.tampilkanTamu());
                System.out.println("HARGA              : " + obj.getHarga());
                System.out.println("FASILITAS TAMBAHAN : " + obj.FasilitasTambahan());
                System.out.print("\n");
                j++;
            }
        }
        
        System.out.println("Sesi Selesai.");
        
    }
    
}
