package DSA;
import java.util.Scanner;

public class LinkedList_two {
    

        static class Node
    {
        int data;
        Node next ;

        public Node(int data)
        {
            this.data = data;
            this.next = null;
        }
    }

    Node head = null;
    Node tail = null;

    // adding element ---

    public void addData (){
       int data , n;

     do{
         System.out.println("please enter the data --");
     Scanner s = new Scanner(System.in);
         data = s.nextInt();
         Node newNode = new Node(data);


     if(head == null){
         head = newNode;
         tail = newNode;
     }
     else
     {
        tail.next = newNode;
        tail = newNode;
     }
     System.out.println("Do you want add More data --- press 1");
     n = s.nextInt();
     }while (n == 1);

    }

    public void traverse ()
    {
        Node temp = head;

        if (temp == null)
        {//traverseing element ---
            System.out.println("-- List is empty --");
        }
        else
        {
            while (temp != null ){
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
        }
    }

    public void removeItem(){

        int ch , opt;



        do{

            if (head == null){
                System.out.println("please provide value first --");

            }
            else {
                System.out.println("from which place you want to remove , for start press 1 , for end press 2 , or whatever you want press 3");
                Scanner sctt = new Scanner(System.in);
                opt = sctt.nextInt();
                switch (opt){

                    case 1 :
                        Node ptr = head;
                        Node ptr2=ptr.next;

                        ptr = ptr.next;
                        head = ptr;

                        break;

                    case 2 :
                        Node ptr3 =head;
                        Node temp1=ptr3.next;

                        while (temp1.next != null){
                            ptr3 = temp1;
                            temp1 = temp1.next;
                        }
                        ptr3.next = null;
                        break;

                    case 3:
                        System.out.println("Enter position --");
                        int pos;
                        Scanner p = new Scanner(System.in);
                        pos = p.nextInt();

                        Node ptr4 = head;
                        Node temp2=ptr4.next;

                        for(int i =0; i <pos-2 ; i++){
                            ptr4 = temp2;
                            temp2 = temp2.next;
                        }
                        ptr4.next = temp2.next;
                        break;

                }
            }

            System.out.println("Do you want to delete more item --- press 2 ");
            Scanner s = new Scanner(System.in);
            ch = s.nextInt();
        }while (ch == 3);



    }


    public static void main(String[] args) {
        
        LinkedList_two ll2 = new LinkedList_two();
        ll2.addData();
        ll2.removeItem();
        ll2.traverse();


    }


}
