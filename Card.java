// Samy Touabi
public class Card {
    private final int color; // Card's color
    private final int value; //Card's value (1 - 13, with 1 representing ACE).
    /*** Codes for the colors and non-numeric cards. Cards 2 through 10 have their numerical values
    for their codes. **/
    public final static int CLUBS = 0;
    public final static int DIAMONDS = 1;
    public final static int HEARTS = 2;
    public final static int SPADES = 3;

    public final static int ACE = 1;
    public final static int JACK = 11;
    public final static int QUEEN = 12;
    public final static int KING = 13;

    /*** Constrcutor, that creates a card with a specified color and value.
    * @throws IllegalArgumentException if the parameter values are not in the ranges */
    public Card(int value, int color) {
        //VOTRE CODE VIENT ICI
        if(value < 1 || value > 13){
            throw new IllegalArgumentException("Value out of range. Must be between 1 and 13");
        }
        if(color < 0 || color > 3){
            throw new IllegalArgumentException("Invalid color");
        }
        this.value = value;
        this.color = color;
    }
    /*** Returns the color of this card.*/
    public int getColor() {
        //VOTRE CODE VIENT IC
        return this.color;
    }
    /*** Returns the value of this card.
    * @return the value, which is one of the numbers 1 through 13, inclusive for a regular card.*/
    public int getValue() {
    //VOTRE CODE VIENT ICI
    
        return this.value;
    }
    /*** Returns a String representation of the card's color.
    * @return one of the strings "Spades", "Hearts", "Diamonds", or "Clubs" */
    public String ColorToString() {
    //VOTRE CODE VIENT ICI
        if(this.color == 0){
            return "Clubs";
        }
        else if(this.color == 1){
            return "Diamonds";
        }
        else if(this.color == 2){
            return "Hearts";
        }
        else{
            return "Spades";
        }
    }

    /*** Returns a String representation of the card's value.
    * @return for a regular card, one of the strings "Ace", "2", ..., "10", "Jack", "Queen", or
    "King". */
    public String ValueToString() {
    //VOTRE CODE VIENT ICI
        String str;
        switch(this.value){
            case ACE:
                str = "Ace";
                break;
            case JACK:
                str = "Jack";
                break;
            case QUEEN:
                str = "Queen";
                break;
            case KING:
                str = "King";
                break;
            default:
                str = Integer.toString(this.value);
                break;
        }

        return str;
    }

    /*** Returns a string representation of this card, including both
    * its color and its value. Sample return values is: "Ace of Diamonds", */
    public String toString() {
        //VOTRE CODE VIENT ICI

        return this.ValueToString() + " of " + this.ColorToString();
    }

}// end class Card
