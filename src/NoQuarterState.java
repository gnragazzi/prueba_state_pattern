public class NoQuarterState extends GumballState {
    public NoQuarterState(GumballMachineWithState gm) {
        super(gm);
    }

    @Override
    public GumballState insertQuarterBehavior() {
        System.out.println("You inserted a quarter");
        return new HasQuarterState(gumballMachine);
    }

    @Override
    public GumballState ejectQuarterBehavior() {
        System.out.println("You can't Eject... You haven't inserted a quarter.");
        return this;
    }

    @Override
    public GumballState turnCrankBehavior() {
        System.out.println("You Turned, but there are no quarters");
        return this;
    }

    @Override
    public GumballState dispenseBehavior() {
        System.out.println("No gumball dispensed");
        return this;
    }

    @Override
    public String printBehavior() {
        return "Machine is waiting for quarter";
    }
}
