public class Square extends Figure{
    private double a;

    public Square(double a){
        this.a = a;
    }
    @Override
    public void print() {
        System.out.println("Kwadrat o boku "+a);
        printData();
    }

    @Override
    double calculateArea() {
        return Math.pow(a, 2);
    }

    @Override
    double calculatePerimeter() {
        return 4*a;
    }

}