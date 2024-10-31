
public class BookInfo {
    private String authorName;
    private String bookName;
    private String bookInfo;

    
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
    
    public String getBookInfo() {
        return bookInfo;
    }

    public void setBookInfo(String bookInfo) {
        this.bookInfo = bookInfo;
    }
    
}

