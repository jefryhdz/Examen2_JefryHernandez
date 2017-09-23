
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Jefry Hernandez
 */
public class hilo extends Thread {

    private JLabel label;
    private Cancion c;
    private JDialog windows;
    private int tiempo = 0;

    public hilo(JLabel label, Cancion c, JDialog windows) {
        this.label = label;
        this.c = c;
        this.windows = windows;
    }

    @Override
    public void run() {
        while (tiempo<= c.getDuracion()) {
            label.setText(tiempo+"");
            tiempo++;
            if (tiempo==c.getDuracion()+1) {
                JOptionPane.showMessageDialog(null, "Termino la cancion");
                windows.dispose();
            }try {
                Thread.sleep(1000);
            } catch (Exception e) {
            }
        }
    }

}
