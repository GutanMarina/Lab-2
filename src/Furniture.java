public class Furniture {
    private String material;
    private String color;
    private double weight;// in kg;
    private double price;// in Eur;
    private String style;

    public Furniture(String material, String color, double weight, double price, String style) {
        this.material=material;
        this.color=color;
        this.weight=weight;
        this.price=price;
        this.style=style;
    }

    public String getMaterial(){
        return this.material;
    }
    public String getColor(){
        return this.color;
    }
    public double getWeight(){
        return this.weight;
    }
    public double getPrice(){
        return this.price;
    }
    public String getStyle(){
        return this.style;
    }
    public void setColor( String color){
        this.color=color;
    }
    public void setPrice( double price){
        this.price=price;
    }


}