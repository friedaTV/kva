package cards.maumau;

import cards.Card;
import cards.Rank;
import cards.Suit;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Represents a deck of cards used in the Mau-Mau game.
 */
public class MauMauDeck {
    /**
     * Create MauMauDeck constants.
     */
    public final static int LOWEST_CARD_VALUE = 4;

    /**
     * Private constructor to prevent instantiation of this class.
     */
    private MauMauDeck() { /* do nothing */ }

    /**
     * Generates a deck of Mau-Mau cards and shuffles it.
     *
     * @param numDecks Number of decks to be included in the game.
     * @return A list containing the generated deck of cards.
     */
    public static List<Card> makeDeck(int numDecks) {
        List<Card> deck = new ArrayList<>();
        for (int index = 0; index < numDecks; index++) {
            for (Rank rank: Rank.values()) {
                if (rank.ordinal() > LOWEST_CARD_VALUE) {
                    for (Suit suit: Suit.values()) {
                        deck.add(new Card(rank, suit));
                    }
                }
            }
        }
        Collections.shuffle(deck);
        return deck;
    }
}
