import java.util.ArrayList;
import java.util.List;

public class Bold {

    public static String in = "abcdef";
    public static String[] put = new String[]{"abc", "ef"};

    public static String findTheBold(String inputString, String[] subStrings) {

        String result = "";
        String openB = "<b>";
        String closedB = "</b>";
        int open = 0;
        int closed = 0;

        for(int i = 0; i < inputString.length(); i++) {
            for(int j = 0; j < subStrings.length; j++) {
                if(subStrings[j].contains(Character.toString(inputString.charAt(i)))) {
                    if(open == closed) {
                        result += openB + Character.toString(inputString.charAt(i));
                        open++;
                    } else {
                        result += Character.toString(inputString.charAt(i));
                    }
                }
            }
            if(result.length() < (open * 3) + (closed * 4) + i + 1) {
                if(open > closed) {
                    result += closedB + Character.toString(inputString.charAt(i));
                    closed++;
                } else {
                    result += Character.toString(inputString.charAt(i));
                }
            }
        }
        if (open > closed){
            result += closedB;
            closed++;
        }
        return result;
    }

    public static void main(String[] args) {
//        put.add("abc");
//        put.add("ef");

        System.out.println(findTheBold(in, put));
    }
}


