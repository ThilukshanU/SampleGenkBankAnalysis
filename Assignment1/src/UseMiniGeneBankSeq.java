/**
 * Created by Thilukshan on 2/11/2017.
 */
public class UseMiniGeneBankSeq {

    public static void main(String[] args) {

        //Reference : https://www.ncbi.nlm.nih.gov/nuccore/KP324830.1
        System.out.println("This is the test for using no argument constructor\n");
        MiniGenBankSeq seq1 = new MiniGenBankSeq();
        System.out.println(seq1.toString());
        seq1.setLocus("KP324830   82807 bp  DNA  circular BCT 26-JUL-2016");
        seq1.setAccessionNum("KP324830");
        seq1.setDefinition("Escherichia coli isolate FP671 plasmid pHNFP671, complete sequence.");
        seq1.setSource("Escherichia coli");
        System.out.println(seq1.toString());

        //Reference: https://www.ncbi.nlm.nih.gov/nuccore/NZ_LYDO01000004.1
        System.out.println("This is the test for using a two argument constructor\n");
        MiniGenBankSeq seq2 = new MiniGenBankSeq("NZ_LYDO01000004   501515 bp  DNA linear CON 22-DEC-2016",
                "NZ_LYDO01000004 NZ_LYDO00000000");
        System.out.println(seq2.toString());
        seq2.setDefinition("[Enterobacter] aerogenes strain Ea77 Contig_3, whole genome shotgun sequence.");
        seq2.setSource("[Enterobacter] aerogenes (Klebsiella mobilis)");
        System.out.println(seq2.toString());

        //Reference: https://www.ncbi.nlm.nih.gov/nuccore/FW584273.1
        System.out.println("This is the test for using a four argument constructor\n");
        MiniGenBankSeq seq3 = new MiniGenBankSeq("FW584273   17 bp  DNA linear  PAT 01-APR-2011", "FW584273",
                "JP 2010532665-A/223: NUCLEIC ACID SEQUENCES AND COMBINATION THERE OF FOR SENSITIVE AMPLIFICATION AND " +
                        "DETECTION OF BACTERIAL AND FUNGAL SEPSIS PATHOGENS.", "Enterobacter cloacae complex");
        System.out.println(seq3.toString());
    }
}
