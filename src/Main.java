import javax.swing.*;

public class Main {
    public static void soma(int vetor[]){
        int soma = 0;
        for (int i = 0; i < vetor.length; i++){
            soma += vetor[i];
        }
        JOptionPane.showMessageDialog(null, "A somatória é " + soma);
    }
    public static int multiplica(int vetor[]){
        int resultado = 1;
        for (int i = 0; i < vetor.length; i++){
            resultado *= vetor[i];
        }
        return resultado;
    }
    public static void main(String args[]) {
        int vetor[] = new int[5];
        int produto;
        int sum;
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o número que será colocado na posição " + (i+1) + " da lista"));+2
        }
        soma(vetor);
        produto = multiplica(vetor);
        JOptionPane.showMessageDialog(null, "A produtoria é " + produto);

        System.exit(0);
    }
}