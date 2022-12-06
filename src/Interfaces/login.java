package Interfaces;

import Functions.DbFunctions;

import java.awt.*;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.*;
import javax.swing.GroupLayout;

/**
 * @author Heitor & Felipe
 */

public class login {
    public login() {
        DbFunctions db = new DbFunctions();
        Connection conn = db.connect_to_db("InfoTech", "postgres", "lbj23kb24mj45");
        db.createTables(conn);
        initComponents();
    }


    private void showPassMouseClicked(MouseEvent e) {
        if(showPass.isSelected()) {
            senhaField.setEchoChar((char) 0);
        } else {
            senhaField.setEchoChar('\u2022');
        }
    }

    private void saveBttMouseClicked(MouseEvent e) {
        DbFunctions db = new DbFunctions();
        Connection conn = db.connect_to_db("InfoTech", "postgres", "lbj23kb24mj45");
        if(db.logar(conn, userField.getText(), String.valueOf(senhaField.getPassword()))) {
            if(db.getUsuarioTipo(conn, userField.getText()) == "Gerente") {
                ImageIcon imageIcon = new ImageIcon("src/icons/icon.png");
                JFrame dashboardGer = new JFrame();
                dashboardGer.pack();
                dashboardGer.setContentPane(new dashboardGerente().mainPanel);
                dashboardGer.setTitle("Dashboard gerente");
                dashboardGer.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
                dashboardGer.setSize(1500, 800);
                dashboardGer.setIconImage(imageIcon.getImage());
                dashboardGer.setVisible(true);
            } else  {
                ImageIcon imageIcon = new ImageIcon("src/icons/icon.png");
                JFrame dashboardFuncionario = new JFrame();
                dashboardFuncionario.pack();
                dashboardFuncionario.setContentPane(new dashboardFuncionario().mainPanelF);
                dashboardFuncionario.setTitle("Dashboard funcion\u00E1rio");
                dashboardFuncionario.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
                dashboardFuncionario.setSize(1500, 800);
                dashboardFuncionario.setIconImage(imageIcon.getImage());
                dashboardFuncionario.setVisible(true);
            }
        }
        else {
            JOptionPane.showMessageDialog(null, "Cadastro n\u00E3o encontrado");
        }
    }

    private void closeBttMouseClicked(MouseEvent e) {
        System.exit(0);
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        mainPanel = new JPanel();
        label1 = new JLabel();
        logo = new JLabel();
        label61 = new JLabel();
        userField = new JTextField();
        label62 = new JLabel();
        senhaField = new JPasswordField();
        showPass = new JCheckBox();
        saveBtt = new JButton();
        closeBtt = new JButton();

        //======== mainPanel ========
        {
            mainPanel.setBackground(new Color(0x21252f));

            //---- label1 ----
            label1.setIcon(new ImageIcon(getClass().getResource("/icons/imglateral.png")));

            //---- logo ----
            logo.setIcon(new ImageIcon(getClass().getResource("/icons/logo.png")));
            logo.setBackground(new Color(0x21252f));

            //---- label61 ----
            label61.setText("Usu\u00e1rio");
            label61.setForeground(Color.white);
            label61.setFont(new Font("Verdana", Font.PLAIN, 12));

            //---- userField ----
            userField.setBackground(new Color(0x21252f));
            userField.setForeground(Color.white);

            //---- label62 ----
            label62.setText("Senha");
            label62.setForeground(Color.white);
            label62.setFont(new Font("Verdana", Font.PLAIN, 12));

            //---- senhaField ----
            senhaField.setForeground(Color.white);
            senhaField.setBackground(new Color(0x21252f));

            //---- showPass ----
            showPass.setText("Mostrar senha");
            showPass.setForeground(Color.white);
            showPass.setBackground(new Color(0x21252f));
            showPass.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    showPassMouseClicked(e);
                }
            });

            //---- saveBtt ----
            saveBtt.setText("Entrar");
            saveBtt.setForeground(Color.white);
            saveBtt.setBackground(new Color(0x21252f));
            saveBtt.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    saveBttMouseClicked(e);
                }
            });

            //---- closeBtt ----
            closeBtt.setText("Sair");
            closeBtt.setForeground(Color.white);
            closeBtt.setBackground(new Color(0x21252f));
            closeBtt.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    closeBttMouseClicked(e);
                }
            });

            GroupLayout mainPanelLayout = new GroupLayout(mainPanel);
            mainPanel.setLayout(mainPanelLayout);
            mainPanelLayout.setHorizontalGroup(
                mainPanelLayout.createParallelGroup()
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addComponent(label1, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
                        .addGroup(mainPanelLayout.createParallelGroup()
                            .addGroup(mainPanelLayout.createSequentialGroup()
                                .addGroup(mainPanelLayout.createParallelGroup()
                                    .addGroup(mainPanelLayout.createSequentialGroup()
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(mainPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                            .addGroup(mainPanelLayout.createSequentialGroup()
                                                .addComponent(saveBtt, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(closeBtt, GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE))
                                            .addComponent(label62, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addGroup(mainPanelLayout.createSequentialGroup()
                                                .addGap(6, 6, 6)
                                                .addComponent(showPass))
                                            .addComponent(userField, GroupLayout.DEFAULT_SIZE, 204, Short.MAX_VALUE)
                                            .addComponent(senhaField, GroupLayout.DEFAULT_SIZE, 204, Short.MAX_VALUE)))
                                    .addGroup(mainPanelLayout.createSequentialGroup()
                                        .addGap(37, 37, 37)
                                        .addComponent(logo, GroupLayout.PREFERRED_SIZE, 112, GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 60, Short.MAX_VALUE))
                            .addGroup(mainPanelLayout.createSequentialGroup()
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(label61)
                                .addContainerGap(213, Short.MAX_VALUE))))
            );
            mainPanelLayout.setVerticalGroup(
                mainPanelLayout.createParallelGroup()
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addComponent(label1, GroupLayout.PREFERRED_SIZE, 400, GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(logo, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(label61)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(userField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(label62)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(senhaField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(showPass)
                        .addGap(49, 49, 49)
                        .addGroup(mainPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(closeBtt)
                            .addComponent(saveBtt))
                        .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            );
        }
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    private JPanel mainPanel;
    private JLabel label1;
    private JLabel logo;
    private JLabel label61;
    private JTextField userField;
    private JLabel label62;
    private JPasswordField senhaField;
    private JCheckBox showPass;
    private JButton saveBtt;
    private JButton closeBtt;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on

    public String getNomeUser(Connection conn, String user) {
        PreparedStatement statement;
        try {
            statement=conn.prepareStatement(String.format("SELECT nome FROM usuario WHERE usuario.usuario='%s'", user));
            ResultSet rs=statement.executeQuery();
            while (rs.next()) {
                return rs.getString("usuariotipo");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return null;
    }

    public static void main(String[] args) {
        JFrame telaLogin = new JFrame("Tela de Login");
        telaLogin.setContentPane(new login().mainPanel);
        telaLogin.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        telaLogin.pack();
        telaLogin.setResizable(false);
        telaLogin.setVisible(true);
        telaLogin.setSize(350,340);
    }
}
