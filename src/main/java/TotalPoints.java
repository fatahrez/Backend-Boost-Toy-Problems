//Link to kata https://www.codewars.com/kata/total-amount-of-points/train/java

public class TotalPoints {

    public static int points(String[] games) {
        //implement me
        int total =0;
        for (String game : games){
            int a = Character.getNumericValue(game.charAt(0));
            int b = Character.getNumericValue(game.charAt(2));

            if(a > b){
                total += 3;
            } else if(a == b){
                total += 1;
            }
            else{
                total += 0;
            }
        }

        return total;
    }
}
