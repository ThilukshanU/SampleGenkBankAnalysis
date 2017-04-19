/**
 * Created by Thilukshan on 2/5/2017.
 */
public class MiniGenBankSeq {

    private String loc;
    private String accessionNum;
    private String def;
    private String src;

    MiniGenBankSeq(){
        //Empty constructor
    }

    public MiniGenBankSeq(String locus, String accessionNumber){
        //Partial constructor
        loc = locus;
        accessionNum = accessionNumber;
    }

    public MiniGenBankSeq(String locus, String accessionNumber, String definition, String source){
        //Full constructor
        //Assign each argument to an instance variable
        loc = locus;
        accessionNum = accessionNumber;
        def = definition;
        src = source;
    }

    public String getLocus(){
        if (loc == null){
            return("Error! A valid value was not found for Locus!");
        }
        else {
            return loc;
        }
    }

    public void setLocus(String newLocus){
        loc = newLocus;
    }

    public String getAccessionNum(){
        if (accessionNum == null){
            return("Error! A valid value was not found for Accession Number!");
        }
        else {
            return accessionNum;
        }
    }

    public void setAccessionNum(String newAccessionNum){
        accessionNum = newAccessionNum;
    }

    public String getDefinition() {
        if (def == null){
            return("Error! A valid value was not found for Definition!");
        }
        else {
            return def;
        }
    }

    public void setDefinition(String newDefinition){
        def = newDefinition;
    }

    public String getSource(){
        if (src == null){
            return("Error! A valid value was not found for Source!");
        }
        else {
            return src;
        }
    }

    public void setSource(String newSource){
        src = newSource;
    }

    public String toString(){
        return ("Locus: " + getLocus() + "\nAccessionNum: " + getAccessionNum()
                + "\nDefinition: " + getDefinition() + "\nSource: " + getSource() + "\n" ) ;
    }
}
