/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author VASUDHA SHAH
 */
public class Calculator1 extends javax.swing.JFrame {
private String s="",op; 
 int flag=0;
  float x,y,z;

    public Calculator1() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPN1 = new javax.swing.JPanel();
        jTFExpression1 = new javax.swing.JTextField();
        jTFResult = new javax.swing.JTextField();
        jPN2 = new javax.swing.JPanel();
        jBT7 = new javax.swing.JButton();
        jBT8 = new javax.swing.JButton();
        jBT9 = new javax.swing.JButton();
        jBT13 = new javax.swing.JButton();
        jBT6 = new javax.swing.JButton();
        jBT5 = new javax.swing.JButton();
        jBT4 = new javax.swing.JButton();
        jBT12 = new javax.swing.JButton();
        jBT1 = new javax.swing.JButton();
        jBT2 = new javax.swing.JButton();
        jBT3 = new javax.swing.JButton();
        jBT10 = new javax.swing.JButton();
        jBT0 = new javax.swing.JButton();
        jBT15 = new javax.swing.JButton();
        jBT16 = new javax.swing.JButton();
        jBT11 = new javax.swing.JButton();
        jBT17 = new javax.swing.JButton();
        jBT14 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("calci2");
        setAlwaysOnTop(true);
        setResizable(false);

        jPN1.setPreferredSize(new java.awt.Dimension(300, 150));
        jPN1.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, 25));

        jTFExpression1.setFont(new java.awt.Font("Monotype Corsiva", 1, 36)); // NOI18N
        jTFExpression1.setPreferredSize(new java.awt.Dimension(250, 30));
        jTFExpression1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFExpression1ActionPerformed(evt);
            }
        });
        jPN1.add(jTFExpression1);

        jTFResult.setFont(new java.awt.Font("Monotype Corsiva", 1, 36)); // NOI18N
        jTFResult.setPreferredSize(new java.awt.Dimension(250, 30));
        jTFResult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFResultActionPerformed(evt);
            }
        });
        jPN1.add(jTFResult);

        getContentPane().add(jPN1, java.awt.BorderLayout.CENTER);

        jPN2.setPreferredSize(new java.awt.Dimension(300, 250));
        jPN2.setLayout(new java.awt.GridLayout(5, 4));

        jBT7.setFont(new java.awt.Font("Monotype Corsiva", 1, 36)); // NOI18N
        jBT7.setText("7");
        jBT7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBT7ActionPerformed(evt);
            }
        });
        jPN2.add(jBT7);

        jBT8.setFont(new java.awt.Font("Monotype Corsiva", 1, 36)); // NOI18N
        jBT8.setText("8");
        jBT8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBT8ActionPerformed(evt);
            }
        });
        jPN2.add(jBT8);

        jBT9.setFont(new java.awt.Font("Monotype Corsiva", 1, 36)); // NOI18N
        jBT9.setText("9");
        jBT9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBT9ActionPerformed(evt);
            }
        });
        jPN2.add(jBT9);

        jBT13.setFont(new java.awt.Font("Monotype Corsiva", 1, 36)); // NOI18N
        jBT13.setText("/");
        jBT13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBT13ActionPerformed(evt);
            }
        });
        jPN2.add(jBT13);

        jBT6.setFont(new java.awt.Font("Monotype Corsiva", 1, 36)); // NOI18N
        jBT6.setText("6");
        jBT6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBT6ActionPerformed(evt);
            }
        });
        jPN2.add(jBT6);

        jBT5.setFont(new java.awt.Font("Monotype Corsiva", 1, 36)); // NOI18N
        jBT5.setText("5");
        jBT5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBT5ActionPerformed(evt);
            }
        });
        jPN2.add(jBT5);

        jBT4.setFont(new java.awt.Font("Monotype Corsiva", 1, 36)); // NOI18N
        jBT4.setText("4");
        jBT4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBT4ActionPerformed(evt);
            }
        });
        jPN2.add(jBT4);

        jBT12.setFont(new java.awt.Font("Monotype Corsiva", 1, 36)); // NOI18N
        jBT12.setText("*");
        jBT12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBT12ActionPerformed(evt);
            }
        });
        jPN2.add(jBT12);

        jBT1.setFont(new java.awt.Font("Monotype Corsiva", 1, 36)); // NOI18N
        jBT1.setText("1");
        jBT1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBT1ActionPerformed(evt);
            }
        });
        jPN2.add(jBT1);

        jBT2.setFont(new java.awt.Font("Monotype Corsiva", 1, 36)); // NOI18N
        jBT2.setText("2");
        jBT2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBT2ActionPerformed(evt);
            }
        });
        jPN2.add(jBT2);

        jBT3.setFont(new java.awt.Font("Monotype Corsiva", 1, 36)); // NOI18N
        jBT3.setText("3");
        jBT3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBT3ActionPerformed(evt);
            }
        });
        jPN2.add(jBT3);

        jBT10.setFont(new java.awt.Font("Monotype Corsiva", 1, 36)); // NOI18N
        jBT10.setText("+");
        jBT10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBT10ActionPerformed(evt);
            }
        });
        jPN2.add(jBT10);

        jBT0.setFont(new java.awt.Font("Monotype Corsiva", 1, 36)); // NOI18N
        jBT0.setText("0");
        jBT0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBT0ActionPerformed(evt);
            }
        });
        jPN2.add(jBT0);

        jBT15.setFont(new java.awt.Font("Monotype Corsiva", 1, 36)); // NOI18N
        jBT15.setText("c");
        jBT15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBT15ActionPerformed(evt);
            }
        });
        jPN2.add(jBT15);

        jBT16.setFont(new java.awt.Font("Monotype Corsiva", 1, 36)); // NOI18N
        jBT16.setText("=");
        jBT16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBT16ActionPerformed(evt);
            }
        });
        jPN2.add(jBT16);

        jBT11.setFont(new java.awt.Font("Monotype Corsiva", 1, 36)); // NOI18N
        jBT11.setText("-");
        jBT11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBT11ActionPerformed(evt);
            }
        });
        jPN2.add(jBT11);

        jBT17.setFont(new java.awt.Font("Monotype Corsiva", 1, 36)); // NOI18N
        jBT17.setText("CLR");
        jBT17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBT17ActionPerformed(evt);
            }
        });
        jPN2.add(jBT17);

        jBT14.setFont(new java.awt.Font("Monotype Corsiva", 1, 36)); // NOI18N
        jBT14.setText(".");
        jBT14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBT14ActionPerformed(evt);
            }
        });
        jPN2.add(jBT14);

        getContentPane().add(jPN2, java.awt.BorderLayout.PAGE_END);

        setBounds(0, 0, 440, 440);
    }// </editor-fold>//GEN-END:initComponents

    private void jBT0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBT0ActionPerformed
s=s+"0";
       jTFExpression1.setText(s);        
    }//GEN-LAST:event_jBT0ActionPerformed

    private void jBT1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBT1ActionPerformed
s=s+"1";
       jTFExpression1.setText(s);
        // TODO add your handling code here:
    }//GEN-LAST:event_jBT1ActionPerformed

    private void jBT2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBT2ActionPerformed
s=s+"2";
       jTFExpression1.setText(s);
        // TODO add your handling code here:
    }//GEN-LAST:event_jBT2ActionPerformed

    private void jBT3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBT3ActionPerformed
s=s+"3";
       jTFExpression1.setText(s);
        // TODO add your handling code here:
    }//GEN-LAST:event_jBT3ActionPerformed

    private void jBT4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBT4ActionPerformed
s=s+"4";
       jTFExpression1.setText(s);
        // TODO add your handling code here:
    }//GEN-LAST:event_jBT4ActionPerformed

    private void jBT5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBT5ActionPerformed
s=s+"5";
       jTFExpression1.setText(s);
        // TODO add your handling code here:
    }//GEN-LAST:event_jBT5ActionPerformed

    private void jBT6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBT6ActionPerformed
s=s+"6";
       jTFExpression1.setText(s);
        // TODO add your handling code here:
    }//GEN-LAST:event_jBT6ActionPerformed

    private void jBT7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBT7ActionPerformed
       s=s+"7";
       jTFExpression1.setText(s);
    }//GEN-LAST:event_jBT7ActionPerformed

    private void jBT8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBT8ActionPerformed
s=s+"8";
       jTFExpression1.setText(s);
        // TODO add your handling code here:
    }//GEN-LAST:event_jBT8ActionPerformed

    private void jBT9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBT9ActionPerformed
s=s+"9";
       jTFExpression1.setText(s);
        // TODO add your handling code here:
    }//GEN-LAST:event_jBT9ActionPerformed

    private void flagg()
    {
        jBT10.setEnabled(false);
         jBT11.setEnabled(false); 
         jBT12.setEnabled(false);
          jBT13.setEnabled(false);
    }
    private void jBT10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBT10ActionPerformed
       
       /* for(int i=0;i<=s.length();i++)
        {
            if(s.charAt(i)=='+'||s.charAt(i)=='-'||s.charAt(i)=='*'||s.charAt(i)=='/')
            { flag=1;
            break;
            }
        }*/
          
         s=s+"+";
         op="+";
         flag=0;
        jTFExpression1.setText(s);
        flagg();
        
    }//GEN-LAST:event_jBT10ActionPerformed

    private void jBT11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBT11ActionPerformed
s=s+"-";
op="-";
flag=0;
       jTFExpression1.setText(s);
        flagg();
        // TODO add your handling code here:
    }//GEN-LAST:event_jBT11ActionPerformed

    private void jBT12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBT12ActionPerformed
s=s+"*";
op="*";
flag=0;
       jTFExpression1.setText(s);
        flagg();
        // TODO add your handling code here:
    }//GEN-LAST:event_jBT12ActionPerformed

    private void jBT13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBT13ActionPerformed
s=s+"/";
op="/";
flag=0;
       jTFExpression1.setText(s);
        flagg();
        // TODO add your handling code here:
    }//GEN-LAST:event_jBT13ActionPerformed

    private void jBT14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBT14ActionPerformed
    if(flag==0)
     
    {s=s+".";
       jTFExpression1.setText(s);
       flag=1;
    }
        // TODO add your handling code here:
    }//GEN-LAST:event_jBT14ActionPerformed

    private void jBT15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBT15ActionPerformed
   // s=s.replace(s.charAt(s.length()),'/0');
   s=jTFExpression1.getText();
   if(s.charAt(s.length()-1)=='+'||s.charAt(s.length()-1)=='-'||s.charAt(s.length()-1)=='*'||s.charAt(s.length()-1)=='/')
   {
        s=s.substring(0,s.length()-1);
        jTFExpression1.setText(s);
         jBT10.setEnabled(true);
         jBT11.setEnabled(true); 
         jBT12.setEnabled(true);
          jBT13.setEnabled(true);
          flag=1;
   }
   else
   {
       if(s.charAt(s.length()-1)=='.')
       { s=s.substring(0,s.length()-1);  
       jTFExpression1.setText(s);
       flag=0;}
       else{
   s=s.substring(0,s.length()-1);
    jTFExpression1.setText(s);}
   }
   
// TODO add your handling code here:
    }//GEN-LAST:event_jBT15ActionPerformed

    private void jBT16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBT16ActionPerformed
            String s1,s2;
           
            int index=0;
            index=s.indexOf(op);
            s1=s.substring(0,index);
            s2=s.substring(index+1,s.length());  
           // System.out.println(s1 +" "+s2);
        x=Float.parseFloat(s1);
 y=Float.parseFloat(s2);
 if(op.equals("+"))
     z=x+y;
 if(op.equals("-"))
     z=x-y;
 if(op.equals("*"))
     z=x*y;
 if(op.equals("/"))
     z=x/y;
 jTFResult.setText(""+z);
                
    }//GEN-LAST:event_jBT16ActionPerformed

    private void jBT17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBT17ActionPerformed
        // TODO add your handling code here:
        jTFExpression1.setText("");
        jTFResult.setText("");
        jBT10.setEnabled(true);
         jBT11.setEnabled(true); 
         jBT12.setEnabled(true);
          jBT13.setEnabled(true);
          
          s="";
          flag=0;
    }//GEN-LAST:event_jBT17ActionPerformed

    private void jTFExpression1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFExpression1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFExpression1ActionPerformed

    private void jTFResultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFResultActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFResultActionPerformed

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
            java.util.logging.Logger.getLogger(Calculator1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculator1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculator1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculator1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculator1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBT0;
    private javax.swing.JButton jBT1;
    private javax.swing.JButton jBT10;
    private javax.swing.JButton jBT11;
    private javax.swing.JButton jBT12;
    private javax.swing.JButton jBT13;
    private javax.swing.JButton jBT14;
    private javax.swing.JButton jBT15;
    private javax.swing.JButton jBT16;
    private javax.swing.JButton jBT17;
    private javax.swing.JButton jBT2;
    private javax.swing.JButton jBT3;
    private javax.swing.JButton jBT4;
    private javax.swing.JButton jBT5;
    private javax.swing.JButton jBT6;
    private javax.swing.JButton jBT7;
    private javax.swing.JButton jBT8;
    private javax.swing.JButton jBT9;
    private javax.swing.JPanel jPN1;
    private javax.swing.JPanel jPN2;
    private javax.swing.JTextField jTFExpression1;
    private javax.swing.JTextField jTFResult;
    // End of variables declaration//GEN-END:variables
}
