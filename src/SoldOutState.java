public class SoldOutState extends GumballState {
    public SoldOutState(GumballMachineWithState gumballMachineWithState) {
        super(gumballMachineWithState);
    }

    @Override
    public GumballState insertQuarterBehavior() {
        System.out.println("You can't insert a quarter: the machine is sold out");
        return this;
    }

    @Override
    public GumballState ejectQuarterBehavior() {
        System.out.println("You can't Eject... You haven't inserted a quarter.");
        return this;
    }

    @Override
    public GumballState turnCrankBehavior() {
        System.out.println("You turned, but there are no gumballs");
        return this;
    }

    @Override
    public GumballState dispenseBehavior() {
        System.out.println("No gumball dispensed");
        return this;
    }

    @Override
    public String printBehavior() {
        return "Machine is out of gumballs";
    }
}
