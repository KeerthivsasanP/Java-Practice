public class StaticMethod {
    static int mul(int x,int y){
    return x*y;
    }
}

class MathOperation{
    public static void main(String args[]){
    int a = StaticMethod.mul(20,30);
    System.out.println(a);
    }
}
