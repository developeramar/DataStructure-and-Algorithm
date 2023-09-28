package DeltaX_Question;

public class formatJSON {
    

    public static void main(String[] args) {
        String QueStr = "{\"name\":\"John\", \"email\":\"john.d@gmail.com\"}";

        String format = forJson(QueStr);
        System.out.println(format);

    }

    public static String forJson(String input){

        StringBuilder str = new StringBuilder();

        int index=0;
        boolean res = false;

        for(char c : input.toCharArray()){

            if(c == '{' || c == '['){
                str.append("**".repeat(index));
                str.append("\n");
                str.append(c);
                index++;
                str.append("**".repeat(index));

            }

            else if(c == '}' || c == ']'){
                index--;
                str.append("\n");
                str.append("**".repeat(index));
                str.append(c);
            }

            else if(c == '"'){
                str.append(c);
            }
            else if(c == ','){
                str.append(c);

                if(!res){
                    str.append("\n");
                    str.append("**".repeat(index));
                }
            }
            else {
                str.append(c);
            }
        }

       return str.toString();
    }
}
