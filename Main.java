/**
 * HelloWorld
 */
public class Main extends Object {//Either you write it or not but every class in java inherits the object class becuase it is the superclass of all the class that we creates

    public static void main(String[] args) {
        // System.out.println("Hello world");
        // int number=1_00_000;
        // System.out.println(number);//100000 better readibility with the help of underscores
    //   int i=1;
    //     while(true){
    //         System.out.println(i++);
    //     }
//     Scope obj=new Scope();
//     // System.out.println(obj.num);
//     Scope obj2=new Scope();
//     // obj2.num=20;
//     // System.out.println(obj2.num);
//     A obj3=new Scope();
//     B obj4=new Scope();
//     obj3.run();
// // obj3.stop(); // cause an error becuase stop is not defined inside the interface A
// obj4.stop()    ;
// Laptop lap=Laptop.Macbook;
// System.out.println("Macbook price before::"+lap.getPrice()+"$");
// lap.setPrice(5000);
// System.out.println("Macbook price after::"+lap.getPrice()+"$");
// FunInterface funObj=new FunInterface() { //Anonymous Inner Class
//     @Override
//     public int add(int a, int b) {
//         return a+b;
//     }
    
// };
FunInterface funObj=(a,b)->a+b;    

int result= funObj.add(10,20);
System.out.println("Addition of two numbers is ::"+result);
}
}