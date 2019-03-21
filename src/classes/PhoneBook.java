package classes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhoneBook {
    Map<String, List<String>> book;

    public PhoneBook() {
        book = new HashMap<>();

    }

    public void add(String name, String number){
        List<String> numbers = new ArrayList<>();

        if (!book.containsKey(name)){
            numbers.add(number);
            book.put(name, numbers);
        } else {
            numbers = book.get(name);
            numbers.add(number);
            book.put(name, numbers);
        }
    }

    public void get(String name){
        List<String> numbers;
        numbers = book.get(name);
        System.out.println(name + ": ");
        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));
        }
    }
}
