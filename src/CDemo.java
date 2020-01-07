
public class CDemo {

    private int x, y, z;    //instance variable
   
    
    public void setData(int a, int b, int c){
        x=a; y=b; z=c;
    }
    
    public CDemo(CDemo tmp){
        x=tmp.x;
        y=tmp.y;
        z=tmp.z;
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
        CDemo d3=new CDemo(d2);
        d1.showData();
        d2.showData();
        d3.showData();
    }
}
