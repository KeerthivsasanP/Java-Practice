class A extends Thread{
    public void run(){
        for (int i = 0;i<20;i++){
            System.out.println("Value of i in A is "+i);
        }
        System.out.println("Exit from A");
    }
}

class C extends Thread{
    public void run(){
        for (int i = 0;i<20;i++){
            System.out.println("Value of i in C is "+i);
        }
        System.out.println("Exit from C");

    }
}

class B extends Thread{
    public void run(){
        for (int i = 0;i<20;i++){
            System.out.println("Value of i in B is "+i);

                }
            }
        }
        



class MulThreading{
    public static void main(String args[]){
        A objA = new A();
        // objA.setPriority(Thread.MAX_PRIORITY);
        objA.start();
        B objB = new B();
        objB.start();
        C objC = new C();
        objC.start();

        System.out.println("**************Main is dead************");
        }
}