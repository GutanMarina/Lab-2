public class Table extends Furniture {
    private String shape;
    private int numberOfLegs;

    public Table(String material, String color,double weight,double price,String style, String shape, int numberOfLegs){
        super(material,color,weight,price,style);
        this.shape=shape;
        this.numberOfLegs=numberOfLegs;
    }
    public String getShape(){
        return this.shape;
    }
    public int getNumberOfLegs(){
        return this.numberOfLegs;
    }
    public void setShape(String shape){
        this.shape=shape;
    }
    public void setNumberOLegs(int numberOfLegs){
        this.numberOfLegs=numberOfLegs;
    }
    public String toString() {
        return "Table{" +
                " material='" + super.getMaterial() + '\'' +
                ", weight=" + super.getWeight() +
                ", price=" + super.getPrice() +
                ", style='" + super.getStyle() + '\'' +
                ",shape='" + shape + '\'' +
                ", numberOfLegs=" + numberOfLegs +
                '}';
    }
}

