package Assignment1.exemplu3;

public class Gorila implements Animal{

    private String numeGorila;

    public String getNumeGorila() {
        return numeGorila;
    }

    public void setNumeGorila(String numeGorila) {
        this.numeGorila = numeGorila;
    }

    public void mananca() {
        System.out.println("gorila " +this.numeGorila + " mananca banane");
    }

    public  void sunet(){
        System.out.println("gorila face un sunet");
    }

    public Gorila(String numeGorila){
        this.numeGorila = numeGorila;
    }
}
