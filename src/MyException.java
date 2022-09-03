public class MyException extends IllegalArgumentException{

    public MyException() {}

    public MyException(String message) {
        super(message);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
