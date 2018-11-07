public class SimpleConstructor {
    public static void main(String[] args) {
        Rock r;
        for (int i = 0; i < 10; i++) {
            r = new Rock();
            System.out.println(r.s);
//            System.out.println(r.s1);
        }

    }
}

class Rock {
    Rock() {
        System.out.println("Rock");
    }

    String s = "sss";
//    String s1 = new String("111");
}