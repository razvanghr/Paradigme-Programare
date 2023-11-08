package Assignment1.exemplu1;

public class HouseDoor extends Door {

    private boolean isLocked;

    public HouseDoor(boolean isLocked){
      this.isLocked = isLocked;
    }

    public void  open(){
        super.open();
        this.isLocked = false;
    }

    public void close(){
        super.close();
        this.isLocked = true;
    }
}


