public class Admin extends Person {
    
    private String admin_id = "";
    private String departament = "";
    
    public Admin(String user_name, String lastname, String document, String gender, String admin_id,
            String departament) {
        super(user_name, lastname, document, gender);
        this.admin_id = admin_id;
        this.departament = departament;
    }

    
}
