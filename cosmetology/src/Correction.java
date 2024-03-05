public class Correction extends Cosmetology {
    private String operation;
    private boolean tattoo;

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public boolean isTattoo() {
        return tattoo;
    }

    public void setTattoo(boolean tatoo) {
        this.tattoo = tatoo;
    }

    public Correction(String procedure, String operation, boolean tattoo, int totalCost, int time) {
        super(procedure,totalCost,time);

        this.operation = operation;
        this.tattoo=tattoo;


    }public String printInfo() {
        return ("\nProcedure : " + getProcedure() + "\nOperation name : "+getOperation()+"\nYou do it fo first time? "+isTattoo()+  "\nprice ($) : "+getTotalCost() + "\ntime(min)  : "+getTime() + "\n____________________" );
    }
}
