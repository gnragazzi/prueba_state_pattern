public class GumballMachine {
    private GumballState hasQuarter;
    private GumballState noQuarter;
    private GumballState sold;
    private GumballState soldOut;
    private GumballState winner;
    private GumballState state;

    private int count;
    private int gumballsToWin;
    private int promo;

    public GumballMachine(int count, int promo){
        hasQuarter = new HasQuarterState(this);
        noQuarter = new NoQuarterState(this);
        sold = new SoldState(this);
        soldOut = new SoldOutState(this);
        winner = new WinnerState(this);

        this.count = count;
        this.promo = gumballsToWin = promo;
        if(count == 0)
            state = soldOut;
        state = noQuarter;
    }
    public void insertQuarter(){
        state.insertQuarterBehavior();
    }
    public void ejectQuarter(){
        state.ejectQuarterBehavior();
    }
    public void turnCranck(){
        state.turnCrankBehavior();
    }
    public void dispense(){
        state.dispenseBehavior();
    }
    public void gumballSold(){
        this.count -= 1;
        this.gumballsToWin -= 1;
    }
    public boolean isWinner(){
        return gumballsToWin == 0;
    }
    public int getCount(){
        return this.count;
    }
    @Override
    public String toString(){
        String s = "Gumball count= " + count  + ".\n";
        s += "Promo: " + promo + ". Left to Winner: " + gumballsToWin + ".\n";
        return s + state.printBehavior();
    }

    public void winnerPromoSold() {
        count -= 2;
        gumballsToWin = promo;
    }


    public GumballState getHasQuarter() {
        return hasQuarter;
    }

    public void setHasQuarter(GumballState hasQuarter) {
        this.hasQuarter = hasQuarter;
    }

    public GumballState getNoQuarter() {
        return noQuarter;
    }

    public void setNoQuarter(GumballState noQuarter) {
        this.noQuarter = noQuarter;
    }

    public GumballState getSold() {
        return sold;
    }

    public void setSold(GumballState sold) {
        this.sold = sold;
    }

    public GumballState getSoldOut() {
        return soldOut;
    }

    public void setSoldOut(GumballState soldOut) {
        this.soldOut = soldOut;
    }

    public GumballState getWinner() {
        return winner;
    }

    public void setWinner(GumballState winner) {
        this.winner = winner;
    }

    public GumballState getState() {
        return state;
    }

    public void setState(GumballState state) {
        this.state = state;
    }
}
