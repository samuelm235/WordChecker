import java.util.ArrayList;

public class Main
{
    public static void main(String[] args)
    {
        ArrayList<String> words = new ArrayList<String>();
        ArrayList<String> words_again = new ArrayList<String>();
        ArrayList<String> words_again_again = new ArrayList<String>();
        words.add("catch");
        words.add("bobcat");
        words.add("catchacat");
        words.add("cat");
        words.add("at");
        words_again.add("an");
        words_again.add("band");
        words_again.add("band");
        words_again.add("abandon");
        words_again_again.add("to");
        words_again_again.add("too");
        words_again_again.add("stool");
        words_again_again.add("tools");
        WordChecker x = new WordChecker(words);
        WordChecker y = new WordChecker(words_again);
        WordChecker z = new WordChecker(words_again_again);
        System.out.println(y.getWordList());
        System.out.println(y.isWordChain());
        System.out.println(z.getWordList());
        System.out.println(z.isWordChain());
        System.out.println(x.getWordList());
        System.out.println(x.isWordChain());
        System.out.println(x.createList("cat"));
        System.out.println(x.createList("catch"));
        System.out.println(x.createList("dog"));
    }
}
