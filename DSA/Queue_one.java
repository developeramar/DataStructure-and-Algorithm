package DSA;
import java.util.Scanner;

public class Queue_one {
    
      int n=5;
    int front ,rear = -1;
    int arr [] = new int[n];

    public void enque (){
        int data,ch;

        do {

        System.out.println("Enter data --");
        Scanner sc =new Scanner(System.in);
        data = sc.nextInt();

        if(rear == n-1){
            System.out.println("Queue is full / overflow");
        }
        else {
            rear = rear+1;
            arr [rear] = data;

            System.out.println("Item inserted successfully");

        }
            System.out.println("Do you want to add more data -- press 1");
            ch =sc.nextInt();
        }while (ch == 1);

    }

    public void deque(){

        int ch;

        do{

        if(front == -1 && rear == -1){
            System.out.println("Queue is already empty / underflow");
        }
        else {
            front = front+1;
            System.out.println("Dequeue operation Successful completed");
        }

            System.out.println("Do u want to perform dqueue operation again, press 1");
            Scanner sc =new Scanner(System.in);
            ch = sc.nextInt();
        }while (ch == 1);
    }

    public void display(){
        if(front == rear){
            System.out.println("-- please enter more than one data , \n then only u can able to print the data --");
        }
        else {
            for (int i=front ; i<=rear ; i++){
                System.out.print( " "+ arr[i]);
            }
        }
    }

    public static void main(String[] args) {
        

        Queue_one q1 = new Queue_one();
        q1.enque();
        q1.deque();
        q1.display();

    }
}
