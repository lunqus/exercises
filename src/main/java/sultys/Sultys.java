package sultys;

public class Sultys {


    /**
     * Grazins TRUE tik tada kai:
     * <ul>
     * <li>Jeigu issipilsto sultys be likucio (nelieka nepilnai pripildytos
     * talpos)</li>
     * <li>Jeigu ispilstytu talpu kiekis yra lyginis, kai parametras
     * reikalingasTikLyginis = true</li>
     * <li>Jeigu ispilstytu talpu kiekis yra lyginis arba nelyginis, kai
     * reikalingasTikLyginis = false</li>
     * </ul>
     */

    boolean arNeraLikucio(int sulciuKiekisViso, int talposTuris, boolean reikalingasTikLyginis) {


        boolean arNeraLikucio = sulciuKiekisViso % talposTuris == 0;
        boolean arLyginis = ((double) sulciuKiekisViso / talposTuris) % 2 == 0;

        return arNeraLikucio && (!reikalingasTikLyginis || arLyginis);
    }


}
