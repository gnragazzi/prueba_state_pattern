public class SoldState extends GumballState {
    public SoldState(GumballMachineWithState gumballMachine) {
        super(gumballMachine);
    }

    @Override
    public GumballState insertQuarterBehavior() {
        System.out.println("Please wait, we're already giving you a gumball");
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
        System.out.println("A gumball comes rolling out the slot");
        gumballMachine.gumballSold();
        if(gumballMachine.getCount() == 0)
            return new SoldOutState(gumballMachine);
        else
            return new NoQuarterState(gumballMachine);
    }

    @Override
    public String printBehavior() {
        return "Gumball sold";
    }
}
