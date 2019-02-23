//Link to kata https://www.codewars.com/kata/total-amount-of-points/train/java

//Our football team finished the championship. The result of each match look like "x:y". Results of all matches are recorded in the collection.
//
//        For example: ["3:1", "2:2", "0:1", ...]
//
//        Write a function that takes such collection and counts the points of our team in the championship. Rules for counting points for each match:
//
//        if x>y - 3 points
//        if x<y - 0 point
//        if x=y - 1 point
//        Notes:
//
//        there are 10 matches in the championship
//        0 <= x <= 4
//        0 <= y <= 4

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
//complete all points taken
