package karoliukai;

public class Karoliukai {

    public static final char EMPTY = '.';

    public static void main(String[] args) {

        char[][] c = {

                {EMPTY, 'X', 'X', EMPTY},
                {EMPTY, EMPTY, 'A', EMPTY},
                {'Q', EMPTY, 'Z', EMPTY},
                {'M', EMPTY, 'A', 'M'},
        };

        Karoliukai k = new Karoliukai();
        k.dataToConsole(c);
    }

    /**
     * "data" masyvo duomenys:
     *
     * <pre>
     *
     * 5x5:
     *
     * _0_00
     * 0_000
     * 0__0_
     * __0__
     * _00__
     *
     * </pre>
     *
     * pavertus vieną kartą pagal laikrodžio rodyklę:
     *
     * <pre>
     *
     * ___0_
     * __0_0
     * ___0_
     * 0__00
     * 00000
     *
     * </pre>
     *
     * karoliukai turi "sukristi" žemyn, bet jei buvo tarpų tarp karoliukų - jie
     * turi išlikti.
     *
     * @param data
     *            karoliuku pradinis išdėstymas
     * @param rotateCount
     *            apvertimų kiekis pagal laikrodžio rodyklę
     * @return paverstas "vaizdas"
     */


    public char[][] rotateClockwise(char[][] data, int rotateCount) {


        for (int i = 0; i < rotateCount; i++) {

            doGravity(data);

            data = rotateOneTime(data);

        }

        return data;

    }

    private char[][] rotateOneTime(char[][] data) {
        char[][] rotated = new char[data[0].length][data.length];

        for (int y = 0; y < data.length; y++) {
            for (int x = 0; x < data.length; x++) {
                rotated[x][data.length - 1 - y] = data[y][x];
            }
        }
        return rotated;
    }

    private void doGravity(char[][] data) {

        int gapToFall = 0;
        for (int row = 0; row < data.length; row++) {
            gapToFall = howFarItShouldFall(row, data);

            if (gapToFall > 0) {
                letItFall(row, data, gapToFall);
            }
        }

    }

    private int howFarItShouldFall(int row, char[][] data) {

        char[] rowArr = data[row];
        int gapToFall = 0;

        for (int i = rowArr.length - 1; i >= 0; i--) {

            if (rowArr[i] == EMPTY) {
                gapToFall++;
            } else {
                break;
            }
        }

        return gapToFall;
    }

    private void letItFall(int row, char[][] data, int gapToFall) {

        char[] rowArr = data[row];

        // perstumiam reiksmes i gala per gapToFall kieki elementu
        for (int i = rowArr.length - 1; i >= gapToFall; i--) {
            rowArr[i] = rowArr[i - gapToFall];
        }

        // uzpildom pradzia EMPTY simboliukais
        for (int i = 0; i < gapToFall; i++) {
            rowArr[i] = EMPTY;
        }
    }

    /**
     * Pagalbinis metodas duomenu isvedimui
     *
     * @param data
     */
    public void dataToConsole(char[][] data) {

        String line = "";
        for (int x = 0; x < data.length; x++) {
            line = "";
            for (int y = 0; y < data[0].length; y++) {
                line += data[x][y];
            }

            System.out.println(" " + line);
        }

    }


}
