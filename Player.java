import java.util.ArrayList;

public class Player {
    private ArrayList<Card> hand; // The cards in the player's hand.

    /*Constructor*/
    Player(){
        //VOTRE CODE VIENT ICI
        this.hand = new ArrayList<Card>();
    }
    /*Accessor*/
    public ArrayList<Card> getHand() {
        //VOTRE CODE VIENT ICI
        return this.hand;
    }

    /*** Remove all cards from the hand, leaving it empty. */
    public void clear() {
        //VOTRE CODE VIENT ICI
        hand.clear();
    }

    /*** Add a card to the hand. It is added at the end of the current hand.
     * @param card the non-null card to be added.
     * @throws NullPointerException if the parameter card is null.
     */
    public void add(Card card) {
        //VOTRE CODE VIENT ICI
        if(card == null){
            throw new NullPointerException("La carte est nul");
        }
        else{
            hand.add(card);
        }
        
    }

    /** * Remove a card from the hand, if present.
     * @param card the card to be removed. If card is null or if the card is not in
     * the hand, then nothing is done.
     */
    public void remove(Card card) {
        //VOTRE CODE VIENT ICI
        hand.remove(card);
    }

    /*** Remove the card in a specified position from the hand.
     * @param position the position of the card that is to be removed, where
     * positions are numbered starting from zero.
     * @throws IllegalArgumentException if the position does not exist in
     * the hand, that is if the position is less than 0 or greater than
     * or equal to the number of cards in the hand.
     */
    public void remove(int position) {
        //VOTRE CODE VIENT ICI
        if( position < 0 || position > hand.size() ){
            throw new IllegalArgumentException("Il n'y a aucune carte a cet entroit");
        }
        else{
            hand.remove(position);
        }
    }

    /*** Returns the number of cards in the hand. */
    public int totalCards() {
        //VOTRE CODE VIENT ICI

        return hand.size();
    }

    /*** Gets the card in a specified position in the hand. (Note that this card
     * is not removed from the hand!)
     * @param position the position of the card that is to be returned
     * @throws IllegalArgumentException if position does not exist in the hand
     */
    public Card getCard(int position) {
        //VOTRE CODE VIENT ICI
        if( position < 0 || position > hand.size() ){
            throw new IllegalArgumentException("Il n'y a aucune carte a cet entroit");
        }
        return hand.get(position);
    }

    /** * Computes and returns the total value of this hand in the game */
    public int getHandTotal () {
        //VOTRE CODE VIENT ICI
        int counter = 0;
        //boolean aceStatus = false;

        for (int i = 0; i < hand.size(); i++) {
            int value = hand.get(i).getValue();
            if(value>=10){
                counter = counter + 10;
            }
            else if(value==1){
                if(11 + counter > 21){
                    counter = counter + 1;
                }
                else{
                    counter = counter + 11;
                }
            }
            else{
                counter = counter + value;
            }
        }
        return counter;
    }


    /** * Sorts the cards in the hand so that cards of the same color are
     * grouped together, and within a color the cards are sorted by value.
     * Note that aces are considered to have the lowest value, 1.
     */
    public void sortByColor() {
        //VOTRE CODE VIENT ICI
        ArrayList<Card> colorHand = new ArrayList<Card>();
        colorHand.add(hand.get(0));
    }

    /*** Sorts the cards in the hand so that cards of the same value are
     * grouped together. Cards with the same value are sorted by color.
     * Note that aces are considered to have the lowest value, 1.
     */
    public void sortByValue() {
        //VOTRE CODE VIENT ICI

    }
}// end class Player