class Outer{
   static  int y=10;
 static class Inner {
     public void fun1(){
      System.out.println("num "+y);
     }
 }
}
public class MyInner {
    public static void main(String args[]){
        //Outer objo = new Outer();
        Outer.Inner obji = new Outer.Inner();
        obji.fun1();
    }
}