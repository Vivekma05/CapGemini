/*
Mutithreading can be achieved by craeting multiple stacks 
Thread Scheduler in java is a software that decides which thread should run 

for each new stack the thread sheduler will create a new thread the independ activites 
which must be concureently exceuted should be placed with in run method

the programmeer must never directly called run method it must always be indireclty called
using stack method method when start method is called a new thread is craeted and code inside run
method is ececuted in new thread while if u call run method direclty no new thread is craeted and code inside 
run method will exceute on current or main thread

2 way to achieve the multi threading using runnable interface 
*/ 

import java.uti.*;
/*
class Addition extends Thread{
    void run(){
            Scanner sc=new Scanner(System.in);
            System.out.println("enter the first number");
            int num1=sc.nextInt();
            System.out.println("enter the second number");
            int num2=sc.nextInt();
            int res=num1+num2;
            System.out.print(res);
    }
}
class CharPrinting extends Thread{
    void run(){
        for(int i=65;i<=75;i++){
            system.out.println(char(i));
            try{
                Thread.sleep(1000);
            }catch(Exception e){
                e.printStackTrace();
            }
        }
    }
}
class NumPrinting extends Thread{
    void run(){
        for(int i=65;i<=75;i++){
            system.out.println(i);
            try{
                Thread.sleep(1000);
            }catch(Exception e){
                e.printStackTrace();
            }
        }
    }
}*/
class Demo implements Runnable{
    public void run(){
        Thread t=Thread.currentThread();
        String name=t.getNmae();
        if(name.equals("ADD")==true){
            add();
        }else if(name.equals("CHAR")==true){
            Charprint();
        }else{
            numprint();
        }
        void add(){
            Scanner sc=new Scanner(System.in);
            System.out.println("enter the first number");
            int num1=sc.nextInt();
            System.out.println("enter the second number");
            int num2=sc.nextInt();
            int res=num1+num2;
            System.out.print(res);

        }void Charprint(){
            for(int i=65;i<=75;i++){
            system.out.println(char(i));
            try{
                Thread.sleep(1000);
            }catch(Exception e){
                e.printStackTrace();
            }
        }
        }void numprint(){
            for(int i=65;i<=75;i++){
            system.out.println(i);
            try{
                Thread.sleep(1000);
            }catch(Exception e){
                e.printStackTrace();
            }
        }
        }
    }
}
class multithreading{
    public static void main(String[]args){
        // Addition a=new Addition();
        // CharPrinting c=new CharPrinting();
        // NumPrinting n=new NumPrinting();
        // a.start();
        // c.start();
        // n.start();
        Demo d=new Demp();
        Thread t1=new Thread(d);
        Thread t2=new Thread(d);
        Thread t3=new Thread(d);
        t1.setName("ADD");
        t2.setName("CHAR");
        t3.setName("NUM");
        t1.start();
        t2.start();
        t3.start();

    }
}