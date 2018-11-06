package hello;

public class Book {
    private String author;
    private String category;
    private float price;
    private String title;
    private String isbn;

    public Book(){

    }

    public String getAuthor()
    {
        return this.author;
    }

    public String getCategory()
    {
        return this.category;
    }

    public String getTitle()
    {
        return this.title;
    }

    public float getPrice()
    {
        return this.price;
    }

    public String getIsbn()
    {
        return this.isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
//        return "Book{"+
//                "author='"+author+'\''+
//                ", category='"+category+ '\''+
//                ", price="+price+
//                ", title='"+title+'\''+
//                '}';

        return "book[{"+
                this +
                "}";
    }
}
