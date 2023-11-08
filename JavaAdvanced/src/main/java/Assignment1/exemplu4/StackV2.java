package Assignment1.exemplu4;

public class StackV2 {

    private int top;
    private int[] arr;


    public StackV2(int size){
        arr = new int[size];
        top = -1;
    }

    public boolean isEmpty(){
        if(top == -1){
            return true;
        }
        return false;
    }

    public void  push(int value){
        if(top == arr.length-1){
            System.out.println("Stack-ul este plin");
        }else{
            top++;
            arr[top] = value;
        }
    }

    public int pop(){
        if(top == -1){
            System.out.println("Stack-ul este gol");
            return -1;
        }

        int elementEliminat = arr[top];
        top--;
        return elementEliminat;

    }

    public int peek(){
        if(top==-1){
            System.out.println("Stack-ul este gol");
            return  -1;
        }
        return arr[top];
    }

    public void afisare(){
        if(top == -1){
            System.out.println("Stack-ul este gol");
        }else {
            for (int i = 0; i < top; i++) {
                System.out.println(arr[i] + " ");
            }
        }
    }
}
