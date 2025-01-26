public class GettersNSetters {
    private int age;
    private String name;

    String getName(){
        return this.name;
    }

    int getAge(){
        return this.age;
    }

    void setName(String name){
        this.name=name;
    }

    void setAge(int age){
        this.age=age;
    }
    public static void main(String args[]){
        GettersNSetters a = new GettersNSetters();
        a.setAge(32);
        a.setName("Youth");
        System.out.println(a.name+" is "+a.age);
    }
}

