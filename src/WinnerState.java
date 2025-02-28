public class WinnerState extends GumballState{
    public WinnerState(GumballMachineWithState gumballMachine){
        super(gumballMachine);
    }
    public GumballState insertQuarterBehavior() {
        System.out.println("Please wait, we're already giving you gumballs");
        return this;
    }

    @Override
    public GumballState ejectQuarterBehavior() {
        System.out.println("Sorry, you already turned the crank");
        return this;
    }

    @Override
    public GumballState turnCrankBehavior() {
        System.out.println("Turning twice doesn't get you another gumball");
        return this;
    }

    @Override
    public GumballState dispenseBehavior() {
        System.out.println("You Winned an Extra Gumball");
        gumballMachine.winnerPromoSold();
        if(gumballMachine.getCount() <= 0)
            return new SoldOutState(gumballMachine);
        else
            return new NoQuarterState(gumballMachine);
    }

    @Override
    public String printBehavior() {
        return "We have a Winner!";
    }
}
