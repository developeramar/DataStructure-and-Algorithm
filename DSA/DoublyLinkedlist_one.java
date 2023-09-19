package DSA;
import java.util.Scanner;

public class DoublyLinkedlist_one {
     static class Node{
        int value;
        Node next;
        Node prev;

        public Node(int value){
            this.value = value;
            this.next = null;
            this.prev = null;
        }
    }

    Node head =null;
    Node tail = null;

    public void insertNode(){

        int data , ch;
        Scanner sc = new Scanner(System.in);

        do {


        System.out.println("--------->- Enter the value -<----------");
        data = sc.nextInt();
        Node new_node = new Node(data);

        if (head == null){
            head = new_node;
            tail = new_node;

            head.prev = null;
            tail.next = null ;
        }
        else {

            tail.next = new_node;
            new_node.prev = tail;

            tail = new_node;
            tail.next = null ;

        }

            System.out.println("-- Do you want to add more data --");
        ch = sc.nextInt();
        }while (ch == 1);
    }

    public void display (){

        Node temp = head;
        Node revTemp = tail;

        if(head == null){
            System.out.println("Please enter value first ---->");
        }
        else {
            while (temp != null){
                System.out.print( " " + temp.value);
                temp = temp.next;
            }
        }
    }


    public static void main(String[] args) {
       DoublyLinkedlist_one dl = new DoublyLinkedlist_one();

        dl.insertNode();
        dl.display();
    }
}
