class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        Set<String> bannedWords = new HashSet<>();
        Map<String, Integer> wordCount = new HashMap<>();
        String[] words = paragraph.replaceAll("[^A-Za-z]"," ").toLowerCase().split(" ");
​
        for(String word: banned) {
            bannedWords.add(word);
        }
​
        for(String word: words) {
            if(!bannedWords.contains(word)) {
                wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
            }
        }
        //System.out.println(wordCount);
​
        String result = "";
        for(String word: wordCount.keySet()) {
            if(result.equals("")) {
                result = word;
            }
            else{
                if(wordCount.get(result) > wordCount.get(word)){
                    result = result;
                }else{
                    result = word;
                }
            }
        }
        return result;
    }
}
