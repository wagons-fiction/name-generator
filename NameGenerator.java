public class NameGenerator {
    private SyllableGenerator syllableGenerator;

    public NameGenerator() {
        this.syllableGenerator = new SyllableGenerator();
    }

    public String generateName(int minSyllables, int maxSyllables) {
        int numberOfSyllables = Utils.getRandomNumber(minSyllables, maxSyllables);
        StringBuilder name = new StringBuilder();

        for (int i = 0; i < numberOfSyllables; i++) {
            name.append(syllableGenerator.generateSyllable());
        }

        return Utils.capitalizeFirstLetter(name.toString());
    }
}
