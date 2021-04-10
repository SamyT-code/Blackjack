import java.util.Random;

public class Deck {
    private Card[] deck; // an array of 52 cards.
    private int number; //the number of cards that have been dealt from the deck

    public Deck() {
        //VOTRE CODE VIENT ICI
        this.deck = new Card[52]; 
        this.number = 0;

        int counter = 0;
        while(counter < 52){
            for(int i = 1; i < 14; i++){
                for(int j = 0; j < 4; j++){
                        this.deck[counter] = new Card(i,j);
                        counter++;
                }
            }
        }
    }

    /*** Put all the used cards back into the deck (if any), and shuffle the deck into a random order. */
    public void shuffle() {
        //VOTRE CODE VIENT ICI
        Random rand = new Random();
		
		for (int i = 0; i < deck.length; i++) {
			int randomIndexToSwap = rand.nextInt(deck.length);
			Card temp = deck[randomIndexToSwap];
			deck[randomIndexToSwap] = deck[i];
			deck[i] = temp;
		}

    }

    /*** Returns the number of cards left in the deck. */
    public int numberLeft() {
        //VOTRE CODE VIENT ICI
        return 52 - this.number;
    }

    /*** Removes the next card from the deck and return it. It is illegal to call this method if there are no
     * more cards in the deck. You can check the number of cards remaining by calling the numberLeft()
     * function.
     * @return the card which is removed from the deck.
     * @throws IllegalStateException if there are no cards left in the deck
     */
    public Card take() {
        //VOTRE CODE VIENT ICI
        if(this.numberLeft() == 0){
            throw new IllegalStateException("There are no more cards");
        }
        Card tmp = this.deck[this.numberLeft()-1];
        this.number++;
        return tmp;
    }

    /*
    public static void main(String[] args) {
        Deck a = new Deck();
        for (int i = 0; i < a.deck.length; i++) {
            System.out.println("#"+ i + " " +a.deck[i]);
        }
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("Now we Shuffle: ");
        a.shuffle();
        for (int i = 0; i < a.deck.length; i++) {
            System.out.println("#"+ i + " " +a.deck[i]);
        }

        System.out.println();
        System.out.println();
        System.out.println("The amount of cards left is: " + a.numberLeft());

        System.out.println();
        System.out.println();

        while(true){
            System.out.println("take: "+ a.take());
            System.out.println("The amount of cards left is: " + a.numberLeft());
        }
        
        
    }
    */

} // end class Deck
