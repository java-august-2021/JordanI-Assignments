public class RandomNumsTest {

    public static void main(String[] args) {

        RandomNums testRoll = new RandomNums();
        int[] testOne = testRoll.tenRolls();
        char testTwo = testRoll.abcRoll();
        StringBuilder testThree = testRoll.passWord();
        int[] testFour = testRoll.numPasscode();

        System.out.println(testOne);
        System.out.println(testTwo);
        System.out.println(testThree);
        System.out.println(testFour);
    }
}