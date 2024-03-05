public class Skincare extends  Cosmetology      {
    private String skinType;
    private String productName;

    public String getSkinType() {
        return skinType;
    }

    public void setSkinType(String skinType) {
        this.skinType = skinType;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }


    //int skinCleaning;
    public Skincare(String procedure,String skinType,String productName , int totalCost, int time) {

        super(procedure,totalCost,time);
        this.skinType=skinType;
        this.productName = productName;
        //this.skinCleaning = skinCleaning;
    }
    public String printInfo() {
        return ("\nProcedure for your skin type : " + getProcedure() + " \nSkin type : "+ getSkinType()+"\nProducts : "+getProductName()+ "\nprice : "+getTotalCost() + " \ntime(min) : "+getTime()+ "\n____________________" );
    }

}
