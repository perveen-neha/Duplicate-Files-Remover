/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cbrc;

import java.io.File;
import java.util.Random;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.pdfbox.cos.COSDocument;
import org.apache.pdfbox.pdfparser.PDFParser;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.util.PDFTextStripper;
import java.awt.Checkbox;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.Label;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URL;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.border.Border;

/**
 *
 * @author DELL
 */
public class pdffrm extends javax.swing.JFrame {

    /**
     * Creates new form pdffrm
     */
    public pdffrm() {
        initComponents();
       // overcomp();
        overamp();
    }

    
    
    
    
    
    private void overamp(){
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
     jPanel1.setPreferredSize(new java.awt.Dimension(500, 50000));
     jPanel1.setLayout(new java.awt.GridLayout(0, 2, 0, 5));
     jScrollPane1.setViewportView(jPanel1);}
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        parentpnl = new javax.swing.JPanel();
        toppnl = new javax.swing.JPanel();
        xpnl = new javax.swing.JPanel();
        xlbl = new javax.swing.JLabel();
        backpnl = new javax.swing.JPanel();
        backlbl = new javax.swing.JLabel();
        bottompnl = new javax.swing.JPanel();
        bottomlbl = new javax.swing.JLabel();
        imgpanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        setpathpnl = new javax.swing.JPanel();
        setpathlbl = new javax.swing.JLabel();
        t1 = new javax.swing.JTextField();
        statuspnl = new javax.swing.JPanel();
        status = new javax.swing.JLabel();
        chkpnl = new javax.swing.JPanel();
        jButton1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        delpnl = new javax.swing.JPanel();
        dellbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(978, 642));

        parentpnl.setBackground(new java.awt.Color(255, 255, 255));
        parentpnl.setPreferredSize(new java.awt.Dimension(978, 642));

        toppnl.setBackground(new java.awt.Color(151, 1, 65));
        toppnl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        xpnl.setBackground(new java.awt.Color(151, 1, 65));
        xpnl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        xlbl.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        xlbl.setForeground(new java.awt.Color(255, 255, 255));
        xlbl.setText("  X");
        xlbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                xlblMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                xlblMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                xlblMousePressed(evt);
            }
        });

        javax.swing.GroupLayout xpnlLayout = new javax.swing.GroupLayout(xpnl);
        xpnl.setLayout(xpnlLayout);
        xpnlLayout.setHorizontalGroup(
            xpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(xlbl, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
        );
        xpnlLayout.setVerticalGroup(
            xpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(xlbl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
        );

        backpnl.setBackground(new java.awt.Color(151, 1, 65));
        backpnl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        backlbl.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        backlbl.setForeground(new java.awt.Color(255, 255, 255));
        backlbl.setText(" BACK");
        backlbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                backlblMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                backlblMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                backlblMousePressed(evt);
            }
        });

        javax.swing.GroupLayout backpnlLayout = new javax.swing.GroupLayout(backpnl);
        backpnl.setLayout(backpnlLayout);
        backpnlLayout.setHorizontalGroup(
            backpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        backpnlLayout.setVerticalGroup(
            backpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backlbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout toppnlLayout = new javax.swing.GroupLayout(toppnl);
        toppnl.setLayout(toppnlLayout);
        toppnlLayout.setHorizontalGroup(
            toppnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(toppnlLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backpnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(xpnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );
        toppnlLayout.setVerticalGroup(
            toppnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(toppnlLayout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addGroup(toppnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(xpnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(backpnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        bottompnl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        bottomlbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/samples/be2strip.PNG"))); // NOI18N
        bottomlbl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout bottompnlLayout = new javax.swing.GroupLayout(bottompnl);
        bottompnl.setLayout(bottompnlLayout);
        bottompnlLayout.setHorizontalGroup(
            bottompnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bottompnlLayout.createSequentialGroup()
                .addComponent(bottomlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );
        bottompnlLayout.setVerticalGroup(
            bottompnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bottomlbl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 38, Short.MAX_VALUE)
        );

        imgpanel.setBackground(new java.awt.Color(255, 204, 51));
        imgpanel.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/samples/estrip.PNG"))); // NOI18N
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout imgpanelLayout = new javax.swing.GroupLayout(imgpanel);
        imgpanel.setLayout(imgpanelLayout);
        imgpanelLayout.setHorizontalGroup(
            imgpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        imgpanelLayout.setVerticalGroup(
            imgpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(imgpanelLayout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        setpathpnl.setBackground(new java.awt.Color(151, 1, 65));

        setpathlbl.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        setpathlbl.setForeground(new java.awt.Color(255, 255, 255));
        setpathlbl.setText("   SET PATH");
        setpathlbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                setpathlblMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                setpathlblMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                setpathlblMousePressed(evt);
            }
        });

        javax.swing.GroupLayout setpathpnlLayout = new javax.swing.GroupLayout(setpathpnl);
        setpathpnl.setLayout(setpathpnlLayout);
        setpathpnlLayout.setHorizontalGroup(
            setpathpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(setpathlbl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        setpathpnlLayout.setVerticalGroup(
            setpathpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(setpathpnlLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(setpathlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        t1.setEditable(false);
        t1.setBackground(new java.awt.Color(255, 255, 255));
        t1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t1ActionPerformed(evt);
            }
        });

        statuspnl.setBackground(new java.awt.Color(151, 1, 65));

        status.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        status.setForeground(new java.awt.Color(255, 255, 255));
        status.setText("       SELECT PATH");

        javax.swing.GroupLayout statuspnlLayout = new javax.swing.GroupLayout(statuspnl);
        statuspnl.setLayout(statuspnlLayout);
        statuspnlLayout.setHorizontalGroup(
            statuspnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(status, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
        );
        statuspnlLayout.setVerticalGroup(
            statuspnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(statuspnlLayout.createSequentialGroup()
                .addComponent(status, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        chkpnl.setBackground(new java.awt.Color(151, 1, 65));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("     CHECK");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton1MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton1MousePressed(evt);
            }
        });

        javax.swing.GroupLayout chkpnlLayout = new javax.swing.GroupLayout(chkpnl);
        chkpnl.setLayout(chkpnlLayout);
        chkpnlLayout.setHorizontalGroup(
            chkpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, chkpnlLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        chkpnlLayout.setVerticalGroup(
            chkpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, chkpnlLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 989, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 355, Short.MAX_VALUE)
        );

        jScrollPane1.setViewportView(jPanel1);

        delpnl.setBackground(new java.awt.Color(151, 1, 65));

        dellbl.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        dellbl.setForeground(new java.awt.Color(255, 255, 255));
        dellbl.setText("   DELETE");
        dellbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dellblMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                dellblMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                dellblMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                dellblMousePressed(evt);
            }
        });

        javax.swing.GroupLayout delpnlLayout = new javax.swing.GroupLayout(delpnl);
        delpnl.setLayout(delpnlLayout);
        delpnlLayout.setHorizontalGroup(
            delpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(delpnlLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(dellbl, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        delpnlLayout.setVerticalGroup(
            delpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, delpnlLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(dellbl, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout parentpnlLayout = new javax.swing.GroupLayout(parentpnl);
        parentpnl.setLayout(parentpnlLayout);
        parentpnlLayout.setHorizontalGroup(
            parentpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(toppnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(bottompnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(imgpanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(parentpnlLayout.createSequentialGroup()
                .addGroup(parentpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(parentpnlLayout.createSequentialGroup()
                        .addGroup(parentpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(parentpnlLayout.createSequentialGroup()
                                .addGap(370, 370, 370)
                                .addComponent(statuspnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(parentpnlLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(setpathpnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(t1, javax.swing.GroupLayout.PREFERRED_SIZE, 710, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(chkpnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(parentpnlLayout.createSequentialGroup()
                        .addGap(402, 402, 402)
                        .addComponent(delpnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(parentpnlLayout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 858, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        parentpnlLayout.setVerticalGroup(
            parentpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(parentpnlLayout.createSequentialGroup()
                .addComponent(toppnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(imgpanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(parentpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(parentpnlLayout.createSequentialGroup()
                        .addGroup(parentpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(setpathpnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(t1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(statuspnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(chkpnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 292, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(delpnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bottompnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(parentpnl, javax.swing.GroupLayout.DEFAULT_SIZE, 972, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(parentpnl, javax.swing.GroupLayout.DEFAULT_SIZE, 574, Short.MAX_VALUE)
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-961)/2, (screenSize.height-574)/2, 961, 574);
    }// </editor-fold>//GEN-END:initComponents
Color c=new Color(151,1,65);
Color cbuu=c;
    private void xlblMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_xlblMouseEntered

        xlbl.setForeground(c);
        xpnl.setBackground(Color.WHITE);
    }//GEN-LAST:event_xlblMouseEntered

    private void xlblMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_xlblMouseExited

        xlbl.setForeground(Color.WHITE);
        xpnl.setBackground(c);
    }//GEN-LAST:event_xlblMouseExited

    private void xlblMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_xlblMousePressed
        confirmexit cnf1=new confirmexit();
        cnf1.setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_xlblMousePressed

    private void backlblMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backlblMouseEntered
        backlbl.setForeground(c);
        backpnl.setBackground(Color.WHITE);// TODO add your handling code here:
    }//GEN-LAST:event_backlblMouseEntered

    private void backlblMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backlblMouseExited
        backlbl.setForeground(Color.WHITE);
        backpnl.setBackground(c);  // TODO add your handling code here:
    }//GEN-LAST:event_backlblMouseExited

    private void backlblMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backlblMousePressed
        venom v1=new venom();
        test2 te2=new test2();
        dispose();

        v1.setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_backlblMousePressed

    private void setpathlblMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_setpathlblMouseEntered
        setpathlbl.setForeground(cbuu);
        setpathpnl.setBackground(Color.WHITE);// TODO add your handling code here:
    }//GEN-LAST:event_setpathlblMouseEntered

    private void setpathlblMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_setpathlblMouseExited
        setpathlbl.setForeground(Color.WHITE);
        setpathpnl.setBackground(cbuu); // TODO add your handling code here:
    }//GEN-LAST:event_setpathlblMouseExited
static String yu="";
    private void setpathlblMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_setpathlblMousePressed

        JFileChooser fileChooser = new JFileChooser();
        String singleslashpath=new String();
        fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        
         fileChooser.setAcceptAllFileFilterUsed(false);
 
        int rVal = fileChooser.showOpenDialog(null);
        //path = path.replace("\\", "\\\\");
        if (rVal == JFileChooser.APPROVE_OPTION) {
            singleslashpath=fileChooser.getSelectedFile().toString();
          t1.setText(singleslashpath.replace("\\", "\\\\"));}
      
          yu=t1.getText();

    }//GEN-LAST:event_setpathlblMousePressed

    private void t1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t1ActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseEntered
        jButton1.setForeground(cbuu);
        chkpnl.setBackground(Color.WHITE);  // TODO add your handling code here:
    }//GEN-LAST:event_jButton1MouseEntered

    private void jButton1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseExited
        jButton1.setForeground(Color.WHITE);
        chkpnl.setBackground(cbuu); // TODO add your handling code here:
    }//GEN-LAST:event_jButton1MouseExited

    
    
    Checkbox cbr[] = new Checkbox[500];
    static int val=0;
    
    
    public static void sop(String whattoprint){System.out.println(whattoprint);}
    
    
    JLabel jb[]=new JLabel[500];
    public void deranged(int q,int w,int l) throws InterruptedException{
        
        String notknow="";
        
        
    	cbr[val]=new Checkbox(path2[q],false); 
    	Checkbox c1 = cbr[val];
        Checkbox c2=cbr[val+1];
    	
        if(l==0){
        notknow="not same";
        c2=cbr[val+1]=new Checkbox(path2[w],false);}
        
        else{c2=cbr[val+1]=new Checkbox(path2[w],true);
        notknow="same";}
        
        jPanel1.add(c1);
        
        cbr[val].setForeground(Color.blue);
        cbr[val].setBackground(Color.white);
        jPanel1.revalidate();
        jPanel1.repaint();
        
        Border borderred = BorderFactory.createLineBorder(Color.RED, 2);
        Border bordergray = BorderFactory.createLineBorder(Color.GRAY, 2);
        //Border borderblue = BorderFactory.createLineBorder(Color.blue, 5);
    	JLabel lbl=new JLabel("");
    	JLabel lb2=new JLabel("");
        JLabel lb3=new JLabel("");
    	JLabel lb4=new JLabel("");
      
        lbl=jb[val]=new JLabel("");
        lb2=jb[val+1]=new JLabel("");
        
       Path ppp1 = Paths.get(path2[w]);
         Path ppp2 = Paths.get(path2[q]);
        String fileppp1 = ppp1.getFileName().toString();
        String fileppp2 = ppp2.getFileName().toString();
    	
    	//lbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/samples/pdf-icon.jpg")));
    	lbl.setBorder(borderred);
        jPanel1.add(lbl);
        
        jPanel1.add(c2);
        //lbl.setIcon(new ImageIcon("C:\\Users\\DELL\\Desktop\\piDic - Copy - Copy\\stirrup pants.jpg")); 
       // lb2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/samples/pdf-icon.jpg")));
        //lb2.setIcon(new ImageIcon("C:\\Users\\DELL\\Desktop\\piDic - Copy - Copy\\stirrup pants.jpg"));
    	lb2.setBorder(borderred);
        jPanel1.add(lb2);
        
       // lb3.setBackground(Color.WHITE);
        //lb4.setBackground(Color.WHITE);
        lb3.setBorder(bordergray);
        lb4.setBorder(bordergray);
        
        lb3.setText("Pdfs "+fileppp2+" and "+fileppp1);
       
        lb4.setText(" are "+notknow);
        lb3.setFont(new Font("Serif", Font.BOLD, 16));
        lb4.setFont(new Font("Serif", Font.BOLD, 18));
        jPanel1.add(lb3);
        jPanel1.add(lb4);
        val=val+2;
        jPanel1.validate();
        jPanel1.repaint();
        
      // try{ Thread.sleep(500);sop("i complete deranged first pass");}
    //   catch(Exception e){sop("was unable to sleep thread in deranged , the exception was : "+e);}
    	
    }
     public void putimg(){
   int heisize=val*250;
   jPanel1.setPreferredSize(new java.awt.Dimension(800,heisize));
   jPanel1.revalidate();
   jPanel1.repaint();
   
   URL imgurl1=getClass().getResource("/samples/pdf-icon.png");
   //String imgurl=imgurl1.toString().replace("//","////");
   //sop(imgurl);
   for(int starting=0;starting<=val;starting++){
   
   jb[starting].setIcon(new javax.swing.ImageIcon(getClass().getResource("/samples/pdf-icon.png")));
   jb[starting].setIcon(ResizeImage(imgurl1,jb[starting]));
   //lbl.setIcon(ResizeImage(path2[q],lbl));
   
   
   
   }}
       public ImageIcon ResizeImage (URL ImagePath,JLabel label)
    {
      ImageIcon MyImage = new ImageIcon(ImagePath);
        Image img = MyImage.getImage();
          Image newImg = img.getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon image = new ImageIcon(newImg);
        return image;
    }
    private void jButton1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MousePressed
      int q,w,e,r,t,l=0;
       
      if(t1.getText().equals("")){new entervalidpath().setVisible(true);}
      else{ try{    final File folder = new File(yu);
    	listFilesForFolder(folder);
    	Sort();}
       catch(Exception echo)
       {System.out.println("may be invalid");}
    	
    	for(q=0;q<i;q++){
    		for(w=q+1;w<i;w++){
    			File fileA = new File(path2[q]);
    			File fileB = new File(path2[w]);
               
                        
                        try {
                    l=ToText(path2[q],path2[w]);
                    
                } catch (IOException ex) {
                    Logger.getLogger(pdffrm.class.getName()).log(Level.SEVERE, null, ex);
                    sop("line 944 exception in check button function");
                }
    			
                        try {
                    deranged(q,w,l);
                } catch (InterruptedException ex) {
                    Logger.getLogger(pdffrm.class.getName()).log(Level.SEVERE, null, ex);
                }
                        
                        
                        if(l==0){
                            System.out.println(name[q]+" and "+name[w]+" doesnt match" );
                            sp=sp+"\n"+name[q]+" and "+name[w]+" doesnt match";
                         }
                        else
                        {System.out.println(name[q]+" and "+name[w]+" are same" );
                            sp=sp+"\n"+name[q]+" and "+name[w]+" are same";
                         }
                
    		   }//ends for-inner
             
                //here remove try catch for deranged. compiler
                //asked it to put as you put sleep inside deranged,also in try catch
            /*   try {
                    deranged(q,w,l);
                } catch (InterruptedException ex) {
                    Logger.getLogger(pdffrm.class.getName()).log(Level.SEVERE, null, ex);
                }*/
    		    }
        
        
        }
      
     try{ putimg();}catch(Exception emmm){sop("exception at jbutton1mousepressedfunction. cannot put icon to label");}//ends for -outer loop
        
        t1.setText("");
     status.setText("                DONE       ");
      
      
      
    }//GEN-LAST:event_jButton1MousePressed
private PDFParser parser,parser2;
   private PDFTextStripper pdfStripper,pdfStripper2;
   private PDDocument pdDoc ,pdDoc2;
   private COSDocument cosDoc,cosDoc2 ;
   
   private String Text,Text2 ;
   private String filePath,filePath2;
   private File file,file2;
   
     public static int randInt(int min, int max) {

    // NOTE: This will (intentionally) not run as written so that folks
    // copy-pasting have to think about how to initialize their
    // Random instance.  Initialization of the Random instance is outside
    // the main scope of the question, but some decent options are to have
    // a field that is initialized once and then re-used as needed or to
    // use ThreadLocalRandom (if using at least Java 1.7).
    // 
    // In particular, do NOT do 'Random rand = new Random()' here or you
    // will get not very good / not very random results.
       
       Random rand = new Random(); 
int value = rand.nextInt((max - min) + 1) + min;
System.out.println(value);

if(value==0){
    return 1;
}
else
{
    return value;
}  // Random rand = null;
    

    // nextInt is normally exclusive of the top value,
    // so add 1 to make it inclusive
    //int randomNum = rand.nextInt(max);

    
}
     
     
     
     
     public int ToText(String filePath,String filePath2) throws IOException
   {
       int y,y1,y2,y3,i;
     
       this.pdfStripper = null;
       this.pdDoc = null;
       this.cosDoc = null;
       
       file = new File(filePath);
       //parser = new PDFParser(new RandomAccessFile(file,"r")); // update for PDFBox V 2.0
       parser = new PDFParser(new FileInputStream(file));
       parser.parse();
       cosDoc = parser.getDocument();
       pdfStripper = new PDFTextStripper();
       pdDoc = new PDDocument(cosDoc);
       pdDoc.getNumberOfPages();
       int count = pdDoc.getNumberOfPages();
       
       
       file2 = new File(filePath2);
       parser2 = new PDFParser(new FileInputStream(file2));
       parser2.parse();
       cosDoc2 = parser2.getDocument();
       pdfStripper2 = new PDFTextStripper();
       pdDoc2 = new PDDocument(cosDoc2);
       int count2 = pdDoc2.getNumberOfPages();
       
       if(count2!=count)
       {
            pdDoc2.close();
              cosDoc2.close();
              pdDoc.close();
              cosDoc.close();
           return 0;
           
       }
       
       else
        {
        if(count<10)
            {
                    y=randInt(1,count+1);
                    pdfStripper.setStartPage(y);
               pdfStripper.setEndPage(y);

              // System.out.println(count);
               pdfStripper2.setStartPage(y);
               pdfStripper2.setEndPage(y);



               // reading text from page 1 to 10
               // if you want to get text from full pdf file use this code
               // pdfStripper.setEndPage(pdDoc.getNumberOfPages());

               Text = pdfStripper.getText(pdDoc);
               Text=Text.replaceAll("\\s","");
               System.out.println(Text);
               Text2= pdfStripper2.getText(pdDoc2);
               Text2=Text2.replaceAll("\\s","");
               System.out.println(Text2);
               pdDoc2.close();
              cosDoc2.close();
              pdDoc.close();
              cosDoc.close();

               if(Text.equals(Text2))
               {
                   System.out.println("matched");
                   return 1;
               }
               else
               {
                   //System.out.println("not matched");
                   return 0;
               }
               }
          
        
        else if(count<50)
        {
            
            int x=20,matchcount=0;
            for(i=0;i<=(count/20);i++){
                if(count<20) {
                    y=randInt(1,count+1);
                }
                else {
                    y=randInt(20*i,x);
                }
                    pdfStripper.setStartPage(y);
               pdfStripper.setEndPage(y);

              // System.out.println(count);
               try{
               pdfStripper2.setStartPage(y);
               pdfStripper2.setEndPage(y);
               Text = pdfStripper.getText(pdDoc);
               Text=Text.replaceAll("\\s","");
               System.out.println(Text);
               Text2= pdfStripper2.getText(pdDoc2);
               Text2=Text2.replaceAll("\\s","");
               System.out.println(Text2);
               }catch(NullPointerException e){
               };
               pdDoc2.close();
              cosDoc2.close();
              pdDoc.close();
              cosDoc.close();
               
               if(Text.equals(Text2))
               {
                   matchcount++;
               }
                 if(x+20<count-1){
                   x=x+20;
                   }
                 else
                   {
                   x=count-2;
                   }
                 
               

            }  
               if(matchcount==i){
                   System.out.println("matchequals i");
                   return 1;
               }       
               else{
                   System.out.println("match not equals");
                   return 0;
               }
                      
        }
       }//else of algo
        pdDoc2.close();
              cosDoc2.close();
              pdDoc.close();
              cosDoc.close();
       
       return 0;
   }

    public void setFilePath(String filePath,String filePath2) {
        this.filePath = filePath;
        this.filePath2=filePath2;
        
    }


     
     
     
     
     
     
     
     
     
     
     
     
     
    private void dellblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dellblMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_dellblMouseClicked

    private void dellblMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dellblMouseEntered
        dellbl.setForeground(cbuu);
        delpnl.setBackground(Color.WHITE);    // TODO add your handling code here:
    }//GEN-LAST:event_dellblMouseEntered

    private void dellblMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dellblMouseExited
        dellbl.setForeground(Color.WHITE);
        delpnl.setBackground(cbuu);// TODO add your handling code here:
    }//GEN-LAST:event_dellblMouseExited
static int deletecount2=0;
    private void dellblMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dellblMousePressed
 try{  int initialnumber=0;
        for(initialnumber=0;initialnumber<=val;initialnumber++){
           Checkbox checkmate=cbr[initialnumber];
           
       if(checkmate.getState()){
          String diepath=checkmate.getLabel();
          Delete(diepath);
          
          }
        
        }
      }catch(NullPointerException e)
      {sop("null pointer exception in dellblmousepressed function");}
       finally{ status.setText("      "+deletecount2+"   Files Deleted         ");}
    }//GEN-LAST:event_dellblMousePressed

    
    
     static	String[] path = new String[200];
    static	String[] path2 = new String[200];
    static	String[] name = new String[200];
    static double size[]=new double[200];
    static int i,deltemp;
    static String sp="";
    
    public static void Sort()
	{
	
		
		for(int s=0;s<i;s++){
			int index=s;
			for(int j=s+1;j<i;j++){
				if(size[j]<size[index]){
					index=j;
				}
			}
			double smallerNumber =size[index];
			size[index]=size[s];
			size[s]=smallerNumber;
			
			String Temp1 =name[index];
			name[index]=name[s];
			name[s]=Temp1;
			
			String Temp2 =path[index];
			path[index]=path[s];
			path[s]=Temp2;
			
			String Temp3 =path2[index];
			path2[index]=path2[s];
			path2[s]=Temp3;
		} 
		

		
		  for(int j=0;j<i;j++){
		//    	System.out.println(name[j]+"--->"+size[j]+"--->"+path2[j]);
		    }
		
	}
    
    public static String Slasher(String s){
		
		String r=s.replaceAll("\\\\","\\\\\\\\");
		return r;
	} 
	
    
    public static void Delete(String S)
	{
		
		File fileq = new File(S);
        
        if(fileq.delete())
        {
            System.out.println("File deleted successfully");
           deletecount2++;// sop("File deleted successfully\n");
        }
        else
        {
            System.out.println("Failed to delete the file");
           //sop("Failed to delete the file\n");
        }
	}
    
    public static String getFileExtension(File file) {
	    String name = file.getName();
	    try {
	        return name.substring(name.lastIndexOf(".") + 1);
	    } catch (Exception e) {
	        return "";
	    }
	}
    
    
    public static void listFilesForFolder(final File folder) {
		//spider 
		int j;
	    for (final File fileEntry : folder.listFiles()) {
	        if (fileEntry.isDirectory()) {
	            listFilesForFolder(fileEntry);
	        } else {
	            String s=getFileExtension(fileEntry);
	       //     System.out.println(s);       
	            if(s.equals("pdf")){
	            	//  System.out.println(fileEntry.getName());
	            	  name[i]=(fileEntry.getName());
	    	          path[i]=(fileEntry.getAbsolutePath());
	    	          path2[i]=Slasher(path[i]);
	    	          size[i] = (fileEntry.length())/1024;
	    	   /*       try{
	    	          BufferedImage biA = ImageIO.read(fileEntry);
	    		        DataBuffer dbA = biA.getData().getDataBuffer();
	    		         
	    	          }catch(IOException e){
	    	        	  e.printStackTrace();
	    	          } */
	    	          
	    	          i=i+1;
	    	          
	            }
	        }
	    }}
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[])throws IOException,NullPointerException {
       
        
        
        
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(pdffrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(pdffrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(pdffrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(pdffrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new pdffrm().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backlbl;
    private javax.swing.JPanel backpnl;
    private javax.swing.JLabel bottomlbl;
    private javax.swing.JPanel bottompnl;
    private javax.swing.JPanel chkpnl;
    private javax.swing.JLabel dellbl;
    private javax.swing.JPanel delpnl;
    private javax.swing.JPanel imgpanel;
    private javax.swing.JLabel jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel parentpnl;
    private javax.swing.JLabel setpathlbl;
    private javax.swing.JPanel setpathpnl;
    private javax.swing.JLabel status;
    private javax.swing.JPanel statuspnl;
    public static javax.swing.JTextField t1;
    private javax.swing.JPanel toppnl;
    private javax.swing.JLabel xlbl;
    private javax.swing.JPanel xpnl;
    // End of variables declaration//GEN-END:variables
}
