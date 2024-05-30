package cards;

/**
 * Represents the ranks of playing cards.
 */
public enum Rank {
    TWO("2"),
    THREE("3"),
    FOUR("4"),
    FIVE("5"),
    SIX("6"),
    SEVEN("7"),
    EIGHT("8"),
    NINE("9"),
    TEN("10"),
    JACK("J"),
    QUEEN("Q"),
    KING("K"),
    ACE("A");

    /**
     * Create Rank attributes.
     */
    private final String symbol;

    /**
     * Constructor.
     *
     * @param symbol as the symbol of this rank as a String.
     */
    Rank(String symbol) {
        this.symbol = symbol;
    }

    /**
     * Returns a string representation of the rank.
     *
     * @return A string representing the rank.
     */
    @Override
    public String toString() {
        return this.symbol;
    }
}
