/**
 * Created by MainUser on 09.11.2014.
 */
public class DemoResume {

    public static void main(String[] args) {
        Resume resumeigor = new Resume("Igor", "Levintov", "Java, Python, Sql and etc",
                "17.10.91", new Education("SPB School", 17), new Jobs("inTaxi", "Some duties"));
        System.out.print(resumeigor);

    }
}
