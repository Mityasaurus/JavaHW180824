public class StringSiteFinder {
    public static void main(String[] args) {
        String str = """
                The String class represents character strings.
                All string literals in Java programs, such as \\"abc\\",
                are implemented as instances of this class.
                HTTPS://DOCS.ORACLE.COM/JAVASE/8/DOCS/API/JAVA/LANG/STRING.HTML
                Read more about class String at the Oracle website...
                HTTPS://DOCS.ORACLE.COM/EN/JAVA/INDEX.HTML";
                """;
        str = str.toLowerCase();
        String startFind = "https://";
        String endFind = ".html";
        int start = 0;
        int end;
        while((start = str.indexOf(startFind, start)) != -1 && (end = str.indexOf(endFind, start)) != -1){
            System.out.println(str.substring(start, end + endFind.length()));
            start = end + 1;
        }
    }
}
