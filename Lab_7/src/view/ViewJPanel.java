/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import javax.imageio.ImageIO;
import javax.swing.BoxLayout;
import javax.swing.ButtonModel;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import model.Patient;
import utility.DatabaseConnector;
import java.lang.Object;

/**
 *
 * @author danie
 */
public class ViewJPanel extends javax.swing.JPanel {
    private ImageIcon pic;
    private Patient p1;
    private ArrayList<Patient> patients;
    private Patient selectedPatient;
    
    /**
     * Creates new form FormJPanel
     */
    public ViewJPanel(){ 
        initComponents();
        populateTable();
    }
    
    public ViewJPanel(Patient patient) {
        this.p1 = patient;
        this.patients = new ArrayList();
        initComponents();
        populateData();
        populateTable();
        disableAll();
    }
    
    
    public void setPic(ImageIcon pic) { 
        this.pic = pic;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupGender = new javax.swing.ButtonGroup();
        jCalendar1 = new com.toedter.calendar.JCalendar();
        jPanel1 = new javax.swing.JPanel();
        JRadioButtonFemale = new javax.swing.JRadioButton();
        JRadioButtonMale = new javax.swing.JRadioButton();
        JLabelName = new javax.swing.JLabel();
        JButtonSubmit = new javax.swing.JButton();
        JRadioButtonOthers = new javax.swing.JRadioButton();
        JTextFieldFirstName = new javax.swing.JTextField();
        JTextFieldLastName = new javax.swing.JTextField();
        JTextFieldAge = new javax.swing.JTextField();
        JLabelGender = new javax.swing.JLabel();
        JImageSubmit = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        JTextFieldEmail = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTextAreaMessage = new javax.swing.JTextArea();
        ImageHolder = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        dateHolder = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        patientJtable = new javax.swing.JTable();
        deleteButton = new javax.swing.JButton();
        editButton = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(102, 255, 102));

        buttonGroupGender.add(JRadioButtonFemale);
        JRadioButtonFemale.setText("Female");
        JRadioButtonFemale.setActionCommand("FEMALE");

        buttonGroupGender.add(JRadioButtonMale);
        JRadioButtonMale.setText("Male");
        JRadioButtonMale.setActionCommand("MALE");
        JRadioButtonMale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JRadioButtonMaleActionPerformed(evt);
            }
        });

        JLabelName.setText("Last Name");

        JButtonSubmit.setText("Submit");
        JButtonSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonSubmitActionPerformed(evt);
            }
        });

        buttonGroupGender.add(JRadioButtonOthers);
        JRadioButtonOthers.setText("Prefer Not To Say");
        JRadioButtonOthers.setActionCommand("OTHERS");

        JTextFieldFirstName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTextFieldFirstNameActionPerformed(evt);
            }
        });

        JTextFieldLastName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTextFieldLastNameActionPerformed(evt);
            }
        });

        JTextFieldAge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTextFieldAgeActionPerformed(evt);
            }
        });

        JLabelGender.setText("Gender");

        JImageSubmit.setText("Upload Image");
        JImageSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JImageSubmitActionPerformed(evt);
            }
        });

        jLabel5.setText("Photo:");

        jLabel1.setText("Patient Type:");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Walk-in", "Appointment", "Emergency", "Home Care" }));
        jComboBox1.setSelectedIndex(-1);
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabel2.setText("First Name");

        jLabel3.setText("Age:");

        jLabel4.setText("Email:");

        JTextFieldEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTextFieldEmailActionPerformed(evt);
            }
        });

        jLabel6.setText("Message:");

        JTextAreaMessage.setColumns(20);
        JTextAreaMessage.setRows(5);
        jScrollPane1.setViewportView(JTextAreaMessage);

        jLabel7.setText("Date:");

        patientJtable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "FirstName", "Gender", "Patient Type"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(patientJtable);

        deleteButton.setText("Delete Row");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        editButton.setText("Edit Row");
        editButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(100, 100, 100)
                                .addComponent(dateHolder)
                                .addGap(140, 140, 140))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(JLabelGender, javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING))
                                                .addGap(18, 18, 18)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(JRadioButtonMale)
                                                    .addComponent(JRadioButtonFemale)
                                                    .addComponent(JRadioButtonOthers)))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel5)
                                                    .addComponent(jLabel7))
                                                .addGap(18, 18, 18)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(JButtonSubmit)
                                                    .addComponent(JImageSubmit))
                                                .addGap(9, 9, 9)))
                                        .addGap(38, 38, 38))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel6)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel3)
                                            .addComponent(JLabelName)
                                            .addComponent(jLabel2))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(JTextFieldLastName, javax.swing.GroupLayout.DEFAULT_SIZE, 245, Short.MAX_VALUE)
                                            .addComponent(JTextFieldFirstName)
                                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(JTextFieldEmail)
                                            .addComponent(JTextFieldAge))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addComponent(ImageHolder))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(deleteButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(editButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(26, 26, 26))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(deleteButton)
                            .addComponent(editButton))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(ImageHolder)
                                .addGap(221, 221, 221))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(JTextFieldFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(JTextFieldLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(JLabelName))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(JTextFieldAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(JTextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(6, 6, 6)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(JRadioButtonMale)
                                    .addComponent(JLabelGender))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(JRadioButtonFemale)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(JRadioButtonOthers)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(JImageSubmit)
                                    .addComponent(jLabel5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel7)
                                .addGap(9, 9, 9)
                                .addComponent(JButtonSubmit)
                                .addGap(136, 136, 136)
                                .addComponent(dateHolder)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 531, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void JTextFieldLastNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTextFieldLastNameActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_JTextFieldLastNameActionPerformed

    private void JRadioButtonMaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JRadioButtonMaleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JRadioButtonMaleActionPerformed

    private void JButtonSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonSubmitActionPerformed
        // TODO add your handling code here:
        try{
            String firstName = this.JTextFieldFirstName.getText();
            String lastName = this.JTextFieldLastName.getText();
            String age = this.JTextFieldAge.getText();
            String email = this.JTextFieldEmail.getText();
            String message = this.JTextAreaMessage.getText();
            String gender = this.buttonGroupGender.getSelection().getActionCommand();

            if (!firstName.matches("[a-zA-Z ]+") || !lastName.matches("[a-zA-Z ]+")) {
                JOptionPane.showMessageDialog(this, "Name should contain only letters.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            if (!age.matches("\\d+") || Integer.parseInt(age) < 0) {
                JOptionPane.showMessageDialog(this, "Age must be a positive number >= 0.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            if(!this._is_valid_email(email) || email.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Invalidemail format.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            
            if(message.isEmpty()) { 
                JOptionPane.showMessageDialog(this, "Please Entered Message.", "Error", JOptionPane.ERROR_MESSAGE);
            }

            // This will display the First and Last name
            String displayMessage = "<html>Full Name: " + firstName + " " + lastName +
            "<br>Gender: " + gender +
            "<br>Age: " + age +
            "<br>Email: " + email +
            "<br>Profile Image: </html>";

            JPanel panel = new JPanel();
            JLabel displayMessageLabel = new JLabel(displayMessage) ;
            JLabel imageLabel = new JLabel(this.pic);
            panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
            panel.add(displayMessageLabel);
            panel.add(imageLabel);

//            System.out.println(this.JTextFieldLastName.getText());
//            System.out.println(this.JTextFieldLastName.getText());
//            System.out.println(this.JTextFieldAge.getText());
//            System.out.println(this.JTextFieldEmail.getText());
//            System.out.println(this.pic.getImage());
//            System.out.println(this.JLabelGender.getText());
//
//            System.out.println(this.buttonGroupGender.getSelection().getActionCommand());

            JOptionPane.showMessageDialog(this, panel);
            
            // * Passing data as Patient object
            Patient patient = new Patient();
            patient.setFirstName(firstName);
            patient.setLastName(lastName);
            patient.setAge(age);
            patient.setEmail(email);
            patient.setMessage(message);
            patient.setGender(gender);
            patient.setProfilePicture(this.pic);
            patient.setId(this.selectedPatient.getId());
            this.p1= patient;
            System.out.println("ID" + patient.getId());
            DatabaseConnector.updatePatient(patient);
            
            // * Display all the detail of this patient and go to new viewPanel
//            ViewJPanel newViewJPanel = new ViewJPanel(patient);
            populateData();
            populateTable();
            
        }
        catch(NullPointerException ne) {
            String errorMessage = "You must enter all fields \n Phone number should be valid \n Email must be valid \n Photo must be choosen";
            JOptionPane.showMessageDialog(this, errorMessage);
        }
        catch(Exception e) {
            System.out.println("Exception has occurred: ");
            System.out.println(e);
        }
    }//GEN-LAST:event_JButtonSubmitActionPerformed
    
    public void populateTable() { 
        this.patients = DatabaseConnector.getPatients();
        
        DefaultTableModel model = (DefaultTableModel) this.patientJtable.getModel();
        model.setRowCount(0);
        for( Patient p1: patients)  { 
            Object [] rows = new Object[4];
            rows[0] = p1.getId();
            rows[1] = p1.getFirstName();
            rows[2] = p1.getGender();
            rows[3] = p1.getPatientType();
            model.addRow(rows);
        }
        
    }
    
    public void populateData(){ 
        this.JTextFieldFirstName.setText(this.p1.getFirstName());
        this.JTextFieldFirstName.setEditable(false);
        
        this.JTextFieldLastName.setText(this.p1.getLastName());
        this.JTextFieldLastName.setEditable(false);
        
        this.JTextFieldAge.setText(this.p1.getAge());
        this.JTextFieldAge.setEditable(false);
        
        this.JTextFieldEmail.setText(this.p1.getEmail());
        this.JTextFieldEmail.setEditable(false);
        
        this.JTextAreaMessage.setText(this.p1.getMessage());
        this.JTextAreaMessage.setEditable(false);
        
        this.jComboBox1.setSelectedItem(this.p1.getPatientType());
        this.jComboBox1.setEnabled(false);

        this.ImageHolder.setIcon(this.p1.getProfilePicture());
        
        this.dateHolder.setText(this.p1.getDate());

        String gender = this.p1.getGender();
        if(gender.equals("MALE")){ 
            this.buttonGroupGender.setSelected(this.JRadioButtonMale.getModel(), true);
        } else if (gender.equals("FEMALE")) { 
            this.buttonGroupGender.setSelected(this.JRadioButtonFemale.getModel(), true);
        } else { 
            this.buttonGroupGender.setSelected(this.JRadioButtonOthers.getModel(), true);
        }
        
        this.JRadioButtonMale.setEnabled(false);
        this.JRadioButtonFemale.setEnabled(false);
        this.JRadioButtonOthers.setEnabled(false);
        
        this.pic = this.p1.getProfilePicture();
        this.JLabelGender.setText(this.p1.getGender());
    }
    
    private boolean _is_valid_email(String email) {
        String regex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@" + 
                       "(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
        return email.matches(regex);
    }
    
    private void JImageSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JImageSubmitActionPerformed
        // TODO add your handling code here:
        JFileChooser file = new JFileChooser();
        if(file.showSaveDialog(null) == JFileChooser.APPROVE_OPTION) {
            try {
                BufferedImage img = ImageIO.read(file.getSelectedFile());
                Image edited_image = img.getScaledInstance(120, 160, Image.SCALE_SMOOTH);
                if (edited_image != null ){
                    this.setPic(new ImageIcon(edited_image));
                }
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Please upload image correctly correctly.", "Error - Incorrect image", JOptionPane.ERROR_MESSAGE);
                ex.printStackTrace();
            }
        }
    }//GEN-LAST:event_JImageSubmitActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void JTextFieldAgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTextFieldAgeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTextFieldAgeActionPerformed

    private void JTextFieldEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTextFieldEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTextFieldEmailActionPerformed

    private void JTextFieldFirstNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTextFieldFirstNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTextFieldFirstNameActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        // TODO add your handling code here
        int selectedRowIndex = this.patientJtable.getSelectedRow();
        this.selectedPatient = this.patients.get(selectedRowIndex);
           
        try { 
            DatabaseConnector.deletePatient(this.selectedPatient);
            System.out.println("Patient Delete Successfully");
            populateTable();
        } catch (Exception e) { 
            System.out.println("Unable to detele");
            System.out.println(e);
        }
        
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void editButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editButtonActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = this.patientJtable.getSelectedRow();
        this.selectedPatient = this.patients.get(selectedRowIndex);
        this.p1 = this.selectedPatient;
        populateData();
        enableAll();
        
    }//GEN-LAST:event_editButtonActionPerformed
    public void enableAll() { 
        this.JTextFieldFirstName.setEditable(true);
        this.JTextFieldLastName.setEditable(true);
        this.JTextFieldAge.setEditable(true);
        this.JTextFieldEmail.setEditable(true);
        this.JTextAreaMessage.setEditable(true);
        this.jComboBox1.setEnabled(true);
        this.JRadioButtonMale.setEnabled(true);
        this.JRadioButtonFemale.setEnabled(true);
        this.JRadioButtonOthers.setEnabled(true);
    }
    public void disableAll() { 
        this.JTextFieldFirstName.setEditable(false);
        this.JTextFieldLastName.setEditable(false);
        this.JTextFieldAge.setEditable(false);
        this.JTextFieldEmail.setEditable(false);
        this.JTextAreaMessage.setEditable(false);
        this.jComboBox1.setEnabled(false);
        this.JRadioButtonMale.setEnabled(false);
        this.JRadioButtonFemale.setEnabled(false);
        this.JRadioButtonOthers.setEnabled(false);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ImageHolder;
    private javax.swing.JButton JButtonSubmit;
    private javax.swing.JButton JImageSubmit;
    private javax.swing.JLabel JLabelGender;
    private javax.swing.JLabel JLabelName;
    private javax.swing.JRadioButton JRadioButtonFemale;
    private javax.swing.JRadioButton JRadioButtonMale;
    private javax.swing.JRadioButton JRadioButtonOthers;
    private javax.swing.JTextArea JTextAreaMessage;
    private javax.swing.JTextField JTextFieldAge;
    private javax.swing.JTextField JTextFieldEmail;
    private javax.swing.JTextField JTextFieldFirstName;
    private javax.swing.JTextField JTextFieldLastName;
    private javax.swing.ButtonGroup buttonGroupGender;
    private javax.swing.JLabel dateHolder;
    private javax.swing.JButton deleteButton;
    private javax.swing.JButton editButton;
    private com.toedter.calendar.JCalendar jCalendar1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable patientJtable;
    // End of variables declaration//GEN-END:variables
}
