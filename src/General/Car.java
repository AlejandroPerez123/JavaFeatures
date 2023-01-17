package General;

public class Car  implements Cloneable {
    private String color;
    private String maker;
    private Integer year;

    public Car(String color, String maker, Integer year) {
        this.color = color;
        this.maker = maker;
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMaker() {
        return maker;
    }

    public void setMaker(String maker) {
        this.maker = maker;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }


    @Override
    public boolean equals(Object obj){
        Car car = (Car) obj;
        if(car == null){
            return false;
        }if(car == this){
            return true;
        }return this.color.equalsIgnoreCase(car.getColor()) && this.getMaker().equalsIgnoreCase(car.getMaker())
                && this.getYear().equals(car.getYear());

    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", maker='" + maker + '\'' +
                ", year=" + year +
                '}';
    }

    @Override
    public Object clone() throws CloneNotSupportedException
    {
        return super.clone();
    }


}
