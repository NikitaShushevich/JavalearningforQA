public class ReverseWords {
    public static String reverseWords(final String original) {
        String[] words = original.split(" ");
        StringBuilder result = new StringBuilder();

        if (words.length == 0){
            return original;
        }

        for (String word : words) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(word);
            stringBuilder.reverse();
            result.append(stringBuilder).append(" ");
        }
        return result.toString().trim();
    }

    public static void main(String[] args) {
        String example1 = "This is an example!";
        String example2 = "double  spaces";
        String example3 = "   ";

        System.out.println(reverseWords(example1));
        System.out.println(reverseWords(example2));
        System.out.println(reverseWords(example3));
    }
}
