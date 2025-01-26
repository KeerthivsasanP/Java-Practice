class Rectangle{
    private int lenght;
    private int width;

    void setLength(int lenght){
        this.lenght = lenght;
    }
    void setWidth(int width){
        this.width = width;
    }
    int getLenght(){
        return this.lenght;
    }
    int getWidth(){
        return this.width;
    }

}

class Cuboid extends Rectangle{
    int height;

    void setHeight(int height){
        this.height = height;
    }
    int getHeight(){
        return this.height;
    }

    int calc_volume(){
        int volume = super.getLenght()*super.getWidth()*this.height;
        return volume;
    }
}

class SingleInh{
    public static void main(String args[]){
        Cuboid c = new Cuboid();
        c.setLength(1);
        c.setWidth(2);
        c.setHeight(3);
        System.out.println(c.calc_volume());
    }
}