
public class CircleUser {
    public static void main(String[] args) {
        //here we need to compute area of 3 circle 10,100,1000
        //you just need to create three objects
        Circle c1=new Circle(); //one object of Circle class
        Circle c2=new Circle(); //second object
        Circle c3=new Circle(); //third object
        
        c1.setRadius(10);
        c2.setRadius(100);
        c3.setRadius(1000);
        
        c1.computeArea();
        c2.computeArea();
        c3.computeArea();
        
        
    }
}
