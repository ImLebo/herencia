public class Subject {

    private String name_subject = "";
    private int hours_subject;
    
    public Subject(String name_subject, int hours_subject) {
        this.name_subject = name_subject;
        this.hours_subject = hours_subject;
    }

    public String getName_subject() {
        return name_subject;
    }

    public void setName_subject(String name_subject) {
        this.name_subject = name_subject;
    }

    public int getHours_subject() {
        return hours_subject;
    }

    public void setHours_subject(int hours_subject) {
        this.hours_subject = hours_subject;
    }

    
}
