class Animal{
    protected int legs;
    
    Animal(int legs){
        this.legs=legs;
     }
}

class Dog extends Animal{
    String sound;
    Dog(int legs,String sound){
        super(legs);
        this.sound = sound;
    }

    void display_features(){
        System.out.println(this.getClass().getName()+" has "+this.legs+" legs and it can "+this.sound);
    }
}

class Cat extends Animal{
    Boolean climb_tree;
    Cat(int legs,Boolean climb_tree){
        super(legs);
        this.climb_tree = climb_tree;
    }

    void display_features(){
        System.out.println(this.getClass().getName()+" has "+this.legs+" legs");
        if(this.climb_tree){
            System.out.println(this.getClass().getName()+" can climb tree");
        }else{
            System.out.println(this.getClass().getName()+" cannot climb tree");
        }
    }
}
public class HeirarchicalInh {
    public static void main(String args[]){
        Dog d = new Dog(4,"Bark");
        d.display_features();
        Cat c = new Cat(4,true);
        c.display_features();    }
}
