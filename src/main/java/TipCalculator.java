//link https://www.codewars.com/kata/tip-calculator/train/java

//Complete the function, which calculates how much you need to tip based on the total amount of the bill and the service.
//
//        You need to consider the following ratings:
//
//        Terrible: tip 0%
//        Poor: tip 5%
//        Good: tip 10%
//        Great: tip 15%
//        Excellent: tip 20%
//        The rating is case insensitive (so "great" = "GREAT"). If an unrecognised rating is received, then you need to return:
//
//        "Rating not recognised" in Javascript, Python and Ruby...
//        ...or null in Java
//        ...or -1 in C#
//        Because you're a nice person, you always round up the tip, regardless of the service.

public class TipCalculator {
    public static Integer calculateTip(double amount, String rating) {
        // tip tap
        if(rating.toLowerCase().contains("excellent")){
            return (int) Math.ceil(amount*0.2);
        }
        else if(rating.toLowerCase().contains("great")){
            return (int) Math.ceil(amount*0.15);
        }
        else if(rating.toLowerCase().contains("good")){
            return (int) Math.ceil(amount*0.1);
        }
        else if(rating.toLowerCase().contains("poor")){
            return (int) Math.ceil(amount*0.05);
        }
        else if(rating.toLowerCase().contains("terrible")){
            return 0;
        }
        else{
            return null;
        }
    }
}
//passes some tests not all. points not taken
