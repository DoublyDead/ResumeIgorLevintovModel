/**
 * Created by MainUser on 09.11.2014.
 */
public class Resume {
    private String firstname, lastname, skills, birthday;
    private Education clienteducation;
    private Jobs clientjobs;

    public Resume(String firstname, String lastname, String skills, String birthday, Education education, Jobs jobs)
    {
        this.firstname = firstname;
        this.lastname = lastname;
        this.skills = skills;
        this.birthday = birthday;
        this.clienteducation = education;
        this.clientjobs = jobs;
    }

    @Override
    public String toString() {
        return "Имя: " + this.firstname + " " + this.lastname + "\r\n" + "Навыки: " +
                this.skills + "\r\n" + "Год рождения: "+ this.birthday + "\r\n" + "Предыдущее место работы: "+ this.clientjobs + "\r\n"
                + "Образование: " + this.clienteducation;
    }

    public Resume getResume(){
        return this;
    }
}
