/*
 *  apply for loop for function jbutton1mousepressed twice to get all images exec in 1 go
 */
package cbrc;

import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;

import java.awt.Checkbox;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.awt.image.DataBuffer;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.border.Border;

/**
 *
 * @author DELL
 */
public class test2 extends javax.swing.JFrame {

   
    
    entervalidpath evp=new entervalidpath();
    
    
    
    
    
    
    
    
    
    public test2() {
        initComponents();
       // overcomp();
        bump();
    }

   
        
    
    
    
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

        parentpnl.setBackground(new java.awt.Color(255, 255, 255));

        toppnl.setBackground(new java.awt.Color(255, 153, 0));
        toppnl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        xpnl.setBackground(new java.awt.Color(255, 153, 0));
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

        backpnl.setBackground(new java.awt.Color(255, 153, 0));
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

        bottomlbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/samples/yellow stip yy.PNG"))); // NOI18N

        javax.swing.GroupLayout bottompnlLayout = new javax.swing.GroupLayout(bottompnl);
        bottompnl.setLayout(bottompnlLayout);
        bottompnlLayout.setHorizontalGroup(
            bottompnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bottomlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        bottompnlLayout.setVerticalGroup(
            bottompnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bottompnlLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(bottomlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        imgpanel.setBackground(new java.awt.Color(255, 204, 51));
        imgpanel.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/samples/pstrip.PNG"))); // NOI18N

        javax.swing.GroupLayout imgpanelLayout = new javax.swing.GroupLayout(imgpanel);
        imgpanel.setLayout(imgpanelLayout);
        imgpanelLayout.setHorizontalGroup(
            imgpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        imgpanelLayout.setVerticalGroup(
            imgpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(imgpanelLayout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        setpathpnl.setBackground(new java.awt.Color(0, 204, 204));

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

        statuspnl.setBackground(new java.awt.Color(0, 204, 204));

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

        chkpnl.setBackground(new java.awt.Color(0, 204, 204));

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

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 954, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 355, Short.MAX_VALUE)
        );

        jScrollPane1.setViewportView(jPanel1);

        delpnl.setBackground(new java.awt.Color(0, 204, 204));

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
                        .addComponent(chkpnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 17, Short.MAX_VALUE))
                    .addGroup(parentpnlLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(parentpnlLayout.createSequentialGroup()
                .addGap(402, 402, 402)
                .addComponent(delpnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 355, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(delpnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bottompnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(parentpnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(parentpnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-978)/2, (screenSize.height-642)/2, 978, 642);
    }// </editor-fold>//GEN-END:initComponents
/**/private void overcomp(){
       
       
     /*  jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
     jPanel1.setPreferredSize(new java.awt.Dimension(10, 30000));
     jPanel1.setLayout(new java.awt.GridLayout(0, 2, 0, 5));
     jScrollPane1.setViewportView(jPanel1);*/
       
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

        parentpnl.setBackground(new java.awt.Color(255, 255, 255));

        toppnl.setBackground(new java.awt.Color(255, 153, 0));
        toppnl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        xpnl.setBackground(new java.awt.Color(255, 153, 0));
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

        backpnl.setBackground(new java.awt.Color(255, 153, 0));
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

        bottomlbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/samples/yellow stip yy.PNG"))); // NOI18N

        javax.swing.GroupLayout bottompnlLayout = new javax.swing.GroupLayout(bottompnl);
        bottompnl.setLayout(bottompnlLayout);
        bottompnlLayout.setHorizontalGroup(
            bottompnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bottomlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        bottompnlLayout.setVerticalGroup(
            bottompnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bottompnlLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(bottomlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        imgpanel.setBackground(new java.awt.Color(255, 204, 51));
        imgpanel.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/samples/pstrip.PNG"))); // NOI18N

        javax.swing.GroupLayout imgpanelLayout = new javax.swing.GroupLayout(imgpanel);
        imgpanel.setLayout(imgpanelLayout);
        imgpanelLayout.setHorizontalGroup(
            imgpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        imgpanelLayout.setVerticalGroup(
            imgpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(imgpanelLayout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        setpathpnl.setBackground(new java.awt.Color(0, 204, 204));

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

        statuspnl.setBackground(new java.awt.Color(0, 204, 204));

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

        chkpnl.setBackground(new java.awt.Color(0, 204, 204));

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

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 952, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 353, Short.MAX_VALUE)
        );

        jScrollPane1.setViewportView(jPanel1);

        delpnl.setBackground(new java.awt.Color(0, 204, 204));

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
                        .addComponent(chkpnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(parentpnlLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jScrollPane1)))
                .addContainerGap())
            .addGroup(parentpnlLayout.createSequentialGroup()
                .addGap(402, 402, 402)
                .addComponent(delpnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addComponent(jScrollPane1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(delpnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bottompnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(parentpnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(parentpnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-978)/2, (screenSize.height-642)/2, 978, 642);
       
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
     jPanel1.setPreferredSize(new java.awt.Dimension(500, 15000));
     jPanel1.setLayout(new java.awt.GridLayout(0, 2, 0, 10));
     jScrollPane1.setViewportView(jPanel1);
       //repaint();
    
    // pack(); 
   }
  
    
  
  
  private void bump(){jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
     jPanel1.setPreferredSize(new java.awt.Dimension(1000, 15000));
     jPanel1.setLayout(new java.awt.GridLayout(0, 2, 0, 10));
     jScrollPane1.setViewportView(jPanel1);
     val=0;
     deletecount=0;}
  
   
   public static void sop(String whattoprint){System.out.println(whattoprint);}   
  
   
   
   
    String sb[]=new String[300];
    JLabel jb[]=new JLabel[300];
    Checkbox cb[] = new Checkbox[300];
    static int val=0;
    static Border borderred = BorderFactory.createLineBorder(Color.RED, 2);
    static Border bordergray = BorderFactory.createLineBorder(Color.GRAY, 2);
    static String yu;
   //jPanel1.setPreferredSize(new java.awt.Dimension(1000, 15000));
   
    
    public void putimg(){
   int heisize=val*500;
   jPanel1.setPreferredSize(new java.awt.Dimension(800,heisize));
   jPanel1.revalidate();
   jPanel1.repaint();
   for(int starting=0;starting<=val;starting++){
   
   jb[starting].setIcon(ResizeImage(sb[starting],jb[starting]));
   //lbl.setIcon(ResizeImage(path2[q],lbl));
   
   
   
   }
   jPanel1.revalidate();
   jPanel1.repaint();
   
                         }
    
     public void deranged(int q,int w,double l){
       
    	Checkbox c1=cb[val]=new Checkbox(path2[q],false); 
        Checkbox c2=cb[val+1]=new Checkbox(path2[w],true);
        
        sb[val]=new String(path2[q]);
        sb[val+1]=new String(path2[w]);
        
        
        
        jPanel1.add(c1);
        cb[val].setForeground(Color.blue);
        cb[val].setBackground(Color.white);
        
        jPanel1.revalidate();
        jPanel1.repaint();
        
         
         
        
        //Border borderblue = BorderFactory.createLineBorder(Color.blue, 5);
        JLabel lbl=jb[val]=new JLabel("");
    	JLabel lb2=jb[val+1]=new JLabel("");
        JLabel lb3=new JLabel("");
    	JLabel lb4=new JLabel("");
        
         Path ppp1 = Paths.get(path2[w]);
         Path ppp2 = Paths.get(path2[q]);
        String fileppp1 = ppp1.getFileName().toString();
        String fileppp2 = ppp2.getFileName().toString();
    	
    	//lbl.setIcon(new ImageIcon(path2[q]));
    	lbl.setBorder(borderred);
       
         jPanel1.add(lbl);
        
          jPanel1.add(c2);
          jPanel1.validate();
          jPanel1.repaint();
        
          //lb2.setIcon(new ImageIcon(path2[w]));
    	  lb2.setBorder(borderred);
        
        jPanel1.add(lb2);
        
        //lbl.setIcon(ResizeImage(path2[q],lbl));
        //lb2.setIcon(ResizeImage(path2[w],lb2));
        
        jPanel1.add(lb3);
        jPanel1.add(lb4);
       
        lb3.setBackground(Color.WHITE);
        lb4.setBackground(Color.WHITE);
        lb3.setBorder(bordergray);
        lb4.setBorder(bordergray);
        lb3.setText("Images"+fileppp2+" and "+fileppp1);
        lb4.setText(" Have "+l+"% Similarity");
        lb3.setFont(new Font("Serif", Font.BOLD, 14));
        lb4.setFont(new Font("Serif", Font.BOLD, 14));
        val=val+2;
        jPanel1.validate();
        jPanel1.repaint();
    	
    }
    
  
    /*ignore error in system.out window when choosing a path and going in leaf folder and making an empty 
     * click generates */
 Color cbuu=new Color(0,204,204); 
 Color c=new Color(255,153,0);
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

    private void t1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t1ActionPerformed

    private void setpathlblMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_setpathlblMouseEntered
     setpathlbl.setForeground(cbuu);
     setpathpnl.setBackground(Color.WHITE);// TODO add your handling code here:
    }//GEN-LAST:event_setpathlblMouseEntered

    private void setpathlblMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_setpathlblMouseExited
       setpathlbl.setForeground(Color.WHITE);
       setpathpnl.setBackground(cbuu); // TODO add your handling code here:
    }//GEN-LAST:event_setpathlblMouseExited

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

    
     public static int getFilesCount(File file) {
  File[] files = file.listFiles();
  int count = 0;
  for (File f : files)
    if (f.isDirectory())
      count += getFilesCount(f);
    else
      count++;

  return count;
} 
     
     
     
    
    private void jButton1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MousePressed
        if(t1.getText().equals("")){evp.setVisible(true); }
            
        else{ 
        int q,w,e,r,t;
        double l;
       
     // for(int justloop=0;justloop<=1;justloop++){
       try{    final File folder = new File(yu);
    	listFilesForFolder(folder);
    	Sort();}
       catch(Exception echo){System.out.println(yu+" "+"may be invalid");}
    	
    	
    	for(q=0;q<i;q++){
    		for(w=q+1;w<i;w++){
                        
    			File fileA = new File(path2[q]);
    			File fileB = new File(path2[w]);
    			if((size[q]+600)>size[w])
    			{
    			
                    l=compareImage(fileA,fileB);
    		   if(l>30){
                        
                       deranged(q,w,l);
    			
                        sop(name[q]+" & "+name[w]+" have "+ l +"% similarity");
    	                sop(path2[q] +" & "+path2[w]);
                        sop(name[q]+" & "+name[w]+" have "+ l +"% similarity\n");
                        sop(path2[q] +" & "+path2[w]+"\n");
                        
    		   }//ends inner if\nested if
    			}//ends outer if
    		}//ends inner for
    	}//ends outer for
        t1.setText("");
       try{ putimg();}catch(Exception emmafrost){}
     status.setText("                DONE       ");//}
        }
                                                   // TODO add your handling code here:
    }//GEN-LAST:event_jButton1MousePressed

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

    
    private void dellblMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dellblMousePressed

      try{  int initialnumber;
            
        for(initialnumber=0;initialnumber<=val;initialnumber++){
           Checkbox checkmate=cb[initialnumber];
           
       if(checkmate.getState()){
          
          Delete(checkmate.getLabel());
          }
        
        }
      }catch(NullPointerException e)
      {sop("null pointer exception in dellblmousepressed function");}
       finally{ status.setText("      "+deletecount+"   Files Deleted         ");}
        //here we can also show no. of files deleted
        
        
        
        
        // TODO add your handling code here:
    }//GEN-LAST:event_dellblMousePressed

     public ImageIcon ResizeImage (String ImagePath,JLabel label)
    {
      ImageIcon MyImage = new ImageIcon(ImagePath);
        Image img = MyImage.getImage();
          Image newImg = img.getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon image = new ImageIcon(newImg);
        return image;
    }
   
     public static void main(String args[]) throws FileNotFoundException, IOException{
        
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(test2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(test2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(test2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(test2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        
        
        
        
        
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new test2().setVisible(true);
            }
        });
    }
    
    static	String[] path = new String[200];
    static	String[] path2 = new String[200];
    static	String[] name = new String[200];
    static double size[]=new double[200];
    static int i,deltemp;
    
    
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
    
    /*  SLASHER CODE OMITTED */
    
     
     public static String Slasher(String s){
		
		String r=s.replaceAll("\\\\","\\\\\\\\");
		return r;
	} 
	
     
     
     
    static int deletecount=0;
    
    public static void Delete(String S)
	{
		
		File fileq = new File(S);
        
        if(fileq.delete())
        {
            System.out.println("File deleted successfully");
            sop("File deleted successfully\n");
            deletecount++;
        }
        else
        {
            System.out.println("Failed to delete the file");
           sop("Failed to delete the file\n");
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
	            if(s.equals("jpg")){
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
    
    public static double compareImage(File fileA, File fileB) {

	    double percentage = 0;
	    long smaller=0,greater=0;
	    try {
	        // take buffer data from both image files //
	        BufferedImage biA = ImageIO.read(fileA);//1010
	        DataBuffer dbA = biA.getData().getDataBuffer();
	        long sizeA = dbA.getSize();
	        double sizeAinKB=fileA.length();
	        sizeAinKB/=1024;
	        
	        BufferedImage biB = ImageIO.read(fileB);  // image file is read 
	        DataBuffer dbB = biB.getData().getDataBuffer(); //that file is made store in buffer
	        long sizeB = dbB.getSize(); //size 
	        double sizeBinKB=fileB.length(); //size 
	        sizeBinKB/=1024;                 //size in KB
	       // System.out.println(sizeBinKB+"KB(B)");
	        
	        double sizee = sizeAinKB*0.5;  //range before
	        double sizef = sizeAinKB*2;    //range after
	        
	        
	        double count = 0;
	        // compare data-buffer objects //
	        if(sizeA>sizeB)
	        {
	        	smaller=sizeB;
	        	greater=sizeA;
	        }
	        else
	        {
	        	smaller=sizeA;
	        	greater=sizeB;
	        }
	        

	        if (sizeBinKB>sizee && sizeBinKB<sizef ) {

	            for (int i = 0; i < smaller; i++) {

	                if (dbA.getElem(i) == dbB.getElem(i)) {
	                    count = count + 1;// increase when element matches
	                }

	            }
	            
	            percentage = (count * 100) / smaller;
	        } else {
	           // System.out.println("Both the images are not of same size");
	        }

	    } catch (Exception e) {
	        System.out.println("Failed to compare image files ...");
	             sop("Failed to compare image files ...\n");}
	    return percentage;
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
