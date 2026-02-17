/**
 * OOPSBannerApp UC3 – OOPS Banner Display Application
 *
 * Refactored version of UC2 that uses String.join() instead of
 * string concatenation with '+' to improve efficiency and readability.
 *
 * @author Ankush
 * @version 3.0
 */

public class OOPSBannerApp3 {

    public static void main(String[] args) {
        System.out.println(String.join("  ", "*****", "*****", "*******", "*******"));
        System.out.println(String.join("  ", "*   *", "*   *", "*     *",  "****"));
        System.out.println(String.join("  ", "*   *", "*   *", "*     *",  "** "));
        System.out.println(String.join("  ", "*   *", "*   *", "*******",  "*******"));
        System.out.println(String.join("  ", "*   *", "*   *", "*     ",   "     **"));
        System.out.println(String.join("  ", "*   *", "*   *", "*     ",   "    ****"));
        System.out.println(String.join("  ", "*****", "*****", "*     ",   "********"));
    }
}