package tarea1;


public class FrmJuego extends javax.swing.JFrame {

    String ingresar;
    String ingresar2;
    String morse;
    String español;
    int aux;
    int a,b,x,y;
    int vec[]=new int [100];
    
    public FrmJuego() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblMorse = new javax.swing.JLabel();
        btnConvertir = new javax.swing.JButton();
        lblEspañol = new javax.swing.JLabel();
        btnConvertir2 = new javax.swing.JButton();
        txtIngrese = new javax.swing.JTextField();
        txtIngrese2 = new javax.swing.JTextField();
        btnBorrar = new javax.swing.JButton();
        btnBorrar2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Ingrese una frase en español");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Ingrese una frase en Código Morse");

        lblMorse.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        btnConvertir.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnConvertir.setText("Convertir");
        btnConvertir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConvertirActionPerformed(evt);
            }
        });

        lblEspañol.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        btnConvertir2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnConvertir2.setText("Convertir");
        btnConvertir2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConvertir2ActionPerformed(evt);
            }
        });

        txtIngrese.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtIngrese.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIngreseActionPerformed(evt);
            }
        });

        txtIngrese2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtIngrese2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIngrese2ActionPerformed(evt);
            }
        });

        btnBorrar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnBorrar.setText("Borrar");
        btnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarActionPerformed(evt);
            }
        });

        btnBorrar2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnBorrar2.setText("Borrar");
        btnBorrar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrar2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(lblMorse, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnConvertir)
                .addGap(29, 29, 29)
                .addComponent(btnBorrar)
                .addGap(34, 34, 34))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(39, 39, 39)
                        .addComponent(txtIngrese))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(txtIngrese2, javax.swing.GroupLayout.DEFAULT_SIZE, 714, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(lblEspañol, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnConvertir2)
                .addGap(30, 30, 30)
                .addComponent(btnBorrar2)
                .addGap(29, 29, 29))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtIngrese, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnConvertir)
                        .addComponent(btnBorrar))
                    .addComponent(lblMorse, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(72, 72, 72)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtIngrese2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnConvertir2)
                        .addComponent(btnBorrar2))
                    .addComponent(lblEspañol, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtIngreseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIngreseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIngreseActionPerformed

    private void txtIngrese2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIngrese2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIngrese2ActionPerformed

    private void btnConvertirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConvertirActionPerformed
        ingresar=txtIngrese.getText();
        morse="";
        for(int i=0;i<ingresar.length();i++)
        {
            switch(ingresar.toLowerCase().charAt(i))
            {
                case 'a': morse=morse+" "+".-";
                    break;
                case 'b': morse=morse+" "+"-...";
                    break;
                case 'c': morse=morse+" "+"-.-.";
                    break;
                case 'd': morse=morse+" "+"-..";
                    break;
                case 'e': morse=morse+" "+".";
                    break;
                case 'f': morse=morse+" "+"..-.";
                    break;
                case 'g': morse=morse+" "+"--.";
                    break;
                case 'h': morse=morse+" "+"....";
                    break;
                case 'i': morse=morse+" "+"..";
                    break;
                case 'j': morse=morse+" "+".---";
                    break;
                case 'k': morse=morse+" "+"-.-";
                    break;
                case 'l': morse=morse+" "+".-..";
                    break;
                case 'm': morse=morse+" "+"--";
                    break;
                case 'n': morse=morse+" "+"-.";
                    break;
                case 'o': morse=morse+" "+"---";
                    break;
                case 'p': morse=morse+" "+".--.";
                    break;
                case 'q': morse=morse+" "+"--.-";
                    break;
                case 'r': morse=morse+" "+".-.";
                    break;
                case 's': morse=morse+" "+"...";
                    break;
                case 't': morse=morse+" "+"-";
                    break;
                case 'u': morse=morse+" "+"..-";
                    break;
                case 'v': morse=morse+" "+"...-";
                    break;
                case 'w': morse=morse+" "+".--";
                    break;
                case 'x': morse=morse+" "+"-..-";
                    break;
                case 'y': morse=morse+" "+"-.--";
                    break;
                case 'z': morse=morse+" "+"--..";
                    break;
                case ' ': morse=morse+" "+" ";
                    break;
                case '1': morse=morse+" "+".----";
                    break;
                case '2': morse=morse+" "+"..---";
                    break;
                case '3': morse=morse+" "+"...--";
                    break;
                case '4': morse=morse+" "+"....-";
                    break;
                case '5': morse=morse+" "+".....";
                    break;
                case '6': morse=morse+" "+"-....";
                    break;
                case '7': morse=morse+" "+"--...";
                    break;
                case '8': morse=morse+" "+"---..";
                    break;
                case '9': morse=morse+" "+"----.";
                    break;
                case '0': morse=morse+" "+"-----";
                    break;
                case '.': morse=morse+" "+".-.-.-";
                    break;
                case ',': morse=morse+" "+"--..--";
                    break;
                case '?': morse=morse+" "+"..--..";
                    break;
                case '!': morse=morse+" "+"-.-.--";
                    break;
                case '"': morse=morse+" "+".-..-.";
                    break;
                case ')': morse=morse+" "+"-.--.-";
                    break;
                case '(': morse=morse+" "+"-.--.";
                    break;
                case '&': morse=morse+" "+".-...";
                    break;
                case ':': morse=morse+" "+"---...";
                    break;
                case ';': morse=morse+" "+"-.-.-.";
                    break;
                case '/': morse=morse+" "+"-..-.";
                    break;
                case '_': morse=morse+" "+"..--.-";
                    break;
                case '=': morse=morse+" "+"-...-";
                    break;
                case '+': morse=morse+" "+".-.-.";
                    break;
                case '-': morse=morse+" "+"-....-";
                    break;
                case '$': morse=morse+" "+"...-..-";
                    break;
                case '@': morse=morse+" "+".--.-.";
                    break;
            }
        }
        lblMorse.setText(morse+" ");
    }//GEN-LAST:event_btnConvertirActionPerformed

    private void btnBorrar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrar2ActionPerformed
        español="";
        lblEspañol.setText("");
        txtIngrese2.setText(" ");
    }//GEN-LAST:event_btnBorrar2ActionPerformed

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
        morse="";
        lblMorse.setText("");
        txtIngrese.setText(" ");
    }//GEN-LAST:event_btnBorrarActionPerformed

    private void btnConvertir2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConvertir2ActionPerformed
        ingresar2=" "+txtIngrese2.getText()+" ";
        español="";
        x=0;
        aux=0;
        for(int i=0;i<ingresar2.length();i++)
        {
            if(ingresar2.toLowerCase().charAt(i)==' ')
            {
                vec[x]=i;
                x++;
            }
        }
        
        for(int i=0;i<x-1;i++)
        {
            if(vec[i]+1==vec[i+1])
            {
                aux++;
                if(aux==2)
                {
                    aux=0;
                    español=español+" ";
                }
            }
            else
            {
                switch(ingresar2.substring(vec[i]+1,vec[i+1]))
                {
                    case ".-": español=español+"a";
                        break;
                    case "-...": español=español+"b";
                        break;
                    case "-.-.": español=español+"c";
                        break;
                    case "-..": español=español+"d";
                        break;
                    case ".": español=español+"e";
                        break;
                    case "..-.": español=español+"f";
                        break;
                    case "--.": español=español+"g";
                        break;
                    case "....": español=español+"h";
                        break;
                    case "..": español=español+"i";
                        break;
                    case ".---": español=español+"j";
                        break;
                    case "-.-": español=español+"k";
                        break;
                    case ".-..": español=español+"l";
                        break;
                    case "--": español=español+"m";
                        break;
                    case "-.": español=español+"n";
                        break;
                    case "---": español=español+"o";
                        break;
                    case ".--.": español=español+"p";
                        break;
                    case "--.-": español=español+"q";
                        break;
                    case ".-.": español=español+"r";
                        break;
                    case "...": español=español+"s";
                        break;
                    case "-": español=español+"t";
                        break;
                    case "..-": español=español+"u";
                        break;
                    case "...-": español=español+"v";
                        break;
                    case ".--": español=español+"w";
                        break;
                    case "-..-": español=español+"x";
                        break;
                    case "-.--": español=español+"y";
                        break;
                    case "--..": español=español+"z";
                        break;
                    case ".----": español=español+"1";
                        break;
                    case "..---": español=español+"2";
                        break;
                    case "...--": español=español+"3";
                        break;
                    case "....-": español=español+"4";
                        break;
                    case ".....": español=español+"5";
                        break;
                    case "-....": español=español+"6";
                        break;
                    case "--...": español=español+"7";
                        break;
                    case "---..": español=español+"8";
                        break;
                    case "----.": español=español+"9";
                        break;
                    case "-----": español=español+"0";
                        break;
                    case ".-.-.-": español=español+".";
                        break;
                    case "--..--": español=español+",";
                        break;
                    case "..--..": español=español+"?";
                        break;
                    case "-.-.--": español=español+"!";
                        break;
                    case "-.--.-": español=español+")";
                        break;
                    case "-.--.": español=español+"(";
                        break;
                    case ".-...": español=español+"&";
                        break;
                    case "---...": español=español+":";
                        break;
                    case "-.-.-.": español=español+";";
                        break;
                    case "-..-.": español=español+"/";
                        break;
                    case "..--.-": español=español+"_";
                        break;
                    case "-...-": español=español+"=";
                        break;
                    case ".-.-.": español=español+"+";
                        break;
                    case "-....-": español=español+"-";
                        break;
                    case "...-..-": español=español+"$";
                        break;
                    case ".--.-.": español=español+"@";
                        break;
                }
            }
        }
        lblEspañol.setText(español);
    }//GEN-LAST:event_btnConvertir2ActionPerformed

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
            java.util.logging.Logger.getLogger(FrmJuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmJuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmJuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmJuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmJuego().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnBorrar2;
    private javax.swing.JButton btnConvertir;
    private javax.swing.JButton btnConvertir2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lblEspañol;
    private javax.swing.JLabel lblMorse;
    private javax.swing.JTextField txtIngrese;
    private javax.swing.JTextField txtIngrese2;
    // End of variables declaration//GEN-END:variables
}
