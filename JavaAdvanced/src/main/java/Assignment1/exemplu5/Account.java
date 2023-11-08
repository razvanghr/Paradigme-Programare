package Assignment1.exemplu5;

public class Account {
    private String numeCont;
    private double balanta;

    public Account(String numeCont , double balanta){
        this.numeCont = numeCont;
        this.balanta = balanta;
    }

    public String getNumeCont() {
        return numeCont;
    }

    public void setNumeCont(String numeCont) {
        this.numeCont = numeCont;
    }

    public double getBalanta() {
        return balanta;
    }

    public void setBalanta(double balanta) {
        this.balanta = balanta;
    }

//    Methods

    public void deposit(double value){
        this.balanta += value;
    }

    public void withdraw(double value){
        if(value > balanta){
            System.out.println("Fonduri insuficiente");
        }else{
            this.balanta -= value;
        }
    }

    @Override
    public String toString(){
        return this.numeCont + " " + this.balanta;
    }
}
