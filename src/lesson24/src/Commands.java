package lesson24.src;

import java.util.Scanner;

public class Commands {
    private static final String addCommand = "add Василий Петров " +
            "vasily.petrov@gmail.com +79215637722";
    private static final String commandExamples = "\t" + addCommand + "\n" +
            "\tlist\n\tcount\n\tremove Василий Петров";
    private static final String commandError = "Wrong command! Available command examples: \n" +
            commandExamples;
    private static final String helpText = "Command examples:\n" + commandExamples;

    public static void startProgram() {
        Scanner scanner = new Scanner(System.in);
        CustomerStorage executor = new CustomerStorage();
        for (; ; ) {
            try {
                String command = scanner.nextLine();
                String[] tokens = command.split("\\s+", 2);
                switch (tokens[0]) {
                    case "add":
                        executor.addCustomer(tokens[1]);
                        break;
                    case "list":
                        executor.listCustomers();
                        break;
                    case "remove":
                        executor.removeCustomer(tokens[1]);
                        break;
                    case "count":
                        System.out.println("There are " + executor.getCount() + " customers");
                        break;
                    case "help":
                        System.out.println(helpText);
                        break;
                    case "exit":
                        System.exit(1);
                    default:
                        System.out.println(commandError);
                        break;
                }
            } catch (Exception ex) {
                System.out.println("Данные введены неверно!");
            }
        }
    }

}
