package Vista;
import Bean.ConfiguracionBean;
import Bean.LoginBean;
import Bean.MedicamentoBean;
import Bean.PacienteBean;
import Bean.ProveedorBean;
import Bean.VentaBean;
import Controlador.ConfiguracionControlador;
import Controlador.MedicamentoControlador;
import Controlador.PacienteControlador;
import Controlador.ProveedorControlador;
import Controlador.VentaControlador;
import Modelo.ConfiguracionDAO;
import Modelo.MedicamentoDAO;
import Modelo.PacienteDAO;
import Modelo.ProveedorDAO;
import Modelo.Validacion;
import Modelo.VentaDAO;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;

public final class Sistema extends javax.swing.JFrame {

    ProveedorDAO Prodao=new ProveedorDAO();
    ProveedorBean pro= new ProveedorBean();
    MedicamentoDAO MeDAO = new MedicamentoDAO();
    MedicamentoBean Medi = new MedicamentoBean();
    PacienteBean paci = new PacienteBean();
    PacienteDAO Padao = new PacienteDAO();
    VentaBean ve = new VentaBean();
    VentaDAO veDAO = new VentaDAO();
    Validacion vali = new Validacion();
    ConfiguracionBean con = new ConfiguracionBean();
    ConfiguracionDAO conDAO = new ConfiguracionDAO();

    public Sistema() {
        initComponents();
        AutoCompleteDecorator.decorate(comoProveedor);
        MeDAO.ConsularProveedor(comoProveedor);
        PacienteControlador locon=new PacienteControlador(Padao, paci, this);
        ConfiguracionControlador confi=new ConfiguracionControlador(con, conDAO, this);
        MedicamentoControlador conmed=new MedicamentoControlador(MeDAO, Medi, this);
        ProveedorControlador conpro=new ProveedorControlador(Prodao, pro, this);
        VentaControlador conven=new VentaControlador(ve, veDAO, this);
        ListarConfig();
        this.setLocationRelativeTo(null);
    }
    public static void main(String args[]) {
        Sistema S = new Sistema();
        //PacienteControlador con = new PacienteControlador(S);
        //ProveedorControlador pro = new ProveedorControlador(S);
        //MedicamentoControlador me = new MedicamentoControlador(S);
       // VentaControlador vec = new VentaControlador(S);
        //ConfiguracionControlador conf = new ConfiguracionControlador(S);
        //NuevaVentaControlador conVen = new NuevaVentaControlador(S);

        S.setVisible(true);
        S.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable5 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        btnNuevaVenta = new javax.swing.JButton();
        btnPaciente = new javax.swing.JButton();
        btnProveedor = new javax.swing.JButton();
        btnMedicament = new javax.swing.JButton();
        btnVentas = new javax.swing.JButton();
        btnConfiguraacion = new javax.swing.JButton();
        labelVendedor = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        btnEliminarVenta = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaNuevaVenta = new javax.swing.JTable();
        jLabel16 = new javax.swing.JLabel();
        labelTotal = new javax.swing.JLabel();
        btnImprimirVEnta = new javax.swing.JButton();
        jPanel11 = new javax.swing.JPanel();
        txtDni = new javax.swing.JLabel();
        txtDniVenta = new javax.swing.JTextField();
        txtNombresVenta = new javax.swing.JLabel();
        txtNombrespacienteVenta = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        txtTelefonopacienteVenta = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        txtDirecciPacienVenta = new javax.swing.JTextField();
        txtSexoPacienteVenta = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        txtCodigoVenta = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtDecripcionVenta = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtCantidadVenta = new javax.swing.JTextField();
        txtPrecioVenta = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txtStockDisponVenta = new javax.swing.JTextField();
        txtIdMediVenta = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        txtDniPaciente = new javax.swing.JTextField();
        txtNombresPaciente = new javax.swing.JTextField();
        txttelefonoPaciente = new javax.swing.JTextField();
        txtDireccionPaciente = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        tablaPaciente = new javax.swing.JTable();
        jPanel8 = new javax.swing.JPanel();
        btnGuardarPaciente = new javax.swing.JButton();
        btnActualizarpaciente = new javax.swing.JButton();
        btnEliminarPaciente = new javax.swing.JButton();
        btnnuevoPaciente = new javax.swing.JButton();
        comboSexoPaciente = new javax.swing.JComboBox<>();
        txtidPaciente = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtRucProveedor = new javax.swing.JTextField();
        txtNombresProveedor = new javax.swing.JTextField();
        txtTelefonoProveedor = new javax.swing.JTextField();
        txtDireccionProveedor = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaProveedor = new javax.swing.JTable();
        jPanel9 = new javax.swing.JPanel();
        btnGuardarProveedor = new javax.swing.JButton();
        btnActualizarProveedor = new javax.swing.JButton();
        btnElimiarPRoveedor = new javax.swing.JButton();
        btnNuevoProveedor = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txtRazonProvveedor = new javax.swing.JTextField();
        txtIdproveedor = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        txtCodigoMedi = new javax.swing.JTextField();
        txtDescriMedi = new javax.swing.JTextField();
        txtCantidadMedi = new javax.swing.JTextField();
        txtPrecioMedi = new javax.swing.JTextField();
        comoProveedor = new javax.swing.JComboBox<>();
        jScrollPane6 = new javax.swing.JScrollPane();
        tablaMedicamento = new javax.swing.JTable();
        jPanel10 = new javax.swing.JPanel();
        btnAgregarMedi = new javax.swing.JButton();
        btnActualizarMedi = new javax.swing.JButton();
        btnEliminarMedi = new javax.swing.JButton();
        btnNuevoMedi = new javax.swing.JButton();
        btnExcelMedi = new javax.swing.JButton();
        txtIdMedi = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        tablaVentas = new javax.swing.JTable();
        btnPdfVenta = new javax.swing.JButton();
        txtIdventa = new javax.swing.JTextField();
        jLabel36 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        txtRucFarmacia = new javax.swing.JTextField();
        txtNombreFarmacia = new javax.swing.JTextField();
        txtTelefonoFarmacia = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        txtDireccionFarmacia = new javax.swing.JTextField();
        txtRazonSocialFarmacia = new javax.swing.JTextField();
        btnActualizarFarmacia = new javax.swing.JButton();
        jLabel31 = new javax.swing.JLabel();
        txtIdFarmacia = new javax.swing.JTextField();
        jLabel38 = new javax.swing.JLabel();

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(jTable3);

        jTable5.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane5.setViewportView(jTable5);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));

        btnNuevaVenta.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnNuevaVenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/nueva venta.png"))); // NOI18N
        btnNuevaVenta.setText("NUEVA VENTA");

        btnPaciente.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnPaciente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/pacientef.png"))); // NOI18N
        btnPaciente.setText("PACIENTE");
        btnPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPacienteActionPerformed(evt);
            }
        });

        btnProveedor.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnProveedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/proveedor.png"))); // NOI18N
        btnProveedor.setText("PROVEEDOR");
        btnProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProveedorActionPerformed(evt);
            }
        });

        btnMedicament.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnMedicament.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/medica.png"))); // NOI18N
        btnMedicament.setText("MEDICAMENTO");

        btnVentas.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnVentas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/ventaf.png"))); // NOI18N
        btnVentas.setText("VENTAS");
        btnVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVentasActionPerformed(evt);
            }
        });

        btnConfiguraacion.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnConfiguraacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/configu.png"))); // NOI18N
        btnConfiguraacion.setText("CONFIGURACION");

        labelVendedor.setForeground(new java.awt.Color(255, 255, 255));
        labelVendedor.setText("MARIANA");

        jLabel37.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/mariana.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnNuevaVenta, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnPaciente, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnProveedor, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnMedicament, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnVentas, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnConfiguraacion, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(labelVendedor))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelVendedor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addComponent(btnNuevaVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnMedicament, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnVentas, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnConfiguraacion, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 190, 600));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/encabezado.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 0, 790, 190));

        jTabbedPane1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jPanel2.setBackground(new java.awt.Color(204, 204, 0));

        btnEliminarVenta.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnEliminarVenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/delete.png"))); // NOI18N
        btnEliminarVenta.setText("ELIMINAR");
        btnEliminarVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarVentaActionPerformed(evt);
            }
        });

        tablaNuevaVenta.setBackground(new java.awt.Color(204, 204, 204));
        tablaNuevaVenta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CÓDIGO", "DESCRIPCIÓN", "CANTIDAD", "PRECIO", "TOTAL"
            }
        ));
        tablaNuevaVenta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaNuevaVentaMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tablaNuevaVenta);

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel16.setText("TOTAL A PAGAR");

        btnImprimirVEnta.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnImprimirVEnta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/impresora.png"))); // NOI18N
        btnImprimirVEnta.setText("IMPRIMIR");
        btnImprimirVEnta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImprimirVEntaActionPerformed(evt);
            }
        });

        jPanel11.setBackground(new java.awt.Color(204, 204, 0));
        jPanel11.setBorder(javax.swing.BorderFactory.createTitledBorder("DATOS DEL PACIENTE"));

        txtDni.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtDni.setText("DNI");

        txtDniVenta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtDniVentaKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDniVentaKeyTyped(evt);
            }
        });

        txtNombresVenta.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtNombresVenta.setText("NOMBRES");

        txtNombrespacienteVenta.setEditable(false);
        txtNombrespacienteVenta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNombrespacienteVentaKeyPressed(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel18.setText("NÚMERO");

        txtTelefonopacienteVenta.setEditable(false);
        txtTelefonopacienteVenta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTelefonopacienteVentaKeyTyped(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel19.setText("DIRECCIÓN");

        txtDirecciPacienVenta.setEditable(false);

        txtSexoPacienteVenta.setEditable(false);
        txtSexoPacienteVenta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtSexoPacienteVentaKeyPressed(evt);
            }
        });

        jLabel32.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel32.setText("SEXO");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtDniVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(txtDni)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNombrespacienteVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNombresVenta))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtTelefonopacienteVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jLabel18)))
                .addGap(18, 18, 18)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtDirecciPacienVenta)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(jLabel19)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel32)
                    .addComponent(txtSexoPacienteVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addGap(0, 13, Short.MAX_VALUE)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDni)
                    .addComponent(txtNombresVenta)
                    .addComponent(jLabel18)
                    .addComponent(jLabel19)
                    .addComponent(jLabel32))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDniVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNombrespacienteVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTelefonopacienteVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDirecciPacienVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSexoPacienteVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jPanel12.setBackground(new java.awt.Color(204, 204, 0));
        jPanel12.setBorder(javax.swing.BorderFactory.createTitledBorder("DATOS DEL MEDICAMENTO"));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setText("CÓDIGO");

        txtCodigoVenta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCodigoVentaKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCodigoVentaKeyTyped(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setText("DESCRIPCIÓN");

        txtDecripcionVenta.setEditable(false);
        txtDecripcionVenta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtDecripcionVentaKeyPressed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel13.setText("CANTIDAD");

        txtCantidadVenta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCantidadVentaKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCantidadVentaKeyTyped(evt);
            }
        });

        txtPrecioVenta.setEditable(false);
        txtPrecioVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecioVentaActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel14.setText("PRECIO");

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel15.setText("ESTOCK DISPONIBLE");

        txtStockDisponVenta.setEditable(false);
        txtStockDisponVenta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtStockDisponVentaKeyTyped(evt);
            }
        });

        txtIdMediVenta.setEditable(false);

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel17.setText("ID");

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCodigoVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addComponent(txtDecripcionVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCantidadVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addGap(18, 18, 18)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel12Layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel15))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel12Layout.createSequentialGroup()
                        .addComponent(txtPrecioVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtStockDisponVenta)))
                .addGap(0, 59, Short.MAX_VALUE)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel17))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(txtIdMediVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13)
                    .addComponent(jLabel14)
                    .addComponent(jLabel15)
                    .addComponent(jLabel17))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCodigoVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDecripcionVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCantidadVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPrecioVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtStockDisponVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtIdMediVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel16)
                                .addGap(41, 41, 41)
                                .addComponent(labelTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(294, 294, 294)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btnEliminarVenta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnImprimirVEnta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(133, 133, 133))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane2)
                            .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(labelTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16))
                        .addGap(26, 26, 26))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(btnEliminarVenta)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnImprimirVEnta))
                .addGap(19, 19, 19))
        );

        jTabbedPane1.addTab("NUEVA VENTA", jPanel2);

        jPanel3.setBackground(new java.awt.Color(153, 153, 153));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("DNI");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("NOMBRES");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("TELÉFONO");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setText("DIRECCIÓN");

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel20.setText("SEXO");

        txtDniPaciente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDniPacienteKeyTyped(evt);
            }
        });

        txtNombresPaciente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNombresPacienteKeyPressed(evt);
            }
        });

        txttelefonoPaciente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txttelefonoPacienteKeyTyped(evt);
            }
        });

        tablaPaciente.setBackground(new java.awt.Color(204, 204, 204));
        tablaPaciente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "DNI", "NOMBRES", "TELÉFONO", "DIRECCIÓN", "SEXO"
            }
        ));
        tablaPaciente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaPacienteMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(tablaPaciente);
        if (tablaPaciente.getColumnModel().getColumnCount() > 0) {
            tablaPaciente.getColumnModel().getColumn(0).setPreferredWidth(20);
        }

        btnGuardarPaciente.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnGuardarPaciente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/guardar.png"))); // NOI18N
        btnGuardarPaciente.setText("GUARDAR");

        btnActualizarpaciente.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnActualizarpaciente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/actualizar.png"))); // NOI18N
        btnActualizarpaciente.setText("ACTUALIZAR");

        btnEliminarPaciente.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnEliminarPaciente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/delete.png"))); // NOI18N
        btnEliminarPaciente.setText("ELIMINAR");

        btnnuevoPaciente.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnnuevoPaciente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/nuevo.png"))); // NOI18N
        btnnuevoPaciente.setText("NUEVO");
        btnnuevoPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnuevoPacienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnGuardarPaciente)
                    .addComponent(btnEliminarPaciente))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnActualizarpaciente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnnuevoPaciente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(30, 30, 30))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardarPaciente)
                    .addComponent(btnActualizarpaciente))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEliminarPaciente)
                    .addComponent(btnnuevoPaciente))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        comboSexoPaciente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Masculino", "Femenino" }));

        txtidPaciente.setEditable(false);

        jLabel33.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel33.setText("ID");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 739, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)
                            .addComponent(jLabel20))
                        .addGap(44, 44, 44)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtDniPaciente)
                            .addComponent(txtNombresPaciente)
                            .addComponent(txttelefonoPaciente)
                            .addComponent(txtDireccionPaciente)
                            .addComponent(comboSexoPaciente, 0, 162, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtidPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel33))
                        .addGap(23, 23, 23)
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txtDniPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel33))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(txtNombresPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtidPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(txttelefonoPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(txtDireccionPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(13, 13, 13)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel20)
                            .addComponent(comboSexoPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        jTabbedPane1.addTab("PACIENTE", jPanel3);

        jPanel4.setBackground(new java.awt.Color(204, 204, 204));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("RUC");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("NOMBRES");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("TELÉFONO");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("DIRECCIÓN");

        txtRucProveedor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtRucProveedorKeyTyped(evt);
            }
        });

        txtNombresProveedor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNombresProveedorKeyPressed(evt);
            }
        });

        txtTelefonoProveedor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTelefonoProveedorKeyTyped(evt);
            }
        });

        tablaProveedor.setBackground(new java.awt.Color(204, 204, 204));
        tablaProveedor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "RUC", "NOMBRES", "TELÉFONO", "DIRECCIÓN", "RAZÓN SOCIAL"
            }
        ));
        tablaProveedor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaProveedorMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaProveedor);
        if (tablaProveedor.getColumnModel().getColumnCount() > 0) {
            tablaProveedor.getColumnModel().getColumn(0).setPreferredWidth(20);
        }

        btnGuardarProveedor.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnGuardarProveedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/guardar.png"))); // NOI18N
        btnGuardarProveedor.setText("AGREGAR");

        btnActualizarProveedor.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnActualizarProveedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/actualizar.png"))); // NOI18N
        btnActualizarProveedor.setText("ACTUALIZAR");

        btnElimiarPRoveedor.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnElimiarPRoveedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/delete.png"))); // NOI18N
        btnElimiarPRoveedor.setText("ELIMINAR");

        btnNuevoProveedor.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnNuevoProveedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/nuevo.png"))); // NOI18N
        btnNuevoProveedor.setText("NUEVO");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnGuardarProveedor)
                    .addComponent(btnElimiarPRoveedor))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnActualizarProveedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnNuevoProveedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(21, 21, 21))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardarProveedor)
                    .addComponent(btnActualizarProveedor))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnElimiarPRoveedor)
                    .addComponent(btnNuevoProveedor))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("RAZÓN SOCIAL");

        txtRazonProvveedor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtRazonProvveedorKeyPressed(evt);
            }
        });

        txtIdproveedor.setEditable(false);

        jLabel34.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel34.setText("ID");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 738, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(37, 37, 37)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtRazonProvveedor, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE)
                            .addComponent(txtDireccionProveedor, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE)
                            .addComponent(txtTelefonoProveedor, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtRucProveedor)
                            .addComponent(txtNombresProveedor))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtIdproveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel34))
                        .addGap(18, 18, 18)
                        .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtRucProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel34))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtNombresProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtIdproveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtTelefonoProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtDireccionProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtRazonProvveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 227, Short.MAX_VALUE)
                .addGap(19, 19, 19))
        );

        jTabbedPane1.addTab("PROVEEDOR", jPanel4);

        jPanel5.setBackground(new java.awt.Color(204, 204, 204));

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel21.setText("CÓDIGO");

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel22.setText("DESCRIPCIÓN");

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel23.setText("CANTIDAD");

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel24.setText("PRECIO");

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel25.setText("PROVEEDOR");

        txtCodigoMedi.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCodigoMediKeyTyped(evt);
            }
        });

        txtDescriMedi.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtDescriMediKeyPressed(evt);
            }
        });

        txtCantidadMedi.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCantidadMediKeyTyped(evt);
            }
        });

        txtPrecioMedi.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPrecioMediKeyTyped(evt);
            }
        });

        tablaMedicamento.setBackground(new java.awt.Color(204, 204, 204));
        tablaMedicamento.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "CODIGO", "DESCRIPCION", "PROVEEDOR", "STOCK", "PRECIO"
            }
        ));
        tablaMedicamento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaMedicamentoMouseClicked(evt);
            }
        });
        jScrollPane6.setViewportView(tablaMedicamento);
        if (tablaMedicamento.getColumnModel().getColumnCount() > 0) {
            tablaMedicamento.getColumnModel().getColumn(0).setPreferredWidth(20);
        }

        btnAgregarMedi.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnAgregarMedi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/guardar.png"))); // NOI18N
        btnAgregarMedi.setText("AGREGAR");

        btnActualizarMedi.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnActualizarMedi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/actualizar.png"))); // NOI18N
        btnActualizarMedi.setText("ACTUALIZAR");
        btnActualizarMedi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarMediActionPerformed(evt);
            }
        });

        btnEliminarMedi.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnEliminarMedi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/delete.png"))); // NOI18N
        btnEliminarMedi.setText("ELIMINAR");

        btnNuevoMedi.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnNuevoMedi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/nuevo.png"))); // NOI18N
        btnNuevoMedi.setText("NUEVO");

        btnExcelMedi.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnExcelMedi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/excel1.png"))); // NOI18N
        btnExcelMedi.setText("EXCEL");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnExcelMedi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAgregarMedi)
                    .addComponent(btnEliminarMedi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnActualizarMedi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnNuevoMedi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(28, 28, 28))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregarMedi)
                    .addComponent(btnActualizarMedi))
                .addGap(18, 18, 18)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEliminarMedi)
                    .addComponent(btnNuevoMedi))
                .addGap(18, 18, 18)
                .addComponent(btnExcelMedi)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        txtIdMedi.setEditable(false);

        jLabel35.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel35.setText("ID");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane6)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel21)
                            .addComponent(jLabel22)
                            .addComponent(jLabel23)
                            .addComponent(jLabel24)
                            .addComponent(jLabel25))
                        .addGap(56, 56, 56)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtCodigoMedi)
                            .addComponent(txtDescriMedi)
                            .addComponent(txtCantidadMedi)
                            .addComponent(txtPrecioMedi)
                            .addComponent(comoProveedor, 0, 163, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtIdMedi, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel35))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                        .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(41, 41, 41))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel21)
                            .addComponent(txtCodigoMedi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel35))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel22)
                            .addComponent(txtDescriMedi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtIdMedi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel23)
                            .addComponent(txtCantidadMedi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel24)
                            .addComponent(txtPrecioMedi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel25)
                            .addComponent(comoProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(27, 27, 27)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(65, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("MEDICAMENTO", jPanel5);

        jPanel6.setBackground(new java.awt.Color(204, 204, 204));

        tablaVentas.setBackground(new java.awt.Color(204, 204, 204));
        tablaVentas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "PACIENTE", "VENDEDOR", "TOTAL"
            }
        ));
        jScrollPane7.setViewportView(tablaVentas);
        if (tablaVentas.getColumnModel().getColumnCount() > 0) {
            tablaVentas.getColumnModel().getColumn(0).setPreferredWidth(20);
        }

        btnPdfVenta.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnPdfVenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/PDF.png"))); // NOI18N
        btnPdfVenta.setText("PDF");
        btnPdfVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPdfVentaActionPerformed(evt);
            }
        });

        txtIdventa.setEditable(false);

        jLabel36.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel36.setText("ID");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 703, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(btnPdfVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel36)
                        .addGap(18, 18, 18)
                        .addComponent(txtIdventa, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(72, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPdfVenta)
                    .addComponent(txtIdventa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel36))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46))
        );

        jTabbedPane1.addTab("VENTAS", jPanel6);

        jPanel7.setBackground(new java.awt.Color(204, 204, 204));

        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel26.setText("RUC");

        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel27.setText("NOMBRE");

        jLabel28.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel28.setText("TELÉFONO");

        txtRucFarmacia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtRucFarmaciaKeyTyped(evt);
            }
        });

        txtNombreFarmacia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNombreFarmaciaKeyPressed(evt);
            }
        });

        txtTelefonoFarmacia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTelefonoFarmaciaKeyTyped(evt);
            }
        });

        jLabel29.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel29.setText("DIRECCIÓN");

        jLabel30.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel30.setText("RAZÓN SOCIAL");

        txtRazonSocialFarmacia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtRazonSocialFarmaciaKeyPressed(evt);
            }
        });

        btnActualizarFarmacia.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnActualizarFarmacia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/actualizar.png"))); // NOI18N
        btnActualizarFarmacia.setText("ACTUALIZAR");

        jLabel31.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel31.setText("INFORMACIÓN DE LA FARMACIA MARIANA");

        txtIdFarmacia.setEditable(false);

        jLabel38.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel38.setText("ID");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(308, 308, 308)
                .addComponent(btnActualizarFarmacia)
                .addGap(0, 324, Short.MAX_VALUE))
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel29)
                            .addComponent(txtDireccionFarmacia, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtRucFarmacia, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel26))
                                .addGap(66, 66, 66)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel7Layout.createSequentialGroup()
                                        .addComponent(jLabel27)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(txtNombreFarmacia, javax.swing.GroupLayout.DEFAULT_SIZE, 246, Short.MAX_VALUE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                                .addComponent(jLabel28)
                                .addGap(129, 129, 129))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel30)
                                .addComponent(txtRazonSocialFarmacia, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtTelefonoFarmacia, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(52, 52, 52))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel38)
                        .addGap(15, 15, 15)
                        .addComponent(txtIdFarmacia, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel31)
                .addGap(212, 212, 212))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel31)
                .addGap(11, 11, 11)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtIdFarmacia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel38))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26)
                    .addComponent(jLabel27)
                    .addComponent(jLabel28))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtRucFarmacia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNombreFarmacia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTelefonoFarmacia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 85, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel30)
                    .addComponent(jLabel29))
                .addGap(26, 26, 26)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDireccionFarmacia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtRazonSocialFarmacia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addComponent(btnActualizarFarmacia)
                .addGap(46, 46, 46))
        );

        jTabbedPane1.addTab("CONFIGURACION", jPanel7);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 150, 790, 450));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProveedorActionPerformed
        // TODO add your handling code here:
        //jTabbedPane1.setSelectedIndex(2);
    }//GEN-LAST:event_btnProveedorActionPerformed

    private void txtPrecioVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecioVentaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrecioVentaActionPerformed

    private void btnnuevoPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnuevoPacienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnnuevoPacienteActionPerformed

    private void btnActualizarMediActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarMediActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnActualizarMediActionPerformed

    private void btnPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPacienteActionPerformed

        //jTabbedPane1.setSelectedIndex(1);
    }//GEN-LAST:event_btnPacienteActionPerformed

    private void tablaPacienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaPacienteMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_tablaPacienteMouseClicked

    private void tablaProveedorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaProveedorMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_tablaProveedorMouseClicked

    private void tablaMedicamentoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaMedicamentoMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_tablaMedicamentoMouseClicked

    private void txtCodigoVentaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodigoVentaKeyPressed
        // TODO add your handling code here:

    }//GEN-LAST:event_txtCodigoVentaKeyPressed

    private void txtCantidadVentaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCantidadVentaKeyPressed
        // TODO add your handling code here:

    }//GEN-LAST:event_txtCantidadVentaKeyPressed

    private void txtDniVentaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDniVentaKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDniVentaKeyPressed

    private void tablaNuevaVentaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaNuevaVentaMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tablaNuevaVentaMouseClicked

    private void btnEliminarVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarVentaActionPerformed
        // TODO add your handling code here:        
    }//GEN-LAST:event_btnEliminarVentaActionPerformed

    private void btnImprimirVEntaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImprimirVEntaActionPerformed
        // TODO add your handling code here:       
    }//GEN-LAST:event_btnImprimirVEntaActionPerformed

    private void btnPdfVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPdfVentaActionPerformed
        // TODO add your handling code here:        
    }//GEN-LAST:event_btnPdfVentaActionPerformed

    private void txtCodigoVentaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodigoVentaKeyTyped
        // TODO add your handling code here:
        vali.numberKeyPress(evt);
    }//GEN-LAST:event_txtCodigoVentaKeyTyped

    private void txtDecripcionVentaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDecripcionVentaKeyPressed
        // TODO add your handling code here:
        vali.textKeyPress(evt);
    }//GEN-LAST:event_txtDecripcionVentaKeyPressed

    private void txtCantidadVentaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCantidadVentaKeyTyped
        // TODO add your handling code here:
        vali.numberKeyPress(evt);
    }//GEN-LAST:event_txtCantidadVentaKeyTyped

    private void txtStockDisponVentaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtStockDisponVentaKeyTyped
        // TODO add your handling code here:
        vali.numberKeyPress(evt);
    }//GEN-LAST:event_txtStockDisponVentaKeyTyped

    private void txtDniVentaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDniVentaKeyTyped
        // TODO add your handling code here:
        vali.numberKeyPress(evt);
    }//GEN-LAST:event_txtDniVentaKeyTyped

    private void txtNombrespacienteVentaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombrespacienteVentaKeyPressed
        // TODO add your handling code here:
        vali.textKeyPress(evt);
    }//GEN-LAST:event_txtNombrespacienteVentaKeyPressed

    private void txtTelefonopacienteVentaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefonopacienteVentaKeyTyped
        // TODO add your handling code here:
        vali.numberKeyPress(evt);
    }//GEN-LAST:event_txtTelefonopacienteVentaKeyTyped

    private void txtSexoPacienteVentaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSexoPacienteVentaKeyPressed
        // TODO add your handling code here:
        vali.textKeyPress(evt);
    }//GEN-LAST:event_txtSexoPacienteVentaKeyPressed

    private void txtDniPacienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDniPacienteKeyTyped
        // TODO add your handling code here:
        vali.numberKeyPress(evt);
    }//GEN-LAST:event_txtDniPacienteKeyTyped

    private void txtNombresPacienteKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombresPacienteKeyPressed
        // TODO add your handling code here:
        vali.textKeyPress(evt);
    }//GEN-LAST:event_txtNombresPacienteKeyPressed

    private void txttelefonoPacienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txttelefonoPacienteKeyTyped
        // TODO add your handling code here:
        vali.numberKeyPress(evt);
    }//GEN-LAST:event_txttelefonoPacienteKeyTyped

    private void txtRucProveedorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRucProveedorKeyTyped
        // TODO add your handling code here:
        vali.numberKeyPress(evt);
    }//GEN-LAST:event_txtRucProveedorKeyTyped

    private void txtNombresProveedorKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombresProveedorKeyPressed
        // TODO add your handling code here:
        vali.textKeyPress(evt);
    }//GEN-LAST:event_txtNombresProveedorKeyPressed

    private void txtTelefonoProveedorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefonoProveedorKeyTyped
        // TODO add your handling code here:
        vali.numberKeyPress(evt);
    }//GEN-LAST:event_txtTelefonoProveedorKeyTyped

    private void txtRazonProvveedorKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRazonProvveedorKeyPressed
        // TODO add your handling code here:
        vali.textKeyPress(evt);
    }//GEN-LAST:event_txtRazonProvveedorKeyPressed

    private void txtCodigoMediKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodigoMediKeyTyped
        // TODO add your handling code here:
        vali.numberKeyPress(evt);
    }//GEN-LAST:event_txtCodigoMediKeyTyped

    private void txtDescriMediKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDescriMediKeyPressed
        // TODO add your handling code here:
        vali.textKeyPress(evt);
    }//GEN-LAST:event_txtDescriMediKeyPressed

    private void txtCantidadMediKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCantidadMediKeyTyped
        // TODO add your handling code here:
        vali.numberKeyPress(evt);
    }//GEN-LAST:event_txtCantidadMediKeyTyped

    private void txtPrecioMediKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrecioMediKeyTyped
        // TODO add your handling code here:
        vali.numberDecimalKeyPress(evt, txtPrecioMedi);
    }//GEN-LAST:event_txtPrecioMediKeyTyped

    private void txtRucFarmaciaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRucFarmaciaKeyTyped
        // TODO add your handling code here:
        vali.numberKeyPress(evt);
    }//GEN-LAST:event_txtRucFarmaciaKeyTyped

    private void txtNombreFarmaciaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreFarmaciaKeyPressed
        // TODO add your handling code here:
        vali.textKeyPress(evt);
    }//GEN-LAST:event_txtNombreFarmaciaKeyPressed

    private void txtTelefonoFarmaciaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefonoFarmaciaKeyTyped
        // TODO add your handling code here:
        vali.numberKeyPress(evt);
    }//GEN-LAST:event_txtTelefonoFarmaciaKeyTyped

    private void txtRazonSocialFarmaciaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRazonSocialFarmaciaKeyPressed
        // TODO add your handling code here:
        vali.textKeyPress(evt);
    }//GEN-LAST:event_txtRazonSocialFarmaciaKeyPressed

    private void btnVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVentasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnVentasActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnActualizarFarmacia;
    public javax.swing.JButton btnActualizarMedi;
    public javax.swing.JButton btnActualizarProveedor;
    public javax.swing.JButton btnActualizarpaciente;
    public javax.swing.JButton btnAgregarMedi;
    public javax.swing.JButton btnConfiguraacion;
    public javax.swing.JButton btnElimiarPRoveedor;
    public javax.swing.JButton btnEliminarMedi;
    public javax.swing.JButton btnEliminarPaciente;
    public javax.swing.JButton btnEliminarVenta;
    public javax.swing.JButton btnExcelMedi;
    public javax.swing.JButton btnGuardarPaciente;
    public javax.swing.JButton btnGuardarProveedor;
    public javax.swing.JButton btnImprimirVEnta;
    public javax.swing.JButton btnMedicament;
    public javax.swing.JButton btnNuevaVenta;
    public javax.swing.JButton btnNuevoMedi;
    public javax.swing.JButton btnNuevoProveedor;
    public javax.swing.JButton btnPaciente;
    public javax.swing.JButton btnPdfVenta;
    public javax.swing.JButton btnProveedor;
    public javax.swing.JButton btnVentas;
    public javax.swing.JButton btnnuevoPaciente;
    public javax.swing.JComboBox<String> comboSexoPaciente;
    public javax.swing.JComboBox<String> comoProveedor;
    public javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
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
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    public javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable5;
    public javax.swing.JLabel labelTotal;
    public javax.swing.JLabel labelVendedor;
    public javax.swing.JTable tablaMedicamento;
    public javax.swing.JTable tablaNuevaVenta;
    public javax.swing.JTable tablaPaciente;
    public javax.swing.JTable tablaProveedor;
    public javax.swing.JTable tablaVentas;
    public javax.swing.JTextField txtCantidadMedi;
    public javax.swing.JTextField txtCantidadVenta;
    public javax.swing.JTextField txtCodigoMedi;
    public javax.swing.JTextField txtCodigoVenta;
    public javax.swing.JTextField txtDecripcionVenta;
    public javax.swing.JTextField txtDescriMedi;
    public javax.swing.JTextField txtDirecciPacienVenta;
    public javax.swing.JTextField txtDireccionFarmacia;
    public javax.swing.JTextField txtDireccionPaciente;
    public javax.swing.JTextField txtDireccionProveedor;
    private javax.swing.JLabel txtDni;
    public javax.swing.JTextField txtDniPaciente;
    public javax.swing.JTextField txtDniVenta;
    public javax.swing.JTextField txtIdFarmacia;
    public javax.swing.JTextField txtIdMedi;
    public javax.swing.JTextField txtIdMediVenta;
    public javax.swing.JTextField txtIdproveedor;
    public javax.swing.JTextField txtIdventa;
    public javax.swing.JTextField txtNombreFarmacia;
    public javax.swing.JTextField txtNombresPaciente;
    public javax.swing.JTextField txtNombresProveedor;
    private javax.swing.JLabel txtNombresVenta;
    public javax.swing.JTextField txtNombrespacienteVenta;
    public javax.swing.JTextField txtPrecioMedi;
    public javax.swing.JTextField txtPrecioVenta;
    public javax.swing.JTextField txtRazonProvveedor;
    public javax.swing.JTextField txtRazonSocialFarmacia;
    public javax.swing.JTextField txtRucFarmacia;
    public javax.swing.JTextField txtRucProveedor;
    public javax.swing.JTextField txtSexoPacienteVenta;
    public javax.swing.JTextField txtStockDisponVenta;
    public javax.swing.JTextField txtTelefonoFarmacia;
    public javax.swing.JTextField txtTelefonoProveedor;
    public javax.swing.JTextField txtTelefonopacienteVenta;
    public javax.swing.JTextField txtidPaciente;
    public javax.swing.JTextField txttelefonoPaciente;
    // End of variables declaration//GEN-END:variables
        public void ListarConfig() {
        con = conDAO.BuscarDatos();
        txtIdFarmacia.setText("" + con.getId());
        txtRucFarmacia.setText("" + con.getRuc());
        txtNombreFarmacia.setText("" + con.getNombre());
        txtTelefonoFarmacia.setText("" + con.getTelefono());
        txtDireccionFarmacia.setText("" + con.getDireccion());
        txtRazonSocialFarmacia.setText("" + con.getRazon());
    }
}
