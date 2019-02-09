//link https://www.codewars.com/kata/fixme-static-electrickery

//instruction
//The code provided has a method plus100 which is supposed to return the number of the parameter incremented by 100.
//
//        But it's not working properly.
//
//        Task
//        Fix the code so we can all go home early.
//
//        Restrictions
//        * Do not modify the constructor
//        * Do not modify the plus100 method
//        * Do not modify the ONE_HUNDRED declaration
public class Fixme {
    public static final Fixme INST = new Fixme();

    private static int ONE_HUNDRED = 100;

    private int value;

    public Fixme(){
        value = ONE_HUNDRED;
    }

    public int plus100(int n){
        return value + n;
    }

    public static int getOneHundred() {
        return ONE_HUNDRED;
    }

    public int getValue() {
        return value;
    }
}
