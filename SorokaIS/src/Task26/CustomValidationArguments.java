package Task26;

public class CustomValidationArguments extends Exception {
    public CustomValidationArguments(String message) {
        super("Not enough input arguments to proceed.");
    }
}
