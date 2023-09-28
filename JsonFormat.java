public class JsonFormat {
    
    public static void main(String[] args) {
        String input = "{\"name\":\"John\", \"email\":\"john.d@gmail.com\"}";

        String Formater = format(input);
        System.out.println(Formater);

    }
    public static String format(String input){

        StringBuilder str = new StringBuilder();
        int index =0;
        boolean res = false;

        for (char c : input.toCharArray()){

            if (c == '{' || c == '['){
                str.append("**".repeat(index));
                str.append(c);
                str.append("\n");
                index++;
                str.append("**".repeat(index));
            }

            else if(c == '}' || c == ']'){
                index--;
                str.append("\n");
                str.append("**".repeat(index));
                str.append(c);

            }
            else if( c == '"'){
                str.append(c);
            }
            else if(c == ','){
                str.append(c);

                if(!res){
                    str.append("\n");
                    str.append("**".repeat(index));
                }
            }
            else{
                str.append(c);
            }
        }
        return str.toString();
    }
}
