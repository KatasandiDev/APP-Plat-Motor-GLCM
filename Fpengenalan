/*
 * Ekstraksi Fitur Plat Kedaraan Bermotor Mahasiswa Fakultas Ilmu Komputer 
 * Universitas Muslim Indonsia Menggunakan Metode Gray Level Co-Occurrence Matrix 
 * (GLCM)
 * Oleh: Agus Arisandi
 */
package Plat;

import java.awt.Component;
import java.io.*;
import java.sql.*;
import javax.swing.*;
import java.awt.image.BufferedImage;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileFilter;


/**
 *
 * @author Administrator
 */
public class Fpengenalan extends javax.swing.JFrame {

JFileChooser pilihfile;
    File filecitra;
    private BufferedImage citragray=null,cuntukgray=null;
    //public int[][] mcitragray;    
    //public int[][] untukgray;
    public double[] nilaihasilGLCM;
    public Connection conn;
    public Statement cn;
    public String nim1;
    String ketcetak;
    
    private int[] _sudut;
    private String[] _namaSudut;
    private JFileChooser _jc = new JFileChooser();
    private BufferedImage _sourceBI;
    private BufferedImage _currentBI;

    /**
     * Creates new form Fpengenalan
     */
    public Fpengenalan() {
        initComponents();
        _sudut = new int[]{GLCM.SUDUT_0, GLCM.SUDUT_45, GLCM.SUDUT_90, GLCM.SUDUT_135, GLCM.SUDUT_ALL};
        _namaSudut = new String[]{"SUDUT_0", "SUDUT_45", "SUDUT_90", "SUDUT_135", " SUDUT_ALL"};
        pack();
        Center.frame(this);
        this.setTitle("Proses Pengenalan");
        this.setResizable(false);


    }

    public void koneksi() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/dbappplat", "root", "");
            cn = (Statement) conn.createStatement();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "koneksi gagal..");
            System.out.println(e.getMessage());
        }

    }
    /*
     * public void normal(){ nim.setEnabled(false); Tnamamhs.setEnabled(false);
     * Tjk.setEnabled(false); Tangkatan.setEnabled(false);
     * Talmt.setEnabled(false); Tplat.setEnabled(false); nim.setText("");
     * Tnamamhs.setText(""); Tjk.setText(""); Tangkatan.setText("");
     * Talmt.setText(""); Tplat.setText("");
     *
     *
     * }
     *
     */

    private void proses() {
        if (_currentBI != null) //bila ada proses!!
        {
            ReadImage read = new ReadImage(_currentBI);
            int[][] gray = read.getGray();
            GLCM glcm = new GLCM();
            FeatGlcm feature = new FeatGlcm();

            glcm.process(gray,_sudut[0], 255);            
            feature.process(glcm.getT());
            //Arah Pixel 0 Derajat 
            asm0.setText(String.valueOf(feature.getEnergy()));
            idm0.setText(String.valueOf(feature.getHomogen()));
            kontras0.setText(String.valueOf(feature.getContrast()));
            entropi0.setText(String.valueOf(feature.getEntropy()));
            korelasi0.setText(String.valueOf(feature.getCorrelation()));
            
            glcm.process(gray,_sudut[1], 255);            
            feature.process(glcm.getT());
            asm45.setText(String.valueOf(feature.getEnergy()));
            idm45.setText(String.valueOf(feature.getHomogen()));
            kontras45.setText(String.valueOf(feature.getContrast()));
            entropi45.setText(String.valueOf(feature.getEntropy()));
            korelasi45.setText(String.valueOf(feature.getCorrelation()));
            
            glcm.process(gray,_sudut[2], 255);            
            feature.process(glcm.getT());
            asm90.setText(String.valueOf(feature.getEnergy()));
            idm90.setText(String.valueOf(feature.getHomogen()));
            kontras90.setText(String.valueOf(feature.getContrast()));
            entropi90.setText(String.valueOf(feature.getEntropy()));
            korelasi90.setText(String.valueOf(feature.getCorrelation()));
            
            glcm.process(gray,_sudut[3], 255);            
            feature.process(glcm.getT());
            asm135.setText(String.valueOf(feature.getEnergy()));
            idm135.setText(String.valueOf(feature.getHomogen()));
            kontras135.setText(String.valueOf(feature.getContrast()));
            entropi135.setText(String.valueOf(feature.getEntropy()));
            korelasi135.setText(String.valueOf(feature.getCorrelation()));
            
            //SUDUT ALL
            /*
            glcm.process(gray,_sudut[4], 255);            
            feature.process(glcm.getT());
            asm0.setText(String.valueOf(feature.getEnergy()));
            idm0.setText(String.valueOf(feature.getHomogen()));
            kontras0.setText(String.valueOf(feature.getContrast()));
            entropi0.setText(String.valueOf(feature.getEntropy()));
            korelasi0.setText(String.valueOf(feature.getCorrelation()));
           */
           
          }
        else
        {
            new  javax.swing.JOptionPane().showMessageDialog(null,"Belum memilih lokasi gambar!","Info",javax.swing.JOptionPane.INFORMATION_MESSAGE);
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

        jScrollPane1 = new javax.swing.JScrollPane();
        Lcitra = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Tsimpan1 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        btnambilcitra = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        idm0 = new javax.swing.JTextField();
        korelasi0 = new javax.swing.JTextField();
        kontras0 = new javax.swing.JTextField();
        entropi0 = new javax.swing.JTextField();
        asm0 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        idm45 = new javax.swing.JTextField();
        korelasi45 = new javax.swing.JTextField();
        kontras45 = new javax.swing.JTextField();
        entropi45 = new javax.swing.JTextField();
        asm45 = new javax.swing.JTextField();
        idm135 = new javax.swing.JTextField();
        korelasi135 = new javax.swing.JTextField();
        kontras135 = new javax.swing.JTextField();
        entropi135 = new javax.swing.JTextField();
        asm135 = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        idm90 = new javax.swing.JTextField();
        jLabel36 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        asm90 = new javax.swing.JTextField();
        entropi90 = new javax.swing.JTextField();
        kontras90 = new javax.swing.JTextField();
        korelasi90 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setViewportView(Lcitra);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 190, 240));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Hasil Pengenalan");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 370, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 51, 204));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("x");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, -1, -1));

        Tsimpan1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Tsimpan1.setText("Proses Pengenalan");
        Tsimpan1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tsimpan1ActionPerformed(evt);
            }
        });
        getContentPane().add(Tsimpan1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 190, 30));

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton4.setText("Keluar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 480, 190, 30));

        btnambilcitra.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnambilcitra.setText("Ambil Citra");
        btnambilcitra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnambilcitraActionPerformed(evt);
            }
        });
        getContentPane().add(btnambilcitra, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 190, 30));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("Nilai GLCM");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 30, -1, -1));

        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel27.setText("Arah Piksel 0 Derajat");
        getContentPane().add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 60, 160, 20));

        jLabel28.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel28.setText("ASM");
        getContentPane().add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 90, 110, 20));

        jLabel29.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel29.setText("Entropi");
        getContentPane().add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 120, 110, 20));

        jLabel30.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel30.setText("Kontras");
        getContentPane().add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 150, 110, 20));

        jLabel31.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel31.setText("Korelasi");
        getContentPane().add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 180, 110, 20));

        jLabel25.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel25.setText("IDM");
        getContentPane().add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 210, 110, 20));

        idm0.setEnabled(false);
        getContentPane().add(idm0, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 210, 170, -1));

        korelasi0.setEnabled(false);
        getContentPane().add(korelasi0, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 180, 170, -1));

        kontras0.setEnabled(false);
        getContentPane().add(kontras0, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 150, 170, -1));

        entropi0.setEnabled(false);
        getContentPane().add(entropi0, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 120, 170, -1));

        asm0.setEnabled(false);
        getContentPane().add(asm0, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 90, 170, -1));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel14.setText("Arah Piksel 45 Derajat ");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 60, 140, -1));

        jLabel37.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel37.setText("ASM");
        getContentPane().add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 90, 110, 20));

        jLabel38.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel38.setText("Entropi");
        getContentPane().add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 120, 110, 20));

        jLabel39.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel39.setText("Kontras");
        getContentPane().add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 150, 110, 20));

        jLabel40.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel40.setText("Korelasi");
        getContentPane().add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 180, 110, 20));

        jLabel41.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel41.setText("IDM");
        getContentPane().add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 210, 110, 20));

        idm45.setEnabled(false);
        getContentPane().add(idm45, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 210, 170, -1));

        korelasi45.setEnabled(false);
        getContentPane().add(korelasi45, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 180, 170, -1));

        kontras45.setEnabled(false);
        getContentPane().add(kontras45, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 150, 170, -1));

        entropi45.setEnabled(false);
        getContentPane().add(entropi45, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 120, 170, -1));

        asm45.setEnabled(false);
        getContentPane().add(asm45, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 90, 170, -1));

        idm135.setEnabled(false);
        getContentPane().add(idm135, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 410, 170, -1));

        korelasi135.setEnabled(false);
        getContentPane().add(korelasi135, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 380, 170, -1));

        kontras135.setEnabled(false);
        getContentPane().add(kontras135, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 350, 170, -1));

        entropi135.setEnabled(false);
        getContentPane().add(entropi135, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 320, 170, -1));

        asm135.setEnabled(false);
        getContentPane().add(asm135, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 290, 170, -1));

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel21.setText("Arah Piksel 135 Derajat");
        getContentPane().add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 260, 160, -1));

        jLabel46.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel46.setText("ASM");
        getContentPane().add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 290, 110, 20));

        jLabel43.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel43.setText("Entropi");
        getContentPane().add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 320, 110, 20));

        jLabel44.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel44.setText("Kontras");
        getContentPane().add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 350, 110, 20));

        jLabel45.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel45.setText("Korelasi");
        getContentPane().add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 380, 110, 20));

        jLabel42.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel42.setText("IDM");
        getContentPane().add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 410, 110, 20));

        idm90.setEnabled(false);
        getContentPane().add(idm90, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 410, 170, -1));

        jLabel36.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel36.setText("IDM");
        getContentPane().add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 410, 110, 20));

        jLabel35.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel35.setText("Korelasi");
        getContentPane().add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 380, 110, 20));

        jLabel34.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel34.setText("Kontras");
        getContentPane().add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 350, 110, 20));

        jLabel33.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel33.setText("Entropi");
        getContentPane().add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 320, 110, 20));

        jLabel32.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel32.setText("ASM");
        getContentPane().add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 290, 110, 20));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel15.setText("Arah Piksel 90 Derajat");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 260, 160, -1));

        asm90.setEnabled(false);
        getContentPane().add(asm90, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 290, 170, -1));

        entropi90.setEnabled(false);
        getContentPane().add(entropi90, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 320, 170, -1));

        kontras90.setEnabled(false);
        getContentPane().add(kontras90, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 350, 170, -1));

        korelasi90.setEnabled(false);
        getContentPane().add(korelasi90, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 380, 170, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Tsimpan1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tsimpan1ActionPerformed
        //FIX
        
            double rtasm=0;
    double rtentropy=0;
    double rtcontrast=0;
    double rtkorelasi=0;
    double rtidm=0;
    double xdiff;
    double xsqr;
    double ciridb1,ciridb2,ciridb3,ciridb4,ciridb5,pemb;
        
    xdiff=0;xsqr=0;
    pemb=1000000;
    
    
    
    if (asm0.getText() !="") {
       rtasm=((Double.parseDouble(asm0.getText()))+(Double.parseDouble(asm45.getText()))+(Double.parseDouble(asm90.getText()))+(Double.parseDouble(asm135.getText())))/4; 
       rtentropy=((Double.parseDouble(entropi0.getText()))+(Double.parseDouble(entropi135.getText()))+(Double.parseDouble(entropi45.getText()))+(Double.parseDouble(entropi90.getText())))/4; 
       rtcontrast=((Double.parseDouble(kontras0.getText()))+(Double.parseDouble(kontras135.getText()))+(Double.parseDouble(kontras45.getText()))+(Double.parseDouble(kontras90.getText())))/4; 
       rtkorelasi=((Double.parseDouble(korelasi0.getText()))+(Double.parseDouble(korelasi135.getText()))+(Double.parseDouble(korelasi45.getText()))+(Double.parseDouble(korelasi90.getText())))/4; 
       rtidm=((Double.parseDouble(idm0.getText()))+(Double.parseDouble(idm135.getText()))+(Double.parseDouble(idm45.getText()))+(Double.parseDouble(idm90.getText())))/4; 
       try{
            koneksi();
            String sql = "Select * from tblciri order by nim asc";
            ResultSet rs=cn.executeQuery(sql);
            while(rs.next()){
                ciridb1=Double.parseDouble(rs.getString(2));
                ciridb2=Double.parseDouble(rs.getString(3));
                ciridb3=Double.parseDouble(rs.getString(4));
                ciridb4=Double.parseDouble(rs.getString(5));
                ciridb5=Double.parseDouble(rs.getString(6));
                
                xdiff=(Math.pow(rtasm-ciridb1,2))+(Math.pow(rtentropy-ciridb2,2))+(Math.pow(rtcontrast-ciridb3,2))+(Math.pow(rtkorelasi-ciridb4,2))+(Math.pow(rtidm-ciridb5,2));
                xsqr=Math.sqrt(xdiff);
                
                if(xsqr<pemb){
                  pemb=xsqr;
                  ketcetak=rs.getString(1);
                  //System.out.println (pemb);
                }
            }
        }catch (Exception e){
        JOptionPane.showMessageDialog(null, "Ada Kesalahan");
        }
       jLabel4.setText(ketcetak);
    }
       
        
      
       

    }//GEN-LAST:event_Tsimpan1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        this.dispose();
        Home a = new Home();  
        a.setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void btnambilcitraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnambilcitraActionPerformed
        // TODO add your handling code here: BENAR

        //setting filter
        FileFilter filter = new FileFilter() {

            @Override
            public boolean accept(File f) {
                return f.isDirectory() || f.getName().toLowerCase().endsWith(".jpg");
            }

            @Override
            public String getDescription() {
                return ".bmp files";
            }
        };

        Component comp = null;
        _jc.addChoosableFileFilter(filter);
        //show open dialog
        int cek = _jc.showOpenDialog(comp);
        //check selected file
        if (cek == JFileChooser.APPROVE_OPTION) {

            LoadImage loadFile = new LoadImage(_jc.getSelectedFile());
            _sourceBI = loadFile.getBI();
            try {
                this.Lcitra.setIcon(new ImageIcon(UtilImage.rescale(_sourceBI, Lcitra.getSize().width,
                        Lcitra.getSize().height)));
            } catch (Exception ept) {
                new javax.swing.JOptionPane().showMessageDialog(null, ept.toString(), "Info", javax.swing.JOptionPane.INFORMATION_MESSAGE);
                return;
            }

            if (_sourceBI.getType() != BufferedImage.TYPE_BYTE_GRAY) {
                //new javax.swing.JOptionPane().showMessageDialog(null, "Citra Asli akan dikonversi ke grayscale", "Info", javax.swing.JOptionPane.INFORMATION_MESSAGE);
                _currentBI = CreateImage.rgb2gray(_sourceBI);
            } else {
                //langsung conversi ke gray!
                _currentBI = _sourceBI;
                
                //Lcitra.setIcon(new ImageIcon(UtilImage.rescale(_currentBI, Lcitra.getSize().width, Lcitra.getSize().height)));
            }
            }
        proses();
        }//GEN-LAST:event_btnambilcitraActionPerformed

    /*
     * public class Euclidean {
     *
     * public static void main(String[] args) { double x1 =
     * Double.parseDouble(args[0]); double y1 = Double.parseDouble(args[1]);
     * double x2 = Double.parseDouble(args[2]); double y2 =
     * Double.parseDouble(args[3]);
     *
     * double xDiff = x1-x2; double xSqr = Math.pow(xDiff, 2);
     *
     * double yDiff = y1-y2; double ySqr = Math.pow(yDiff, 2);
     *
     * double output = Math.sqrt(xSqr + ySqr);
     *
     * System.out.println("Distance = " + output);      *
     * }
     *
     * }
     *
     * ATAU      *
     * public static double calculateDistance(double[] array1, double[] array2)
     * { double Sum = 0.0; for(int i=0;i<array1.length;i++) { Sum = Sum +
     * Math.pow((array1[i]-array2[i]),2.0); } return Math.sqrt(Sum); }
     */
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Fpengenalan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Fpengenalan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Fpengenalan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Fpengenalan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Fpengenalan().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Lcitra;
    private javax.swing.JButton Tsimpan1;
    private javax.swing.JTextField asm0;
    private javax.swing.JTextField asm135;
    private javax.swing.JTextField asm45;
    private javax.swing.JTextField asm90;
    private javax.swing.JButton btnambilcitra;
    private javax.swing.JTextField entropi0;
    private javax.swing.JTextField entropi135;
    private javax.swing.JTextField entropi45;
    private javax.swing.JTextField entropi90;
    private javax.swing.JTextField idm0;
    private javax.swing.JTextField idm135;
    private javax.swing.JTextField idm45;
    private javax.swing.JTextField idm90;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
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
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField kontras0;
    private javax.swing.JTextField kontras135;
    private javax.swing.JTextField kontras45;
    private javax.swing.JTextField kontras90;
    private javax.swing.JTextField korelasi0;
    private javax.swing.JTextField korelasi135;
    private javax.swing.JTextField korelasi45;
    private javax.swing.JTextField korelasi90;
    // End of variables declaration//GEN-END:variables
}
