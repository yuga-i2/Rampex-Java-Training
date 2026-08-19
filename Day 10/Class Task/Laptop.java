class LaptopMain{
    public static void main(String [] args){
        Laptop li=new Laptop();
        li.browse();
    }
}
class Laptop{
    String brand;
    String model;
    public void browse(){
        System.out.println("Browse");
    }
}