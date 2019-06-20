public class char_occurence {
    public static void main(String[] args) {
        String s = "suszkskkcloowppzpaasllalx";
        char[] c = s.toCharArray();
        int n = c.length;
        int i = 0, j = 0, count = 0;
        for (i = 0; i < n; i++) {
            count = 0;
            for (j = 0; j < n; j++) {
                if (j < i && c[i] == c[j]) {
                    break;
                }
                if (c[j] == c[i]) {
                    count++;
                }
                if (j == n - 1) {
                    System.out.println(" the character " + c[i] + " is present " + count + " times ");
                }
            }
        }
    }
}
