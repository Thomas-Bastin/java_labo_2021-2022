/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package GUI;

import java.util.ArrayList;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;
import java.util.LinkedList;


/**
 *
 * @author matteoarnone
 */
public class AtelierAPrevoir extends javax.swing.JDialog {
    
    /**
     * Creates new form AtelierAPrevoir
     */
    
    private AtelierPriseEnCharge pec;
    private final Atelier Parent;
    //Creer une liste statique pour la combo contenant des entretiens
    private static final ArrayList<String> LsEntretien = new ArrayList<>();
    
    //Creer une liste statique pour la combo contenant des Reparations
    private static final ArrayList<String> LsReparation = new ArrayList<>();
    
    static
    {
        //Init LsEntretien
        LsEntretien.add("Pneu Hiver");
        LsEntretien.add("Pneu Ete");
        LsEntretien.add("Pression Pneu");
        LsEntretien.add("Frein");
        LsEntretien.add("Phare");
        
        //Init LsReparation
        LsReparation.add("Moteur");
        LsReparation.add("Frein");
        LsReparation.add("Pneu");
        LsReparation.add("Amortisseur");
        LsReparation.add("Carrosserie");
    }
    
    public AtelierAPrevoir(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        
        RadioButtonEntretien.setSelected(true);
        ComboBox_TypeTravail.setModel(new DefaultComboBoxModel<String>(LsEntretien.toArray(new String[0]))); //Init Entretien

        Parent = (Atelier) parent; //Set le Parent
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        LabelTypeVoiture = new javax.swing.JLabel();
        TextField_TypeVoiture = new javax.swing.JTextField();
        Label_Immatriculation = new javax.swing.JLabel();
        TextField_Immatriculation = new javax.swing.JTextField();
        CheckBox_PlaqueBelge = new javax.swing.JCheckBox();
        Label_Proprietaire = new javax.swing.JLabel();
        ComboBox_Propriétaire = new javax.swing.JComboBox<>();
        CheckBox_New = new javax.swing.JCheckBox();
        RadioButtonEntretien = new javax.swing.JRadioButton();
        RadioButtonReparation = new javax.swing.JRadioButton();
        Label_TypeTravail = new javax.swing.JLabel();
        ComboBox_TypeTravail = new javax.swing.JComboBox<>();
        Label_Instruction = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TextArea_Instruction = new javax.swing.JTextArea();
        Button_OK = new javax.swing.JButton();
        Button_KO = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        LabelTypeVoiture.setText("Type de voiture:");

        Label_Immatriculation.setText("Immatriculation:");

        CheckBox_PlaqueBelge.setText("Plaque belge");

        Label_Proprietaire.setText("Propriétaire:");

        ComboBox_Propriétaire.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pierre", "Pol", "Jacques" }));

        CheckBox_New.setText("new");

        buttonGroup1.add(RadioButtonEntretien);
        RadioButtonEntretien.setText("Entretien");
        RadioButtonEntretien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RadioButtonEntretienActionPerformed(evt);
            }
        });

        buttonGroup1.add(RadioButtonReparation);
        RadioButtonReparation.setText("Reparation");
        RadioButtonReparation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RadioButtonReparationActionPerformed(evt);
            }
        });

        Label_TypeTravail.setText("Type de travail:");

        ComboBox_TypeTravail.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pneu Hiver", "Pneu Ete" }));

        Label_Instruction.setText("Instructions particulières:");

        TextArea_Instruction.setColumns(20);
        TextArea_Instruction.setRows(5);
        jScrollPane1.setViewportView(TextArea_Instruction);

        Button_OK.setText("Ok");
        Button_OK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_OKActionPerformed(evt);
            }
        });

        Button_KO.setText("Annuler");
        Button_KO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_KOActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Button_OK)
                                .addGap(105, 105, 105)
                                .addComponent(Button_KO))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Label_Immatriculation)
                                    .addComponent(LabelTypeVoiture)
                                    .addComponent(Label_Proprietaire)
                                    .addComponent(Label_TypeTravail))
                                .addGap(28, 28, 28)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(ComboBox_TypeTravail, 0, 250, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(RadioButtonEntretien)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(RadioButtonReparation))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(ComboBox_Propriétaire, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                                        .addComponent(CheckBox_New))
                                    .addComponent(TextField_TypeVoiture)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(TextField_Immatriculation)
                                        .addGap(18, 18, 18)
                                        .addComponent(CheckBox_PlaqueBelge)))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 466, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Label_Instruction))
                        .addGap(0, 45, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(TextField_TypeVoiture)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CheckBox_PlaqueBelge)
                            .addComponent(TextField_Immatriculation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Label_Immatriculation))
                        .addGap(30, 30, 30))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(LabelTypeVoiture)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Label_Proprietaire)
                    .addComponent(ComboBox_Propriétaire, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CheckBox_New))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Label_TypeTravail)
                    .addComponent(RadioButtonEntretien)
                    .addComponent(RadioButtonReparation))
                .addGap(18, 18, 18)
                .addComponent(ComboBox_TypeTravail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Label_Instruction)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Button_OK)
                    .addComponent(Button_KO))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Button_KOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_KOActionPerformed
        this.dispose();
    }//GEN-LAST:event_Button_KOActionPerformed

    private void Button_OKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_OKActionPerformed

        Vector ligneTmp = new Vector();
        //Creation du Vecteur avec les informations:
        ligneTmp.add(TextField_TypeVoiture.getText());
        
        if(CheckBox_PlaqueBelge.isSelected())   
            ligneTmp.add(TextField_Immatriculation.getText() + "  BE");
        else    
            ligneTmp.add(TextField_Immatriculation.getText());
        
        
        
        ligneTmp.add(ComboBox_Propriétaire.getSelectedItem());
        
        if(RadioButtonEntretien.isSelected())
            ligneTmp.add("Entretien - " + ComboBox_TypeTravail.getSelectedItem());
        else 
            ligneTmp.add("Reparation - " + ComboBox_TypeTravail.getSelectedItem());
        
        
        ligneTmp.add(TextArea_Instruction.getText());
        
        //Ajout à la liste située dans la classe Atelier:
        Parent.Container.getList_Travaux().add(ligneTmp);
        
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_Button_OKActionPerformed

    @SuppressWarnings("Convert2Diamond")
    private void RadioButtonEntretienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RadioButtonEntretienActionPerformed
        // Changer la liste de la combo pour les entretiens
        ComboBox_TypeTravail.setModel(new DefaultComboBoxModel<String>(LsEntretien.toArray(new String[0])));
    }//GEN-LAST:event_RadioButtonEntretienActionPerformed

    private void RadioButtonReparationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RadioButtonReparationActionPerformed
        // Changer la liste de la combo pour des Réparations
        ComboBox_TypeTravail.setModel(new DefaultComboBoxModel<String>(LsReparation.toArray(new String[0])));
    }//GEN-LAST:event_RadioButtonReparationActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Button_KO;
    private javax.swing.JButton Button_OK;
    private javax.swing.JCheckBox CheckBox_New;
    private javax.swing.JCheckBox CheckBox_PlaqueBelge;
    private javax.swing.JComboBox<String> ComboBox_Propriétaire;
    private javax.swing.JComboBox<String> ComboBox_TypeTravail;
    private javax.swing.JLabel LabelTypeVoiture;
    private javax.swing.JLabel Label_Immatriculation;
    private javax.swing.JLabel Label_Instruction;
    private javax.swing.JLabel Label_Proprietaire;
    private javax.swing.JLabel Label_TypeTravail;
    private javax.swing.JRadioButton RadioButtonEntretien;
    private javax.swing.JRadioButton RadioButtonReparation;
    private javax.swing.JTextArea TextArea_Instruction;
    private javax.swing.JTextField TextField_Immatriculation;
    private javax.swing.JTextField TextField_TypeVoiture;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
