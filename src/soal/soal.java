package soal;
import java.util.Scanner;
import java.util.Random;
public class soal {
    private int level;
     Scanner input = new Scanner(System.in);
     public int getLevel(){
         return level;
     }
     public void setLevel(int level){
         this.level= level;
     }
     
     public soal(){
         this.level= 1;
     }
     public void reset(){
         this.level= 1;
     }
     public int randomAngka(int min, int max){
         Random r = new Random();
         int angka = r.nextInt(max-min+1) + min;
         return angka;
    }
     
}
