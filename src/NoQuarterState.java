public class NoQuarterState implements GumballState {
    GumballMachine gm;

    public NoQuarterState(GumballMachine gm) {
        this.gm = gm;
    }

    @Override
    public void insertQuarterBehavior() {
        System.out.println("You inserted a quarter");
        gm.setState(gm.getHasQuarter());
    }

    @Override
    public void ejectQuarterBehavior() {
        System.out.println("You can't Eject... You haven't inserted a quarter.");
    }

    @Override
    public void turnCrankBehavior() {
        System.out.println("You Turned, but there are no quarters");
    }

    @Override
    public void dispenseBehavior() {
        System.out.println("No gumball dispensed");
    }

    @Override
    public String printBehavior() {
        return "Machine is waiting for quarter";
    }
}
