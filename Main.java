public class Main {
    public static void main(String[] args) {
        int numberOfNames = 10;
        int minSyllables = 2;
        int maxSyllables = 4;

        NameGenerator nameGenerator = new NameGenerator();
        for (int i = 0; i < numberOfNames; i++) {
            String name = nameGenerator.generateName(minSyllables, maxSyllables);
            System.out.println(name);
        }
    }
}
