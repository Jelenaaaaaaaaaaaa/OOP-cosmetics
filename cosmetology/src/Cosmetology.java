import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Cosmetology {
    private String procedure;
    private int totalCost;
    private int time;

    public String getProcedure() {
        return procedure;
    }

    public void setProcedure(String procedure) {
        this.procedure = procedure;
    }

    public int getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(int totalCost) {
        this.totalCost = totalCost;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }


    public Cosmetology ( String procedure, int toralCost, int time){
        this.procedure = procedure;
        this.totalCost=toralCost;
        this.time=time;
    }
    public String printInfo() {
        return ("\nProcedure : " + procedure + "\nprice ($) : "+totalCost + "\ntime(min)  : "+time + "\n____________________" );
    }
    public void writeFile(ArrayList<Cosmetology> ListToWrite) {
        try {
            FileWriter fw = new FileWriter("Cosmetology.txt");

            for (Cosmetology i : ListToWrite) {
                fw.write(i.printInfo());
            }
            fw.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
