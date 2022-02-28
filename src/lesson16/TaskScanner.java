package lesson16;

import java.util.ArrayList;
import java.util.Scanner;

public class TaskScanner {

    static Scanner scanner = new Scanner(System.in);
    static ArrayList<String> toDoList = new ArrayList();


    public static void listEdit() {
        toDoList.add("Помыться.");
        toDoList.add("Попить чай.");
        toDoList.add("Позаниматься спортом.");
        toDoList.add("Писать прогу.");
        System.out.println("Введите команду:");
        String input = scanner.nextLine();
        if (input.contains("ADD")) {
            toDoList.add(input.replace("ADD ", ""));
        }
        else if(input.contains("DELETE")){
            toDoList.remove(Integer.parseInt(input.replaceAll("[^0-9]",""))-1);
        }
        else if(input.contains("EDIT")){
            toDoList.remove(Integer.parseInt(input.replaceAll("[0-9].+?",""))-1);
            toDoList.add(Integer.parseInt(input.replaceAll("[0-9].+?",""))-1,
                    input.replaceAll("(EDIT)+(\\s+)+[0-9].+?","").trim());
        }
        else if(input.contains("LIST")){
            printArray(toDoList);
        }
    }

    public static void printArray(ArrayList<String> arrayList) {
        int c = 1;
        for (String s : arrayList) {
            System.out.println("Дело номер " + c + " - " + s);
            c++;
        }


    }
}
