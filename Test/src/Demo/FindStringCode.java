package Demo;
public class FindStringCode {

    public static void main(String[] args) {
        String input = "WORLD WIDE WEB";
        System.out.println(findCode(input));
    }

    public static String findCode(String input) {
        input = input.toUpperCase();
        String result = "";
        String word = "";

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            if (ch != ' ') {
                word = word + ch;   // build word manually
            } else {
                result = result + processWord(word);
                word = ""; // reset
            }
        }

        // process last word
        if (word.length() > 0) {
            result = result + processWord(word);
        }

        return result;
    }

    public static int processWord(String word) {
        int sum = 0;
        int i = 0;
        int j = word.length() - 1;

        while (i < j) {
            int first = getValue(word.charAt(i));
            int last = getValue(word.charAt(j));

            sum = sum + absolute(first - last);
            i++;
            j--;
        }

        // middle character (odd length)
        if (i == j) {
            sum = sum + getValue(word.charAt(i));
        }

        return sum;
    }

    public static int getValue(char ch) {
        return ch - 'A' + 1;
    }

    // custom abs (no Math.abs)
    public static int absolute(int num) {
        if (num < 0) {
            return -num;
        }
        return num;
    }
}