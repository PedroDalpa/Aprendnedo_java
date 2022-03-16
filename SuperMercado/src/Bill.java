import java.text.DecimalFormat;
import java.util.ArrayList;

public class Bill {

    private ArrayList<Item> itens = new ArrayList<Item>();
    private int id;
    private double totalValue;
    private Client client;

    public Bill(ArrayList<Item> itens, int id, Client client) {
        this.itens = itens;
        this.id = id;
        this.client = client;
    }

    public String getTotalValue() {
        this.totalValue = 0;
        DecimalFormat format = new DecimalFormat("0.00");

        for (Item iten : this.itens) {
            this.totalValue += iten.getPrice() * iten.getQuantity();
        }

        String formatedToTalValue = format.format(this.totalValue);

        return formatedToTalValue;
    }

    @Override
    public String toString() {
        return "Bill{" +
                "itens=" + itens +
                ", id=" + id +
                ", totalValue=" + getTotalValue() +
                ", client=" + client.getName() +
                '}';
    }
}
