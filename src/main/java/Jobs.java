/**
 * Created by MainUser on 09.11.2014.
 */
public class Jobs {
    String companyname;
    String duties;

    public Jobs(String companyname, String duties){
        this.companyname = companyname;
        this.duties = duties;
    }

    @Override
    public String toString() {
        return this.companyname + " " + this.duties;
    }
}
