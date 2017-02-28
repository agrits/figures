public class Circle extends Figure{
    private double r;

    public Circle(double r){
        this.r = r;
    }

    @Override
    public void print() {
        System.out.println("Okrąg o promieniu "+r);
        printData();
    }

    @Override
    double calculateArea() {
        return Math.PI*Math.pow(r, 2);
    }

    @Override
    double calculatePerimeter() {
        return 2*Math.PI*r;
    }

}
