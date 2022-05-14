/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Hospital_java_Mysql;

import com.mysql.cj.xdevapi.Result;
import java.awt.Component;
import java.sql.ResultSet;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Vector;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author nainh
 */
public class Hospital_java_Mysql extends javax.swing.JFrame {

    /**
     * Creates new form Hospital_java_Mysql
     */
    String username = "root";
    String password = "22145q22145";
    String dateCon = "jdbc:mysql://localhost:3306/hospitoldb";
    
    Connection sqlCon = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    
    int q,i;
    
    
    public Hospital_java_Mysql() {
        initComponents();
        
        jTable1.setAutoResizeMode(jTable1.AUTO_RESIZE_OFF);
    }
    
    public void uploadDataBase()
    {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            sqlCon = DriverManager.getConnection(dateCon,username,password );
            if (sqlCon != null) {
			System.out.println("Database Connected successfully");
		} else {
			System.out.println("Database Connection failed");
		}
            pst = sqlCon.prepareStatement("select * from hospitoldb");
            rs = pst.executeQuery();                                                             
            ResultSetMetaData stData = rs.getMetaData();                                                     
            
            q = stData.getColumnCount();
            
            DefaultTableModel pateintRecord = (DefaultTableModel)jTable1.getModel();
            pateintRecord.setRowCount(0);
            
            while (rs.next())
            {
                Vector columnData = new Vector();
                
                
                for (i = 1;i <= q ; i++) {
                    columnData.add(rs.getString("PatientID"));
                    columnData.add(rs.getString("FirstName"));
                    columnData.add(rs.getString("LastName"));
                    columnData.add(rs.getString("Address"));
                    columnData.add(rs.getString("Gender"));
                    columnData.add(rs.getString("DOB"));
                    columnData.add(rs.getString("Mobile"));
                    columnData.add(rs.getString("Email"));
                    
                    columnData.add(rs.getString("Relation"));
                    columnData.add(rs.getString("FirstNameE"));
                    columnData.add(rs.getString("LastNameE"));
                    columnData.add(rs.getString("AddressE"));
                    columnData.add(rs.getString("MobileE"));
                    columnData.add(rs.getString("EmailE"));
                    
                    columnData.add(rs.getString("DrFirstName"));
                    columnData.add(rs.getString("DrLastName"));
                    columnData.add(rs.getString("Department"));
                    columnData.add(rs.getString("PagerNumber"));
                    columnData.add(rs.getString("Contact"));
                    
                    columnData.add(rs.getString("Drug1"));
                    columnData.add(rs.getString("Drug2"));
                    columnData.add(rs.getString("Drug3"));
                    columnData.add(rs.getString("Drug4"));
                    columnData.add(rs.getString("Drug5"));
                    columnData.add(rs.getString("Drug6"));
                    
                    columnData.add(rs.getString("Price1"));
                    columnData.add(rs.getString("Price2"));
                    columnData.add(rs.getString("Price3"));
                    columnData.add(rs.getString("Price4"));
                    columnData.add(rs.getString("Price5"));
                    columnData.add(rs.getString("Price6"));
                    
                    columnData.add(rs.getString("HeartDisease"));
                    columnData.add(rs.getString("BloodPressure"));
                    columnData.add(rs.getString("Stroke"));
                    columnData.add(rs.getString("Cancer"));
                    columnData.add(rs.getString("MentalIllness"));
                    columnData.add(rs.getString("Diabetes"));
                    columnData.add(rs.getString("Smoker"));
                    
                    columnData.add(rs.getString("Date"));
                    
                    
                    
                }
                pateintRecord.addRow(columnData);
            }
        }
        catch(Exception ex){
            System.out.println("Driver not Loaded successfully");
            JOptionPane.showMessageDialog(null, ex);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jCalendar2 = new com.toedter.calendar.JCalendar();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jtxthd = new javax.swing.JComboBox<>();
        jtxtbd = new javax.swing.JComboBox<>();
        jtxtstroke = new javax.swing.JComboBox<>();
        jtxtcancer = new javax.swing.JComboBox<>();
        jtxtMI = new javax.swing.JComboBox<>();
        jtxtdiabetes = new javax.swing.JComboBox<>();
        jtxtsmoker = new javax.swing.JComboBox<>();
        jLabel58 = new javax.swing.JLabel();
        jtxtdate = new javax.swing.JTextField();
        jPanel23 = new javax.swing.JPanel();
        jPanel25 = new javax.swing.JPanel();
        jPanel26 = new javax.swing.JPanel();
        jPanel28 = new javax.swing.JPanel();
        jPanel29 = new javax.swing.JPanel();
        jPanel30 = new javax.swing.JPanel();
        jPanel31 = new javax.swing.JPanel();
        jPanel32 = new javax.swing.JPanel();
        jPanel33 = new javax.swing.JPanel();
        jPanel34 = new javax.swing.JPanel();
        jPanel35 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jPanel17 = new javax.swing.JPanel();
        jPanel18 = new javax.swing.JPanel();
        jPanel19 = new javax.swing.JPanel();
        jPanel20 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jtxtdrp2 = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jtxtdrp3 = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        jtxtdrp4 = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        jtxtdrp5 = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        jtxtdrp6 = new javax.swing.JTextField();
        jtxtdrp1 = new javax.swing.JTextField();
        jPanel36 = new javax.swing.JPanel();
        jPanel37 = new javax.swing.JPanel();
        jPanel38 = new javax.swing.JPanel();
        jPanel39 = new javax.swing.JPanel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jtxtdr3 = new javax.swing.JTextField();
        jLabel45 = new javax.swing.JLabel();
        jtxtdr2 = new javax.swing.JTextField();
        jLabel46 = new javax.swing.JLabel();
        jtxtdr5 = new javax.swing.JTextField();
        jLabel47 = new javax.swing.JLabel();
        jtxtdr6 = new javax.swing.JTextField();
        jtxtdr1 = new javax.swing.JTextField();
        jLabel48 = new javax.swing.JLabel();
        jtxtdr4 = new javax.swing.JTextField();
        jPanel21 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jtxtPatientID = new javax.swing.JTextField();
        jtxtFName = new javax.swing.JTextField();
        jtxtLName = new javax.swing.JTextField();
        jtxtAddress = new javax.swing.JTextField();
        jtxtDOB = new javax.swing.JTextField();
        jtxtMobile = new javax.swing.JTextField();
        jtxtEmail = new javax.swing.JTextField();
        jcboGender2 = new javax.swing.JComboBox<>();
        jPanel22 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jtxtaddresse = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jtxtrelatione = new javax.swing.JTextField();
        jtxtfnameE = new javax.swing.JTextField();
        jtxtmobileE = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jtxtlnamee = new javax.swing.JTextField();
        jtxtemaile = new javax.swing.JTextField();
        jPanel8 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jtxtdrpnumber = new javax.swing.JTextField();
        jtxtdrdepartment = new javax.swing.JTextField();
        jtxtdrcontact = new javax.swing.JTextField();
        jtxtdrlname = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jtxtdrfname = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 7));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 7));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel4.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 10, 470, 340));

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 3, 24)); // NOI18N
        jLabel2.setText("Medical History");
        jLabel2.setToolTipText("Medical History");
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 190, -1, -1));
        jPanel4.add(jCalendar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 330, 150));

        jLabel38.setText("Heart Disease");
        jPanel4.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, -1, -1));

        jLabel39.setText("Blood Pressure");
        jPanel4.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, -1, -1));

        jLabel40.setText("Stroke");
        jPanel4.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, -1, -1));

        jLabel41.setText("Cancer");
        jPanel4.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, -1, -1));

        jLabel42.setText("Mental Illness");
        jPanel4.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, -1, -1));

        jLabel55.setText("Diabetes");
        jPanel4.add(jLabel55, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 390, -1, -1));

        jLabel56.setText("Smoker");
        jPanel4.add(jLabel56, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 420, -1, -1));

        jtxthd.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Yes", "No" }));
        jPanel4.add(jtxthd, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 230, 180, -1));

        jtxtbd.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "High", "Low" }));
        jPanel4.add(jtxtbd, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 260, 180, -1));

        jtxtstroke.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Yes", "No" }));
        jPanel4.add(jtxtstroke, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 290, 180, -1));

        jtxtcancer.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Yes", "No" }));
        jPanel4.add(jtxtcancer, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 320, 180, -1));

        jtxtMI.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Yes", "No" }));
        jPanel4.add(jtxtMI, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 350, 180, -1));

        jtxtdiabetes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Type 1", "Type 2" }));
        jPanel4.add(jtxtdiabetes, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 380, 180, -1));

        jtxtsmoker.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Yes", "No" }));
        jPanel4.add(jtxtsmoker, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 410, 180, -1));

        jLabel58.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel58.setText("Date");
        jPanel4.add(jLabel58, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 510, -1, -1));
        jPanel4.add(jtxtdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 510, 250, -1));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 10, 350, 580));

        jPanel23.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel25.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 7));
        jPanel25.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel26.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 7));
        jPanel26.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel25.add(jPanel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 10, 470, 340));

        jPanel23.add(jPanel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 10, 270, 560));

        jPanel28.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 7));
        jPanel28.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel29.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 7));
        jPanel29.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel28.add(jPanel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 320, 210, 280));

        jPanel30.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 7));
        jPanel30.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel31.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 7));
        jPanel31.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel30.add(jPanel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 320, 210, 280));

        jPanel28.add(jPanel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 320, 210, 280));

        jPanel32.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 7));
        jPanel32.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel33.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 7));
        jPanel33.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel32.add(jPanel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 320, 210, 280));

        jPanel34.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 7));
        jPanel34.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel35.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 7));
        jPanel35.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel34.add(jPanel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 320, 210, 280));

        jPanel32.add(jPanel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 320, 210, 280));

        jPanel28.add(jPanel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 320, 210, 280));

        jPanel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 7));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 7));
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel9.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 320, 210, 280));

        jPanel11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 7));
        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 7));
        jPanel12.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel11.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 320, 210, 280));

        jPanel9.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 320, 210, 280));

        jPanel17.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 7));
        jPanel17.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel18.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 7));
        jPanel18.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel17.add(jPanel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 320, 210, 280));

        jPanel19.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 7));
        jPanel19.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel20.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 7));
        jPanel20.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel19.add(jPanel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 320, 210, 280));

        jPanel17.add(jPanel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 320, 210, 280));

        jPanel9.add(jPanel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 320, 210, 280));

        jLabel23.setText("Price");
        jPanel9.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, -1));

        jLabel24.setText("Price");
        jPanel9.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));
        jPanel9.add(jtxtdrp2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 60, 110, 30));

        jLabel25.setText("Price");
        jPanel9.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, -1));
        jPanel9.add(jtxtdrp3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, 110, 30));

        jLabel26.setText("Price");
        jPanel9.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, -1));
        jPanel9.add(jtxtdrp4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, 110, 30));

        jLabel27.setText("Price");
        jPanel9.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, -1, -1));
        jPanel9.add(jtxtdrp5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, 110, 30));

        jLabel28.setText("Price");
        jPanel9.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, -1, -1));
        jPanel9.add(jtxtdrp6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, 110, 30));
        jPanel9.add(jtxtdrp1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, 110, 30));

        jPanel28.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 210, 260));

        jPanel23.add(jPanel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 220, 210, 260));

        jPanel36.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 7));
        jPanel36.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel37.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 7));
        jPanel37.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel36.add(jPanel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 320, 210, 280));

        jPanel38.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 7));
        jPanel38.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel39.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 7));
        jPanel39.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel38.add(jPanel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 320, 210, 280));

        jPanel36.add(jPanel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 320, 210, 280));

        jLabel43.setText("Drug #1");
        jPanel36.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        jLabel44.setText("Drug #3");
        jPanel36.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, -1));

        jtxtdr3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtdr3ActionPerformed(evt);
            }
        });
        jPanel36.add(jtxtdr3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 80, 110, 30));

        jLabel45.setText("Drug #2");
        jPanel36.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, -1));
        jPanel36.add(jtxtdr2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 50, 110, 30));

        jLabel46.setText("Drug #4");
        jPanel36.add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, -1, -1));
        jPanel36.add(jtxtdr5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 140, 110, 30));

        jLabel47.setText("Drug #5");
        jPanel36.add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, -1, -1));

        jtxtdr6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtdr6ActionPerformed(evt);
            }
        });
        jPanel36.add(jtxtdr6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 170, 110, 30));
        jPanel36.add(jtxtdr1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, 110, 30));

        jLabel48.setText("Drug #6");
        jPanel36.add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, -1, -1));

        jtxtdr4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtdr4ActionPerformed(evt);
            }
        });
        jPanel36.add(jtxtdr4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, 110, 30));

        jPanel23.add(jPanel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 220, 210, 260));

        jPanel21.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 7));
        jPanel21.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton2.setText("Reset");
        jPanel21.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, -1, -1));

        jButton3.setText("Result");
        jPanel21.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 20, -1, -1));

        jButton4.setText("Exit");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel21.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 20, -1, -1));

        jButton9.setText("Add");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel21.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        jPanel23.add(jPanel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 490, 460, 90));

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 7));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setText("Patient ID");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        jLabel4.setText("First Name");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, -1));

        jLabel5.setText("Last Name");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        jLabel6.setText("Address");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

        jLabel7.setText("Mobile");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, -1, -1));

        jLabel8.setText("Gender");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));

        jLabel9.setText("DOB");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, -1));

        jLabel11.setText("Email");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, -1, -1));
        jPanel3.add(jtxtPatientID, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, 300, 30));
        jPanel3.add(jtxtFName, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, 300, 30));
        jPanel3.add(jtxtLName, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, 300, 30));

        jtxtAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtAddressActionPerformed(evt);
            }
        });
        jPanel3.add(jtxtAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 110, 300, 30));

        jtxtDOB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtDOBActionPerformed(evt);
            }
        });
        jPanel3.add(jtxtDOB, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 170, 300, 30));

        jtxtMobile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtMobileActionPerformed(evt);
            }
        });
        jPanel3.add(jtxtMobile, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 200, 300, 30));

        jtxtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtEmailActionPerformed(evt);
            }
        });
        jPanel3.add(jtxtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 230, 300, 30));

        jcboGender2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Female", "Male" }));
        jPanel3.add(jcboGender2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 140, 300, -1));

        jPanel23.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 420, 300));

        jPanel22.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 7));
        jPanel22.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel18.setText("First Name");
        jPanel22.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));
        jPanel22.add(jtxtaddresse, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, 280, 30));

        jLabel21.setText("Mobile");
        jPanel22.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, -1, -1));
        jPanel22.add(jtxtrelatione, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, 280, 30));
        jPanel22.add(jtxtfnameE, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, 280, 30));

        jtxtmobileE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtmobileEActionPerformed(evt);
            }
        });
        jPanel22.add(jtxtmobileE, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 150, 280, 30));

        jLabel20.setText("Address");
        jPanel22.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, -1));

        jLabel19.setText("Last Name");
        jPanel22.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, -1));

        jLabel22.setText("Email");
        jPanel22.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, -1, -1));

        jLabel17.setText("Relation");
        jPanel22.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, -1));
        jPanel22.add(jtxtlnamee, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, 280, 30));
        jPanel22.add(jtxtemaile, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 180, 280, 30));

        jPanel23.add(jPanel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 400, 250));

        jPanel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 7));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel16.setText("Contact");
        jPanel8.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, -1, -1));

        jLabel12.setText("First Name");
        jPanel8.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));
        jPanel8.add(jtxtdrpnumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, 280, 30));

        jtxtdrdepartment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtdrdepartmentActionPerformed(evt);
            }
        });
        jPanel8.add(jtxtdrdepartment, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 80, 280, 30));
        jPanel8.add(jtxtdrcontact, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 140, 280, 30));

        jtxtdrlname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtdrlnameActionPerformed(evt);
            }
        });
        jPanel8.add(jtxtdrlname, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 50, 280, 30));

        jLabel15.setText("Pager Number");
        jPanel8.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, -1, -1));
        jPanel8.add(jtxtdrfname, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, 280, 30));

        jLabel13.setText("Last Name");
        jPanel8.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, -1));

        jLabel14.setText("Department");
        jPanel8.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, -1));

        jPanel23.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 10, 430, 200));

        jPanel1.add(jPanel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jTabbedPane1.addTab("Data Entry", jPanel1);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 7));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Sitka Text", 3, 48)); // NOI18N
        jLabel1.setText("Patient Details");
        jPanel6.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 10, 410, -1));

        jPanel2.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 1130, 80));

        jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 7));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setAutoCreateRowSorter(true);
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Pateint ID", "First Name", "Last Name", "Address", "Gender", "Date of Birth", "Mobile", "Email", "Relation", "Title", "First Name E", "Last Name E", "Address E", "Mobile E", "Email E", "DR First Name", "DR Last NAme", "Department", "Pager Number", "Contact", "Drug 1", "Drug 2", "Drug 3", "Drug 4", "Drug 5", "Drug 6", "Price 1", "Price 2", "Price 3", "Price 4", "Price 5", "Price 6", "Title 33", "Heart Disease", "Blood Pressure", "Stroke", "Cancer", "Mental Illness", "Diabetes", "Smoker", "Alcoholic "
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel7.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 1060, 430));

        jPanel2.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 1120, 480));

        jTabbedPane1.addTab("Storage", jPanel2);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1600, 800));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jtxtAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtAddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtAddressActionPerformed

    private void jtxtDOBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtDOBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtDOBActionPerformed

    private void jtxtMobileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtMobileActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtMobileActionPerformed

    private void jtxtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtEmailActionPerformed

    private void jtxtmobileEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtmobileEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtmobileEActionPerformed

    private void jtxtdrdepartmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtdrdepartmentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtdrdepartmentActionPerformed

    private void jtxtdrlnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtdrlnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtdrlnameActionPerformed

    private void jtxtdr3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtdr3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtdr3ActionPerformed

    private void jtxtdr4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtdr4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtdr4ActionPerformed

    private void jtxtdr6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtdr6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtdr6ActionPerformed
private JFrame frame;
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        frame = new JFrame("Exit");
        
        if(JOptionPane.showConfirmDialog(frame,"Confirm if you want to exit","Hospitol Management System", JOptionPane.YES_NO_OPTION) == 
                JOptionPane.YES_NO_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
        try{
            
        
        Class.forName("com.mysql.jdbc.Driver");
            sqlCon = DriverManager.getConnection(dateCon,username,password );
            pst = sqlCon.prepareStatement("insert into hospitoldb (PatientID,FirstName,LastName,Address,Gender,DOB,Mobile,Email,"
                    + "Relation,FirstNameE,LastNameE,AddressE,MobileE,EmailE,DRFirstName,DrLastName,Department,PagerNumber,"
                    + "Contact,Drug1,Drug2,Drug3,Drug4,Drug5,Drug6,Price1,Price2,Price3,Price4,Price5,Price6,"
                    + "HeartDisease,BloodPressure,Stroke,Cancer,MentalIllness,Diabetes,Smoker,Date) value(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
                    
            
            
            pst.setString(1,jtxtPatientID.getText());
            pst.setString(2,jtxtFName.getText());
            pst.setString(3,jtxtLName.getText());
            pst.setString(4,jtxtAddress.getText());
            pst.setString(5,(String)jcboGender2.getSelectedItem());
            pst.setString(6,jtxtDOB.getText());
            pst.setString(7,jtxtMobile.getText());
            pst.setString(8,jtxtEmail.getText());
            
            pst.setString(9,jtxtrelatione.getText());
            pst.setString(10,jtxtfnameE.getText());
            pst.setString(11,jtxtlnamee.getText());
            pst.setString(12,jtxtaddresse.getText());
            pst.setString(13,jtxtmobileE.getText());
            pst.setString(14,jtxtemaile.getText());
            
            pst.setString(15,jtxtdrfname.getText());
            pst.setString(16,jtxtdrlname.getText());
            pst.setString(17,jtxtdrdepartment.getText());
            pst.setString(18,jtxtdrpnumber.getText());
            pst.setString(19,jtxtdrcontact.getText());
            
            pst.setString(20,jtxtdr1.getText());
            pst.setString(21,jtxtdr2.getText());
            pst.setString(22,jtxtdr3.getText());
            pst.setString(23,jtxtdr4.getText());
            pst.setString(24,jtxtdr5.getText());
            pst.setString(25,jtxtdr6.getText());
            
            pst.setString(26,jtxtdrp1.getText());
            pst.setString(27,jtxtdrp2.getText());
            pst.setString(28,jtxtdrp3.getText());
            pst.setString(29,jtxtdrp4.getText());
            pst.setString(30,jtxtdrp5.getText());
            pst.setString(31,jtxtdrp6.getText());
            
            pst.setString(32,(String)jtxthd.getSelectedItem());
            pst.setString(33,(String)jtxtbd.getSelectedItem());
            pst.setString(34,(String)jtxtstroke.getSelectedItem());
            pst.setString(35,(String)jtxtcancer.getSelectedItem());
            pst.setString(36,(String)jtxtMI.getSelectedItem());
            pst.setString(37,(String)jtxtdiabetes.getSelectedItem());
            pst.setString(38,(String)jtxtsmoker.getSelectedItem());
            
            
            pst.setString(39,jtxtdate.getText());
            
            pst.executeUpdate();
            JOptionPane.showMessageDialog(this, "Patient Added Succesfully");
            uploadDataBase();
            
        }
        catch(ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Hospital_java_Mysql.class.getName()).log
                (java.util.logging.Level.SEVERE,null,ex);
        }
        catch(SQLException ex) {
            java.util.logging.Logger.getLogger(Hospital_java_Mysql.class.getName()).log
                (java.util.logging.Level.SEVERE,null,ex);
        }
    }//GEN-LAST:event_jButton9ActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Hospital_java_Mysql.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Hospital_java_Mysql.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Hospital_java_Mysql.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Hospital_java_Mysql.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Hospital_java_Mysql().setVisible(true);
            }
        });
    }
    
    private void formWindowActivated(java.awt.event.WindowEvent evt) {
        uploadDataBase();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton9;
    private com.toedter.calendar.JCalendar jCalendar2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel28;
    private javax.swing.JPanel jPanel29;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel30;
    private javax.swing.JPanel jPanel31;
    private javax.swing.JPanel jPanel32;
    private javax.swing.JPanel jPanel33;
    private javax.swing.JPanel jPanel34;
    private javax.swing.JPanel jPanel35;
    private javax.swing.JPanel jPanel36;
    private javax.swing.JPanel jPanel37;
    private javax.swing.JPanel jPanel38;
    private javax.swing.JPanel jPanel39;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JComboBox<String> jcboGender2;
    private javax.swing.JTextField jtxtAddress;
    private javax.swing.JTextField jtxtDOB;
    private javax.swing.JTextField jtxtEmail;
    private javax.swing.JTextField jtxtFName;
    private javax.swing.JTextField jtxtLName;
    private javax.swing.JComboBox<String> jtxtMI;
    private javax.swing.JTextField jtxtMobile;
    private javax.swing.JTextField jtxtPatientID;
    private javax.swing.JTextField jtxtaddresse;
    private javax.swing.JComboBox<String> jtxtbd;
    private javax.swing.JComboBox<String> jtxtcancer;
    private javax.swing.JTextField jtxtdate;
    private javax.swing.JComboBox<String> jtxtdiabetes;
    private javax.swing.JTextField jtxtdr1;
    private javax.swing.JTextField jtxtdr2;
    private javax.swing.JTextField jtxtdr3;
    private javax.swing.JTextField jtxtdr4;
    private javax.swing.JTextField jtxtdr5;
    private javax.swing.JTextField jtxtdr6;
    private javax.swing.JTextField jtxtdrcontact;
    private javax.swing.JTextField jtxtdrdepartment;
    private javax.swing.JTextField jtxtdrfname;
    private javax.swing.JTextField jtxtdrlname;
    private javax.swing.JTextField jtxtdrp1;
    private javax.swing.JTextField jtxtdrp2;
    private javax.swing.JTextField jtxtdrp3;
    private javax.swing.JTextField jtxtdrp4;
    private javax.swing.JTextField jtxtdrp5;
    private javax.swing.JTextField jtxtdrp6;
    private javax.swing.JTextField jtxtdrpnumber;
    private javax.swing.JTextField jtxtemaile;
    private javax.swing.JTextField jtxtfnameE;
    private javax.swing.JComboBox<String> jtxthd;
    private javax.swing.JTextField jtxtlnamee;
    private javax.swing.JTextField jtxtmobileE;
    private javax.swing.JTextField jtxtrelatione;
    private javax.swing.JComboBox<String> jtxtsmoker;
    private javax.swing.JComboBox<String> jtxtstroke;
    // End of variables declaration//GEN-END:variables
}
