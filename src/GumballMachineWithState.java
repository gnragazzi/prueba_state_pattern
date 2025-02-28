public class GumballMachineWithState{
    private int count;
    private int gumballsToWin;
    private int promo;
    GumballState gumballMachineState;

    public GumballMachineWithState(int count, int promo){
        this.count = count;
        this.promo = gumballsToWin = promo;
        if(count == 0)
            gumballMachineState = new SoldOutState(this);
        gumballMachineState = new NoQuarterState(this);
    }
    public void insertQuarter(){
        gumballMachineState = gumballMachineState.insertQuarterBehavior();
    }
    public void ejectQuarter(){
        gumballMachineState = gumballMachineState.ejectQuarterBehavior();
    }
    public void turnCranck(){
        gumballMachineState = gumballMachineState.turnCrankBehavior();
    }
    public void dispense(){
        gumballMachineState = gumballMachineState.dispenseBehavior();
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
        return s + gumballMachineState.printBehavior();
    }

    public void winnerPromoSold() {
        count -= 2;
        gumballsToWin = promo;
    }
}
