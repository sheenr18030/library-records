
public class BookInfo {
    private String authorName;
    private String bookName;
    
    public BookInfo(String authorName, String bookName){
       this.authorName = authorName;
       this.bookName = bookName;
               
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }
    
    
}

