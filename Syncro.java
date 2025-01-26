class Star extends Thread{
    public void run(){
        for(int i=1;i<15;i++){
            for(int j=0;j<i;j++){
                System.out.print('*');
            }
            System.out.println();
        }
    }
    
}


public class Syncro{

    public static void main(String args[]){
        Star s1 = new Star();
        s1.start();
        // s1.printStar('*');

        Star s2 = new Star();
        s2.start();
        // s2.printStar('#');
        
        System.out.println("**********Main is dead************");
    }
}

