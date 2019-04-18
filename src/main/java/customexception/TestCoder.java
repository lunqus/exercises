package customexception;

public class TestCoder {
    public static void main(String[] args) {
        CodeManager manager = new CodeManager();

        try {

            Coder coder = manager.find("0000001");

        } catch (CoderNotFoundException e) {
            System.err.print(e);
        }
    }
}