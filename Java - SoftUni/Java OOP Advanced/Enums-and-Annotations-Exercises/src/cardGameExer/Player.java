package cardGameExer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;


public class Player {

    private String name;
    private Set<Card> hand;

    public Player(String name) {
        this.name = name;
        this.hand = new HashSet<>();
    }

    public Card getHighestCard() {
        return this.hand.stream()
                .sorted(Collections.reverseOrder())
                .findFirst().orElse(null);
    }

    public String getName() {
        return name;
    }

    public int getSize() {
        return this.hand.size();
    }

    public void addCard(Card card) {
        this.hand.add(card);
    }


}
