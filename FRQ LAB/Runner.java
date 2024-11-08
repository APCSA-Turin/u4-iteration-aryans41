public class Runner {
    public static void main(String[] args) {
        StringManip b = new StringManip();
        System.out.println(b.reverseString("Happy new year"));
        System.out.println(b.removeSpaces("ABC D GHHE  RRR"));
        b.palindromeChecker("taco cat");
        b.palindromeChecker("laid on no dial");
        b.palindromeChecker("level up"); 
    }
}