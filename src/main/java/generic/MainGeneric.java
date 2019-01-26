package generic;

class Login<T> {
    private T name;
    private T password;

    public Login(T name, T password) {
        this.name = name;
        this.password = password;
    }

    public T getName() {
        return name;
    }

    public void setName(T name) {
        this.name = name;
    }

    public T getPassword() {
        return password;
    }

    public void setPassword(T password) {
        this.password = password;
    }
}

public class MainGeneric {

    public static void main(String[] args) {

        Login<String> login = new Login<>("Paul", "password");

        Login<Integer> login1 = new Login<>(23, 43);

        System.out.println(login.getName());
        System.out.println(login1.getName());

    }

}
