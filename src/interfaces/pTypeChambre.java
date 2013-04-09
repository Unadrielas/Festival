/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import java.util.Iterator;
import java.util.List;
import javax.swing.JButton;
import javax.swing.table.DefaultTableModel;
import modele.Typechambre;
import org.hibernate.Query;

/**
 *
 * @author FLORIAN
 */
public class pTypeChambre extends javax.swing.JPanel {
    /**
     * Creates new form pTypeChambre
     */
    public pTypeChambre() {
        initComponents();
    }
    
    public boolean peutSupprimer(Typechambre uneChambre) {
        return (uneChambre.getOffres().isEmpty()) ? true : false;
    }
    
    public void afficherTypesChambres() {
        int nbLignes = tblTypeChambre.getRowCount();
        int i;
        int size = 24;
        JButton supprimer;
        //for (i=0; i<nbLignes; i++) {
            tblTypeChambre.removeAll();
        //}
        String sReq = "FROM Typechambre";
        fPrincipal.getSession().beginTransaction();
        Query q = fPrincipal.getSession().createQuery(sReq);
        Iterator typeChambre = q.iterate();
        while (typeChambre.hasNext()) {
            Typechambre uneChambre = (Typechambre) typeChambre.next();
            supprimer = this.peutSupprimer(uneChambre) ? new JButton("supprimer") : null;
            ((DefaultTableModel) tblTypeChambre.getModel()).addRow(new Object[] {uneChambre.getId(), uneChambre.getLibelle(), "modifier", supprimer});
            size += 24;
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblTypeChambre = new javax.swing.JTable();

        tblTypeChambre.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Identifiant", "Libellé", "Modifier"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblTypeChambre);
        tblTypeChambre.getColumnModel().getColumn(0).setResizable(false);
        tblTypeChambre.getColumnModel().getColumn(1).setResizable(false);
        tblTypeChambre.getColumnModel().getColumn(2).setResizable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(135, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblTypeChambre;
    // End of variables declaration//GEN-END:variables
}
