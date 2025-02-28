public abstract class GumballState {
    GumballMachineWithState gumballMachine;

    public GumballState(GumballMachineWithState gm){
        this.gumballMachine = gm;
    }

    public abstract GumballState insertQuarterBehavior();
    public abstract GumballState ejectQuarterBehavior();
    public abstract GumballState turnCrankBehavior();
    public abstract GumballState dispenseBehavior();
    public abstract String printBehavior();
}
