public class Constructor {
    String name;

    Constructor(){
        System.out.println("Employee created with default constructor");
    }
    Constructor(String name){
        System.out.println("Employee "+name+" created with param constructor");
    }
}

class starter{
    public static void main(String args[]){
        Constructor e = new Constructor();
        Constructor e2 = new Constructor("Alpha");
        System.out.println(e.getClass().getName());
        System.out.println(e2.getClass().getName());
    }
}
