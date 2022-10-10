
package banco2;
//bibliotecas que foram usadas
import java.awt.CardLayout;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class Main extends javax.swing.JFrame {
    ArrayList <Conta> listaContas;//lista de contas do tipo Conta
    public String contaHolder;//variavel auxiliar para segurar dados da conta acessada
        public void LoadTableDEV(){//funcao para dar load na tabela
        DefaultTableModel modelo = new DefaultTableModel(new Object[]{"Conta","Password","Saldo"},0);
            for(int i=0;i<listaContas.size();i++){
                    Object linha[] = new Object[]{listaContas.get(i).getNumConta(),
                                                  listaContas.get(i).getPassword(),
                                                  listaContas.get(i).getSaldo()};
            modelo.addRow(linha);
        }
            Table_DEV.setModel(modelo);
    }
    
    public void AddFunc(Conta conta){//funcao que adiciona elementos na lista do tipo Conta
        listaContas.add(conta);
    }
    public void RemoveFunc(Conta conta){//funcao que remove elementos da lista
        listaContas.remove(conta);
    }
            
 
    public Main() {
        initComponents();
        listaContas = new ArrayList();//inicializacao da lista
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Main_Layout = new javax.swing.JPanel();
        Panel_BemVindo = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        B_BemVindo_Entrar = new javax.swing.JButton();
        B_BemVindo_Registrar = new javax.swing.JButton();
        B_BemVindo_DEV = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        Panel_Registrar = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Text_Get_Nome = new javax.swing.JTextField();
        Text_Get_RG = new javax.swing.JTextField();
        Text_Get_CPF = new javax.swing.JTextField();
        GetPasswordField = new javax.swing.JPasswordField();
        B_Cadastrar_Cadastrar = new javax.swing.JButton();
        B_Registrar_Voltar = new javax.swing.JButton();
        Panel_DEV = new javax.swing.JPanel();
        B_DEV_Voltar = new javax.swing.JButton();
        B_DEV_Carregar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Table_DEV = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        Panel_Login = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        Text_Login_Password = new javax.swing.JPasswordField();
        Text_Login_Conta = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        B_Login_Entrar = new javax.swing.JButton();
        B_Login_Voltar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        Panel_User = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        Text_User_Greetings = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        Text_User_Saldo = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        B_User_Depositar = new javax.swing.JButton();
        B_User_Sacar = new javax.swing.JButton();
        B_User_Voltar = new javax.swing.JButton();
        B_User_ExcluirC = new javax.swing.JButton();
        B_User_Transferir = new javax.swing.JButton();
        Panel_Depositar = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        Text_Depositar = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        B_Depositar_Depositar = new javax.swing.JButton();
        Panel_Sacar = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        Text_Sacar = new javax.swing.JTextField();
        B_Sacar_Sacar = new javax.swing.JButton();
        Panel_Transferencia = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        Text_Transferencia_Fundos = new javax.swing.JTextField();
        Text_Transferencia_Destino = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        B_Transferencia_Transferir = new javax.swing.JButton();
        B_Transferencia_Cancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        Main_Layout.setLayout(new java.awt.CardLayout());

        Panel_BemVindo.setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(51, 153, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 119, Short.MAX_VALUE)
        );

        B_BemVindo_Entrar.setText("Entrar");
        B_BemVindo_Entrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_BemVindo_EntrarActionPerformed(evt);
            }
        });

        B_BemVindo_Registrar.setText("Registrar");
        B_BemVindo_Registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_BemVindo_RegistrarActionPerformed(evt);
            }
        });

        B_BemVindo_DEV.setText("DEV");
        B_BemVindo_DEV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_BemVindo_DEVActionPerformed(evt);
            }
        });

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/banco2/a0f053bd-5f2a-413b-b503-afbb08605537_200x200.png"))); // NOI18N
        jLabel9.setAlignmentX(1.0F);
        jLabel9.setAlignmentY(100.0F);

        javax.swing.GroupLayout Panel_BemVindoLayout = new javax.swing.GroupLayout(Panel_BemVindo);
        Panel_BemVindo.setLayout(Panel_BemVindoLayout);
        Panel_BemVindoLayout.setHorizontalGroup(
            Panel_BemVindoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(Panel_BemVindoLayout.createSequentialGroup()
                .addGap(187, 187, 187)
                .addGroup(Panel_BemVindoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(B_BemVindo_Registrar, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B_BemVindo_DEV, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B_BemVindo_Entrar, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(Panel_BemVindoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 445, Short.MAX_VALUE)
                .addContainerGap())
        );
        Panel_BemVindoLayout.setVerticalGroup(
            Panel_BemVindoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_BemVindoLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 112, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addGap(69, 69, 69)
                .addComponent(B_BemVindo_Entrar)
                .addGap(28, 28, 28)
                .addComponent(B_BemVindo_Registrar)
                .addGap(28, 28, 28)
                .addComponent(B_BemVindo_DEV)
                .addGap(63, 63, 63))
        );

        Main_Layout.add(Panel_BemVindo, "BemVindo");

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jPanel3.setBackground(new java.awt.Color(51, 153, 255));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 119, Short.MAX_VALUE)
        );

        jLabel2.setText("Nome");

        jLabel3.setText("Password");

        jLabel4.setText("RG");

        jLabel5.setText("CPF");

        Text_Get_Nome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Text_Get_NomeActionPerformed(evt);
            }
        });

        B_Cadastrar_Cadastrar.setText("Cadastrar");
        B_Cadastrar_Cadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_Cadastrar_CadastrarActionPerformed(evt);
            }
        });

        B_Registrar_Voltar.setText("Voltar");
        B_Registrar_Voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_Registrar_VoltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel3))
                        .addGap(54, 54, 54)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Text_Get_CPF, javax.swing.GroupLayout.DEFAULT_SIZE, 227, Short.MAX_VALUE)
                            .addComponent(Text_Get_RG, javax.swing.GroupLayout.DEFAULT_SIZE, 227, Short.MAX_VALUE)
                            .addComponent(Text_Get_Nome)
                            .addComponent(GetPasswordField)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(184, 184, 184)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(B_Cadastrar_Cadastrar, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
                            .addComponent(B_Registrar_Voltar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(103, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(Text_Get_Nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(61, 61, 61)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(GetPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(Text_Get_RG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(58, 58, 58)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Text_Get_CPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(76, 76, 76)
                .addComponent(B_Cadastrar_Cadastrar)
                .addGap(29, 29, 29)
                .addComponent(B_Registrar_Voltar)
                .addGap(0, 83, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout Panel_RegistrarLayout = new javax.swing.GroupLayout(Panel_Registrar);
        Panel_Registrar.setLayout(Panel_RegistrarLayout);
        Panel_RegistrarLayout.setHorizontalGroup(
            Panel_RegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        Panel_RegistrarLayout.setVerticalGroup(
            Panel_RegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        Main_Layout.add(Panel_Registrar, "Registrar");

        Panel_DEV.setBackground(new java.awt.Color(255, 255, 255));

        B_DEV_Voltar.setText("Voltar");
        B_DEV_Voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_DEV_VoltarActionPerformed(evt);
            }
        });

        B_DEV_Carregar.setText("Carregar");
        B_DEV_Carregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_DEV_CarregarActionPerformed(evt);
            }
        });

        Table_DEV.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Conta", "Password", "Saldo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(Table_DEV);

        jPanel4.setBackground(new java.awt.Color(51, 153, 255));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 119, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout Panel_DEVLayout = new javax.swing.GroupLayout(Panel_DEV);
        Panel_DEV.setLayout(Panel_DEVLayout);
        Panel_DEVLayout.setHorizontalGroup(
            Panel_DEVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_DEVLayout.createSequentialGroup()
                .addGap(181, 181, 181)
                .addGroup(Panel_DEVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(B_DEV_Voltar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(B_DEV_Carregar, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 469, Short.MAX_VALUE)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        Panel_DEVLayout.setVerticalGroup(
            Panel_DEVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel_DEVLayout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(109, 109, 109)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 152, Short.MAX_VALUE)
                .addComponent(B_DEV_Carregar)
                .addGap(34, 34, 34)
                .addComponent(B_DEV_Voltar)
                .addGap(56, 56, 56))
        );

        Main_Layout.add(Panel_DEV, "DEV");

        Panel_Login.setBackground(new java.awt.Color(255, 255, 255));

        jPanel5.setBackground(new java.awt.Color(51, 153, 255));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 119, Short.MAX_VALUE)
        );

        Text_Login_Password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Text_Login_PasswordActionPerformed(evt);
            }
        });

        Text_Login_Conta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Text_Login_ContaActionPerformed(evt);
            }
        });

        jLabel6.setText("Conta:");

        jLabel7.setText("Password:");

        B_Login_Entrar.setText("Entrar");
        B_Login_Entrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_Login_EntrarActionPerformed(evt);
            }
        });

        B_Login_Voltar.setText("Voltar");
        B_Login_Voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_Login_VoltarActionPerformed(evt);
            }
        });

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/banco2/a0f053bd-5f2a-413b-b503-afbb08605537_200x200.png"))); // NOI18N
        jLabel8.setAlignmentX(1.0F);
        jLabel8.setAlignmentY(100.0F);

        javax.swing.GroupLayout Panel_LoginLayout = new javax.swing.GroupLayout(Panel_Login);
        Panel_Login.setLayout(Panel_LoginLayout);
        Panel_LoginLayout.setHorizontalGroup(
            Panel_LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(Panel_LoginLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(Panel_LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(B_Login_Voltar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B_Login_Entrar, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(Panel_LoginLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(Panel_LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(59, 59, 59)
                .addGroup(Panel_LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Text_Login_Password, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
                    .addComponent(Text_Login_Conta))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 469, Short.MAX_VALUE)
        );
        Panel_LoginLayout.setVerticalGroup(
            Panel_LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_LoginLayout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 122, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addGap(36, 36, 36)
                .addGroup(Panel_LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Text_Login_Conta, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(Panel_LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(Text_Login_Password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addComponent(B_Login_Entrar)
                .addGap(18, 18, 18)
                .addComponent(B_Login_Voltar)
                .addGap(45, 45, 45))
        );

        Main_Layout.add(Panel_Login, "Entrar");

        Panel_User.setBackground(new java.awt.Color(255, 255, 255));

        jPanel6.setBackground(new java.awt.Color(51, 153, 255));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 119, Short.MAX_VALUE)
        );

        Text_User_Greetings.setEditable(false);
        Text_User_Greetings.setBackground(new java.awt.Color(255, 255, 255));
        Text_User_Greetings.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        Text_User_Greetings.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Text_User_GreetingsActionPerformed(evt);
            }
        });

        jLabel1.setText("Saldo atual:");

        Text_User_Saldo.setEditable(false);
        Text_User_Saldo.setBackground(new java.awt.Color(255, 255, 255));
        Text_User_Saldo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Text_User_SaldoActionPerformed(evt);
            }
        });

        jLabel10.setText("Reais");

        B_User_Depositar.setText("Depositar");
        B_User_Depositar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_User_DepositarActionPerformed(evt);
            }
        });

        B_User_Sacar.setText("Sacar");
        B_User_Sacar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_User_SacarActionPerformed(evt);
            }
        });

        B_User_Voltar.setText("Voltar");
        B_User_Voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_User_VoltarActionPerformed(evt);
            }
        });

        B_User_ExcluirC.setText("Excluir Conta");
        B_User_ExcluirC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_User_ExcluirCActionPerformed(evt);
            }
        });

        B_User_Transferir.setText("Transferir");
        B_User_Transferir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_User_TransferirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Panel_UserLayout = new javax.swing.GroupLayout(Panel_User);
        Panel_User.setLayout(Panel_UserLayout);
        Panel_UserLayout.setHorizontalGroup(
            Panel_UserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(Panel_UserLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(77, 77, 77)
                .addGroup(Panel_UserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(Text_User_Greetings, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
                    .addComponent(Text_User_Saldo))
                .addGap(40, 40, 40)
                .addComponent(jLabel10)
                .addContainerGap(94, Short.MAX_VALUE))
            .addGroup(Panel_UserLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(Panel_UserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(B_User_ExcluirC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(B_User_Voltar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(B_User_Sacar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(B_User_Depositar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(B_User_Transferir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Panel_UserLayout.setVerticalGroup(
            Panel_UserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_UserLayout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70)
                .addComponent(Text_User_Greetings, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(72, 72, 72)
                .addGroup(Panel_UserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Text_User_Saldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(84, 84, 84)
                .addComponent(B_User_Depositar)
                .addGap(32, 32, 32)
                .addComponent(B_User_Sacar)
                .addGap(32, 32, 32)
                .addComponent(B_User_Transferir)
                .addGap(32, 32, 32)
                .addComponent(B_User_ExcluirC)
                .addGap(32, 32, 32)
                .addComponent(B_User_Voltar)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        Main_Layout.add(Panel_User, "User");

        Panel_Depositar.setBackground(new java.awt.Color(255, 255, 255));

        jPanel8.setBackground(new java.awt.Color(51, 153, 255));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 119, Short.MAX_VALUE)
        );

        jLabel11.setText("Valor a ser depositado:");

        jLabel12.setText("Reais");

        B_Depositar_Depositar.setText("Depositar");
        B_Depositar_Depositar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_Depositar_DepositarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Panel_DepositarLayout = new javax.swing.GroupLayout(Panel_Depositar);
        Panel_Depositar.setLayout(Panel_DepositarLayout);
        Panel_DepositarLayout.setHorizontalGroup(
            Panel_DepositarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(Panel_DepositarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addGap(34, 34, 34)
                .addGroup(Panel_DepositarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(B_Depositar_Depositar, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
                    .addComponent(Text_Depositar))
                .addGap(35, 35, 35)
                .addComponent(jLabel12)
                .addContainerGap(109, Short.MAX_VALUE))
        );
        Panel_DepositarLayout.setVerticalGroup(
            Panel_DepositarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_DepositarLayout.createSequentialGroup()
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(234, 234, 234)
                .addGroup(Panel_DepositarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Text_Depositar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(130, 130, 130)
                .addComponent(B_Depositar_Depositar)
                .addGap(0, 151, Short.MAX_VALUE))
        );

        Main_Layout.add(Panel_Depositar, "Depositar");

        Panel_Sacar.setBackground(new java.awt.Color(255, 255, 255));

        jPanel7.setBackground(new java.awt.Color(51, 153, 255));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 119, Short.MAX_VALUE)
        );

        jLabel13.setText("Valor a ser sacado:");

        jLabel14.setText("Reais");

        B_Sacar_Sacar.setText("Sacar");
        B_Sacar_Sacar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_Sacar_SacarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Panel_SacarLayout = new javax.swing.GroupLayout(Panel_Sacar);
        Panel_Sacar.setLayout(Panel_SacarLayout);
        Panel_SacarLayout.setHorizontalGroup(
            Panel_SacarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(Panel_SacarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Panel_SacarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(B_Sacar_Sacar, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(Panel_SacarLayout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addGap(18, 18, 18)
                        .addComponent(Text_Sacar, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addComponent(jLabel14)
                .addGap(84, 84, 84))
        );
        Panel_SacarLayout.setVerticalGroup(
            Panel_SacarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_SacarLayout.createSequentialGroup()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(202, 202, 202)
                .addGroup(Panel_SacarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Text_Sacar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 184, Short.MAX_VALUE)
                .addComponent(B_Sacar_Sacar)
                .addGap(131, 131, 131))
        );

        Main_Layout.add(Panel_Sacar, "Sacar");

        Panel_Transferencia.setBackground(new java.awt.Color(255, 255, 255));

        jPanel10.setBackground(new java.awt.Color(51, 153, 255));

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 119, Short.MAX_VALUE)
        );

        jLabel15.setText("Total a ser transferido:");

        jLabel16.setText("Conta beneficiaria: ");

        jLabel17.setText("Reais");

        B_Transferencia_Transferir.setText("Transferir");
        B_Transferencia_Transferir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_Transferencia_TransferirActionPerformed(evt);
            }
        });

        B_Transferencia_Cancelar.setText("Cancelar");
        B_Transferencia_Cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_Transferencia_CancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Panel_TransferenciaLayout = new javax.swing.GroupLayout(Panel_Transferencia);
        Panel_Transferencia.setLayout(Panel_TransferenciaLayout);
        Panel_TransferenciaLayout.setHorizontalGroup(
            Panel_TransferenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(Panel_TransferenciaLayout.createSequentialGroup()
                .addGroup(Panel_TransferenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel_TransferenciaLayout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(Panel_TransferenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(41, 41, 41)
                        .addGroup(Panel_TransferenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Text_Transferencia_Fundos, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Text_Transferencia_Destino, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(55, 55, 55)
                        .addComponent(jLabel17))
                    .addGroup(Panel_TransferenciaLayout.createSequentialGroup()
                        .addGap(176, 176, 176)
                        .addGroup(Panel_TransferenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(B_Transferencia_Cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(B_Transferencia_Transferir, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        Panel_TransferenciaLayout.setVerticalGroup(
            Panel_TransferenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_TransferenciaLayout.createSequentialGroup()
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(137, 137, 137)
                .addGroup(Panel_TransferenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(Text_Transferencia_Fundos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(Panel_TransferenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(Text_Transferencia_Destino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 204, Short.MAX_VALUE)
                .addComponent(B_Transferencia_Transferir)
                .addGap(32, 32, 32)
                .addComponent(B_Transferencia_Cancelar)
                .addGap(70, 70, 70))
        );

        Main_Layout.add(Panel_Transferencia, "Transferir");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Main_Layout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Main_Layout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
//botao que abre a opcao DEV (para ver a tabela)
    private void B_BemVindo_DEVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_BemVindo_DEVActionPerformed
        CardLayout cl = (CardLayout) Main_Layout.getLayout();
        cl.show(Main_Layout, "DEV");
    }//GEN-LAST:event_B_BemVindo_DEVActionPerformed
//botao para entrar na tela de login
    private void B_BemVindo_EntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_BemVindo_EntrarActionPerformed
        CardLayout cl = (CardLayout) Main_Layout.getLayout();
        cl.show(Main_Layout, "Entrar");
    }//GEN-LAST:event_B_BemVindo_EntrarActionPerformed
//botao que leva para a tela de registro do usuario
    private void B_BemVindo_RegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_BemVindo_RegistrarActionPerformed
        CardLayout cl = (CardLayout) Main_Layout.getLayout();
        cl.show(Main_Layout, "Registrar");
    }//GEN-LAST:event_B_BemVindo_RegistrarActionPerformed
//botao da tela de registro que retorna para a tela inicial do programa
    private void B_Registrar_VoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_Registrar_VoltarActionPerformed
        CardLayout cl = (CardLayout) Main_Layout.getLayout();
        cl.show(Main_Layout, "BemVindo");        
    }//GEN-LAST:event_B_Registrar_VoltarActionPerformed
//botao que confirma o cadastro do usuario na tela Cadastrar
    private void B_Cadastrar_CadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_Cadastrar_CadastrarActionPerformed
        Random random = new Random();//variavel para criar numeros aleatorios
        int numero = random.nextInt(9999999);//cria o numero da conta do usuario aleatoriamente
        String hold = Integer.toString(numero);//converte o int para string para poder ser trabalhado
        if(!Text_Get_Nome.getText().equals("") && !Text_Get_RG.getText().equals("") && !Text_Get_CPF.getText().equals("") && !GetPasswordField.getText().equals("")){
            //verifica se todos os campos do registro foram preenchidos (^)
            Conta conta = new Conta(hold,Text_Get_Nome.getText(),Text_Get_RG.getText(),Text_Get_CPF.getText(),0,GetPasswordField.getText());
            //variavel do tipo Conta segura os valores informados (^)
            AddFunc(conta);//chamada da funcao para adicionar na lista de contas
            //abaixo, informa que a conta foi criada, reseta os campos anteriormente preenchidos e retorna para a tela inicial
            JOptionPane.showMessageDialog(this, "Conta criada com sucesso!\n"+"Numero da conta: "+numero);
            CardLayout cl = (CardLayout) Main_Layout.getLayout();
            cl.show(Main_Layout, "BemVindo");  
            Text_Get_Nome.setText("");
            Text_Get_CPF.setText("");
            Text_Get_RG.setText("");
            GetPasswordField.setText("");
        }
        else{//mensagem de erro que pede o preenchimento de todos os campos do registro
            JOptionPane.showMessageDialog(this, "Preencha todos os campos!");
        }

    }//GEN-LAST:event_B_Cadastrar_CadastrarActionPerformed
//botao que da load nas informacoes da lista para mostrar na tebela na tela DEV
    private void B_DEV_CarregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_DEV_CarregarActionPerformed
        LoadTableDEV();
    }//GEN-LAST:event_B_DEV_CarregarActionPerformed
//botao na tela DEV que retorna ao menu principal
    private void B_DEV_VoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_DEV_VoltarActionPerformed
        CardLayout cl = (CardLayout) Main_Layout.getLayout();
        cl.show(Main_Layout, "BemVindo");
    }//GEN-LAST:event_B_DEV_VoltarActionPerformed
//campo de texto onde o usuario informa seu nome, no registro
    private void Text_Get_NomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Text_Get_NomeActionPerformed

    }//GEN-LAST:event_Text_Get_NomeActionPerformed
//campo de texto onde o usuario informa o numero de sua conta na tela Login
    private void Text_Login_ContaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Text_Login_ContaActionPerformed
        
    }//GEN-LAST:event_Text_Login_ContaActionPerformed
//botao da tela de Login que retorna para o menu principal
    private void B_Login_VoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_Login_VoltarActionPerformed
        CardLayout cl = (CardLayout) Main_Layout.getLayout();
        cl.show(Main_Layout, "BemVindo");
    }//GEN-LAST:event_B_Login_VoltarActionPerformed
//botao na tela de login que checa se o login e a senha estao corretos e abre a conta do usuario
    private void B_Login_EntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_Login_EntrarActionPerformed
        for(int i = 0; i < listaContas.size();i++){//esse "for" faz as checagens e abre o tela da conta do usuario
            if(Text_Login_Conta.getText().equals(listaContas.get(i).getNumConta())){
                if(Text_Login_Password.getText().equals(listaContas.get(i).getPassword())){
                    contaHolder = listaContas.get(i).getNumConta();
                    JOptionPane.showMessageDialog(this, listaContas.get(i).getNome()+" bem-vindo!");
                    CardLayout cl = (CardLayout) Main_Layout.getLayout();
                    cl.show(Main_Layout, "User");
                    Text_User_GreetingsActionPerformed(evt);
                    Text_User_SaldoActionPerformed(evt);
                    break;//esse break faz com que o for pare de checar outras contas caso ache a correta
                }
                else{//quando as infos nao estao corretas manda a mensagem de erro e reseta os campos preenchidos
                JOptionPane.showMessageDialog(this, "Conta e/ou Password inválidos!");
                Text_Login_Conta.setText("");
                Text_Login_Password.setText("");
                }  
            
                
            }
            
        }

    }//GEN-LAST:event_B_Login_EntrarActionPerformed
//caixa de texto onde o usario escreve seu password
    private void Text_Login_PasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Text_Login_PasswordActionPerformed

    }//GEN-LAST:event_Text_Login_PasswordActionPerformed
//caixa de texto para dar boas vindas ao usuario, ela pega o nome do usuario
    private void Text_User_GreetingsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Text_User_GreetingsActionPerformed
        for(int i = 0; i < listaContas.size();i++){
            if(contaHolder.equals(listaContas.get(i).getNumConta())){
                Text_User_Greetings.setText("Olá "+listaContas.get(i).getNome());
            }
        }
        
    }//GEN-LAST:event_Text_User_GreetingsActionPerformed
//caixa de texto que mostra o saldo atual do usuario
    private void Text_User_SaldoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Text_User_SaldoActionPerformed
        for(int i = 0; i < listaContas.size();i++){
             String temp = Double.toString(listaContas.get(i).getSaldo());//converte o double para String para melhor manipulacao dos dados    
                if(contaHolder.equals(listaContas.get(i).getNumConta())){
                    Text_User_Saldo.setText(temp);
                }    
        }
    }//GEN-LAST:event_Text_User_SaldoActionPerformed
//botao que leva para a tela de transferencia de fundos, esta detro da tela User
    private void B_User_TransferirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_User_TransferirActionPerformed
        CardLayout cl = (CardLayout) Main_Layout.getLayout();
        cl.show(Main_Layout, "Transferir");
    }//GEN-LAST:event_B_User_TransferirActionPerformed
//botao que leva para a tela onde eh possivel fazer depositos, esta dentro da tela User
    private void B_User_DepositarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_User_DepositarActionPerformed
        CardLayout cl = (CardLayout) Main_Layout.getLayout();
        cl.show(Main_Layout, "Depositar");
    }//GEN-LAST:event_B_User_DepositarActionPerformed
//botao que traz da tela User para a tela de login, tambem reseta os campos que antes foram preenchidos
    private void B_User_VoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_User_VoltarActionPerformed
        CardLayout cl = (CardLayout) Main_Layout.getLayout();
        Text_Login_Conta.setText("");
        Text_Login_Password.setText("");
        cl.show(Main_Layout, "Entrar");
    }//GEN-LAST:event_B_User_VoltarActionPerformed
//botao que exclui a conta do usuario
    private void B_User_ExcluirCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_User_ExcluirCActionPerformed
        for(int i = 0; i < listaContas.size();i++){
            Conta conta = listaContas.get(i);
            if(contaHolder.equals(listaContas.get(i).getNumConta())){
                listaContas.remove(conta);//chama a funcao de remover contas
            }
         //uma vez excluida a conta, retorna para a tela de login   
        JOptionPane.showMessageDialog(this, "Sua conta foi excluída com sucesso.");
        Text_Login_Conta.setText("");
        Text_Login_Password.setText("");
        CardLayout cl = (CardLayout) Main_Layout.getLayout();
        cl.show(Main_Layout, "Entrar");
        
        }
    }//GEN-LAST:event_B_User_ExcluirCActionPerformed
//bota dentro da tela depositar para confirmar a acao de deposito
    private void B_Depositar_DepositarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_Depositar_DepositarActionPerformed
        double temp = Double.valueOf(Text_Depositar.getText());//converte a String (do campo texto onde o usuario escreve o valor) para double
        for(int i = 0; i < listaContas.size();i++){
            if(contaHolder.equals(listaContas.get(i).getNumConta())){
                listaContas.get(i).setSaldo(listaContas.get(i).getSaldo()+temp);//soma o valor depositado ao saldo anterior
                Text_User_SaldoActionPerformed(evt);//atualiza o valor na tela User
                //volta para a tela user
                JOptionPane.showMessageDialog(this, "Depósito realizado com sucesso!");
                CardLayout cl = (CardLayout) Main_Layout.getLayout();
                cl.show(Main_Layout, "User");
            }
        }
    }//GEN-LAST:event_B_Depositar_DepositarActionPerformed
//bota dentro da tela sacar para confirmar a acao de saque
    private void B_Sacar_SacarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_Sacar_SacarActionPerformed
        for(int i = 0; i < listaContas.size();i++){
            double temp = Double.valueOf((Text_Sacar.getText()));//converte a String (do campo texto onde o usuario escreve o valor) para double
            if(contaHolder.equals(listaContas.get(i).getNumConta())){
                if(temp <= listaContas.get(i).getSaldo()){//checa se o usuario possui fundos para o saque
                    listaContas.get(i).setSaldo(listaContas.get(i).getSaldo()-temp);//subtrai o valor do saldo da conta do usuario
                    Text_User_SaldoActionPerformed(evt);//atualiza o valor mostrado na tela user
                    //volta para a tela user
                    JOptionPane.showMessageDialog(this, "Saque realizado com sucesso!");
                    CardLayout cl = (CardLayout) Main_Layout.getLayout();
                    cl.show(Main_Layout, "User");
                    Text_Sacar.setText("");
                }
                else{//erro ao nao ter fundos suficientes, e volta para a tela user
                    JOptionPane.showMessageDialog(this, "Fundos insuficientes.");
                    CardLayout cl = (CardLayout) Main_Layout.getLayout();
                    cl.show(Main_Layout, "User");
                    Text_Sacar.setText("");
                }

            }
        }
    }//GEN-LAST:event_B_Sacar_SacarActionPerformed
//botao que leva o usuario para a tela sacar
    private void B_User_SacarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_User_SacarActionPerformed
    CardLayout cl = (CardLayout) Main_Layout.getLayout();
    cl.show(Main_Layout, "Sacar");
    }//GEN-LAST:event_B_User_SacarActionPerformed
//botao que cancela a transferencia, volta para a tela anterior e limpa os campos disponiveis para preenchimento
    private void B_Transferencia_CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_Transferencia_CancelarActionPerformed
    CardLayout cl = (CardLayout) Main_Layout.getLayout();
    Text_Transferencia_Fundos.setText("");
    Text_Transferencia_Destino.setText("");
    cl.show(Main_Layout, "User");
    }//GEN-LAST:event_B_Transferencia_CancelarActionPerformed
//botao que realiza a transferencia na tela transferencia
    private void B_Transferencia_TransferirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_Transferencia_TransferirActionPerformed
        for(int i = 0; i < listaContas.size();i++){
            double temp = Double.valueOf((Text_Transferencia_Fundos.getText()));//converte o texto para double para poder ser trabalhado
                if(contaHolder.equals(listaContas.get(i).getNumConta())){
                    for(int j = 0; i < listaContas.size();j++){
                        if(Text_Transferencia_Destino.getText().equals(listaContas.get(j).getNumConta())){
                            if(temp <= listaContas.get(i).getSaldo()){//verifica os fundos disponiveis
                            listaContas.get(i).setSaldo(listaContas.get(i).getSaldo()-temp);//subtrai da conta que esta mandando
                            listaContas.get(j).setSaldo(listaContas.get(j).getSaldo()+temp);//adiciona na conta q esta recebendo
                            //abaixo, atualiza o valor na tela user, volta para a tela user e reseta os campos anteriormente preenchidos
                            Text_User_SaldoActionPerformed(evt);
                            JOptionPane.showMessageDialog(this, "Transferência realizada com sucesso!");
                            CardLayout cl = (CardLayout) Main_Layout.getLayout();
                            cl.show(Main_Layout, "User");
                            Text_Transferencia_Destino.setText("");
                            Text_Transferencia_Fundos.setText("");
                        }
                            else{//erro ao nao ter fundos o suficiente
                                JOptionPane.showMessageDialog(this, "Fundos insuficientes.");
                                CardLayout cl = (CardLayout) Main_Layout.getLayout();
                                cl.show(Main_Layout, "User");
                                Text_Transferencia_Destino.setText("");
                                Text_Transferencia_Fundos.setText("");
                            }
                        }

                    }


                }
            }   
    }//GEN-LAST:event_B_Transferencia_TransferirActionPerformed

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton B_BemVindo_DEV;
    private javax.swing.JButton B_BemVindo_Entrar;
    private javax.swing.JButton B_BemVindo_Registrar;
    private javax.swing.JButton B_Cadastrar_Cadastrar;
    private javax.swing.JButton B_DEV_Carregar;
    private javax.swing.JButton B_DEV_Voltar;
    private javax.swing.JButton B_Depositar_Depositar;
    private javax.swing.JButton B_Login_Entrar;
    private javax.swing.JButton B_Login_Voltar;
    private javax.swing.JButton B_Registrar_Voltar;
    private javax.swing.JButton B_Sacar_Sacar;
    private javax.swing.JButton B_Transferencia_Cancelar;
    private javax.swing.JButton B_Transferencia_Transferir;
    private javax.swing.JButton B_User_Depositar;
    private javax.swing.JButton B_User_ExcluirC;
    private javax.swing.JButton B_User_Sacar;
    private javax.swing.JButton B_User_Transferir;
    private javax.swing.JButton B_User_Voltar;
    private javax.swing.JPasswordField GetPasswordField;
    private javax.swing.JPanel Main_Layout;
    private javax.swing.JPanel Panel_BemVindo;
    private javax.swing.JPanel Panel_DEV;
    private javax.swing.JPanel Panel_Depositar;
    private javax.swing.JPanel Panel_Login;
    private javax.swing.JPanel Panel_Registrar;
    private javax.swing.JPanel Panel_Sacar;
    private javax.swing.JPanel Panel_Transferencia;
    private javax.swing.JPanel Panel_User;
    private javax.swing.JTable Table_DEV;
    private javax.swing.JTextField Text_Depositar;
    private javax.swing.JTextField Text_Get_CPF;
    private javax.swing.JTextField Text_Get_Nome;
    private javax.swing.JTextField Text_Get_RG;
    private javax.swing.JTextField Text_Login_Conta;
    private javax.swing.JPasswordField Text_Login_Password;
    private javax.swing.JTextField Text_Sacar;
    private javax.swing.JTextField Text_Transferencia_Destino;
    private javax.swing.JTextField Text_Transferencia_Fundos;
    private javax.swing.JTextField Text_User_Greetings;
    private javax.swing.JTextField Text_User_Saldo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
