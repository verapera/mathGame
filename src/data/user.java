package data;
public class user {
    public String nama;
    public int lives;
    public int skor;
    
    public void reset(){
        this.lives = 3;
        this.skor = 0;
    }
    public user(){
        this.lives = 3;
        this.skor = 0;
    }
    public user(String nama){
        this.nama = nama;
    }
    public user(int lives, int skor){
        this.lives = lives;
        this.skor = skor;
    }
    public String getNama(){
        return nama;
    }
    public void setNama(String nama){
        this.nama = nama;
    }
    public int getLives(){
        return lives;
    }
    public void setLives(int lives){
        this.lives = lives;
    }
    public int getSkor(){
        return skor;
    }
    public void setSkor(int skor){
        this.skor = skor;
    }
}
