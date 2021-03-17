/**
 * Take Two pointer approach
 *
 * All the letter in pattern must be present in query with order remaining same
 *
 * There must not be any other extra uppercase letter present in query because we can not insert uppercase letter in pattern
 *
 * e.g -> query -> FaceBook, pattern -> 'F' ans = false (we cannot insert B in pattern)
 *
 * e.g -> query -> FaceBook, pattern -> 'BF' ans = false (First letter is 'B' in pattern but first letter is 'F' in query)
 *
 * e.g -> query -> boFaceddBook , pattern -> 'oFdB' ans = ture (satisfy above all condition)
 */









class Solution {
    public List<Boolean> camelMatch(String[] queries, String pattern) {
        List<Boolean> ans = new ArrayList<>();
        for(String query:queries){
            int n = query.length();
            int len = pattern.length();
            int start = 0;
            boolean isMatching = true;
            for(int i=0;i<n;i++){
                char ch = query.charAt(i);
                if(Character.isLowerCase(ch)){
                    if(start >= len) continue;
                    else if(ch == pattern.charAt(start)) start++;
                }else{
                    if(start >= len || ch != pattern.charAt(start)){
                        isMatching = false;
                        break;
                    }
                    else start++;
                }
            }
            if(!isMatching || start < len) ans.add(false);
            else ans.add(true);

        }
        return ans;

    }
}