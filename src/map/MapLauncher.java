package map;

import java.util.*;

public class MapLauncher {

    public static void main(String[] args) {

        Map<String, Integer> wordMap = new HashMap<>();

        System.out.println("Please, enter some text");
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        String[] tokens = string.split(" ");
        for (String token : tokens) {
            String word = token.toLowerCase();
            Integer count = wordMap.get(word);
            if (count == null) {
                wordMap.put(word, 1);
            } else {
                wordMap.put(word, ++count);
            }
        }

        NavigableSet<WordWrapper> wordWrappers = convertToSet(wordMap);
        printSet(wordWrappers);

    }

    private static NavigableSet<WordWrapper> convertToSet(Map<String, Integer> wordMap) {
        wordMap.remove("&");
        wordMap.remove("24");
        wordMap.remove("96");
        wordMap.remove("72");
        wordMap.replace("brewers", 100);
        NavigableSet<WordWrapper> wordSet = new TreeSet<>();
        for (Map.Entry<String, Integer> e : wordMap.entrySet()) {
            wordSet.add(new WordWrapper(e.getKey(), e.getValue()));

        }
        Collections.unmodifiableSet(wordSet);
        return new TreeSet<>(wordSet);
    }

//    Comparator comparator = new Comparator() {
//        @Override
//        public int compare(Object o1, Object o2) {
//            return 0;
//        }
//    }

    private static void printSet(NavigableSet<WordWrapper> wordWrappers) {
        for (WordWrapper wordWrapper : wordWrappers) {
            System.out.println(wordWrapper);
        }


    }


}
