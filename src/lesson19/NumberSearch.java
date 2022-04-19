package lesson19;

import java.util.*;

public class NumberSearch {
    public void searchMyNumber(ArrayList<String> list) {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            String numberToSearch = scanner.nextLine();
            SearchLogic newSearch = new SearchLogic();
            if (numberToSearch.contains("EXIT")) {
                break;
            } else {
                newSearch.startSearch(list, numberToSearch);
            }
        }
    }
}
