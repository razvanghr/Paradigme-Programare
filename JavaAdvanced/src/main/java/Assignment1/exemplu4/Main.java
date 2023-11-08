package Assignment1.exemplu4;

public class Main {

    public static void main(String[] args) {
        /* Write a Java program to implement a stack with push and pop operations.
        Find the top element of the stack and check if the stack is empty or not. */

        StackV2 stack = new StackV2(5);

        System.out.println(stack.isEmpty());

        stack.push(2);
        stack.push(5);
        stack.push(10);
        stack.push(15);

        stack.afisare();
        stack.pop();
        System.out.println("Pop: ");
        stack.afisare();
        System.out.println("Peek:" + stack.peek());
    }



}
