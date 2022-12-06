package Interfaces;

import Functions.DbFunctions;

import java.awt.*;
import java.sql.Connection;
import java.util.concurrent.ThreadLocalRandom;
import javax.swing.*;
import javax.swing.GroupLayout;

/**
 * @author Heitor
 */
public class dashboardFuncionario {
    public dashboardFuncionario() {
        DbFunctions db = new DbFunctions();
        Connection conn = db.connect_to_db("BigData", "postgres", "lbj23kb24mj45");
        login login = new login();


        initComponents();
    }
    public void setNomeGerente(JLabel label, JTextField jTextField){
        DbFunctions db = new DbFunctions();

        Connection conn = db.connect_to_db("BigData", "postgres", "lbj23kb24mj45");
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
        homePanelF = new JPanel();
        label14 = new JLabel();
        greetLbl = new JLabel();
        homeDateLbl = new JLabel();

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
                    nomeGerenteLbl.setText("NomeGerente");
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

                GroupLayout sidePanelLayout = new GroupLayout(sidePanel);
                sidePanel.setLayout(sidePanelLayout);
                sidePanelLayout.setHorizontalGroup(
                    sidePanelLayout.createParallelGroup()
                        .addGroup(sidePanelLayout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(infoPanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addContainerGap(72, Short.MAX_VALUE))
                );
                sidePanelLayout.setVerticalGroup(
                    sidePanelLayout.createParallelGroup()
                        .addGroup(sidePanelLayout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(infoPanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                );
            }

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
                            .addContainerGap(584, Short.MAX_VALUE))
                );
            }

            GroupLayout mainPanelFLayout = new GroupLayout(mainPanelF);
            mainPanelF.setLayout(mainPanelFLayout);
            mainPanelFLayout.setHorizontalGroup(
                mainPanelFLayout.createParallelGroup()
                    .addGroup(mainPanelFLayout.createSequentialGroup()
                        .addComponent(sidePanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(homePanelF, GroupLayout.DEFAULT_SIZE, 1260, Short.MAX_VALUE)
                        .addContainerGap())
            );
            mainPanelFLayout.setVerticalGroup(
                mainPanelFLayout.createParallelGroup()
                    .addGroup(GroupLayout.Alignment.TRAILING, mainPanelFLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(mainPanelFLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                            .addComponent(sidePanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(homePanelF, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())
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
    private JPanel homePanelF;
    private JLabel label14;
    private JLabel greetLbl;
    private JLabel homeDateLbl;
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
