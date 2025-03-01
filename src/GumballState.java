public interface GumballState {
    public abstract void insertQuarterBehavior();
    public abstract void ejectQuarterBehavior();
    public abstract void turnCrankBehavior();
    public abstract void dispenseBehavior();
    public abstract String printBehavior();
}
