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
    public ArrayList<String> createList(String target) 
    {
        ArrayList<String> list = new ArrayList<String>();
        for(String s: wordList)
        {
            if(s.indexOf(target) == 0)
            {
                list.add(s.substring(target.length()));
            }
        }
        return list;
    }
}

