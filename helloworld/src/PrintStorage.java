public class PrintStorage {
    public static void main(String[] args) {
        String s = "avcd";
        System.out.println(storage(s));
    }

    private static int storage(String s) {
        return s.length() * 2;
    }
}
