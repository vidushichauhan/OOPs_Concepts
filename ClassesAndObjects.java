class Pen{  // this class is blueprint of the object
    
    String brandName;
    Float price;
    String type; // ballPoint;gel

    public void write(){
        System.out.println("Pen is writing");
    }
    public void printColor(){
        System.out.println(this.price);
    }

}

public class ClassesAndObjects{
    //in this class we are defining and calling objects 
    public static void main(String args[]){
        Pen pen1 = new Pen();
        pen1.brandName = "Saino Softex";
        pen1.price= 2.00f;
        pen1.type ="ballPoint";
        pen1.write();

        Pen pen2 = new Pen();
        pen2.brandName = "trimax";
        pen2.price= 100.00f;
        pen2.type ="gel";
        pen1.printColor();
        pen2.printColor();


    }
}