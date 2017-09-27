/*
 * The following code needs a lot of TLC. So give it some!
 *
 * 1. Fix all checkstyle errors
 * 2. Determine what it does (it's going to be tough before you finish #1)
 * 3. Improve the name of the methods and variables
 * 4. Add comments and Javadoc comments where needed
 * 5. Remove unnecessary comments as appropriate
 */
/**
 * this is dumb.
 */
public class ReclamationProject {
    /**
     * do stuff.
     * @param a unused
     * @param b unused
     * @return string
     */
    public static String doit(final String a, final String b) {
        String newa = "";
        String newb = "";
        if (a.length() > b.length()) {
            String c = a;
            newa = b; newb = c;
            }
        String r = "";
        /*
         * For loop with i
         */
        for (int i = 0; i < newa.length(); i++) {
            for (int j = newa.length() - i; j > 0; j--) {
                for (int k = 0; k < newb.length() - j; k++) {
                    if (newa.regionMatches(i, newb, k, j) && j > r.length()) {
                        newa.substring(i, i + j);
                    }
                }
            } // Ah yeah
        }
        return r;
    }
}
