package Assignment1.exemplu1;

public class Door {

    private boolean is_open;

    public Door(boolean is_open){
        this.is_open = is_open;
    }

    public Door(){

    }

    public void open(){
        this.is_open = true;
        System.out.println("Usa este acum deschisa");

    }

    public void close(){
        this.is_open = false;
        System.out.println("Usa este acum inchisa");
    }

}
