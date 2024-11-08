
public class StringManip
{
    // this class has no instance variables

    public StringManip() { }

    /* Takes a string str and returns a new string
     * with all spaces removed.
     */
    public String removeSpaces(String str) { 
        String output = "";
        for (int i = 0; i < str.length(); i++) {
            if (!(str.substring(i, i + 1).equals(" "))) {
                output += str.substring(i, i + 1);
            }
        }
        return output;
     }


    /* Takes a string str and returns a new string
     * with the characters reversed, as described in part (a).
     */
    public String reverseString(String str) {
        String newStr = "";
        int i = str.length() - 1; 
        while (i >= 0) {
            newStr += str.substring(i, i + 1);
            i--;
        }
        return newStr;
    }
        
    /* Determines whether str is a palindrome and prints a message
     * indicating the result, as described in part (b).
     * Precondition: str contains only lowercase letters and spaces.
     */
    public void palindromeChecker(String str) { 
        String noSpaceString = removeSpaces(str);
        String reverse = reverseString(noSpaceString);
        if (noSpaceString.equals(reverse)) {
            System.out.println(str + " is a palindrome");
        } else {
            System.out.println(str + " is not a palindrome");
        }
     }
} 
