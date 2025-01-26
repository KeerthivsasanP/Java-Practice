public class Loops {
    public static void main(String args[]){
        //for loop
        System.out.println("For loop");
        String[] names = new String[]{"name1","name2","name3"};
        for(int i=0;i<names.length;i++){
            System.out.println(names[i]);
        }
        //while loop
        System.out.println("WHile loop");
        int i = 5;
        while (i<10) {
            System.out.println(i);
            i++;
        }
        //do while
        System.out.println("Do-while loop");
        i=5;
        do{
            i++;
            System.out.println(i);
        }while(i<10);
    }
}
