package cards;

/**
 * Represents the suits of playing cards.
 */
public enum Suit {
    /**
     * Represents the Hearts suit.
     */
    HEARTS("♥︎"),
    /**
     * Represents the Diamonds suit.
     */
    DIAMONDS("♦︎"),
    /**
     * Represents the Clubs suit.
     */
    CLUBS("♣︎"),
    /**
     * Represents the Spades suit.
     */
    SPADES("♠︎");

    /**
     * Create Suit attributes.
     */
    private final String color;

    /**
     * Constructor.
     *
     * @param color of the card as a String.
     */
    Suit(String color) {
        this.color = color;
    }

    /**
     * Returns a string representation of the suit.
     *
     * @return A string representing the suit.
     */
    @Override
    public String toString() {
        return this.color;
    }
}
