import java.util.ArrayList;

public class LibrararyModel {
    private ArrayList<BookInfo> userList = new ArrayList<BookInfo>();
    
    
    public LibrararyModel(){
        userList.add(new BookInfo("Alex","Book1"));
        userList.add(new BookInfo("Zack","Book2"));
        userList.add(new BookInfo("Max","Book3"));
        userList.add(new BookInfo("Zane","Book4"));
        userList.add(new BookInfo("josh","Book5"));
        userList.add(new BookInfo("Sam","Book6"));
    }
    
    
   
    
    public void addBook(String authorName, String bookName){
        this.userList.add(new BookInfo(authorName, bookName));
    }
    
    public void removedBook(String authorName, String bookName){
        this.userList.remove(new BookInfo(authorName, bookName));
    }
    
    
    public boolean removeBook(String authorName, String bookName) {
    for (BookInfo book : userList) {
        if (book.getAuthorName().equals(authorName) && book.getBookName().equals(bookName)) {
            this.userList.remove(book); 
            return true; 
        }
    }
    return false; 
}
    
    
    public boolean checkLogin(String authorName, String bookName){
        for (BookInfo i: userList){
            if (i.getAuthorName().equals(authorName)){
               if (i.getBookName().equals(bookName)){
                   return true;
               }
               else{
                   return false;
               }
            }
        }
        return false;
    }
    
}
