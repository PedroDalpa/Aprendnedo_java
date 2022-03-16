import javax.swing.JOptionPane;
import java.util.ArrayList;

public class Main {
    public static void main(String arg[]) {
        ArrayList<Client> clients = new ArrayList<Client>();

        for (int i = 0; i <=2; i++) {
            Client newClient = new Client(i);

            newClient.setName(JOptionPane.showInputDialog("Nome do Cliente " + i));
//            newClient.setLastName(JOptionPane.showInputDialog("Sobrenome do Cliente " + i));

            clients.add(newClient);
        }

        for (Client client : clients) {
            JOptionPane.showMessageDialog(null, client);
        }

        int removeID = Integer.parseInt(JOptionPane.showInputDialog("Remova o cliente pelo ID "));

        clients.remove(removeID);

        JOptionPane.showMessageDialog(null, clients);

        int clientID = Integer.parseInt(JOptionPane.showInputDialog("Busque o cliente pelo ID "));

        boolean findClient = false;

        for (Client client : clients) {
            if (client.getId() == clientID) {
                JOptionPane.showMessageDialog(null, client);
                findClient = true;
            }
        }

        if (!findClient){
            JOptionPane.showMessageDialog(null, "Não foi possivel localizar o cliente");
        }

        ArrayList<Item> itens = new ArrayList<Item>();

        Item itemA = new Item(1,1,20, "Cartela de Ovo");
        Item itemB = new Item(2,4,7, "Desodorante");

        itens.add(itemA);
        itens.add(itemB);

        Bill bill = new Bill(itens, 1, clients.get(0));

        JOptionPane.showMessageDialog(null,  bill.toString());

    }
}
