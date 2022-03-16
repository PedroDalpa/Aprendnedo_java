import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class CalcImc {
    public static void main(String args[]) {
        double weight, height, imc;

        height = Double.parseDouble(JOptionPane.showInputDialog("Digite sua altura"));
        weight = Double.parseDouble(JOptionPane.showInputDialog("Digite seu peso"));

        imc = weight / (height * height);

        DecimalFormat format = new DecimalFormat("0.00");

        String formatedIMC = format.format(imc);

        if (imc >= 18.5 && imc <= 24.9) {
            JOptionPane.showMessageDialog(null, "Seu IMC é " + formatedIMC
                    + " - está no seu peso normal");
        } else if (imc >= 25 && imc <= 29.9) {
            JOptionPane.showMessageDialog(null, "Seu IMC é " + formatedIMC
                    + " - está com sobrepeso");
        } else if (imc >= 30 && imc <= 34.9) {
            JOptionPane.showMessageDialog(null, "Seu IMC é " + formatedIMC
                    + " - está com Obesidade 1");
        } else if (imc >= 35 && imc <= 39.9) {
            JOptionPane.showMessageDialog(null, "Seu IMC é " + formatedIMC
                    + " - está com Obesidade 2");
        } else if (imc >= 40) {
            JOptionPane.showMessageDialog(null, "Seu IMC é " + formatedIMC
                    + " - está com Obesidade 3");
        } else {
            JOptionPane.showMessageDialog(null, "Seu IMC é " + formatedIMC
                    + " - está com peso baixo");
        }
    }
}
