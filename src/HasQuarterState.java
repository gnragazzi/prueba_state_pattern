public class HasQuarterState implements GumballState{
    private GumballMachine gm;

    public HasQuarterState(GumballMachine gm) {
        this.gm = gm;
    }

    @Override
    public void insertQuarterBehavior() {
        System.out.println("You can't insert another quarter");
    }

    @Override
    public void ejectQuarterBehavior() {
        System.out.println("Quarter returned");
        gm.setState(gm.getNoQuarter());
    }

    @Override
    public void turnCrankBehavior() {
        System.out.println("You turned the crank");
        if(gm.isWinner()){
            gm.setState(gm.getWinner());
        }
        else {
            gm.setState(gm.getSold());
        }
        gm.dispense();
    }

    @Override
    public void dispenseBehavior() {
        System.out.println("No gumball dispensed");
    }

    @Override
    public String printBehavior() {
        return "Machine has a Quarter";
    }
}
