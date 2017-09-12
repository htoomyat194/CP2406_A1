import java.util.ArrayList;
import java.util.Random;

public class Deck {
    //Create a Deck class that is based on the card lists in the .txt file
    private ArrayList<Card> Deck;

    Deck(ArrayList<Card> listOfcard){
        //Constructor of the Deck
        Deck = listOfcard;
    }

    public Card drawnCard(){
        //Remove the card when the player drawn the random card (prevent duplicate card)
        int rc = new Random().nextInt(Deck.size());
        Card getCard = Deck.get(rc);
        Deck.remove(rc);
        return getCard;
    }

    public ArrayList<Card> getCardDeckContent() {
        //Get the contents of the deck
        return Deck;
    }
}
