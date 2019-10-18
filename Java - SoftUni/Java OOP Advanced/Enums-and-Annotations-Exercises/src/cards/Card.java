package cards;


public class Card implements Comparable<Card> {

    private CardSuit suit;
    private CardRank rank;

    public Card(CardSuit suit, CardRank rank) {
        this.suit = suit;
        this.rank = rank;
    }

    public int getPower() {
        return this.suit.getPower() + this.rank.getPower();
    }

    @Override
    public String toString() {
        return String.format("%s of %s", this.rank, this.suit);
    }

    @Override
    public int compareTo(Card card) {
        return this.getPower() - card.getPower();
    }
}
