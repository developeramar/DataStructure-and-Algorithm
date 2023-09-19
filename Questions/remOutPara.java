package Questions;

/*
 *  Question -- Remove Outermost Parenthesis in java
 * 
 * or
 * /*
 *  Reduce string by removing outermost parentheses from each primitive substring

 * 
 */

public class remOutPara {

    public static String Remove(String s){

        String res ="";
        int count = 0;


        for(int i=0 ; i<s.length() ; i++){

            if(s.charAt(i) == '(' && count++ >0){

                res = res + s.charAt(i);

            }

            if(s.charAt(i) == ')' && count -- >1){
                res = res + s.charAt(i);
            }
        }
        return res;

    }

    public static void main(String[] args) {

        String s = "(()()()())" ;

        System.out.println(Remove(s));

        

    }
}
