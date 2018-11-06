package hello;

public class Store {
    private Book book = new Book();
    private Book b = new Book();

    public Store(){
        book.setAuthor("Nigel Reese");
        book.setCategory("reference");
        book.setPrice(9.95f);
        book.setTitle("Sayings of the Century");

        //Book b = new Book();
        b.setAuthor("Herman Melville");
        b.setCategory("fiction");
        b.setIsbn("0-553-21311-3");
        b.setPrice(8.99f);
        b.setTitle("Moby Dick");
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public Book getBook()
    {
        return this.book;
    }

    @Override
    public String toString() {
//        Book a = new Book();
//        a.setAuthor("Nigel Reese");
//        a.setCategory("reference");
//        a.setPrice(9.95f);
//        a.setTitle("Sayings of the Century");
//
//        Book b = new Book();
//        b.setAuthor("Herman Melville");
//        b.setCategory("fiction");
//        b.setIsbn("0-553-21311-3");
//        b.setPrice(8.99f);
//        b.setTitle("Moby Dick");

//        return "store{"+
//                "book[{"+
//                "author='"+book.getAuthor()+'\''+
//                ", category='"+book.getCategory()+ '\''+
//                ", price="+book.getPrice()+
//                ", title='"+book.getTitle()+'\''+
//                //'}';
//                "},{"+
//                "author='"+b.getAuthor()+'\''+
//                ", category='"+b.getCategory()+ '\''+
//                ", isbn='"+b.getIsbn()+ '\''+
//                ", price="+b.getPrice()+
//                ", title='"+b.getTitle()+'\''+
//                "}]}";

        return String.format("store{book[{%s},{%s}]}", book, b);
    }
}
