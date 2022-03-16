import javax.swing.JOptionPane;

public class Client {

    private int id;
    private String name, lastName;

    public Client(int id) {
        this.id = id;
    }

    public void setName(String name) {
        JOptionPane.showMessageDialog(null, name);
        this.name = name;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
