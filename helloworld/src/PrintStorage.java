public class PrintStorage {
    public static void main(String[] args) {
        System.out.println(storage("abced"));
    }

    private static int storage(String s) {
        return s.length()*2;
    }
}
