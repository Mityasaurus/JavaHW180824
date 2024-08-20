public class StringFinder {
    public static void main(String[] args) {
        String str = """
                The String class represents character strings.
                All string literals in Java programs, such as \\"abc\\",
                are implemented as instances of this class.
                HTTPS://DOCS.ORACLE.COM/JAVASE/8/DOCS/API/JAVA/LANG/STRING.HTML
                Read more about class String at the Oracle website...
                HTTPS://DOCS.ORACLE.COM/EN/JAVA/INDEX.HTML";
                """;

        String wordToFind = "String";

        System.out.println("Case-sensitive search:");

        findOccurrencesIndex(str, wordToFind, false);

        System.out.println("Case-insensitive search:");

        findOccurrencesIndex(str, wordToFind, true);
    }

    public static void findOccurrencesIndex(String str, String searchString, boolean ignoreCase){
        for (int i = 0; i < str.length() - searchString.length(); i++) {
            if(str.regionMatches(ignoreCase, i, searchString, 0, searchString.length())){
                System.out.println(i);
            }
        }
    }
}
