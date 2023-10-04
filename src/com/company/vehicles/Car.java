//Написать класс Автомобиль.

import java.util.Arrays;

public class Car {
    private String brand; //поле типа String, хранящее марку автомобиля,
    private Model[] models; // масив моделей

    //Конструктор:
    public Car(String brand) {
        setBrand(brand);
        System.out.println(this.getBrand());
    }

    //метод для записи марки автомобиля //метод для модификации марки автомобиля
    public void setBrand(String brand) {
        this.brand = brand;
    }

    //метод для получения марки автомобиля
    public String getBrand() {
        return "Марка транспортного средства: " + this.brand + "\n";
    }
    /*Метод для модификации значения названия модели*/

    public void setModelName(String modelName, int index) {
        models[index].modelName = modelName;
    }

    /*метод, возвращающий массив названий всех моделей*/
    public String[] getModelNames() {
        String[] result = new String[models.length];
        for (int i = 0; i < models.length; i = i + 1) {
            result[i] = models[i].modelName;
        }
        return result;
    }

    /*метод для получения значения цены модели по её названию*/
    public double getPrice(String modelName) {
        double price = 0;
        for (Model model : this.models) {
            //Лучшее решение для сравнения объектов — метод equals().
            if (modelName.equals(model.getModelName())) {
                return price = model.getPrice();
            }
        }
        return price;
    }

    /*метод для модификации значения цены модели по её названию*/
    public void editPrice(String modelName, int newPrice) {
        for (Model model : this.models) {
            if (modelName.equals(model.getModelName())) {
                model.setPrice(newPrice);
            }
        }
    }

    /*метод, возвращающий массив значений цен моделей*/
    public double[] getPrice() {
        double[] prices = new double[this.models.length];
        for (int i = 0; i < this.models.length; i++) {
            prices[i] = this.models[i].getPrice();
        }
        return prices;
    }

    /*метод добавления названия модели и её цены (путем создания нового массива
            Моделей), использовать метод Arrays.copyOf()*/
    public void addModelAndPrice(String newModelName, double newPrice) {
        models = Arrays.copyOf(this.models, this.models.length + 1);
        models[models.length - 1] = new Model(newModelName, newPrice);
    }

    /*метод удаления модели с заданным именем и её цены, использовать методы
    System.arraycopy, Arrays.copyOf()*/
    public void deleteModel(String modelName) {
        int index = 0;
        System.arraycopy(models, index + 1, models, index, models.length - index - 1);
        models = Arrays.copyOf(models, models.length - 1);
    }

    /*метод для получения размера массива Моделей*/
    public int getSizeOfModels() {
        return models.length;
    }

    /*Конструктор класса должен принимать в качестве параметров значение Марки
    автомобиля и размер массива Моделей*/
    public Car(String brandName, int size) {
        this.brand = brandName;
        this.models = new Model[size];
        for (int i = 0; i < size; i++) {
            models[i] = new Model("Concept" + i, 100);
        }

    }
    /* Внутренний класс Модель, имеющий поля название модели и её цену, а также
    конструктор (класс Автомобиль хранит массив Моделей)*/
    public class Model {
        private String modelName; // название модели
        private double price; // цена автомобиля

        // конструктор для моделей
        public Model(String modelName, double price) {
            this.modelName = modelName;
            this.price = price;
        }

        //метод получения названия модели
        public String getModelName() {
            return modelName;
        }

        //метод изменения названия модели
        public void setModelName(String name) {
            this.modelName = name;
        }

        //метод получения цены
        public double getPrice() {
            return price;
        }

        //метод изменения цены
        public void setPrice(int price) {
            this.price = price;
        }
    }
}
