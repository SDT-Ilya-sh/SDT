package lesson7;

public class Formation {

    public void FormationCreation(int truckCapacity, int contCapacity, int boxAmount) {
        Truck truckColumn = new Truck();
        Container container = new Container();
        Box box = new Box();
        truckColumn.setTruckCapacity(truckCapacity);
        container.setContCapacity(contCapacity);
        box.setBoxAmount(boxAmount);
        container.setContAmount(box.getBoxAmount() / container.getContCapacity());
        int contAmount = (int) Math.ceil(container.getContAmount());
        int truckAmount = (int) Math.ceil(contAmount / truckColumn.getTruckCapacity());
        int contNumberInTruck = 1;
        int contNumber = 1;
        int boxNumberInContainer = 1;
        int boxNumber = 1;
        int truckNumber = 1;
        for (int i =0; i <= truckAmount; i++) {
            System.out.println("Грузовик номер " +truckNumber);
            truckNumber++;
            for (int j = 1; j <= truckColumn.getTruckCapacity(); j++) {
                System.out.println("  Контейнер номер " + contNumber);

                    for (int k = 1; k <= container.getContCapacity(); k++) {
                System.out.println("     Ящик номер " + boxNumber);
                if (boxNumber == box.getBoxAmount()){
                return;
                        }
                boxNumber++;
                boxNumberInContainer++;
            }

                contNumber++;
                contNumberInTruck++;

            }

             boxNumberInContainer = 1;
             contNumberInTruck = 1;

        }

    }

}


