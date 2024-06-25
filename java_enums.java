public class java_enums {
    
}

enum Laptop{
    Macbook(2000),windows(1500);
    private int price;
    private Laptop(int price){
        this.price=price;
    }
    public int getPrice(){
        return price;
    }
    public void setPrice(int price){
        this.price=price;
    }
}