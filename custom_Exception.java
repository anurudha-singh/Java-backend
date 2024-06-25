public class custom_Exception extends Exception{
    custom_Exception(String str){
super(str);
    }
}

class Calc{
int a =10;
int b =20;
int result=0;
public void divide(){
    try{
        result=a/b;
        throw new custom_Exception("This is the my custom exception");
        }
        catch(custom_Exception e){
        System.out.println("Exception occured ::"+e);
        }
        
        System.out.println("Result ::"+result);
}
}