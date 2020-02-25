/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resolvermapas;

import java.awt.Toolkit;
import javax.swing.JButton;
import javax.swing.JRadioButton;

/**
 *
 * @author victoromar
 */
public class MainFrame extends javax.swing.JFrame {
        
    public MainFrame() {
        initComponents();
        twvar = new JButton[]{twvar0, twvar1, twvar2, twvar3};
        trvar = new JButton[]{trvar0, trvar1, trvar2, trvar3, trvar4, trvar5, trvar6, trvar7};
        fvar = new JButton[]{fvar0, fvar1, fvar2, fvar3, fvar4, fvar5, fvar6, fvar7, fvar8, fvar9, fvar10, fvar11, fvar12, fvar13, fvar14, fvar15};
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        selectors = new javax.swing.ButtonGroup();
        bottompanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        textpane = new javax.swing.JTextPane();
        solve = new javax.swing.JButton();
        reset = new javax.swing.JButton();
        back = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        mainpanel = new javax.swing.JPanel();
        homepanel = new javax.swing.JPanel();
        logolabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        two = new javax.swing.JRadioButton();
        three = new javax.swing.JRadioButton();
        four = new javax.swing.JRadioButton();
        twvarpanel = new javax.swing.JPanel();
        twvar0 = new javax.swing.JButton();
        twvar1 = new javax.swing.JButton();
        twvar2 = new javax.swing.JButton();
        twvar3 = new javax.swing.JButton();
        trvarpanel = new javax.swing.JPanel();
        trvar0 = new javax.swing.JButton();
        trvar1 = new javax.swing.JButton();
        trvar2 = new javax.swing.JButton();
        trvar3 = new javax.swing.JButton();
        trvar4 = new javax.swing.JButton();
        trvar5 = new javax.swing.JButton();
        trvar6 = new javax.swing.JButton();
        trvar7 = new javax.swing.JButton();
        fvarpanel = new javax.swing.JPanel();
        fvar0 = new javax.swing.JButton();
        fvar1 = new javax.swing.JButton();
        fvar2 = new javax.swing.JButton();
        fvar3 = new javax.swing.JButton();
        fvar4 = new javax.swing.JButton();
        fvar5 = new javax.swing.JButton();
        fvar6 = new javax.swing.JButton();
        fvar7 = new javax.swing.JButton();
        fvar8 = new javax.swing.JButton();
        fvar9 = new javax.swing.JButton();
        fvar10 = new javax.swing.JButton();
        fvar11 = new javax.swing.JButton();
        fvar12 = new javax.swing.JButton();
        fvar13 = new javax.swing.JButton();
        fvar14 = new javax.swing.JButton();
        fvar15 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Resolvedor de mapas victor omar");
        setFocusTraversalPolicyProvider(true);
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("Logo.png")));

        textpane.setEditable(false);
        textpane.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        textpane.setText("aqui va la formula resuelta");
        textpane.setFocusable(false);
        textpane.setText("NB: Don't care is counted as zero!");
        jScrollPane1.setViewportView(textpane);

        solve.setText("Resolver");
        if (!selectors.isSelected(two.getModel())) {
            solve.setEnabled(false);
        }
        solve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                solveActionPerformed(evt);
            }
        });

        reset.setText("Borrar");
        if (!selectors.isSelected(two.getModel())) {
            reset.setEnabled(false);
        }
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });

        back.setText("Atrás");
        if (!selectors.isSelected(two.getModel())) {
            back.setEnabled(false);
        }
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        jLabel2.setText("Autor: Víctor Omar Vento");

        jLabel3.setText("Ing. Informatica 2 - 2020");

        javax.swing.GroupLayout bottompanelLayout = new javax.swing.GroupLayout(bottompanel);
        bottompanel.setLayout(bottompanelLayout);
        bottompanelLayout.setHorizontalGroup(
            bottompanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bottompanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(bottompanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(solve)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(reset)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(back)
                .addContainerGap())
        );
        bottompanelLayout.setVerticalGroup(
            bottompanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bottompanelLayout.createSequentialGroup()
                .addGroup(bottompanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(bottompanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(bottompanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(solve)
                            .addComponent(reset)
                            .addComponent(back)
                            .addComponent(jLabel3)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bottompanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(31, 31, 31))
        );

        mainpanel.setLayout(new java.awt.CardLayout());

        logolabel.setFont(new java.awt.Font("Harrington", 1, 45)); // NOI18N
        logolabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logolabel.setText("Solucionador de Mapas de Karnaugh");
        logolabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        logolabel.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jLabel1.setFont(new java.awt.Font("Sitka Text", 0, 18)); // NOI18N
        jLabel1.setText("Selecciona la cantidad de Variables");

        selectors.add(two);
        two.setFont(new java.awt.Font("Eras Medium ITC", 1, 24)); // NOI18N
        two.setText("2");
        two.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                twoActionPerformed(evt);
            }
        });

        selectors.add(three);
        three.setFont(new java.awt.Font("Eras Medium ITC", 1, 24)); // NOI18N
        three.setText("3");
        three.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                threeActionPerformed(evt);
            }
        });

        selectors.add(four);
        four.setFont(new java.awt.Font("Eras Medium ITC", 1, 24)); // NOI18N
        four.setText("4");
        four.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fourActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout homepanelLayout = new javax.swing.GroupLayout(homepanel);
        homepanel.setLayout(homepanelLayout);
        homepanelLayout.setHorizontalGroup(
            homepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(homepanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(homepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel1)
                    .addComponent(logolabel, javax.swing.GroupLayout.DEFAULT_SIZE, 885, Short.MAX_VALUE)
                    .addGroup(homepanelLayout.createSequentialGroup()
                        .addComponent(two)
                        .addGap(64, 64, 64)
                        .addComponent(three)
                        .addGap(56, 56, 56)
                        .addComponent(four)))
                .addGap(45, 45, 45))
        );
        homepanelLayout.setVerticalGroup(
            homepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(homepanelLayout.createSequentialGroup()
                .addContainerGap(256, Short.MAX_VALUE)
                .addComponent(logolabel, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(homepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(two)
                    .addComponent(three)
                    .addComponent(four))
                .addGap(169, 169, 169))
        );

        mainpanel.add(homepanel, "card5");

        twvarpanel.setLayout(new java.awt.GridLayout(2, 2, 1, 1));

        twvar0.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        twvar0.setText("0");
        twvar0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                twvarActionPerformed(evt);
            }
        });
        twvarpanel.add(twvar0);

        twvar1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        twvar1.setText("0");
        twvar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                twvarActionPerformed(evt);
            }
        });
        twvarpanel.add(twvar1);

        twvar2.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        twvar2.setText("0");
        twvar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                twvarActionPerformed(evt);
            }
        });
        twvarpanel.add(twvar2);

        twvar3.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        twvar3.setText("0");
        twvar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                twvarActionPerformed(evt);
            }
        });
        twvarpanel.add(twvar3);

        mainpanel.add(twvarpanel, "card4");

        trvarpanel.setLayout(new java.awt.GridLayout(2, 4, 1, 1));

        trvar0.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        trvar0.setText("0");
        trvar0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                trvarActionPerformed(evt);
            }
        });
        trvarpanel.add(trvar0);

        trvar1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        trvar1.setText("0");
        trvar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                trvarActionPerformed(evt);
            }
        });
        trvarpanel.add(trvar1);

        trvar2.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        trvar2.setText("0");
        trvar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                trvarActionPerformed(evt);
            }
        });
        trvarpanel.add(trvar2);

        trvar3.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        trvar3.setText("0");
        trvar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                trvarActionPerformed(evt);
            }
        });
        trvarpanel.add(trvar3);

        trvar4.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        trvar4.setText("0");
        trvar4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                trvarActionPerformed(evt);
            }
        });
        trvarpanel.add(trvar4);

        trvar5.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        trvar5.setText("0");
        trvar5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                trvarActionPerformed(evt);
            }
        });
        trvarpanel.add(trvar5);

        trvar6.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        trvar6.setText("0");
        trvar6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                trvarActionPerformed(evt);
            }
        });
        trvarpanel.add(trvar6);

        trvar7.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        trvar7.setText("0");
        trvar7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                trvarActionPerformed(evt);
            }
        });
        trvarpanel.add(trvar7);

        mainpanel.add(trvarpanel, "card3");

        fvarpanel.setLayout(new java.awt.GridLayout(4, 4, 1, 1));

        fvar0.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        fvar0.setText("0");
        fvar0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fvarActionPerformed(evt);
            }
        });
        fvarpanel.add(fvar0);

        fvar1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        fvar1.setText("0");
        fvar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fvarActionPerformed(evt);
            }
        });
        fvarpanel.add(fvar1);

        fvar2.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        fvar2.setText("0");
        fvar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fvarActionPerformed(evt);
            }
        });
        fvarpanel.add(fvar2);

        fvar3.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        fvar3.setText("0");
        fvar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fvarActionPerformed(evt);
            }
        });
        fvarpanel.add(fvar3);

        fvar4.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        fvar4.setText("0");
        fvar4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fvarActionPerformed(evt);
            }
        });
        fvarpanel.add(fvar4);

        fvar5.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        fvar5.setText("0");
        fvar5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fvarActionPerformed(evt);
            }
        });
        fvarpanel.add(fvar5);

        fvar6.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        fvar6.setText("0");
        fvar6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fvarActionPerformed(evt);
            }
        });
        fvarpanel.add(fvar6);

        fvar7.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        fvar7.setText("0");
        fvar7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fvarActionPerformed(evt);
            }
        });
        fvarpanel.add(fvar7);

        fvar8.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        fvar8.setText("0");
        fvar8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fvarActionPerformed(evt);
            }
        });
        fvarpanel.add(fvar8);

        fvar9.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        fvar9.setText("0");
        fvar9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fvarActionPerformed(evt);
            }
        });
        fvarpanel.add(fvar9);

        fvar10.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        fvar10.setText("0");
        fvar10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fvarActionPerformed(evt);
            }
        });
        fvarpanel.add(fvar10);

        fvar11.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        fvar11.setText("0");
        fvar11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fvarActionPerformed(evt);
            }
        });
        fvarpanel.add(fvar11);

        fvar12.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        fvar12.setText("0");
        fvar12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fvarActionPerformed(evt);
            }
        });
        fvarpanel.add(fvar12);

        fvar13.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        fvar13.setText("0");
        fvar13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fvarActionPerformed(evt);
            }
        });
        fvarpanel.add(fvar13);

        fvar14.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        fvar14.setText("0");
        fvar14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fvarActionPerformed(evt);
            }
        });
        fvarpanel.add(fvar14);

        fvar15.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        fvar15.setText("0");
        fvar15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fvarActionPerformed(evt);
            }
        });
        fvarpanel.add(fvar15);

        mainpanel.add(fvarpanel, "card2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bottompanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mainpanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mainpanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bottompanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void twvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_twvarActionPerformed
        changeJButtonText((JButton) evt.getSource());
    }//GEN-LAST:event_twvarActionPerformed

    private void trvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_trvarActionPerformed
        changeJButtonText((JButton) evt.getSource());
    }//GEN-LAST:event_trvarActionPerformed

    private void fvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fvarActionPerformed
        changeJButtonText((JButton) evt.getSource());
    }//GEN-LAST:event_fvarActionPerformed

    private void solveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_solveActionPerformed
        int val[];
        String soln;
        
        if (twvarpanel.isShowing()) {

            val = new int[4];
            
            for (int i = 0; i < val.length; i++) {
              
                if (twvar[i].getText().matches("X")) {
                    val[i] = 2;
                } else {
                    val[i] = Integer.parseInt(twvar[i].getText());
                }
            }

            
            DosVariables solver = new DosVariables(val);
           
            soln = solver.resolver();
        } else if (trvarpanel.isShowing()) {
            
            val = new int[8];
            
            for (int i = 0; i < val.length; i++) {
               
                if (trvar[i].getText().matches("X")) {
                    val[i] = 2;
                } else {
                    val[i] = Integer.parseInt(trvar[i].getText());
                }
            }

      
            TresVariables solver = new TresVariables(val);
            
            soln = solver.resolver();
        } else {
           
            val = new int[16];
            
            for (int i = 0; i < val.length; i++) {
                
                if (fvar[i].getText().matches("X")) {
                    val[i] = 2;
                } else {
                    val[i] = Integer.parseInt(fvar[i].getText());
                }
            }


            CuatroVariables solver = new CuatroVariables(val);

            soln = solver.resolver();
        }


        if (soln.isEmpty()) {
            textpane.setText(null);
        } else {
            textpane.setText("f() = " + soln);
        }
    }//GEN-LAST:event_solveActionPerformed

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
        if (twvarpanel.isShowing()) {
    
            for (JButton twvarlocal : twvar) {
                twvarlocal.setText("0");
            }
        } else if (trvarpanel.isShowing()) {

            for (JButton trvarlocal : trvar) {
                trvarlocal.setText("0");
            }
        } else {
        
            for (JButton fvarlocal : fvar) {
                fvarlocal.setText("0");
            }
        }
        
        textpane.setText(null);
    }//GEN-LAST:event_resetActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        if (twvarpanel.isShowing()) {
            twvarpanel.setVisible(false);
            homepanel.setVisible(true);
        } else if (trvarpanel.isShowing()) {
            trvarpanel.setVisible(false);
            homepanel.setVisible(true);
        } else {
            fvarpanel.setVisible(false);
            homepanel.setVisible(true);
        }


        solve.setEnabled(false);
        reset.setEnabled(false);
        back.setEnabled(false);

 
        two.setVisible(true);
        three.setVisible(true);
        four.setVisible(true);
        
        selectors.clearSelection();
        two.requestFocus();
        
        textpane.setText(null);
    }//GEN-LAST:event_backActionPerformed

    private void twoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_twoActionPerformed
        variableSelection(two);
    }//GEN-LAST:event_twoActionPerformed

    private void threeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_threeActionPerformed
        variableSelection(three);
    }//GEN-LAST:event_threeActionPerformed

    private void fourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fourActionPerformed
        variableSelection(four);
    }//GEN-LAST:event_fourActionPerformed

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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new MainFrame().setVisible(true);
        });
    }
    
    private void changeJButtonText(JButton btn) {
 
        if (btn.getText().matches("0")) {
            btn.setText("1");
        } else if (btn.getText().matches("1")) {
            btn.setText("X");
        } else {
            btn.setText("0");
        }
    }
    
    private void variableSelection(JRadioButton button) {
        if (button.equals(two)) {
            homepanel.setVisible(false);
            twvarpanel.setVisible(true);
            
            for (JButton twvarlocal : twvar) {
                twvarlocal.setText("0");
            }
        } else if (button.equals(three)) {
            homepanel.setVisible(false);
            trvarpanel.setVisible(true);
            
            for (JButton trvarlocal : trvar) {
                trvarlocal.setText("0");
            }
        } else {
            homepanel.setVisible(false);
            fvarpanel.setVisible(true);
            
            for (JButton fvarlocal : fvar) {
                fvarlocal.setText("0");
            }
        }

   
        solve.setEnabled(true);
        reset.setEnabled(true);
        back.setEnabled(true);

  
        two.setVisible(false);
        three.setVisible(false);
        four.setVisible(false);
        
        textpane.setText(null);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JPanel bottompanel;
    private javax.swing.JRadioButton four;
    private javax.swing.JButton fvar0;
    private javax.swing.JButton fvar1;
    private javax.swing.JButton fvar10;
    private javax.swing.JButton fvar11;
    private javax.swing.JButton fvar12;
    private javax.swing.JButton fvar13;
    private javax.swing.JButton fvar14;
    private javax.swing.JButton fvar15;
    private javax.swing.JButton fvar2;
    private javax.swing.JButton fvar3;
    private javax.swing.JButton fvar4;
    private javax.swing.JButton fvar5;
    private javax.swing.JButton fvar6;
    private javax.swing.JButton fvar7;
    private javax.swing.JButton fvar8;
    private javax.swing.JButton fvar9;
    private javax.swing.JPanel fvarpanel;
    private javax.swing.JPanel homepanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel logolabel;
    private javax.swing.JPanel mainpanel;
    private javax.swing.JButton reset;
    private javax.swing.ButtonGroup selectors;
    private javax.swing.JButton solve;
    private javax.swing.JTextPane textpane;
    private javax.swing.JRadioButton three;
    private javax.swing.JButton trvar0;
    private javax.swing.JButton trvar1;
    private javax.swing.JButton trvar2;
    private javax.swing.JButton trvar3;
    private javax.swing.JButton trvar4;
    private javax.swing.JButton trvar5;
    private javax.swing.JButton trvar6;
    private javax.swing.JButton trvar7;
    private javax.swing.JPanel trvarpanel;
    private javax.swing.JRadioButton two;
    private javax.swing.JButton twvar0;
    private javax.swing.JButton twvar1;
    private javax.swing.JButton twvar2;
    private javax.swing.JButton twvar3;
    private javax.swing.JPanel twvarpanel;
    // End of variables declaration//GEN-END:variables
    // Custom variables declaration - do not modify
    protected JButton[] twvar;
    protected JButton[] trvar;
    protected JButton[] fvar;
}
