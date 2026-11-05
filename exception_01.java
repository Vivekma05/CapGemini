/*
EXCEPTION HANDLING:
    ERROR:
        error is also ha runtime exception which cannot be handled we have to debug 
        error->1.Copilation error:will rise due to the syntax mistakes.
               2.Runtime eoor:will ris ewhen we run the code
    Exception :is an event or an interruption which stops the exceution of the program
    (below lines of code will not get executed)
               exceptions will rise due to the faulty inputs given by user.


Diff checked and Unchecked
    Checked Exception:Compiler known exception and handle immediatly
    UnChecked Exception:compiler unknown exception handle but not immediatly.


Exception Handling:
    the process of handling the exception is know as exception handling.Typically exceptuon is handled using try block
and then catch block 


try and catch block:
    1.the critical lines of code which gives an exception should be written inside the try block 
    2.if there is a try block mandatory to have a catch block and vice versa 
    3.the solution should always be written within the catch block 
    4.catch block will be exceuted only if an exception occurs 
    5.one try block can have any number of catch blocks 
    6.there should not be any excutable lines of code btw try and catch block.
    7.it is always a good practise to handle the super class exception as a last catch block 


IMPORTANT METHODS IN THROWABLE CLASS:

1.printTraceStack(): this method gives the complete insturtion about the exception
2.getMessage():this method gives the samll method about the exception occured 


Finally Block:

1.the set of intructions which has to be exceuted all the time has to return within the finally block 
2.finally block is the block of code which gets exceuted all the time
NOTE:in java we can have nested try and catch block 
3.we can have try and catch block within a finally block as well

THROWS:
    *it is a indication to the problem about the possiblity of the exception
    *thows is used to propagate an exception
    *throws is generally used with checked exception
    *typically we can use with throws with methods and also we can use with constuctor as well.



*/ 

// example for unchecked exception

/* class exception_01{
    public static void main(String[]args){
        int arr[]={10,20,30,40};
        System.out.println(arr[100]);
    }
}
*/

//example for checked exception

/*class exception_01{
    public static void main(String[]args){
        for(int i=0;i<=5;i++){
            System.out.print(i);
            Thread.sleep(1000);
        }
    }
}
*/

import java.util.*;
class exception_01{
    public static void main(String[]args){
        /*
        int a[]={10,20,30,40};
            try{
                for(int i=0;i<=5;i++){
                    System.out.print(a[i]);
                    Thread.sleep(1000);
                }
            }
            catch(ArrayIndexOutOfBoundsException e){
                System.out.print("array index out od bound");
            }catch(ArithmeticException e){
                System.out.print("arithmatic exception");
            }
            catch(Exception e){
                System.out.print("super class exception");
            }
        */

       Scanner sc=new Scanner(System.in);
       System.out.println("enter the numerator");
       int num=sc.nextInt();
       System.out.println("enter the denominator");
       int deno=sc.nextInt();
       try{
        int res=num/deno;
        System.out.println(res);
       }catch(ArithmeticException e){
        System.out.println(e.getMessage());
       }
    }
}
