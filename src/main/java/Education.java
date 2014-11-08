/**
 * Created by MainUser on 09.11.2014.
 */
public class Education {
    String schoolname;
    int schoolnumber;

    public Education(String schoolname, int schoolnumber){
        this.schoolname = schoolname;
        this.schoolnumber = schoolnumber;
    }

    @Override
    public String toString() {
        return this.schoolname + " " + this.schoolnumber;
    }
}
