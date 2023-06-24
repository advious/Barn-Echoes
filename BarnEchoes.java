import java.util.*;

public class Program {
    public static void main (String[] args) {
        Scanner in = new Scanner (System.in);
        String s1 = in.next();
        String s2 = in.next();
        int counter = 0;
        int largest = 0;
        for (int i = 0; i < s1.length(); i++) {
            counter = 0;
            for (int j = 0; j < s2.length(); j++) {
                if (s1.charAt(i) == s2.charAt(j)) {
                    while ((i + counter + 1) < s1.length() && (j + counter + 1) < s2.length() && s1.charAt(i+counter + 1) == s2.charAt(j+counter + 1)) {
                        counter++;
                    }
                }
            }
            if (counter > largest) {
                largest = counter;
            }
        }
        largest++;
        System.out.println(largest);
    }
}
