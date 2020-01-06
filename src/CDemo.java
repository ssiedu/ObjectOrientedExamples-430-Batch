
public class CDemo {

    private int x, y, z;    //instance variable
   
    
    public void setData(int a, int b, int c){
        x=a; y=b; z=c;
    }
    
    public CDemo(){
//        x=1;
//        y=2;
//        z=3;
    }
    public CDemo(int a, int b, int c){
        x=a; y=b; z=c;
    }
    public void showData(){
        System.out.println(x+","+y+","+z);
    }
    
    public static void main(String[] args) {
        CDemo d1=new CDemo(10,20,30);
        CDemo d2=new CDemo(30,40,50);
        CDemo d3=new CDemo();
        //d3.setData(55, 65, 75);
        //d1.setData(10, 20, 30);
        //d2.setData(40, 50, 60);
        //d3.setData(70, 80, 90);
        
        d1.showData();
        //d2.showData();
        //d3.showData();
        System.out.println("Now Changing States ");
        d1.setData(11,12,13);
        d1.showData();
        d1.setData(21,22,23);
        d1.showData();
        //d1.setData(5, 15, 25);
        //d1.showData();
        //d2.showData();
        //d3.showData();
        
    }
}
