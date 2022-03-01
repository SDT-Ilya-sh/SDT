package lesson16;

import java.util.ArrayList;
import java.util.Scanner;

public class TaskScanner {

    private final Scanner scanner = new Scanner(System.in);

    public void listEdit(ArrayList<String> list) {
        while (true) {
            System.out.println("Введите команду:");
            String input = scanner.nextLine();
            if (input.contains("ADD")) {
                list.add(input.replace("ADD ", ""));
            } else if (input.contains("DELETE")) {
                list.remove(Integer.parseInt(ExtractingEditNumber.extractNumber(input)) - 1);
            } else if (input.contains("EDIT")) {
                list.remove(Integer.parseInt(ExtractingEditNumber.extractNumber(input)) - 1);
                list.add(Integer.parseInt(ExtractingEditNumber.extractNumber(input)) - 1,
                        input.replaceAll("(EDIT)+(\\s+)+[0-9]+", "").trim());
            } else if (input.contains("LIST")) {
                printArray(list);
            } else if (input.contains("EXIT")) {
                break;
            }
        }
    }

    private void printArray(ArrayList<String> list) {
        int c = 1;
        for (String s : list) {
            System.out.println("Дело номер " + c + " - " + s);
            c++;
        }
    }
}
