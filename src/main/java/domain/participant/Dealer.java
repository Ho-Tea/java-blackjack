package domain.participant;

import static domain.BlackjackGame.DEALER_HIT_THRESHOLD;
import static domain.result.GameResultStatus.PUSH;
import static domain.result.GameResultStatus.LOSE;
import static domain.result.GameResultStatus.WIN;

import domain.card.Card;
import domain.card.Cards;
import domain.result.GameResultStatus;

public class Dealer extends Participant {

    private static final Name DEFAULT_DEALER_NAME = new Name("딜러");

    private final Cards deck;

    public Dealer(final Cards cards) {
        super(DEFAULT_DEALER_NAME);
        deck = cards;
    }

    public Card peek() {
        return hand.peek();
    }

    public Card drawCard() {
        return deck.draw();
    }

    public void shuffleCards() {
        deck.shuffle();
    }

    public void deal(final Participant participant) {
        participant.receive(drawCard());
    }

    public boolean canHit() {
        return cardSum() <= DEALER_HIT_THRESHOLD;
    }

    public GameResultStatus resultStatusOf(final Player player) {
        if (isPush(player)) {
            return PUSH;
        }
        if (isWin(player)) {
            return WIN;
        }
        return LOSE;
    }

    private boolean isPush(final Player player) {
        return isBothBust(player) || this.cardSum() == player.cardSum();
    }

    private boolean isWin(final Player player) {
        return !player.isBust()
                && (isBust() || (cardSum() < player.cardSum()));
    }

    private boolean isBothBust(final Player player) {
        return isBust() && player.isBust();
    }
}
