//link https://www.codewars.com/kata/a-strange-trip-to-the-market/train/java

public class Nessie {
    public static boolean isLockNessMonster(String s) {
        //FIND THE LOCH NESS MONSTER. SAVE YOUR TREE FIDDY
        Boolean ans = true;
        if (s.indexOf("tree fiddy") != -1 || s.indexOf("$3.50") != -1) {
            ans = true;
        } else {
            ans = false;
        }
        return ans;
    }
}