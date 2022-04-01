public class Circles extends Shapes{
    String name;
    double radius;
    double diameter;
    public Circles(){
        super();
        name = "Circle";
        radius = 2;
        diameter = 4;
    }
    public Circles(String name, double radius, double diameter){
        this.name = "Funny";
        this.radius = 4;
        this.diameter = 8;
    }


    public double circleRadius(){
        return radius;
    }
}