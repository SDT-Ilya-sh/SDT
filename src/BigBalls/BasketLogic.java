package BigBalls;
import static BigBalls.Basket.balls;

public class BasketLogic {


private static int count;

    public static void main(String[] args) throws Exception {

        System.out.println(balls.size());
        for (int i=0;i<balls.size();i++) {
            if (balls.get(i).getColor().equals("blue")) {


                count += 1;
            }

        }
        System.out.println(count);

            if (balls.contains(null)) {
                    throw new Exception("You can`t add Null in Basket");

            }
            if (balls.size() == Basket.getMaxCapacity()) {
                System.out.println("Basket is full");
            }
            if (balls.size() > Basket.getMaxCapacity()) {
                    throw new Exception("You can`t add Balls in Full Basket");
            }


        }
        public static int getCount() {
        return count;
    }
}



