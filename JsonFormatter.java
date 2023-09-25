
    import java.util.Scanner;

    public class JsonFormatter {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();
            String formattedJson = formatJson(input);
            System.out.println(formattedJson);
        }
    
        public static String formatJson(String json) {
            StringBuilder formatted = new StringBuilder();
            int indentationLevel = 0;
            boolean insideQuotes = false;
    
            for (char c : json.toCharArray()) {
                if (c == '"') {
                    insideQuotes = !insideQuotes;
                }
    
                if (!insideQuotes) {
                    if (c == '{' || c == '[') {
                        formatted.append("\n");
                        appendIndentation(formatted, indentationLevel);
                        formatted.append(c);
                        indentationLevel++;
                        formatted.append("\n");
                        appendIndentation(formatted, indentationLevel);
                    } else if (c == '}' || c == ']') {
                        indentationLevel--;
                        formatted.append("\n");
                        appendIndentation(formatted, indentationLevel);
                        formatted.append(c);
                        formatted.append("\n");
                        appendIndentation(formatted, indentationLevel);
                    } else if (c == ',') {
                        formatted.append(c);
                        formatted.append("\n");
                        appendIndentation(formatted, indentationLevel);
                    } else {
                        formatted.append(c);
                    }
                } else {
                    formatted.append(c);
                }
            }
    
            return formatted.toString();
        }
    
        private static void appendIndentation(StringBuilder builder, int level) {
            for (int i = 0; i < level; i++) {
                builder.append("**");
            }
        }
    }
    

