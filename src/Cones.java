
    public class Cones extends Circles{
        String name;
        double radius;
        double diameter;
        double height;
        public Cones(){
            super();
            name = "Cone";
            radius = 2;
            diameter = 4;
            height = 4;
        }
        public Cones(String name, double radius, double diameter, double height){
            this.name = "Funny1";
            this.radius = 4;
            this.diameter = 8;
            this.height = 4;
        }
    
    
        public double coneRadius(){
            return radius;
        }
    
        @Override
        public double volume(){
            return Math.PI*radius*(radius+Math.sqrt(Math.pow(height, 2)* Math.pow(radius, 2)));
        }
    
    }

