public class Main
{
    public static void main(String[] args)
    {
        WordChecker test = new WordChecker();
        String[] words = {"at", "cat", "catch", "catchat", "catchatat"};
        test.add(words);
        System.out.println(test.getWordList());
        System.out.println(test.isWordChain());
    }
}

