public class Plant {
    public int numWeeksOld;
    public String color;
    public boolean isEdible;

    public Plant(int pNumberWeeksOld, String pColor, boolean pIsEdible){
        numWeeksOld = pNumberWeeksOld;
        color = pColor;
        isEdible = pIsEdible;
    }

    public void printInfo(){
        System.out.println(" ");
        System.out.println("It is "+numWeeksOld+" weeks old");
        System.out.println("The color is "+color);
        System.out.println("It is "+isEdible+" that it is edible");
    }
}
