
public class CircleUser {
    public static void main(String[] args) {
       
        Circle c1;  
        new Circle(10);
        Circle c2=new Circle(20);
        Circle c3=c2;
        c1=c2;
        c1.showRadius();
        c2.showRadius();
        c3.showRadius();
        c3=new Circle(30);
        System.out.println("____________________");
        c1.showRadius();
        c2.showRadius();
        c3.showRadius();
        c2=c3;
        System.out.println("____________________");
        c1.showRadius();
        c2.showRadius();
        c3.showRadius();
        c1=new Circle(40);
        System.out.println("____________________");
        c1.showRadius();
        c2.showRadius();
        c3.showRadius();
        
        
        
        
        
        
        
        
    }
}
