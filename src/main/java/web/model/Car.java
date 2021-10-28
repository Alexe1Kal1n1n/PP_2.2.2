package web.model;

public class Car {
    private String modelCar;
    private int series;
    private int age;

    public Car(String modelCar, int series, int age) {
        this.modelCar = modelCar;
        this.series = series;
        this.age = age;
    }

    public String getModelCar() {
        return modelCar;
    }

    public void setModelCar(String modelCar) {
        this.modelCar = modelCar;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
