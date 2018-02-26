import com.krashdev.storage.BookStorage;

public class Runner {
    public static void main(String[] args) {
        BookStorage storage = new BookStorage();
        storage.getBooks().forEach(System.out::println);
    }
}
