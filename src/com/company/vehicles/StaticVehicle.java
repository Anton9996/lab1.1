package com.company.vehicles;
import java.util.Arrays;
public class StatikVehicles {
    //Метод, возвращающий среднее арифметическое цен моделей
    public static double arithmeticMeanOfModelPrices(Vehicle vehicle)
    {
        double[] vehiclePrices = vehicle.getPrices();
        double sum = 0;
        for (double v : vehiclePrices) {
            sum += v;
        }
        return sum/vehiclePrices.length;
    }

    //Метод, обеспечивающий вывод на экран всех моделей заданного ТС
    public static void printAllModels(Vehicle vehicle)
    {
        System.out.println(Arrays.toString(vehicle.getModelNames()));
    }

    //Метод, обеспечивающий вывод на экран всех цен моделей заданного ТС
    public static void printAllPrices(Vehicle vehicle)
    {
        System.out.println(Arrays.toString(vehicle.getPrices()));
    }
}

}
