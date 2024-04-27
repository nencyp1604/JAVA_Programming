public class Test{
      int a = 10;
    
      public void method(int a){
            a += 1;
            System.out.println(++a);
      }
      public static void main(String args[]){
            Test t = new Test(); 
            t.method(3);
      }
}