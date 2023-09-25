package DeltaX_Question;

public class Ques_one {

    public static void main(String[] args) {
        

        for(int i=1 ; i<=100 ; i++){

           

            if(i % 4 ==0 && i % 7 ==0){
                System.out.println( "DeltaX" +" --> "+i);
            }
            else if(i % 4 ==0){
                System.out.println( "Delta" +" --> " +i);
            }

            else if( i % 7 == 0){
                System.out.println(  "X"+" --> " +i);
            }
            else{
                 System.out.println(i);
            }
        }
    }
    
}
