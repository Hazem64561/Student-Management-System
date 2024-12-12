public class Instructor extends Participant {
    private boolean isDeleted;

    public Instructor(String name, int ID, String email) {
        super(name, ID, email);
        this.isDeleted = false;
    }

    @Override
    public void display() {
        if (!isDeleted) {
            System.out.println("Instructor Name: " + getName());
            System.out.println("Instructor ID: " + getID());
            System.out.println("Instructor Email: " + getEmail());
        } else {
            System.out.println("Instructor has been deleted.");
        }
    }

    public void edit(String newName, int newID, String newEmail) {
        if (!isDeleted) {
            this.Name = newName;
            this.ID = newID;
            this.Email = newEmail;
            System.out.println("Instructor edited: " + getName());
        } else {
            System.out.println("Cannot edit. Instructor has been deleted.");
        }
    }

    public void delete() {
        isDeleted = true;
        System.out.println("Instructor deleted: " + getName());
    }
}
