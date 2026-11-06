
/*

based on the project it is neccsasry to create our own exception 
which the programmer or user creates are called as custom exceptions 

RULES FOR WORKING WITH CUSTOM EXCEPTION:
1.craete the class with exception name
2.the exception class which we craeted should either inherite exception or runtime exception class 
3.create an object of the exception class and invoke the object of that exception 
4.handle it using try and check block
5,thow is the keyword to invoke the order of exception the throw is generally used with 
*/

import java.util.*;
class InvalidPasswordEception extends RuntimeException{

}
class exception_02{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the user id:");
        String userid=sc.next();
        if(userid.equals("admin")){
            System.out.println("correct");
        }
        System.out.print("enter the password");
        int password=sc.nextInt();
        if(password==1234){
            System.out.println("login successful");
        else{
            try{
                InvalidPasswordEception obj=new InvalidPasswordEception();
                throw obj;
            }
            catch(InvalidPasswordEception e){
                System.out.println(e.getMessage());
            }
        }
    }
}