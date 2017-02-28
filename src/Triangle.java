public class Triangle extends Figure{
    private double a,b,c,p;

    public Triangle(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
        this.p = halfOfPerimeter();
    }

    private double halfOfPerimeter(){
        return (a+b+c)/2;
    }
    @Override
    public void print() {
        System.out.println("Trojkąt o bokach "+a+", "+b+", "+c);
        printData();
    }

    @Override
    double calculateArea() {
        return Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }

    @Override
    double calculatePerimeter() {
        return p*2;
    }
}