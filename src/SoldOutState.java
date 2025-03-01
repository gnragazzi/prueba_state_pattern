public class SoldOutState implements GumballState {
    GumballMachine gm;

    public SoldOutState(GumballMachine gm) {
        this.gm = gm;

    }

    @Override
    public void insertQuarterBehavior() {
        System.out.println("You can't insert a quarter: the machine is sold out");
    }

    @Override
    public void ejectQuarterBehavior() {
        System.out.println("You can't Eject... You haven't inserted a quarter.");
    }

    @Override
    public void turnCrankBehavior() {
        System.out.println("You turned, but there are no gumballs");
    }

    @Override
    public void dispenseBehavior() {
        System.out.println("No gumball dispensed");
    }

    @Override
    public String printBehavior() {
        return "Machine is out of gumballs";
    }
}
