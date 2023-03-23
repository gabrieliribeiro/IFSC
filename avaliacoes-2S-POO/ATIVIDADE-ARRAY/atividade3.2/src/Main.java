import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        UniaoArray uniao = new UniaoArray();

        JOptionPane.showMessageDialog(null, "Infome 7 números para o primeiro Array! ");
        int array11=Integer.parseInt(JOptionPane.showInputDialog("Valor 1°: "));
        int array12=Integer.parseInt(JOptionPane.showInputDialog("Valor 2°: "));
        int array13=Integer.parseInt(JOptionPane.showInputDialog("Valor 3°: "));
        int array14=Integer.parseInt(JOptionPane.showInputDialog("Valor 4°: "));
        int array15=Integer.parseInt(JOptionPane.showInputDialog("Valor 5°: "));
        int array16=Integer.parseInt(JOptionPane.showInputDialog("Valor 6°: "));
        int array17=Integer.parseInt(JOptionPane.showInputDialog("Valor 7°: "));

        uniao.setV1(array11, array12, array13, array14, array15, array16, array17);

        JOptionPane.showMessageDialog(null, "Infome 7 números para o segundo Array! ");
        int array21=Integer.parseInt(JOptionPane.showInputDialog("Valor 1°: "));
        int array22=Integer.parseInt(JOptionPane.showInputDialog("Valor 2°: "));
        int array23=Integer.parseInt(JOptionPane.showInputDialog("Valor 3°: "));
        int array24=Integer.parseInt(JOptionPane.showInputDialog("Valor 4°: "));
        int array25=Integer.parseInt(JOptionPane.showInputDialog("Valor 5°: "));
        int array26=Integer.parseInt(JOptionPane.showInputDialog("Valor 6°: "));
        int array27=Integer.parseInt(JOptionPane.showInputDialog("Valor 7°: "));

        uniao.setV2(array21, array22, array23, array24, array25, array26, array27);

        JOptionPane.showMessageDialog(null, uniao.union());
    }
}