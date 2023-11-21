 void print(){System.out.println("Hello");}  
public static void main(String args[]){  
interface Printable{  
void print();  
}  
interface Showable{  
void print();  
}  
  
class TestInterface3 implements Printable, Showable{  
TestInterface3 obj = new TestInterface3();  
obj.print();  
 }  
}  