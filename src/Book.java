public class Book {

        String title;
        int pages;

        public void displayBook () {
            System.out.println("The book" + title + "has " + pages + " pages");
    }

    public static void main(String[] args){
        Book b1 = new Book();
        b1.displayBook();
    }
}
