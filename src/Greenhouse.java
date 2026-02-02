public class Greenhouse {
    public String name;
    public boolean sprinklersOn;
    public int numberOfFlowers;
    public Plant kimPlant;
    public Plant myPlant;
    public static void main(String[] args) {
        Greenhouse greenhouse = new Greenhouse();
    }
    public Greenhouse(){
        System.out.println("Hello World! Good luck on your exams!");
        name = "Planting Parameters at the CSG";
        sprinklersOn = true;
        numberOfFlowers = 31;
        System.out.println("Welcome to "+name+"! It is " + sprinklersOn +" that we are watering plants right now. We have "+numberOfFlowers+ " flowers!");
        numberOfFlowers = 40;
        System.out.println("Welcome to "+name+"! It is " + sprinklersOn +" that we are watering plants right now. We have "+numberOfFlowers+ " flowers!");
        randomReplant();
        veggieOfTheDay("carrots");
        countFlowers();
        changeTemperature();
        kimPlant = new Plant(3,"orange",true);
        kimPlant.printInfo();
        myPlant = new Plant(4,"purple",false);
        myPlant.printInfo();
        starTriangle(5);
    }
    public void randomReplant(){
        int randomInt;
        randomInt = (int)(Math.random()*16);
        System.out.println("We are replanting " + randomInt +" vegetables today!");
    }

    public void veggieOfTheDay(String veggie){
        System.out.println("Today's chosen veggie is "+ veggie);

    }
    public void countFlowers(){

        for(int x=2;x<7;x=x+2){
            System.out.println(x);
        }
        System.out.println(" ");

        for(int x=20;x<111;x=x+30){
            System.out.println(x);
        }
        System.out.println(" ");

        for(int x=8;x>=0;x--){
            System.out.print(" "+x+",");
        }
        System.out.println(" ");
    }

    public void changeTemperature(){
        double randomNum;
        randomNum = (Math.random());

        if(randomNum<0.25){
            System.out.println("The temperature has decreased by 2 degrees");
        }

        else if(randomNum>=0.25 && randomNum<0.5){
            System.out.println("The temperature has decreased by 1 degree");
        }

        else if(randomNum>=0.5 && randomNum<0.75){
            System.out.println("The temperature has increased by 1 degree");
        }

        else if(randomNum>=0.75 && randomNum<1){
            System.out.println("The temperature has increased by 2 degrees");
        }
    }

    public void starTriangle(int size){
        for(int x = 1; x<=size ;x++){
            System.out.println("*");
            for(int y = 1; y<=x; y=y+1){
                System.out.print("*");

            }
        }

    }
}