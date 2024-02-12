public class VowelsCounter {
    public static String vowelsCounter (String args) {
        String vowels = "aeiou";
        return "this sentence has " + counter(args, vowels) + " vowels";
    }
    public static int counter (String arg, String vowels) {
        int count = 0;
        String input = arg.toLowerCase();
        for (int i = 0; i < arg.length(); i++) {

        for (int j = 0; j < arg.length(); j++) {
            if (input.charAt(i) == vowels.charAt(j)){
                count++;
            }
        }

        }
        return count;
    }

}
