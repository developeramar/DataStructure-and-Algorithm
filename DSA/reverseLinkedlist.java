package DSA;

public class reverseLinkedlist {

    class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }

    }
    Node head = null;
    Node tail = null;

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

public void reverse() {
    Node prev = null;
    Node current = head;
    Node next = null;

    while (current != null) {
        next = current.next;
        current.next = prev;
        prev = current;
        current = next;
    }

    head = prev; // Update the head to the new first node
}

public boolean isSearch(int key){
    Node currentNode = head;
    while(currentNode != null){

        if(currentNode.data == key){
            return true;
        }
        currentNode = currentNode.next;
    }

    return false;


}

public void display(){
    Node curr = head;
    while(curr!= null){
        System.out.print(curr.data + " ");
        curr = curr.next;
    }
}

public static void main(String[] args) {
        
    reverseLinkedlist obj = new reverseLinkedlist();
    obj.insert(1);
    obj.insert(2);
    obj.insert(3);
    obj.insert(4);
    obj.insert(5);
    obj.insert(6);

    System.out.println("Normal Linked List");
    obj.display();
    System.out.println();
     obj.reverse();
    System.out.println("Reverse Linkedlist");
   obj.display();

   System.out.println();
   int key = 5;
   if(obj.isSearch(key)){
    System.out.println("Key is Present ");
   }
   else{
    System.out.println("Key is not Present ");
   }




    }
}
