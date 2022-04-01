public class Cylinders extends Circles{
    String name;
    double radius;
    double diameter;
    double height;
    public Cylinders(){
        super();
        name = "Cone";
        radius = 2;
        diameter = 4;
        height = 4;
    }
    public Cylinders(String name, double radius, double diameter, double height){
        this.name = "Funny2";
        this.radius = 4;
        this.diameter = 8;
        this.height = 4;
    }


    public double cylinderRadius(){
        return radius;
    }

    @Override
    public double volume(){
        return Math.PI*Math.pow(radius, 2)*height;
    }

}

