package calculadora;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;


public class Utilidades {
    
    public static void mensagem(String texto) {
        JOptionPane.showMessageDialog(null, texto);
    }
    
    public static String formataNumero(Double valor) {
        DecimalFormat df = new DecimalFormat("#.##");
        return df.format(valor);
    }
    
}
