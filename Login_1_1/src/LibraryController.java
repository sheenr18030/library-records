
public class LibraryController {
    
    private LibrararyModel m;
    private LibraryMenu v;
    
    public LibraryController(LibrararyModel m, LibraryMenu v) {
        this.m = m;
        this.v = v;
    }
    
    public void start(){
        v.displayFrame();
    }
    
    public String validateAuthor(String authorName, String bookName){
        boolean b = m.checkLogin(authorName, bookName);
        if(b){
            return "Books from "+authorName+":"+bookName;
        }
          return "Incorrect Author name or book name."; 
        }
    
    public void addBook(String authorName, String bookName){
            m.addBook(authorName, bookName);
    }
    
    public void removedBook(String authorName, String bookName){
        boolean b = m.removeBook(authorName, bookName);
        if(b){
            m.removeBook(authorName, bookName);
        }
        else{
            System.out.println("Book does not exist!");
        }
    }
    
}



    
    

