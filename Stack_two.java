import java.util.Scanner;

public class Stack_two {

      int top = -1;
    int n = 5;
    int arr [] = new int[n];

    Scanner sc =new Scanner(System.in);

    void push (){

        int data , ch;

        do {

            System.out.print("Enter data ---");
            data = sc.nextInt();

            System.out.println();
        if(top == n-1){
            System.out.println("Stack Overflow");
        }
        else {
            top = top+1 ;
            arr [top] = data ;
            System.out.println("Item Inserted ");
        }

            System.out.println("Do you want to add more data - press 1");
            ch =sc.nextInt();
        }while (ch == 1);
    }

    void pop (){

        int ch;
        do{
        if (top == -1) {
            System.out.println("Stack Underflow");
        }
        else {
            top = top-1;
            System.out.println("Element poped");
        }


        System.out.println("Do you want to add more data - press 1");
        ch =sc.nextInt();
    }while (ch == 1);
    }

    void display (){
        if(top == -1){
            System.out.println("Stack Underflow");
        }
        else {
            for(int j = top ; j>=0 ; j--){
                System.out.print(" "+ arr [j]);
            }
        }
    }

    public static void main(String[] args) {
        Stack_two stk3 = new Stack_two();

        System.out.println();
        System.out.println();
        System.out.println("- - Whta operation u want to perform - - ");
        System.out.println();
        System.out.println();

        System.out.println("press 1 for adding data --");
        System.out.println("press 2 for pop data --");
        System.out.println("press 3 for display data --");

        int opt , ch;
        Scanner sc =new Scanner(System.in);
        opt = sc.nextInt();


        do {

            ch = sc.nextInt();

            switch (ch){

                case 1 :
                    stk3.push();
                    break;
                case 2:
                    stk3.pop();
                    break;
                case 3:
                    stk3.display();
                    break ;
            }


            System.out.println();
            System.out.println("Do you want proceed any operation again -- press 6");
            System.out.println();
            opt=sc.nextInt();
        }while (opt == 6);

        System.out.println("Thank You");
    }

}
