package constructor;

public class AreaRectangle {
    int length;
    int breadth;
     
    public int getarea(){
        int area=length*breadth;
        System.out.println("The area of the reactangle is ="+area);
        return area;
    }
    AreaRectangle(){
       this(0,0);
    }
    AreaRectangle(int l,int b){
        this.length=l;
        this.breadth=b;

    }
    public static void main(String[] args) {
        AreaRectangle obj= new AreaRectangle();
        AreaRectangle obj2=new AreaRectangle(5,6);
        obj2.getarea();
    }
    
}
