public class LargestSubstring {

    public static int lengthOfLongestSubstring(String s) {
        String largestSubstring = "";

        for(int i = 0; i < s.length(); i++) {
            String tempString = Character.toString(s.charAt(i));
            for(int j = i+1; j < s.length(); j++) {
                if(!tempString.contains(Character.toString(s.charAt(j)))) {
                    tempString += Character.toString(s.charAt(j));
                } else {
                    break;
                }

            }
            if((tempString.length() >= largestSubstring.length()) || (largestSubstring.length() == 0)) {
                largestSubstring = tempString;
            }
        }
        //loop through the string
        //if the first one does not exist in new string add it
        //if new string is bigger than largest string or there isnt a largest string, add it
        return largestSubstring.length();
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abcabcbb"));
    }
}
