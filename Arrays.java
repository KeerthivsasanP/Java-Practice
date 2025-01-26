import java.util.Scanner;

public class Arrays {
    public static void main(String args[]){
        int[] intArr = new int[]{1,2,3,4,5};
        for(int i=0;i<intArr.length;i++){
            System.out.println(intArr[i]);
        }
        String[] names = new String[10];
        for(int i=0;i<names.length;i++){
            Scanner in = new Scanner(System.in);
            names[i] = in.nextLine();
            in.close();
        }
        for(int i=0;i<names.length;i++){
            System.out.println(names[i]);
        }

    }
}
