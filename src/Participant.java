public class Participant {
    protected String Name;
    protected int ID;
    protected String Email;

    public Participant(String name, int ID, String email) {
        this.Name = name;
        this.ID = ID;
        this.Email = email;
    }

    public String getName() {
        return Name;
    }

    public int getID() {
        return ID;
    }

    public String getEmail() {
        return Email;
    }

    public void display() {
        System.out.println("Participant Name: " + getName());
        System.out.println("Participant ID: " + getID());
        System.out.println("Participant Email: " + getEmail());
    }
}
