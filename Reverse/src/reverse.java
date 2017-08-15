import java.util.Arrays;

public class reverse {
    public static void main(String[] args) {
        int a;
        a = (int) (Math.random() * 1000000);
        System.out.println(a);
        String b = String.valueOf(a);
        char[] revArr = new char[b.length()];
        for (int i = 0, j = b.length() - 1; i < b.length(); i++, j--) {

            revArr[i] = b.charAt(j);

        }
        b = "";
        for (int i = 0; i < revArr.length; i++) {
            b += revArr[i];
        }
        a = Integer.parseInt(b);
        System.out.println(a);
    }
}
