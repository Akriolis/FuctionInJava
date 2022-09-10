public class FunctionJava {

    public static void chorus(){
        System.out.println("Once I had a love and it was a gas");
        System.out.println("Soon turned out had a heart of glass");
        System.out.println("Seemed like the real thing, only to find");
        System.out.println("Mucho mistrust, love's gone behind");
    }
    // public is access modifier (anyone can use public functions)
    // void is return type (means "Unit" in Kotlin)
    // () - constructor
    // {} - functions body

    // parameters and arguments
    // parameters are local variables in fun which can be used inside fun
    // specific value that are placed on parameter called argument
    public static void greetings(String location){
        System.out.println("Hello, " + location+ "!");
    }

    public static void weatherInterpreter(int temperature){
        if (temperature > 30){
            System.out.println("It's hot outside!");
        } else if (temperature < 5) {
            System.out.println("Brr, consider wearing a jacket.");
        } else {
            System.out.println("Not too hot, not too cold.");
        }
    }

    public static void printPhoto (int width, int height, boolean inColor){
        System.out.println("Width = " + width + " cm");
        System.out.println("Height = " + height + " cm");
        if(inColor){
            System.out.println("Print is full color.");
        } else {
            System.out.println("Print is black and white");
        }
    }

    public static int likePhoto(int currentLikes, String comment, boolean like){
        System.out.println("Feedback: "+comment);
        if (like){
            currentLikes = currentLikes + 1;

    }
        System.out.println("Number of likes: " + currentLikes);
        return currentLikes;
    }

    // return values
    // parameters - input, return - output


    public static int mySum (int x, int y){
        int z = x + y;
        return z;
    }

    // default function Math.random();
    // returns decimal between 0 and 1 (but 1 not included)

    public static int rollDice(){
        double randomNumber = Math.random();
        randomNumber = (randomNumber * 6) + 1;

        // 0 * 10 = 0 (min)
        // 0.999 * 10 = 9.99 (max)
        // casting mean that you can turn one variable type into another

        int randomInt = (int)  randomNumber;
        return randomInt;
    }

    public static void main(String[] args) {
    // Functions in Java
    chorus();

    greetings("Berdyansk");

    weatherInterpreter(4);
    weatherInterpreter(32);

    int degreesC = 15;
    weatherInterpreter(degreesC);

    printPhoto(30,40,true);

    int result = mySum(5,7);
    System.out.println(result);

    int returnedLikes = likePhoto(10,"Nice!", false);
    int totalLikes = likePhoto(returnedLikes, "I like this", true);
    System.out.println(totalLikes);

    int roll1 = rollDice();
    int roll2 = rollDice();
    System.out.println("And random rolls are: " +roll1+ " and "  +roll2+".");

        /**
         * General note.
         * @param a
         * @param b
         * @return
         */

        


    }
}
