public class LinkedList {
    

    static class Node {

        int data;
        Node next;
 
        // creating a constructor ---
 
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
 
    Node head = null;
    Node tail = null ;
 
    // adding the element in the Node --
 
     public void addnode(int data){
         Node newNode  = new Node(data);
 
         if(head == null){
             head = newNode ;
             tail = newNode ;
         }
         else {
             tail.next = newNode;
             tail = newNode;
         }
     }
 
     // traverse the Linked List
 
     public void traverse (){
         Node temp = head ;
         System.out.println();
         System.out.print("the list is -- ");
         if(temp == null){
             System.out.println("List is empty--");
         }
         else {
             while (temp != null){
                 System.out.print(temp.data + " ");
                 temp = temp.next;
             }
         }
 
         System.out.println();
     }


     public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.addnode(1);
        ll.addnode(2);
        ll.addnode(3);
        ll.addnode(4);

        ll.traverse();
     }
}
