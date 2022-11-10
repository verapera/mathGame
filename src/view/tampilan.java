package view;
import data.user;
import soal.pengurangan;
import soal.penjumlahan;
import soal.soal;
import java.util.Scanner;
public class tampilan {
    user Data = new user();
    soal Soal = new soal();
    Scanner input = new Scanner(System.in);
    Scanner inputs = new Scanner(System.in);
    penjumlahan tambah = new penjumlahan();
    pengurangan kurang = new pengurangan();
    
    public static void main(String[] args) {
        new tampilan().tampilanAwal();
    }
    public void tampilanAwal(){
        System.out.println("*********************");
        System.out.println("Game Math");
        System.out.println("*********************");
        System.out.println("Masukan nama anda : ");
        String nama = input.nextLine();
        user awal = new user();
        Data.setNama(nama);
        this.tampilanMenu();
    }
    public void tampilanMenu(){
        Data.reset();
        Soal.reset();
        int pilihan = 0;
        while (pilihan < 1 || pilihan > 3){
            System.out.println("*********************");
            System.out.println("Game Math");
            System.out.println("*********************");
            System.out.println("Menu");
            System.out.println("1. Penjumlahan");
            System.out.println("2. Pengurangan");
            System.out.println("3. Keluar");
            System.out.println();
            
            System.out.println("Pilih no menu : ");
            pilihan = this.input.nextInt();
            
            switch (pilihan){
                case 1:
                    this.soalPenjumlahan();
                    break;
                case 2:
                    this.soalPengurangan();
                    break;
                case 3:
                    System.exit(0);
                    break;
                default:
                    break;               
            }
        }
    }
    public void soalPenjumlahan(){
     System.out.println("*********************");
     System.out.println("Game math-Penjumlahan");
     System.out.println("*********************");
     boolean x = true;
     while (x == true){
         this.cetakSoalPenjumlahan();
     }
    }
    public void soalPengurangan(){
     System.out.println("*********************");
     System.out.println("Game math-Pengurangan");
     System.out.println("*********************");
     boolean x = true;
     while (x == true){
         this.cetakSoalPengurangan();
     }
    }
    public void cetakSoalPenjumlahan(){
        int x = 0;
        int y = 0;
        if (Data.getSkor() <= 100){
            Soal.setLevel(1);
        } else if (Data.getSkor() <= 200) {
            Soal.setLevel(2);
        } else if (Data.getSkor() <= 300) {
            Soal.setLevel(3);
        } else if (Data.getSkor() >= 300) {
            System.out.println("Selamat " + Data.getNama() + ", Anda telah menyelesaikan soal Penjumlahan dengan baik, Silakan dicoba soal pengurangannya ya!");
            this.tampilanMenu();
        }
    switch (Soal.getLevel()){
      case 1:
        x = Soal.randomAngka(0, 10);
        y = Soal.randomAngka(0, 10);
        break;
      case 2:
        x = Soal.randomAngka(-10, -1);
        y = Soal.randomAngka(-10, -1);
        break;
      case 3:
        x = Soal.randomAngka(-10, 10);
        y = Soal.randomAngka(-10, 10);
        break;
      default:
        break;     
    }
         String xs = String.valueOf(x);
         String ys = String.valueOf(y);
         if (x < 0){
             xs = "(" + String.valueOf(x) + ")";
         }
         if (y < 0){
             ys = "(" + String.valueOf(y) + ")";
         }
         System.out.println("Berapakah hasil dari " + xs + " + " + ys);
         System.out.println("Jawab : ");
         int jawaban = 0;
         
         if (inputs.hasNextInt()){
             jawaban += inputs.nextInt();
         }else {
             jawaban += 0 ;
         }
         if (jawaban != (tambah.getJawaban(x, y))){
             Data.setLives(Data.getLives()-1);
             Data.setSkor(Data.getSkor()-1);
             if(Data.getSkor() > 100 && Data.getSkor() <= 200){
                 Soal.setLevel(2);
             } else if(Data.getSkor() > 200 && Data.getSkor() <= 300){
                 Soal.setLevel(3);
             } else {
                 Soal.setLevel(1);
             }
             System.out.println("Wah, salah deh"
                                + "[Skor : " + Data.getSkor() + "]"
                                + "[Lives : " + Data.getLives() + "]"
                                + "[Level : " + Soal.getLevel()+ "]");
        }else{
             Data.setSkor(Data.getSkor()+4);
             if(Data.getSkor() > 100 && Data.getSkor() <= 200){
                 Soal.setLevel(2);
             } else if(Data.getSkor() > 200 && Data.getSkor() <= 300){
                 Soal.setLevel(3);
             }
             System.out.println("Selamat " + Data.getNama() + ", Anda Benar!"
                                + "[Skor : " + Data.getSkor() + "]"
                                + "[Lives : " + Data.getLives() + "]"
                                + "[Level : " + Soal.getLevel()+ "]");
         }
         if (Data.getLives()==0){
             System.out.println("Hai" + Data.getNama()+", Jangan menyerah ya untuk coba lagi.");
             this.tampilanMenu();
         }
    }
    public void cetakSoalPengurangan(){
        int x = 0;
        int y = 0;
        if (Data.getSkor() <= 100){
            Soal.setLevel(1);
        } else if (Data.getSkor() <= 200) {
            Soal.setLevel(2);
        } else if (Data.getSkor() <= 300) {
            Soal.setLevel(3);
        } else if (Data.getSkor() >= 300) {
            System.out.println("Selamat " + Data.getNama() + ", Anda telah menyelesaikan soal Pengurangan dengan baik, Silakan dicoba soal penjumlahan ya!");
            this.tampilanMenu();
        }
    switch (Soal.getLevel()){
      case 1:
        x = Soal.randomAngka(0, 10);
        y = Soal.randomAngka(0, 10);
        break;
      case 2:
        x = Soal.randomAngka(-10, -1);
        y = Soal.randomAngka(-10, -1);
        break;
      case 3:
        x = Soal.randomAngka(-10, 10);
        y = Soal.randomAngka(-10, 10);
        break;
      default:
        break;      
    }
        String xs = String.valueOf(x);
         String ys = String.valueOf(y);
         if (x < 0){
             xs = "(" + String.valueOf(x) + ")";
         }
         if (y < 0){
             ys = "(" + String.valueOf(y) + ")";
         }
         System.out.println("Berapakah hasil dari " + xs + " - " + ys);
         System.out.println("Jawab : ");
         int jawaban = 0;
         
         if (inputs.hasNextInt()){
             jawaban += inputs.nextInt();
         }else {
             jawaban += 0 ;
         }
          if (jawaban != (kurang.getJawaban(x, y))){
             Data.setLives(Data.getLives()-1);
             Data.setSkor(Data.getSkor()-1);
             if(Data.getSkor() > 100 && Data.getSkor() <= 200){
                 Soal.setLevel(2);
             } else if(Data.getSkor() > 200 && Data.getSkor() <= 300){
                 Soal.setLevel(3);
             } else {
                 Soal.setLevel(1);
             }
             System.out.println("Wah, salah deh"
                                + "[Skor : " + Data.getSkor() + "]"
                                + "[Lives : " + Data.getLives() + "]"
                                + "[Level : " + Soal.getLevel()+ "]");
        }else{
             Data.setSkor(Data.getSkor()+4);
             if(Data.getSkor() > 100 && Data.getSkor() <= 200){
                 Soal.setLevel(2);
             } else if(Data.getSkor() > 200 && Data.getSkor() <= 300){
                 Soal.setLevel(3);
             }
             System.out.println("Selamat " + Data.getNama() + ", Anda Benar!"
                                + "[Skor : " + Data.getSkor() + "]"
                                + "[Lives : " + Data.getLives() + "]"
                                + "[Level : " + Soal.getLevel()+ "]");
         }
         if (Data.getLives()==0){
             System.out.println("Hai" + Data.getNama()+", Jangan menyerah ya untuk coba lagi.");
             this.tampilanMenu();
         }
    
    }
    
    
}
