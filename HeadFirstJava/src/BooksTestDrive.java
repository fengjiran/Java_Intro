public class BooksTestDrive {
    public static void main(String[] args) {
        Books[] myBooks = new Books[3];

        int x = 0;
        while (x < myBooks.length)
            myBooks[x++] = new Books();

        myBooks[0].title = "The Graphs of Java";
        myBooks[1].title = "The Java Gatsby";
        myBooks[2].title = "The Java Cookbook";

        myBooks[0].author = "bob";
        myBooks[1].author = "sue";
        myBooks[2].author = "ian";

        x = 0;
        while (x < myBooks.length) {
            System.out.println(myBooks[x].title);
            System.out.println(" by ");
            System.out.println(myBooks[x].author);
            x++;
        }
    }
}

class Books {
    String title;
    String author;
}