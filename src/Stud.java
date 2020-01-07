
public class Stud {

    private int rno;
    private String name;
    private int marks;

    public static void test(){
    }
    
    public Stud(){
        test();
    }
    
    public Stud(int x, String y) {
        this();
        rno = x;
        name = y;
    }
              
    public Stud(int a, String b, int c) {
        this(a,b);
        marks = c;
    }
    public void show(){
        System.out.println(rno+","+name+","+marks);
    }
    public static void main(String[] args) {

        Stud s1=new Stud(111,"AAA",50);
        Stud s2=new Stud(112,"BBB");
        
        s1.show();
        s2.show();
        
        
    }

}
