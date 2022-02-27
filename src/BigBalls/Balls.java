package BigBalls;


public class Balls {
    private String color;
    private int weight;
    private String type;
    private double cost;
    private int rad;
    private static int maxCapacity=8;


    public Balls(){}


        public String getColor () {
            return color;
        }

        public void setColor (String color){
            this.color = color;
        }

        public int getWeight () {
            return weight;
        }

        public void setWeight ( int weight){
            this.weight = weight;
        }

        public String getType () {
            return type;
        }

        public void setType (String type){
            this.type = type;
        }

        public double getCost () {
            return cost;
        }

        public void setCost ( double cost){
            this.cost = cost;
        }

        public int getRad () {
            return rad;
        }

        public void setRad ( int rad){
            this.rad = rad;
        }
}
