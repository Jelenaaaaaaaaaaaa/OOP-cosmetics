public class Massage extends Cosmetology {
    private boolean plastic ;
    private boolean health;

    public boolean isPlastic() {
        return plastic;
    }

    public void setPlastic(boolean plastic) {
        this.plastic = plastic;
    }

    public boolean isHealth() {
        return health;
    }

    public void setHealth(boolean health) {
        this.health = health;
    }


    public Massage (String procedure,boolean plastic,boolean health, int totalCost, int time) {

        super(procedure,totalCost,time);
        this.plastic = plastic;
        this.health = health;

    }
    public String printInfo() {
        return ("\nProcedure : " + getProcedure() +"\nThis procedure give correction effect - " +isPlastic()+"\nThis procedure give health effect - " +isHealth()+  "\nprice ($) : "+getTotalCost() + "\ntime(min)  : "+getTime() + "\n____________________" );
    }
}
