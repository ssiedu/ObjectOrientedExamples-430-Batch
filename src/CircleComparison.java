
public class CircleComparison {

    public static void main(String[] args) {
        Circle c1=new Circle(10);
        Circle c2=new Circle(10);
        Circle c3=c1;
        
        boolean res1=(c1==c2);
        boolean res2=(c1==c3);
        System.out.println(res1);
        System.out.println(res2);
    }
}
