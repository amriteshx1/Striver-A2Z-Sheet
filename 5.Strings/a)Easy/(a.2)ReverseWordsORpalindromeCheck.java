// class Solution {
//     public String reverseWords(String s) {
//         s = s.trim();

//         String[] words = s.split("\\s+");

//         StringBuilder result = new StringBuilder();

//         for(int i = words.length - 1; i >= 0; i--){
//             result.append(words[i]);

//             if(i !=0){
//                 result.append(" ");
//             }
//         } 

//         return result.toString();
//     }
// }

class Solution {
    public String reverseWords(String s) {

        StringBuilder result = new StringBuilder();
        int i = s.length() - 1;

        while (i >= 0) {

            // skip spaces
            while (i >= 0 && s.charAt(i) == ' ') {
                i--;
            }

            if (i < 0) break;

            int j = i;

            // find start of word
            while (i >= 0 && s.charAt(i) != ' ') {
                i--;
            }

            result.append(s.substring(i + 1, j + 1));
            result.append(" ");
        }

        return result.toString().trim();
    }
}
