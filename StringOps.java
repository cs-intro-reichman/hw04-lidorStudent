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
        String answer = "";
        for (int i = 0; i < length; i++) {
            if (string.charAt(i) == 'a' || string.charAt(i) == 'e' || 
                string.charAt(i) == 'i' || string.charAt(i) == 'o' || 
                string.charAt(i) == 'u') {
                    answer += string.charAt(i) - ('a' - 'A');
            } else {
                if (string.charAt(i) >= 'A' && string.charAt(i) <= 'Z') {
                    answer += string.charAt(i) + ('a' - 'A');
                }
            }
        }
        return answer;
    }

    public static String camelCase (String string) {
        // Write your code here:
        return "";
    }

    public static int[] allIndexOf (String string, char chr) {
        // Write your code here:
        return new int[1];
    }
}
