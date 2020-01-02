public class Circle {
    //data-members (to hold the value of properties of an object)
        private double radius, area, circumference;
        private final double PI=3.14;
    //behaviour(methods are taken for performing the operations
        
        public void setRadius(double r){
            radius=r;
        }
        public void computeArea(){
            area=PI*radius*radius;
            System.out.println("Area : "+area);
        }
        public void computeCircumference(){
            circumference=2*3.14*radius;
            System.out.println("Circumference : "+circumference);
        }
}
