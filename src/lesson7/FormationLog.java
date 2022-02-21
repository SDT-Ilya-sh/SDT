package lesson7;

public class FormationLog {
    private int contNumber = 1;
    private int boxNumber = 1;
    private int truckNumber = 1;

    Truck truckColumn = new Truck();
    Container container = new Container();
    Box box = new Box();


    public void Formation(int truckCapacity, int contCapacity, int boxAmount) {
        truckColumn.setTruckCapacity(truckCapacity);
        container.setContCapacity(contCapacity);
        box.setBoxAmount(boxAmount);
        container.setContAmount(box.getBoxAmount() / container.getContCapacity());
        newFormation();
    }


    public void newFormation() {
        for (int i = 0; i <= getTruckAmount(truckColumn, container); i++) {
            System.out.println("Грузовик номер " + truckNumber);
            truckNumber++;
            for (int j = 1; j <= truckColumn.getTruckCapacity(); j++) {
                System.out.println("  Контейнер номер " + contNumber);

                for (int k = 1; k <= container.getContCapacity(); k++) {
                    System.out.println("     Ящик номер " + boxNumber);
                    if (boxNumber == box.getBoxAmount()) {
                        return;
                    }
                    boxNumber++;
                }
                contNumber++;
            }
        }

    }


    public int getContAmount(Container container) {
        return (int) Math.ceil(container.getContAmount());

    }

    public int getTruckAmount(Truck truck, Container container) {
        int contAmount = (int) Math.ceil(container.getContAmount());
        return (int) Math.ceil(getContAmount(container) / truck.getTruckCapacity());
    }

}
