import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class HelloWord {
    public static void main(String args[]) {
        double largura, comprimento, valor, areaTotal, precoTerreno;

        largura = Double.parseDouble(JOptionPane.showInputDialog("Digite a largura do terreno"));
        comprimento = Double.parseDouble(JOptionPane.showInputDialog("Digite o comprimento do terreno"));
        valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do metro quadrado"));

        areaTotal = largura * comprimento;
        precoTerreno = areaTotal * valor;

        DecimalFormat decimal = new DecimalFormat("0.00");
        String areaFormatada = decimal.format(areaTotal);
        String precoFormatado = decimal.format((precoTerreno));

        JOptionPane.showInputDialog(null, "A area total é " + areaFormatada
                + " e o valor do terreno é " + precoFormatado);
    }
}
