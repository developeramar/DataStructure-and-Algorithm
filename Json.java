import DeltaX_Question.formatJSON;

public class Json {
    
    public static void main(String[] args) {
        
        String string = "{\"name\":\"John\", \"email\":\"john.d@gmail.com\"}";
        String jsonFor = formatJson(string);
        System.out.println(jsonFor);
        
    }

    public static String formatJson(String str){

        StringBuilder sb = new StringBuilder();

        int index = 0;
        boolean res = false;

        for (char c : str.toCharArray()){

            if(c == '{'){

                sb.append("**".repeat(index));
                sb.append(c);
                sb.append("\n");
                index++;
                sb.append("**".repeat(index));
            }

            else if(c == '}'){
                index--;
                sb.append("\n");
                sb.append("**".repeat(index));
                sb.append(c);
            }

            else if(c == '"'){

                sb.append(c);
            }

            else if(c == ','){
                sb.append(c);

                if(!res){
                    sb.append("\n");
                    sb.append("**".repeat(index));
                }
            }
            else{
                sb.append(c);
            }

            
        }
        return sb.toString();
    }
}
