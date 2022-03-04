package lesson19;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayFilling {
    public void fillArray(ArrayList<String> list) {
        String[] letters = {"C", "M", "T", "B", "A", "P", "O", "H", "E", "Y", "H", "K"};
        for (String numLetters : letters) {
            for (int j = 0; j < 10; j++) {
                for (int k = 1; k < 199; k++) {
                    String region = String.valueOf(k);
                    if (k < 10) {
                        region = "0" + region;
                    }
                    String number = String.format("%s%d%d%d%s%s%s", numLetters, j, j, j, numLetters, numLetters, region);
                    list.add(number);
                }

            }
        }
        Collections.sort(list);
    }
}
