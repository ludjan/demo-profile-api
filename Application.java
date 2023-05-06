public class Application {
    public static void main(String [] args) {
        if (arrayContains(args, "test")) {
            System.out.println("Test argument detected");
            testAll();
        } else {
            System.out.println("Running normally");
        }
    }

    static boolean arrayContains(String [] array, String element) {
        for (String a : array) {
            if(a.equals(element)) return true;
        }
        return false;
    }

    static void testAll() {
        testCapitalize();
        assertionError();
    }

    static void testCapitalize() {
        assertEquals(capitalize("Hello world!"), "HELLO WORLD!", "Capitalize");
    }

    static void assertionError() {
        assertEquals(true, false, "True equals false");
    }

    static void assertEquals(Object first, Object second, String identifier) {
        if (!first.equals(second)) {
            System.err.println("AssertionError for '" + identifier + "'. Expected " + first + " to be equal to " + second);
            System.err.println("Program failed with assertion error");
            System.exit(1);
        }
    }

    static String capitalize(String s) {
        return s.toUpperCase();
    }
}
