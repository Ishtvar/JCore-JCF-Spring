package Task26;

public class CustomInvalidOperation extends NumberFormatException {
    public CustomInvalidOperation(String s) {
        super("This operation doesn’t allow here.");
    }
}
