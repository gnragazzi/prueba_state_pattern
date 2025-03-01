public class SoldState implements GumballState {
    GumballMachine gm;

    public SoldState(GumballMachine gm) {
        this.gm = gm;
    }

    @Override
    public void insertQuarterBehavior() {
        System.out.println("Please wait, we're already giving you a gumball");
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
        System.out.println("A gumball comes rolling out the slot");
        gm.gumballSold();
        if(gm.getCount() == 0)
            gm.setState(gm.getSoldOut());
        else
            gm.setState(gm.getNoQuarter());
    }

    @Override
    public String printBehavior() {
        return "Gumball sold";
    }
}
