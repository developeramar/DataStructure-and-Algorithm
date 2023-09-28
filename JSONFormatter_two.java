public class JSONFormatter_two {
    public static void main(String[] args) {
        String input = "{\"name\":\"John\", \"email\":\"john.d@gmail.com\"}";
        String formattedJSON = formatJSON(input);
        System.out.println(formattedJSON);
    }

    public static String formatJSON(String input) {
        StringBuilder formattedJSON = new StringBuilder();
        int indentationLevel = 0;
        boolean insideQuotes = false;

        for (char c : input.toCharArray()) {
            if (c == '{'  || c == '[') {
                formattedJSON.append("**".repeat(indentationLevel));
                formattedJSON.append(c);
                formattedJSON.append("\n");
                indentationLevel++;
                formattedJSON.append("**".repeat(indentationLevel));
            } else if (c == '}' || c ==']' ) {
                indentationLevel--;
                formattedJSON.append("\n");
                formattedJSON.append("**".repeat(indentationLevel));
                formattedJSON.append(c);
            } else if (c == '"') {
               
                formattedJSON.append(c);
            } else if (c == ',') {
                formattedJSON.append(c);
                if (!insideQuotes) {
                    formattedJSON.append("\n");
                    formattedJSON.append("**".repeat(indentationLevel));
                }
            } else {
                formattedJSON.append(c);
            }
        }

        return formattedJSON.toString();
    }
}
