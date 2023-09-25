package Questions;
/*
 * Problem Statement – Given a string S(input consisting) of ‘*’ and ‘#’. The length of the string is variable. The task is to find the minimum number of ‘*’ or ‘#’ to make it a valid string. The string is considered valid if the number of ‘*’ and ‘#’ are equal. The ‘*’ and ‘#’ can be at any position in the string.
Note : The output will be a positive or negative integer based on number of ‘*’ and ‘#’ in the input string.

(*>#): positive integer
(#>*): negative integer
(#=*): 0
Example 1:
Input 1:

###***   -> Value of S
Output :

0   → number of * and # are equal

 */

public class tcsQues {
    public static void main(String[] args) {
        String str = "Hello";
        int count=0; int count2 = 0;

        for(int i=0 ; i<str.length() ; i++){

            if(str.charAt(i) == '*'){
                count++;
            }
            else if(str.charAt(i) == '#'){
                count2++;
            }
        }
        System.out.println(count2 - count);
    }
}
