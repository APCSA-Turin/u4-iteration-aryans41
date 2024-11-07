package U4T3_LoopsString;
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

    public String removeA(String str) {
      String withoutA = "";
      for (int i = 0; i < str.length(); i++) {
        if (str.substring(i, i+1).equals("a") == false) {
        withoutA += str.substring(i, i+1);
        }
      }
      return withoutA;
   }
   
  public String replaceCharacterV1(String searchChar, String origStr, String replaceChar) {
    String newString = ""; 
    for(int i = 0; i < origStr.length(); i++) {
        String currentCharacter = origStr.substring(i, i + 1); 
        if (currentCharacter.equals(searchChar)) {
          newString = newString + replaceChar; 
        } else {
          newString = newString + currentCharacter; 
        }
      }
      return newString;
  }

 public String replaceCharacterV2(String searchChar, String origStr, String replaceChar){
  String newString = ""; 
  int i = 0;
  while (i < origStr.length()) {
    String currentCharacter = origStr.substring(i, i + 1); 
    if (currentCharacter.equals(searchChar)) {
        newString = newString + replaceChar; 
      } else {
        newString = newString + currentCharacter; 
      }
      i++;
  }
    return newString;
}

public int countString(String searchString, String origString) {
  int count = 0; 
  int maxSearchIndex = origString.length() - searchString.length(); 
  for (int i = 0; i <= maxSearchIndex; i++) {
    String substring = origString.substring(i, i + searchString.length());
    if (substring.equals(searchString)) {
      count++;
    }
  }
  return count;
 }

 public String removeString(String searchString, String origString) {
  while (origString.indexOf(searchString) != -1) {
    int indexofSearchString = origString.indexOf(searchString); 
    origString = origString.substring(0, indexofSearchString) + origString.substring(indexofSearchString + searchString.length());
  }
  return origString;
 }

 public void commaSeparated(int fromNum, int toNum) {
  String numList = "";
  if (fromNum < toNum) {
    for (int i = fromNum; i < toNum; i++) {
      numList += i + ", ";
   }
  } else {
    for (int i = fromNum; i > toNum; i--) {
      numList += i + ", ";
   }
  }
  numList += toNum; 
  System.out.println(numList);
}

public boolean isPalindrome(String myString) {
  String withoutSpaces = removeString(" ", myString); 
  String backwards = reverseString(withoutSpaces);
  if (backwards.equals(withoutSpaces)) {
    return true;
  } else {
    return false;
  }
}

public void multiPrint(String toPrint, int num) {
  String output = "[";
  int count = 1;
  if (num > 0) {
    while (count <= num) {
      output += toPrint + " "; 
      count++;
    }
    output = output.substring(0, output.length() -1);
    System.out.println(output  + "]");
  } else {
    System.out.println(output + "]");
  }
}
}
