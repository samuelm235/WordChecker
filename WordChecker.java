import java.util.ArrayList;

public class WordChecker {
    /** Initialized in the constructor and contains no null elements */
    private ArrayList<String> wordList;
    private String previous_word;
    public WordChecker()
    {
        wordList = new ArrayList<String>();
    }
    public WordChecker(ArrayList<String> list)
    {
        wordList = list;
    }


    public void add(String[] words)
    {
        for(String word : words) wordList.add(word);
    }

    public ArrayList<String> getWordList()
    {
        return wordList;
    }

    /**
     * Returns true if each element of wordList (except the first) contains the
     * previous
     * element as a substring and returns false otherwise, as described in part (a)
     * Precondition: wordList contains at least two elements.
     * Postcondition: wordList is unchanged.
     */
    public boolean isWordChain() 
    {
        for(int i = 1; i < wordList.size(); i ++)
            {
                previous_word = wordList.get(i - 1);
                if(!wordList.get(i).contains(previous_word))
                   {
                    return false;
                   }
            }
        return true;
            
            
    }

    /**
     * Returns an ArrayList<String> based on strings from wordList that start
     * with target, as described in part (b). Each element of the returned ArrayList
     * has had
     * the initial occurrence of target removed.
     * Postconditions: wordList is unchanged.
     * Items appear in the returned list in the same order as they appear in
     * wordList.
     */
    public ArrayList<String> createList(String target) {
        /* to be implemented in part (b) */ }
}
