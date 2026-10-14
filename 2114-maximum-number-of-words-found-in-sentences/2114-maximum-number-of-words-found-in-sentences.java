class Solution {
    public int mostWordsFound(String[] sentences) {
        int max=0;
        for(int i=0;i<sentences.length;i++){
            int w=sentences[i].split(" ").length;
            if(w>max){
                max=w;
            }

        }
        return max;
    }
}