public class Student extends Participant {
    private boolean isDeleted;

    public Student(String name, int ID, String email) {
        super(name, ID, email);
        this.isDeleted = false;
    }

    @Override
    public void display() {
        if (!isDeleted) {
            System.out.println("Student Name: " + getName());
            System.out.println("Student ID: " + getID());
            System.out.println("Student Email: " + getEmail());
        } else {
            System.out.println("Student has been deleted.");
        }
    }

    public void edit(String newName, int newID, String newEmail) {
        if (!isDeleted) {
            this.Name = newName;
            this.ID = newID;
            this.Email = newEmail;
            System.out.println("Student edited: " + getName());
        } else {
            System.out.println("Cannot edit. Student has been deleted.");
        }
    }

    public void delete() {
        isDeleted = true;
        System.out.println("Student deleted: " + getName());
    }

}

