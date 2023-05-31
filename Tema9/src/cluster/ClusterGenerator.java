package cluster;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.ArrayList;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ClusterGenerator extends JFrame {

    private JTextField txtGrupo;
    private JTextField txtIp1;
    private JTextField txtIp2;

    private ArrayList<String> listaIp = new ArrayList<>();
    private JList<String> lstIp;
    private DefaultListModel<String> modeloListaIp;

    public ClusterGenerator() {
   	 super("Cluster Generator");
   	 setSize(500, 400);
   	 setLayout(new FlowLayout(new FlowLayout().LEFT));
   	 setDefaultCloseOperation(EXIT_ON_CLOSE);

   	 JLabel lblGrupo = new JLabel("Grupo");
   	 txtGrupo = new JTextField();
   	 txtGrupo.setPreferredSize(new Dimension(100, 23));

   	 JLabel lblIp1 = new JLabel("IP Inicial");
   	 txtIp1 = new JTextField();
   	 txtIp1.setPreferredSize(new Dimension(100, 23));

   	 JLabel lblIp2 = new JLabel("IP Final");
   	 txtIp2 = new JTextField();
   	 txtIp2.setPreferredSize(new Dimension(100, 23));

   	 JButton btnTexto = new JButton("Generar texto");
   	 btnTexto.addActionListener(new ActionListener() {

   		 @Override
   		 public void actionPerformed(ActionEvent e) {
   			 generarTexto();

   		 }
   	 });

   	 JButton btnArchivo = new JButton("Generar archivo");
   	 btnArchivo.addActionListener(new ActionListener() {

   		 @Override
   		 public void actionPerformed(ActionEvent e) {
   			 generarArchivo();

   		 }
   	 });

   	 modeloListaIp = new DefaultListModel<>();
   	 lstIp = new JList<>(modeloListaIp);
   	 JScrollPane panelIp = new JScrollPane(lstIp);
   	 
   	 panelIp.setPreferredSize(new Dimension(470, 280));

   	 add(lblGrupo);
   	 add(txtGrupo);
   	 add(lblIp1);
   	 add(txtIp1);
   	 add(lblIp2);
   	 add(txtIp2);
   	 add(btnTexto);
   	 add(btnArchivo);
   	 add(panelIp);

   	 setVisible(true);
    }

    public static void main(String[] args) {
   	 new ClusterGenerator();

    }

    /*
     * para separar la ip se usa una expresion regular
     *
     * String cadena = "192.168.3.11";
     *
     * String campos[] = cadena.split("/.");
     *
     * System.out.println(Arrays.toString(campos));
     */
    private void generarTexto() {

//   	 listaIp.add(txtGrupo);

    }

    private void generarIp() {
   	 String ipInicio = txtIp1.toString();

   	 String[] partesIp = ipInicio.split("/.");

   	 if (partesIp.length != 4) {
   		 JOptionPane.showMessageDialog(null, "IP introducida errónea", "Error E/S", JOptionPane.ERROR_MESSAGE);
   	 }

    }

    private void generarArchivo() {
   	 JFileChooser elegirArchivo = new JFileChooser();
   	 int eleccion = elegirArchivo.showOpenDialog(null);

   	 if (eleccion == JFileChooser.CANCEL_OPTION) {
   		 System.out.println("Has cancelado");
   		 return;
   	 }

   	 File archivo = elegirArchivo.getSelectedFile();
   	 System.out.println("Has elegido el archivo: " + archivo.toString());

    }

}



