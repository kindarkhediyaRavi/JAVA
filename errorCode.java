

public class errorCode extends Exception {

    private int errorCode;

    // Constructors
    public errorCode(String message, int errorCode) {
        super(message);
        this.errorCode = errorCode;
    }

    public errorCode(String message, Throwable cause, int errorCode) {
        super(message, cause);
        this.errorCode = errorCode;
    }

    // Getter method for errorCode
    public int getErrorCode() {
        return errorCode;
    }
}
