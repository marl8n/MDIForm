/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package meso.mdiformpersons.ui;

import javax.swing.DefaultListModel;

import static meso.mdiformpersons.information.CollectionOfPersons.persons;

/**
 *
 * @author MIDP9
 */
public class ShowList extends javax.swing.JInternalFrame {

    //private LinkedList<Person> persons = new LinkedList();
    
    /**
     * Creates new form ShowList
     */
    public ShowList() {
        initComponents();
        setDataInList();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cbAges = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        list = new javax.swing.JList<>();

        setClosable(true);

        cbAges.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todos", "Mayores", "Menores" }));
        cbAges.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbAgesItemStateChanged(evt);
            }
        });

        jScrollPane1.setViewportView(list);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(149, 149, 149)
                        .addComponent(cbAges, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cbAges, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbAgesItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbAgesItemStateChanged
        setDataInList();
    }//GEN-LAST:event_cbAgesItemStateChanged

    private void setDataInList(){
        
        DefaultListModel infoAndNames = new DefaultListModel();
        if(cbAges.getSelectedItem().equals("Todos")){
            for( int i = 0; i < persons.size(); i++ ){
                infoAndNames.add(i, persons.get(i).getInfoAsString());
            }
        }else if(cbAges.getSelectedItem().equals("Mayores")){
            for( int i = 0; i < persons.size(); i++ ){
                int j = 0;
                if(persons.get(i).getAge() >= 18){
                    infoAndNames.add(i, persons.get(i).getInfoAsString());
                    j++;
                }
            }
        }else if(cbAges.getSelectedItem().equals("Menores")){
            for( int i = 0; i < persons.size(); i++ ){
                int j = 0;
                if(persons.get(i).getAge() < 18){
                    infoAndNames.add(i, persons.get(i).getInfoAsString());
                    j++;
                }
            }
        }
        
        list.setModel(infoAndNames);               
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbAges;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> list;
    // End of variables declaration//GEN-END:variables
}