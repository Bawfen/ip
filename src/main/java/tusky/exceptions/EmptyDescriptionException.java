package tusky.exceptions;

public class EmptyDescriptionException extends Exception {
    public EmptyDescriptionException (String message) {
        super(message);
    }
}