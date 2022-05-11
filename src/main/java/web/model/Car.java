package web.model;

import java.util.Objects;

public class Car {
   private String model;
   private String color;
   private long series;

   public Car(String model, String color, long series) {
       this.model = model;
       this.color = color;
       this.series = series;
   }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public long getSeries() {
        return series;
    }

    public void setSeries(long series) {
        this.series = series;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return series == car.series && Objects.equals(model, car.model) && Objects.equals(color, car.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, color, series);
    }
}
