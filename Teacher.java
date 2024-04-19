import java.util.ArrayList;

public class Teacher extends Person {
    
    private String teacher_id = "";
    private ArrayList<Subject> subject_taugh = new ArrayList<>();
    private ArrayList<String> classrooms = new ArrayList<>();

    public Teacher(String user_name, String lastname, String document, String gender, String teacher_id,
            ArrayList<Subject> subject_taugh, ArrayList<String> classrooms) {
        super(user_name, lastname, document, gender);
        this.teacher_id = teacher_id;
        this.subject_taugh = subject_taugh;
        this.classrooms = classrooms;
    }

    public void addSubjectTaugh(Subject subject){
        subject_taugh.add(subject);
    }

    public int get_subject_hours(String name_subject){
        int subject_hours = 0;
        
        for (int i = 0; i < subject_taugh.size(); i++) {
            Subject subject = subject_taugh.get(i);
            if (subject.getName_subject().equalsIgnoreCase(name_subject)) {
                subject_hours += subject.getHours_subject();
            }
        }

        return subject_hours;
    }
}
