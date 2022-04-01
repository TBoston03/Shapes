

public class Shapes {
    double area;
    double perimeter;
    double sides;
    String name;
    

    public Shapes(){
        double area;
        double perimiter;
        String name;
    }
    public double area(){
        return area;
    }
    
    public class Rectangles extends Shapes{
        public class Squares extends Rectangles{

        }
    }
    public class Triangles extends Shapes{
        public class Isoceles extends Triangles{

        }
        public class Equilateral extends Triangles{

        }
        public class Scalene extends Triangles{

        }
    }
}
    
    


