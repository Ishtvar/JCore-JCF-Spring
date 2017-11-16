package Task22;

import java.util.Stack;

public class Brackets {
    public static void main(String[] args) {

        String testString1 = "((((()))))";
        String testString2 = "())()()(())((";
        String testString3 = "())())())())())";

        System.out.println(getTest(testString1));
        System.out.println(getTest(testString2));
        System.out.println(getTest(testString3));
    }

    private static String getTest(String s) {
        Stack stack = new Stack();
        String result = "Something went wrong";
        int i, j;
        int o = 0;
        int c = 0;

        puntStringToStackAsArray(s, stack);

        for (stack.size(); stack.size() > 0; ) {


            i = stack.search('(');
            j = stack.search(')');
            if (j < i && j > 0) {
                stack.pop();
                c++;
            } else {
                stack.pop();
                o++;
            }
        }

        if (o == c) {
            result = "The number of opening and closing brackets is equal.";
        } else {
            if (o > c) {
                result = "The number of opening brackets is bigger.";
            } else {
                result = "The number of closing brackets is bigger.";
            }
        }
        return result;
    }

    static void puntStringToStackAsArray(String s, Stack st) {

        char[] arr = new char[s.length()];
        arr = s.toCharArray();
        for (char i : arr) {
            st.push(i);
        }
    }
}
