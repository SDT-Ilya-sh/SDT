package lesson19;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        ArrayFilling newArray = new ArrayFilling();
        newArray.fillArray(list);
        NumberSearch searcher = new NumberSearch();
        searcher.searchMyNumber(list);

    }
}
