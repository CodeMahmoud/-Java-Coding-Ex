public class Words {
static int counter = 0;

public static int wordCount(String arg) {
    for (int i = 0; i < arg.length(); i++) {
        if (arg.charAt(i) == ' ') {
            counter++;
        }
    }
   return counter + 1;
}
}
