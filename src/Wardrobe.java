public class Wardrobe extends Furniture {
    private int numberOfDoors;
    private String openingType;
    public Wardrobe(String material, String color, double weight, double price, String style,int numberOfDoors,String openingType){
        super(material, color, weight, price, style);
        this.numberOfDoors=numberOfDoors;
        this.openingType=openingType;
    }
    public int getNumberOfDoors(){
        return this.numberOfDoors=numberOfDoors;
    }
    public String getOpeningType(){
        return this.openingType;
    }
    public void setNumberOfDoors(int numberOfDoors){
        this.numberOfDoors=numberOfDoors;
    }
    public String toString() {
        return "Wardrobe{" +
                " material='" + super.getMaterial() + '\'' +
                ", weight=" + super.getWeight() +
                ", price=" + super.getPrice() +
                ", style='" + super.getStyle() + '\'' +
                ",numberOfDoors='" + numberOfDoors + '\'' +
                ", openingType=" + openingType +
                '}';
    }
}
