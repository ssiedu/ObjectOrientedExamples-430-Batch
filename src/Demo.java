public class Demo {
    
    int x, y;           //instance (non-static)
    
    //for the entire class only one copy of p,q will be
    //there and that copy will be shared among all objects
    static int p, q;    //class (static)
    
    public static void main(String args[]){
        
        //instantiating the class Demo
        Demo d1=new Demo();
        //instantiating the class Demo once again
        Demo d2=new Demo();
        //instantiating the class Demo once again
        Demo d3=new Demo();
        
        d1.x=10;    //storing 10 to x variable of d1
        d2.x=20;    //storing 20 to x variable of d2
        d3.x=30;    //storing 30 to x variable of d3
        
        System.out.println("Showing Instance Variables");
        System.out.println(d1.x);
        System.out.println(d2.x);
        System.out.println(d3.x);
        
        d1.p=100;
        d2.p=200;
        d3.p=300;
        System.out.println("Showing Class Variables");
        System.out.println(d1.p);
        System.out.println(d2.p);
        System.out.println(d3.p);
        
        
        
        
        
        
        
    }
}
