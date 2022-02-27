package lesson13;

public class ReversedArray {
        public static void reverseArray(String string){
            String[] stringArray = string.split("\\s+");
            for (int i = stringArray.length-1; i >= 0; i--){
                System.out.println(stringArray[i]);
            }


        }
}
