 
//   class A{
//       public int a;
//       public int piyush() {
//           return 5;
//       }
//       public void meth2(){
//           System.out.println("I am method 2 of class A");
//       }
//   }
//   class B extends A{
//       public void meth3() {
//           System.out.println("I am method 3 of class B" );
        
//       }
      
//   }
//   public class Main{
//   public static void main(String[] args){
  
//           A a = new A();
//           a.meth2();
          
          
//       }
      
//   }


class Animal {
   public void move() {
      System.out.println("Animals can move");
   }
}

class Dog extends Animal {
   public void move() {
      System.out.println("Dogs can walk and run");
   }
}

public class Main {

   public static void main(String args[]) {
      Animal a = new Animal();  
      Animal b = new Dog(); 

      a.move();   
      b.move(); 
   }
}





















  
