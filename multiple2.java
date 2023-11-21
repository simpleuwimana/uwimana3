class C extends A,B{//suppose if it were  
   
 public static void main(String args[]){  
class A{  
void msg(){System.out.println("Hello");}  
}  
class B{  
void msg(){System.out.println("Welcome");}  
}   
   C obj=new C();  
   obj.msg();//Now which msg() method would be invoked?  
}  
}  