// class Scope {
//   int num=10 ;
// }

interface A{
public abstract void run(); //public abstract comes by default 
}
interface B{
  public abstract void stop();
}

/**
 * scope
 */
//  public class Scope implements A,B {
//   @override
// public void run(){
//   System.out.println("I am run() method");
// }

// public void stop(){
//   System.out.println("I am stop() method");
// }
//  }
public class Scope implements A, B {

  // Implement the run method from interface A
  @Override
  public void run() {
      System.out.println("Running...");
  }

  // Implement the stop method from interface B
  @Override
  public void stop() {
      System.out.println("Stopping...");
  }
}

