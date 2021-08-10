import java.util.Random;
import java.util.Arrays;

public class RandomNums {

    public int[] tenRolls() {
        Random roll = new Random();
        int[] hold = new int[10];
        int spawn = roll.nextInt(20) + 1;
        for (int i = 0;  i < hold.length; i++ ) {
            hold[i] = spawn;
        }
        return hold;

    }    


    public char abcRoll() {
        char[] letter = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        Random twentySix = new Random();
        int randomNum = twentySix.nextInt(25);
        return letter[randomNum];
        

    }
    
    public StringBuilder passWord() {
        char[] letter = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        StringBuilder passcode = new StringBuilder();
        Random makepass = new Random();
        int randPass = makepass.nextInt(25);
        while (passcode.length() < 8) {
            passcode.append(letter[randPass]);
        }
        return passcode;
    }

    public int[] numPasscode() {
        Random roll = new Random();
        int tester = 98549346;
        int length = String.valueOf(tester).length();
        int[] myArray = new int[length];
        int rnd = roll.nextInt() + 1;
        for (int  i = 0; i < myArray.length; i++){
            myArray[i] = rnd;
        }
        return myArray;
    }
}