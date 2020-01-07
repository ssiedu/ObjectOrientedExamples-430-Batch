
public class Employee {

    private int eno;
    private String ename;
    private int salary;
    
    //eno,ename initialize
    public void setData(int x, String y){
        eno=x; 
        ename=y;
    }
    //eno,ename,salary initialize
    public void setData(int a, String b, int c){
        setData(a,b);
        salary=c;
    }
    public void show(){
        System.out.println(eno+","+ename+","+salary);
    }
    public static void main(String[] args) {
        Employee e1=new Employee();
        e1.setData(111,"AAA",50000);
        e1.show();
        
        Employee e2=new Employee();
        e2.setData(112, "BBB");
        e2.show();
        
        
        
    }
}
