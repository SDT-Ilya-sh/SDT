package BigBalls;

import static BigBalls.Basket.balls;

public class Main {
    private static int count =0;
    public static void main(String[] args) throws Exception {
        Balls blue = new Balls();
            blue.setColor("blue");
                balls.add(blue);
        Balls black = new Balls();
            black.setColor("black");
                balls.add(black);
        Balls red = new Balls();
            red.setColor("red");
                balls.add(red);
        Balls blueFootballBall = new Balls();
            blueFootballBall.setType("Football");
                balls.add(blueFootballBall);
        Balls blackBasketBall = new Balls();
            blackBasketBall.setColor("black");
                balls.add(blackBasketBall);
        Balls redHeavyBall = new Balls();
            red.setWeight(1400);
                balls.add(redHeavyBall);
        Balls blueHighCostBall = new Balls();
            blueHighCostBall.setCost(1337.00);
                balls.add(blueHighCostBall);
        Balls blackWideBall = new Balls();
            blackWideBall.setRad(150);
                balls.add(blackWideBall);
        Balls redCheapBall = new Balls();
            redCheapBall.setCost(154.55);
                balls.add(redCheapBall);
        Balls redZhenyaBall = new Balls();
            redCheapBall.setCost(1488);
                balls.add(redZhenyaBall);

        for (Balls ball : balls) {
            if (ball.getColor() == null ){
                continue;
            }
            if (ball.getColor().equals("blue")){
                count += 1;
            }
        }

        if (balls.contains(null)){
            throw new Exception("You can`t add Null in Basket");
        }
        if (balls.size() == Basket.getMaxCapacity()) {
            System.out.println("Basket is full");
        }
        if (balls.size() > Basket.getMaxCapacity()) {
            throw new Exception("You can`t add Balls in Full Basket");
        }
        System.out.println("Количество синих мячей " + count);
        }
    }

