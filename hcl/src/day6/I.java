package day6;

public interface I {
   void meth1();
   default void meth2() {
	   System.out.println("In interface meth2");
   }
   static void meth3() {
	   System.out.println("In interface meth3");
   }
}
