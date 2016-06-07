package gui;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.swing.JColorChooser;
import javax.swing.JFileChooser;
import model.Persona;
/**
 *
 * @author ramon
 */
public class MainFrame extends javax.swing.JFrame implements ActionListener{
  //editar que te mande un nombre y lo puedas editar
    public MainFrame() {
        initComponents();
        jMenuItemSalir.addActionListener(this);
        jMenuItemAbrir.addActionListener(this);
        jMenuItemAcerca.addActionListener(this);
        jMenuItemNuevo.addActionListener(this);
    }
private  DialogoEditarPersona editarPersona ;
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItemNuevo = new javax.swing.JMenuItem();
        jMenuItemAbrir = new javax.swing.JMenuItem();
        jMenuItemCerrar = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItemSalir = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItemCopiar = new javax.swing.JMenuItem();
        jMenuItemCortar = new javax.swing.JMenuItem();
        jMenuItemPegar = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jCheckBoxMenuItemBecado = new javax.swing.JCheckBoxMenuItem();
        jCheckBoxMenuItemMonologado = new javax.swing.JCheckBoxMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        jMenuSexo = new javax.swing.JMenu();
        jRadioButtonMenuItemMasculino = new javax.swing.JRadioButtonMenuItem();
        jRadioButtonMenuItemFemenino = new javax.swing.JRadioButtonMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItemCambioayuda = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        jMenuItemAcerca = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jMenu1.setText("Archivo");

        jMenuItemNuevo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/demomenu/imagenes/Nuevo.png"))); // NOI18N
        jMenuItemNuevo.setText("Nuevo...");
        jMenu1.add(jMenuItemNuevo);

        jMenuItemAbrir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/demomenu/imagenes/Abrir.png"))); // NOI18N
        jMenuItemAbrir.setText("Abrir...");
        jMenu1.add(jMenuItemAbrir);

        jMenuItemCerrar.setText("Cerrar");
        jMenu1.add(jMenuItemCerrar);
        jMenu1.add(jSeparator1);

        jMenuItemSalir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/demomenu/imagenes/Salir.png"))); // NOI18N
        jMenuItemSalir.setText("Salir");
        jMenu1.add(jMenuItemSalir);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Editar");

        jMenuItemCopiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/demomenu/imagenes/Copiar.png"))); // NOI18N
        jMenuItemCopiar.setText("Copiar");
        jMenu2.add(jMenuItemCopiar);

        jMenuItemCortar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/demomenu/imagenes/Cortar.png"))); // NOI18N
        jMenuItemCortar.setText("Cortar");
        jMenu2.add(jMenuItemCortar);

        jMenuItemPegar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/demomenu/imagenes/Pegar.png"))); // NOI18N
        jMenuItemPegar.setText("Pegar");
        jMenu2.add(jMenuItemPegar);

        jMenuBar1.add(jMenu2);

        jMenu4.setText("Demo");

        jCheckBoxMenuItemBecado.setText("Becado");
        jMenu4.add(jCheckBoxMenuItemBecado);

        jCheckBoxMenuItemMonologado.setText("Monologado");
        jMenu4.add(jCheckBoxMenuItemMonologado);
        jMenu4.add(jSeparator3);

        jMenuSexo.setText("Sexo");

        buttonGroup1.add(jRadioButtonMenuItemMasculino);
        jRadioButtonMenuItemMasculino.setSelected(true);
        jRadioButtonMenuItemMasculino.setText("Masculino");
        jMenuSexo.add(jRadioButtonMenuItemMasculino);

        buttonGroup1.add(jRadioButtonMenuItemFemenino);
        jRadioButtonMenuItemFemenino.setText("Femenino");
        jMenuSexo.add(jRadioButtonMenuItemFemenino);

        jMenu4.add(jMenuSexo);

        jMenuBar1.add(jMenu4);

        jMenu3.setText("Ayuda");

        jMenuItemCambioayuda.setText("Cambio de ayuda...");
        jMenu3.add(jMenuItemCambioayuda);
        jMenu3.add(jSeparator2);

        jMenuItemAcerca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/demomenu/imagenes/Acerca de.png"))); // NOI18N
        jMenuItemAcerca.setText("Acerca de...");
        jMenu3.add(jMenuItemAcerca);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 481, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 301, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }
    
  @Override
    public void actionPerformed(ActionEvent e) {
//       Color unColor = JColorChooser.showDialog(this, "Seleccione un color ", Color.yellow);//dialogos con color
//        if (unColor != null) {
//          //se eligio un nuevo color
//      }else {
//            //no se eligio un nuevo color
//        }
        Object sr = e.getSource();
        JFileChooser dialogoAbrir = new JFileChooser();
        File archivo = null;
        if(sr == jMenuItemSalir){
           
            System.exit(0);
        }else if(sr == jMenuItemAbrir){
            
            int resultado = dialogoAbrir.showOpenDialog(this);//a ventar un parametro que es la ventana padre
            if (resultado == JFileChooser.APPROVE_OPTION) {//si es igual quiere decir que oprimieron aceptar
                archivo = dialogoAbrir.getSelectedFile();// que archivo te selecionaron
                System.out.println("Archivo o Abrir "+archivo.getName());// lo imprimo y que archivo fue
            
            }
        }else if(sr == jMenuItemAcerca){
           DialogoAcercaDe AcercaD = new DialogoAcercaDe(this,true);//modales y no modales (que entra en una ventana y no te deja salir hasta que la cerrar)
            AcercaD.setVisible(true);
           
        }else if(sr == jMenuItemNuevo){
           
            if(editarPersona == null){
            editarPersona = new DialogoEditarPersona(this,true);
            }
            int resultado = editarPersona.showDialog();
            if (resultado == DialogoEditarPersona.OPCION_ACEPTAR) {
                Persona p = editarPersona.getPersona();
                System.out.println(p.getNombre()+" "+p.getApellidos());
            }else{
                System.out.println("El usuario oprimio el boton cancelar ");
            }
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItemBecado;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItemMonologado;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItemAbrir;
    private javax.swing.JMenuItem jMenuItemAcerca;
    private javax.swing.JMenuItem jMenuItemCambioayuda;
    private javax.swing.JMenuItem jMenuItemCerrar;
    private javax.swing.JMenuItem jMenuItemCopiar;
    private javax.swing.JMenuItem jMenuItemCortar;
    private javax.swing.JMenuItem jMenuItemNuevo;
    private javax.swing.JMenuItem jMenuItemPegar;
    private javax.swing.JMenuItem jMenuItemSalir;
    private javax.swing.JMenu jMenuSexo;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItemFemenino;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItemMasculino;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    // End of variables declaration//GEN-END:variables
}