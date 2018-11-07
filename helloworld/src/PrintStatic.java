public class PrintStatic {
    public static void main(String[] args) {
//        Incrementable sf = new Incrementable();
//        sf.increment();
        Incrementable.increment();
        System.out.println(StaticTest.i++);
    }
}

class StaticTest {
    static int i = 47;
//    public static void increi(){i++;}

}

class Incrementable {
    public static void increment() {
        StaticTest.i++;
    }
}