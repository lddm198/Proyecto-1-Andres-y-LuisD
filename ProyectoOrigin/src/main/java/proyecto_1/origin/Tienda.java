/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_1.origin;

/**
 *
 * @author Xandr
 */
public class Tienda extends javax.swing.JInternalFrame { 
    
    public int hp=40,escudo=25,fuerza=30,magia=10,velocidad=30;
    public int valores_a1,valores_a2, valores_a3;
    public int[] valores_e;
    public int[] valores_c;
    
    public Tienda() {
        initComponents();
        
        hp_stats.setStringPainted(true);
        hp_stats.setValue(hp);
        
        escudo_stats.setStringPainted(true);
        escudo_stats.setValue(escudo);
        
        fuerza_stats.setStringPainted(true);
        fuerza_stats.setValue(fuerza);
        
        magia_stats.setStringPainted(true);
        magia_stats.setValue(magia);
        
        velocidad_stats.setStringPainted(true);
        velocidad_stats.setValue(velocidad);
        
    }
    
    public Tienda(int[] val_a, int[] val_e, int[] val_c){
        initComponents();
        
        System.out.println("Valores_a: "+val_a[0]+" "+val_a[1]+" "+val_a[2]);
        System.out.println("Valores_e: "+val_e[0]+" "+val_e[1]+" "+val_e[2]);
        System.out.println("Valores_c: "+val_c[0]+" "+val_c[1]+" "+val_c[2]);

        lab_espada_1.setText("$"+val_a[0]);
        lab_espada_2.setText("$"+val_a[1]);
        lab_espada_2.setText("$"+val_a[2]);
        valores_e = val_e;
        valores_c = val_c;
        
    }
   
    public int obtener_v_armas() throws Exception{
               
        if (rb_arma_1.isSelected()){
            return valores_a1;
        }
        if (rb_arma_2.isSelected()){
            return valores_a1;
        }
        if (rb_arma_3.isSelected()){
            return valores_a1;
        }
        
        return 0;
     
    }
    public int obtener_v_escudos() throws Exception{
        if (rb_escudo_1.isSelected()){
            return valores_e[0];
        }
        if (rb_escudo_2.isSelected()){
            return valores_e[1];
        }
        if (rb_arma_3.isSelected()){
            return valores_e[2];
        }
        return 0;
    }
    public int obtener_v_consumibles() throws Exception{
        if (rb_consumibles_1.isSelected()){
            return valores_c[0];
        }
        if (rb_consumibles_2.isSelected()){
            return valores_c[1];
        }
        if (rb_consumibles_3.isSelected()){
            return valores_c[2];
        }
        return 0;
    }
    public int obtener_cantidad_a(){
        Integer valor = (Integer) compra_cantidad_armas.getValue();
       
        return valor;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        lab_espada_1 = new javax.swing.JLabel();
        rb_arma_1 = new javax.swing.JRadioButton();
        rb_arma_2 = new javax.swing.JRadioButton();
        lab_espada_2 = new javax.swing.JLabel();
        rb_arma_3 = new javax.swing.JRadioButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextPane2 = new javax.swing.JTextPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextPane3 = new javax.swing.JTextPane();
        lab_espada_3 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        Tot_compra_armas = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        b_comprar_armas = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        compra_cantidad_armas = new javax.swing.JSpinner();
        jPanel2 = new javax.swing.JPanel();
        rb_escudo_1 = new javax.swing.JRadioButton();
        rb_escudo_2 = new javax.swing.JRadioButton();
        rb_escudo_3 = new javax.swing.JRadioButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextPane4 = new javax.swing.JTextPane();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTextPane5 = new javax.swing.JTextPane();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTextPane6 = new javax.swing.JTextPane();
        jLabel19 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jTextField21 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton39 = new javax.swing.JButton();
        jLabel44 = new javax.swing.JLabel();
        compra_cantidad_escudos = new javax.swing.JSpinner();
        jPanel3 = new javax.swing.JPanel();
        rb_consumibles_1 = new javax.swing.JRadioButton();
        rb_consumibles_2 = new javax.swing.JRadioButton();
        rb_consumibles_3 = new javax.swing.JRadioButton();
        jLabel20 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTextPane7 = new javax.swing.JTextPane();
        jScrollPane8 = new javax.swing.JScrollPane();
        jTextPane8 = new javax.swing.JTextPane();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jScrollPane9 = new javax.swing.JScrollPane();
        Text = new javax.swing.JTextPane();
        jLabel45 = new javax.swing.JLabel();
        jTextField23 = new javax.swing.JTextField();
        jButton42 = new javax.swing.JButton();
        jButton43 = new javax.swing.JButton();
        jLabel46 = new javax.swing.JLabel();
        compra_cantidad_consumibles = new javax.swing.JSpinner();
        jTabbedPane3 = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        v_rb_espada_1 = new javax.swing.JRadioButton();
        v_rb_espada_2 = new javax.swing.JRadioButton();
        v_rb_espada_3 = new javax.swing.JRadioButton();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jTextField29 = new javax.swing.JTextField();
        jButton54 = new javax.swing.JButton();
        jButton55 = new javax.swing.JButton();
        jLabel52 = new javax.swing.JLabel();
        compra_cantidad_armas2 = new javax.swing.JSpinner();
        jPanel5 = new javax.swing.JPanel();
        v_rb_escudo_1 = new javax.swing.JRadioButton();
        jLabel32 = new javax.swing.JLabel();
        v_rb_escudo_2 = new javax.swing.JRadioButton();
        v_rb_escudo_3 = new javax.swing.JRadioButton();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jTextField27 = new javax.swing.JTextField();
        jButton50 = new javax.swing.JButton();
        jButton51 = new javax.swing.JButton();
        jLabel50 = new javax.swing.JLabel();
        compra_cantidad_armas3 = new javax.swing.JSpinner();
        jPanel6 = new javax.swing.JPanel();
        v_rb_consumibles_1 = new javax.swing.JRadioButton();
        jLabel38 = new javax.swing.JLabel();
        v_rb_consumibles_2 = new javax.swing.JRadioButton();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        v_rb_consumibles_3 = new javax.swing.JRadioButton();
        jLabel47 = new javax.swing.JLabel();
        jTextField25 = new javax.swing.JTextField();
        jButton46 = new javax.swing.JButton();
        jButton47 = new javax.swing.JButton();
        jLabel48 = new javax.swing.JLabel();
        compra_cantidad_armas1 = new javax.swing.JSpinner();
        jLabel6 = new javax.swing.JLabel();
        MoonPoints = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        magia_stats = new javax.swing.JProgressBar();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        fuerza_stats = new javax.swing.JProgressBar();
        jLabel1 = new javax.swing.JLabel();
        escudo_stats = new javax.swing.JProgressBar();
        velocidad_stats = new javax.swing.JProgressBar();
        hp_stats = new javax.swing.JProgressBar();
        pts_hp = new javax.swing.JLabel();
        pts_escudo = new javax.swing.JLabel();
        pts_fuerza = new javax.swing.JLabel();
        pts_magia = new javax.swing.JLabel();
        pts_velocidad = new javax.swing.JLabel();
        b_equipar_objetos = new javax.swing.JButton();

        setClosable(true);
        setFrameIcon(null);

        jScrollPane1.setToolTipText("Espada perfecta para enemigos basicos, aumenta dos puntos de vida");

        jTextPane1.setEditable(false);
        jTextPane1.setText("Espada perfecta para enemigos básicos +2HP ");
        jTextPane1.setToolTipText("");
        jScrollPane1.setViewportView(jTextPane1);

        rb_arma_1.setText("Espada nvl 5");
        rb_arma_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb_arma_1ActionPerformed(evt);
            }
        });

        rb_arma_2.setText("Espada nvl 10");
        rb_arma_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb_arma_2ActionPerformed(evt);
            }
        });

        rb_arma_3.setText("Espada nvl 30");
        rb_arma_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb_arma_3ActionPerformed(evt);
            }
        });

        jScrollPane2.setToolTipText("Espada perfecta para conbates más complejos");

        jTextPane2.setEditable(false);
        jTextPane2.setText("Espada perfecta para combates mas complejos, aumenta +5HP, +20 escudo, +2 magía");
        jScrollPane2.setViewportView(jTextPane2);

        jTextPane3.setEditable(false);
        jTextPane3.setText("Espada perfecta para convatir Jefes, agil y con buen daño. +20HP, +5 Magia, + 3 Velocidad");
        jScrollPane3.setViewportView(jTextPane3);

        jLabel15.setText("Cantidad:");

        Tot_compra_armas.setText("0");
        Tot_compra_armas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tot_compra_armasActionPerformed(evt);
            }
        });

        jLabel7.setText("Total:");

        b_comprar_armas.setText("Comprar");
        b_comprar_armas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_comprar_armasActionPerformed(evt);
            }
        });

        jButton2.setText("Cancelar");

        compra_cantidad_armas.setModel(new javax.swing.SpinnerNumberModel(0, 0, 100, 1));
        compra_cantidad_armas.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                compra_cantidad_armasStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(rb_arma_2)
                                .addGap(18, 18, 18)
                                .addComponent(lab_espada_2))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(rb_arma_1)
                                .addGap(18, 18, 18)
                                .addComponent(lab_espada_1))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(rb_arma_3)
                                .addGap(18, 18, 18)
                                .addComponent(lab_espada_3)))
                        .addGap(0, 176, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(compra_cantidad_armas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Tot_compra_armas))
                            .addComponent(jButton2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(b_comprar_armas)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rb_arma_1)
                    .addComponent(lab_espada_1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rb_arma_2)
                    .addComponent(lab_espada_2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rb_arma_3)
                    .addComponent(lab_espada_3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(compra_cantidad_armas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(Tot_compra_armas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(b_comprar_armas))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lab_espada_1.getAccessibleContext().setAccessibleName("lab_espada_1");
        lab_espada_1.getAccessibleContext().setAccessibleDescription("");
        lab_espada_1.getAccessibleContext().setAccessibleParent(null);
        lab_espada_2.getAccessibleContext().setAccessibleName("lab_espada_2");
        lab_espada_3.getAccessibleContext().setAccessibleName("lab_espada_3");

        jTabbedPane2.addTab("Armas", jPanel1);

        rb_escudo_1.setText("Escudo nvl 7");
        rb_escudo_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb_escudo_1ActionPerformed(evt);
            }
        });

        rb_escudo_2.setText("Escudo nvl 14");
        rb_escudo_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb_escudo_2ActionPerformed(evt);
            }
        });

        rb_escudo_3.setText("Escudo nvl 28");
        rb_escudo_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb_escudo_3ActionPerformed(evt);
            }
        });

        jTextPane4.setEditable(false);
        jTextPane4.setText("Escudo básico para conbates ocacionales, +2 Escudo");
        jScrollPane4.setViewportView(jTextPane4);

        jLabel9.setText("$100");

        jLabel10.setText("$150");

        jTextPane5.setEditable(false);
        jTextPane5.setText("Escudo reforzado, menos impacto de daño enemigo, +2 HP, +6 escudo, +1 Magia");
        jScrollPane5.setViewportView(jTextPane5);

        jTextPane6.setEditable(false);
        jTextPane6.setText("Escudo blindado, los golpes rara vez serán problema, +5HP, +10 escudo, +3 Magia, +2 Velocidad");
        jScrollPane6.setViewportView(jTextPane6);

        jLabel19.setText("$200");

        jLabel43.setText("Cantidad:");

        jTextField21.setText("0");

        jButton3.setText("Comprar");

        jButton39.setText("Cancelar");

        jLabel44.setText("Total:");

        compra_cantidad_escudos.setModel(new javax.swing.SpinnerNumberModel(0, 0, 100, 1));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(rb_escudo_1)
                        .addGap(27, 27, 27)
                        .addComponent(jLabel9))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(rb_escudo_2)
                        .addGap(24, 24, 24)
                        .addComponent(jLabel10)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 287, Short.MAX_VALUE)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(rb_escudo_3)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel19)))
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel43)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(compra_cantidad_escudos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel44)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField21))
                            .addComponent(jButton39))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rb_escudo_1)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rb_escudo_2)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rb_escudo_3)
                    .addComponent(jLabel19))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel43)
                    .addComponent(compra_cantidad_escudos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel44)
                    .addComponent(jTextField21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton39)
                    .addComponent(jButton3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Escudos", jPanel2);

        rb_consumibles_1.setText("Pocion de vida");
        rb_consumibles_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb_consumibles_1ActionPerformed(evt);
            }
        });

        rb_consumibles_2.setText("Pocion de escudo");
        rb_consumibles_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb_consumibles_2ActionPerformed(evt);
            }
        });

        rb_consumibles_3.setText("Pocion de Magia");
        rb_consumibles_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb_consumibles_3ActionPerformed(evt);
            }
        });

        jLabel20.setText("$20");

        jTextPane7.setEditable(false);
        jTextPane7.setText("Recuperar  vida nunca fue tan fácil, +3 HP");
        jScrollPane7.setViewportView(jTextPane7);

        jTextPane8.setEditable(false);
        jTextPane8.setText("No tienes refuerzos? Tranquilo... +3 Escudo");
        jScrollPane8.setViewportView(jTextPane8);

        jLabel23.setText("$50");

        jLabel24.setText("$100");

        Text.setEditable(false);
        Text.setText("Sientes ese cosquilleo? Es magia. +6 Magia");
        jScrollPane9.setViewportView(Text);

        jLabel45.setText("Cantidad:");

        jTextField23.setText("0");

        jButton42.setText("Comprar");

        jButton43.setText("Cancelar");

        jLabel46.setText("Total:");

        compra_cantidad_consumibles.setModel(new javax.swing.SpinnerNumberModel(0, 0, 100, 1));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(rb_consumibles_3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel24))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(rb_consumibles_1)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel20))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(rb_consumibles_2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel23)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane8, javax.swing.GroupLayout.DEFAULT_SIZE, 287, Short.MAX_VALUE)
                    .addComponent(jScrollPane9, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel45)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(compra_cantidad_consumibles, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel46)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField23))
                            .addComponent(jButton43))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton42)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rb_consumibles_1)
                    .addComponent(jLabel20))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rb_consumibles_2)
                    .addComponent(jLabel23))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rb_consumibles_3)
                    .addComponent(jLabel24))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel45)
                    .addComponent(compra_cantidad_consumibles, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel46)
                    .addComponent(jTextField23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton43)
                    .addComponent(jButton42))
                .addContainerGap(56, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Consumibles", jPanel3);

        jTabbedPane1.addTab("Compra", jTabbedPane2);

        v_rb_espada_1.setText("Espada nvl 5");
        v_rb_espada_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                v_rb_espada_1ActionPerformed(evt);
            }
        });

        v_rb_espada_2.setText("Espada nvl 10");
        v_rb_espada_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                v_rb_espada_2ActionPerformed(evt);
            }
        });

        v_rb_espada_3.setText("Espada nv 30");
        v_rb_espada_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                v_rb_espada_3ActionPerformed(evt);
            }
        });

        jLabel26.setText("$100");

        jLabel27.setText("$125");

        jLabel28.setText("$175");

        jLabel51.setText("Cantidad:");

        jTextField29.setText("0");

        jButton54.setText("Vender");
        jButton54.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton54ActionPerformed(evt);
            }
        });

        jButton55.setText("Cancelar");

        jLabel52.setText("Total:");

        compra_cantidad_armas2.setModel(new javax.swing.SpinnerNumberModel(0, 0, 100, 1));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(v_rb_espada_1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel26))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(v_rb_espada_2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel27))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(v_rb_espada_3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel28)))
                .addGap(0, 180, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jButton55)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton54))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel52)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField29))
                            .addComponent(jLabel51))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(compra_cantidad_armas2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(v_rb_espada_1)
                    .addComponent(jLabel26))
                .addGap(35, 35, 35)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(v_rb_espada_2)
                    .addComponent(jLabel27))
                .addGap(39, 39, 39)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(v_rb_espada_3)
                    .addComponent(jLabel28))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel51)
                    .addComponent(compra_cantidad_armas2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel52)
                    .addComponent(jTextField29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton55)
                    .addComponent(jButton54))
                .addContainerGap(136, Short.MAX_VALUE))
        );

        jTabbedPane3.addTab("Armas", jPanel4);

        v_rb_escudo_1.setText("Escudo nvl 7");
        v_rb_escudo_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                v_rb_escudo_1ActionPerformed(evt);
            }
        });

        jLabel32.setText("$25");

        v_rb_escudo_2.setText("Escudo nvl 14");
        v_rb_escudo_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                v_rb_escudo_2ActionPerformed(evt);
            }
        });

        v_rb_escudo_3.setText("Escudo nvl 28");
        v_rb_escudo_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                v_rb_escudo_3ActionPerformed(evt);
            }
        });

        jLabel33.setText("$10");

        jLabel34.setText("$5");

        jLabel49.setText("Cantidad:");

        jTextField27.setText("0");

        jButton50.setText("Comprar");

        jButton51.setText("Cancelar");

        jLabel50.setText("Total:");

        compra_cantidad_armas3.setModel(new javax.swing.SpinnerNumberModel(0, 0, 100, 1));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(v_rb_escudo_1)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel32))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(v_rb_escudo_2)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel33))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(v_rb_escudo_3)
                        .addGap(21, 21, 21)
                        .addComponent(jLabel34))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel49)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(compra_cantidad_armas3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel50)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jButton51)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton50)))))
                .addContainerGap(133, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(v_rb_escudo_1)
                    .addComponent(jLabel32))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(v_rb_escudo_2)
                    .addComponent(jLabel33))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(v_rb_escudo_3)
                    .addComponent(jLabel34))
                .addGap(49, 49, 49)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel49)
                    .addComponent(compra_cantidad_armas3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel50)
                    .addComponent(jTextField27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton51)
                    .addComponent(jButton50))
                .addContainerGap(139, Short.MAX_VALUE))
        );

        jTabbedPane3.addTab("Escudos", jPanel5);

        v_rb_consumibles_1.setText("Posion de vida");
        v_rb_consumibles_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                v_rb_consumibles_1ActionPerformed(evt);
            }
        });

        jLabel38.setText("$1");

        v_rb_consumibles_2.setText("Posion de escudo");
        v_rb_consumibles_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                v_rb_consumibles_2ActionPerformed(evt);
            }
        });

        jLabel39.setText("$1");

        jLabel40.setText("$2");

        v_rb_consumibles_3.setText("Posion de Magia");
        v_rb_consumibles_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                v_rb_consumibles_3ActionPerformed(evt);
            }
        });

        jLabel47.setText("Cantidad:");

        jTextField25.setText("0");

        jButton46.setText("Comprar");

        jButton47.setText("Cancelar");

        jLabel48.setText("Total:");

        compra_cantidad_armas1.setModel(new javax.swing.SpinnerNumberModel(0, 0, 100, 1));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jButton47)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton46))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(v_rb_consumibles_1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel38))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(v_rb_consumibles_2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel39))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(v_rb_consumibles_3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel40))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel48)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField25))
                            .addComponent(jLabel47))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(compra_cantidad_armas1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(133, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(v_rb_consumibles_1)
                    .addComponent(jLabel38))
                .addGap(34, 34, 34)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(v_rb_consumibles_2)
                    .addComponent(jLabel39))
                .addGap(38, 38, 38)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(v_rb_consumibles_3)
                    .addComponent(jLabel40))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel47)
                    .addComponent(compra_cantidad_armas1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel48)
                    .addComponent(jTextField25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton47)
                    .addComponent(jButton46))
                .addContainerGap(138, Short.MAX_VALUE))
        );

        jTabbedPane3.addTab("Consumibles", jPanel6);

        jTabbedPane1.addTab("Venta", jTabbedPane3);

        jLabel6.setText("Velocidad");

        MoonPoints.setText("20000");
        MoonPoints.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MoonPointsActionPerformed(evt);
            }
        });

        jLabel5.setText("Magia");

        jLabel4.setText("Fuerza");

        jLabel3.setText("MoonPoints:");

        jLabel2.setText("Escudo");

        jLabel1.setText("HP");

        b_equipar_objetos.setText("Equipar");
        b_equipar_objetos.setToolTipText("");
        b_equipar_objetos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_equipar_objetosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(MoonPoints, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(120, 120, 120)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(pts_hp)
                                    .addComponent(pts_escudo)
                                    .addComponent(pts_fuerza)
                                    .addComponent(pts_magia)
                                    .addComponent(pts_velocidad))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(hp_stats, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(escudo_stats, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(fuerza_stats, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(magia_stats, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(velocidad_stats, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel5))
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(196, 196, 196)
                                .addComponent(b_equipar_objetos)))))
                .addContainerGap(93, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MoonPoints, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(b_equipar_objetos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(hp_stats, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1))
                    .addComponent(pts_hp, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(escudo_stats, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(pts_escudo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fuerza_stats, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(pts_fuerza))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(magia_stats, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(pts_magia))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(velocidad_stats, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(pts_velocidad))
                .addGap(72, 72, 72))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rb_arma_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb_arma_1ActionPerformed

        if(rb_arma_1.isSelected()){
            
            rb_arma_2.setSelected(false);
            rb_arma_3.setSelected(false);
           
            pts_hp.setText("");
            pts_escudo.setText("");
            pts_fuerza.setText("");
            pts_magia.setText("");
            pts_velocidad.setText("");
            
            hp_stats.setValue(hp+2);
            pts_hp.setText("+2");
                 
        }
        
    }//GEN-LAST:event_rb_arma_1ActionPerformed

    private void rb_arma_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb_arma_2ActionPerformed

        if(rb_arma_2.isSelected()){
            rb_arma_1.setSelected(false);
            rb_arma_3.setSelected(false);
            
            pts_hp.setText("");
            pts_escudo.setText("");
            pts_fuerza.setText("");
            pts_magia.setText("");
            pts_velocidad.setText("");
            
            hp_stats.setValue(hp+5);
            pts_hp.setText("+5");

            escudo_stats.setValue(escudo+20);
            pts_escudo.setText("+20");

            magia_stats.setValue(magia+2);
            pts_magia.setText("+2");

        }
    }//GEN-LAST:event_rb_arma_2ActionPerformed

    private void rb_arma_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb_arma_3ActionPerformed

        if(rb_arma_3.isSelected()){
            rb_arma_1.setSelected(false);
            rb_arma_2.setSelected(false);
            
            pts_hp.setText("");
            pts_escudo.setText("");
            pts_fuerza.setText("");
            pts_magia.setText("");
            pts_velocidad.setText("");
            
            hp_stats.setValue(hp+5);
            pts_hp.setText("+5");

            velocidad_stats.setValue(velocidad+3);
            pts_velocidad.setText("+3");

            magia_stats.setValue(magia+5);
            pts_magia.setText("+5");

        }
    }//GEN-LAST:event_rb_arma_3ActionPerformed

    private void b_comprar_armasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_comprar_armasActionPerformed
   
    }//GEN-LAST:event_b_comprar_armasActionPerformed

    private void rb_escudo_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb_escudo_1ActionPerformed

        pts_hp.setText("");
        pts_escudo.setText("");
        pts_fuerza.setText("");
        pts_magia.setText("");
        pts_velocidad.setText("");

        if (rb_escudo_1.isSelected()){
            rb_escudo_2.setSelected(false);
            rb_escudo_3.setSelected(false);

            escudo_stats.setValue(escudo+2);
            pts_escudo.setText("+2");

        }

    }//GEN-LAST:event_rb_escudo_1ActionPerformed

    private void rb_escudo_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb_escudo_2ActionPerformed

        pts_hp.setText("");
        pts_escudo.setText("");
        pts_fuerza.setText("");
        pts_magia.setText("");
        pts_velocidad.setText("");

        if (rb_escudo_2.isSelected()){
            rb_escudo_1.setSelected(false);
            rb_escudo_3.setSelected(false);

            hp_stats.setValue(hp+2);
            pts_hp.setText("+2");

            escudo_stats.setValue(escudo+6);
            pts_escudo.setText("+6");

            magia_stats.setValue(magia+1);
            pts_magia.setText("+1");
        }

    }//GEN-LAST:event_rb_escudo_2ActionPerformed

    private void rb_escudo_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb_escudo_3ActionPerformed

        pts_hp.setText("");
        pts_escudo.setText("");
        pts_fuerza.setText("");
        pts_magia.setText("");
        pts_velocidad.setText("");

        if (rb_escudo_3.isSelected()){
            rb_escudo_1.setSelected(false);
            rb_escudo_2.setSelected(false);

            hp_stats.setValue(hp+5);
            pts_hp.setText("+5");

            escudo_stats.setValue(escudo+10);
            pts_escudo.setText("+10");

            velocidad_stats.setValue(velocidad+2);
            pts_velocidad.setText("+2");

            magia_stats.setValue(magia+3);
            pts_magia.setText("+3");

        }
    }//GEN-LAST:event_rb_escudo_3ActionPerformed

    private void rb_consumibles_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb_consumibles_1ActionPerformed

        pts_hp.setText("");
        pts_escudo.setText("");
        pts_fuerza.setText("");
        pts_magia.setText("");
        pts_velocidad.setText("");

        if (rb_consumibles_1.isSelected()){
            rb_consumibles_2.setSelected(false);
            rb_consumibles_3.setSelected(false);

            hp_stats.setValue(hp+3);
            pts_hp.setText("+3");

        }

    }//GEN-LAST:event_rb_consumibles_1ActionPerformed

    private void rb_consumibles_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb_consumibles_2ActionPerformed

        pts_hp.setText("");
        pts_escudo.setText("");
        pts_fuerza.setText("");
        pts_magia.setText("");
        pts_velocidad.setText("");

        if (rb_consumibles_2.isSelected()){
            rb_consumibles_1.setSelected(false);
            rb_consumibles_3.setSelected(false);

            escudo_stats.setValue(escudo+3);
            pts_escudo.setText("+6");
        }
    }//GEN-LAST:event_rb_consumibles_2ActionPerformed

    private void rb_consumibles_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb_consumibles_3ActionPerformed
        
        if (rb_consumibles_3.isSelected()){
            rb_consumibles_2.setSelected(false);
            rb_consumibles_1.setSelected(false);
        }        // TODO add your handling code here:        // TODO add your handling code here:
    }//GEN-LAST:event_rb_consumibles_3ActionPerformed

    private void v_rb_espada_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_v_rb_espada_1ActionPerformed
        
        if(v_rb_espada_1.isSelected()){
            v_rb_espada_2.setSelected(false);
            v_rb_espada_3.setSelected(false);
        }// TODO add your handling code here:
    }//GEN-LAST:event_v_rb_espada_1ActionPerformed

    private void v_rb_espada_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_v_rb_espada_2ActionPerformed
        
        if(v_rb_espada_2.isSelected()){
            v_rb_espada_1.setSelected(false);
            v_rb_espada_3.setSelected(false);
        }// TODO add your handling code here:        // TODO add your handling code here:
    }//GEN-LAST:event_v_rb_espada_2ActionPerformed

    private void v_rb_espada_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_v_rb_espada_3ActionPerformed
        
        if(v_rb_espada_3.isSelected()){
            v_rb_espada_2.setSelected(false);
            v_rb_espada_1.setSelected(false);
        }// TODO add your handling code here:        // TODO add your handling code here:
    }//GEN-LAST:event_v_rb_espada_3ActionPerformed

    private void v_rb_escudo_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_v_rb_escudo_1ActionPerformed
        
        if(v_rb_escudo_1.isSelected()){
            v_rb_escudo_2.setSelected(false);
            v_rb_escudo_3.setSelected(false);
        }// TODO add your handling code here:        // TODO add your handling code here:
    }//GEN-LAST:event_v_rb_escudo_1ActionPerformed

    private void v_rb_escudo_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_v_rb_escudo_2ActionPerformed
        
        if(v_rb_escudo_2.isSelected()){
            v_rb_escudo_1.setSelected(false);
            v_rb_escudo_3.setSelected(false);
        }// TODO add your handling code here:        // TODO add your handling code here:
    }//GEN-LAST:event_v_rb_escudo_2ActionPerformed

    private void v_rb_escudo_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_v_rb_escudo_3ActionPerformed
        
        if(v_rb_escudo_3.isSelected()){
            v_rb_escudo_2.setSelected(false);
            v_rb_escudo_1.setSelected(false);
        }// TODO add your handling code here:        // TODO add your handling code here:
    }//GEN-LAST:event_v_rb_escudo_3ActionPerformed

    private void v_rb_consumibles_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_v_rb_consumibles_1ActionPerformed
        
        if(v_rb_consumibles_1.isSelected()){
            v_rb_consumibles_2.setSelected(false);
            v_rb_consumibles_3.setSelected(false);
        }// TODO add your handling code here:        // TODO add your handling code here:
    }//GEN-LAST:event_v_rb_consumibles_1ActionPerformed

    private void v_rb_consumibles_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_v_rb_consumibles_2ActionPerformed
        
        if(v_rb_consumibles_2.isSelected()){
            v_rb_consumibles_1.setSelected(false);
            v_rb_consumibles_3.setSelected(false);
        }// TODO add your handling code here:
    }//GEN-LAST:event_v_rb_consumibles_2ActionPerformed

    private void v_rb_consumibles_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_v_rb_consumibles_3ActionPerformed
        if(v_rb_consumibles_3.isSelected()){
            v_rb_consumibles_2.setSelected(false);
            v_rb_consumibles_1.setSelected(false);
        }// TODO add your handling code here:
    }//GEN-LAST:event_v_rb_consumibles_3ActionPerformed

    private void MoonPointsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MoonPointsActionPerformed
        MoonPoints.setEnabled(false);                // TODO add your handling code here:
    }//GEN-LAST:event_MoonPointsActionPerformed

    private void jButton54ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton54ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton54ActionPerformed

    private void b_equipar_objetosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_equipar_objetosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_b_equipar_objetosActionPerformed

    private void Tot_compra_armasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tot_compra_armasActionPerformed
        
        
        
    }//GEN-LAST:event_Tot_compra_armasActionPerformed

    private void compra_cantidad_armasStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_compra_cantidad_armasStateChanged
        try {
            int valor_armas = obtener_v_armas();
            int cantidad_armas = obtener_cantidad_a();
            int tot = valor_armas*cantidad_armas;
            //System.out.println("Valores_a: "+valores_a[0]+" "+valores_a[1]+" "+valores_a[2]);
            //System.out.println("Valores_e: "+valores_e[0]+" "+valores_e[1]+" "+valores_e[2]);
            //System.out.println("Valores_c: "+valores_c[0]+" "+valores_c[1]+" "+valores_c[2]);
            System.out.println(tot);
            Tot_compra_armas.setText(""+tot);
            
        }catch(Exception e){
        }
            // TODO add your handling code here:
    }//GEN-LAST:event_compra_cantidad_armasStateChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField MoonPoints;
    private javax.swing.JTextPane Text;
    private javax.swing.JTextField Tot_compra_armas;
    private javax.swing.JButton b_comprar_armas;
    private javax.swing.JButton b_equipar_objetos;
    private javax.swing.JSpinner compra_cantidad_armas;
    private javax.swing.JSpinner compra_cantidad_armas1;
    private javax.swing.JSpinner compra_cantidad_armas2;
    private javax.swing.JSpinner compra_cantidad_armas3;
    private javax.swing.JSpinner compra_cantidad_consumibles;
    private javax.swing.JSpinner compra_cantidad_escudos;
    private javax.swing.JProgressBar escudo_stats;
    private javax.swing.JProgressBar fuerza_stats;
    private javax.swing.JProgressBar hp_stats;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton39;
    private javax.swing.JButton jButton42;
    private javax.swing.JButton jButton43;
    private javax.swing.JButton jButton46;
    private javax.swing.JButton jButton47;
    private javax.swing.JButton jButton50;
    private javax.swing.JButton jButton51;
    private javax.swing.JButton jButton54;
    private javax.swing.JButton jButton55;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTabbedPane jTabbedPane3;
    private javax.swing.JTextField jTextField21;
    private javax.swing.JTextField jTextField23;
    private javax.swing.JTextField jTextField25;
    private javax.swing.JTextField jTextField27;
    private javax.swing.JTextField jTextField29;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JTextPane jTextPane2;
    private javax.swing.JTextPane jTextPane3;
    private javax.swing.JTextPane jTextPane4;
    private javax.swing.JTextPane jTextPane5;
    private javax.swing.JTextPane jTextPane6;
    private javax.swing.JTextPane jTextPane7;
    private javax.swing.JTextPane jTextPane8;
    public javax.swing.JLabel lab_espada_1;
    public javax.swing.JLabel lab_espada_2;
    public javax.swing.JLabel lab_espada_3;
    private javax.swing.JProgressBar magia_stats;
    private javax.swing.JLabel pts_escudo;
    private javax.swing.JLabel pts_fuerza;
    private javax.swing.JLabel pts_hp;
    private javax.swing.JLabel pts_magia;
    private javax.swing.JLabel pts_velocidad;
    private javax.swing.JRadioButton rb_arma_1;
    private javax.swing.JRadioButton rb_arma_2;
    private javax.swing.JRadioButton rb_arma_3;
    private javax.swing.JRadioButton rb_consumibles_1;
    private javax.swing.JRadioButton rb_consumibles_2;
    private javax.swing.JRadioButton rb_consumibles_3;
    private javax.swing.JRadioButton rb_escudo_1;
    private javax.swing.JRadioButton rb_escudo_2;
    private javax.swing.JRadioButton rb_escudo_3;
    private javax.swing.JRadioButton v_rb_consumibles_1;
    private javax.swing.JRadioButton v_rb_consumibles_2;
    private javax.swing.JRadioButton v_rb_consumibles_3;
    private javax.swing.JRadioButton v_rb_escudo_1;
    private javax.swing.JRadioButton v_rb_escudo_2;
    private javax.swing.JRadioButton v_rb_escudo_3;
    private javax.swing.JRadioButton v_rb_espada_1;
    private javax.swing.JRadioButton v_rb_espada_2;
    private javax.swing.JRadioButton v_rb_espada_3;
    private javax.swing.JProgressBar velocidad_stats;
    // End of variables declaration//GEN-END:variables
}
