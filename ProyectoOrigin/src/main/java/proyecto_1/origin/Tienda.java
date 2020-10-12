/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_1.origin;
import java.util.Arrays;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.ListModel;

/**
 *
 * @author Xandr
 */
public class Tienda extends javax.swing.JInternalFrame { 
    
    public int hp=40,escudo=25,fuerza=30,magia=10,velocidad=30;
    public int[] valores_a;
    public int[] valores_e;
    public int[] valores_c;
    public String elemento;
    
    public Tienda(int[] val_a, int[] val_e, int[] val_c) {
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
        
        System.out.println("Valores_a: "+val_a[0]+" "+val_a[1]+" "+val_a[2]);
        System.out.println("Valores_e: "+val_e[0]+" "+val_e[1]+" "+val_e[2]);
        System.out.println("Valores_c: "+val_c[0]+" "+val_c[1]+" "+val_c[2]);
        
        valores_a = val_a;
        valores_e = val_e;
        valores_c = val_c;
        
        //Ordena de menor a mayor los valores del API para los objetos en la tienda
        Arrays.sort(valores_a);
        Arrays.sort(valores_e);
        Arrays.sort(valores_c);

        lab_espada_1.setText("$"+valores_a[0]);
        lab_espada_2.setText("$"+valores_a[1]);
        lab_espada_3.setText("$"+valores_a[2]);
        
        lab_escudo_1.setText("$"+valores_e[0]);
        lab_escudo_2.setText("$"+valores_e[1]);
        lab_escudo_3.setText("$"+valores_e[2]);
        
        lab_consumible_1.setText("$"+valores_c[0]);
        lab_consumible_2.setText("$"+valores_c[1]);
        lab_consumible_3.setText("$"+valores_c[2]);
        
    }
    
    DefaultListModel<String> modelo = new DefaultListModel<>();
    DefaultListModel<String> modelo2 = new DefaultListModel<>();
       
    public int obtener_v_armas() throws Exception{
               
        if (rb_arma_1.isSelected()){
            elemento = "Espada nvl 5";
            return valores_a[0];
        }
        if (rb_arma_2.isSelected()){
            elemento = "Espada nvl 10";
            return valores_a[1];
        }
        if (rb_arma_3.isSelected()){
            elemento = "Espada nvl 30";
            return valores_a[2];
        }
        
        return 0;
     
    }
    public int obtener_v_escudos() throws Exception{
        if (rb_escudo_1.isSelected()){
            elemento = "Escudo nvl 7";
            return valores_e[0];
        }
        if (rb_escudo_2.isSelected()){
            elemento = "Escudo nvl 14";
            return valores_e[1];
        }
        if (rb_escudo_3.isSelected()){
            elemento = "Escudo nvl 28";
            return valores_e[2];
        }
        return 0;
    }
    public int obtener_v_consumibles() throws Exception{
        if (rb_consumibles_1.isSelected()){
            elemento = "Poción de vida";
            return valores_c[0];
        }
        if (rb_consumibles_2.isSelected()){
            elemento = "Poción de escudo";
            return valores_c[1];
        }
        if (rb_consumibles_3.isSelected()){
            elemento = "Poción de magia";
            return valores_c[2];
        }
        return 0;
    }
    public int obtener_cantidad_a(){
        Integer valor = (Integer) compra_cantidad_armas.getValue();
       
        return valor;
    }
    
    public int obtener_cantidad_e(){
        Integer valor = (Integer) compra_cantidad_escudos.getValue();
       
        return valor;
    }
    
    public int obtener_cantidad_c(){
        Integer valor = (Integer) compra_cantidad_consumibles.getValue();
       
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
        cancelar_compra_a = new javax.swing.JButton();
        compra_cantidad_armas = new javax.swing.JSpinner();
        jPanel2 = new javax.swing.JPanel();
        rb_escudo_1 = new javax.swing.JRadioButton();
        rb_escudo_2 = new javax.swing.JRadioButton();
        rb_escudo_3 = new javax.swing.JRadioButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextPane4 = new javax.swing.JTextPane();
        lab_escudo_1 = new javax.swing.JLabel();
        lab_escudo_2 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTextPane5 = new javax.swing.JTextPane();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTextPane6 = new javax.swing.JTextPane();
        lab_escudo_3 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        Tot_compra_escudos = new javax.swing.JTextField();
        b_comprar_escudos = new javax.swing.JButton();
        cancelar_compra_e = new javax.swing.JButton();
        jLabel44 = new javax.swing.JLabel();
        compra_cantidad_escudos = new javax.swing.JSpinner();
        jPanel3 = new javax.swing.JPanel();
        rb_consumibles_1 = new javax.swing.JRadioButton();
        rb_consumibles_2 = new javax.swing.JRadioButton();
        rb_consumibles_3 = new javax.swing.JRadioButton();
        lab_consumible_1 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTextPane7 = new javax.swing.JTextPane();
        jScrollPane8 = new javax.swing.JScrollPane();
        jTextPane8 = new javax.swing.JTextPane();
        lab_consumible_2 = new javax.swing.JLabel();
        lab_consumible_3 = new javax.swing.JLabel();
        jScrollPane9 = new javax.swing.JScrollPane();
        Text = new javax.swing.JTextPane();
        jLabel45 = new javax.swing.JLabel();
        Tot_compra_consumibles = new javax.swing.JTextField();
        b_comprar_consumibles = new javax.swing.JButton();
        cancelar_compra_c = new javax.swing.JButton();
        jLabel46 = new javax.swing.JLabel();
        compra_cantidad_consumibles = new javax.swing.JSpinner();
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
        jScrollPane10 = new javax.swing.JScrollPane();
        jList_armas = new javax.swing.JList<>();
        jLabel8 = new javax.swing.JLabel();
        b_venta = new javax.swing.JButton();
        jScrollPane11 = new javax.swing.JScrollPane();
        jList_equipado = new javax.swing.JList<>();
        jLabel9 = new javax.swing.JLabel();
        b_desequipar = new javax.swing.JButton();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
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
        jTextPane2.setText("Espada perfecta para combates más complejos, aumenta +5HP, +20 escudo, +2 magia");
        jScrollPane2.setViewportView(jTextPane2);

        jTextPane3.setEditable(false);
        jTextPane3.setText("Espada perfecta para combatir Jefes, ágil y con buen daño. +20HP, +5 Magia, + 3 Velocidad");
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

        cancelar_compra_a.setText("Cancelar");
        cancelar_compra_a.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelar_compra_aActionPerformed(evt);
            }
        });

        compra_cantidad_armas.setModel(new javax.swing.SpinnerNumberModel(0, 0, 1, 1));
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
                        .addComponent(rb_arma_2)
                        .addGap(18, 18, 18)
                        .addComponent(lab_espada_2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(rb_arma_3)
                        .addGap(18, 18, 18)
                        .addComponent(lab_espada_3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(rb_arma_1)
                        .addGap(18, 18, 18)
                        .addComponent(lab_espada_1)))
                .addGap(186, 186, 186))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
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
                                    .addComponent(cancelar_compra_a))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(b_comprar_armas)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
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
                    .addComponent(cancelar_compra_a)
                    .addComponent(b_comprar_armas))
                .addContainerGap(126, Short.MAX_VALUE))
        );

        lab_espada_1.getAccessibleContext().setAccessibleName("lab_espada_1");
        lab_espada_1.getAccessibleContext().setAccessibleDescription("");
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
        jTextPane4.setText("Escudo básico para combates ocacionales, +2 Escudo");
        jScrollPane4.setViewportView(jTextPane4);

        jTextPane5.setEditable(false);
        jTextPane5.setText("Escudo reforzado, menos impacto de daño enemigo, +2 HP, +6 escudo, +1 Magia");
        jScrollPane5.setViewportView(jTextPane5);

        jTextPane6.setEditable(false);
        jTextPane6.setText("Escudo blindado, los golpes rara vez serán problema, +5HP, +10 escudo, +3 Magia, +2 Velocidad");
        jScrollPane6.setViewportView(jTextPane6);

        jLabel43.setText("Cantidad:");

        Tot_compra_escudos.setText("0");

        b_comprar_escudos.setText("Comprar");
        b_comprar_escudos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_comprar_escudosActionPerformed(evt);
            }
        });

        cancelar_compra_e.setText("Cancelar");
        cancelar_compra_e.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelar_compra_eActionPerformed(evt);
            }
        });

        jLabel44.setText("Total:");

        compra_cantidad_escudos.setModel(new javax.swing.SpinnerNumberModel(0, 0, 10, 1));
        compra_cantidad_escudos.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                compra_cantidad_escudosStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(rb_escudo_1)
                        .addGap(27, 27, 27)
                        .addComponent(lab_escudo_1))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(rb_escudo_2)
                        .addGap(24, 24, 24)
                        .addComponent(lab_escudo_2)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 287, Short.MAX_VALUE)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(rb_escudo_3)
                        .addGap(18, 18, 18)
                        .addComponent(lab_escudo_3)))
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
                                .addComponent(Tot_compra_escudos))
                            .addComponent(cancelar_compra_e))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(b_comprar_escudos)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rb_escudo_1)
                    .addComponent(lab_escudo_1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rb_escudo_2)
                    .addComponent(lab_escudo_2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rb_escudo_3)
                    .addComponent(lab_escudo_3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel43)
                    .addComponent(compra_cantidad_escudos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel44)
                    .addComponent(Tot_compra_escudos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancelar_compra_e)
                    .addComponent(b_comprar_escudos))
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

        jTextPane7.setEditable(false);
        jTextPane7.setText("Recuperar vida nunca fue tan fácil, +3 HP");
        jScrollPane7.setViewportView(jTextPane7);

        jTextPane8.setEditable(false);
        jTextPane8.setText("No tienes refuerzos? Tranquilo... +3 Escudo");
        jScrollPane8.setViewportView(jTextPane8);

        Text.setEditable(false);
        Text.setText("Sientes ese cosquilleo? Es magia. +6 Magia");
        jScrollPane9.setViewportView(Text);

        jLabel45.setText("Cantidad:");

        Tot_compra_consumibles.setText("0");

        b_comprar_consumibles.setText("Comprar");
        b_comprar_consumibles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_comprar_consumiblesActionPerformed(evt);
            }
        });

        cancelar_compra_c.setText("Cancelar");
        cancelar_compra_c.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelar_compra_cActionPerformed(evt);
            }
        });

        jLabel46.setText("Total:");

        compra_cantidad_consumibles.setModel(new javax.swing.SpinnerNumberModel(0, 0, 10, 1));
        compra_cantidad_consumibles.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                compra_cantidad_consumiblesStateChanged(evt);
            }
        });

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
                                .addComponent(lab_consumible_3))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(rb_consumibles_1)
                                .addGap(18, 18, 18)
                                .addComponent(lab_consumible_1))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(rb_consumibles_2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lab_consumible_2)))
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
                                .addComponent(Tot_compra_consumibles))
                            .addComponent(cancelar_compra_c))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(b_comprar_consumibles)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rb_consumibles_1)
                    .addComponent(lab_consumible_1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rb_consumibles_2)
                    .addComponent(lab_consumible_2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rb_consumibles_3)
                    .addComponent(lab_consumible_3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel45)
                    .addComponent(compra_cantidad_consumibles, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel46)
                    .addComponent(Tot_compra_consumibles, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancelar_compra_c)
                    .addComponent(b_comprar_consumibles))
                .addContainerGap(123, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Consumibles", jPanel3);

        jTabbedPane1.addTab("Compra", jTabbedPane2);

        jLabel6.setText("Velocidad");

        MoonPoints.setText("10000");
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

        hp_stats.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        b_equipar_objetos.setText("Equipar");
        b_equipar_objetos.setToolTipText("");
        b_equipar_objetos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_equipar_objetosActionPerformed(evt);
            }
        });

        jList_armas.setModel(modelo);
        jScrollPane10.setViewportView(jList_armas);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel8.setText("Inventario");

        b_venta.setText("Vender");
        b_venta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_ventaActionPerformed(evt);
            }
        });

        jList_equipado.setModel(modelo2);
        jScrollPane11.setViewportView(jList_equipado);

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel9.setText("Equipado");

        b_desequipar.setText("Desequipar");
        b_desequipar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_desequiparActionPerformed(evt);
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
                        .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(97, 97, 97)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(23, 23, 23)
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
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(b_equipar_objetos)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(b_venta))
                                    .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(b_desequipar)
                                .addGap(24, 24, 24))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(98, 98, 98)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(MoonPoints, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(80, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MoonPoints, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b_venta)
                    .addComponent(b_equipar_objetos)
                    .addComponent(b_desequipar))
                .addGap(19, 19, 19)
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

    
    public void modelo_añadir_a(){
        int moon_disponible;
        int total;
        moon_disponible = Integer.parseInt(MoonPoints.getText());
        total = Integer.parseInt(Tot_compra_armas.getText());                   
        int x = 0;

        for(int i=0; i < jList_armas.getModel().getSize(); i++){

            String inv = jList_armas.getModel().getElementAt(i);

            if(inv.equals(elemento)){

                JOptionPane.showMessageDialog(null, "Usted ya ha comprado este objeto!", "Objeto en el Inventario", JOptionPane.ERROR_MESSAGE);
                compra_cantidad_armas.setValue(0);
                Tot_compra_armas.setText("0");
                x = 1;
                break;

            }                 
        }
        
        for(int i=0; i < jList_equipado.getModel().getSize(); i++){

            String equ = jList_equipado.getModel().getElementAt(i);

            if(equ.equals(elemento)){

                JOptionPane.showMessageDialog(null, "Usted ya ha comprado este objeto!", "Objeto en el Inventario", JOptionPane.ERROR_MESSAGE);
                compra_cantidad_armas.setValue(0);
                Tot_compra_armas.setText("0");
                x = 1;
                break;

            }                 
        }

        if(x == 0){

                modelo.addElement(elemento);

                total = moon_disponible-total;
                MoonPoints.setText(""+total);
                compra_cantidad_armas.setValue(0);
                Tot_compra_armas.setText("0");

            }
    }
     
    public void modelo_añadir_e(){
        int moon_disponible;
        int total;
        moon_disponible = Integer.parseInt(MoonPoints.getText());
        total = Integer.parseInt(Tot_compra_escudos.getText());
        
        try{
            int val = obtener_v_escudos();
            int cont = total/val;

            for(int i=0; i<cont; i++){

                modelo.addElement(elemento);

            }
            total = moon_disponible-total;
            MoonPoints.setText(""+total);
            compra_cantidad_escudos.setValue(0);
            Tot_compra_escudos.setText("0");
            
        }catch(Exception e){
        }
    }
    
    public void modelo_añadir_c(){
        int moon_disponible;
        int total;
        moon_disponible = Integer.parseInt(MoonPoints.getText());
        total = Integer.parseInt(Tot_compra_consumibles.getText());

        try{
            int val = obtener_v_consumibles();
            int cont = total/val;

            for(int i=0; i<cont; i++){

                modelo.addElement(elemento);

            }
            total = moon_disponible-total;
            MoonPoints.setText(""+total);
            compra_cantidad_consumibles.setValue(0);
            Tot_compra_consumibles.setText("0");
            
        }catch(Exception e){
        }
 
    }
    
    private void MoonPointsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MoonPointsActionPerformed
        MoonPoints.setEnabled(false);                
    }//GEN-LAST:event_MoonPointsActionPerformed
        
    private void b_equipar_objetosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_equipar_objetosActionPerformed
       
        String seleccion = jList_armas.getSelectedValue();
        int ind_selec = jList_armas.getSelectedIndex();
        hp = hp_stats.getValue();
        escudo = escudo_stats.getValue();
        magia = magia_stats.getValue();
        fuerza = fuerza_stats.getValue();
        velocidad = velocidad_stats.getValue();
        Boolean pasa = true;
        
         ListModel model = jList_equipado.getModel();
        for(int i=0; i < model.getSize(); i++){
            
            Object validacion =  model.getElementAt(i); 
            if (validacion.toString().charAt(3)==seleccion.charAt(3)){
                pasa=false;
                break;
            }
        
}
        if (pasa==true){        
        
        if(seleccion.charAt(2) == 'p'){
            
            modelo2.addElement(seleccion);
            modelo.removeElementAt(ind_selec);
            
            if(seleccion.charAt(11) == '5'){
                hp += 2;
                hp_stats.setValue(hp);
                
            }
            
            if(seleccion.charAt(11) == '1'){
                hp += 5;
                escudo += 20;
                magia += 2;
                
                hp_stats.setValue(hp);               
                escudo_stats.setValue(escudo);
                magia_stats.setValue(magia);               
            }
            
            if(seleccion.charAt(11) == '3'){
                hp += 20;
                velocidad += 3;
                magia += 5;
                
                hp_stats.setValue(hp);
                velocidad_stats.setValue(velocidad);
                magia_stats.setValue(magia);               
            }
                                                    
        }
        
        else if(seleccion.charAt(3) == 'u'){
            
            modelo2.addElement(seleccion);
            modelo.removeElementAt(ind_selec);
            
            if(seleccion.charAt(11) == '7'){
                escudo += 2;
                escudo_stats.setValue(escudo);
                
            }
            
            if(seleccion.charAt(11) == '1'){
                hp += 2;
                escudo += 6;
                magia += 1;
                
                hp_stats.setValue(hp);               
                escudo_stats.setValue(escudo);
                magia_stats.setValue(magia);               
            }
            
            if(seleccion.charAt(11) == '2'){
                hp += 5;
                escudo += 10;
                magia += 3;
                velocidad += 2;
                
                hp_stats.setValue(hp);
                escudo_stats.setValue(escudo);
                velocidad_stats.setValue(velocidad);
                magia_stats.setValue(magia);               
            }
            
        }
        
        else{
            
            modelo.removeElementAt(ind_selec);
            
            if(seleccion.charAt(10) == 'v'){
                hp += 3;
                hp_stats.setValue(hp);
                
            }
            
            if(seleccion.charAt(10) == 'e'){
                escudo += 3;               
                escudo_stats.setValue(escudo);             
            }
            
            if(seleccion.charAt(10) == 'm'){
                magia += 6;
                magia_stats.setValue(magia);               
            }
            
        }
        }else {
            JOptionPane.showMessageDialog(null,"El objeto ya esta equipado");
        }
                   
    }//GEN-LAST:event_b_equipar_objetosActionPerformed

    private void compra_cantidad_consumiblesStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_compra_cantidad_consumiblesStateChanged

        try {
            Tot_compra_consumibles.setText("0");

            int valor_consumibles = obtener_v_consumibles();
            int cantidad_consumibles = obtener_cantidad_c();
            int tot = valor_consumibles*cantidad_consumibles;

            Tot_compra_consumibles.setText(""+tot);

        }catch(Exception e){
        }
    }//GEN-LAST:event_compra_cantidad_consumiblesStateChanged

    private void cancelar_compra_cActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelar_compra_cActionPerformed

        compra_cantidad_consumibles.setValue(0);
        Tot_compra_consumibles.setText("0");
        rb_consumibles_1.setSelected(false);
        rb_consumibles_2.setSelected(false);
        rb_consumibles_3.setSelected(false);

    }//GEN-LAST:event_cancelar_compra_cActionPerformed

    private void b_comprar_consumiblesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_comprar_consumiblesActionPerformed

        int moon_disponible;
        int total;
        moon_disponible = Integer.parseInt(MoonPoints.getText());
        total = Integer.parseInt(Tot_compra_consumibles.getText());

        if(moon_disponible>=total){

            modelo_añadir_c();

        }
        else{
            JOptionPane.showMessageDialog(null, "Usted no posee suficientes MoonPoints!", "Fondos Insuficientes", JOptionPane.ERROR_MESSAGE);
        }
        
        rb_consumibles_1.setSelected(false);
        rb_consumibles_2.setSelected(false);
        rb_consumibles_3.setSelected(false);
        pts_hp.setText("");
        pts_escudo.setText("");
        pts_fuerza.setText("");
        pts_magia.setText("");
        pts_velocidad.setText("");
        hp_stats.setValue(hp);       
        escudo_stats.setValue(escudo);
        fuerza_stats.setValue(fuerza);
        magia_stats.setValue(magia);
        velocidad_stats.setValue(velocidad);

    }//GEN-LAST:event_b_comprar_consumiblesActionPerformed

    private void rb_consumibles_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb_consumibles_3ActionPerformed

        pts_hp.setText("");
        pts_escudo.setText("");
        pts_fuerza.setText("");
        pts_magia.setText("");
        pts_velocidad.setText("");

        if (rb_consumibles_3.isSelected()){
            rb_consumibles_2.setSelected(false);
            rb_consumibles_1.setSelected(false);

            magia_stats.setValue(magia+6);
            pts_magia.setText("+6");
        }
    }//GEN-LAST:event_rb_consumibles_3ActionPerformed

    private void rb_consumibles_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb_consumibles_2ActionPerformed

        pts_hp.setText("");
        pts_escudo.setText("");
        pts_fuerza.setText("");
        pts_magia.setText("");
        pts_velocidad.setText("");

        if (rb_consumibles_2.isSelected()){
            rb_consumibles_1.setSelected(false);
            rb_consumibles_3.setSelected(false);

            escudo_stats.setValue(escudo+6);
            pts_escudo.setText("+6");
        }
    }//GEN-LAST:event_rb_consumibles_2ActionPerformed

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

    private void compra_cantidad_escudosStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_compra_cantidad_escudosStateChanged

        try {
            Tot_compra_escudos.setText("0");

            int valor_escudos = obtener_v_escudos();
            int cantidad_escudos = obtener_cantidad_e();
            int tot = valor_escudos*cantidad_escudos;

            Tot_compra_escudos.setText(""+tot);

        }catch(Exception e){
        }
    }//GEN-LAST:event_compra_cantidad_escudosStateChanged

    private void cancelar_compra_eActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelar_compra_eActionPerformed

        compra_cantidad_escudos.setValue(0);
        Tot_compra_escudos.setText("0");
        rb_escudo_1.setSelected(false);
        rb_escudo_2.setSelected(false);
        rb_escudo_3.setSelected(false);

    }//GEN-LAST:event_cancelar_compra_eActionPerformed

    private void b_comprar_escudosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_comprar_escudosActionPerformed

        int moon_disponible;
        int total;
        moon_disponible = Integer.parseInt(MoonPoints.getText());
        total = Integer.parseInt(Tot_compra_escudos.getText());

        if(moon_disponible>total){

            modelo_añadir_e();

        }
        else{
            JOptionPane.showMessageDialog(null, "Usted no posee suficientes MoonPoints!", "Fondos Insuficientes", JOptionPane.ERROR_MESSAGE);
        }
        
        rb_escudo_1.setSelected(false);
        rb_escudo_2.setSelected(false);
        rb_escudo_3.setSelected(false);
        pts_hp.setText("");
        pts_escudo.setText("");
        pts_fuerza.setText("");
        pts_magia.setText("");
        pts_velocidad.setText("");
        hp_stats.setValue(hp);       
        escudo_stats.setValue(escudo);
        fuerza_stats.setValue(fuerza);
        magia_stats.setValue(magia);
        velocidad_stats.setValue(velocidad);

    }//GEN-LAST:event_b_comprar_escudosActionPerformed

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

    private void compra_cantidad_armasStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_compra_cantidad_armasStateChanged
        try {
            Tot_compra_armas.setText("0");

            int valor_armas = obtener_v_armas();
            int cantidad_armas = obtener_cantidad_a();
            int tot = valor_armas*cantidad_armas;

            Tot_compra_armas.setText(""+tot);

        }catch(Exception e){
        }

    }//GEN-LAST:event_compra_cantidad_armasStateChanged

    private void cancelar_compra_aActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelar_compra_aActionPerformed

        compra_cantidad_armas.setValue(0);
        Tot_compra_armas.setText("0");
        rb_arma_1.setSelected(false);
        rb_arma_2.setSelected(false);
        rb_arma_3.setSelected(false);

    }//GEN-LAST:event_cancelar_compra_aActionPerformed

    private void b_comprar_armasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_comprar_armasActionPerformed

        int moon_disponible;
        int total;
        moon_disponible = Integer.parseInt(MoonPoints.getText());
        total = Integer.parseInt(Tot_compra_armas.getText());

        if(moon_disponible>total){

            modelo_añadir_a();

        }
        else{
            JOptionPane.showMessageDialog(null, "Usted no posee suficientes MoonPoints!", "Fondos Insuficientes", JOptionPane.ERROR_MESSAGE);
        }
        rb_arma_1.setSelected(false);
        rb_arma_2.setSelected(false);
        rb_arma_3.setSelected(false);
        pts_hp.setText("");
        pts_escudo.setText("");
        pts_fuerza.setText("");
        pts_magia.setText("");
        pts_velocidad.setText("");
        hp_stats.setValue(hp);       
        escudo_stats.setValue(escudo);
        fuerza_stats.setValue(fuerza);
        magia_stats.setValue(magia);
        velocidad_stats.setValue(velocidad);

    }//GEN-LAST:event_b_comprar_armasActionPerformed

    private void Tot_compra_armasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tot_compra_armasActionPerformed

    }//GEN-LAST:event_Tot_compra_armasActionPerformed

    private void rb_arma_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb_arma_3ActionPerformed

        if(rb_arma_3.isSelected()){
            rb_arma_1.setSelected(false);
            rb_arma_2.setSelected(false);

            pts_hp.setText("");
            pts_escudo.setText("");
            pts_fuerza.setText("");
            pts_magia.setText("");
            pts_velocidad.setText("");

            hp_stats.setValue(hp+20);
            pts_hp.setText("+20");

            velocidad_stats.setValue(velocidad+3);
            pts_velocidad.setText("+3");

            magia_stats.setValue(magia+5);
            pts_magia.setText("+5");

        }
    }//GEN-LAST:event_rb_arma_3ActionPerformed

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

    private void b_ventaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_ventaActionPerformed
        
        String seleccion = jList_armas.getSelectedValue();
        int ind_selec = jList_armas.getSelectedIndex();
        Integer moon_disponible = Integer.parseInt(MoonPoints.getText());
        int precio; precio=0;
        String mensaje;
        
        if(seleccion.charAt(2) == 'p'){
            
            if(seleccion.charAt(11) == '5'){
                precio = valores_a[0];            
            }            
            if(seleccion.charAt(11) == '1'){
                precio = valores_a[1];               
            }            
            if(seleccion.charAt(11) == '3'){
                precio = valores_a[2];               
            }                                                   
        }
        
        else if(seleccion.charAt(3) == 'u'){                      
            if(seleccion.charAt(11) == '7'){
                precio = valores_e[0];               
            }            
            if(seleccion.charAt(11) == '1'){
                precio = valores_e[1];               
            }           
            if(seleccion.charAt(11) == '2'){
                precio = valores_e[2];               
            }            
        }      
        else{          
            if(seleccion.charAt(10) == 'v'){
                precio = valores_c[0];               
            }            
            if(seleccion.charAt(10) == 'e'){
                precio = valores_c[1];               
            }           
            if(seleccion.charAt(10) == 'm'){
                precio = valores_c[2];              
            }
            
        }
        precio -= 15;
        mensaje = "Este objeto se vendera por $"+precio;
        int respuesta = JOptionPane.showConfirmDialog(null, mensaje, "¿Desea realizar la venta?", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

        if(respuesta==0){
            moon_disponible += precio;
            MoonPoints.setText(""+moon_disponible);
            modelo.removeElementAt(ind_selec);
            JOptionPane.showMessageDialog(null, "La venta se ha realizado con éxito!", "Objeto vendido", JOptionPane.INFORMATION_MESSAGE);
        }
        
        
    }//GEN-LAST:event_b_ventaActionPerformed

    private void b_desequiparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_desequiparActionPerformed
        String seleccion = jList_equipado.getSelectedValue();
        int ind_selec = jList_equipado.getSelectedIndex();
        hp = hp_stats.getValue();
        escudo = escudo_stats.getValue();
        magia = magia_stats.getValue();
        fuerza = fuerza_stats.getValue();
        velocidad = velocidad_stats.getValue();

        if(seleccion.charAt(2) == 'p'){
            
            modelo.addElement(seleccion);
            modelo2.removeElementAt(ind_selec);
            
            if(seleccion.charAt(11) == '5'){
                hp -= 2;
                hp_stats.setValue(hp);
                
            }
            
            if(seleccion.charAt(11) == '1'){
                hp -= 5;
                escudo -= 20;
                magia -= 2;
                
                hp_stats.setValue(hp);               
                escudo_stats.setValue(escudo);
                magia_stats.setValue(magia);               
            }
            
            if(seleccion.charAt(11) == '3'){
                hp -= 20;
                velocidad -= 3;
                magia -= 5;
                
                hp_stats.setValue(hp);
                velocidad_stats.setValue(velocidad);
                magia_stats.setValue(magia);               
            }
                                                    
        }
        
        else if(seleccion.charAt(3) == 'u'){
            
            modelo.addElement(seleccion);
            modelo2.removeElementAt(ind_selec);
            
            if(seleccion.charAt(11) == '7'){
                escudo -= 2;
                escudo_stats.setValue(escudo);
                
            }
            
            if(seleccion.charAt(11) == '1'){
                hp -= 2;
                escudo -= 6;
                magia -= 1;
                
                hp_stats.setValue(hp);               
                escudo_stats.setValue(escudo);
                magia_stats.setValue(magia);               
            }
            
            if(seleccion.charAt(11) == '2'){
                hp -= 5;
                escudo -= 10;
                magia -= 3;
                velocidad -= 2;
                
                hp_stats.setValue(hp);
                escudo_stats.setValue(escudo);
                velocidad_stats.setValue(velocidad);
                magia_stats.setValue(magia);               
            }
            
        }
        
        else{
            
            modelo2.removeElementAt(ind_selec);
            
            if(seleccion.charAt(10) == 'v'){
                hp -= 3;
                hp_stats.setValue(hp);
                
            }
            
            if(seleccion.charAt(10) == 'e'){
                escudo -= 3;               
                escudo_stats.setValue(escudo);             
            }
            
            if(seleccion.charAt(10) == 'm'){
                magia -= 6;
                magia_stats.setValue(magia);               
            }
            
        }
          
    }//GEN-LAST:event_b_desequiparActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField MoonPoints;
    private javax.swing.JTextPane Text;
    private javax.swing.JTextField Tot_compra_armas;
    private javax.swing.JTextField Tot_compra_consumibles;
    private javax.swing.JTextField Tot_compra_escudos;
    private javax.swing.JButton b_comprar_armas;
    private javax.swing.JButton b_comprar_consumibles;
    private javax.swing.JButton b_comprar_escudos;
    private javax.swing.JButton b_desequipar;
    private javax.swing.JButton b_equipar_objetos;
    private javax.swing.JButton b_venta;
    private javax.swing.JButton cancelar_compra_a;
    private javax.swing.JButton cancelar_compra_c;
    private javax.swing.JButton cancelar_compra_e;
    private javax.swing.JSpinner compra_cantidad_armas;
    private javax.swing.JSpinner compra_cantidad_consumibles;
    private javax.swing.JSpinner compra_cantidad_escudos;
    private javax.swing.JProgressBar escudo_stats;
    private javax.swing.JProgressBar fuerza_stats;
    private javax.swing.JProgressBar hp_stats;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList<String> jList_armas;
    private javax.swing.JList<String> jList_equipado;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
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
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JTextPane jTextPane2;
    private javax.swing.JTextPane jTextPane3;
    private javax.swing.JTextPane jTextPane4;
    private javax.swing.JTextPane jTextPane5;
    private javax.swing.JTextPane jTextPane6;
    private javax.swing.JTextPane jTextPane7;
    private javax.swing.JTextPane jTextPane8;
    private javax.swing.JLabel lab_consumible_1;
    private javax.swing.JLabel lab_consumible_2;
    private javax.swing.JLabel lab_consumible_3;
    private javax.swing.JLabel lab_escudo_1;
    private javax.swing.JLabel lab_escudo_2;
    private javax.swing.JLabel lab_escudo_3;
    private javax.swing.JLabel lab_espada_1;
    private javax.swing.JLabel lab_espada_2;
    private javax.swing.JLabel lab_espada_3;
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
    private javax.swing.JProgressBar velocidad_stats;
    // End of variables declaration//GEN-END:variables
}
