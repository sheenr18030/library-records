
public class MainDriver {
    public static void main(String[] args){
        LibrararyModel m = new LibrararyModel();
        LibraryMenu v = new LibraryMenu();
        LibraryController c = new LibraryController(m,v);
        
        c.start();
    }
}
