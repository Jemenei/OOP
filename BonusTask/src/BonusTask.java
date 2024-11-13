import java.util.HashMap;
import java.util.Map;


class EnchantedBook {
    private String title;
    private boolean isAvailable;
    private int requiredLevel;


    public EnchantedBook(String title, int requiredLevel) {
        this.title = title;
        this.isAvailable = true;
        this.requiredLevel = requiredLevel;
    }

    public String getTitle() {
        return title;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public int getRequiredLevel() {
        return requiredLevel;
    }
}


class Wizard {
    private String name;
    private int magicLevel;

    public Wizard(String name, int magicLevel) {
        this.name = name;
        this.magicLevel = magicLevel;
    }

    public String getName() {
        return name;
    }

    public int getMagicLevel() {
        return magicLevel;
    }
}


class EnchantedLibrary {
    private Map<String, EnchantedBook> books;
    private Map<String, String> borrowedBooks;

    public EnchantedLibrary() {
        books = new HashMap<>();
        borrowedBooks = new HashMap<>();
    }

    public void addBook(EnchantedBook book) {
        books.put(book.getTitle(), book);
    }

    public String borrowBook(String bookTitle, Wizard wizard) {
        EnchantedBook book = books.get(bookTitle);
        if (book == null) {
            return "Книга не найдена!";
        } else if (!book.isAvailable()) {
            return "Книга уже взята: " + borrowedBooks.get(bookTitle);
        } else if (wizard.getMagicLevel() < book.getRequiredLevel()) {
            return "У вас недостаточно уровня магии для взятия этой книги.";
        } else {
            book.setAvailable(false);
            borrowedBooks.put(bookTitle, wizard.getName());
            return "Книга выдана: " + wizard.getName();
        }
    }

    public String returnBook(String bookTitle) {
        EnchantedBook book = books.get(bookTitle);
        if (book == null) {
            return "Книга не найдена!";
        } else if (book.isAvailable()) {
            return "Эта книга уже в библиотеке!";
        } else {
            book.setAvailable(true);
            borrowedBooks.remove(bookTitle);
            return "Книга возвращена.";
        }
    }

    public String checkBookStatus(String bookTitle) {
        EnchantedBook book = books.get(bookTitle);
        if (book == null) {
            return "Книга не найдена!";
        } else if (book.isAvailable()) {
            return "Книга доступна.";
        } else {
            return "Книга взята: " + borrowedBooks.get(bookTitle);
        }
    }
}


public class BonusTask {
    public static void main(String[] args) {
        EnchantedLibrary library = new EnchantedLibrary();


        library.addBook(new EnchantedBook("Mastering Spells", 1));
        library.addBook(new EnchantedBook("Mystery of Future", 2));


        Wizard wizard1 = new Wizard("Ellise", 1);
        System.out.println(library.borrowBook("Mastering Spells", wizard1));
        System.out.println(library.checkBookStatus("Mastering Spells"));


        Wizard wizard2 = new Wizard("Luna", 1);
        System.out.println(library.borrowBook("Mystery of Future", wizard2));


        System.out.println(library.returnBook("Mastering Spells"));
        System.out.println(library.checkBookStatus("Mastering Spells"));


        System.out.println(library.checkBookStatus("Non-existing Book"));
    }
}
