package Strings_Problems;

public class printEvenWord {
    
    public static void main(String[] args) {
        
        String str = "Hello Amar Patel Sonu" ;
        String arr[] = str.split(" ");

       System.out.print("New Word is --");
       for(String str2 : arr){

        if(str2.length() %2 ==0){
            System.out.print( " " + str2);
        }

       }

        

    }
}
