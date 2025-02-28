public class HasQuarterState extends GumballState{
    public HasQuarterState(GumballMachineWithState gm) {
        super(gm);
    }

    @Override
    public GumballState insertQuarterBehavior() {
        System.out.println("You can't insert another quarter");
        return this;
    }

    @Override
    public GumballState ejectQuarterBehavior() {

        System.out.println("Quarter returned");
        return new NoQuarterState(gumballMachine);
    }

    @Override
    public GumballState turnCrankBehavior() {
        System.out.println("You turned the crank");
        GumballState soldState ;
        if(gumballMachine.isWinner()){
            soldState = new WinnerState(gumballMachine);
        }
        else {
            soldState = new SoldState(gumballMachine);
        }
        return soldState.dispenseBehavior();
    }

    @Override
    public GumballState dispenseBehavior() {
        System.out.println("No gumball dispensed");
        return this;
    }

    @Override
    public String printBehavior() {
        return "Machine has a Quarter";
    }
}
