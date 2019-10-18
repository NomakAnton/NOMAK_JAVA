public class Human {
    private final int MAX_CARDS_COUNT = 5;
    private String name;
    private Card cards[];
    private int currentCardsCount;
    private int cash;

    public Human(String name){
        this.name = name;
        this.cards = new Card[MAX_CARDS_COUNT];
        this.currentCardsCount = 0;
        this.cash = 0;
    }

    public void addCard(Card card){
        this.cards[currentCardsCount] = card;
        currentCardsCount++;
    }
    public void takeCash(ATM atm,int cardNumber,int pin,int sum){
        Card card = getCardByNumber(cardNumber);
        if(card != null){

            int cash = atm.giveMiney(card,pin,sum);
            if (cash>= 0){
                this.cash += cash;
            }
            else {
                System.out.println("Увы, но не сегодня");
            }
        }
    }
    private Card getCardByNumber(int cardNumber){
        for (int i = 0; i <  currentCardsCount ; i++) {
            if(cardNumber == cards[i].getCardNumber()){
                return cards[i];
            }
        }
        System.out.println("У меня нет такой карты");
        return null;

    }

    public int getCash() {
        return cash;
    }
}
