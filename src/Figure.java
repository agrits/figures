public abstract class Figure implements Print{
    abstract double calculateArea();
    abstract double calculatePerimeter();
    protected void printData(){
        System.out.println("Obwod figury "+calculatePerimeter());
        System.out.println("Pole figury "+calculateArea());
    }
}