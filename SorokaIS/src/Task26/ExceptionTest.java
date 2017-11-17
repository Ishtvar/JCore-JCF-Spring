package Task26;

public class ExceptionTest {
    public static void main(String[] args) {

        int i = 3;
        int j = 0;
        String k = "gdft";
        try {
            divOf(i, j);
        } catch (CustomValidationArguments e) {
            e.printStackTrace();
        }
        sumOf(i, k);
    }

    public static int divOf(int i, int j) throws CustomValidationArguments {
        int d;
        if (j == 0) throw new CustomValidationArguments("");
        d = i / j;
        return d;
    }

    public static int sumOf(int i, String k) throws CustomInvalidOperation {

        try {
            i = i + (Integer.parseInt(k));
        } catch (Exception e) {
            throw new CustomInvalidOperation(" 1 ");

        }

        return i;
    }

}
