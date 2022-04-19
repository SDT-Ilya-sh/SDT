package lesson24.src;

import java.util.HashMap;

public class CustomerStorage {
    private HashMap<String, Customer> storage;

    public CustomerStorage() {
        storage = new HashMap<>();
    }

    public void addCustomer(String data) {
        String[] components = data.split("\\s+");
        String name = components[0] + " " + components[1];
        if (components[3].indexOf("+") == 0 && components[3].length() == 12 && components[2]
                .matches("([a-zA-Z0-9_.+-]+@[a-zA-Z0-9-]+\\.[a-zA-Z0-9-.]+)")) {
            storage.put(name, new Customer(name, components[3], components[2]));
        } else {
            System.out.println("Введите корректный формат персональных данных!");
        }
    }

    public void listCustomers() {
        if (storage.isEmpty()) {
            System.out.println("Список пуст.");
        }
        storage.values().forEach(System.out::println);
    }

    public void removeCustomer(String name) {
        if (storage.containsKey(name)) {
            storage.remove(name);
        } else {
            System.out.println("Данное имя в списке отсутствует. Проверьте правильность введенных данных.");
        }
    }

    public int getCount() {
        return storage.size();
    }
}