import java.util.Scanner;

public class Queue_two {
     int num = 5;

    String arr [] = new String[num];

    int front , rear =-1;

    public void Enque(){
        String data ;
        int ch;

        do {
        System.out.println("Enter your data --");
        Scanner sc = new Scanner(System.in);
        data =sc.nextLine();

        if (rear == num-1){
            System.out.println("Queue is full / Overflow");
        }
        else {
            rear = rear+1;
            arr [rear] = data;
            System.out.println("Data inserted successfully");
        }

            System.out.println("Do you want to add more data -- press 1");
            ch =sc.nextInt();
        }while (ch == 1);

    }


    public void Dqueue (){
        int ch;
        char opt;
        System.out.println();
        System.out.println("Do u want to delete data FROM QUEUE - if yes press y");
        System.out.println();
        Scanner sc1 = new Scanner(System.in);
        opt = sc1.next().charAt(0);

        if (opt == 'y' || opt == 'Y'){

            do {
                if (front == -1 && rear == -1){
                    System.out.println("There is no element pls Enter first");
                }
                else {
                    front = front+1;
                    System.out.println();
                    System.out.println("One item deleted successfully");
                    System.out.println();
                }

                System.out.println("Do you want to delete more data -- press 1");
                Scanner sc = new Scanner(System.in);
                ch =sc.nextInt();
            }while (ch == 1);
        }
        else {
            System.out.println("Good Job");
        }

    }

    public void display (){
        if (front == -1 && rear == -1){
            System.out.println("There is no element pls Enter first");
        }
        else {
            System.out.print ("Your data is -" + " ");
            for (int i = front; i <=rear ; i++){
                System.out.print(" , "+ arr[i]);
            }
        }
    }

    public static void main(String[] args) {
        

       Queue_two q2 = new Queue_two();

        q2.Enque();
        q2.Dqueue();
        q2.display();
    }
}
