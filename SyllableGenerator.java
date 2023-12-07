public class SyllableGenerator {
    private static final String[] vowels = {"a", "e", "i", "o", "u"};
    private static final String[] consonants = {"b", "c", "d", "f", "g", "h", "j", "k", "l", "m", "n", "p", "q", "r", "s", "t", "v", "w", "x", "y", "z"};

    public String generateSyllable() {
        StringBuilder syllable = new StringBuilder();

        syllable.append(Utils.getRandomElement(consonants));
        syllable.append(Utils.getRandomElement(vowels));
        syllable.append(Utils.getRandomElement(consonants));

        return syllable.toString();
    }
}
