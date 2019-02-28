package urlContentReader;

public class Main {

    public static void main(String[] args) {

        // Nusiskaitom puslapi
        StringBuilder html = new UrlContentReader().readContent("https://riptutorial.com/dot-net");

        // Darom ka reik su juo...
        System.out.println(html);

    }

}
