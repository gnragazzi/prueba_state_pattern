public class GumballMachine{
    final static int SOLD_OUT = 0;
    final static int NO_QUARTER = 1;
    final static int HAS_QUARTER = 2;
    final static int SOLD = 3;

    int state = SOLD_OUT;
    int count = 0;
    public GumballMachine(int count){
        this.count = count;
        if(count > 0){
            state = NO_QUARTER;
        }
    }
    public void insertQuarter(){
        if (state == HAS_QUARTER){
            System.out.println("You can't insert another quarter");
        } else if (state == SOLD_OUT){
            System.out.println("You can't insert a quarter: the machine is sold out");
        } else if (state == SOLD){
            System.out.println("Please wait, we're already giving you a gumball");
        } else if (state == NO_QUARTER){
            state = HAS_QUARTER;
            System.out.println("You inserted a quarter");
        }
    }
    public void ejectQuarter(){
        if (state == HAS_QUARTER){
            System.out.println("Quarter returned");
            state = NO_QUARTER;
        } else if (state == SOLD_OUT){
            System.out.println("You can't Eject... You haven't inserted a quarter.");
        } else if (state == SOLD){
            System.out.println("Sorry, you already turned the cranck");
        } else if (state == NO_QUARTER){
            System.out.println("You can't Eject... You haven't inserted a quarter.");
        }
    }
    public void turnCranck(){
        if (state == HAS_QUARTER){
            System.out.println("You turned the cranck");
            state = SOLD;
            dispense();
        } else if (state == SOLD_OUT){
            System.out.println("You Turned, but there are no gunballs");
        } else if (state == SOLD){
            System.out.println("Turning twice doesn't get you another gunball");
        } else if (state == NO_QUARTER){
            System.out.println("You Turned, but there are no quarters");
        }
    }
    public void dispense(){
        if (state == HAS_QUARTER){
            System.out.println("No gunball dispensed");
        } else if (state == SOLD_OUT){
            System.out.println("No gunball dispensed");
        } else if (state == SOLD){
            System.out.println("A gumball comes rolling out the slot");
            count -=1;
            if(count == 0){
                System.out.println("Out of gumballs");
                state = SOLD_OUT;
            }
            else state = NO_QUARTER;
        } else if (state == NO_QUARTER){
            System.out.println("No gunball dispensed");
        }
    }
    @Override
    public String toString(){
        String s ="Gumball count= "+ count+"\n";
        if (state == HAS_QUARTER){
           s += "Machine has a Quarter";
        } else if (state == SOLD_OUT){
            s += "Machine is out of gumballs";
        } else if (state == SOLD){
           s += "Gumball sold";
        } else if (state == NO_QUARTER){
          s += "Machine is waiting for quarter";
        }
        return s;
    }
}
