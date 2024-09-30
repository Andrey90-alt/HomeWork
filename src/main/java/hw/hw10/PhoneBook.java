package hw.hw10;

import java.util.*;

public class PhoneBook {

   java.util.HashMap<String, ArrayList<String>> elements = new HashMap<>();

    public void add(String name, String phone) {
        ArrayList<String> phones = elements.get(name);
        if (phones != null) {
            phones.add(phone);
        } else {
            phones = new ArrayList<>();
            phones.add(phone);
            elements.put(name, phones);
        }
    }

    public String[] find(String lastName) {
        return elements.get(lastName).toArray(new String[elements.size()]);
    }

    public void containsPhoneNumber(String phoneNumber ) {
        Optional<String> val = elements.entrySet()
                .stream()
                .filter(i -> i.getValue().contains(phoneNumber))
                .map(HashMap.Entry::getKey)
                .findFirst();

        System.out.println(val.orElse("Номер не найден"));
    }

    public static void main(String[] args){

        PhoneBook phoneBook = new PhoneBook();

        phoneBook.add("A", "11111111111");
        phoneBook.add("B", "22222222222");
        phoneBook.add("C", "33333333333");
        phoneBook.add("A", "44444444444");
        phoneBook.add("A", "55555555555");

        System.out.println(Arrays.toString(phoneBook.find("A")));

        phoneBook.containsPhoneNumber("44444444444");




    }
}
