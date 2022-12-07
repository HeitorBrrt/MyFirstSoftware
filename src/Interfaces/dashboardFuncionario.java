package Interfaces;

import java.awt.event.*;
import javax.swing.border.*;
import javax.swing.table.*;
import Functions.DbFunctions;
import atores.Cliente;
import estoque.Produto;
import pedido.Venda;

import java.awt.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.GregorianCalendar;
import java.util.concurrent.ThreadLocalRandom;
import javax.swing.*;
import javax.swing.GroupLayout;

/**
 * @author Heitor
 */
public class dashboardFuncionario {
    public dashboardFuncionario() {
        DbFunctions db = new DbFunctions();
        Connection conn = db.connect_to_db("InfoTech", "postgres", "lbj23kb24mj45");
        db.createTables(conn);
        initComponents();
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
                manIconPanel.setForeground(homePanelF.getBackground());
            }
            case 1 -> {
                color = new Color(255, 195, 243);
                homePanelF.setBackground(color);
                manIconPanel.setForeground(homePanelF.getBackground());
            }
            case 3 -> {
                color = new Color(39, 127, 187);
                homePanelF.setBackground(color);
                manIconPanel.setForeground(homePanelF.getBackground());
            }
            case 4 -> {
                color = new Color(204, 255, 204);
                homePanelF.setBackground(color);
                manIconPanel.setForeground(homePanelF.getBackground());
            }
            case 5 -> {
                color = new Color(64, 245, 248);
                homePanelF.setBackground(color);
                manIconPanel.setForeground(homePanelF.getBackground());
            }
            case 6 -> {
                color = new Color(153, 153, 255);
                homePanelF.setBackground(color);
                manIconPanel.setForeground(homePanelF.getBackground());
            }
            case 7 -> {
                color = new Color(178, 221, 40);
                homePanelF.setBackground(color);
                manIconPanel.setForeground(homePanelF.getBackground());
            }
            case 8 -> {
                color = new Color(211, 110, 112);
                homePanelF.setBackground(color);
                manIconPanel.setForeground(homePanelF.getBackground());
            }
            case 9 -> {
                color = new Color(230, 214, 144);
                homePanelF.setBackground(color);
                manIconPanel.setForeground(homePanelF.getBackground());
            }
            case 10 -> {
                color = new Color(137, 172, 118);
                homePanelF.setBackground(color);
                manIconPanel.setForeground(homePanelF.getBackground());
            }
            case 11 -> {
                color = new Color(152, 238, 245);
                homePanelF.setBackground(color);
                manIconPanel.setForeground(homePanelF.getBackground());
            }
            case 12 -> {
                color = new Color(102, 185, 181);
                homePanelF.setBackground(color);
                manIconPanel.setForeground(homePanelF.getBackground());
            }
            case 13 -> {
                color = new Color(255, 254, 145);
                homePanelF.setBackground(color);
                manIconPanel.setForeground(homePanelF.getBackground());
            }
            case 14 -> {
                color = new Color(255, 153, 153);
                homePanelF.setBackground(color);
                manIconPanel.setForeground(homePanelF.getBackground());
            }
            case 15 -> {
                color = new Color(245, 110, 97);
                homePanelF.setBackground(color);
                manIconPanel.setForeground(homePanelF.getBackground());
            }
            case 16 -> {
                color = new Color(245, 162, 100);
                homePanelF.setBackground(color);
                manIconPanel.setForeground(homePanelF.getBackground());
            }
            case 17 -> {
                color = new Color(219, 245, 95);
                homePanelF.setBackground(color);
                manIconPanel.setForeground(homePanelF.getBackground());
            }
            case 18 -> {
                color = new Color(140, 245, 93);
                homePanelF.setBackground(color);
                manIconPanel.setForeground(homePanelF.getBackground());
            }
            case 19 -> {
                color = new Color(92, 245, 170);
                homePanelF.setBackground(color);
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
        homePanelF.setVisible(true);
        cadClientePanel.setVisible(false);
        efetuarVendaPanel.setVisible(false);
        listaClientesPanel.setVisible(false);
        listaProdutosPanel.setVisible(false);
    }

    private void efetuarVendaBttMouseClicked(MouseEvent e) {
        homePanelF.setVisible(false);
        cadClientePanel.setVisible(false);
        efetuarVendaPanel.setVisible(true);
        listaClientesPanel.setVisible(false);
        listaProdutosPanel.setVisible(false);
    }

    private void cliBtt1MouseClicked(MouseEvent e) {
        homePanelF.setVisible(false);
        cadClientePanel.setVisible(true);
        efetuarVendaPanel.setVisible(false);
        listaClientesPanel.setVisible(false);
        listaProdutosPanel.setVisible(false);
    }

    private void listaClientesBttMouseClicked(MouseEvent e) {
        homePanelF.setVisible(false);
        cadClientePanel.setVisible(false);
        efetuarVendaPanel.setVisible(false);
        listaClientesPanel.setVisible(true);
        listaProdutosPanel.setVisible(false);
        fillFclienteTable();
    }

    private void listaProdutosBttMouseClicked(MouseEvent e) {
        homePanelF.setVisible(false);
        cadClientePanel.setVisible(false);
        efetuarVendaPanel.setVisible(false);
        listaClientesPanel.setVisible(false);
        listaProdutosPanel.setVisible(true);
        fillFprodutoTable();
    }

    // Mouse entered
    private void homeBttMouseEntered(MouseEvent e) {
        homeBtt.setBackground(new Color(37, 98, 156));
    }
    private void efetuarVendaBttMouseEntered(MouseEvent e) {
        efetuarVendaBtt.setBackground(new Color(56, 118, 29));
    }
    private void cliBtt1MouseEntered(MouseEvent e) {
        cliBtt1.setBackground(new Color(37, 98, 156));
    }

    private void listaClientesBttMouseEntered(MouseEvent e) {
        listaClientesBtt.setBackground(new Color(37, 98, 156));
    }
    private void listaProdutosBttMouseEntered(MouseEvent e) {
        listaProdutosBtt.setBackground(new Color(37, 98, 156));
    }

    // Mouse exited
    private void homeBttMouseExited(MouseEvent e) {
        homeBtt.setBackground(new Color(33, 37, 47));
    }
    private void efetuarVendaBttMouseExited(MouseEvent e) {
        efetuarVendaBtt.setBackground(new Color(33, 37, 47));
    }
    private void cliBtt1MouseExited(MouseEvent e) {
        cliBtt1.setBackground(new Color(33, 37, 47));
    }

    private void listaClientesBttMouseExited(MouseEvent e) {
        listaClientesBtt.setBackground(new Color(33, 37, 47));
    }
    private void listaProdutosBttMouseExited(MouseEvent e) {
        listaProdutosBtt.setBackground(new Color(33, 37, 47));
    }

    // Mouse pressed
    private void homeBttMousePressed(MouseEvent e) {
        homeBtt.setBackground(new Color(50, 129, 244));
    }
    private void efetuarVendaBttMousePressed(MouseEvent e) {
        efetuarVendaBtt.setBackground(new Color(87, 187, 45));
    }
    private void cliBtt1MousePressed(MouseEvent e) {
        cliBtt1.setBackground(new Color(50, 129, 244));
    }

    private void listaClientesBttMousePressed(MouseEvent e) {
        listaClientesBtt.setBackground(new Color(50, 129, 244));
    }
    private void listaProdutosBttMousePressed(MouseEvent e) {
        listaProdutosBtt.setBackground(new Color(50, 129, 244));
    }

    // Mouse released
    private void homeBttMouseReleased(MouseEvent e) {
        homeBtt.setBackground(new Color(37, 98, 156));
    }
    private void efetuarVendaBttMouseReleased(MouseEvent e) {
        efetuarVendaBtt.setBackground(new Color(56, 118, 29));
    }
    private void cliBtt1MouseReleased(MouseEvent e) {
        cliBtt1.setBackground(new Color(37, 98, 156));
    }
    private void listaClientesBttMouseReleased(MouseEvent e) {
        listaClientesBtt.setBackground(new Color(37, 98, 156));
    }
    private void listaProdutosBttMouseReleased(MouseEvent e) {
        listaProdutosBtt.setBackground(new Color(37, 98, 156));
    }

    private String precTot(Integer idproduto, String quantidade) {
        DbFunctions db = new DbFunctions();
        Connection conn = db.connect_to_db("InfoTech", "postgres", "lbj23kb24mj45");
        String precoVend = String.valueOf(db.getPrecoVenda_info(conn, idproduto));
        String precAtual = venPrecoTotField.getText();
        String precTotal = String.valueOf(Double.parseDouble(precoVend)*Double.parseDouble(quantidade));

        return String.valueOf(Double.valueOf(Double.parseDouble(precAtual)+Double.parseDouble(precTotal)));
    }


    // Cadastro cliente
    private void saveBttMouseClicked(MouseEvent e) {
        DbFunctions db = new DbFunctions();
        Connection conn = db.connect_to_db("InfoTech", "postgres", "lbj23kb24mj45");

        String nome = cadClienteNomeField.getText();
        String telefone = cadClienteTelefoneField.getText();
        String endereco = cadClienteEnderecoField.getText();
        String userUsuario = cadClienteUserField.getText();
        GregorianCalendar calendar = new GregorianCalendar();
        String dataCadastro =
                calendar.get(GregorianCalendar.DAY_OF_MONTH) + "/" +
                        calendar.get(GregorianCalendar.MONTH) + 1 + "/" +
                        calendar.get(GregorianCalendar.YEAR);

        if ((cadClienteNomeField.getText().length() > 0) && (cadClienteTelefoneField.getText().length() > 0) &&
                (cadClienteEnderecoField.getText().length() > 0) && (cadClienteUserField.getText().length() > 0)) {
            if(db.verificarUsuario(userUsuario, db.read_idUsuario(conn))) {
                try {
                    Cliente cliente = new Cliente(null, nome, telefone, endereco, dataCadastro, userUsuario);
                    db.insert_row_cliente(conn, "cliente", cliente.getNome(), cliente.getTelefone(), cliente.getEndereco(), cliente.getDataCadastro(), cliente.getUserUsuario());
                    clear();
                    JOptionPane.showMessageDialog(mainPanelF, "Novo cliente cadastrado com sucesso");
                } catch (Exception exception) {
                    JOptionPane.showMessageDialog(null, exception.getMessage());
                    clear();
                }
            }
            else {
                JOptionPane.showMessageDialog(null, "Usu\u00E1rio n\u00E3o encontrado");
            }

        } else {
            JOptionPane.showMessageDialog(null, "Campo vazio");


        }
    }
    private void clearBttMouseClicked(MouseEvent e) {
        cadClienteNomeField.setText("");
        cadClienteTelefoneField.setText("");
        cadClienteEnderecoField.setText("");
        cadClienteUserField.setText("");
    }

    // Efetuar venda
    private void SaveBttVendasMouseClicked(MouseEvent e) {
        DbFunctions db = new DbFunctions();
        Connection conn = db.connect_to_db("InfoTech", "postgres", "lbj23kb24mj45");

        String descricao = fichaTextPane.getText();
        String precoTotal = venPrecoTotField.getText();
        String idCliente = venIdClienteField.getText();
        String idUsuario = venIdUserField.getText();
        String qtdItem = venQtdField.getText();
        String idProduto = venIdProdutoField.getText();

        GregorianCalendar calendar = new GregorianCalendar();
        String datavenda = calendar.get(GregorianCalendar.DAY_OF_MONTH) + "/" +
                calendar.get(GregorianCalendar.MONTH)+1 + "/" +
                calendar.get(GregorianCalendar.YEAR);

        if((venIdProdutoField.getText().length()>0) && (fichaTextPane.getText().length()>0) &&
                (venQtdField.getText().length()>0) && (venIdUserField.getText().length()>0) &&
                (venIdClienteField.getText().length()>0)){
            try{
                Venda venda = new Venda(null, descricao, precoTotal, datavenda, idCliente, idUsuario, qtdItem, idProduto);
                db.insert_row_venda(conn,  venda.getDescricao(),venda.getIdCliente(), venda.getIdUsuario(), venda.getPrecoTotal(), venda.getDataVenda());
                JOptionPane.showMessageDialog(null, "Venda efetuada");
                db.vendaEfetuada(conn, idUsuario, qtdItem);

            }catch (Exception exception){
                JOptionPane.showMessageDialog(null, exception);
            }
        }
        else {
            JOptionPane.showMessageDialog(null, "Campo vazio");
        }
    }
    private void ClearBttVendasMouseClicked(MouseEvent e) {
        venIdProdutoField.setText("");
        venQtdField.setText("");
        venIdUserField.setText("");
        venIdClienteField.setText("");

    }
    private void addBttVendasMouseClicked(MouseEvent e) {
        DbFunctions db = new DbFunctions();
        Connection conn = db.connect_to_db("InfoTech", "postgres", "lbj23kb24mj45");

        String nomeProduto = db.getNome_info(conn, "produto", "idproduto", venIdProdutoField.getText());
        String nomeCliente = db.getNome_info(conn, "cliente", "idcliente", venIdClienteField.getText());
        String nomeUsuario = db.getNome_info(conn, "usuario", "usuario", venIdUserField.getText());

        if((venIdProdutoField.getText().length()>0) && (venQtdField.getText().length()>0) && (venIdClienteField.getText().length()>0) && (venIdUserField.getText().length()>0)){
            if(db.verificarUsuario(venIdUserField.getText(), db.read_idUsuario(conn)) && db.verificarCliente(venIdClienteField.getText(), db.read_idCliente(conn)) && (db.verificarProduto(venIdProdutoField.getText(), db.read_idProduto(conn)))){
                fichaTextPane.setText(fichaTextPane.getText()+
                        "ID do produto: "+ venIdProdutoField.getText()+" \n" +nomeProduto+" \n"+
                        "Quantidade: "+ venQtdField.getText()+" \n"+
                        "ID do Cliente: "+venIdClienteField.getText()+" \n" + nomeCliente + " \n"+
                        "ID Usuário: "+ venIdUserField.getText()+" \n"+nomeUsuario+" \n\n");

                Integer idproduto = Integer.valueOf(venIdProdutoField.getText());
                String quantidade = venQtdField.getText();
                venPrecoTotField.setText(precTot(idproduto, quantidade));
                db.updateQtdItens(conn, String.valueOf(idproduto), quantidade);
            }
            else {
                JOptionPane.showMessageDialog(null, "idCliente/idUsuario/idproduto n\u00E3o existe");
            }
        }
        else {
            JOptionPane.showMessageDialog(null, "Campo vazio");
        }

    }

    // public void fillTableClientes(){
    //        DbFunctions db = new DbFunctions();
    //        Connection conn = db.connect_to_db("InfoTech", "postgres", "lbj23kb24mj45");
    //        DefaultTableModel model = (DefaultTableModel) clientesTable.getModel();
    //        clientesTable.setRowSorter(new TableRowSorter<TableModel>(model));
    //        model.setNumRows(0);
    //
    //        for(Cliente cliente: db.read_dataClientes(conn)){
    //            model.addRow(new Object[]{
    //                    cliente.getIdCliente(),
    //                    cliente.getNome(),
    //                    cliente.getTelefone(),
    //                    cliente.getEndereco(),
    //                    cliente.getUserUsuario(),
    //                    cliente.getDataCadastro()
    //            });
    //        }
    //    }

    public void fillFclienteTable() {
        DbFunctions db = new DbFunctions();
        Connection conn = db.connect_to_db("InfoTech", "postgres", "lbj23kb24mj45");
        DefaultTableModel model = (DefaultTableModel) FclientesTable.getModel();
        FclientesTable.setRowSorter(new TableRowSorter<TableModel>(model));
        model.setNumRows(0);
        for(Cliente cliente: db.getNomeIdCliente(conn)) {
            model.addRow(new Object[]{
                    cliente.getIdCliente(),
                    cliente.getNome()
            });
        }
    }

    public void fillFprodutoTable() {
        DbFunctions db = new DbFunctions();
        Connection conn = db.connect_to_db("InfoTech", "postgres", "lbj23kb24mj45");
        DefaultTableModel model = (DefaultTableModel) FprodutosTable.getModel();
        FprodutosTable.setRowSorter(new TableRowSorter<TableModel>(model));
        model.setNumRows(0);
        for(Produto produto: db.getNomeIdProduto(conn)) {
            model.addRow(new Object[]{
                    produto.getIdProduto(),
                    produto.getProdutoNome()
            });
        }
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        mainPanelF = new JPanel();
        sidePanel = new JPanel();
        infoPanel = new JPanel();
        manIconPanel = new JPanel();
        managerIcon = new JLabel();
        homeBtt = new JPanel();
        label1 = new JLabel();
        efetuarVendaBtt = new JPanel();
        label57 = new JLabel();
        cliBtt1 = new JPanel();
        label4 = new JLabel();
        label2 = new JLabel();
        listaClientesBtt = new JPanel();
        label58 = new JLabel();
        listaProdutosBtt = new JPanel();
        label59 = new JLabel();
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
        cadClientePanel = new JPanel();
        sidePanel2 = new JPanel();
        label8 = new JLabel();
        cadClienteNomeField = new JTextField();
        separator1 = new JSeparator();
        label9 = new JLabel();
        cadClienteTelefoneField = new JTextField();
        separator2 = new JSeparator();
        label10 = new JLabel();
        cadClienteEnderecoField = new JTextField();
        label12 = new JLabel();
        cadClienteUserField = new JTextField();
        separator5 = new JSeparator();
        separator6 = new JSeparator();
        saveBtt = new JButton();
        clearBtt = new JButton();
        label13 = new JLabel();
        panel10 = new JPanel();
        listaClientesPanel = new JPanel();
        scrollPane2 = new JScrollPane();
        FclientesTable = new JTable();
        listaProdutosPanel = new JPanel();
        scrollPane3 = new JScrollPane();
        FprodutosTable = new JTable();

        //======== mainPanelF ========
        {
            mainPanelF.setBackground(new Color(0x21252f));

            //======== sidePanel ========
            {
                sidePanel.setBackground(new Color(0x21252f));

                //======== infoPanel ========
                {
                    infoPanel.setBackground(new Color(0x21252f));

                    //======== manIconPanel ========
                    {
                        manIconPanel.setBackground(new Color(0x21252f));

                        //---- managerIcon ----
                        managerIcon.setIcon(new ImageIcon(getClass().getResource("/icons/staffIcon.png")));
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
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    );
                    infoPanelLayout.setVerticalGroup(
                        infoPanelLayout.createParallelGroup()
                            .addGroup(infoPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(manIconPanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
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
                                .addComponent(label1, GroupLayout.PREFERRED_SIZE, 52, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                                .addComponent(label57, GroupLayout.PREFERRED_SIZE, 113, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    );
                    efetuarVendaBttLayout.setVerticalGroup(
                        efetuarVendaBttLayout.createParallelGroup()
                            .addGroup(GroupLayout.Alignment.TRAILING, efetuarVendaBttLayout.createSequentialGroup()
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
                                .addComponent(label4, GroupLayout.PREFERRED_SIZE, 132, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    );
                    cliBtt1Layout.setVerticalGroup(
                        cliBtt1Layout.createParallelGroup()
                            .addGroup(GroupLayout.Alignment.TRAILING, cliBtt1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(label4, GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                                .addContainerGap())
                    );
                }

                //---- label2 ----
                label2.setText("Funcion\u00e1rio");
                label2.setForeground(Color.white);

                //======== listaClientesBtt ========
                {
                    listaClientesBtt.setBorder(null);
                    listaClientesBtt.setBackground(new Color(0x21252f));
                    listaClientesBtt.setForeground(Color.black);
                    listaClientesBtt.addMouseListener(new MouseAdapter() {
                        @Override
                        public void mouseClicked(MouseEvent e) {
                            listaClientesBttMouseClicked(e);
                        }
                        @Override
                        public void mouseEntered(MouseEvent e) {
                            listaClientesBttMouseEntered(e);
                        }
                        @Override
                        public void mouseExited(MouseEvent e) {
                            listaClientesBttMouseExited(e);
                        }
                        @Override
                        public void mousePressed(MouseEvent e) {
                            listaClientesBttMousePressed(e);
                        }
                        @Override
                        public void mouseReleased(MouseEvent e) {
                            listaClientesBttMouseReleased(e);
                        }
                    });

                    //---- label58 ----
                    label58.setText("Lista de clientes");
                    label58.setForeground(Color.white);
                    label58.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 18));

                    GroupLayout listaClientesBttLayout = new GroupLayout(listaClientesBtt);
                    listaClientesBtt.setLayout(listaClientesBttLayout);
                    listaClientesBttLayout.setHorizontalGroup(
                        listaClientesBttLayout.createParallelGroup()
                            .addGroup(listaClientesBttLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(label58)
                                .addContainerGap(123, Short.MAX_VALUE))
                    );
                    listaClientesBttLayout.setVerticalGroup(
                        listaClientesBttLayout.createParallelGroup()
                            .addGroup(listaClientesBttLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(label58, GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                                .addContainerGap())
                    );
                }

                //======== listaProdutosBtt ========
                {
                    listaProdutosBtt.setBorder(null);
                    listaProdutosBtt.setBackground(new Color(0x21252f));
                    listaProdutosBtt.setForeground(Color.black);
                    listaProdutosBtt.addMouseListener(new MouseAdapter() {
                        @Override
                        public void mouseClicked(MouseEvent e) {
                            listaProdutosBttMouseClicked(e);
                        }
                        @Override
                        public void mouseEntered(MouseEvent e) {
                            listaProdutosBttMouseEntered(e);
                        }
                        @Override
                        public void mouseExited(MouseEvent e) {
                            listaProdutosBttMouseExited(e);
                        }
                        @Override
                        public void mousePressed(MouseEvent e) {
                            listaProdutosBttMousePressed(e);
                        }
                        @Override
                        public void mouseReleased(MouseEvent e) {
                            listaProdutosBttMouseReleased(e);
                        }
                    });

                    //---- label59 ----
                    label59.setText("Lista de Produtos");
                    label59.setForeground(Color.white);
                    label59.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 18));

                    GroupLayout listaProdutosBttLayout = new GroupLayout(listaProdutosBtt);
                    listaProdutosBtt.setLayout(listaProdutosBttLayout);
                    listaProdutosBttLayout.setHorizontalGroup(
                        listaProdutosBttLayout.createParallelGroup()
                            .addGroup(listaProdutosBttLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(label59)
                                .addContainerGap(111, Short.MAX_VALUE))
                    );
                    listaProdutosBttLayout.setVerticalGroup(
                        listaProdutosBttLayout.createParallelGroup()
                            .addGroup(listaProdutosBttLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(label59, GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
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
                                    .addComponent(infoPanel, 86, 86, GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(label2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(GroupLayout.Alignment.TRAILING, sidePanelLayout.createSequentialGroup()
                                    .addGap(0, 0, Short.MAX_VALUE)
                                    .addComponent(listaClientesBtt, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addGroup(sidePanelLayout.createSequentialGroup()
                                    .addComponent(listaProdutosBtt, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                    .addGap(0, 0, Short.MAX_VALUE)))
                            .addContainerGap())
                );
                sidePanelLayout.setVerticalGroup(
                    sidePanelLayout.createParallelGroup()
                        .addGroup(sidePanelLayout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(sidePanelLayout.createParallelGroup()
                                .addComponent(infoPanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addComponent(label2))
                            .addGap(39, 39, 39)
                            .addComponent(homeBtt, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(efetuarVendaBtt, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(cliBtt1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(listaClientesBtt, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(listaProdutosBtt, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addContainerGap(473, Short.MAX_VALUE))
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
                    greetLbl.setText("Bem vindo");
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
                                .addComponent(panel7, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addGroup(efetuarVendaPanelLayout.createParallelGroup()
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
                                        .addComponent(SaveBttVendas, GroupLayout.PREFERRED_SIZE, 186, GroupLayout.PREFERRED_SIZE))
                                    .addComponent(panel14, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 297, Short.MAX_VALUE)
                                .addComponent(scrollPane1, GroupLayout.PREFERRED_SIZE, 430, GroupLayout.PREFERRED_SIZE))
                    );
                    efetuarVendaPanelLayout.setVerticalGroup(
                        efetuarVendaPanelLayout.createParallelGroup()
                            .addGroup(efetuarVendaPanelLayout.createSequentialGroup()
                                .addGroup(efetuarVendaPanelLayout.createParallelGroup()
                                    .addComponent(panel7, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                    .addGroup(efetuarVendaPanelLayout.createSequentialGroup()
                                        .addComponent(panel14, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
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
                                        .addComponent(SaveBttVendas)))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(efetuarVendaPanelLayout.createSequentialGroup()
                                .addComponent(scrollPane1)
                                .addContainerGap())
                    );
                }
                centralPanel.add(efetuarVendaPanel, "card2");

                //======== cadClientePanel ========
                {
                    cadClientePanel.setBackground(new Color(0x21252f));

                    //======== sidePanel2 ========
                    {
                        sidePanel2.setBackground(new Color(0x009999));

                        GroupLayout sidePanel2Layout = new GroupLayout(sidePanel2);
                        sidePanel2.setLayout(sidePanel2Layout);
                        sidePanel2Layout.setHorizontalGroup(
                            sidePanel2Layout.createParallelGroup()
                                .addGap(0, 80, Short.MAX_VALUE)
                        );
                        sidePanel2Layout.setVerticalGroup(
                            sidePanel2Layout.createParallelGroup()
                                .addGap(0, 894, Short.MAX_VALUE)
                        );
                    }

                    //---- label8 ----
                    label8.setText("Nome");
                    label8.setForeground(Color.white);
                    label8.setBackground(new Color(0x21252f));
                    label8.setFont(new Font("Verdana", Font.PLAIN, 12));

                    //---- cadClienteNomeField ----
                    cadClienteNomeField.setBorder(null);
                    cadClienteNomeField.setBackground(new Color(0x21252f));
                    cadClienteNomeField.setForeground(Color.white);

                    //---- separator1 ----
                    separator1.setForeground(new Color(0x009999));
                    separator1.setBackground(new Color(0x21252f));
                    separator1.setOpaque(true);
                    separator1.setBorder(null);

                    //---- label9 ----
                    label9.setText("Telefone");
                    label9.setForeground(Color.white);
                    label9.setBackground(new Color(0x21252f));
                    label9.setFont(new Font("Verdana", Font.PLAIN, 12));

                    //---- cadClienteTelefoneField ----
                    cadClienteTelefoneField.setBorder(null);
                    cadClienteTelefoneField.setBackground(new Color(0x21252f));
                    cadClienteTelefoneField.setForeground(Color.white);

                    //---- separator2 ----
                    separator2.setForeground(new Color(0x009999));
                    separator2.setBackground(new Color(0x21252f));
                    separator2.setOpaque(true);
                    separator2.setBorder(null);

                    //---- label10 ----
                    label10.setText("Endere\u00e7o");
                    label10.setForeground(Color.white);
                    label10.setBackground(new Color(0x21252f));
                    label10.setFont(new Font("Verdana", Font.PLAIN, 12));

                    //---- cadClienteEnderecoField ----
                    cadClienteEnderecoField.setBorder(null);
                    cadClienteEnderecoField.setForeground(Color.white);
                    cadClienteEnderecoField.setBackground(new Color(0x21252f));

                    //---- label12 ----
                    label12.setText("ID Usu\u00e1rio");
                    label12.setForeground(Color.white);
                    label12.setBackground(new Color(0x21252f));
                    label12.setFont(new Font("Verdana", Font.PLAIN, 12));

                    //---- cadClienteUserField ----
                    cadClienteUserField.setBorder(null);
                    cadClienteUserField.setForeground(Color.white);
                    cadClienteUserField.setBackground(new Color(0x21252f));

                    //---- separator5 ----
                    separator5.setForeground(new Color(0x009999));
                    separator5.setBackground(new Color(0x21252f));
                    separator5.setOpaque(true);
                    separator5.setBorder(null);

                    //---- separator6 ----
                    separator6.setForeground(new Color(0x009999));
                    separator6.setBackground(new Color(0x21252f));
                    separator6.setOpaque(true);
                    separator6.setBorder(null);

                    //---- saveBtt ----
                    saveBtt.setText("Salvar");
                    saveBtt.setBackground(new Color(0x21252f));
                    saveBtt.setForeground(Color.white);
                    saveBtt.addMouseListener(new MouseAdapter() {
                        @Override
                        public void mouseClicked(MouseEvent e) {
                            saveBttMouseClicked(e);
                        }
                    });

                    //---- clearBtt ----
                    clearBtt.setText("Limpar");
                    clearBtt.setBackground(new Color(0x21252f));
                    clearBtt.setForeground(Color.white);
                    clearBtt.addMouseListener(new MouseAdapter() {
                        @Override
                        public void mouseClicked(MouseEvent e) {
                            clearBttMouseClicked(e);
                        }
                    });

                    //---- label13 ----
                    label13.setText("Cadastrar clientez");
                    label13.setFont(new Font("Yu Gothic Light", Font.PLAIN, 36));
                    label13.setForeground(Color.white);
                    label13.setBackground(new Color(0x21252f));

                    //======== panel10 ========
                    {
                        panel10.setBackground(new Color(0x21252f));

                        GroupLayout panel10Layout = new GroupLayout(panel10);
                        panel10.setLayout(panel10Layout);
                        panel10Layout.setHorizontalGroup(
                            panel10Layout.createParallelGroup()
                                .addGap(0, 380, Short.MAX_VALUE)
                        );
                        panel10Layout.setVerticalGroup(
                            panel10Layout.createParallelGroup()
                                .addGap(0, 136, Short.MAX_VALUE)
                        );
                    }

                    GroupLayout cadClientePanelLayout = new GroupLayout(cadClientePanel);
                    cadClientePanel.setLayout(cadClientePanelLayout);
                    cadClientePanelLayout.setHorizontalGroup(
                        cadClientePanelLayout.createParallelGroup()
                            .addGroup(cadClientePanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(sidePanel2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(cadClientePanelLayout.createParallelGroup()
                                    .addComponent(panel10, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(label13, GroupLayout.PREFERRED_SIZE, 380, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(label8)
                                    .addComponent(cadClienteNomeField, GroupLayout.PREFERRED_SIZE, 380, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(separator1, GroupLayout.PREFERRED_SIZE, 380, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(label9)
                                    .addComponent(cadClienteTelefoneField, GroupLayout.PREFERRED_SIZE, 380, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(separator2, GroupLayout.PREFERRED_SIZE, 380, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(label10)
                                    .addComponent(cadClienteEnderecoField, GroupLayout.PREFERRED_SIZE, 380, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(separator6, GroupLayout.PREFERRED_SIZE, 380, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(label12)
                                    .addComponent(cadClienteUserField, GroupLayout.PREFERRED_SIZE, 380, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(separator5, GroupLayout.PREFERRED_SIZE, 380, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(saveBtt, GroupLayout.PREFERRED_SIZE, 380, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(clearBtt, GroupLayout.PREFERRED_SIZE, 380, GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 797, Short.MAX_VALUE))
                    );
                    cadClientePanelLayout.setVerticalGroup(
                        cadClientePanelLayout.createParallelGroup()
                            .addGroup(GroupLayout.Alignment.TRAILING, cadClientePanelLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(cadClientePanelLayout.createParallelGroup()
                                    .addComponent(sidePanel2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                    .addGroup(cadClientePanelLayout.createSequentialGroup()
                                        .addComponent(panel10, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addGap(6, 6, 6)
                                        .addComponent(label13, GroupLayout.PREFERRED_SIZE, 84, GroupLayout.PREFERRED_SIZE)
                                        .addGap(6, 6, 6)
                                        .addComponent(label8)
                                        .addGap(6, 6, 6)
                                        .addComponent(cadClienteNomeField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addGap(6, 6, 6)
                                        .addComponent(separator1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addGap(12, 12, 12)
                                        .addComponent(label9)
                                        .addGap(6, 6, 6)
                                        .addComponent(cadClienteTelefoneField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addGap(6, 6, 6)
                                        .addComponent(separator2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addGap(12, 12, 12)
                                        .addComponent(label10)
                                        .addGap(6, 6, 6)
                                        .addComponent(cadClienteEnderecoField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addGap(6, 6, 6)
                                        .addComponent(separator6, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(label12)
                                        .addGap(6, 6, 6)
                                        .addComponent(cadClienteUserField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addGap(6, 6, 6)
                                        .addComponent(separator5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(saveBtt)
                                        .addGap(6, 6, 6)
                                        .addComponent(clearBtt)))
                                .addContainerGap())
                    );
                }
                centralPanel.add(cadClientePanel, "card3");

                //======== listaClientesPanel ========
                {
                    listaClientesPanel.setBackground(new Color(0x21252f));

                    //======== scrollPane2 ========
                    {

                        //---- FclientesTable ----
                        FclientesTable.setModel(new DefaultTableModel(
                            new Object[][] {
                                {null, ""},
                            },
                            new String[] {
                                "idCliente", "nomeCliente"
                            }
                        ) {
                            boolean[] columnEditable = new boolean[] {
                                true, false
                            };
                            @Override
                            public boolean isCellEditable(int rowIndex, int columnIndex) {
                                return columnEditable[columnIndex];
                            }
                        });
                        {
                            TableColumnModel cm = FclientesTable.getColumnModel();
                            cm.getColumn(1).setResizable(false);
                        }
                        scrollPane2.setViewportView(FclientesTable);
                    }

                    GroupLayout listaClientesPanelLayout = new GroupLayout(listaClientesPanel);
                    listaClientesPanel.setLayout(listaClientesPanelLayout);
                    listaClientesPanelLayout.setHorizontalGroup(
                        listaClientesPanelLayout.createParallelGroup()
                            .addGroup(listaClientesPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(scrollPane2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(811, Short.MAX_VALUE))
                    );
                    listaClientesPanelLayout.setVerticalGroup(
                        listaClientesPanelLayout.createParallelGroup()
                            .addGroup(listaClientesPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(scrollPane2, GroupLayout.DEFAULT_SIZE, 888, Short.MAX_VALUE)
                                .addContainerGap())
                    );
                }
                centralPanel.add(listaClientesPanel, "card4");

                //======== listaProdutosPanel ========
                {
                    listaProdutosPanel.setBackground(new Color(0x21252f));

                    //======== scrollPane3 ========
                    {
                        scrollPane3.setBackground(new Color(0x21252f));

                        //---- FprodutosTable ----
                        FprodutosTable.setModel(new DefaultTableModel(
                            new Object[][] {
                                {null, null},
                            },
                            new String[] {
                                "idProduto", "nomeProduto"
                            }
                        ) {
                            boolean[] columnEditable = new boolean[] {
                                true, false
                            };
                            @Override
                            public boolean isCellEditable(int rowIndex, int columnIndex) {
                                return columnEditable[columnIndex];
                            }
                        });
                        {
                            TableColumnModel cm = FprodutosTable.getColumnModel();
                            cm.getColumn(1).setResizable(false);
                        }
                        scrollPane3.setViewportView(FprodutosTable);
                    }

                    GroupLayout listaProdutosPanelLayout = new GroupLayout(listaProdutosPanel);
                    listaProdutosPanel.setLayout(listaProdutosPanelLayout);
                    listaProdutosPanelLayout.setHorizontalGroup(
                        listaProdutosPanelLayout.createParallelGroup()
                            .addGroup(listaProdutosPanelLayout.createSequentialGroup()
                                .addComponent(scrollPane3, GroupLayout.PREFERRED_SIZE, 452, GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 817, Short.MAX_VALUE))
                    );
                    listaProdutosPanelLayout.setVerticalGroup(
                        listaProdutosPanelLayout.createParallelGroup()
                            .addGroup(listaProdutosPanelLayout.createSequentialGroup()
                                .addComponent(scrollPane3, GroupLayout.PREFERRED_SIZE, 888, GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 12, Short.MAX_VALUE))
                    );
                }
                centralPanel.add(listaProdutosPanel, "card5");
            }

            GroupLayout mainPanelFLayout = new GroupLayout(mainPanelF);
            mainPanelF.setLayout(mainPanelFLayout);
            mainPanelFLayout.setHorizontalGroup(
                mainPanelFLayout.createParallelGroup()
                    .addGroup(mainPanelFLayout.createSequentialGroup()
                        .addComponent(sidePanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(centralPanel, GroupLayout.DEFAULT_SIZE, 1269, Short.MAX_VALUE)
                        .addContainerGap())
            );
            mainPanelFLayout.setVerticalGroup(
                mainPanelFLayout.createParallelGroup()
                    .addGroup(mainPanelFLayout.createSequentialGroup()
                        .addGroup(mainPanelFLayout.createParallelGroup()
                            .addComponent(sidePanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(centralPanel, GroupLayout.DEFAULT_SIZE, 0, Short.MAX_VALUE))
                        .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            );
        }
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    public JPanel mainPanelF;
    private JPanel sidePanel;
    private JPanel infoPanel;
    private JPanel manIconPanel;
    private JLabel managerIcon;
    private JPanel homeBtt;
    private JLabel label1;
    private JPanel efetuarVendaBtt;
    private JLabel label57;
    private JPanel cliBtt1;
    private JLabel label4;
    private JLabel label2;
    private JPanel listaClientesBtt;
    private JLabel label58;
    private JPanel listaProdutosBtt;
    private JLabel label59;
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
    private JPanel cadClientePanel;
    private JPanel sidePanel2;
    private JLabel label8;
    private JTextField cadClienteNomeField;
    private JSeparator separator1;
    private JLabel label9;
    private JTextField cadClienteTelefoneField;
    private JSeparator separator2;
    private JLabel label10;
    private JTextField cadClienteEnderecoField;
    private JLabel label12;
    private JTextField cadClienteUserField;
    private JSeparator separator5;
    private JSeparator separator6;
    private JButton saveBtt;
    private JButton clearBtt;
    private JLabel label13;
    private JPanel panel10;
    private JPanel listaClientesPanel;
    private JScrollPane scrollPane2;
    private JTable FclientesTable;
    private JPanel listaProdutosPanel;
    private JScrollPane scrollPane3;
    private JTable FprodutosTable;
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
