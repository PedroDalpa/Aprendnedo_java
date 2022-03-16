import javax.swing.JOptionPane;

public class HelloWorld {
    public static void main(String args[]){
        int age = 20;
        double height = 1.65;
        String name = "Pedro";
        boolean people = true;

        //System.out.println("Hello world!");

        JOptionPane.showMessageDialog(null, "Meu nome é "+name+", " +
                "3tenho "+age+" anos"+" e "+height+" de altura");
    }

}
