package Interfaces;

import java.awt.event.*;
import javax.swing.border.*;
import Functions.DbFunctions;

import java.awt.*;
import java.sql.Connection;
import java.util.GregorianCalendar;
import java.util.concurrent.ThreadLocalRandom;
import javax.swing.*;
import javax.swing.GroupLayout;

/**
 * @author Heitor
 */
public class dashboardFuncionario {
    public dashboardFuncionario() {
        initComponents();
        DbFunctions db = new DbFunctions();
        Connection conn = db.connect_to_db("InfoTech", "postgres", "lbj23kb24mj45");
        db.createTables(conn);
        corAleatoria();
        homeDateLbl.setText(DataPorExtenso());

    }

    private String DataPorExtenso(){
        GregorianCalendar calendar = new GregorianCalendar();
        String strMes = "";
        int mes = calendar.get(GregorianCalendar.MONTH);
        switch (mes) {
            case 0 -> strMes = "Janeiro";
            case 1 -> strMes = "Fevereiro";
            case 2 -> strMes = "Mar\u00E7o";
            case 3 -> strMes = "Abril";
            case 4 -> strMes = "Maio";
            case 5 -> strMes = "Junho";
            case 6 -> strMes = "Julho";
            case 7 -> strMes = "Agosto";
            case 8 -> strMes = "Setembro";
            case 9 -> strMes = "Outubro";
            case 10 -> strMes = "Novembro";
            case 11 -> strMes = "Dezembro";
        }
        return calendar.get(GregorianCalendar.DAY_OF_MONTH)+" de "+strMes+" de "+calendar.get(GregorianCalendar.YEAR);
    }

    private void corAleatoria(){
        int randomNum = ThreadLocalRandom.current().nextInt(0, 20);
        Color color;
        switch (randomNum) {
            case 0 -> {
                color = new Color(34, 162, 117);
                homePanelF.setBackground(color);
                nomeGerenteLbl.setForeground(homePanelF.getBackground());
                manIconPanel.setForeground(homePanelF.getBackground());
            }
            case 1 -> {
                color = new Color(255, 195, 243);
                homePanelF.setBackground(color);
                nomeGerenteLbl.setForeground(homePanelF.getBackground());
                manIconPanel.setForeground(homePanelF.getBackground());
            }
            case 3 -> {
                color = new Color(39, 127, 187);
                homePanelF.setBackground(color);
                nomeGerenteLbl.setForeground(homePanelF.getBackground());
                manIconPanel.setForeground(homePanelF.getBackground());
            }
            case 4 -> {
                color = new Color(204, 255, 204);
                homePanelF.setBackground(color);
                nomeGerenteLbl.setForeground(homePanelF.getBackground());
                manIconPanel.setForeground(homePanelF.getBackground());
            }
            case 5 -> {
                color = new Color(64, 245, 248);
                homePanelF.setBackground(color);
                nomeGerenteLbl.setForeground(homePanelF.getBackground());
                manIconPanel.setForeground(homePanelF.getBackground());
            }
            case 6 -> {
                color = new Color(153, 153, 255);
                homePanelF.setBackground(color);
                nomeGerenteLbl.setForeground(homePanelF.getBackground());
                manIconPanel.setForeground(homePanelF.getBackground());
            }
            case 7 -> {
                color = new Color(178, 221, 40);
                homePanelF.setBackground(color);
                nomeGerenteLbl.setForeground(homePanelF.getBackground());
                manIconPanel.setForeground(homePanelF.getBackground());
            }
            case 8 -> {
                color = new Color(211, 110, 112);
                homePanelF.setBackground(color);
                nomeGerenteLbl.setForeground(homePanelF.getBackground());
                manIconPanel.setForeground(homePanelF.getBackground());
            }
            case 9 -> {
                color = new Color(230, 214, 144);
                homePanelF.setBackground(color);
                nomeGerenteLbl.setForeground(homePanelF.getBackground());
                manIconPanel.setForeground(homePanelF.getBackground());
            }
            case 10 -> {
                color = new Color(137, 172, 118);
                homePanelF.setBackground(color);
                nomeGerenteLbl.setForeground(homePanelF.getBackground());
                manIconPanel.setForeground(homePanelF.getBackground());
            }
            case 11 -> {
                color = new Color(152, 238, 245);
                homePanelF.setBackground(color);
                nomeGerenteLbl.setForeground(homePanelF.getBackground());
                manIconPanel.setForeground(homePanelF.getBackground());
            }
            case 12 -> {
                color = new Color(102, 185, 181);
                homePanelF.setBackground(color);
                nomeGerenteLbl.setForeground(homePanelF.getBackground());
                manIconPanel.setForeground(homePanelF.getBackground());
            }
            case 13 -> {
                color = new Color(255, 254, 145);
                homePanelF.setBackground(color);
                nomeGerenteLbl.setForeground(homePanelF.getBackground());
                manIconPanel.setForeground(homePanelF.getBackground());
            }
            case 14 -> {
                color = new Color(255, 153, 153);
                homePanelF.setBackground(color);
                nomeGerenteLbl.setForeground(homePanelF.getBackground());
                manIconPanel.setForeground(homePanelF.getBackground());
            }
            case 15 -> {
                color = new Color(245, 110, 97);
                homePanelF.setBackground(color);
                nomeGerenteLbl.setForeground(homePanelF.getBackground());
                manIconPanel.setForeground(homePanelF.getBackground());
            }
            case 16 -> {
                color = new Color(245, 162, 100);
                homePanelF.setBackground(color);
                nomeGerenteLbl.setForeground(homePanelF.getBackground());
                manIconPanel.setForeground(homePanelF.getBackground());
            }
            case 17 -> {
                color = new Color(219, 245, 95);
                homePanelF.setBackground(color);
                nomeGerenteLbl.setForeground(homePanelF.getBackground());
                manIconPanel.setForeground(homePanelF.getBackground());
            }
            case 18 -> {
                color = new Color(140, 245, 93);
                homePanelF.setBackground(color);
                nomeGerenteLbl.setForeground(homePanelF.getBackground());
                manIconPanel.setForeground(homePanelF.getBackground());
            }
            case 19 -> {
                color = new Color(92, 245, 170);
                homePanelF.setBackground(color);
                nomeGerenteLbl.setForeground(homePanelF.getBackground());
                manIconPanel.setForeground(homePanelF.getBackground());
            }
        }
    }
    private void clear() {
        /*
        cadClienteNomeField.setText("");
        cadClienteTelefoneField.setText("");
        cadClienteEnderecoField.setText("");
        cadClienteUserField.setText("");

        ediClienteNomeField.setText("");
        ediClienteTelefoneField.setText("");
        ediClienteEnderecoField.setText("");
        ediClienteUserField.setText("");
        ediClienteDataField.setText("");

        cadFuncNomeField.setText("");
        cadFuncTelField.setText("");
        cadFuncEndField.setText("");
        cadFuncUserField.setText("");
        cadFuncSenField.setText("");

        edifuncNomeField.setText("");
        edifuncTelField.setText("");
        edifuncEndField.setText("");
        edifuncUserField.setText("");
        edifuncSenField.setText("");
        edifuncDataField.setText("");
        edifuncQtdField.setText("");
        edifuncTipoField.setText("");

        cadProdNomeField.setText("");
        cadProdTelefoneField.setText("");
        cadProdEndField.setText("");
        cadQuantidadeField.setText("");
        cadProdPrecoCompra.setText("");
        cadProdPrecoVenda.setText("");

        searchIdProduto.setText("");
        ediProdNomeField.setText("");
        ediProdTelefoneField.setText("");
        ediProdEndField.setText("");
        ediProdPrecoCompra.setText("");
        ediProdPrecoVenda.setText("");
        ediProdDataField.setText("");
        ediProdDataField.setText("");

        venIdProdutoField.setText("");
        venIdClienteField.setText("");
        venIdUserField.setText("");
        venQtdField.setText("");
        fichaTextPane.setText("");*/
    }

    // Mouse clicked
    private void homeBttMouseClicked(MouseEvent e) {
        // TODO add your code here
    }

    private void efetuarVendaBttMouseClicked(MouseEvent e) {
        // TODO add your code here
    }

    private void cliBtt1MouseClicked(MouseEvent e) {
        // TODO add your code here
    }

    private void addBttVendasMouseClicked(MouseEvent e) {
        // TODO add your code here
    }

    private void ClearBttVendasMouseClicked(MouseEvent e) {
        // TODO add your code here
    }

    // Mouse entered
    private void homeBttMouseEntered(MouseEvent e) {
        // TODO add your code here
    }

    private void efetuarVendaBttMouseEntered(MouseEvent e) {
        // TODO add your code here
    }

    private void cliBtt1MouseEntered(MouseEvent e) {
        // TODO add your code here
    }


    // Mouse exited
    private void homeBttMouseExited(MouseEvent e) {
        // TODO add your code here
    }

    private void efetuarVendaBttMouseExited(MouseEvent e) {
        // TODO add your code here
    }

    private void cliBtt1MouseExited(MouseEvent e) {
        // TODO add your code here
    }



    // Mouse pressed
    private void homeBttMousePressed(MouseEvent e) {
        // TODO add your code here
    }
    private void efetuarVendaBttMousePressed(MouseEvent e) {
        // TODO add your code here
    }

    private void cliBtt1MousePressed(MouseEvent e) {
        // TODO add your code here
    }



    // Mouse released
    private void homeBttMouseReleased(MouseEvent e) {
        // TODO add your code here
    }

    private void efetuarVendaBttMouseReleased(MouseEvent e) {
        // TODO add your code here
    }

    private void cliBtt1MouseReleased(MouseEvent e) {
        // TODO add your code here
    }




    private void SaveBttVendasMouseClicked(MouseEvent e) {
        // TODO add your code here
    }
    /*private void corAleatoria(){
        int randomNum = ThreadLocalRandom.current().nextInt(0, 20);
        Color color;
        switch (randomNum) {
            case 0 -> {
                color = new Color(34, 162, 117);
                homePanelF.setBackground(color);
                nomeGerenteLbl.setForeground(homePanelF.getBackground());
                manIconPanel.setForeground(homePanelF.getBackground());
            }
            case 1 -> {
                color = new Color(255, 195, 243);
                homePanelF.setBackground(color);
                nomeGerenteLbl.setForeground(homePanelF.getBackground());
                manIconPanel.setForeground(homePanelF.getBackground());
            }
            case 3 -> {
                color = new Color(39, 127, 187);
                homePanelF.setBackground(color);
                nomeGerenteLbl.setForeground(homePanelF.getBackground());
                manIconPanel.setForeground(homePanelF.getBackground());
            }
            case 4 -> {
                color = new Color(204, 255, 204);
                homePanelF.setBackground(color);
                nomeGerenteLbl.setForeground(homePanelF.getBackground());
                manIconPanel.setForeground(homePanelF.getBackground());
            }
            case 5 -> {
                color = new Color(64, 245, 248);
                homePanelF.setBackground(color);
                nomeGerenteLbl.setForeground(homePanelF.getBackground());
                manIconPanel.setForeground(homePanelF.getBackground());
            }
            case 6 -> {
                color = new Color(153, 153, 255);
                homePanelF.setBackground(color);
                nomeGerenteLbl.setForeground(homePanelF.getBackground());
                manIconPanel.setForeground(homePanelF.getBackground());
            }
            case 7 -> {
                color = new Color(178, 221, 40);
                homePanelF.setBackground(color);
                nomeGerenteLbl.setForeground(homePanelF.getBackground());
                manIconPanel.setForeground(homePanelF.getBackground());
            }
            case 8 -> {
                color = new Color(211, 110, 112);
                homePanelF.setBackground(color);
                nomeGerenteLbl.setForeground(homePanelF.getBackground());
                manIconPanel.setForeground(homePanelF.getBackground());
            }
            case 9 -> {
                color = new Color(230, 214, 144);
                homePanelF.setBackground(color);
                nomeGerenteLbl.setForeground(homePanelF.getBackground());
                manIconPanel.setForeground(homePanelF.getBackground());
            }
            case 10 -> {
                color = new Color(137, 172, 118);
                homePanelF.setBackground(color);
                nomeGerenteLbl.setForeground(homePanelF.getBackground());
                manIconPanel.setForeground(homePanelF.getBackground());
            }
            case 11 -> {
                color = new Color(152, 238, 245);
                homePanelF.setBackground(color);
                nomeGerenteLbl.setForeground(homePanelF.getBackground());
                manIconPanel.setForeground(homePanelF.getBackground());
            }
            case 12 -> {
                color = new Color(102, 185, 181);
                homePanelF.setBackground(color);
                nomeGerenteLbl.setForeground(homePanelF.getBackground());
                manIconPanel.setForeground(homePanelF.getBackground());
            }
            case 13 -> {
                color = new Color(255, 254, 145);
                homePanelF.setBackground(color);
                nomeGerenteLbl.setForeground(homePanelF.getBackground());
                manIconPanel.setForeground(homePanelF.getBackground());
            }
            case 14 -> {
                color = new Color(255, 153, 153);
                homePanelF.setBackground(color);
                nomeGerenteLbl.setForeground(homePanelF.getBackground());
                manIconPanel.setForeground(homePanelF.getBackground());
            }
            case 15 -> {
                color = new Color(245, 110, 97);
                homePanelF.setBackground(color);
                nomeGerenteLbl.setForeground(homePanelF.getBackground());
                manIconPanel.setForeground(homePanelF.getBackground());
            }
            case 16 -> {
                color = new Color(245, 162, 100);
                homePanelF.setBackground(color);
                nomeGerenteLbl.setForeground(homePanelF.getBackground());
                manIconPanel.setForeground(homePanelF.getBackground());
            }
            case 17 -> {
                color = new Color(219, 245, 95);
                homePanelF.setBackground(color);
                nomeGerenteLbl.setForeground(homePanelF.getBackground());
                manIconPanel.setForeground(homePanelF.getBackground());
            }
            case 18 -> {
                color = new Color(140, 245, 93);
                homePanelF.setBackground(color);
                nomeGerenteLbl.setForeground(homePanelF.getBackground());
                manIconPanel.setForeground(homePanelF.getBackground());
            }
            case 19 -> {
                color = new Color(92, 245, 170);
                homePanelF.setBackground(color);
                nomeGerenteLbl.setForeground(homePanelF.getBackground());
                manIconPanel.setForeground(homePanelF.getBackground());
            }
        }
    }*/
    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        mainPanelF = new JPanel();
        sidePanel = new JPanel();
        infoPanel = new JPanel();
        nomeGerenteLbl = new JLabel();
        manIconPanel = new JPanel();
        managerIcon = new JLabel();
        homeBtt = new JPanel();
        label1 = new JLabel();
        efetuarVendaBtt = new JPanel();
        label57 = new JLabel();
        cliBtt1 = new JPanel();
        label4 = new JLabel();
        centralPanel = new JPanel();
        homePanelF = new JPanel();
        label14 = new JLabel();
        greetLbl = new JLabel();
        homeDateLbl = new JLabel();
        efetuarVendaPanel = new JPanel();
        panel7 = new JPanel();
        label60 = new JLabel();
        label61 = new JLabel();
        venIdProdutoField = new JTextField();
        separator40 = new JSeparator();
        scrollPane1 = new JScrollPane();
        fichaTextPane = new JTextPane();
        label62 = new JLabel();
        venIdUserField = new JTextField();
        separator42 = new JSeparator();
        label63 = new JLabel();
        venIdClienteField = new JTextField();
        label65 = new JLabel();
        venQtdField = new JTextField();
        separator45 = new JSeparator();
        addBttVendas = new JButton();
        ClearBttVendas = new JButton();
        separator44 = new JSeparator();
        panel14 = new JPanel();
        SaveBttVendas = new JButton();
        label11 = new JLabel();
        label39 = new JLabel();
        venPrecoTotField = new JLabel();

        //======== mainPanelF ========
        {
            mainPanelF.setBackground(new Color(0x21252f));

            //======== sidePanel ========
            {
                sidePanel.setBackground(new Color(0x21252f));

                //======== infoPanel ========
                {
                    infoPanel.setBackground(new Color(0x21252f));

                    //---- nomeGerenteLbl ----
                    nomeGerenteLbl.setText("NomeFuncio");
                    nomeGerenteLbl.setForeground(Color.white);
                    nomeGerenteLbl.setBackground(new Color(0x21252f));

                    //======== manIconPanel ========
                    {
                        manIconPanel.setBackground(new Color(0x21252f));

                        //---- managerIcon ----
                        managerIcon.setIcon(new ImageIcon(getClass().getResource("/icons/managerIcon.png")));
                        managerIcon.setBackground(new Color(0x0021252b, true));

                        GroupLayout manIconPanelLayout = new GroupLayout(manIconPanel);
                        manIconPanel.setLayout(manIconPanelLayout);
                        manIconPanelLayout.setHorizontalGroup(
                            manIconPanelLayout.createParallelGroup()
                                .addGroup(GroupLayout.Alignment.TRAILING, manIconPanelLayout.createSequentialGroup()
                                    .addGap(0, 0, Short.MAX_VALUE)
                                    .addComponent(managerIcon, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE))
                        );
                        manIconPanelLayout.setVerticalGroup(
                            manIconPanelLayout.createParallelGroup()
                                .addGroup(GroupLayout.Alignment.TRAILING, manIconPanelLayout.createSequentialGroup()
                                    .addGap(0, 0, Short.MAX_VALUE)
                                    .addComponent(managerIcon, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE))
                        );
                    }

                    GroupLayout infoPanelLayout = new GroupLayout(infoPanel);
                    infoPanel.setLayout(infoPanelLayout);
                    infoPanelLayout.setHorizontalGroup(
                        infoPanelLayout.createParallelGroup()
                            .addGroup(infoPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(manIconPanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(nomeGerenteLbl, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
                    );
                    infoPanelLayout.setVerticalGroup(
                        infoPanelLayout.createParallelGroup()
                            .addGroup(infoPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(infoPanelLayout.createParallelGroup()
                                    .addComponent(manIconPanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nomeGerenteLbl))
                                .addGap(22, 22, 22))
                    );
                }

                //======== homeBtt ========
                {
                    homeBtt.setBackground(new Color(0x21252f));
                    homeBtt.setBorder(null);
                    homeBtt.addMouseListener(new MouseAdapter() {
                        @Override
                        public void mouseClicked(MouseEvent e) {
                            homeBttMouseClicked(e);
                        }
                        @Override
                        public void mouseEntered(MouseEvent e) {
                            homeBttMouseEntered(e);
                        }
                        @Override
                        public void mouseExited(MouseEvent e) {
                            homeBttMouseExited(e);
                        }
                        @Override
                        public void mousePressed(MouseEvent e) {
                            homeBttMousePressed(e);
                        }
                        @Override
                        public void mouseReleased(MouseEvent e) {
                            homeBttMouseReleased(e);
                        }
                    });

                    //---- label1 ----
                    label1.setText("Home");
                    label1.setForeground(Color.white);
                    label1.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 18));
                    label1.setBackground(new Color(0x21252f));
                    label1.setHorizontalAlignment(SwingConstants.LEFT);

                    GroupLayout homeBttLayout = new GroupLayout(homeBtt);
                    homeBtt.setLayout(homeBttLayout);
                    homeBttLayout.setHorizontalGroup(
                        homeBttLayout.createParallelGroup()
                            .addGroup(homeBttLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(label1)
                                .addContainerGap(193, Short.MAX_VALUE))
                    );
                    homeBttLayout.setVerticalGroup(
                        homeBttLayout.createParallelGroup()
                            .addGroup(homeBttLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(label1, GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                                .addContainerGap())
                    );
                }

                //======== efetuarVendaBtt ========
                {
                    efetuarVendaBtt.setBorder(null);
                    efetuarVendaBtt.setBackground(new Color(0x21252f));
                    efetuarVendaBtt.setForeground(Color.black);
                    efetuarVendaBtt.addMouseListener(new MouseAdapter() {
                        @Override
                        public void mouseClicked(MouseEvent e) {
                            efetuarVendaBttMouseClicked(e);
                        }
                        @Override
                        public void mouseEntered(MouseEvent e) {
                            efetuarVendaBttMouseEntered(e);
                        }
                        @Override
                        public void mouseExited(MouseEvent e) {
                            efetuarVendaBttMouseExited(e);
                        }
                        @Override
                        public void mousePressed(MouseEvent e) {
                            efetuarVendaBttMousePressed(e);
                        }
                        @Override
                        public void mouseReleased(MouseEvent e) {
                            efetuarVendaBttMouseReleased(e);
                        }
                    });

                    //---- label57 ----
                    label57.setText("Efetuar Venda");
                    label57.setForeground(Color.white);
                    label57.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 18));

                    GroupLayout efetuarVendaBttLayout = new GroupLayout(efetuarVendaBtt);
                    efetuarVendaBtt.setLayout(efetuarVendaBttLayout);
                    efetuarVendaBttLayout.setHorizontalGroup(
                        efetuarVendaBttLayout.createParallelGroup()
                            .addGroup(efetuarVendaBttLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(label57)
                                .addContainerGap(134, Short.MAX_VALUE))
                    );
                    efetuarVendaBttLayout.setVerticalGroup(
                        efetuarVendaBttLayout.createParallelGroup()
                            .addGroup(efetuarVendaBttLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(label57, GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                                .addContainerGap())
                    );
                }

                //======== cliBtt1 ========
                {
                    cliBtt1.setBackground(new Color(0x21252f));
                    cliBtt1.setBorder(null);
                    cliBtt1.addMouseListener(new MouseAdapter() {
                        @Override
                        public void mouseClicked(MouseEvent e) {
                            cliBtt1MouseClicked(e);
                        }
                        @Override
                        public void mouseEntered(MouseEvent e) {
                            cliBtt1MouseEntered(e);
                        }
                        @Override
                        public void mouseExited(MouseEvent e) {
                            cliBtt1MouseExited(e);
                        }
                        @Override
                        public void mousePressed(MouseEvent e) {
                            cliBtt1MousePressed(e);
                        }
                        @Override
                        public void mouseReleased(MouseEvent e) {
                            cliBtt1MouseReleased(e);
                        }
                    });

                    //---- label4 ----
                    label4.setText("Cadastrar cliente");
                    label4.setForeground(Color.white);
                    label4.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 18));
                    label4.setBackground(new Color(0x21252f));
                    label4.setHorizontalAlignment(SwingConstants.LEFT);

                    GroupLayout cliBtt1Layout = new GroupLayout(cliBtt1);
                    cliBtt1.setLayout(cliBtt1Layout);
                    cliBtt1Layout.setHorizontalGroup(
                        cliBtt1Layout.createParallelGroup()
                            .addGroup(cliBtt1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(label4)
                                .addContainerGap(113, Short.MAX_VALUE))
                    );
                    cliBtt1Layout.setVerticalGroup(
                        cliBtt1Layout.createParallelGroup()
                            .addGroup(GroupLayout.Alignment.TRAILING, cliBtt1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(label4, GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                                .addContainerGap())
                    );
                }

                GroupLayout sidePanelLayout = new GroupLayout(sidePanel);
                sidePanel.setLayout(sidePanelLayout);
                sidePanelLayout.setHorizontalGroup(
                    sidePanelLayout.createParallelGroup()
                        .addGroup(sidePanelLayout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(sidePanelLayout.createParallelGroup()
                                .addComponent(homeBtt, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(efetuarVendaBtt, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cliBtt1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(sidePanelLayout.createSequentialGroup()
                                    .addComponent(infoPanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                    .addGap(0, 73, Short.MAX_VALUE)))
                            .addContainerGap())
                );
                sidePanelLayout.setVerticalGroup(
                    sidePanelLayout.createParallelGroup()
                        .addGroup(sidePanelLayout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(infoPanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addGap(39, 39, 39)
                            .addComponent(homeBtt, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(efetuarVendaBtt, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(cliBtt1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addContainerGap(585, Short.MAX_VALUE))
                );
            }

            //======== centralPanel ========
            {
                centralPanel.setLayout(new CardLayout());

                //======== homePanelF ========
                {
                    homePanelF.setBackground(new Color(0x21252f));

                    //---- label14 ----
                    label14.setIcon(new ImageIcon(getClass().getResource("/icons/homeLogo.png")));
                    label14.setForeground(new Color(0x21252f));
                    label14.setBackground(new Color(0x21252f));

                    //---- greetLbl ----
                    greetLbl.setText("Bem vindo, ");
                    greetLbl.setForeground(Color.black);
                    greetLbl.setBackground(new Color(0x21252f));
                    greetLbl.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 26));

                    //---- homeDateLbl ----
                    homeDateLbl.setBackground(new Color(0x21252f));
                    homeDateLbl.setForeground(Color.black);
                    homeDateLbl.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 26));
                    homeDateLbl.setText("Data");

                    GroupLayout homePanelFLayout = new GroupLayout(homePanelF);
                    homePanelF.setLayout(homePanelFLayout);
                    homePanelFLayout.setHorizontalGroup(
                        homePanelFLayout.createParallelGroup()
                            .addGroup(GroupLayout.Alignment.TRAILING, homePanelFLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(homePanelFLayout.createParallelGroup()
                                    .addGroup(homePanelFLayout.createSequentialGroup()
                                        .addGap(770, 770, 770)
                                        .addGroup(homePanelFLayout.createParallelGroup()
                                            .addComponent(greetLbl, GroupLayout.PREFERRED_SIZE, 500, GroupLayout.PREFERRED_SIZE)
                                            .addComponent(homeDateLbl, GroupLayout.PREFERRED_SIZE, 500, GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(label14, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 1272, GroupLayout.PREFERRED_SIZE))
                                .addContainerGap())
                    );
                    homePanelFLayout.setVerticalGroup(
                        homePanelFLayout.createParallelGroup()
                            .addGroup(homePanelFLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(label14)
                                .addGap(6, 6, 6)
                                .addComponent(greetLbl, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                                .addGap(5, 5, 5)
                                .addComponent(homeDateLbl, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    );
                }
                centralPanel.add(homePanelF, "card1");

                //======== efetuarVendaPanel ========
                {
                    efetuarVendaPanel.setBackground(new Color(0x21252f));

                    //======== panel7 ========
                    {
                        panel7.setBackground(new Color(0x009933));

                        GroupLayout panel7Layout = new GroupLayout(panel7);
                        panel7.setLayout(panel7Layout);
                        panel7Layout.setHorizontalGroup(
                            panel7Layout.createParallelGroup()
                                .addGap(0, 80, Short.MAX_VALUE)
                        );
                        panel7Layout.setVerticalGroup(
                            panel7Layout.createParallelGroup()
                                .addGap(0, 900, Short.MAX_VALUE)
                        );
                    }

                    //---- label60 ----
                    label60.setText("Efetuar venda");
                    label60.setFont(new Font("Yu Gothic Light", Font.PLAIN, 36));
                    label60.setForeground(Color.white);
                    label60.setBackground(Color.white);

                    //---- label61 ----
                    label61.setText("Identificador do produto");
                    label61.setForeground(Color.white);
                    label61.setFont(new Font("Verdana", Font.PLAIN, 12));

                    //---- venIdProdutoField ----
                    venIdProdutoField.setBorder(null);
                    venIdProdutoField.setForeground(Color.white);
                    venIdProdutoField.setBackground(new Color(0x21252f));

                    //---- separator40 ----
                    separator40.setBackground(new Color(0x21252f));
                    separator40.setForeground(new Color(0x009933));
                    separator40.setBorder(null);

                    //======== scrollPane1 ========
                    {

                        //---- fichaTextPane ----
                        fichaTextPane.setBorder(new TitledBorder("Ficha"));
                        fichaTextPane.setEditable(false);
                        fichaTextPane.setForeground(Color.white);
                        scrollPane1.setViewportView(fichaTextPane);
                    }

                    //---- label62 ----
                    label62.setText("ID Usu\u00e1rio");
                    label62.setForeground(Color.white);
                    label62.setFont(new Font("Verdana", Font.PLAIN, 12));

                    //---- venIdUserField ----
                    venIdUserField.setBorder(null);
                    venIdUserField.setForeground(Color.white);
                    venIdUserField.setBackground(new Color(0x21252f));

                    //---- separator42 ----
                    separator42.setBackground(new Color(0x21252f));
                    separator42.setForeground(new Color(0x009933));
                    separator42.setBorder(null);

                    //---- label63 ----
                    label63.setText("ID Cliente");
                    label63.setForeground(Color.white);
                    label63.setFont(new Font("Verdana", Font.PLAIN, 12));

                    //---- venIdClienteField ----
                    venIdClienteField.setForeground(Color.white);
                    venIdClienteField.setBorder(null);
                    venIdClienteField.setBackground(new Color(0x21252f));

                    //---- label65 ----
                    label65.setText("Quantidade");
                    label65.setFont(new Font("Verdana", Font.PLAIN, 12));
                    label65.setForeground(Color.white);

                    //---- venQtdField ----
                    venQtdField.setBorder(null);
                    venQtdField.setBackground(new Color(0x21252f));
                    venQtdField.setForeground(Color.white);

                    //---- separator45 ----
                    separator45.setBackground(new Color(0x21252f));
                    separator45.setForeground(new Color(0x009933));
                    separator45.setBorder(null);

                    //---- addBttVendas ----
                    addBttVendas.setText("Adicionar");
                    addBttVendas.setBackground(new Color(0x21252f));
                    addBttVendas.setForeground(Color.white);
                    addBttVendas.addMouseListener(new MouseAdapter() {
                        @Override
                        public void mouseClicked(MouseEvent e) {
                            addBttVendasMouseClicked(e);
                        }
                    });

                    //---- ClearBttVendas ----
                    ClearBttVendas.setText("Limpar");
                    ClearBttVendas.setBackground(new Color(0x21252f));
                    ClearBttVendas.setForeground(Color.white);
                    ClearBttVendas.addMouseListener(new MouseAdapter() {
                        @Override
                        public void mouseClicked(MouseEvent e) {
                            ClearBttVendasMouseClicked(e);
                        }
                    });

                    //---- separator44 ----
                    separator44.setBackground(new Color(0x21252f));
                    separator44.setForeground(new Color(0x009933));
                    separator44.setBorder(null);

                    //======== panel14 ========
                    {
                        panel14.setBackground(new Color(0x21252f));

                        GroupLayout panel14Layout = new GroupLayout(panel14);
                        panel14.setLayout(panel14Layout);
                        panel14Layout.setHorizontalGroup(
                            panel14Layout.createParallelGroup()
                                .addGap(0, 380, Short.MAX_VALUE)
                        );
                        panel14Layout.setVerticalGroup(
                            panel14Layout.createParallelGroup()
                                .addGap(0, 136, Short.MAX_VALUE)
                        );
                    }

                    //---- SaveBttVendas ----
                    SaveBttVendas.setText("Salvar");
                    SaveBttVendas.setForeground(Color.white);
                    SaveBttVendas.setBackground(new Color(0x21252f));
                    SaveBttVendas.addMouseListener(new MouseAdapter() {
                        @Override
                        public void mouseClicked(MouseEvent e) {
                            SaveBttVendasMouseClicked(e);
                        }
                    });

                    //---- label11 ----
                    label11.setText("Pre\u00e7o total");
                    label11.setForeground(Color.white);

                    //---- label39 ----
                    label39.setText("R$");
                    label39.setForeground(Color.white);

                    //---- venPrecoTotField ----
                    venPrecoTotField.setText("0.00");
                    venPrecoTotField.setBackground(new Color(0x21252f));
                    venPrecoTotField.setForeground(Color.white);

                    GroupLayout efetuarVendaPanelLayout = new GroupLayout(efetuarVendaPanel);
                    efetuarVendaPanel.setLayout(efetuarVendaPanelLayout);
                    efetuarVendaPanelLayout.setHorizontalGroup(
                        efetuarVendaPanelLayout.createParallelGroup()
                            .addGroup(GroupLayout.Alignment.TRAILING, efetuarVendaPanelLayout.createSequentialGroup()
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(panel7, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addGroup(efetuarVendaPanelLayout.createParallelGroup()
                                    .addGroup(efetuarVendaPanelLayout.createSequentialGroup()
                                        .addGap(20, 20, 20)
                                        .addComponent(panel14, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                    .addComponent(label60, GroupLayout.PREFERRED_SIZE, 380, GroupLayout.PREFERRED_SIZE)
                                    .addGroup(efetuarVendaPanelLayout.createSequentialGroup()
                                        .addComponent(label61)
                                        .addGap(255, 255, 255)
                                        .addComponent(label11))
                                    .addGroup(efetuarVendaPanelLayout.createSequentialGroup()
                                        .addComponent(venIdProdutoField, GroupLayout.PREFERRED_SIZE, 380, GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(label39)
                                        .addGap(6, 6, 6)
                                        .addComponent(venPrecoTotField, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE))
                                    .addComponent(separator40, GroupLayout.PREFERRED_SIZE, 380, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(label65)
                                    .addComponent(venQtdField, GroupLayout.PREFERRED_SIZE, 380, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(separator45, GroupLayout.PREFERRED_SIZE, 380, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(label62)
                                    .addComponent(venIdUserField, GroupLayout.PREFERRED_SIZE, 380, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(separator42, GroupLayout.PREFERRED_SIZE, 380, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(label63)
                                    .addComponent(venIdClienteField, GroupLayout.PREFERRED_SIZE, 380, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(separator44, GroupLayout.PREFERRED_SIZE, 380, GroupLayout.PREFERRED_SIZE)
                                    .addGroup(efetuarVendaPanelLayout.createSequentialGroup()
                                        .addComponent(addBttVendas, GroupLayout.PREFERRED_SIZE, 186, GroupLayout.PREFERRED_SIZE)
                                        .addGap(6, 6, 6)
                                        .addComponent(ClearBttVendas, GroupLayout.PREFERRED_SIZE, 188, GroupLayout.PREFERRED_SIZE))
                                    .addGroup(efetuarVendaPanelLayout.createSequentialGroup()
                                        .addGap(97, 97, 97)
                                        .addComponent(SaveBttVendas, GroupLayout.PREFERRED_SIZE, 186, GroupLayout.PREFERRED_SIZE)))
                                .addGap(300, 300, 300)
                                .addComponent(scrollPane1, GroupLayout.PREFERRED_SIZE, 430, GroupLayout.PREFERRED_SIZE))
                    );
                    efetuarVendaPanelLayout.setVerticalGroup(
                        efetuarVendaPanelLayout.createParallelGroup()
                            .addGroup(GroupLayout.Alignment.TRAILING, efetuarVendaPanelLayout.createSequentialGroup()
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(efetuarVendaPanelLayout.createParallelGroup()
                                    .addComponent(panel7, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                    .addGroup(efetuarVendaPanelLayout.createSequentialGroup()
                                        .addComponent(panel14, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addGap(6, 6, 6)
                                        .addComponent(label60, GroupLayout.PREFERRED_SIZE, 84, GroupLayout.PREFERRED_SIZE)
                                        .addGap(6, 6, 6)
                                        .addGroup(efetuarVendaPanelLayout.createParallelGroup()
                                            .addComponent(label61)
                                            .addComponent(label11))
                                        .addGap(6, 6, 6)
                                        .addGroup(efetuarVendaPanelLayout.createParallelGroup()
                                            .addComponent(venIdProdutoField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                            .addGroup(efetuarVendaPanelLayout.createSequentialGroup()
                                                .addGap(4, 4, 4)
                                                .addGroup(efetuarVendaPanelLayout.createParallelGroup()
                                                    .addComponent(label39)
                                                    .addComponent(venPrecoTotField))))
                                        .addGap(6, 6, 6)
                                        .addComponent(separator40, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addGap(12, 12, 12)
                                        .addComponent(label65)
                                        .addGap(6, 6, 6)
                                        .addComponent(venQtdField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addGap(6, 6, 6)
                                        .addComponent(separator45, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addGap(12, 12, 12)
                                        .addComponent(label62)
                                        .addGap(6, 6, 6)
                                        .addComponent(venIdUserField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addGap(6, 6, 6)
                                        .addComponent(separator42, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addGap(12, 12, 12)
                                        .addComponent(label63)
                                        .addGap(6, 6, 6)
                                        .addComponent(venIdClienteField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addGap(6, 6, 6)
                                        .addComponent(separator44, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addGroup(efetuarVendaPanelLayout.createParallelGroup()
                                            .addComponent(addBttVendas)
                                            .addComponent(ClearBttVendas))
                                        .addGap(6, 6, 6)
                                        .addComponent(SaveBttVendas))
                                    .addComponent(scrollPane1, GroupLayout.PREFERRED_SIZE, 900, GroupLayout.PREFERRED_SIZE))
                                .addContainerGap())
                    );
                }
                centralPanel.add(efetuarVendaPanel, "card2");
            }

            GroupLayout mainPanelFLayout = new GroupLayout(mainPanelF);
            mainPanelF.setLayout(mainPanelFLayout);
            mainPanelFLayout.setHorizontalGroup(
                mainPanelFLayout.createParallelGroup()
                    .addGroup(mainPanelFLayout.createSequentialGroup()
                        .addComponent(sidePanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(centralPanel, GroupLayout.DEFAULT_SIZE, 1272, Short.MAX_VALUE)
                        .addContainerGap())
            );
            mainPanelFLayout.setVerticalGroup(
                mainPanelFLayout.createParallelGroup()
                    .addGroup(mainPanelFLayout.createSequentialGroup()
                        .addGroup(mainPanelFLayout.createParallelGroup()
                            .addComponent(sidePanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addGroup(mainPanelFLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(centralPanel, GroupLayout.DEFAULT_SIZE, 0, Short.MAX_VALUE)))
                        .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            );
        }
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    public JPanel mainPanelF;
    private JPanel sidePanel;
    private JPanel infoPanel;
    private JLabel nomeGerenteLbl;
    private JPanel manIconPanel;
    private JLabel managerIcon;
    private JPanel homeBtt;
    private JLabel label1;
    private JPanel efetuarVendaBtt;
    private JLabel label57;
    private JPanel cliBtt1;
    private JLabel label4;
    private JPanel centralPanel;
    private JPanel homePanelF;
    private JLabel label14;
    private JLabel greetLbl;
    private JLabel homeDateLbl;
    private JPanel efetuarVendaPanel;
    private JPanel panel7;
    private JLabel label60;
    private JLabel label61;
    private JTextField venIdProdutoField;
    private JSeparator separator40;
    private JScrollPane scrollPane1;
    private JTextPane fichaTextPane;
    private JLabel label62;
    private JTextField venIdUserField;
    private JSeparator separator42;
    private JLabel label63;
    private JTextField venIdClienteField;
    private JLabel label65;
    private JTextField venQtdField;
    private JSeparator separator45;
    private JButton addBttVendas;
    private JButton ClearBttVendas;
    private JSeparator separator44;
    private JPanel panel14;
    private JButton SaveBttVendas;
    private JLabel label11;
    private JLabel label39;
    private JLabel venPrecoTotField;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
    public static void main(String[] args) {
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
