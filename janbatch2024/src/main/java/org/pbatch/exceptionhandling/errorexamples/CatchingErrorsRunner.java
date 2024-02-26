package org.pbatch.exceptionhandling.errorexamples;

public class CatchingErrorsRunner {

    public static void main(String[] args) {
        try {
            System.out.println("line-1");
            System.out.println("line-2");
            System.out.println("line-3");
            m1();
            System.out.println("line-4");
            System.out.println("line-5");
            System.out.println("line-6");
        }catch (ArithmeticException e){
            System.out.println("ArithemeticException : " + e.getMessage());
        }catch (Exception e){
            System.out.println("Unhanded exception occured, mail send : " + e.getMessage());
        }catch (StackOverflowError e){
            System.out.println("Stack overflow exception occured " + e.getMessage());
        } catch (Error e ){
            System.out.println("Unknown Error occcured, mail send : " + e.getMessage());
        }catch (Throwable t){
            System.out.println(" Throwable catch-block " + t.getMessage());
        }
    }

    /*
       1.1
     */
    public static void  m1(){
       double d =  Math.floor(Math.random()*10);

       if(d > 5){
           throw new ArithmeticException("My arithemetic exception");
       }else {
           m2();
       }

    }

    public static void m2(){
        m2();
    }
}
