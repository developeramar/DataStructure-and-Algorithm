package DSA;
import java.util.Scanner;

public class Stack_one {

    int top = -1;
    int n = 5;
    int arr[] = new int[n];
    Scanner sc = new Scanner(System.in);

    void push() {
        int ch;
        do {
            System.out.print("Enter data --");
            if (top == n - 1) {
                System.out.println("-- Stack Overflow --");
            } else {
                int i = sc.nextInt();
                top = top + 1;
                arr[top] = i;
                System.out.println("Item inserted");
            }

            System.out.println("Do you want to add more data press 1--");
            ch = sc.nextInt();
        } while (ch == 1);
    }
    
    void pop() {
        int ch2;
        do {
            if (top == -1) {
                System.out.println("Stack is Underflow , sorry we cant proceed your request");
            } else {
                +-
                top = top - 1;
            }
            System.out.println("Do you want to add more data press 2--");
            ch2 = sc.nextInt();
        } while (ch2 == 2);
    }

    void display() {
        if (top == -1) {
            System.out.println("There is no any input in stack");
        } else {

            for (int j = top; j >= 0; j--) {
                System.out.print(" " + arr[j]);
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {

        Stack_one st = new Stack_one();
        int opt, ch;

        System.out.println("Press 1 for push item");
        System.out.println("Press 2 for delete item");
        System.out.println("Press 3 for display item");

        Scanner sc = new Scanner(System.in);

        do {

            opt = sc.nextInt();
            switch (opt) {
                case 1:
                 st.push();
                 break;
                case 2:
                 st.pop();
                 break;
                case 3:
                 st.display();
                 break;
                 default:
                System.out.println("Wrong input");

            }

            System.out.println("What operation you want to perform press 6--");
            ch = sc.nextInt();
        } while (ch == 6);

    }

}
