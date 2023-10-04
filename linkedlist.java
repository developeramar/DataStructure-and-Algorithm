public class linkedlist {
    
    class Node{
        int data;
        Node next;

        public Node (int data){
            this.data = data;
            this.next = null;
        }
    }

    Node head = null;
    Node tail = null;

    // Data Inserting into the linked list
    public void insert(int data){

        Node newNode = new Node(data);

        if(head == null){
            head = newNode;
            tail = newNode;

        }
        else{
            tail.next = newNode;
            tail = tail.next;
        }
    }

    // data traversing into the linked list

    public void traverse(){

        Node current = head;
        while(current != null){
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();

    }

    // data reversing from the linked list

    public void reverse(){

        Node current = head;
        Node next = null;
        Node prev = null;

        while(current != null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        head = prev;

    }

    // data searching into the linkedlist

    public boolean isSearch(int key){

        Node curr = head;

        while (curr !=null){

            if(curr.data == key){
                return true;
            }
            curr = curr.next;
        }

        return false;
    }
    
    
public static void main(String[] args) {
    
    linkedlist obj = new linkedlist();

    obj.insert(0);
    obj.insert(1);
    obj.insert(2);
    obj.insert(3);
    obj.insert(4);
    obj.insert(5);
    obj.insert(6);

    System.out.println("Normal Linked list --------------------------------");
    obj.traverse();


        obj.reverse();
        System.out.println("Reverse Linked list --------------------------------");
        obj.traverse();
        System.out.println();

        System.out.println("Searching elements --------------------------------");

        int key = 5;

        if(obj.isSearch(key)){
            System.out.println(key + " is present in the list");
        }
        else{
            System.out.println(key + " is not present in the list");
        }
}
    

    
}
