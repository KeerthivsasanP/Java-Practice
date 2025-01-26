public class Enumerators {
    enum Color{
        RED(255),
        BLUE(0),
        GREEN(0),
        YELLOW(126);

        final int r_value; //We make it final so that no one can edit the value

        Color (int r_value){
            this.r_value = r_value;
        }
    }

    public static void main(String args[]){
        // Color.BLUE.r_value = 124; 
        for (Color color: Color.values()){
            System.out.println(color+" "+color.r_value);
        }
    }
}
