public class WinnerState implements GumballState{
    GumballMachine gm;


    public WinnerState(GumballMachine gm){
        this.gm = gm;
    }
    public void insertQuarterBehavior() {
        System.out.println("Please wait, we're already giving you gumballs");
    }

    @Override
    public void ejectQuarterBehavior() {
        System.out.println("Sorry, you already turned the crank");
    }

    @Override
    public void turnCrankBehavior() {
        System.out.println("Turning twice doesn't get you another gumball");
    }

    @Override
    public void dispenseBehavior() {
        System.out.println("You Winned an Extra Gumball");
        gm.winnerPromoSold();
        if(gm.getCount() <= 0)
            gm.setState(gm.getSoldOut());
        else
            gm.setState(gm.getNoQuarter());
    }

    @Override
    public String printBehavior() {
        return "We have a Winner!";
    }
}
