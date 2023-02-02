public class IllegalTriangleException extends Exception {
    private String message;

    public IllegalTriangleException() {

    }
    public IllegalTriangleException(String message) {
        this.message = message;
    }

    public String getMessage() {
        return this.message;
    }
}
