package ByteConverter;

public class ByteConverter {

    private static final long _1024 = 1024L;

    private static final long B = 1;
    private static final long KB = _1024;
    private static final long MB = KB * _1024;
    private static final long GB = MB * _1024;
    private static final long TB = GB * _1024;

    public static void main(String... strings) {

        ByteConverter bc = new ByteConverter();

        System.out.println(bc.convertToHumanReadable(TB));

        System.out.println(bc.convertToHumanReadable((long) (KB * 1.96)));

        System.out.println(bc.convertToHumanReadable((long) (MB * 1.96)));

    }

    /**
     * 0 bytes ...; 1kb ... ; 1Mb... 1Gb ... ; 1Tb and more;
     * <p>
     * Example: 1,3Gb // <- Acceptable 893Kb // <- Acceptable 1Gb and 312Mb and
     * ...// <- Not acceptable
     * <p>
     * <p>
     * <p>
     * http://byteconvert.org/
     */
    public String convertToHumanReadable(long sizeInBytes) {

        if (sizeInBytes < KB) {
            return "" + sizeInBytes + " b";
        }

        if (sizeInBytes < MB) {
            return "" + sizeInBytes / KB + " Kb";
        }

        if (sizeInBytes < GB) {
            return "" + cutDigigts((1.0 * sizeInBytes / MB)) + " Mb";
        }

        if (sizeInBytes < TB) {
            return "" + cutDigigts((1.0 * sizeInBytes / GB)) + " Gb";
        }

        return "" + cutDigigts((1.0 * sizeInBytes / TB)) + " Tb";
    }

    /**
     * 1.96... -> 1.9
     * 1.0 -> 1
     */

    private String cutDigigts(double d) {

        d *= 10;
        long lng = (long) d;

        if (lng % 10 == 0) { // X.0
            return "" + lng / 10;
        }

        return "" + lng / 10.0;

    }


}
