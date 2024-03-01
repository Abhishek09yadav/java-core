public class DO1P01 {


    private String book_title;
    private double book_price;

    public DO1P01(String title, double price) {
        book_title = title;
        book_price = price;
    }

    public String getBookTitle() {
        return book_title;
    }

    public double getBook_price() {
        return book_price;
    }

    public void setBookTitle(java.lang.String book_title) {
        this.book_title = book_title;
    }

    public void setBook_price(float book_price) {
        this.book_price = book_price;
    }

    public static DO1P01 createBooks(String title, double price) {
        DO1P01 book = new DO1P01();
        book.setBookTitle(title);
        book.setBook_price(price);
        return book;
    }

    public static void showBook(DO1P01 book) {
        System.out.println("Book title " + book.getBookTitle() + "Book price" + book.getBook_price());
    }

    public class Main {
        public static void main(String[] args) {
            DO1P01 book = DO1P01.createBooks("Java Programming", 500.00);
            DO1P01.showBook(book);
        }
    }

}


