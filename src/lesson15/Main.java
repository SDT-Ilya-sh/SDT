package lesson15;

public class Main {
    public static void main(String[] args) {
        String[][] array = {{"X"," "," "," "," "," ","X"},{" ","X"," "," "," ","X"," "},{" "," ","X"," ","X"," "," "},
                {" "," "," ","X"," "," "," ",},{" "," ","X"," ","X"," "," "},{" ","X"," "," "," ","X"," "},
                {"X"," "," "," "," "," ","X"}};
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length;j++){
                System.out.print(array[i][j]);
            }
            System.out.print("\n");
        }
    }
}
