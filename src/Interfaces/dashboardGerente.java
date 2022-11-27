package Interfaces;

import java.awt.event.*;
import javax.swing.border.*;
import javax.swing.table.*;
import Functions.DbFunctions;
import atores.Cliente;
import atores.Usuario;
import estoque.Produto;
import pedido.Venda;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.util.GregorianCalendar;
import java.util.concurrent.ThreadLocalRandom;

/**
 * @Author Heitor
 */

public class dashboardGerente {
    public dashboardGerente() {
        DbFunctions db = new DbFunctions();
        Connection conn = db.connect_to_db("InfoTech", "postgres", "lbj23kb24mj45");
        db.createTables(conn);
        initComponents();
        corAleatoria();
        String nomeGer = "Heitor Barreto Bonfim";
        nomeGerenteLbl.setText(nomeGer);
        greetLbl.setText(greetLbl.getText()+ nomeGer);
        homeDateLbl.setText(DataPorExtenso());
    }
    private void corAleatoria(){
        int randomNum = ThreadLocalRandom.current().nextInt(0, 20);
        Color color;
        switch (randomNum) {
            case 0 -> {
                color = new Color(34, 162, 117);
                homePanel.setBackground(color);
                nomeGerenteLbl.setForeground(homePanel.getBackground());
                manIconPanel.setForeground(homePanel.getBackground());
            }
            case 1 -> {
                color = new Color(255, 195, 243);
                homePanel.setBackground(color);
                nomeGerenteLbl.setForeground(homePanel.getBackground());
                manIconPanel.setForeground(homePanel.getBackground());
            }
            case 3 -> {
                color = new Color(39, 127, 187);
                homePanel.setBackground(color);
                nomeGerenteLbl.setForeground(homePanel.getBackground());
                manIconPanel.setForeground(homePanel.getBackground());
            }
            case 4 -> {
                color = new Color(204, 255, 204);
                homePanel.setBackground(color);
                nomeGerenteLbl.setForeground(homePanel.getBackground());
                manIconPanel.setForeground(homePanel.getBackground());
            }
            case 5 -> {
                color = new Color(64, 245, 248);
                homePanel.setBackground(color);
                nomeGerenteLbl.setForeground(homePanel.getBackground());
                manIconPanel.setForeground(homePanel.getBackground());
            }
            case 6 -> {
                color = new Color(153, 153, 255);
                homePanel.setBackground(color);
                nomeGerenteLbl.setForeground(homePanel.getBackground());
                manIconPanel.setForeground(homePanel.getBackground());
            }
            case 7 -> {
                color = new Color(178, 221, 40);
                homePanel.setBackground(color);
                nomeGerenteLbl.setForeground(homePanel.getBackground());
                manIconPanel.setForeground(homePanel.getBackground());
            }
            case 8 -> {
                color = new Color(211, 110, 112);
                homePanel.setBackground(color);
                nomeGerenteLbl.setForeground(homePanel.getBackground());
                manIconPanel.setForeground(homePanel.getBackground());
            }
            case 9 -> {
                color = new Color(230, 214, 144);
                homePanel.setBackground(color);
                nomeGerenteLbl.setForeground(homePanel.getBackground());
                manIconPanel.setForeground(homePanel.getBackground());
            }
            case 10 -> {
                color = new Color(137, 172, 118);
                homePanel.setBackground(color);
                nomeGerenteLbl.setForeground(homePanel.getBackground());
                manIconPanel.setForeground(homePanel.getBackground());
            }
            case 11 -> {
                color = new Color(152, 238, 245);
                homePanel.setBackground(color);
                nomeGerenteLbl.setForeground(homePanel.getBackground());
                manIconPanel.setForeground(homePanel.getBackground());
            }
            case 12 -> {
                color = new Color(102, 185, 181);
                homePanel.setBackground(color);
                nomeGerenteLbl.setForeground(homePanel.getBackground());
                manIconPanel.setForeground(homePanel.getBackground());
            }
            case 13 -> {
                color = new Color(255, 254, 145);
                homePanel.setBackground(color);
                nomeGerenteLbl.setForeground(homePanel.getBackground());
                manIconPanel.setForeground(homePanel.getBackground());
            }
            case 14 -> {
                color = new Color(255, 153, 153);
                homePanel.setBackground(color);
                nomeGerenteLbl.setForeground(homePanel.getBackground());
                manIconPanel.setForeground(homePanel.getBackground());
            }
            case 15 -> {
                color = new Color(245, 110, 97);
                homePanel.setBackground(color);
                nomeGerenteLbl.setForeground(homePanel.getBackground());
                manIconPanel.setForeground(homePanel.getBackground());
            }
            case 16 -> {
                color = new Color(245, 162, 100);
                homePanel.setBackground(color);
                nomeGerenteLbl.setForeground(homePanel.getBackground());
                manIconPanel.setForeground(homePanel.getBackground());
            }
            case 17 -> {
                color = new Color(219, 245, 95);
                homePanel.setBackground(color);
                nomeGerenteLbl.setForeground(homePanel.getBackground());
                manIconPanel.setForeground(homePanel.getBackground());
            }
            case 18 -> {
                color = new Color(140, 245, 93);
                homePanel.setBackground(color);
                nomeGerenteLbl.setForeground(homePanel.getBackground());
                manIconPanel.setForeground(homePanel.getBackground());
            }
            case 19 -> {
                color = new Color(92, 245, 170);
                homePanel.setBackground(color);
                nomeGerenteLbl.setForeground(homePanel.getBackground());
                manIconPanel.setForeground(homePanel.getBackground());
            }
        }
    }
    private void clear() {
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
        fichaTextPane.setText("");
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
        int hora;
        return calendar.get(GregorianCalendar.DAY_OF_MONTH)+" de "+strMes+" de "+calendar.get(GregorianCalendar.YEAR);
    }

    // Search Funcionario
    private void searchFuncMouseEntered(MouseEvent e) {
        searchFuncPanel.setBackground(new Color(37, 98, 156));

    }
    private void searchFuncMouseExited(MouseEvent e) {
        searchFuncPanel.setBackground(new Color(33, 37, 47));

    }
    private void searchFuncMousePressed(MouseEvent e) {
        searchFuncPanel.setBackground(new Color(50, 129, 244));

    }
    private void searchFuncMouseReleased(MouseEvent e) {
        searchFuncPanel.setBackground(new Color(37, 98, 156));

    }

    // Search Cliente
    private void searchClientPanelMouseEntered(MouseEvent e) {
        searchClientPanel.setBackground(new Color(37, 98, 156));
    }

    private void searchClientPanelMouseExited(MouseEvent e) {
        searchClientPanel.setBackground(new Color(33, 37, 47));

    }

    private void searchClientPanelMousePressed(MouseEvent e) {
        searchClientPanel.setBackground(new Color(50, 129, 244));

    }

    private void searchClientPanelMouseReleased(MouseEvent e) {
        searchClientPanel.setBackground(new Color(37, 98, 156));

    }

    // Search Produto
    private void searchProdPanelMouseEntered(MouseEvent e) {
        searchProdPanel.setBackground(new Color(37, 98, 156));

    }
    private void searchProdPanelMouseExited(MouseEvent e) {
        searchProdPanel.setBackground(new Color(33, 37, 47));

    }
    private void searchProdPanelMousePressed(MouseEvent e) {
        searchProdPanel.setBackground(new Color(50, 129, 244));

    }
    private void searchProdPanelMouseReleased(MouseEvent e) {
        searchProdPanel.setBackground(new Color(37, 98, 156));

    }

    // Cadastrar/Editar Cliente
    private void searchClientPanelMouseClicked(MouseEvent e) {
        DbFunctions db = new DbFunctions();
        Connection conn = db.connect_to_db("InfoTech", "postgres", "lbj23kb24mj45");
        try {
            ediClienteNomeField.setText(db.getNome_info(conn, "cliente", "idCliente", searchID.getText()));
            ediClienteTelefoneField.setText(db.getTelefone_info(conn, "cliente", "idCliente", searchID.getText()));
            ediClienteEnderecoField.setText(db.getEndereco_info(conn, "cliente", "idCliente", searchID.getText()));
            ediClienteUserField.setText(db.getIdUser_info(conn, searchID.getText()));
            ediClienteDataField.setText(db.getDataCadastro_info(conn, "cliente", "idCliente", searchID.getText()));
        } catch (Exception exception) {
            JOptionPane.showMessageDialog(null, exception);
        }

    }
    private void saveBttMouseClicked(MouseEvent e) {
        DbFunctions db = new DbFunctions();
        Connection conn = db.connect_to_db("InfoTech", "postgres", "lbj23kb24mj45");

        String nome = cadClienteNomeField.getText();
        String telefone = cadClienteTelefoneField.getText();
        String endereco = cadClienteEnderecoField.getText();
        String userUsuario = cadClienteUserField.getText();
        GregorianCalendar calendar = new GregorianCalendar();
        String dataCadastro =
                String.valueOf(calendar.get(GregorianCalendar.DAY_OF_MONTH)) + "/" +
                        String.valueOf(calendar.get(GregorianCalendar.MONTH) + 1) + "/" +
                        String.valueOf(calendar.get(GregorianCalendar.YEAR));

        if ((cadClienteNomeField.getText().length() > 0) && (cadClienteTelefoneField.getText().length() > 0) &&
                (cadClienteEnderecoField.getText().length() > 0) && (cadClienteUserField.getText().length() > 0)) {
            if(db.verificarUsuario(userUsuario, db.read_idUsuario(conn))) {
                try {
                    Cliente cliente = new Cliente(null, nome, telefone, endereco, dataCadastro, userUsuario);
                    db.insert_row_cliente(conn, "cliente", cliente.getNome(), cliente.getTelefone(), cliente.getEndereco(), cliente.getDataCadastro(), cliente.getUserUsuario());
                    clear();
                    JOptionPane.showMessageDialog(mainPanel, "Novo cliente cadastrado com sucesso");
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
    private void ediClienteSaveBttMouseClicked(MouseEvent e) {
        DbFunctions db = new DbFunctions();
        Connection conn = db.connect_to_db("InfoTech", "postgres", "lbj23kb24mj45");
        if((ediClienteNomeField.getText().length()>0) && (ediClienteTelefoneField.getText().length()>0) &&
                (ediClienteEnderecoField.getText().length()>0) &&
                (ediClienteUserField.getText().length()>0) &&(ediClienteDataField.getText().length()>0)) {
            try{
                db.update_client(conn, "cliente",
                        searchID.getText(),
                        ediClienteNomeField.getText(),
                        ediClienteTelefoneField.getText(),
                        ediClienteEnderecoField.getText(),
                        ediClienteUserField.getText(),
                        ediClienteDataField.getText());

                JOptionPane.showMessageDialog(null, "Cadastro alterado com sucesso");
            }catch (Exception exception){
                JOptionPane.showMessageDialog(null, exception);
            }
        }
        else {
            JOptionPane.showMessageDialog(null, "Campo Vazio");
        }


    }
    private void ediClienteClearBttMouseClicked(MouseEvent e) {
        cadClienteNomeField.setText("");
        cadClienteTelefoneField.setText("");
        cadClienteEnderecoField.setText("");
        cadClienteUserField.setText("");
    }

    // Cadastrar/Editar Funcionario
    private void searchFuncMouseClicked(MouseEvent e) {
        DbFunctions db = new DbFunctions();
        Connection conn = db.connect_to_db("InfoTech", "postgres", "lbj23kb24mj45");
        try {
            edifuncNomeField.setText(db.getNome_info(conn, "usuario", "usuario",searchUser.getText()));
            edifuncTelField.setText(db.getTelefone_info(conn, "usuario", "usuario", searchUser.getText()));
            edifuncEndField.setText(db.getEndereco_info(conn, "usuario", "usuario", searchUser.getText()));
            edifuncUserField.setText(db.getUser_info(conn, searchUser.getText()));
            edifuncSenField.setText(db.getSenha_info(conn, searchUser.getText()));
            edifuncQtdField.setText(db.getQtdVendas_info(conn, searchUser.getText()));
            edifuncTipoField.setText(db.getUsuarioTipo_info(conn, searchUser.getText()));
            edifuncDataField.setText(db.getDataCadastro_info(conn, "usuario", "usuario", searchUser.getText()));
        }catch (Exception exception){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    private void ediFuncSaveBttMouseClicked(MouseEvent e) {
        DbFunctions db = new DbFunctions();
        Connection conn = db.connect_to_db("InfoTech", "postgres", "lbj23kb24mj45");
        if((edifuncNomeField.getText().length()>0) && (edifuncTelField.getText().length()>0) && (edifuncEndField.getText().length()>0) &&
        (edifuncUserField.getText().length()>0) && (edifuncSenField.getText().length()>0) && (edifuncQtdField.getText().length()>0) &&
        (edifuncTipoField.getText().length()>0) && edifuncDataField.getText().length()>0) {
            try {
                db.update_user(conn, "usuario",
                        searchUser.getText(),
                        edifuncNomeField.getText(),
                        edifuncTelField.getText(),
                        edifuncEndField.getText(),
                        edifuncUserField.getText(),
                        edifuncSenField.getText(),
                        edifuncQtdField.getText(),
                        edifuncTipoField.getText(),
                        edifuncDataField.getText());
                JOptionPane.showMessageDialog(null, "Cadastro alterado com sucesso");
            } catch (Exception exception) {
                JOptionPane.showMessageDialog(null, exception);
            }
        }
        else {
            JOptionPane.showMessageDialog(null, "Campo vazio");
        }
    }
    private void ediFuncClearBttMouseClicked(MouseEvent e) {
        edifuncNomeField.setText("");
        edifuncTelField.setText("");
        edifuncEndField.setText("");
        edifuncUserField.setText("");
        edifuncSenField.setText("");
        edifuncQtdField.setText("");
        edifuncTipoField.setText("");
        edifuncDataField.setText("");
    }
    private void cadFuncClearBttMouseClicked(MouseEvent e) {
        cadFuncNomeField.setText("");
        cadFuncTelField.setText("");
        cadFuncEndField.setText("");
        cadFuncUserField.setText("");
        cadFuncSenField.setText("");
    }
    private void cadFuncSaveBttMouseClicked(MouseEvent e) {

        DbFunctions db = new DbFunctions();
        Connection conn = db.connect_to_db("InfoTech", "postgres", "lbj23kb24mj45");

        String nome = cadFuncNomeField.getText();
        String telefone = cadFuncTelField.getText();
        String endereco = cadFuncEndField.getText();
        String userUsuario = cadFuncUserField.getText();
        String senha = String.valueOf(cadFuncSenField.getPassword());

        GregorianCalendar calendar = new GregorianCalendar();
        String dataCadastro = String.valueOf(calendar.get(GregorianCalendar.DAY_OF_MONTH)) + "/" +
                String.valueOf(calendar.get(GregorianCalendar.MONTH)) + "/" +
                String.valueOf(calendar.get(GregorianCalendar.YEAR));

        if ((cadFuncNomeField.getText().length() > 0) && (cadFuncTelField.getText().length() > 0) &&
                (cadFuncEndField.getText().length() > 0) && (cadFuncUserField.getText().length() > 0) && (cadFuncSenField.getText().length() > 0)) {
            try {
                Usuario usuario = new Usuario(userUsuario, nome, telefone, endereco, dataCadastro, senha, 0, "Funcion\u00E1rio");
                db.insert_row_funcionario(conn, "usuario", usuario.getUser(), usuario.getNome(), usuario.getTelefone(), usuario.getEndereco(), usuario.getSenha(), usuario.getUsuarioTipo(), usuario.getDataCadastro());
                JOptionPane.showMessageDialog(null, "Novo usu\u00E1rio cadastrado com sucesso");
                clear();
            } catch (Exception exception) {
                JOptionPane.showMessageDialog(null, exception);
            }
        }
        else {
            JOptionPane.showMessageDialog(null, "");
        }
    }

    // Cadastrar/Editar Produto
    private void searchProdPanelMouseClicked(MouseEvent e) {
        DbFunctions db = new DbFunctions();
        Connection conn = db.connect_to_db("InfoTech", "postgres", "lbj23kb24mj45");

        if((searchIdProduto.getText().length()>0)){
            try{
                ediProdNomeField.setText(db.getNome_info(conn, "produto", "idproduto", searchIdProduto.getText()));
                ediProdTelefoneField.setText(db.getTelefone_info(conn, "produto", "idproduto", searchIdProduto.getText()));
                ediProdEndField.setText(db.getEndereco_info(conn, "produto", "idproduto", searchIdProduto.getText()));
                ediProdPrecoCompra.setText(db.getPrecoCompra_info(conn, Integer.valueOf(searchIdProduto.getText())));
                ediProdPrecoVenda.setText(db.getPrecoVenda_info(conn, Integer.valueOf(searchIdProduto.getText())));
                ediProdDataField.setText(db.getDataCadastro_info(conn, "produto", "idproduto", searchIdProduto.getText()));
            }catch (Exception exception){
                JOptionPane.showMessageDialog(null, e);
            }
        }
        else {
            JOptionPane.showMessageDialog(null, "Campo vazio");
        }
    }
    private void prodSaveBttMouseClicked(MouseEvent e) {
        DbFunctions db = new DbFunctions();
        Connection conn = db.connect_to_db("InfoTech", "postgres", "lbj23kb24mj45");

        String nome = cadProdNomeField.getText();
        String telefoneImportadora = cadProdTelefoneField.getText();
        String enderecoImportadora = cadProdEndField.getText();
        Integer quantidade = Integer.valueOf(cadQuantidadeField.getText());
        String precoCompra = cadProdPrecoCompra.getText();
        String precoVenda = cadProdPrecoVenda.getText();
        GregorianCalendar calendar = new GregorianCalendar();
        String dataCadastro = String.valueOf(calendar.get(GregorianCalendar.DAY_OF_MONTH)) + "/" +
                String.valueOf(calendar.get(GregorianCalendar.MONTH)+1) + "/" +
                String.valueOf(calendar.get(GregorianCalendar.YEAR));

        if((cadProdNomeField.getText().length()>0) && (cadProdTelefoneField.getText().length()>0) &&
            (cadProdEndField.getText().length()>0) && (cadProdPrecoCompra.getText().length()>0)   &&
            (cadProdPrecoVenda.getText().length()>0)) {
            try{
                Produto produto = new Produto(null, nome, telefoneImportadora, enderecoImportadora, quantidade, precoCompra, precoVenda, dataCadastro);
                db.insert_row_produto(conn,
                        produto.getProdutoNome(),
                        produto.getTelefoneImportadora(),
                        produto.getEnderecoImportadora(),
                        produto.getQuantidade(),
                        produto.getPrecoCompra(),
                        produto.getPrecoVenda(),
                        produto.getDatacadastro());
                JOptionPane.showMessageDialog(null, "Novo produto cadastrado com sucesso");
                clear();
            }catch (Exception prodE){
                JOptionPane.showMessageDialog(null, prodE);
            }
        }
        else {
            JOptionPane.showMessageDialog(null, "Campo vazio");
        }
    }
    private void prodClearBttMouseClicked(MouseEvent e) {
        cadProdNomeField.setText("");
        cadProdTelefoneField.setText("");
        cadProdEndField.setText("");
        cadProdPrecoCompra.setText("");
        cadProdPrecoVenda.setText("");
    }
    private void ediProdSaveBttMouseClicked(MouseEvent e) {
        DbFunctions db = new DbFunctions();
        Connection conn = db.connect_to_db("InfoTech", "postgres", "lbj23kb24mj45");

        if(((ediProdNomeField.getText().length()>0) && (ediProdTelefoneField.getText().length()>0) &&
                (ediProdEndField.getText().length()>0) && (ediProdPrecoCompra.getText().length()>0) && (ediProdPrecoVenda.getText().length()>0)&&
                (ediProdDataField.getText().length()>0))) {
            try {
                db.update_produto(conn, "produto",
                        searchIdProduto.getText(),
                        ediProdNomeField.getText(),
                        ediProdTelefoneField.getText(),
                        ediProdEndField.getText(),
                        String.valueOf(ediProdPrecoCompra.getText()),
                        String.valueOf(ediProdPrecoVenda.getText()),
                        ediProdDataField.getText());
                JOptionPane.showMessageDialog(null, "Cadastro alterado com sucesso");
            } catch (Exception exception) {
                JOptionPane.showMessageDialog(null, exception);
            }
        }
        else {
            JOptionPane.showMessageDialog(null, "Campo vazio");
        }

    }
    private void ediProdClearBttMouseClicked(MouseEvent e) {
        searchIdProduto.setText("");
        ediProdNomeField.setText("");
        ediProdTelefoneField.setText("");
        ediProdPrecoCompra.setText("");
        ediProdPrecoVenda.setText("");
        ediProdDataField.setText("");
        ediProdDataField.setText("");
    }

    // Cadastrar Venda
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
        String datavenda = String.valueOf(calendar.get(GregorianCalendar.DAY_OF_MONTH)) + "/" +
                String.valueOf(calendar.get(GregorianCalendar.MONTH)+1) + "/" +
                String.valueOf(calendar.get(GregorianCalendar.YEAR));

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

    // Mouse Clicked
    private void homeBttMouseClicked(MouseEvent e) {
        clear();
        corAleatoria();
        homePanel.setVisible(true);
        efetuarVendaPanel.setVisible(false);
        cadFuncionarioPanel.setVisible(false);
        ediFuncionarioPanel.setVisible(false);
        cadClientePanel.setVisible(false);
        ediClientePanel.setVisible(false);
        cadProdutoPanel.setVisible(false);
        ediProdutoPanel.setVisible(false);
        verTabelasPanel.setVisible(false);
    }
    private void efetuarVendaBttMouseClicked(MouseEvent e) {
        clear();
        homePanel.setVisible(false);
        efetuarVendaPanel.setVisible(true);
        cadFuncionarioPanel.setVisible(false);
        ediFuncionarioPanel.setVisible(false);
        cadClientePanel.setVisible(false);
        ediClientePanel.setVisible(false);
        cadProdutoPanel.setVisible(false);
        ediProdutoPanel.setVisible(false);
        verTabelasPanel.setVisible(false);
    }
    private void funcBtt1MouseClicked(MouseEvent e) {
        clear();
        homePanel.setVisible(false);
        efetuarVendaPanel.setVisible(false);
        cadFuncionarioPanel.setVisible(true);
        ediFuncionarioPanel.setVisible(false);
        cadClientePanel.setVisible(false);
        ediClientePanel.setVisible(false);
        cadProdutoPanel.setVisible(false);
        ediProdutoPanel.setVisible(false);
        verTabelasPanel.setVisible(false);
    }
    private void funcBtt2MouseClicked(MouseEvent e) {
        clear();
        homePanel.setVisible(false);
        efetuarVendaPanel.setVisible(false);
        cadFuncionarioPanel.setVisible(false);
        ediFuncionarioPanel.setVisible(true);
        cadClientePanel.setVisible(false);
        ediClientePanel.setVisible(false);
        cadProdutoPanel.setVisible(false);
        ediProdutoPanel.setVisible(false);
        verTabelasPanel.setVisible(false);
    }
    private void cliBtt1MouseClicked(MouseEvent e) {
        clear();
        homePanel.setVisible(false);
        efetuarVendaPanel.setVisible(false);
        cadFuncionarioPanel.setVisible(false);
        ediFuncionarioPanel.setVisible(false);
        cadClientePanel.setVisible(true);
        ediClientePanel.setVisible(false);
        cadProdutoPanel.setVisible(false);
        ediProdutoPanel.setVisible(false);
        verTabelasPanel.setVisible(false);
    }
    private void cliBtt2MouseClicked(MouseEvent e) {
        clear();
        homePanel.setVisible(false);
        efetuarVendaPanel.setVisible(false);
        cadFuncionarioPanel.setVisible(false);
        ediFuncionarioPanel.setVisible(false);
        cadClientePanel.setVisible(false);
        ediClientePanel.setVisible(true);
        cadProdutoPanel.setVisible(false);
        ediProdutoPanel.setVisible(false);
        verTabelasPanel.setVisible(false);
    }
    private void prodBtt1MouseClicked(MouseEvent e) {
        clear();
        homePanel.setVisible(false);
        efetuarVendaPanel.setVisible(false);
        cadFuncionarioPanel.setVisible(false);
        ediFuncionarioPanel.setVisible(false);
        cadClientePanel.setVisible(false);
        ediClientePanel.setVisible(false);
        cadProdutoPanel.setVisible(true);
        ediProdutoPanel.setVisible(false);
        verTabelasPanel.setVisible(false);
    }
    private void prodBtt2MouseClicked(MouseEvent e) {
        clear();
        homePanel.setVisible(false);
        efetuarVendaPanel.setVisible(false);
        cadFuncionarioPanel.setVisible(false);
        ediFuncionarioPanel.setVisible(false);
        cadClientePanel.setVisible(false);
        ediClientePanel.setVisible(false);
        cadProdutoPanel.setVisible(false);
        ediProdutoPanel.setVisible(true);
        verTabelasPanel.setVisible(false);
    }
    private void verTabelasBttMouseClicked(MouseEvent e) {
        homePanel.setVisible(false);
        efetuarVendaPanel.setVisible(false);
        cadFuncionarioPanel.setVisible(false);
        ediFuncionarioPanel.setVisible(false);
        cadClientePanel.setVisible(false);
        ediClientePanel.setVisible(false);
        cadProdutoPanel.setVisible(false);
        ediProdutoPanel.setVisible(false);
        verTabelasPanel.setVisible(true);
        fillTableUsuarios();
    }

    // Mouse Entered
    private void homeBttMouseEntered(MouseEvent e) {
        homeBtt.setBackground(new Color(37, 98, 156));
    }
    private void efetuarVendaBttMouseEntered(MouseEvent e) {
        efetuarVendaBtt.setBackground(new Color(56, 118, 29));
    }
    private void funcBtt1MouseEntered(MouseEvent e) {
        funcBtt1.setBackground(new Color(37, 98, 156));
    }
    private void funcBtt2MouseEntered(MouseEvent e) {
        funcBtt2.setBackground(new Color(37, 98, 156));
    }
    private void cliBtt1MouseEntered(MouseEvent e) {
        cliBtt1.setBackground(new Color(37, 98, 156));
    }
    private void cliBtt2MouseEntered(MouseEvent e) {
        cliBtt2.setBackground(new Color(37, 98, 156));
    }
    private void prodBtt1MouseEntered(MouseEvent e) {
        prodBtt1.setBackground(new Color(37, 98, 156));
    }
    private void prodBtt2MouseEntered(MouseEvent e) {
        prodBtt2.setBackground(new Color(37, 98, 156));
    }
    private void verTabelasBttMouseEntered(MouseEvent e) {
        verTabelasBtt.setBackground(new Color(37, 98, 156));
    }

    // Mouse Exited
    private void homeBttMouseExited(MouseEvent e) {
        homeBtt.setBackground(new Color(33, 37, 47));
    }
    private void efetuarVendaBttMouseExited(MouseEvent e) {
        efetuarVendaBtt.setBackground(new Color(33, 37, 47));
    }
    private void funcBtt1MouseExited(MouseEvent e) {
        funcBtt1.setBackground(new Color(33, 37, 47));
    }
    private void funcBtt2MouseExited(MouseEvent e) {
        funcBtt2.setBackground(new Color(33, 37, 47));
    }
    private void cliBtt1MouseExited(MouseEvent e) {
        cliBtt1.setBackground(new Color(33, 37, 47));
    }
    private void cliBtt2MouseExited(MouseEvent e) {
        cliBtt2.setBackground(new Color(33, 37, 47));
    }
    private void prodBtt1MouseExited(MouseEvent e) {
        prodBtt1.setBackground(new Color(33, 37, 47));
    }
    private void prodBtt2MouseExited(MouseEvent e) {
        prodBtt2.setBackground(new Color(33, 37, 47));
    }
    private void verTabelasBttMouseExited(MouseEvent e) {
        verTabelasBtt.setBackground(new Color(33, 37, 47));
    }

    // Mouse Pressed
    private void homeBttMousePressed(MouseEvent e) {
        homeBtt.setBackground(new Color(50, 129, 244));
    }
    private void efetuarVendaBttMousePressed(MouseEvent e) {
        efetuarVendaBtt.setBackground(new Color(87, 187, 45));
    }
    private void funcBtt1MousePressed(MouseEvent e) {
        funcBtt1.setBackground(new Color(50, 129, 244));
    }
    private void funcBtt2MousePressed(MouseEvent e) {
        funcBtt2.setBackground(new Color(50, 129, 244));
    }
    private void cliBtt1MousePressed(MouseEvent e) {
        cliBtt1.setBackground(new Color(50, 129, 244));
    }
    private void cliBtt2MousePressed(MouseEvent e) {
        cliBtt2.setBackground(new Color(50, 129, 244));
    }
    private void prodBtt1MousePressed(MouseEvent e) {
        prodBtt1.setBackground(new Color(50, 129, 244));
    }
    private void prodBtt2MousePressed(MouseEvent e) {
        prodBtt2.setBackground(new Color(50, 129, 244));
    }
    private void verTabelasBttMousePressed(MouseEvent e) {
        verTabelasBtt.setBackground(new Color(50, 129, 244));
    }

    // Mouse Released
    private void homeBttMouseReleased(MouseEvent e) {
        homeBtt.setBackground(new Color(37, 98, 156));
    }
    private void efetuarVendaBttMouseReleased(MouseEvent e) {
        efetuarVendaBtt.setBackground(new Color(56, 118, 29));
    }
    private void funcBtt1MouseReleased(MouseEvent e) {
        funcBtt1.setBackground(new Color(37, 98, 156));
    }
    private void funcBtt2MouseReleased(MouseEvent e) {
        funcBtt2.setBackground(new Color(37, 98, 156));
    }
    private void cliBtt1MouseReleased(MouseEvent e) {
        cliBtt1.setBackground(new Color(37, 98, 156));
    }
    private void cliBtt2MouseReleased(MouseEvent e) {
        cliBtt2.setBackground(new Color(37, 98, 156));
    }
    private void prodBtt1MouseReleased(MouseEvent e) {
        prodBtt1.setBackground(new Color(37, 98, 156));
    }
    private void prodBtt2MouseReleased(MouseEvent e) {
        prodBtt2.setBackground(new Color(37, 98, 156));
    }
    private void verTabelasBttMouseReleased(MouseEvent e) {
        verTabelasBtt.setBackground(new Color(37, 98, 156));
    }

    // Mouse Entered
    private void verUsuariosMouseEntered(MouseEvent e) {
        verUsuarios.setBackground(new Color(42, 83, 143));
        txtUsuarios.setForeground(new Color(255,255,255));
    }
    private void verClientesMouseEntered(MouseEvent e) {
        verClientes.setBackground(new Color(0, 153, 153));
        txtClientes.setForeground(new Color(255,255,255));
    }
    private void verProdutosMouseEntered(MouseEvent e) {
        verProdutos.setBackground(new Color(255,255,102));
        txtProdutos.setForeground(new Color(0,0,0));
    }
    private void verVendasMouseEntered(MouseEvent e) {
        verVendas.setBackground(new Color(0,153,51));
        txtVendas.setForeground(new Color(255,255,255));
    }

    // Mouse Exited
    private void verUsuariosMouseExited(MouseEvent e) {
        verUsuarios.setBackground(new Color(33, 37, 47));
        txtUsuarios.setForeground(new Color(42, 83, 143));
    }
    private void verClientesMouseExited(MouseEvent e) {
        verClientes.setBackground(new Color(33,37,47));
        txtClientes.setForeground(new Color(0, 153, 153));

    }
    private void verProdutosMouseExited(MouseEvent e) {
        verProdutos.setBackground(new Color(33,37,47));
        txtProdutos.setForeground(new Color(255,255,102));
    }
    private void verVendasMouseExited(MouseEvent e) {
        verVendas.setBackground(new Color(33,37,47));
        txtVendas.setForeground(new Color(0,153,51));
    }

    // Mouse Pressed
    private void verUsuariosMousePressed(MouseEvent e) {
        verUsuarios.setBackground(new Color(61,120,207));
    }
    private void verClientesMousePressed(MouseEvent e) {
        verClientes.setBackground(new Color(0,184,184));
    }
    private void verProdutosMousePressed(MouseEvent e) {
        verProdutos.setBackground(new Color(255,255,136));
    }
    private void verVendasMousePressed(MouseEvent e) {
        verVendas.setBackground(new Color(0,189,63));
    }

    // Mouse Released
    private void verUsuariosMouseReleased(MouseEvent e) {
        verUsuarios.setBackground(new Color(42,83,143));
    }
    private void verClientesMouseReleased(MouseEvent e) {
        verClientes.setBackground(new Color(0,153,153));
    }
    private void verProdutosMouseReleased(MouseEvent e) {
        verProdutos.setBackground(new Color(255,255,102));
    }
    private void verVendasMouseReleased(MouseEvent e) {
        verVendas.setBackground(new Color(0,153,51));
    }

    // Mouse Clicked
    private void verUsuariosMouseClicked(MouseEvent e) {
        tabelaClientesPanel.setVisible(false);
        tabelaProdutosPanel.setVisible(false);
        tabelaVendas.setVisible(false);
        tabelaUsuariosPanel.setVisible(true);
        fillTableUsuarios();
    }
    private void verClientesMouseClicked(MouseEvent e) {
        tabelaUsuariosPanel.setVisible(false);
        tabelaProdutosPanel.setVisible(false);
        tabelaVendas.setVisible(false);
        tabelaClientesPanel.setVisible(true);
        fillTableClientes();
    }
    private void verProdutosMouseClicked(MouseEvent e) {
        tabelaClientesPanel.setVisible(false);
        tabelaUsuariosPanel.setVisible(false);
        tabelaVendas.setVisible(false);
        tabelaProdutosPanel.setVisible(true);
        fillTableProdutos();

    }
    private void verVendasMouseClicked(MouseEvent e) {
        tabelaUsuariosPanel.setVisible(false);
        tabelaProdutosPanel.setVisible(false);
        tabelaClientesPanel.setVisible(false);
        tabelaVendas.setVisible(true);
        fillTableVendas();
    }

    private String precTot(Integer idproduto, String quantidade) {
        DbFunctions db = new DbFunctions();
        Connection conn = db.connect_to_db("InfoTech", "postgres", "lbj23kb24mj45");
        String precoVend = String.valueOf(db.getPrecoVenda_info(conn, idproduto));
        String precAtual = venPrecoTotField.getText();
        String precTotal = String.valueOf(Double.parseDouble(precoVend)*Double.parseDouble(quantidade));

        return String.valueOf(Double.valueOf(Double.parseDouble(precAtual)+Double.parseDouble(precTotal)));
    }

    public void fillTableUsuarios(){
        DbFunctions db = new DbFunctions();
        Connection conn = db.connect_to_db("InfoTech", "postgres", "lbj23kb24mj45");
        DefaultTableModel model = (DefaultTableModel) usuariosTable.getModel();
        model.setNumRows(0);

        for(Usuario usuario: db.read_dataUsuarios(conn)){
            model.addRow(new Object[]{
                    usuario.getUser(),
                    usuario.getNome(),
                    usuario.getTelefone(),
                    usuario.getEndereco(),
                    usuario.getSenha(),
                    usuario.getQtdVendas(),
                    usuario.getUsuarioTipo(),
                    usuario.getDataCadastro()
            });
        }
    }
    public void fillTableClientes(){
        DbFunctions db = new DbFunctions();
        Connection conn = db.connect_to_db("InfoTech", "postgres", "lbj23kb24mj45");
        DefaultTableModel model = (DefaultTableModel) clientesTable.getModel();
        clientesTable.setRowSorter(new TableRowSorter<TableModel>(model));
        model.setNumRows(0);

        for(Cliente cliente: db.read_dataClientes(conn)){
            model.addRow(new Object[]{
                    cliente.getIdCliente(),
                    cliente.getNome(),
                    cliente.getTelefone(),
                    cliente.getEndereco(),
                    cliente.getUserUsuario(),
                    cliente.getDataCadastro()
            });
        }
    }
    public void fillTableProdutos(){
        DbFunctions db = new DbFunctions();
        Connection conn = db.connect_to_db("InfoTech", "postgres", "lbj23kb24mj45");
        DefaultTableModel model = (DefaultTableModel) produtosTable.getModel();
        produtosTable.setRowSorter(new TableRowSorter<TableModel>(model));
        model.setNumRows(0);

        for(Produto produto: db.read_dataProdutos(conn)){
            model.addRow(new Object[]{
                    produto.getIdProduto(),
                    produto.getProdutoNome(),
                    produto.getTelefoneImportadora(),
                    produto.getEnderecoImportadora(),
                    produto.getQuantidade(),
                    produto.getPrecoCompra(),
                    produto.getPrecoVenda(),
                    produto.getDatacadastro()
            });
        }
    }
    public void fillTableVendas(){
        DbFunctions db = new DbFunctions();
        Connection conn = db.connect_to_db("InfoTech", "postgres", "lbj23kb24mj45");
        DefaultTableModel model = (DefaultTableModel) vendasTable.getModel();
        vendasTable.setRowSorter(new TableRowSorter<TableModel>(model));
        model.setNumRows(0);
        for(Venda venda: db.read_dataVendas(conn)){
            model.addRow(new Object[]{
                    venda.getIdVenda(),
                    venda.getDescricao(),
                    venda.getIdCliente(),
                    venda.getIdUsuario(),
                    venda.getPrecoTotal(),
                    venda.getDataVenda()
            });
        }
    }
    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        mainPanel = new JPanel();
        panel3 = new JPanel();
        logoPanel = new JPanel();
        infoPanel = new JPanel();
        nomeGerenteLbl = new JLabel();
        manIconPanel = new JPanel();
        managerIcon = new JLabel();
        homeBtt = new JPanel();
        label1 = new JLabel();
        funcBtt1 = new JPanel();
        label2 = new JLabel();
        funcBtt2 = new JPanel();
        label3 = new JLabel();
        cliBtt1 = new JPanel();
        label4 = new JLabel();
        cliBtt2 = new JPanel();
        label5 = new JLabel();
        prodBtt1 = new JPanel();
        label6 = new JLabel();
        prodBtt2 = new JPanel();
        label7 = new JLabel();
        efetuarVendaBtt = new JPanel();
        label57 = new JLabel();
        verTabelasBtt = new JPanel();
        label59 = new JLabel();
        centralPane = new JPanel();
        homePanel = new JPanel();
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
        cadFuncionarioPanel = new JPanel();
        panel1 = new JPanel();
        label15 = new JLabel();
        label18 = new JLabel();
        cadFuncNomeField = new JTextField();
        separator3 = new JSeparator();
        label19 = new JLabel();
        cadFuncTelField = new JTextField();
        separator7 = new JSeparator();
        label20 = new JLabel();
        cadFuncEndField = new JTextField();
        separator8 = new JSeparator();
        label21 = new JLabel();
        cadFuncUserField = new JTextField();
        separator9 = new JSeparator();
        label22 = new JLabel();
        cadFuncSenField = new JPasswordField();
        separator10 = new JSeparator();
        cadFuncCleaBtt = new JButton();
        cadFuncSaveBtt = new JButton();
        panel8 = new JPanel();
        ediFuncionarioPanel = new JPanel();
        label28 = new JLabel();
        edifuncNomeField = new JTextField();
        separator16 = new JSeparator();
        edifuncTelField = new JTextField();
        separator17 = new JSeparator();
        edifuncEndField = new JTextField();
        separator18 = new JSeparator();
        edifuncUserField = new JTextField();
        separator19 = new JSeparator();
        edifuncSenField = new JPasswordField();
        separator20 = new JSeparator();
        ediFuncClearBtt = new JButton();
        ediFuncSaveBtt = new JButton();
        label29 = new JLabel();
        label30 = new JLabel();
        panel2 = new JPanel();
        label33 = new JLabel();
        label34 = new JLabel();
        label35 = new JLabel();
        label36 = new JLabel();
        searchUser = new JTextField();
        separator21 = new JSeparator();
        searchFuncPanel = new JPanel();
        label37 = new JLabel();
        label42 = new JLabel();
        edifuncQtdField = new JTextField();
        separator22 = new JSeparator();
        label43 = new JLabel();
        edifuncTipoField = new JTextField();
        separator23 = new JSeparator();
        label44 = new JLabel();
        edifuncDataField = new JTextField();
        separator24 = new JSeparator();
        panel9 = new JPanel();
        cadClientePanel = new JPanel();
        sidePanel = new JPanel();
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
        ediClientePanel = new JPanel();
        label31 = new JLabel();
        ediClienteNomeField = new JTextField();
        separator25 = new JSeparator();
        label32 = new JLabel();
        ediClienteTelefoneField = new JTextField();
        separator26 = new JSeparator();
        label38 = new JLabel();
        ediClienteEnderecoField = new JTextField();
        label40 = new JLabel();
        ediClienteUserField = new JTextField();
        separator28 = new JSeparator();
        separator29 = new JSeparator();
        ediClienteSaveBtt = new JButton();
        ediClienteClearBtt = new JButton();
        label41 = new JLabel();
        sidePanel3 = new JPanel();
        label45 = new JLabel();
        searchID = new JTextField();
        separator30 = new JSeparator();
        label47 = new JLabel();
        ediClienteDataField = new JTextField();
        separator31 = new JSeparator();
        searchClientPanel = new JPanel();
        label46 = new JLabel();
        panel11 = new JPanel();
        cadProdutoPanel = new JPanel();
        sidePanel2 = new JPanel();
        label16 = new JLabel();
        cadProdNomeField = new JTextField();
        separator11 = new JSeparator();
        label17 = new JLabel();
        cadProdTelefoneField = new JTextField();
        separator12 = new JSeparator();
        label23 = new JLabel();
        cadProdPrecoCompra = new JTextField();
        label24 = new JLabel();
        cadProdPrecoVenda = new JTextField();
        separator13 = new JSeparator();
        separator15 = new JSeparator();
        prodSaveBtt = new JButton();
        prodClearBtt = new JButton();
        label26 = new JLabel();
        label27 = new JLabel();
        cadProdEndField = new JTextField();
        separator39 = new JSeparator();
        panel12 = new JPanel();
        label25 = new JLabel();
        cadQuantidadeField = new JTextField();
        separator27 = new JSeparator();
        label52 = new JLabel();
        label64 = new JLabel();
        ediProdutoPanel = new JPanel();
        sidePanel4 = new JPanel();
        label48 = new JLabel();
        ediProdNomeField = new JTextField();
        separator32 = new JSeparator();
        label49 = new JLabel();
        ediProdTelefoneField = new JTextField();
        separator33 = new JSeparator();
        label50 = new JLabel();
        ediProdPrecoCompra = new JTextField();
        label51 = new JLabel();
        ediProdPrecoVenda = new JTextField();
        separator34 = new JSeparator();
        separator36 = new JSeparator();
        ediProdSaveBtt = new JButton();
        ediProdClearBtt = new JButton();
        label53 = new JLabel();
        label54 = new JLabel();
        ediProdDataField = new JTextField();
        separator37 = new JSeparator();
        label55 = new JLabel();
        searchIdProduto = new JTextField();
        separator38 = new JSeparator();
        searchProdPanel = new JPanel();
        label56 = new JLabel();
        label58 = new JLabel();
        ediProdEndField = new JTextField();
        separator41 = new JSeparator();
        panel13 = new JPanel();
        label67 = new JLabel();
        label68 = new JLabel();
        verTabelasPanel = new JPanel();
        panel4 = new JPanel();
        label66 = new JLabel();
        verUsuarios = new JPanel();
        txtUsuarios = new JLabel();
        verClientes = new JPanel();
        txtClientes = new JLabel();
        verProdutos = new JPanel();
        txtProdutos = new JLabel();
        verVendas = new JPanel();
        txtVendas = new JLabel();
        panel5 = new JPanel();
        tabelaUsuariosPanel = new JPanel();
        usuariosScroll = new JScrollPane();
        usuariosTable = new JTable();
        tabelaClientesPanel = new JPanel();
        clientesScroll = new JScrollPane();
        clientesTable = new JTable();
        tabelaProdutosPanel = new JPanel();
        produtosScroll = new JScrollPane();
        produtosTable = new JTable();
        tabelaVendas = new JPanel();
        vendasScroll = new JScrollPane();
        vendasTable = new JTable();

        //======== mainPanel ========
        {
            mainPanel.setFont(new Font("Comic Sans MS", Font.PLAIN, 11));
            mainPanel.setBackground(new Color(0x21252f));
            mainPanel.setBorder(null);
            mainPanel.setForeground(new Color(0x00cccc));

            //======== panel3 ========
            {
                panel3.setBackground(new Color(0x21252f));
                panel3.setForeground(new Color(0x21252f));

                //======== logoPanel ========
                {
                    logoPanel.setBackground(new Color(0x21252f));

                    GroupLayout logoPanelLayout = new GroupLayout(logoPanel);
                    logoPanel.setLayout(logoPanelLayout);
                    logoPanelLayout.setHorizontalGroup(
                        logoPanelLayout.createParallelGroup()
                            .addGap(0, 0, Short.MAX_VALUE)
                    );
                    logoPanelLayout.setVerticalGroup(
                        logoPanelLayout.createParallelGroup()
                            .addGap(0, 0, Short.MAX_VALUE)
                    );
                }

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

                //======== funcBtt1 ========
                {
                    funcBtt1.setBackground(new Color(0x21252f));
                    funcBtt1.setBorder(null);
                    funcBtt1.addMouseListener(new MouseAdapter() {
                        @Override
                        public void mouseClicked(MouseEvent e) {
                            funcBtt1MouseClicked(e);
                        }
                        @Override
                        public void mouseEntered(MouseEvent e) {
                            funcBtt1MouseEntered(e);
                        }
                        @Override
                        public void mouseExited(MouseEvent e) {
                            funcBtt1MouseExited(e);
                        }
                        @Override
                        public void mousePressed(MouseEvent e) {
                            funcBtt1MousePressed(e);
                        }
                        @Override
                        public void mouseReleased(MouseEvent e) {
                            funcBtt1MouseReleased(e);
                        }
                    });

                    //---- label2 ----
                    label2.setText("Cadastrar funcion\u00e1rio");
                    label2.setForeground(Color.white);
                    label2.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 18));
                    label2.setBackground(new Color(0x21252f));
                    label2.setHorizontalAlignment(SwingConstants.LEFT);

                    GroupLayout funcBtt1Layout = new GroupLayout(funcBtt1);
                    funcBtt1.setLayout(funcBtt1Layout);
                    funcBtt1Layout.setHorizontalGroup(
                        funcBtt1Layout.createParallelGroup()
                            .addGroup(funcBtt1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(label2)
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    );
                    funcBtt1Layout.setVerticalGroup(
                        funcBtt1Layout.createParallelGroup()
                            .addGroup(funcBtt1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(label2, GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                                .addContainerGap())
                    );
                }

                //======== funcBtt2 ========
                {
                    funcBtt2.setBackground(new Color(0x21252f));
                    funcBtt2.setBorder(null);
                    funcBtt2.addMouseListener(new MouseAdapter() {
                        @Override
                        public void mouseClicked(MouseEvent e) {
                            funcBtt2MouseClicked(e);
                        }
                        @Override
                        public void mouseEntered(MouseEvent e) {
                            funcBtt2MouseEntered(e);
                        }
                        @Override
                        public void mouseExited(MouseEvent e) {
                            funcBtt2MouseExited(e);
                        }
                        @Override
                        public void mousePressed(MouseEvent e) {
                            funcBtt2MousePressed(e);
                        }
                        @Override
                        public void mouseReleased(MouseEvent e) {
                            funcBtt2MouseReleased(e);
                        }
                    });

                    //---- label3 ----
                    label3.setText("Editar funcion\u00e1rio");
                    label3.setForeground(Color.white);
                    label3.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 18));
                    label3.setBackground(new Color(0x21252f));
                    label3.setHorizontalAlignment(SwingConstants.LEFT);

                    GroupLayout funcBtt2Layout = new GroupLayout(funcBtt2);
                    funcBtt2.setLayout(funcBtt2Layout);
                    funcBtt2Layout.setHorizontalGroup(
                        funcBtt2Layout.createParallelGroup()
                            .addGroup(funcBtt2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(label3)
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    );
                    funcBtt2Layout.setVerticalGroup(
                        funcBtt2Layout.createParallelGroup()
                            .addGroup(GroupLayout.Alignment.TRAILING, funcBtt2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(label3, GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
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

                //======== cliBtt2 ========
                {
                    cliBtt2.setBackground(new Color(0x21252f));
                    cliBtt2.setBorder(null);
                    cliBtt2.addMouseListener(new MouseAdapter() {
                        @Override
                        public void mouseClicked(MouseEvent e) {
                            cliBtt2MouseClicked(e);
                        }
                        @Override
                        public void mouseEntered(MouseEvent e) {
                            cliBtt2MouseEntered(e);
                        }
                        @Override
                        public void mouseExited(MouseEvent e) {
                            cliBtt2MouseExited(e);
                        }
                        @Override
                        public void mousePressed(MouseEvent e) {
                            cliBtt2MousePressed(e);
                        }
                        @Override
                        public void mouseReleased(MouseEvent e) {
                            cliBtt2MouseReleased(e);
                        }
                    });

                    //---- label5 ----
                    label5.setText("Editar cliente");
                    label5.setForeground(Color.white);
                    label5.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 18));
                    label5.setBackground(new Color(0x21252f));
                    label5.setHorizontalAlignment(SwingConstants.LEFT);

                    GroupLayout cliBtt2Layout = new GroupLayout(cliBtt2);
                    cliBtt2.setLayout(cliBtt2Layout);
                    cliBtt2Layout.setHorizontalGroup(
                        cliBtt2Layout.createParallelGroup()
                            .addGroup(cliBtt2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(label5)
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    );
                    cliBtt2Layout.setVerticalGroup(
                        cliBtt2Layout.createParallelGroup()
                            .addGroup(GroupLayout.Alignment.TRAILING, cliBtt2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(label5, GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                                .addContainerGap())
                    );
                }

                //======== prodBtt1 ========
                {
                    prodBtt1.setBackground(new Color(0x21252f));
                    prodBtt1.setBorder(null);
                    prodBtt1.addMouseListener(new MouseAdapter() {
                        @Override
                        public void mouseClicked(MouseEvent e) {
                            prodBtt1MouseClicked(e);
                        }
                        @Override
                        public void mouseEntered(MouseEvent e) {
                            prodBtt1MouseEntered(e);
                        }
                        @Override
                        public void mouseExited(MouseEvent e) {
                            prodBtt1MouseExited(e);
                        }
                        @Override
                        public void mousePressed(MouseEvent e) {
                            prodBtt1MousePressed(e);
                        }
                        @Override
                        public void mouseReleased(MouseEvent e) {
                            prodBtt1MouseReleased(e);
                        }
                    });

                    //---- label6 ----
                    label6.setText("Cadastrar Produto");
                    label6.setForeground(Color.white);
                    label6.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 18));
                    label6.setBackground(new Color(0x21252f));
                    label6.setHorizontalAlignment(SwingConstants.LEFT);

                    GroupLayout prodBtt1Layout = new GroupLayout(prodBtt1);
                    prodBtt1.setLayout(prodBtt1Layout);
                    prodBtt1Layout.setHorizontalGroup(
                        prodBtt1Layout.createParallelGroup()
                            .addGroup(prodBtt1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(label6)
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    );
                    prodBtt1Layout.setVerticalGroup(
                        prodBtt1Layout.createParallelGroup()
                            .addGroup(prodBtt1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(label6, GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                                .addContainerGap())
                    );
                }

                //======== prodBtt2 ========
                {
                    prodBtt2.setBackground(new Color(0x21252f));
                    prodBtt2.setFont(new Font("Comic Sans MS", Font.PLAIN, 11));
                    prodBtt2.setBorder(null);
                    prodBtt2.addMouseListener(new MouseAdapter() {
                        @Override
                        public void mouseClicked(MouseEvent e) {
                            prodBtt2MouseClicked(e);
                        }
                        @Override
                        public void mouseEntered(MouseEvent e) {
                            prodBtt2MouseEntered(e);
                        }
                        @Override
                        public void mouseExited(MouseEvent e) {
                            prodBtt2MouseExited(e);
                        }
                        @Override
                        public void mousePressed(MouseEvent e) {
                            prodBtt2MousePressed(e);
                        }
                        @Override
                        public void mouseReleased(MouseEvent e) {
                            prodBtt2MouseReleased(e);
                        }
                    });

                    //---- label7 ----
                    label7.setText("Editar Produto");
                    label7.setForeground(Color.white);
                    label7.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 18));
                    label7.setBackground(new Color(0x21252f));
                    label7.setHorizontalAlignment(SwingConstants.LEFT);

                    GroupLayout prodBtt2Layout = new GroupLayout(prodBtt2);
                    prodBtt2.setLayout(prodBtt2Layout);
                    prodBtt2Layout.setHorizontalGroup(
                        prodBtt2Layout.createParallelGroup()
                            .addGroup(prodBtt2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(label7)
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    );
                    prodBtt2Layout.setVerticalGroup(
                        prodBtt2Layout.createParallelGroup()
                            .addGroup(prodBtt2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(label7, GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
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
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    );
                    efetuarVendaBttLayout.setVerticalGroup(
                        efetuarVendaBttLayout.createParallelGroup()
                            .addGroup(efetuarVendaBttLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(label57, GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                                .addContainerGap())
                    );
                }

                //======== verTabelasBtt ========
                {
                    verTabelasBtt.setBackground(new Color(0x21252f));
                    verTabelasBtt.setForeground(Color.black);
                    verTabelasBtt.addMouseListener(new MouseAdapter() {
                        @Override
                        public void mouseClicked(MouseEvent e) {
                            verTabelasBttMouseClicked(e);
                        }
                        @Override
                        public void mouseEntered(MouseEvent e) {
                            verTabelasBttMouseEntered(e);
                        }
                        @Override
                        public void mouseExited(MouseEvent e) {
                            verTabelasBttMouseExited(e);
                        }
                        @Override
                        public void mousePressed(MouseEvent e) {
                            verTabelasBttMousePressed(e);
                        }
                        @Override
                        public void mouseReleased(MouseEvent e) {
                            verTabelasBttMouseReleased(e);
                        }
                    });

                    //---- label59 ----
                    label59.setText("Vizualizar tabelas");
                    label59.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 18));
                    label59.setForeground(Color.white);

                    GroupLayout verTabelasBttLayout = new GroupLayout(verTabelasBtt);
                    verTabelasBtt.setLayout(verTabelasBttLayout);
                    verTabelasBttLayout.setHorizontalGroup(
                        verTabelasBttLayout.createParallelGroup()
                            .addGroup(verTabelasBttLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(label59)
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    );
                    verTabelasBttLayout.setVerticalGroup(
                        verTabelasBttLayout.createParallelGroup()
                            .addGroup(verTabelasBttLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(label59, GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                                .addContainerGap())
                    );
                }

                GroupLayout panel3Layout = new GroupLayout(panel3);
                panel3.setLayout(panel3Layout);
                panel3Layout.setHorizontalGroup(
                    panel3Layout.createParallelGroup()
                        .addGroup(panel3Layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(panel3Layout.createParallelGroup()
                                .addGroup(panel3Layout.createSequentialGroup()
                                    .addGroup(panel3Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                        .addComponent(logoPanel, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(infoPanel, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGap(72, 72, 72))
                                .addComponent(efetuarVendaBtt, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(homeBtt, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(funcBtt1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(funcBtt2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cliBtt1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cliBtt2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(prodBtt1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(prodBtt2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(verTabelasBtt, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                );
                panel3Layout.setVerticalGroup(
                    panel3Layout.createParallelGroup()
                        .addGroup(panel3Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(logoPanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(infoPanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addGap(24, 24, 24)
                            .addComponent(homeBtt, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(efetuarVendaBtt, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(funcBtt1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(funcBtt2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(cliBtt1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(cliBtt2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(prodBtt1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(prodBtt2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(verTabelasBtt, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                );
            }

            //======== centralPane ========
            {
                centralPane.setBackground(new Color(0x21252f));
                centralPane.setForeground(new Color(0x21252f));
                centralPane.setLayout(new CardLayout());

                //======== homePanel ========
                {
                    homePanel.setForeground(new Color(0x21252f));
                    homePanel.setBackground(new Color(0x21252f));

                    //---- label14 ----
                    label14.setIcon(new ImageIcon(getClass().getResource("/icons/homeLogo.png")));
                    label14.setForeground(new Color(0x21252f));

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

                    GroupLayout homePanelLayout = new GroupLayout(homePanel);
                    homePanel.setLayout(homePanelLayout);
                    homePanelLayout.setHorizontalGroup(
                        homePanelLayout.createParallelGroup()
                            .addComponent(label14, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(homePanelLayout.createSequentialGroup()
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(homePanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                    .addComponent(greetLbl, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(homeDateLbl, GroupLayout.PREFERRED_SIZE, 500, GroupLayout.PREFERRED_SIZE))
                                .addContainerGap())
                    );
                    homePanelLayout.setVerticalGroup(
                        homePanelLayout.createParallelGroup()
                            .addGroup(GroupLayout.Alignment.TRAILING, homePanelLayout.createSequentialGroup()
                                .addComponent(label14)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(greetLbl, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(homeDateLbl, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(589, Short.MAX_VALUE))
                    );
                }
                centralPane.add(homePanel, "card2");

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
                            .addGroup(efetuarVendaPanelLayout.createSequentialGroup()
                                .addComponent(panel7, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGroup(efetuarVendaPanelLayout.createParallelGroup()
                                    .addGroup(efetuarVendaPanelLayout.createSequentialGroup()
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(efetuarVendaPanelLayout.createParallelGroup()
                                            .addGroup(efetuarVendaPanelLayout.createSequentialGroup()
                                                .addGap(97, 97, 97)
                                                .addComponent(SaveBttVendas, GroupLayout.PREFERRED_SIZE, 186, GroupLayout.PREFERRED_SIZE))
                                            .addGroup(efetuarVendaPanelLayout.createSequentialGroup()
                                                .addGroup(efetuarVendaPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(label61)
                                                    .addComponent(venIdProdutoField)
                                                    .addComponent(separator40)
                                                    .addComponent(label62)
                                                    .addComponent(venIdUserField)
                                                    .addComponent(separator42)
                                                    .addComponent(label63)
                                                    .addComponent(venIdClienteField)
                                                    .addComponent(label65)
                                                    .addComponent(venQtdField)
                                                    .addComponent(separator45)
                                                    .addComponent(label60, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(separator44, GroupLayout.PREFERRED_SIZE, 380, GroupLayout.PREFERRED_SIZE)
                                                    .addGroup(efetuarVendaPanelLayout.createSequentialGroup()
                                                        .addComponent(addBttVendas, GroupLayout.PREFERRED_SIZE, 186, GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(ClearBttVendas, GroupLayout.PREFERRED_SIZE, 188, GroupLayout.PREFERRED_SIZE)))
                                                .addGap(18, 18, 18)
                                                .addGroup(efetuarVendaPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(label11)
                                                    .addGroup(efetuarVendaPanelLayout.createSequentialGroup()
                                                        .addComponent(label39)
                                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(venPrecoTotField, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                                    .addGroup(efetuarVendaPanelLayout.createSequentialGroup()
                                        .addGap(26, 26, 26)
                                        .addComponent(panel14, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 300, Short.MAX_VALUE)
                                .addComponent(scrollPane1, GroupLayout.PREFERRED_SIZE, 430, GroupLayout.PREFERRED_SIZE))
                    );
                    efetuarVendaPanelLayout.setVerticalGroup(
                        efetuarVendaPanelLayout.createParallelGroup()
                            .addComponent(scrollPane1)
                            .addGroup(GroupLayout.Alignment.TRAILING, efetuarVendaPanelLayout.createSequentialGroup()
                                .addComponent(panel14, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(label60, GroupLayout.PREFERRED_SIZE, 84, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(efetuarVendaPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                    .addComponent(label61)
                                    .addComponent(label11))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(efetuarVendaPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                    .addComponent(venIdProdutoField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(label39)
                                    .addComponent(venPrecoTotField))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(separator40, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(label65)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(venQtdField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(separator45, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(label62)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(venIdUserField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(separator42, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(label63)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(venIdClienteField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(separator44, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(efetuarVendaPanelLayout.createParallelGroup()
                                    .addComponent(ClearBttVendas)
                                    .addComponent(addBttVendas))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(SaveBttVendas)
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(panel7, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    );
                }
                centralPane.add(efetuarVendaPanel, "card8");

                //======== cadFuncionarioPanel ========
                {
                    cadFuncionarioPanel.setBackground(new Color(0x21252f));
                    cadFuncionarioPanel.setForeground(new Color(0x21252f));

                    //======== panel1 ========
                    {
                        panel1.setBackground(new Color(0x2a538f));

                        GroupLayout panel1Layout = new GroupLayout(panel1);
                        panel1.setLayout(panel1Layout);
                        panel1Layout.setHorizontalGroup(
                            panel1Layout.createParallelGroup()
                                .addGap(0, 80, Short.MAX_VALUE)
                        );
                        panel1Layout.setVerticalGroup(
                            panel1Layout.createParallelGroup()
                                .addGap(0, 900, Short.MAX_VALUE)
                        );
                    }

                    //---- label15 ----
                    label15.setText("Cadastrar funcion\u00e1rio");
                    label15.setFont(new Font("Yu Gothic Light", Font.PLAIN, 36));
                    label15.setForeground(Color.white);
                    label15.setBackground(Color.white);

                    //---- label18 ----
                    label18.setText("Nome");
                    label18.setForeground(Color.white);
                    label18.setBackground(Color.pink);
                    label18.setFont(new Font("Verdana", Font.PLAIN, 12));

                    //---- cadFuncNomeField ----
                    cadFuncNomeField.setBackground(new Color(0x21252f));
                    cadFuncNomeField.setBorder(null);
                    cadFuncNomeField.setForeground(Color.white);

                    //---- separator3 ----
                    separator3.setForeground(new Color(0x2a538f));
                    separator3.setBackground(new Color(0x2a538f));

                    //---- label19 ----
                    label19.setText("Telefone");
                    label19.setForeground(Color.white);
                    label19.setBackground(Color.pink);
                    label19.setFont(new Font("Verdana", Font.PLAIN, 12));

                    //---- cadFuncTelField ----
                    cadFuncTelField.setBackground(new Color(0x21252f));
                    cadFuncTelField.setBorder(null);
                    cadFuncTelField.setForeground(Color.white);

                    //---- separator7 ----
                    separator7.setForeground(new Color(0x2a538f));
                    separator7.setBackground(new Color(0x2a538f));

                    //---- label20 ----
                    label20.setText("Endere\u00e7o");
                    label20.setForeground(Color.white);
                    label20.setBackground(Color.pink);
                    label20.setFont(new Font("Verdana", Font.PLAIN, 12));

                    //---- cadFuncEndField ----
                    cadFuncEndField.setBackground(new Color(0x21252f));
                    cadFuncEndField.setBorder(null);
                    cadFuncEndField.setForeground(Color.white);

                    //---- separator8 ----
                    separator8.setForeground(new Color(0x2a538f));
                    separator8.setBackground(new Color(0x2a538f));

                    //---- label21 ----
                    label21.setText("Usu\u00e1rio");
                    label21.setForeground(Color.white);
                    label21.setBackground(Color.pink);
                    label21.setFont(new Font("Verdana", Font.PLAIN, 12));

                    //---- cadFuncUserField ----
                    cadFuncUserField.setBackground(new Color(0x21252f));
                    cadFuncUserField.setBorder(null);
                    cadFuncUserField.setForeground(Color.white);

                    //---- separator9 ----
                    separator9.setForeground(new Color(0x2a538f));
                    separator9.setBackground(new Color(0x2a538f));

                    //---- label22 ----
                    label22.setText("Senha");
                    label22.setForeground(Color.white);
                    label22.setBackground(Color.pink);
                    label22.setFont(new Font("Verdana", Font.PLAIN, 12));

                    //---- cadFuncSenField ----
                    cadFuncSenField.setBorder(null);
                    cadFuncSenField.setBackground(new Color(0x21252f));
                    cadFuncSenField.setForeground(Color.white);

                    //---- separator10 ----
                    separator10.setForeground(new Color(0x2a538f));
                    separator10.setBackground(new Color(0x2a538f));

                    //---- cadFuncCleaBtt ----
                    cadFuncCleaBtt.setText("Limpar");
                    cadFuncCleaBtt.setBackground(new Color(0x21252f));
                    cadFuncCleaBtt.setForeground(Color.white);
                    cadFuncCleaBtt.addMouseListener(new MouseAdapter() {
                        @Override
                        public void mouseClicked(MouseEvent e) {
                            cadFuncClearBttMouseClicked(e);
                        }
                    });

                    //---- cadFuncSaveBtt ----
                    cadFuncSaveBtt.setText("Salvar");
                    cadFuncSaveBtt.setBackground(new Color(0x21252f));
                    cadFuncSaveBtt.setForeground(Color.white);
                    cadFuncSaveBtt.addMouseListener(new MouseAdapter() {
                        @Override
                        public void mouseClicked(MouseEvent e) {
                            cadFuncSaveBttMouseClicked(e);
                        }
                    });

                    //======== panel8 ========
                    {
                        panel8.setBackground(new Color(0x21252f));

                        GroupLayout panel8Layout = new GroupLayout(panel8);
                        panel8.setLayout(panel8Layout);
                        panel8Layout.setHorizontalGroup(
                            panel8Layout.createParallelGroup()
                                .addGap(0, 380, Short.MAX_VALUE)
                        );
                        panel8Layout.setVerticalGroup(
                            panel8Layout.createParallelGroup()
                                .addGap(0, 136, Short.MAX_VALUE)
                        );
                    }

                    GroupLayout cadFuncionarioPanelLayout = new GroupLayout(cadFuncionarioPanel);
                    cadFuncionarioPanel.setLayout(cadFuncionarioPanelLayout);
                    cadFuncionarioPanelLayout.setHorizontalGroup(
                        cadFuncionarioPanelLayout.createParallelGroup()
                            .addGroup(cadFuncionarioPanelLayout.createSequentialGroup()
                                .addComponent(panel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGroup(cadFuncionarioPanelLayout.createParallelGroup()
                                    .addGroup(cadFuncionarioPanelLayout.createSequentialGroup()
                                        .addGap(26, 26, 26)
                                        .addComponent(panel8, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                    .addGroup(cadFuncionarioPanelLayout.createSequentialGroup()
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(cadFuncionarioPanelLayout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(cadFuncSaveBtt, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)
                                            .addComponent(separator10, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)
                                            .addComponent(cadFuncSenField, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)
                                            .addComponent(separator9, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)
                                            .addComponent(cadFuncUserField, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)
                                            .addComponent(separator8, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)
                                            .addComponent(cadFuncEndField, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)
                                            .addComponent(cadFuncTelField, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)
                                            .addComponent(separator3, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)
                                            .addComponent(label18, GroupLayout.Alignment.LEADING)
                                            .addComponent(label19, GroupLayout.Alignment.LEADING)
                                            .addComponent(label20, GroupLayout.Alignment.LEADING)
                                            .addComponent(label21, GroupLayout.Alignment.LEADING)
                                            .addComponent(label22, GroupLayout.Alignment.LEADING)
                                            .addComponent(cadFuncNomeField, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)
                                            .addComponent(label15, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)
                                            .addComponent(separator7, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)
                                            .addComponent(cadFuncCleaBtt, GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE))))
                                .addContainerGap(786, Short.MAX_VALUE))
                    );
                    cadFuncionarioPanelLayout.setVerticalGroup(
                        cadFuncionarioPanelLayout.createParallelGroup()
                            .addGroup(cadFuncionarioPanelLayout.createSequentialGroup()
                                .addComponent(panel8, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(label15, GroupLayout.PREFERRED_SIZE, 84, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(label18)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cadFuncNomeField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(separator3, GroupLayout.PREFERRED_SIZE, 3, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(label19)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cadFuncTelField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(separator7, GroupLayout.PREFERRED_SIZE, 3, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(label20)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cadFuncEndField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(separator8, GroupLayout.PREFERRED_SIZE, 3, GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(label21)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cadFuncUserField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(separator9, GroupLayout.PREFERRED_SIZE, 3, GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(label22)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cadFuncSenField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(separator10, GroupLayout.PREFERRED_SIZE, 3, GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(cadFuncSaveBtt)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cadFuncCleaBtt)
                                .addContainerGap(261, Short.MAX_VALUE))
                            .addComponent(panel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    );
                }
                centralPane.add(cadFuncionarioPanel, "card3");

                //======== ediFuncionarioPanel ========
                {
                    ediFuncionarioPanel.setForeground(new Color(0x21252f));
                    ediFuncionarioPanel.setBackground(new Color(0x21252f));

                    //---- label28 ----
                    label28.setText("Editar cadastro funcion\u00e1rio");
                    label28.setFont(new Font("Yu Gothic Light", Font.PLAIN, 36));
                    label28.setForeground(Color.white);
                    label28.setBackground(Color.white);

                    //---- edifuncNomeField ----
                    edifuncNomeField.setBackground(new Color(0x21252f));
                    edifuncNomeField.setBorder(null);
                    edifuncNomeField.setForeground(Color.white);

                    //---- separator16 ----
                    separator16.setForeground(new Color(0x2a538f));
                    separator16.setBackground(new Color(0x2a538f));

                    //---- edifuncTelField ----
                    edifuncTelField.setBackground(new Color(0x21252f));
                    edifuncTelField.setBorder(null);
                    edifuncTelField.setForeground(Color.white);

                    //---- separator17 ----
                    separator17.setForeground(new Color(0x2a538f));
                    separator17.setBackground(new Color(0x2a538f));

                    //---- edifuncEndField ----
                    edifuncEndField.setBackground(new Color(0x21252f));
                    edifuncEndField.setBorder(null);
                    edifuncEndField.setForeground(Color.white);

                    //---- separator18 ----
                    separator18.setForeground(new Color(0x2a538f));
                    separator18.setBackground(new Color(0x2a538f));

                    //---- edifuncUserField ----
                    edifuncUserField.setBackground(new Color(0x21252f));
                    edifuncUserField.setBorder(null);
                    edifuncUserField.setForeground(Color.white);

                    //---- separator19 ----
                    separator19.setForeground(new Color(0x2a538f));
                    separator19.setBackground(new Color(0x2a538f));

                    //---- edifuncSenField ----
                    edifuncSenField.setBorder(null);
                    edifuncSenField.setBackground(new Color(0x21252f));
                    edifuncSenField.setForeground(Color.white);

                    //---- separator20 ----
                    separator20.setForeground(new Color(0x2a538f));
                    separator20.setBackground(new Color(0x2a538f));

                    //---- ediFuncClearBtt ----
                    ediFuncClearBtt.setText("Limpar");
                    ediFuncClearBtt.setBackground(new Color(0x21252f));
                    ediFuncClearBtt.setForeground(Color.white);
                    ediFuncClearBtt.addMouseListener(new MouseAdapter() {
                        @Override
                        public void mouseClicked(MouseEvent e) {
                            ediFuncClearBttMouseClicked(e);
                        }
                    });

                    //---- ediFuncSaveBtt ----
                    ediFuncSaveBtt.setText("Salvar");
                    ediFuncSaveBtt.setBackground(new Color(0x21252f));
                    ediFuncSaveBtt.setForeground(Color.white);
                    ediFuncSaveBtt.addMouseListener(new MouseAdapter() {
                        @Override
                        public void mouseClicked(MouseEvent e) {
                            ediFuncSaveBttMouseClicked(e);
                        }
                    });

                    //---- label29 ----
                    label29.setText("Nome");
                    label29.setForeground(Color.white);

                    //---- label30 ----
                    label30.setText("Telefone");
                    label30.setForeground(Color.white);

                    //======== panel2 ========
                    {
                        panel2.setBackground(new Color(0x2a538f));

                        GroupLayout panel2Layout = new GroupLayout(panel2);
                        panel2.setLayout(panel2Layout);
                        panel2Layout.setHorizontalGroup(
                            panel2Layout.createParallelGroup()
                                .addGap(0, 80, Short.MAX_VALUE)
                        );
                        panel2Layout.setVerticalGroup(
                            panel2Layout.createParallelGroup()
                                .addGap(0, 900, Short.MAX_VALUE)
                        );
                    }

                    //---- label33 ----
                    label33.setText("Endere\u00e7o");
                    label33.setForeground(Color.white);
                    label33.setBackground(Color.pink);
                    label33.setFont(new Font("Verdana", Font.PLAIN, 12));

                    //---- label34 ----
                    label34.setText("Usu\u00e1rio");
                    label34.setForeground(Color.white);
                    label34.setBackground(Color.pink);
                    label34.setFont(new Font("Verdana", Font.PLAIN, 12));

                    //---- label35 ----
                    label35.setText("Senha");
                    label35.setForeground(Color.white);
                    label35.setBackground(Color.pink);
                    label35.setFont(new Font("Verdana", Font.PLAIN, 12));

                    //---- label36 ----
                    label36.setText("Procurar por usu\u00e1rio:");
                    label36.setForeground(Color.white);

                    //---- searchUser ----
                    searchUser.setBackground(new Color(0x21252f));
                    searchUser.setForeground(Color.white);
                    searchUser.setBorder(null);

                    //---- separator21 ----
                    separator21.setForeground(new Color(0x2a538f));
                    separator21.setBackground(new Color(0x2a538f));

                    //======== searchFuncPanel ========
                    {
                        searchFuncPanel.setBackground(new Color(0x21252f));
                        searchFuncPanel.setBorder(null);
                        searchFuncPanel.addMouseListener(new MouseAdapter() {
                            @Override
                            public void mouseClicked(MouseEvent e) {
                                searchFuncMouseClicked(e);
                            }
                            @Override
                            public void mouseEntered(MouseEvent e) {
                                searchFuncMouseEntered(e);
                            }
                            @Override
                            public void mouseExited(MouseEvent e) {
                                searchFuncMouseExited(e);
                            }
                            @Override
                            public void mousePressed(MouseEvent e) {
                                searchFuncMousePressed(e);
                            }
                            @Override
                            public void mouseReleased(MouseEvent e) {
                                searchFuncMouseReleased(e);
                            }
                        });

                        //---- label37 ----
                        label37.setIcon(new ImageIcon(getClass().getResource("/icons/lupa.png")));
                        label37.setHorizontalAlignment(SwingConstants.CENTER);

                        GroupLayout searchFuncPanelLayout = new GroupLayout(searchFuncPanel);
                        searchFuncPanel.setLayout(searchFuncPanelLayout);
                        searchFuncPanelLayout.setHorizontalGroup(
                            searchFuncPanelLayout.createParallelGroup()
                                .addGroup(GroupLayout.Alignment.TRAILING, searchFuncPanelLayout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(label37, GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                                    .addContainerGap())
                        );
                        searchFuncPanelLayout.setVerticalGroup(
                            searchFuncPanelLayout.createParallelGroup()
                                .addGroup(GroupLayout.Alignment.TRAILING, searchFuncPanelLayout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(label37, GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                                    .addContainerGap())
                        );
                    }

                    //---- label42 ----
                    label42.setText("Quantidade de Vendas");
                    label42.setForeground(Color.white);

                    //---- edifuncQtdField ----
                    edifuncQtdField.setBackground(new Color(0x21252f));
                    edifuncQtdField.setBorder(null);
                    edifuncQtdField.setForeground(Color.white);

                    //---- separator22 ----
                    separator22.setForeground(new Color(0x2a538f));
                    separator22.setBackground(new Color(0x2a538f));

                    //---- label43 ----
                    label43.setText("Tipo de Usu\u00e1rio");
                    label43.setForeground(Color.white);

                    //---- edifuncTipoField ----
                    edifuncTipoField.setBackground(new Color(0x21252f));
                    edifuncTipoField.setBorder(null);
                    edifuncTipoField.setForeground(Color.white);

                    //---- separator23 ----
                    separator23.setForeground(new Color(0x2a538f));
                    separator23.setBackground(new Color(0x2a538f));

                    //---- label44 ----
                    label44.setText("Data de Cadastro");
                    label44.setForeground(Color.white);

                    //---- edifuncDataField ----
                    edifuncDataField.setBackground(new Color(0x21252f));
                    edifuncDataField.setBorder(null);
                    edifuncDataField.setForeground(Color.white);

                    //---- separator24 ----
                    separator24.setForeground(new Color(0x2a538f));
                    separator24.setBackground(new Color(0x2a538f));

                    //======== panel9 ========
                    {
                        panel9.setBackground(new Color(0x21252f));

                        GroupLayout panel9Layout = new GroupLayout(panel9);
                        panel9.setLayout(panel9Layout);
                        panel9Layout.setHorizontalGroup(
                            panel9Layout.createParallelGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                        );
                        panel9Layout.setVerticalGroup(
                            panel9Layout.createParallelGroup()
                                .addGap(0, 136, Short.MAX_VALUE)
                        );
                    }

                    GroupLayout ediFuncionarioPanelLayout = new GroupLayout(ediFuncionarioPanel);
                    ediFuncionarioPanel.setLayout(ediFuncionarioPanelLayout);
                    ediFuncionarioPanelLayout.setHorizontalGroup(
                        ediFuncionarioPanelLayout.createParallelGroup()
                            .addGroup(ediFuncionarioPanelLayout.createSequentialGroup()
                                .addComponent(panel2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(ediFuncionarioPanelLayout.createParallelGroup()
                                    .addComponent(edifuncNomeField, GroupLayout.PREFERRED_SIZE, 380, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(separator16, GroupLayout.PREFERRED_SIZE, 380, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(label30)
                                    .addComponent(edifuncTelField, GroupLayout.PREFERRED_SIZE, 380, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(separator17, GroupLayout.PREFERRED_SIZE, 380, GroupLayout.PREFERRED_SIZE)
                                    .addGroup(ediFuncionarioPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                        .addComponent(label33)
                                        .addComponent(edifuncEndField)
                                        .addComponent(separator18, GroupLayout.PREFERRED_SIZE, 380, GroupLayout.PREFERRED_SIZE))
                                    .addComponent(edifuncUserField, GroupLayout.PREFERRED_SIZE, 380, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(separator19, GroupLayout.PREFERRED_SIZE, 380, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(label35)
                                    .addComponent(edifuncSenField, GroupLayout.PREFERRED_SIZE, 380, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(label34)
                                    .addGroup(ediFuncionarioPanelLayout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(GroupLayout.Alignment.LEADING, ediFuncionarioPanelLayout.createSequentialGroup()
                                            .addComponent(ediFuncSaveBtt, GroupLayout.PREFERRED_SIZE, 184, GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(ediFuncClearBtt, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addComponent(separator20, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 380, GroupLayout.PREFERRED_SIZE))
                                    .addGroup(ediFuncionarioPanelLayout.createSequentialGroup()
                                        .addGroup(ediFuncionarioPanelLayout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(panel9, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(label28, GroupLayout.Alignment.LEADING)
                                            .addGroup(GroupLayout.Alignment.LEADING, ediFuncionarioPanelLayout.createSequentialGroup()
                                                .addComponent(label36)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(ediFuncionarioPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(separator21)
                                                    .addComponent(searchUser, GroupLayout.PREFERRED_SIZE, 264, GroupLayout.PREFERRED_SIZE)))
                                            .addComponent(label29, GroupLayout.Alignment.LEADING))
                                        .addGroup(ediFuncionarioPanelLayout.createParallelGroup()
                                            .addGroup(ediFuncionarioPanelLayout.createSequentialGroup()
                                                .addGap(34, 34, 34)
                                                .addGroup(ediFuncionarioPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(edifuncQtdField)
                                                    .addComponent(label42)
                                                    .addComponent(label43)
                                                    .addComponent(edifuncTipoField)
                                                    .addComponent(separator23)
                                                    .addComponent(label44)
                                                    .addComponent(edifuncDataField)
                                                    .addComponent(separator24)
                                                    .addComponent(separator22, GroupLayout.PREFERRED_SIZE, 190, GroupLayout.PREFERRED_SIZE)))
                                            .addGroup(ediFuncionarioPanelLayout.createSequentialGroup()
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(searchFuncPanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))))
                                .addGap(0, 552, Short.MAX_VALUE))
                    );
                    ediFuncionarioPanelLayout.setVerticalGroup(
                        ediFuncionarioPanelLayout.createParallelGroup()
                            .addComponent(panel2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(ediFuncionarioPanelLayout.createSequentialGroup()
                                .addComponent(panel9, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(ediFuncionarioPanelLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                    .addGroup(ediFuncionarioPanelLayout.createSequentialGroup()
                                        .addComponent(label28, GroupLayout.PREFERRED_SIZE, 84, GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(ediFuncionarioPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                            .addComponent(searchUser, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                            .addComponent(label36))
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(separator21, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                    .addComponent(searchFuncPanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(ediFuncionarioPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                    .addComponent(label29)
                                    .addComponent(label42))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(ediFuncionarioPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                    .addComponent(edifuncNomeField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(edifuncQtdField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(ediFuncionarioPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                    .addComponent(separator16)
                                    .addComponent(separator22, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(ediFuncionarioPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                    .addComponent(label30)
                                    .addComponent(label43))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(ediFuncionarioPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                    .addComponent(edifuncTelField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(edifuncTipoField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(ediFuncionarioPanelLayout.createParallelGroup()
                                    .addComponent(separator17, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(separator23, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(ediFuncionarioPanelLayout.createParallelGroup()
                                    .addComponent(label33)
                                    .addComponent(label44))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(ediFuncionarioPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                    .addComponent(edifuncEndField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(edifuncDataField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(ediFuncionarioPanelLayout.createParallelGroup()
                                    .addComponent(separator18, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(separator24, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(label34)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(edifuncUserField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(separator19, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(label35)
                                .addGap(0, 0, 0)
                                .addComponent(edifuncSenField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(separator20, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(ediFuncionarioPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                    .addComponent(ediFuncSaveBtt)
                                    .addComponent(ediFuncClearBtt))
                                .addGap(0, 264, Short.MAX_VALUE))
                    );
                }
                centralPane.add(ediFuncionarioPanel, "card4");

                //======== cadClientePanel ========
                {
                    cadClientePanel.setBackground(new Color(0x21252f));
                    cadClientePanel.setForeground(new Color(0x21252f));

                    //======== sidePanel ========
                    {
                        sidePanel.setBackground(new Color(0x009999));

                        GroupLayout sidePanelLayout = new GroupLayout(sidePanel);
                        sidePanel.setLayout(sidePanelLayout);
                        sidePanelLayout.setHorizontalGroup(
                            sidePanelLayout.createParallelGroup()
                                .addGap(0, 80, Short.MAX_VALUE)
                        );
                        sidePanelLayout.setVerticalGroup(
                            sidePanelLayout.createParallelGroup()
                                .addGap(0, 900, Short.MAX_VALUE)
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
                    label13.setText("Cadastrar cliente");
                    label13.setFont(new Font("Yu Gothic Light", Font.PLAIN, 36));
                    label13.setForeground(Color.white);
                    label13.setBackground(Color.white);

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
                                .addComponent(sidePanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(cadClientePanelLayout.createParallelGroup()
                                    .addComponent(panel10, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                    .addGroup(cadClientePanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                        .addComponent(label8)
                                        .addComponent(cadClienteNomeField)
                                        .addComponent(label9)
                                        .addComponent(cadClienteTelefoneField)
                                        .addComponent(separator2)
                                        .addComponent(label10)
                                        .addComponent(cadClienteEnderecoField)
                                        .addComponent(separator6)
                                        .addComponent(separator1)
                                        .addComponent(label13, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(cadClienteUserField)
                                        .addComponent(separator5)
                                        .addComponent(saveBtt, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(clearBtt, GroupLayout.PREFERRED_SIZE, 380, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(label12)))
                                .addGap(0, 806, Short.MAX_VALUE))
                    );
                    cadClientePanelLayout.setVerticalGroup(
                        cadClientePanelLayout.createParallelGroup()
                            .addComponent(sidePanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(cadClientePanelLayout.createSequentialGroup()
                                .addComponent(panel10, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(label13, GroupLayout.PREFERRED_SIZE, 84, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(label8)
                                .addGap(6, 6, 6)
                                .addComponent(cadClienteNomeField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(separator1, GroupLayout.PREFERRED_SIZE, 3, GroupLayout.PREFERRED_SIZE)
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
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cadClienteUserField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(separator5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(saveBtt)
                                .addGap(6, 6, 6)
                                .addComponent(clearBtt)
                                .addGap(0, 322, Short.MAX_VALUE))
                    );
                }
                centralPane.add(cadClientePanel, "card1");

                //======== ediClientePanel ========
                {
                    ediClientePanel.setForeground(new Color(0x21252f));
                    ediClientePanel.setBackground(new Color(0x21252f));

                    //---- label31 ----
                    label31.setText("Nome");
                    label31.setForeground(Color.white);
                    label31.setBackground(new Color(0x21252f));
                    label31.setFont(new Font("Verdana", Font.PLAIN, 12));

                    //---- ediClienteNomeField ----
                    ediClienteNomeField.setBorder(null);
                    ediClienteNomeField.setBackground(new Color(0x21252f));
                    ediClienteNomeField.setForeground(Color.white);

                    //---- separator25 ----
                    separator25.setForeground(new Color(0x009999));
                    separator25.setBackground(new Color(0x21252f));
                    separator25.setOpaque(true);
                    separator25.setBorder(null);

                    //---- label32 ----
                    label32.setText("Telefone");
                    label32.setForeground(Color.white);
                    label32.setBackground(new Color(0x21252f));
                    label32.setFont(new Font("Verdana", Font.PLAIN, 12));

                    //---- ediClienteTelefoneField ----
                    ediClienteTelefoneField.setBorder(null);
                    ediClienteTelefoneField.setBackground(new Color(0x21252f));
                    ediClienteTelefoneField.setForeground(Color.white);

                    //---- separator26 ----
                    separator26.setForeground(new Color(0x009999));
                    separator26.setBackground(new Color(0x21252f));
                    separator26.setOpaque(true);
                    separator26.setBorder(null);

                    //---- label38 ----
                    label38.setText("Endere\u00e7o");
                    label38.setForeground(Color.white);
                    label38.setBackground(new Color(0x21252f));
                    label38.setFont(new Font("Verdana", Font.PLAIN, 12));

                    //---- ediClienteEnderecoField ----
                    ediClienteEnderecoField.setBorder(null);
                    ediClienteEnderecoField.setForeground(Color.white);
                    ediClienteEnderecoField.setBackground(new Color(0x21252f));

                    //---- label40 ----
                    label40.setText("ID Usu\u00e1rio");
                    label40.setForeground(Color.white);
                    label40.setBackground(new Color(0x21252f));
                    label40.setFont(new Font("Verdana", Font.PLAIN, 12));

                    //---- ediClienteUserField ----
                    ediClienteUserField.setBorder(null);
                    ediClienteUserField.setForeground(Color.white);
                    ediClienteUserField.setBackground(new Color(0x21252f));

                    //---- separator28 ----
                    separator28.setForeground(new Color(0x009999));
                    separator28.setBackground(new Color(0x21252f));
                    separator28.setOpaque(true);
                    separator28.setBorder(null);

                    //---- separator29 ----
                    separator29.setForeground(new Color(0x009999));
                    separator29.setBackground(new Color(0x21252f));
                    separator29.setOpaque(true);
                    separator29.setBorder(null);

                    //---- ediClienteSaveBtt ----
                    ediClienteSaveBtt.setText("Salvar");
                    ediClienteSaveBtt.setBackground(new Color(0x21252f));
                    ediClienteSaveBtt.setForeground(Color.white);
                    ediClienteSaveBtt.addMouseListener(new MouseAdapter() {
                        @Override
                        public void mouseClicked(MouseEvent e) {
                            ediClienteSaveBttMouseClicked(e);
                        }
                    });

                    //---- ediClienteClearBtt ----
                    ediClienteClearBtt.setText("Limpar");
                    ediClienteClearBtt.setBackground(new Color(0x21252f));
                    ediClienteClearBtt.setForeground(Color.white);
                    ediClienteClearBtt.addMouseListener(new MouseAdapter() {
                        @Override
                        public void mouseClicked(MouseEvent e) {
                            ediClienteClearBttMouseClicked(e);
                        }
                    });

                    //---- label41 ----
                    label41.setText("Editar cadastro cliente");
                    label41.setFont(new Font("Yu Gothic Light", Font.PLAIN, 36));
                    label41.setForeground(Color.white);
                    label41.setBackground(Color.white);

                    //======== sidePanel3 ========
                    {
                        sidePanel3.setBackground(new Color(0x009999));

                        GroupLayout sidePanel3Layout = new GroupLayout(sidePanel3);
                        sidePanel3.setLayout(sidePanel3Layout);
                        sidePanel3Layout.setHorizontalGroup(
                            sidePanel3Layout.createParallelGroup()
                                .addGap(0, 80, Short.MAX_VALUE)
                        );
                        sidePanel3Layout.setVerticalGroup(
                            sidePanel3Layout.createParallelGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                        );
                    }

                    //---- label45 ----
                    label45.setText("Procurar pelo Identificador:");
                    label45.setForeground(Color.white);

                    //---- searchID ----
                    searchID.setBackground(new Color(0x21252f));
                    searchID.setForeground(Color.white);
                    searchID.setBorder(null);

                    //---- separator30 ----
                    separator30.setForeground(new Color(0x009999));
                    separator30.setBackground(new Color(0x21252f));

                    //---- label47 ----
                    label47.setText("Data de Cadastro");
                    label47.setForeground(Color.white);

                    //---- ediClienteDataField ----
                    ediClienteDataField.setBorder(null);
                    ediClienteDataField.setForeground(Color.white);
                    ediClienteDataField.setBackground(new Color(0x21252f));

                    //---- separator31 ----
                    separator31.setForeground(new Color(0x009999));
                    separator31.setBackground(new Color(0x21252f));
                    separator31.setOpaque(true);
                    separator31.setBorder(null);

                    //======== searchClientPanel ========
                    {
                        searchClientPanel.setBackground(new Color(0x21252f));
                        searchClientPanel.setForeground(new Color(0x21252f));
                        searchClientPanel.addMouseListener(new MouseAdapter() {
                            @Override
                            public void mouseClicked(MouseEvent e) {
                                searchClientPanelMouseClicked(e);
                            }
                            @Override
                            public void mouseEntered(MouseEvent e) {
                                searchClientPanelMouseEntered(e);
                            }
                            @Override
                            public void mouseExited(MouseEvent e) {
                                searchClientPanelMouseExited(e);
                            }
                            @Override
                            public void mousePressed(MouseEvent e) {
                                searchClientPanelMousePressed(e);
                            }
                            @Override
                            public void mouseReleased(MouseEvent e) {
                                searchClientPanelMouseReleased(e);
                            }
                        });

                        //---- label46 ----
                        label46.setIcon(new ImageIcon(getClass().getResource("/icons/lupa.png")));
                        label46.setHorizontalAlignment(SwingConstants.CENTER);

                        GroupLayout searchClientPanelLayout = new GroupLayout(searchClientPanel);
                        searchClientPanel.setLayout(searchClientPanelLayout);
                        searchClientPanelLayout.setHorizontalGroup(
                            searchClientPanelLayout.createParallelGroup()
                                .addGroup(searchClientPanelLayout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(label46, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                                    .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        );
                        searchClientPanelLayout.setVerticalGroup(
                            searchClientPanelLayout.createParallelGroup()
                                .addGroup(GroupLayout.Alignment.TRAILING, searchClientPanelLayout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(label46, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addContainerGap())
                        );
                    }

                    //======== panel11 ========
                    {
                        panel11.setBackground(new Color(0x21252f));

                        GroupLayout panel11Layout = new GroupLayout(panel11);
                        panel11.setLayout(panel11Layout);
                        panel11Layout.setHorizontalGroup(
                            panel11Layout.createParallelGroup()
                                .addGap(0, 380, Short.MAX_VALUE)
                        );
                        panel11Layout.setVerticalGroup(
                            panel11Layout.createParallelGroup()
                                .addGap(0, 136, Short.MAX_VALUE)
                        );
                    }

                    GroupLayout ediClientePanelLayout = new GroupLayout(ediClientePanel);
                    ediClientePanel.setLayout(ediClientePanelLayout);
                    ediClientePanelLayout.setHorizontalGroup(
                        ediClientePanelLayout.createParallelGroup()
                            .addGroup(ediClientePanelLayout.createSequentialGroup()
                                .addComponent(sidePanel3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGroup(ediClientePanelLayout.createParallelGroup()
                                    .addGroup(ediClientePanelLayout.createSequentialGroup()
                                        .addGap(26, 26, 26)
                                        .addComponent(panel11, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                    .addGroup(ediClientePanelLayout.createSequentialGroup()
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(ediClientePanelLayout.createParallelGroup()
                                            .addComponent(separator25, GroupLayout.PREFERRED_SIZE, 380, GroupLayout.PREFERRED_SIZE)
                                            .addComponent(label32)
                                            .addComponent(ediClienteTelefoneField, GroupLayout.PREFERRED_SIZE, 380, GroupLayout.PREFERRED_SIZE)
                                            .addComponent(separator26, GroupLayout.PREFERRED_SIZE, 380, GroupLayout.PREFERRED_SIZE)
                                            .addComponent(label38)
                                            .addComponent(ediClienteEnderecoField, GroupLayout.PREFERRED_SIZE, 380, GroupLayout.PREFERRED_SIZE)
                                            .addComponent(separator29, GroupLayout.PREFERRED_SIZE, 380, GroupLayout.PREFERRED_SIZE)
                                            .addComponent(ediClienteNomeField, GroupLayout.PREFERRED_SIZE, 380, GroupLayout.PREFERRED_SIZE)
                                            .addComponent(label31)
                                            .addGroup(ediClientePanelLayout.createSequentialGroup()
                                                .addGroup(ediClientePanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                                    .addGroup(ediClientePanelLayout.createSequentialGroup()
                                                        .addComponent(label41, GroupLayout.PREFERRED_SIZE, 363, GroupLayout.PREFERRED_SIZE)
                                                        .addGap(30, 30, 30))
                                                    .addGroup(GroupLayout.Alignment.TRAILING, ediClientePanelLayout.createSequentialGroup()
                                                        .addComponent(label45)
                                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addGroup(ediClientePanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                                            .addComponent(searchID, GroupLayout.PREFERRED_SIZE, 223, GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(separator30, GroupLayout.PREFERRED_SIZE, 223, GroupLayout.PREFERRED_SIZE))
                                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)))
                                                .addComponent(searchClientPanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                            .addComponent(ediClienteUserField, GroupLayout.PREFERRED_SIZE, 380, GroupLayout.PREFERRED_SIZE)
                                            .addComponent(separator28, GroupLayout.PREFERRED_SIZE, 380, GroupLayout.PREFERRED_SIZE)
                                            .addComponent(label47)
                                            .addComponent(ediClienteDataField, GroupLayout.PREFERRED_SIZE, 380, GroupLayout.PREFERRED_SIZE)
                                            .addComponent(label40)
                                            .addGroup(ediClientePanelLayout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                                                .addGroup(ediClientePanelLayout.createSequentialGroup()
                                                    .addComponent(ediClienteSaveBtt, GroupLayout.PREFERRED_SIZE, 190, GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(ediClienteClearBtt, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addComponent(separator31, GroupLayout.PREFERRED_SIZE, 380, GroupLayout.PREFERRED_SIZE)))))
                                .addGap(0, 751, Short.MAX_VALUE))
                    );
                    ediClientePanelLayout.setVerticalGroup(
                        ediClientePanelLayout.createParallelGroup()
                            .addGroup(ediClientePanelLayout.createSequentialGroup()
                                .addComponent(panel11, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(ediClientePanelLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                    .addGroup(ediClientePanelLayout.createSequentialGroup()
                                        .addComponent(label41, GroupLayout.PREFERRED_SIZE, 84, GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(ediClientePanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                            .addComponent(label45)
                                            .addComponent(searchID, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(separator30, GroupLayout.PREFERRED_SIZE, 3, GroupLayout.PREFERRED_SIZE))
                                    .addComponent(searchClientPanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(label31)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ediClienteNomeField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(separator25, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(label32)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ediClienteTelefoneField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(separator26, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(label38)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ediClienteEnderecoField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(separator29, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(label40)
                                .addGap(9, 9, 9)
                                .addComponent(ediClienteUserField, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(separator28, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(label47, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ediClienteDataField, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(separator31, GroupLayout.PREFERRED_SIZE, 3, GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addGroup(ediClientePanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                    .addComponent(ediClienteSaveBtt)
                                    .addComponent(ediClienteClearBtt, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(261, 261, 261))
                            .addComponent(sidePanel3, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    );
                }
                centralPane.add(ediClientePanel, "card5");

                //======== cadProdutoPanel ========
                {
                    cadProdutoPanel.setBackground(new Color(0x21252f));
                    cadProdutoPanel.setForeground(new Color(0x21252f));

                    //======== sidePanel2 ========
                    {
                        sidePanel2.setBackground(new Color(0xffff66));

                        GroupLayout sidePanel2Layout = new GroupLayout(sidePanel2);
                        sidePanel2.setLayout(sidePanel2Layout);
                        sidePanel2Layout.setHorizontalGroup(
                            sidePanel2Layout.createParallelGroup()
                                .addGap(0, 80, Short.MAX_VALUE)
                        );
                        sidePanel2Layout.setVerticalGroup(
                            sidePanel2Layout.createParallelGroup()
                                .addGap(0, 900, Short.MAX_VALUE)
                        );
                    }

                    //---- label16 ----
                    label16.setText("Nome");
                    label16.setForeground(Color.white);
                    label16.setBackground(new Color(0x21252f));
                    label16.setFont(new Font("Verdana", Font.PLAIN, 12));

                    //---- cadProdNomeField ----
                    cadProdNomeField.setBorder(null);
                    cadProdNomeField.setBackground(new Color(0x21252f));
                    cadProdNomeField.setForeground(Color.white);
                    cadProdNomeField.setToolTipText("Nome do Produto");

                    //---- separator11 ----
                    separator11.setForeground(new Color(0xffff66));
                    separator11.setBackground(new Color(0x21252f));
                    separator11.setOpaque(true);
                    separator11.setBorder(null);

                    //---- label17 ----
                    label17.setText("Telefone da importadora");
                    label17.setForeground(Color.white);
                    label17.setBackground(new Color(0x21252f));
                    label17.setFont(new Font("Verdana", Font.PLAIN, 12));

                    //---- cadProdTelefoneField ----
                    cadProdTelefoneField.setBorder(null);
                    cadProdTelefoneField.setBackground(new Color(0x21252f));
                    cadProdTelefoneField.setForeground(Color.white);
                    cadProdTelefoneField.setToolTipText("Telefone da importadora do produto");

                    //---- separator12 ----
                    separator12.setForeground(new Color(0xffff66));
                    separator12.setBackground(new Color(0x21252f));
                    separator12.setOpaque(true);
                    separator12.setBorder(null);

                    //---- label23 ----
                    label23.setText("Pre\u00e7o de compra (XX,xx)");
                    label23.setForeground(Color.white);
                    label23.setBackground(new Color(0x21252f));
                    label23.setFont(new Font("Verdana", Font.PLAIN, 12));

                    //---- cadProdPrecoCompra ----
                    cadProdPrecoCompra.setBorder(null);
                    cadProdPrecoCompra.setForeground(Color.white);
                    cadProdPrecoCompra.setBackground(new Color(0x21252f));
                    cadProdPrecoCompra.setToolTipText("Pre\u00e7o de compra do Produto, formata\u00e7\u00e3o R$XX,xx");

                    //---- label24 ----
                    label24.setText("Pre\u00e7o de venda (XX,xx)");
                    label24.setBackground(new Color(0x21252f));
                    label24.setForeground(Color.white);
                    label24.setFont(new Font("Verdana", Font.PLAIN, 12));

                    //---- cadProdPrecoVenda ----
                    cadProdPrecoVenda.setBorder(null);
                    cadProdPrecoVenda.setBackground(new Color(0x21252f));
                    cadProdPrecoVenda.setForeground(Color.white);
                    cadProdPrecoVenda.setToolTipText("Pre\u00e7o de venda do produto, formata\u00e7\u00e3o R$XX,xx");

                    //---- separator13 ----
                    separator13.setForeground(new Color(0xffff66));
                    separator13.setBackground(new Color(0x21252f));
                    separator13.setOpaque(true);
                    separator13.setBorder(null);

                    //---- separator15 ----
                    separator15.setForeground(new Color(0xffff66));
                    separator15.setBackground(new Color(0x21252f));
                    separator15.setOpaque(true);
                    separator15.setBorder(null);

                    //---- prodSaveBtt ----
                    prodSaveBtt.setText("Salvar");
                    prodSaveBtt.setBackground(new Color(0x21252f));
                    prodSaveBtt.setForeground(Color.white);
                    prodSaveBtt.setToolTipText("Salvar informa\u00e7\u00f5es no banco de dados");
                    prodSaveBtt.addMouseListener(new MouseAdapter() {
                        @Override
                        public void mouseClicked(MouseEvent e) {
                            prodSaveBttMouseClicked(e);
                        }
                    });

                    //---- prodClearBtt ----
                    prodClearBtt.setText("Limpar");
                    prodClearBtt.setBackground(new Color(0x21252f));
                    prodClearBtt.setForeground(Color.white);
                    prodClearBtt.setToolTipText("Limpar campos");
                    prodClearBtt.addMouseListener(new MouseAdapter() {
                        @Override
                        public void mouseClicked(MouseEvent e) {
                            prodClearBttMouseClicked(e);
                        }
                    });

                    //---- label26 ----
                    label26.setText("Cadastrar produto");
                    label26.setFont(new Font("Yu Gothic Light", Font.PLAIN, 36));
                    label26.setForeground(Color.white);
                    label26.setBackground(Color.white);

                    //---- label27 ----
                    label27.setText("Endere\u00e7o da importadora");
                    label27.setForeground(Color.white);
                    label27.setBackground(new Color(0x21252f));
                    label27.setFont(new Font("Verdana", Font.PLAIN, 12));

                    //---- cadProdEndField ----
                    cadProdEndField.setBorder(null);
                    cadProdEndField.setBackground(new Color(0x21252f));
                    cadProdEndField.setForeground(Color.white);
                    cadProdEndField.setToolTipText("Telefone da importadora do produto");

                    //---- separator39 ----
                    separator39.setForeground(new Color(0xffff66));
                    separator39.setBackground(new Color(0x21252f));
                    separator39.setOpaque(true);
                    separator39.setBorder(null);

                    //======== panel12 ========
                    {
                        panel12.setBackground(new Color(0x21252f));

                        GroupLayout panel12Layout = new GroupLayout(panel12);
                        panel12.setLayout(panel12Layout);
                        panel12Layout.setHorizontalGroup(
                            panel12Layout.createParallelGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                        );
                        panel12Layout.setVerticalGroup(
                            panel12Layout.createParallelGroup()
                                .addGap(0, 136, Short.MAX_VALUE)
                        );
                    }

                    //---- label25 ----
                    label25.setText("Quantidade");
                    label25.setForeground(Color.white);
                    label25.setBackground(new Color(0x21252f));
                    label25.setFont(new Font("Verdana", Font.PLAIN, 12));

                    //---- cadQuantidadeField ----
                    cadQuantidadeField.setBorder(null);
                    cadQuantidadeField.setForeground(Color.white);
                    cadQuantidadeField.setBackground(new Color(0x21252f));
                    cadQuantidadeField.setToolTipText("Pre\u00e7o de compra do Produto, formata\u00e7\u00e3o R$XX,xx");

                    //---- separator27 ----
                    separator27.setForeground(new Color(0xffff66));
                    separator27.setBackground(new Color(0x21252f));
                    separator27.setOpaque(true);
                    separator27.setBorder(null);

                    //---- label52 ----
                    label52.setText("R$");
                    label52.setForeground(Color.white);

                    //---- label64 ----
                    label64.setText("R$");
                    label64.setForeground(Color.white);

                    GroupLayout cadProdutoPanelLayout = new GroupLayout(cadProdutoPanel);
                    cadProdutoPanel.setLayout(cadProdutoPanelLayout);
                    cadProdutoPanelLayout.setHorizontalGroup(
                        cadProdutoPanelLayout.createParallelGroup()
                            .addGroup(cadProdutoPanelLayout.createSequentialGroup()
                                .addComponent(sidePanel2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(cadProdutoPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                    .addComponent(panel12, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(label16)
                                    .addComponent(cadProdNomeField)
                                    .addComponent(separator11)
                                    .addComponent(label17, GroupLayout.PREFERRED_SIZE, 157, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cadProdTelefoneField)
                                    .addComponent(separator12)
                                    .addComponent(label26, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cadProdEndField)
                                    .addComponent(separator39)
                                    .addComponent(label27)
                                    .addComponent(label25, GroupLayout.PREFERRED_SIZE, 153, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cadQuantidadeField)
                                    .addComponent(separator27)
                                    .addGroup(cadProdutoPanelLayout.createSequentialGroup()
                                        .addComponent(prodSaveBtt, GroupLayout.PREFERRED_SIZE, 186, GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(prodClearBtt, GroupLayout.PREFERRED_SIZE, 188, GroupLayout.PREFERRED_SIZE))
                                    .addComponent(label23, GroupLayout.PREFERRED_SIZE, 153, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(label24, GroupLayout.PREFERRED_SIZE, 146, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(separator13)
                                    .addGroup(cadProdutoPanelLayout.createSequentialGroup()
                                        .addComponent(label52)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cadProdPrecoCompra, GroupLayout.PREFERRED_SIZE, 360, GroupLayout.PREFERRED_SIZE))
                                    .addComponent(separator15)
                                    .addGroup(GroupLayout.Alignment.TRAILING, cadProdutoPanelLayout.createSequentialGroup()
                                        .addComponent(label64)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(cadProdPrecoVenda, GroupLayout.PREFERRED_SIZE, 360, GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 806, Short.MAX_VALUE))
                    );
                    cadProdutoPanelLayout.setVerticalGroup(
                        cadProdutoPanelLayout.createParallelGroup()
                            .addGroup(cadProdutoPanelLayout.createSequentialGroup()
                                .addComponent(panel12, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(label26, GroupLayout.PREFERRED_SIZE, 84, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(label16)
                                .addGap(6, 6, 6)
                                .addComponent(cadProdNomeField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(separator11, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(label17)
                                .addGap(6, 6, 6)
                                .addComponent(cadProdTelefoneField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(separator12, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(label27)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cadProdEndField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(separator39, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(label25)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cadQuantidadeField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(separator27, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(label23)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(cadProdutoPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                    .addComponent(label52)
                                    .addComponent(cadProdPrecoCompra, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(separator15, GroupLayout.PREFERRED_SIZE, 3, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(label24)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(cadProdutoPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                    .addComponent(cadProdPrecoVenda, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(label64))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(separator13, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(cadProdutoPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                    .addComponent(prodSaveBtt)
                                    .addComponent(prodClearBtt))
                                .addGap(0, 230, Short.MAX_VALUE))
                            .addComponent(sidePanel2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    );
                }
                centralPane.add(cadProdutoPanel, "card6");

                //======== ediProdutoPanel ========
                {
                    ediProdutoPanel.setBackground(new Color(0x21252f));
                    ediProdutoPanel.setForeground(new Color(0x21252f));

                    //======== sidePanel4 ========
                    {
                        sidePanel4.setBackground(new Color(0xffff66));

                        GroupLayout sidePanel4Layout = new GroupLayout(sidePanel4);
                        sidePanel4.setLayout(sidePanel4Layout);
                        sidePanel4Layout.setHorizontalGroup(
                            sidePanel4Layout.createParallelGroup()
                                .addGap(0, 80, Short.MAX_VALUE)
                        );
                        sidePanel4Layout.setVerticalGroup(
                            sidePanel4Layout.createParallelGroup()
                                .addGap(0, 900, Short.MAX_VALUE)
                        );
                    }

                    //---- label48 ----
                    label48.setText("Nome");
                    label48.setForeground(Color.white);
                    label48.setBackground(new Color(0x21252f));
                    label48.setFont(new Font("Verdana", Font.PLAIN, 12));

                    //---- ediProdNomeField ----
                    ediProdNomeField.setBorder(null);
                    ediProdNomeField.setBackground(new Color(0x21252f));
                    ediProdNomeField.setForeground(Color.white);

                    //---- separator32 ----
                    separator32.setForeground(new Color(0xffff66));
                    separator32.setBackground(new Color(0x21252f));
                    separator32.setOpaque(true);
                    separator32.setBorder(null);

                    //---- label49 ----
                    label49.setText("Telefone da Importadora");
                    label49.setForeground(Color.white);
                    label49.setBackground(new Color(0x21252f));
                    label49.setFont(new Font("Verdana", Font.PLAIN, 12));

                    //---- ediProdTelefoneField ----
                    ediProdTelefoneField.setBorder(null);
                    ediProdTelefoneField.setBackground(new Color(0x21252f));
                    ediProdTelefoneField.setForeground(Color.white);

                    //---- separator33 ----
                    separator33.setForeground(new Color(0xffff66));
                    separator33.setBackground(new Color(0x21252f));
                    separator33.setOpaque(true);
                    separator33.setBorder(null);

                    //---- label50 ----
                    label50.setText("Pre\u00e7o de compra (XX,xx)");
                    label50.setForeground(Color.white);
                    label50.setBackground(new Color(0x21252f));
                    label50.setFont(new Font("Verdana", Font.PLAIN, 12));

                    //---- ediProdPrecoCompra ----
                    ediProdPrecoCompra.setBorder(null);
                    ediProdPrecoCompra.setForeground(Color.white);
                    ediProdPrecoCompra.setBackground(new Color(0x21252f));

                    //---- label51 ----
                    label51.setText("Pre\u00e7o de venda (XX,xx)");
                    label51.setBackground(new Color(0x21252f));
                    label51.setForeground(Color.white);
                    label51.setFont(new Font("Verdana", Font.PLAIN, 12));

                    //---- ediProdPrecoVenda ----
                    ediProdPrecoVenda.setBorder(null);
                    ediProdPrecoVenda.setBackground(new Color(0x21252f));
                    ediProdPrecoVenda.setForeground(Color.white);

                    //---- separator34 ----
                    separator34.setForeground(new Color(0xffff66));
                    separator34.setBackground(new Color(0x21252f));
                    separator34.setOpaque(true);
                    separator34.setBorder(null);

                    //---- separator36 ----
                    separator36.setForeground(new Color(0xffff66));
                    separator36.setBackground(new Color(0x21252f));
                    separator36.setOpaque(true);
                    separator36.setBorder(null);

                    //---- ediProdSaveBtt ----
                    ediProdSaveBtt.setText("Salvar");
                    ediProdSaveBtt.setBackground(new Color(0x21252f));
                    ediProdSaveBtt.setForeground(Color.white);
                    ediProdSaveBtt.addMouseListener(new MouseAdapter() {
                        @Override
                        public void mouseClicked(MouseEvent e) {
                            ediProdSaveBttMouseClicked(e);
                        }
                    });

                    //---- ediProdClearBtt ----
                    ediProdClearBtt.setText("Limpar");
                    ediProdClearBtt.setBackground(new Color(0x21252f));
                    ediProdClearBtt.setForeground(Color.white);
                    ediProdClearBtt.addMouseListener(new MouseAdapter() {
                        @Override
                        public void mouseClicked(MouseEvent e) {
                            ediProdClearBttMouseClicked(e);
                        }
                    });

                    //---- label53 ----
                    label53.setText("Editar cadastro produto");
                    label53.setFont(new Font("Yu Gothic Light", Font.PLAIN, 36));
                    label53.setForeground(Color.white);
                    label53.setBackground(Color.white);

                    //---- label54 ----
                    label54.setText("Data de Cadastro");
                    label54.setForeground(Color.white);

                    //---- ediProdDataField ----
                    ediProdDataField.setBorder(null);
                    ediProdDataField.setBackground(new Color(0x21252f));
                    ediProdDataField.setForeground(Color.white);

                    //---- separator37 ----
                    separator37.setForeground(new Color(0xffff66));
                    separator37.setBackground(new Color(0x21252f));
                    separator37.setOpaque(true);
                    separator37.setBorder(null);

                    //---- label55 ----
                    label55.setText("Procurar pelo identificador:");
                    label55.setForeground(Color.white);

                    //---- searchIdProduto ----
                    searchIdProduto.setBackground(new Color(0x21252f));
                    searchIdProduto.setForeground(Color.white);
                    searchIdProduto.setBorder(null);

                    //---- separator38 ----
                    separator38.setForeground(new Color(0xffff66));
                    separator38.setBackground(new Color(0x21252f));

                    //======== searchProdPanel ========
                    {
                        searchProdPanel.setBackground(new Color(0x21252f));
                        searchProdPanel.setBorder(null);
                        searchProdPanel.addMouseListener(new MouseAdapter() {
                            @Override
                            public void mouseClicked(MouseEvent e) {
                                searchProdPanelMouseClicked(e);
                            }
                            @Override
                            public void mouseEntered(MouseEvent e) {
                                searchProdPanelMouseEntered(e);
                            }
                            @Override
                            public void mouseExited(MouseEvent e) {
                                searchProdPanelMouseExited(e);
                            }
                            @Override
                            public void mousePressed(MouseEvent e) {
                                searchProdPanelMousePressed(e);
                            }
                            @Override
                            public void mouseReleased(MouseEvent e) {
                                searchProdPanelMouseReleased(e);
                            }
                        });

                        //---- label56 ----
                        label56.setIcon(new ImageIcon(getClass().getResource("/icons/lupa.png")));
                        label56.setHorizontalAlignment(SwingConstants.CENTER);

                        GroupLayout searchProdPanelLayout = new GroupLayout(searchProdPanel);
                        searchProdPanel.setLayout(searchProdPanelLayout);
                        searchProdPanelLayout.setHorizontalGroup(
                            searchProdPanelLayout.createParallelGroup()
                                .addGroup(searchProdPanelLayout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(label56, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addContainerGap())
                        );
                        searchProdPanelLayout.setVerticalGroup(
                            searchProdPanelLayout.createParallelGroup()
                                .addGroup(GroupLayout.Alignment.TRAILING, searchProdPanelLayout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(label56, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addContainerGap())
                        );
                    }

                    //---- label58 ----
                    label58.setText("Endere\u00e7o da Importadora");
                    label58.setForeground(Color.white);

                    //---- ediProdEndField ----
                    ediProdEndField.setBorder(null);
                    ediProdEndField.setBackground(new Color(0x21252f));
                    ediProdEndField.setForeground(Color.white);

                    //---- separator41 ----
                    separator41.setForeground(new Color(0xffff66));
                    separator41.setBackground(new Color(0x21252f));
                    separator41.setOpaque(true);
                    separator41.setBorder(null);

                    //======== panel13 ========
                    {
                        panel13.setBackground(new Color(0x21252f));

                        GroupLayout panel13Layout = new GroupLayout(panel13);
                        panel13.setLayout(panel13Layout);
                        panel13Layout.setHorizontalGroup(
                            panel13Layout.createParallelGroup()
                                .addGap(0, 380, Short.MAX_VALUE)
                        );
                        panel13Layout.setVerticalGroup(
                            panel13Layout.createParallelGroup()
                                .addGap(0, 136, Short.MAX_VALUE)
                        );
                    }

                    //---- label67 ----
                    label67.setText("R$");
                    label67.setForeground(Color.white);

                    //---- label68 ----
                    label68.setText("R$");
                    label68.setForeground(Color.white);

                    GroupLayout ediProdutoPanelLayout = new GroupLayout(ediProdutoPanel);
                    ediProdutoPanel.setLayout(ediProdutoPanelLayout);
                    ediProdutoPanelLayout.setHorizontalGroup(
                        ediProdutoPanelLayout.createParallelGroup()
                            .addGroup(ediProdutoPanelLayout.createSequentialGroup()
                                .addComponent(sidePanel4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(ediProdutoPanelLayout.createParallelGroup()
                                    .addComponent(ediProdTelefoneField, GroupLayout.PREFERRED_SIZE, 380, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(label49, GroupLayout.PREFERRED_SIZE, 157, GroupLayout.PREFERRED_SIZE)
                                    .addGroup(ediProdutoPanelLayout.createSequentialGroup()
                                        .addGroup(ediProdutoPanelLayout.createParallelGroup()
                                            .addComponent(ediProdNomeField, GroupLayout.PREFERRED_SIZE, 380, GroupLayout.PREFERRED_SIZE)
                                            .addComponent(label48))
                                        .addGap(49, 49, 49)
                                        .addGroup(ediProdutoPanelLayout.createParallelGroup()
                                            .addComponent(label54)
                                            .addComponent(separator37, GroupLayout.PREFERRED_SIZE, 191, GroupLayout.PREFERRED_SIZE)
                                            .addComponent(ediProdDataField, GroupLayout.PREFERRED_SIZE, 191, GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(ediProdutoPanelLayout.createSequentialGroup()
                                        .addGroup(ediProdutoPanelLayout.createParallelGroup()
                                            .addComponent(label53, GroupLayout.PREFERRED_SIZE, 380, GroupLayout.PREFERRED_SIZE)
                                            .addGroup(ediProdutoPanelLayout.createSequentialGroup()
                                                .addComponent(label55)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(ediProdutoPanelLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                                    .addComponent(searchIdProduto, GroupLayout.PREFERRED_SIZE, 229, GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(separator38, GroupLayout.PREFERRED_SIZE, 229, GroupLayout.PREFERRED_SIZE))))
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(searchProdPanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                    .addComponent(separator32, GroupLayout.PREFERRED_SIZE, 380, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(label58)
                                    .addGroup(ediProdutoPanelLayout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(ediProdEndField, GroupLayout.Alignment.LEADING)
                                        .addComponent(separator33, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 380, GroupLayout.PREFERRED_SIZE))
                                    .addComponent(separator41, GroupLayout.PREFERRED_SIZE, 380, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(label50, GroupLayout.PREFERRED_SIZE, 153, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(separator36, GroupLayout.PREFERRED_SIZE, 380, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(label51, GroupLayout.PREFERRED_SIZE, 146, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(separator34, GroupLayout.PREFERRED_SIZE, 380, GroupLayout.PREFERRED_SIZE)
                                    .addGroup(ediProdutoPanelLayout.createSequentialGroup()
                                        .addComponent(ediProdSaveBtt, GroupLayout.PREFERRED_SIZE, 184, GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(ediProdClearBtt, GroupLayout.PREFERRED_SIZE, 178, GroupLayout.PREFERRED_SIZE))
                                    .addComponent(panel13, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                    .addGroup(ediProdutoPanelLayout.createSequentialGroup()
                                        .addComponent(label67)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(ediProdPrecoCompra, GroupLayout.PREFERRED_SIZE, 360, GroupLayout.PREFERRED_SIZE))
                                    .addGroup(ediProdutoPanelLayout.createSequentialGroup()
                                        .addComponent(label68)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(ediProdPrecoVenda, GroupLayout.PREFERRED_SIZE, 360, GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(566, Short.MAX_VALUE))
                    );
                    ediProdutoPanelLayout.setVerticalGroup(
                        ediProdutoPanelLayout.createParallelGroup()
                            .addGroup(ediProdutoPanelLayout.createSequentialGroup()
                                .addComponent(panel13, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(ediProdutoPanelLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                    .addGroup(ediProdutoPanelLayout.createSequentialGroup()
                                        .addComponent(label53, GroupLayout.PREFERRED_SIZE, 84, GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(ediProdutoPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                            .addComponent(searchIdProduto, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                            .addComponent(label55))
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(separator38, GroupLayout.PREFERRED_SIZE, 3, GroupLayout.PREFERRED_SIZE))
                                    .addComponent(searchProdPanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(ediProdutoPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                    .addComponent(label54)
                                    .addComponent(label48))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(ediProdutoPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                    .addComponent(ediProdNomeField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ediProdDataField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(ediProdutoPanelLayout.createParallelGroup()
                                    .addComponent(separator32, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(separator37, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(label49)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(ediProdTelefoneField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(separator33, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(label58)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ediProdEndField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(separator41, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(label50)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(ediProdutoPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                    .addComponent(ediProdPrecoCompra, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(label67))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(separator36, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(label51)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(ediProdutoPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                    .addComponent(ediProdPrecoVenda, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(label68))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(separator34, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(ediProdutoPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                    .addComponent(ediProdSaveBtt)
                                    .addComponent(ediProdClearBtt))
                                .addContainerGap(246, Short.MAX_VALUE))
                            .addComponent(sidePanel4, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    );
                }
                centralPane.add(ediProdutoPanel, "card7");

                //======== verTabelasPanel ========
                {
                    verTabelasPanel.setBackground(new Color(0x21252f));
                    verTabelasPanel.setForeground(Color.black);

                    //======== panel4 ========
                    {
                        panel4.setBackground(new Color(0x21252f));

                        //---- label66 ----
                        label66.setText("Vizualizar tabelas");
                        label66.setFont(new Font("Yu Gothic Light", Font.PLAIN, 36));
                        label66.setForeground(Color.white);
                        label66.setBackground(Color.white);

                        //======== verUsuarios ========
                        {
                            verUsuarios.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0x2a538f), new Color(0x2a538f), new Color(0x2a538f), new Color(0x2a538f)));
                            verUsuarios.setBackground(new Color(0x21252f));
                            verUsuarios.addMouseListener(new MouseAdapter() {
                                @Override
                                public void mouseClicked(MouseEvent e) {
                                    verUsuariosMouseClicked(e);
                                }
                                @Override
                                public void mouseEntered(MouseEvent e) {
                                    verUsuariosMouseEntered(e);
                                }
                                @Override
                                public void mouseExited(MouseEvent e) {
                                    verUsuariosMouseExited(e);
                                }
                                @Override
                                public void mousePressed(MouseEvent e) {
                                    verUsuariosMousePressed(e);
                                }
                                @Override
                                public void mouseReleased(MouseEvent e) {
                                    verUsuariosMouseReleased(e);
                                }
                            });

                            //---- txtUsuarios ----
                            txtUsuarios.setText("Usu\u00e1rios");
                            txtUsuarios.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 18));
                            txtUsuarios.setForeground(new Color(0x2a538f));

                            GroupLayout verUsuariosLayout = new GroupLayout(verUsuarios);
                            verUsuarios.setLayout(verUsuariosLayout);
                            verUsuariosLayout.setHorizontalGroup(
                                verUsuariosLayout.createParallelGroup()
                                    .addGroup(verUsuariosLayout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(txtUsuarios)
                                        .addContainerGap(129, Short.MAX_VALUE))
                            );
                            verUsuariosLayout.setVerticalGroup(
                                verUsuariosLayout.createParallelGroup()
                                    .addGroup(verUsuariosLayout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(txtUsuarios, GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                                        .addContainerGap())
                            );
                        }

                        //======== verClientes ========
                        {
                            verClientes.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0x009999), new Color(0x009999), new Color(0x009999), new Color(0x009999)));
                            verClientes.setBackground(new Color(0x21252f));
                            verClientes.addMouseListener(new MouseAdapter() {
                                @Override
                                public void mouseClicked(MouseEvent e) {
                                    verClientesMouseClicked(e);
                                }
                                @Override
                                public void mouseEntered(MouseEvent e) {
                                    verClientesMouseEntered(e);
                                }
                                @Override
                                public void mouseExited(MouseEvent e) {
                                    verClientesMouseExited(e);
                                }
                                @Override
                                public void mousePressed(MouseEvent e) {
                                    verClientesMousePressed(e);
                                }
                                @Override
                                public void mouseReleased(MouseEvent e) {
                                    verClientesMouseReleased(e);
                                }
                            });

                            //---- txtClientes ----
                            txtClientes.setText("Clientes");
                            txtClientes.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 18));
                            txtClientes.setForeground(new Color(0x009999));

                            GroupLayout verClientesLayout = new GroupLayout(verClientes);
                            verClientes.setLayout(verClientesLayout);
                            verClientesLayout.setHorizontalGroup(
                                verClientesLayout.createParallelGroup()
                                    .addGroup(verClientesLayout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(txtClientes)
                                        .addContainerGap(135, Short.MAX_VALUE))
                            );
                            verClientesLayout.setVerticalGroup(
                                verClientesLayout.createParallelGroup()
                                    .addGroup(verClientesLayout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(txtClientes, GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                                        .addContainerGap())
                            );
                        }

                        //======== verProdutos ========
                        {
                            verProdutos.setBorder(new BevelBorder(BevelBorder.LOWERED, Color.yellow, Color.yellow, Color.yellow, Color.yellow));
                            verProdutos.setBackground(new Color(0x21252f));
                            verProdutos.addMouseListener(new MouseAdapter() {
                                @Override
                                public void mouseClicked(MouseEvent e) {
                                    verProdutosMouseClicked(e);
                                }
                                @Override
                                public void mouseEntered(MouseEvent e) {
                                    verProdutosMouseEntered(e);
                                }
                                @Override
                                public void mouseExited(MouseEvent e) {
                                    verProdutosMouseExited(e);
                                }
                                @Override
                                public void mousePressed(MouseEvent e) {
                                    verProdutosMousePressed(e);
                                }
                                @Override
                                public void mouseReleased(MouseEvent e) {
                                    verProdutosMouseReleased(e);
                                }
                            });

                            //---- txtProdutos ----
                            txtProdutos.setText("Produtos");
                            txtProdutos.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 18));
                            txtProdutos.setForeground(Color.yellow);

                            GroupLayout verProdutosLayout = new GroupLayout(verProdutos);
                            verProdutos.setLayout(verProdutosLayout);
                            verProdutosLayout.setHorizontalGroup(
                                verProdutosLayout.createParallelGroup()
                                    .addGroup(verProdutosLayout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(txtProdutos)
                                        .addContainerGap(126, Short.MAX_VALUE))
                            );
                            verProdutosLayout.setVerticalGroup(
                                verProdutosLayout.createParallelGroup()
                                    .addGroup(verProdutosLayout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(txtProdutos, GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                                        .addContainerGap())
                            );
                        }

                        //======== verVendas ========
                        {
                            verVendas.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0x009933), new Color(0x009933), new Color(0x009933), new Color(0x009933)));
                            verVendas.setBackground(new Color(0x21252f));
                            verVendas.addMouseListener(new MouseAdapter() {
                                @Override
                                public void mouseClicked(MouseEvent e) {
                                    verVendasMouseClicked(e);
                                }
                                @Override
                                public void mouseEntered(MouseEvent e) {
                                    verVendasMouseEntered(e);
                                }
                                @Override
                                public void mouseExited(MouseEvent e) {
                                    verVendasMouseExited(e);
                                }
                                @Override
                                public void mousePressed(MouseEvent e) {
                                    verVendasMousePressed(e);
                                }
                                @Override
                                public void mouseReleased(MouseEvent e) {
                                    verVendasMouseReleased(e);
                                }
                            });

                            //---- txtVendas ----
                            txtVendas.setText("Vendas");
                            txtVendas.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 18));
                            txtVendas.setForeground(new Color(0x009933));

                            GroupLayout verVendasLayout = new GroupLayout(verVendas);
                            verVendas.setLayout(verVendasLayout);
                            verVendasLayout.setHorizontalGroup(
                                verVendasLayout.createParallelGroup()
                                    .addGroup(verVendasLayout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(txtVendas)
                                        .addContainerGap(126, Short.MAX_VALUE))
                            );
                            verVendasLayout.setVerticalGroup(
                                verVendasLayout.createParallelGroup()
                                    .addGroup(verVendasLayout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(txtVendas, GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                                        .addContainerGap())
                            );
                        }

                        GroupLayout panel4Layout = new GroupLayout(panel4);
                        panel4.setLayout(panel4Layout);
                        panel4Layout.setHorizontalGroup(
                            panel4Layout.createParallelGroup()
                                .addGroup(panel4Layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(label66)
                                    .addGap(18, 18, 18)
                                    .addComponent(verUsuarios, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(verClientes, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(verProdutos, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(verVendas, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                    .addGap(0, 0, Short.MAX_VALUE))
                        );
                        panel4Layout.setVerticalGroup(
                            panel4Layout.createParallelGroup()
                                .addGroup(panel4Layout.createSequentialGroup()
                                    .addGroup(panel4Layout.createParallelGroup()
                                        .addComponent(label66, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE)
                                        .addGroup(panel4Layout.createSequentialGroup()
                                            .addGap(34, 34, 34)
                                            .addGroup(panel4Layout.createParallelGroup()
                                                .addComponent(verClientes, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                .addComponent(verUsuarios, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                .addComponent(verProdutos, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                .addComponent(verVendas, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
                                    .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        );
                    }

                    //======== panel5 ========
                    {
                        panel5.setBackground(new Color(0x21252f));
                        panel5.setLayout(new CardLayout());

                        //======== tabelaUsuariosPanel ========
                        {
                            tabelaUsuariosPanel.setBackground(new Color(0x21252f));

                            //======== usuariosScroll ========
                            {

                                //---- usuariosTable ----
                                usuariosTable.setModel(new DefaultTableModel(
                                    new Object[][] {
                                    },
                                    new String[] {
                                        "usuario", "Nome", "Telefone", "Endere\u00e7o", "Senha", "Quantidade de vendas", "Tipo de usu\u00e1rio", "Data de cadastro"
                                    }
                                ) {
                                    boolean[] columnEditable = new boolean[] {
                                        false, false, false, false, false, false, false, false
                                    };
                                    @Override
                                    public boolean isCellEditable(int rowIndex, int columnIndex) {
                                        return columnEditable[columnIndex];
                                    }
                                });
                                {
                                    TableColumnModel cm = usuariosTable.getColumnModel();
                                    cm.getColumn(0).setMinWidth(80);
                                    cm.getColumn(0).setMaxWidth(90);
                                    cm.getColumn(0).setPreferredWidth(80);
                                }
                                usuariosTable.setGridColor(new Color(0x2a538f));
                                usuariosTable.setBackground(new Color(0x21252f));
                                usuariosTable.setForeground(Color.white);
                                usuariosTable.setSelectionBackground(Color.white);
                                usuariosTable.setSelectionForeground(new Color(0x2a538f));
                                usuariosTable.setAutoCreateRowSorter(true);
                                usuariosScroll.setViewportView(usuariosTable);
                            }

                            GroupLayout tabelaUsuariosPanelLayout = new GroupLayout(tabelaUsuariosPanel);
                            tabelaUsuariosPanel.setLayout(tabelaUsuariosPanelLayout);
                            tabelaUsuariosPanelLayout.setHorizontalGroup(
                                tabelaUsuariosPanelLayout.createParallelGroup()
                                    .addGroup(tabelaUsuariosPanelLayout.createSequentialGroup()
                                        .addComponent(usuariosScroll, GroupLayout.PREFERRED_SIZE, 1188, GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 78, Short.MAX_VALUE))
                            );
                            tabelaUsuariosPanelLayout.setVerticalGroup(
                                tabelaUsuariosPanelLayout.createParallelGroup()
                                    .addComponent(usuariosScroll, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 758, Short.MAX_VALUE)
                            );
                        }
                        panel5.add(tabelaUsuariosPanel, "card4");

                        //======== tabelaClientesPanel ========
                        {
                            tabelaClientesPanel.setBackground(new Color(0x21252f));

                            //======== clientesScroll ========
                            {

                                //---- clientesTable ----
                                clientesTable.setModel(new DefaultTableModel(
                                    new Object[][] {
                                    },
                                    new String[] {
                                        "idCliente", "Nome", "Telefone", "Endere\u00e7o", "idUsu\u00e1rio", "Data de Cadastro"
                                    }
                                ) {
                                    Class<?>[] columnTypes = new Class<?>[] {
                                        Integer.class, Object.class, Object.class, Object.class, Object.class, Object.class
                                    };
                                    boolean[] columnEditable = new boolean[] {
                                        false, false, false, false, false, false
                                    };
                                    @Override
                                    public Class<?> getColumnClass(int columnIndex) {
                                        return columnTypes[columnIndex];
                                    }
                                    @Override
                                    public boolean isCellEditable(int rowIndex, int columnIndex) {
                                        return columnEditable[columnIndex];
                                    }
                                });
                                {
                                    TableColumnModel cm = clientesTable.getColumnModel();
                                    cm.getColumn(0).setMinWidth(55);
                                    cm.getColumn(0).setMaxWidth(55);
                                    cm.getColumn(0).setPreferredWidth(55);
                                }
                                clientesTable.setBackground(new Color(0x21252f));
                                clientesTable.setGridColor(new Color(0x009999));
                                clientesTable.setForeground(Color.white);
                                clientesTable.setSelectionBackground(Color.white);
                                clientesTable.setSelectionForeground(new Color(0x009999));
                                clientesScroll.setViewportView(clientesTable);
                            }

                            GroupLayout tabelaClientesPanelLayout = new GroupLayout(tabelaClientesPanel);
                            tabelaClientesPanel.setLayout(tabelaClientesPanelLayout);
                            tabelaClientesPanelLayout.setHorizontalGroup(
                                tabelaClientesPanelLayout.createParallelGroup()
                                    .addComponent(clientesScroll, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 1266, Short.MAX_VALUE)
                            );
                            tabelaClientesPanelLayout.setVerticalGroup(
                                tabelaClientesPanelLayout.createParallelGroup()
                                    .addGroup(tabelaClientesPanelLayout.createSequentialGroup()
                                        .addComponent(clientesScroll, GroupLayout.PREFERRED_SIZE, 686, GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 72, Short.MAX_VALUE))
                            );
                        }
                        panel5.add(tabelaClientesPanel, "card6");

                        //======== tabelaProdutosPanel ========
                        {
                            tabelaProdutosPanel.setBackground(new Color(0x21252f));
                            tabelaProdutosPanel.setForeground(Color.white);

                            //======== produtosScroll ========
                            {
                                produtosScroll.setBackground(new Color(0x21252f));

                                //---- produtosTable ----
                                produtosTable.setModel(new DefaultTableModel(
                                    new Object[][] {
                                    },
                                    new String[] {
                                        "idProduto", "Nome", "Telefone da importadora", "Endereco da importadora", "Quantidade", "Pre\u00e7o de compra", "Pre\u00e7o de Venda", "Data de cadastro"
                                    }
                                ) {
                                    Class<?>[] columnTypes = new Class<?>[] {
                                        Integer.class, Object.class, Object.class, Object.class, Object.class, Object.class, Object.class, Object.class
                                    };
                                    boolean[] columnEditable = new boolean[] {
                                        false, false, false, false, false, false, false, false
                                    };
                                    @Override
                                    public Class<?> getColumnClass(int columnIndex) {
                                        return columnTypes[columnIndex];
                                    }
                                    @Override
                                    public boolean isCellEditable(int rowIndex, int columnIndex) {
                                        return columnEditable[columnIndex];
                                    }
                                });
                                {
                                    TableColumnModel cm = produtosTable.getColumnModel();
                                    cm.getColumn(0).setMinWidth(55);
                                    cm.getColumn(0).setMaxWidth(55);
                                    cm.getColumn(0).setPreferredWidth(55);
                                    cm.getColumn(1).setMinWidth(250);
                                    cm.getColumn(1).setMaxWidth(500);
                                    cm.getColumn(1).setPreferredWidth(250);
                                }
                                produtosTable.setGridColor(new Color(0xffff66));
                                produtosTable.setForeground(Color.white);
                                produtosTable.setBackground(new Color(0x21252f));
                                produtosTable.setSelectionBackground(Color.white);
                                produtosTable.setSelectionForeground(Color.black);
                                produtosTable.setAutoCreateRowSorter(true);
                                produtosScroll.setViewportView(produtosTable);
                            }

                            GroupLayout tabelaProdutosPanelLayout = new GroupLayout(tabelaProdutosPanel);
                            tabelaProdutosPanel.setLayout(tabelaProdutosPanelLayout);
                            tabelaProdutosPanelLayout.setHorizontalGroup(
                                tabelaProdutosPanelLayout.createParallelGroup()
                                    .addGroup(tabelaProdutosPanelLayout.createSequentialGroup()
                                        .addComponent(produtosScroll, GroupLayout.PREFERRED_SIZE, 1188, GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 78, Short.MAX_VALUE))
                            );
                            tabelaProdutosPanelLayout.setVerticalGroup(
                                tabelaProdutosPanelLayout.createParallelGroup()
                                    .addGroup(tabelaProdutosPanelLayout.createSequentialGroup()
                                        .addComponent(produtosScroll, GroupLayout.PREFERRED_SIZE, 686, GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 72, Short.MAX_VALUE))
                            );
                        }
                        panel5.add(tabelaProdutosPanel, "card7");

                        //======== tabelaVendas ========
                        {

                            //======== vendasScroll ========
                            {

                                //---- vendasTable ----
                                vendasTable.setModel(new DefaultTableModel(
                                    new Object[][] {
                                    },
                                    new String[] {
                                        "idVenda", "Descri\u00e7\u00e3o", "Identificador do cliente", "Identificador do ususario", "Pre\u00e7o total", "Data da venda"
                                    }
                                ) {
                                    Class<?>[] columnTypes = new Class<?>[] {
                                        Integer.class, Object.class, Object.class, Object.class, Object.class, Object.class
                                    };
                                    boolean[] columnEditable = new boolean[] {
                                        false, true, true, true, true, true
                                    };
                                    @Override
                                    public Class<?> getColumnClass(int columnIndex) {
                                        return columnTypes[columnIndex];
                                    }
                                    @Override
                                    public boolean isCellEditable(int rowIndex, int columnIndex) {
                                        return columnEditable[columnIndex];
                                    }
                                });
                                {
                                    TableColumnModel cm = vendasTable.getColumnModel();
                                    cm.getColumn(0).setMinWidth(55);
                                    cm.getColumn(0).setMaxWidth(55);
                                    cm.getColumn(0).setPreferredWidth(55);
                                }
                                vendasTable.setBackground(new Color(0x21252f));
                                vendasTable.setForeground(Color.white);
                                vendasTable.setGridColor(new Color(0x009933));
                                vendasTable.setSelectionBackground(Color.white);
                                vendasTable.setSelectionForeground(new Color(0x009933));
                                vendasTable.setAutoCreateRowSorter(true);
                                vendasScroll.setViewportView(vendasTable);
                            }

                            GroupLayout tabelaVendasLayout = new GroupLayout(tabelaVendas);
                            tabelaVendas.setLayout(tabelaVendasLayout);
                            tabelaVendasLayout.setHorizontalGroup(
                                tabelaVendasLayout.createParallelGroup()
                                    .addComponent(vendasScroll, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 1266, Short.MAX_VALUE)
                            );
                            tabelaVendasLayout.setVerticalGroup(
                                tabelaVendasLayout.createParallelGroup()
                                    .addComponent(vendasScroll, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 758, Short.MAX_VALUE)
                            );
                        }
                        panel5.add(tabelaVendas, "card5");
                    }

                    GroupLayout verTabelasPanelLayout = new GroupLayout(verTabelasPanel);
                    verTabelasPanel.setLayout(verTabelasPanelLayout);
                    verTabelasPanelLayout.setHorizontalGroup(
                        verTabelasPanelLayout.createParallelGroup()
                            .addComponent(panel4, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(GroupLayout.Alignment.TRAILING, verTabelasPanelLayout.createSequentialGroup()
                                .addComponent(panel5, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
                    );
                    verTabelasPanelLayout.setVerticalGroup(
                        verTabelasPanelLayout.createParallelGroup()
                            .addGroup(verTabelasPanelLayout.createSequentialGroup()
                                .addComponent(panel4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(panel5, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    );
                }
                centralPane.add(verTabelasPanel, "card9");
            }

            GroupLayout mainPanelLayout = new GroupLayout(mainPanel);
            mainPanel.setLayout(mainPanelLayout);
            mainPanelLayout.setHorizontalGroup(
                mainPanelLayout.createParallelGroup()
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addComponent(panel3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(centralPane, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            );
            mainPanelLayout.setVerticalGroup(
                mainPanelLayout.createParallelGroup()
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addComponent(panel3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(151, 151, 151))
                    .addComponent(centralPane, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            );
        }
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    private JPanel mainPanel;
    private JPanel panel3;
    private JPanel logoPanel;
    private JPanel infoPanel;
    private JLabel nomeGerenteLbl;
    private JPanel manIconPanel;
    private JLabel managerIcon;
    private JPanel homeBtt;
    private JLabel label1;
    private JPanel funcBtt1;
    private JLabel label2;
    private JPanel funcBtt2;
    private JLabel label3;
    private JPanel cliBtt1;
    private JLabel label4;
    private JPanel cliBtt2;
    private JLabel label5;
    private JPanel prodBtt1;
    private JLabel label6;
    private JPanel prodBtt2;
    private JLabel label7;
    private JPanel efetuarVendaBtt;
    private JLabel label57;
    private JPanel verTabelasBtt;
    private JLabel label59;
    private JPanel centralPane;
    private JPanel homePanel;
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
    private JPanel cadFuncionarioPanel;
    private JPanel panel1;
    private JLabel label15;
    private JLabel label18;
    private JTextField cadFuncNomeField;
    private JSeparator separator3;
    private JLabel label19;
    private JTextField cadFuncTelField;
    private JSeparator separator7;
    private JLabel label20;
    private JTextField cadFuncEndField;
    private JSeparator separator8;
    private JLabel label21;
    private JTextField cadFuncUserField;
    private JSeparator separator9;
    private JLabel label22;
    private JPasswordField cadFuncSenField;
    private JSeparator separator10;
    private JButton cadFuncCleaBtt;
    private JButton cadFuncSaveBtt;
    private JPanel panel8;
    private JPanel ediFuncionarioPanel;
    private JLabel label28;
    private JTextField edifuncNomeField;
    private JSeparator separator16;
    private JTextField edifuncTelField;
    private JSeparator separator17;
    private JTextField edifuncEndField;
    private JSeparator separator18;
    private JTextField edifuncUserField;
    private JSeparator separator19;
    private JPasswordField edifuncSenField;
    private JSeparator separator20;
    private JButton ediFuncClearBtt;
    private JButton ediFuncSaveBtt;
    private JLabel label29;
    private JLabel label30;
    private JPanel panel2;
    private JLabel label33;
    private JLabel label34;
    private JLabel label35;
    private JLabel label36;
    private JTextField searchUser;
    private JSeparator separator21;
    private JPanel searchFuncPanel;
    private JLabel label37;
    private JLabel label42;
    private JTextField edifuncQtdField;
    private JSeparator separator22;
    private JLabel label43;
    private JTextField edifuncTipoField;
    private JSeparator separator23;
    private JLabel label44;
    private JTextField edifuncDataField;
    private JSeparator separator24;
    private JPanel panel9;
    private JPanel cadClientePanel;
    private JPanel sidePanel;
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
    private JPanel ediClientePanel;
    private JLabel label31;
    private JTextField ediClienteNomeField;
    private JSeparator separator25;
    private JLabel label32;
    private JTextField ediClienteTelefoneField;
    private JSeparator separator26;
    private JLabel label38;
    private JTextField ediClienteEnderecoField;
    private JLabel label40;
    private JTextField ediClienteUserField;
    private JSeparator separator28;
    private JSeparator separator29;
    private JButton ediClienteSaveBtt;
    private JButton ediClienteClearBtt;
    private JLabel label41;
    private JPanel sidePanel3;
    private JLabel label45;
    private JTextField searchID;
    private JSeparator separator30;
    private JLabel label47;
    private JTextField ediClienteDataField;
    private JSeparator separator31;
    private JPanel searchClientPanel;
    private JLabel label46;
    private JPanel panel11;
    private JPanel cadProdutoPanel;
    private JPanel sidePanel2;
    private JLabel label16;
    private JTextField cadProdNomeField;
    private JSeparator separator11;
    private JLabel label17;
    private JTextField cadProdTelefoneField;
    private JSeparator separator12;
    private JLabel label23;
    private JTextField cadProdPrecoCompra;
    private JLabel label24;
    private JTextField cadProdPrecoVenda;
    private JSeparator separator13;
    private JSeparator separator15;
    private JButton prodSaveBtt;
    private JButton prodClearBtt;
    private JLabel label26;
    private JLabel label27;
    private JTextField cadProdEndField;
    private JSeparator separator39;
    private JPanel panel12;
    private JLabel label25;
    private JTextField cadQuantidadeField;
    private JSeparator separator27;
    private JLabel label52;
    private JLabel label64;
    private JPanel ediProdutoPanel;
    private JPanel sidePanel4;
    private JLabel label48;
    private JTextField ediProdNomeField;
    private JSeparator separator32;
    private JLabel label49;
    private JTextField ediProdTelefoneField;
    private JSeparator separator33;
    private JLabel label50;
    private JTextField ediProdPrecoCompra;
    private JLabel label51;
    private JTextField ediProdPrecoVenda;
    private JSeparator separator34;
    private JSeparator separator36;
    private JButton ediProdSaveBtt;
    private JButton ediProdClearBtt;
    private JLabel label53;
    private JLabel label54;
    private JTextField ediProdDataField;
    private JSeparator separator37;
    private JLabel label55;
    private JTextField searchIdProduto;
    private JSeparator separator38;
    private JPanel searchProdPanel;
    private JLabel label56;
    private JLabel label58;
    private JTextField ediProdEndField;
    private JSeparator separator41;
    private JPanel panel13;
    private JLabel label67;
    private JLabel label68;
    private JPanel verTabelasPanel;
    private JPanel panel4;
    private JLabel label66;
    private JPanel verUsuarios;
    private JLabel txtUsuarios;
    private JPanel verClientes;
    private JLabel txtClientes;
    private JPanel verProdutos;
    private JLabel txtProdutos;
    private JPanel verVendas;
    private JLabel txtVendas;
    private JPanel panel5;
    private JPanel tabelaUsuariosPanel;
    private JScrollPane usuariosScroll;
    private JTable usuariosTable;
    private JPanel tabelaClientesPanel;
    private JScrollPane clientesScroll;
    private JTable clientesTable;
    private JPanel tabelaProdutosPanel;
    private JScrollPane produtosScroll;
    private JTable produtosTable;
    private JPanel tabelaVendas;
    private JScrollPane vendasScroll;
    private JTable vendasTable;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on

    public static void main(String[] args) {
        ImageIcon imageIcon = new ImageIcon("src/icons/icon.png");
        JFrame dashboardGer = new JFrame();
        dashboardGer.pack();
        dashboardGer.setContentPane(new dashboardGerente().mainPanel);
        dashboardGer.setTitle("Dashboard");
        dashboardGer.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        dashboardGer.setSize(1500, 800);
        dashboardGer.setIconImage(imageIcon.getImage());
        dashboardGer.setVisible(true);
    }
}
