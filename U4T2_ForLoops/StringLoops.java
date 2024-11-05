package U4T2_ForLoops;
public class StringLoops {
    // default constructor; no instance variables
    public StringLoops() { }

    public int countCharacters(String character, String searchString) {
      int count = 0;
      for (int i = 0; i < searchString.length(); i++) {
        if (searchString.substring(i, i + 1).equals(character.toLowerCase())) {
          count++;
        } else {
          if (searchString.substring(i, i + 1).equals(character.toUpperCase())) {
          count++;
          }
        }
      }
      return count;
    }
    
    public String reverseString(String origString) {
      String backwards = "";
      for (int i = origString.length() - 1; i >= 0; i--) {
        backwards += (origString.substring(i, i+1));
      }
      return backwards;
    }
  }
  
