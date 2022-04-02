
package agd8;

import javax.swing.JOptionPane;

public class AGd8 {

    public static void main(String[] args) {

    int idade;
    int cont = 0;
    int otimo = 0;
    int bom = 0;
    int regular = 0;
    int ruim = 0;
    int pessimo = 0;
    int idaderuim = 0;
    double percentual, media;
    char aval;

try{
    while (cont < 40){
    idade = Integer.parseInt(JOptionPane.showInputDialog("Insira a sua idade"));
    aval = JOptionPane.showInputDialog("DÊ SUA OPINIÃO SOBRE O FILME: \n A - Ótimo \n B - Bom \n C - Regular  \n D - Ruim  \n E -  Péssimo").charAt(0);

    switch (aval){
    
    case 'a':
         otimo += 1;
        break;
    case 'A':
         otimo += 1;
        break;
    case 'b':
         bom += 1;
        break;
    case 'B':
         bom += 1;
        break;
    case 'c':
         regular += 1;
        break;
    case 'C':
         regular += 1;
        break;
    case 'd':
         ruim += 1;
         idaderuim += idade;
        break;
    case 'D':
         ruim += 1;
         idaderuim += idade;
         break;
    case 'e':
        pessimo += 1;
         break;
    case 'E':
        pessimo += 1;
         break;
    default: 
    JOptionPane.showMessageDialog(null, "Valor inválido", "ERRO", JOptionPane.ERROR_MESSAGE);
    } cont++;
}}catch (NumberFormatException e){
       JOptionPane.showMessageDialog(null, "Valor inválido", "ERRO", JOptionPane.ERROR_MESSAGE);
     } if (ruim == 0){
       media = 0;
       }else{
      media = (idaderuim/ruim);
      }
      percentual = (pessimo * 100)/cont;

    JOptionPane.showMessageDialog(null, "TOTAL DE PESSOAS QUE AVALIARAM \nCOMO ÓTIMO: " + otimo);
    JOptionPane.showMessageDialog(null, "MÉDIA DE PESSOAS QUE AVALIARAM \nCOMO RUIM: " + media);
    JOptionPane.showMessageDialog(null, "PERCENTUAL DE PESSOAS QUE AVALIARAM\nCOMO PÉSSIMO: " + percentual + "%");



    }
    
}
