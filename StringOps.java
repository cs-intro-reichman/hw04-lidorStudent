public class StringOps {
    ////////////////////////////////////////////////////////////
    //////                                               ///////
    //////              Reminder:                        ///////
    //////        allowed methods                        ///////
    //////                                               ///////
    //////        1.charAt(int index)                    ///////
    //////        2.length()                             ///////
    //////        3.substring(int start)                 ///////
    //////        4.substring(int start,int ends)        ///////
    //////        5.indexOf(String str)                  ///////
    //////                                               ///////
    //////        The rest are not allowed !             ///////
    //////        if you want to use a different         ///////
    //////        method, and you can implement          ///////
    //////        it using material from the course      ///////
    //////        you need to implement a version of     ///////
    //////        the function by yourself.              ///////
    //////                                               ///////
    //////        see example for substring              ///////
    //////        in Recitation 3 question 5             ///////
    //////                                               ///////
    ////////////////////////////////////////////////////////////
    public static void main(String[] args) {
        
    }

    public static String capVowelsLowRest (String string) {
        int length = string.length();
        char letter = 0;
        String answer = "";
        for (int i = 0; i < length; i++) {
            letter = string.charAt(i);
            if (letter == 'a' || letter == 'e' || letter == 'i' || 
                letter == 'o' || letter == 'u') {
                    answer += (char)(letter - ('a' - 'A'));
            } else 
            if (letter == 'A' || letter == 'E' || letter == 'I' || 
                letter == 'O' || letter == 'U') {
                    answer += letter;
            } else 
            if (letter >= 'A' && letter <= 'Z') {
                    answer += (char)(letter + ('a' - 'A'));
            } else {
                    answer += letter;
            }
        }
        return answer;
    }

    //Helper functions for camelCase:

    //1.
    public static String firstWordLowercase (String string) {
        int index = 0;
        char letter = string.charAt(index);
        String answer = "";
        while (letter != ' ') {
            letter = string.charAt(index);
            if (letter >= 'A' && letter <= 'Z') {
                    answer += (char)(letter + ('a' - 'A'));
            } else {
                    answer += letter;
            }
            index++;
        }
        answer += string.substring(index);
        return answer;
    }

    //2.
    public static String firstLetterUppercase (String string) {
        int length = string.length();
        char letter = string.charAt(0);
        char lastLetter = 0;
        String answer = letter + "";
        for (int i = 1; i < length; i++) {
            letter = string.charAt(i);
            lastLetter = string.charAt(i - 1);
            if (letter >= 'A' && letter <= 'Z' && lastLetter != ' ') {
                    answer += (char)(letter + ('a' - 'A'));
            } else 
            if (letter >= 'A' && letter <= 'Z' && lastLetter == ' ') {
                    answer += letter;
            } else 
            if (letter >= 'a' && letter <= 'z' && lastLetter == ' ') {
                    answer += (char)(letter - ('a' - 'A'));
            } else {
                    answer += letter;
            }
        }
        return answer;
    }

    //3.
    public static String removeSpace (String string) {
        int length = string.length();
        char letter = 0;
        String answer = "";
        for (int i = 0; i < length; i++) {
            letter = string.charAt(i);
            if (letter != ' ') {
                    answer += letter;
            }
        }
        return answer;
    }

    public static String camelCase (String string) {
        string = firstWordLowercase(string);
        string = firstLetterUppercase(string);
        string = removeSpace(string);
        return string;
    }

    public static int[] allIndexOf (String string, char chr) {
        // Write your code here:
        return new int[1];
    }
}
