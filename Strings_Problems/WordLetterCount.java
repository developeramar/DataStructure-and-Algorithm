package Strings_Problems;

public class WordLetterCount {
    
    static void LetterCount(String str){

        char sc[] = str.toCharArray();

        for(int i=0; i<sc.length ; i++){

            String s ="";

            while(i < sc.length && sc[i] !=' '){

                s = s + sc[i];
                i++;
            }

            if(s.length() > 0){

                System.out.println(s + " --> " + s.length());
            }
        }
       
    }

    public static void main(String[] args) {
        
        String str = "Amar Kumar Chaudhari";
        LetterCount(str);


    }
}
