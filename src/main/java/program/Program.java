package program;

public class Program {

    private int a = -500;

    public Program(int a) {
        this.a = a;
    }

    public static void main(String[] args) {

        Program p = new Program(127);
        p.a += 73;

        System.out.print(p.a);
    }
}
