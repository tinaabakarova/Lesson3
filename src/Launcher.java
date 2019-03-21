import classes.PhoneBook;
import classes.UniqueWords;

public class Launcher {
    public static void main(String[] args) {
        UniqueWords uniqueWords = new UniqueWords("мама","папа", "я", "я", "счастливая", "семья", "мама", "мыла", "раму", "мама");
        uniqueWords.calculateUniqueWords();
        uniqueWords.printUniqueWords();

        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Nina", "123-456");
        phoneBook.add("Nina", "123-46556");
        phoneBook.add("Tina", "122-363456");
        phoneBook.get("Nina");
        phoneBook.get("Tina");
    }
}
