public class Book {

    private String bookname;
    private String isbn;
    private String author;
    private String publisher;

    public Book(){
        this.bookname = "null";
        this.isbn = "null";
        this.author = "null";
        this.publisher= "null";
    }
    public Book(String bookname, String isbn, String author, String publisher) {
        this.bookname = bookname;
        this.isbn = isbn;
        this.author = author;
        this.publisher = publisher;
    }

    public void setBookname(String bookname){
        this.bookname = bookname;
    }
    public void setIsbn(String isbn){
        this.isbn = isbn;
    }
    public void setAuthor(String author){
        this.author = author;
    }
    public void setPublisher(String publisher){
        this.publisher = publisher;
    }
    public String getBookname(){
        return bookname;
    }
    public String getIsbn(){
        return isbn;
    }
    public String getAuthor(){
        return author;
    }
    public String getPublisher(){
        return publisher;
    }

    public void getBookInfo(){
        System.out.println("Book Name = "+bookname+"\n"+"Book ISBN Number: "+isbn+"\n"+"Book's Author: "+author+"\n"+"Book's Publisher: "+publisher);
    }
}
