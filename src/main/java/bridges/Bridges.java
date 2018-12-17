package bridges;

public class Bridges {


    /**
     * Parasyt funkcija kuri nustatytu ar yra kelias apskritai?
     */
    public boolean getWay(boolean p1, boolean p2, boolean p3, boolean p4, boolean p5, boolean p6) {

        boolean w1 = p1 && p2;
        boolean w2 = p4 && p5;
        boolean w3 = p1 && p3 && p5;
        boolean w4 = p4 && p3 && p2;
        boolean w5 = p4 && p6 && p2;

        return w1 || w2 || w3 || w4 || w5;
    }
}
