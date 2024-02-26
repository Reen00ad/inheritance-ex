public class Main {
    public static void main(String[] args) {
        //circle
    Circle c1 = new Circle(2.5,"pink",false);
        System.out.println(c1);
        System.out.println("radius : "+c1.getRadius());
        System.out.println("area : "+c1.getarea());
        System.out.println("perimeter : "+c1.getPerimeter());
        System.out.println("color : "+c1.getColor());
        System.out.println("is filled : "+c1.isFilled());

        Circle c2 = new Circle(6.5,"white",true);
        System.out.println(c2);
        System.out.println("radius : "+c2.getRadius());
        System.out.println("area : "+c2.getarea());
        System.out.println("perimeter : "+c2.getPerimeter());
        System.out.println("color : "+c2.getColor());
        System.out.println("is filled : "+c2.isFilled());

        //rectangle
        Rectangle r1 = new Rectangle(4,2,"blue",true);
        System.out.println(r1);
        System.out.println("radius : "+r1.getLength());
        System.out.println("radius : "+r1.getWidth());
        System.out.println("area : "+r1.getArea());
        System.out.println("perimeter : "+r1.getPerimeter());
        System.out.println("color : "+r1.getColor());
        System.out.println("is filled : "+r1.isFilled());

        Rectangle r2 = new Rectangle(8,3,"red",false);
        System.out.println(r2);
        System.out.println("radius : "+r2.getLength());
        System.out.println("radius : "+r2.getWidth());
        System.out.println("area : "+r2.getArea());
        System.out.println("perimeter : "+r2.getPerimeter());
        System.out.println("color : "+r2.getColor());
        System.out.println("is filled : "+r2.isFilled());



//square
   Square s1=new Square(5,"purple",true);

        System.out.println(s1.toString());
        System.out.println("area : "+s1.getArea());

   Square s2=new Square(8,"black",false);

        System.out.println(s2.toString());
        System.out.println("area : "+s2.getArea());



    }
}