package lesson14;

public class HospitalTemperature {
    private static double summaryTemperature;
    private static double amount;
    private static int healthyPatientsCount;


    public static void patientCreation(int patientAmount) {
        Double[] patientTemperatures = new Double[patientAmount];
        for (int i = 0; i < patientTemperatures.length; i++) {
            patientTemperatures[i] = 32.00 + 8 * Math.random();
            System.out.print(patientTemperatures[i] + " ");
        }
        healthyPatientsCountCheck(patientTemperatures);
        averageTemperature(patientTemperatures);
    }

    public static void averageTemperature(Double[] array) {
        for (int i = 0; i <= array.length - 1; i++) {
            summaryTemperature += array[i];
            amount++;
        }
        System.out.println("Средняя температура по больнице: " + summaryTemperature / amount);
    }

    public static void healthyPatientsCountCheck(Double[] array) {
        for (int i = 0; i <= array.length - 1; i++)
            if (array[i] < 36.6) {
                healthyPatientsCount++;
            }
        System.out.println("\nКоличество здоровых пациентов:" + healthyPatientsCount);
    }
}
