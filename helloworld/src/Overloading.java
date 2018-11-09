class Tree {
    private int height;
    private static int numClass;

    Tree() {
        System.out.println("Planting a seeding");
        height = 0;
        numClass++;
        System.out.println("This is " + numClass + "th class");
    }

    Tree(int iniHeight) {
        height = iniHeight;
        System.out.println("Creating new tree that is " +
                height + " feet tall");
        numClass++;
        System.out.println("This is " + numClass + "th class");
    }

    void info() {
        System.out.println("Tree is " + height + " feet tall");
    }

    void info(String s) {
        System.out.println(s + ": Tree is " + height + " feet tall");
    }
}


public class Overloading {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            Tree t = new Tree(i);
            t.info();
            t.info("overloaded method");

        }

        Tree t = new Tree();
    }
}
