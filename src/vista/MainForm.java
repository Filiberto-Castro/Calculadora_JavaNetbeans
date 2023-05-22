/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.RenderingHints;
import java.awt.Shape;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.geom.RoundRectangle2D;
import javax.swing.JFrame;

        

/**
 *
 * @author DELL
 */
public class MainForm extends javax.swing.JFrame {

    
    public float primerNumero = 0;
    public float segundoNumero = 0;
    public String operacionesEntrada;
    public String operador;
    public float resultado;
    public boolean isUsed = true;
    
    private Point initialClick;
    
    
    public MainForm() {
        initComponents();
        setLocationRelativeTo(this);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(this.getSize());
        setLayout(new FlowLayout());
        
        setBackground(new Color(0, 0, 0, 0));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelPrincipal = new javax.swing.JPanel(){
            @Override
            public void paintComponent(Graphics g) {
                super.paintComponent(g);
                // Establecer esquinas redondeadas
                int cornerRadius = 20; // Tamaño del radio de las esquinas
                Dimension arcs = new Dimension(cornerRadius, cornerRadius);
                Graphics2D g2d = (Graphics2D) g;
                g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
                g2d.setColor(getBackground());
                g2d.fillRoundRect(0, 0, getWidth() - 1, getHeight() - 1, arcs.width, arcs.height);
                g2d.setColor(getBackground());
                g2d.drawRoundRect(0, 0, getWidth() - 1, getHeight() - 1, arcs.width, arcs.height);
            }
        };
        panelEntrada = new javax.swing.JPanel();
        txtEntrada = new javax.swing.JLabel();
        txtOperaciones = new javax.swing.JLabel();
        iconCerrar = new javax.swing.JLabel();
        iconCerrar1 = new javax.swing.JLabel();
        iconCerrar2 = new javax.swing.JLabel();
        panelBotones = new javax.swing.JPanel();
        btn7 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        btnSumar = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btnRestar = new javax.swing.JButton();
        btn1 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btnDividir = new javax.swing.JButton();
        btnPunto = new javax.swing.JButton();
        btn0 = new javax.swing.JButton();
        btnIgual = new javax.swing.JButton();
        btnMultiplicar = new javax.swing.JButton();
        btnBorrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Mover JFrame con el mouse");
        setSize(400, 300);

        // Agregar un MouseListener para manejar el arrastre del JFrame
        addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                initialClick = e.getPoint();
                getComponentAt(initialClick);
            }
        });
        addMouseMotionListener(new MouseAdapter() {
            public void mouseDragged(MouseEvent e) {
                // obtener la ubicación actual del JFrame
                int thisX = getLocation().x;
                int thisY = getLocation().y;

                // calcular la nueva posición del JFrame en función del arrastre del mouse
                int xMoved = (thisX + e.getX()) - (thisX + initialClick.x);
                int yMoved = (thisY + e.getY()) - (thisY + initialClick.y);

                // establecer la nueva posición del JFrame
                int X = thisX + xMoved;
                int Y = thisY + yMoved;
                setLocation(X, Y);
            }
        }

    );
    setBackground(null);
    setBounds(new java.awt.Rectangle(0, 0, 0, 0));
    setUndecorated(true);
    setResizable(false);

    panelPrincipal.setBackground(new java.awt.Color(23, 23, 28));
    panelPrincipal.setOpaque(false);
    panelPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

    panelEntrada.setBackground(new java.awt.Color(0, 0, 0));
    panelEntrada.setOpaque(false);
    panelEntrada.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

    txtEntrada.setFont(new java.awt.Font("Roboto", 1, 48)); // NOI18N
    txtEntrada.setForeground(new java.awt.Color(255, 255, 255));
    txtEntrada.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    txtEntrada.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
    panelEntrada.add(txtEntrada, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 102, 227, 50));

    txtOperaciones.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
    txtOperaciones.setForeground(new java.awt.Color(46, 47, 56));
    txtOperaciones.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    panelEntrada.add(txtOperaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 227, 37));

    iconCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/image_dark/btn_cross_dark.png"))); // NOI18N
    iconCerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    iconCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            iconCerrarMouseClicked(evt);
        }
    });
    panelEntrada.add(iconCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, 24, 24));

    iconCerrar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/image_dark/minimizar_bar_dark.png"))); // NOI18N
    iconCerrar1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    panelEntrada.add(iconCerrar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 100, 3));

    iconCerrar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/image_dark/btn_dark.png"))); // NOI18N
    iconCerrar2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    panelEntrada.add(iconCerrar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 50, 22));

    panelPrincipal.add(panelEntrada, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -3, 250, 160));

    panelBotones.setBackground(new java.awt.Color(0, 0, 0));
    panelBotones.setOpaque(false);
    panelBotones.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

    btn7.setFont(new java.awt.Font("Roboto Black", 0, 24)); // NOI18N
    btn7.setForeground(new java.awt.Color(255, 255, 255));
    btn7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/image_dark/background_number_dark.png"))); // NOI18N
    btn7.setText("7");
    btn7.setBorderPainted(false);
    btn7.setContentAreaFilled(false);
    btn7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
    btn7.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            btn7ActionPerformed(evt);
        }
    });
    panelBotones.add(btn7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 50, 50));

    btn8.setFont(new java.awt.Font("Roboto Black", 0, 24)); // NOI18N
    btn8.setForeground(new java.awt.Color(255, 255, 255));
    btn8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/image_dark/background_number_dark.png"))); // NOI18N
    btn8.setText("8");
    btn8.setBorderPainted(false);
    btn8.setContentAreaFilled(false);
    btn8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
    btn8.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            btn8ActionPerformed(evt);
        }
    });
    panelBotones.add(btn8, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, 50, 50));

    btn9.setFont(new java.awt.Font("Roboto Black", 0, 24)); // NOI18N
    btn9.setForeground(new java.awt.Color(255, 255, 255));
    btn9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/image_dark/background_number_dark.png"))); // NOI18N
    btn9.setText("9");
    btn9.setBorderPainted(false);
    btn9.setContentAreaFilled(false);
    btn9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
    btn9.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            btn9ActionPerformed(evt);
        }
    });
    panelBotones.add(btn9, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 70, 50, 50));

    btnSumar.setFont(new java.awt.Font("Roboto Black", 0, 24)); // NOI18N
    btnSumar.setForeground(new java.awt.Color(255, 255, 255));
    btnSumar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/image_dark/background2_right_dark.png"))); // NOI18N
    btnSumar.setText("+");
    btnSumar.setBorderPainted(false);
    btnSumar.setContentAreaFilled(false);
    btnSumar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
    btnSumar.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            btnSumarActionPerformed(evt);
        }
    });
    panelBotones.add(btnSumar, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 130, 50, 80));

    btn4.setFont(new java.awt.Font("Roboto Black", 0, 24)); // NOI18N
    btn4.setForeground(new java.awt.Color(255, 255, 255));
    btn4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/image_dark/background_number_dark.png"))); // NOI18N
    btn4.setText("4");
    btn4.setBorderPainted(false);
    btn4.setContentAreaFilled(false);
    btn4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
    btn4.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            btn4ActionPerformed(evt);
        }
    });
    panelBotones.add(btn4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 50, 50));

    btn5.setFont(new java.awt.Font("Roboto Black", 0, 24)); // NOI18N
    btn5.setForeground(new java.awt.Color(255, 255, 255));
    btn5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/image_dark/background_number_dark.png"))); // NOI18N
    btn5.setText("5");
    btn5.setBorderPainted(false);
    btn5.setContentAreaFilled(false);
    btn5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
    btn5.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            btn5ActionPerformed(evt);
        }
    });
    panelBotones.add(btn5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, 50, 50));

    btn6.setFont(new java.awt.Font("Roboto Black", 0, 24)); // NOI18N
    btn6.setForeground(new java.awt.Color(255, 255, 255));
    btn6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/image_dark/background_number_dark.png"))); // NOI18N
    btn6.setText("6");
    btn6.setBorderPainted(false);
    btn6.setContentAreaFilled(false);
    btn6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
    btn6.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            btn6ActionPerformed(evt);
        }
    });
    panelBotones.add(btn6, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 130, 50, 50));

    btnRestar.setFont(new java.awt.Font("Roboto Black", 0, 24)); // NOI18N
    btnRestar.setForeground(new java.awt.Color(255, 255, 255));
    btnRestar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/image_dark/background_right_dark.png"))); // NOI18N
    btnRestar.setText("-");
    btnRestar.setBorderPainted(false);
    btnRestar.setContentAreaFilled(false);
    btnRestar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
    btnRestar.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            btnRestarActionPerformed(evt);
        }
    });
    panelBotones.add(btnRestar, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 70, 50, 50));

    btn1.setFont(new java.awt.Font("Roboto Black", 0, 24)); // NOI18N
    btn1.setForeground(new java.awt.Color(255, 255, 255));
    btn1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/image_dark/background_number_dark.png"))); // NOI18N
    btn1.setText("1");
    btn1.setBorderPainted(false);
    btn1.setContentAreaFilled(false);
    btn1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
    btn1.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            btn1ActionPerformed(evt);
        }
    });
    panelBotones.add(btn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 50, 50));

    btn2.setFont(new java.awt.Font("Roboto Black", 0, 24)); // NOI18N
    btn2.setForeground(new java.awt.Color(255, 255, 255));
    btn2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/image_dark/background_number_dark.png"))); // NOI18N
    btn2.setText("2");
    btn2.setBorderPainted(false);
    btn2.setContentAreaFilled(false);
    btn2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
    btn2.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            btn2ActionPerformed(evt);
        }
    });
    panelBotones.add(btn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 190, 50, 50));

    btn3.setFont(new java.awt.Font("Roboto Black", 0, 24)); // NOI18N
    btn3.setForeground(new java.awt.Color(255, 255, 255));
    btn3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/image_dark/background_number_dark.png"))); // NOI18N
    btn3.setText("3");
    btn3.setBorderPainted(false);
    btn3.setContentAreaFilled(false);
    btn3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
    btn3.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            btn3ActionPerformed(evt);
        }
    });
    panelBotones.add(btn3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 190, 50, 50));

    btnDividir.setFont(new java.awt.Font("Roboto Black", 0, 24)); // NOI18N
    btnDividir.setForeground(new java.awt.Color(255, 255, 255));
    btnDividir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/image_dark/background_top_dark.png"))); // NOI18N
    btnDividir.setText("/");
    btnDividir.setBorderPainted(false);
    btnDividir.setContentAreaFilled(false);
    btnDividir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
    btnDividir.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            btnDividirActionPerformed(evt);
        }
    });
    panelBotones.add(btnDividir, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, 50, 50));

    btnPunto.setFont(new java.awt.Font("Roboto Black", 0, 24)); // NOI18N
    btnPunto.setForeground(new java.awt.Color(255, 255, 255));
    btnPunto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/image_dark/background_number_dark.png"))); // NOI18N
    btnPunto.setText(".");
    btnPunto.setBorderPainted(false);
    btnPunto.setContentAreaFilled(false);
    btnPunto.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
    btnPunto.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            btnPuntoActionPerformed(evt);
        }
    });
    panelBotones.add(btnPunto, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 250, 50, 50));

    btn0.setFont(new java.awt.Font("Roboto Black", 0, 24)); // NOI18N
    btn0.setForeground(new java.awt.Color(255, 255, 255));
    btn0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/image_dark/background_bottom_dark.png"))); // NOI18N
    btn0.setText("0");
    btn0.setBorderPainted(false);
    btn0.setContentAreaFilled(false);
    btn0.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
    btn0.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            btn0ActionPerformed(evt);
        }
    });
    panelBotones.add(btn0, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 110, 50));

    btnIgual.setFont(new java.awt.Font("Roboto Black", 0, 24)); // NOI18N
    btnIgual.setForeground(new java.awt.Color(255, 255, 255));
    btnIgual.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/image_dark/background2_right_dark.png"))); // NOI18N
    btnIgual.setText("=");
    btnIgual.setBorderPainted(false);
    btnIgual.setContentAreaFilled(false);
    btnIgual.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
    btnIgual.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            btnIgualActionPerformed(evt);
        }
    });
    panelBotones.add(btnIgual, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 220, 50, 80));

    btnMultiplicar.setFont(new java.awt.Font("Roboto Black", 0, 24)); // NOI18N
    btnMultiplicar.setForeground(new java.awt.Color(255, 255, 255));
    btnMultiplicar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/image_dark/background_right_dark.png"))); // NOI18N
    btnMultiplicar.setText("*");
    btnMultiplicar.setBorderPainted(false);
    btnMultiplicar.setContentAreaFilled(false);
    btnMultiplicar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
    btnMultiplicar.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            btnMultiplicarActionPerformed(evt);
        }
    });
    panelBotones.add(btnMultiplicar, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 10, 50, 50));

    btnBorrar.setFont(new java.awt.Font("Roboto Black", 0, 24)); // NOI18N
    btnBorrar.setForeground(new java.awt.Color(255, 255, 255));
    btnBorrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/image_dark/background2_top_dark.png"))); // NOI18N
    btnBorrar.setText("C");
    btnBorrar.setBorderPainted(false);
    btnBorrar.setContentAreaFilled(false);
    btnBorrar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
    btnBorrar.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            btnBorrarActionPerformed(evt);
        }
    });
    panelBotones.add(btnBorrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 110, 50));

    panelPrincipal.add(panelBotones, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 250, 330));

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(panelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(panelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
    );

    pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed

        setTextEntrada("7");
        
        
    }//GEN-LAST:event_btn7ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed

        setTextEntrada("4");
        
    }//GEN-LAST:event_btn4ActionPerformed

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed

        setTextEntrada("1");

    }//GEN-LAST:event_btn1ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed

        setTextEntrada("2");

    }//GEN-LAST:event_btn2ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed

        setTextEntrada("3");

    }//GEN-LAST:event_btn3ActionPerformed

    private void btnDividirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDividirActionPerformed

        ingresoPrimerValor("/");

    }//GEN-LAST:event_btnDividirActionPerformed

    private void btnPuntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPuntoActionPerformed

        if(!(txtEntrada.getText().contains("."))){
            setTextEntrada(".");
        }
        

    }//GEN-LAST:event_btnPuntoActionPerformed

    private void btn0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn0ActionPerformed

        setTextEntrada("0");

    }//GEN-LAST:event_btn0ActionPerformed

    private void btnIgualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIgualActionPerformed

        // evaluando si la entrada de texto no esta vacio
        if (!(txtEntrada.getText().isEmpty())) {
            segundoNumero = Float.parseFloat(txtEntrada.getText());
            // si no se a apretado el signo igual una vez
            if (!isUsed) {
                operacionesEntrada += quitarCero(Float.parseFloat(txtEntrada.getText()));
                txtOperaciones.setText(operacionesEntrada);
                operacion(operador);
                primerNumero = 0;
                isUsed = true;
            }else{
                operacionesEntrada = txtEntrada.getText();
                txtOperaciones.setText(operacionesEntrada);
            }
            
        }
        
    }//GEN-LAST:event_btnIgualActionPerformed

    private void btnMultiplicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMultiplicarActionPerformed
        
        ingresoPrimerValor("*");
        
    }//GEN-LAST:event_btnMultiplicarActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed

        setTextEntrada("8");

    }//GEN-LAST:event_btn8ActionPerformed

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed

        setTextEntrada("9");
        
    }//GEN-LAST:event_btn9ActionPerformed

    private void btnSumarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSumarActionPerformed

        ingresoPrimerValor("+");
        
    }//GEN-LAST:event_btnSumarActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
        // TODO add your handling code here:
        
        setTextEntrada("6");
        
    }//GEN-LAST:event_btn6ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
        // TODO add your handling code here:
        
        setTextEntrada("5");
        
    }//GEN-LAST:event_btn5ActionPerformed

    private void btnRestarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRestarActionPerformed
        
        ingresoPrimerValor("-");
        
    }//GEN-LAST:event_btnRestarActionPerformed

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed

        txtEntrada.setText("");
        txtOperaciones.setText("");

    }//GEN-LAST:event_btnBorrarActionPerformed

    private void iconCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iconCerrarMouseClicked

        System.exit(0);
    }//GEN-LAST:event_iconCerrarMouseClicked

    // metodo para ingresar los textos a la entrada
    public void setTextEntrada(String texto){
        String nuevo, valor;
        valor = txtEntrada.getText();
        nuevo = valor + texto;
        txtEntrada.setText(nuevo);
    }
    
    public void ingresoPrimerValor(String operador){
        
        // evaluando si la entrada de texto no esta vacio
        if (!(txtEntrada.getText().isEmpty())) {
            primerNumero = Float.parseFloat(txtEntrada.getText());
            operacionesEntrada = String.valueOf(quitarCero(primerNumero) + operador);
            txtOperaciones.setText(txtEntrada.getText() + operador);
            this.operador = operador;
            txtEntrada.setText("");
            isUsed = false;
        }
        
    }
    
    public void operacion(String op){
        
        switch(op){
            case "+":
                resultado = primerNumero + segundoNumero;
                break;
            case "-":
                resultado = primerNumero - segundoNumero;
                break;
            case "*":
                resultado = primerNumero * segundoNumero;
                break;
            case "/":
                resultado = primerNumero / segundoNumero;
                break;
        }
        
        txtEntrada.setText(String.valueOf(quitarCero(resultado)));
        
    }
    
    // metodo para quitar el cero decimal que tiene el valor float
    public String quitarCero(float valor){
        String retorno = "";
        retorno = String.valueOf(valor);
        
        if (valor%1==0) {
            retorno=retorno.substring(0, retorno.length()-2);
        }
        
        return retorno;
    }
    
    
    
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
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn0;
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnDividir;
    private javax.swing.JButton btnIgual;
    private javax.swing.JButton btnMultiplicar;
    private javax.swing.JButton btnPunto;
    private javax.swing.JButton btnRestar;
    private javax.swing.JButton btnSumar;
    private javax.swing.JLabel iconCerrar;
    private javax.swing.JLabel iconCerrar1;
    private javax.swing.JLabel iconCerrar2;
    private javax.swing.JPanel panelBotones;
    private javax.swing.JPanel panelEntrada;
    private javax.swing.JPanel panelPrincipal;
    private javax.swing.JLabel txtEntrada;
    private javax.swing.JLabel txtOperaciones;
    // End of variables declaration//GEN-END:variables
}
