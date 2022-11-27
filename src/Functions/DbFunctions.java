package Functions;

import atores.Cliente;
import atores.Usuario;
import estoque.Produto;
import pedido.Venda;
import javax.swing.*;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DbFunctions {
    public Connection connect_to_db(String dbname, String user, String pass) {
        Connection conn = null;
        try {
            Class.forName("org.postgresql.Driver");
            conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/" + dbname, user, pass);
            if (conn == null) {
                JOptionPane.showMessageDialog(null, "Falha na conex\u00E3o");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return conn;
    }

    public void drop_table(Connection conn, String table_name){
        Statement statement;
        try {
            String query = String.format("DROP TABLE  %s cascade", table_name);
            statement=conn.createStatement();
            statement.executeUpdate(query);
            JOptionPane.showMessageDialog(null, "Tabela deletada");
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public void createTables(Connection conn){
        Statement statement;
        try {
            String querySequenceCliente = "CREATE SEQUENCE IF NOT EXISTS incrementoCliente INCREMENT 1 MINVALUE 1 MAXVALUE 9999999 START 1;";
            statement = conn.createStatement();
            statement.executeUpdate(querySequenceCliente);

            String querySequenceProduto = "CREATE SEQUENCE IF NOT EXISTS incrementoProduto INCREMENT 1 MINVALUE 1 MAXVALUE 9999999 START 1;";
            statement=conn.createStatement();
            statement.executeUpdate(querySequenceProduto);

            String querySequeceVenda = "CREATE SEQUENCE IF NOT EXISTS incrementoVenda INCREMENT 1 MINVALUE 1 MAXVALUE 9999999 START 1;";
            statement=conn.createStatement();
            statement.executeUpdate(querySequeceVenda);

            String queryCreateTableCliente = "CREATE TABLE IF NOT EXISTS Cliente (idcliente int PRIMARY KEY DEFAULT nextval('incrementoCliente'), nome text, telefone text, endereco text, fk_Usuario_usuario text, dataCadastro text);";
            statement = conn.createStatement();
            statement.executeUpdate(queryCreateTableCliente);

            String queryCreateTableUsuario = "CREATE TABLE IF NOT EXISTS Usuario (usuario text PRIMARY KEY, nome text, telefone text, endereco text, senha text, qtdvendas int, usuariotipo text, datacadastro text);";
            statement = conn.createStatement();
            statement.executeUpdate(queryCreateTableUsuario);

            String queryCreateTableProduto = "CREATE TABLE IF NOT EXISTS Produto (idproduto int PRIMARY KEY DEFAULT nextval('incrementoProduto'), nome text, telefone text, endereco text, quantidade int, precocompra float, precovenda float, datacadastro text);";
            statement = conn.createStatement();
            statement.executeUpdate(queryCreateTableProduto);

            String queryCreateTableVenda = "CREATE TABLE IF NOT EXISTS Venda (idVenda int PRIMARY KEY DEFAULT nextval('incrementoVenda'), descricao text, fk_Cliente_idCliente int, fk_Usuario_usuario text, precoTotal float, dataVenda text);";
            statement = conn.createStatement();
            statement.executeUpdate(queryCreateTableVenda);

            String queryAlterTableCliente = "ALTER TABLE cliente DROP CONSTRAINT IF EXISTS  fk_cliente_2; ALTER TABLE Cliente ADD CONSTRAINT FK_Cliente_2 FOREIGN KEY (fk_Usuario_usuario) REFERENCES Usuario (usuario) ON DELETE CASCADE;";
            statement = conn.createStatement();
            statement.executeUpdate(queryAlterTableCliente);

            String queryAlterTableVenda1 =  "ALTER TABLE venda DROP CONSTRAINT IF EXISTS FK_Venda_2; ALTER TABLE Venda ADD CONSTRAINT FK_Venda_2 FOREIGN KEY (fk_Cliente_idcliente) REFERENCES Cliente (idcliente) ON DELETE CASCADE;";
            statement = conn.createStatement();
            statement.executeUpdate(queryAlterTableVenda1);

            String queryAlterTableVenda2 =  "ALTER TABLE venda DROP CONSTRAINT IF EXISTS FK_Venda_3; ALTER TABLE Venda ADD CONSTRAINT FK_Venda_3 FOREIGN KEY (fk_Usuario_usuario) REFERENCES Usuario(usuario) ON DELETE CASCADE;";
            statement = conn.createStatement();
            statement.executeUpdate(queryAlterTableVenda2);
        }catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public void insert_row_funcionario(Connection conn, String table_name, String user, String name, String number,
                                       String address, String password, String usertype, String datacadastro){
        Statement statement;
        try{
            String query = String.format("insert into %s(usuario, nome, telefone, endereco, senha, qtdvendas, " +
                            "usuariotipo, datacadastro) values('%s', '%s', '%s', '%s', '%s', '0', '%s', '%s');",
                    table_name, user, name, number, address, password, usertype, datacadastro);
            statement=conn.createStatement();
            statement.executeUpdate(query);
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public void insert_row_cliente(Connection conn, String table_name, String name, String number, String address,
                                   String date, String userUsuario){
        Statement statement;
        try{
            String query = String.format("INSERT INTO %s(nome, telefone, endereco, fk_usuario_usuario, datacadastro) " +
                    "VALUES('%s', '%s', '%s', '%s', '%s');", table_name, name, number, address, userUsuario, date);
            statement=conn.createStatement();
            statement.executeUpdate(query);
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public void insert_row_produto(Connection conn, String name, String number, String address,
                                   Integer qtd, String precoCompra, String precoVenda, String datacadastro){
        Statement statement;
        try {
            String query = String.format("INSERT INTO produto(nome, telefone, endereco, quantidade, precoCompra, precoVenda, datacadastro) VALUES('%s', '%s', '%s', '%s', '%s', '%s', '%s');", name, number, address, qtd, precoCompra, precoVenda, datacadastro);
            statement = conn.createStatement();
            statement.executeUpdate(query);
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public void insert_row_venda(Connection conn, String descricao, Integer idCliente,
                                 String userUsuario, String precototal, String datavenda){
        Statement statement;
        try {
            String query = String.format("INSERT INTO venda(descricao, fk_cliente_idCliente, fk_usuario_usuario, precototal, datavenda) VALUES ('%s', '%s', '%s', '%s', '%s');", descricao, idCliente, userUsuario, precototal, datavenda);
            statement=conn.createStatement();
            statement.executeUpdate(query);
        }catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public void delete_row(Connection conn, String table_name, String where, String deletar){
        Statement statement;
        try{
            String query = String.format("delete from %s where %s='%s';", table_name, where, deletar);
            statement= conn.createStatement();
            statement.executeUpdate(query);
            JOptionPane.showMessageDialog(null, "Fileira deletada");

        }catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }

    // Get Information
    public String getNome_info(Connection conn, String table_name, String id, String usuario){
        Statement statement;
        ResultSet rs;
        try {
            String query = String.format("SELECT nome FROM %s WHERE %s='%s'", table_name, id, usuario);
            statement = conn.createStatement();
            rs = statement.executeQuery(query);
            while (rs.next()){
                return rs.getString("nome");

            }


        }catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        return null;
    }                         // Ambos
    public String getTelefone_info(Connection conn, String table_name, String tipoDeId, String id){
        Statement statement;
        ResultSet rs;
        try {
            String query = String.format("select telefone from %s where %s='%s'", table_name, tipoDeId, id);
            statement = conn.createStatement();
            rs = statement.executeQuery(query);
            while (rs.next()){
                return rs.getString("telefone");
            }

        }catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        return null;
    }                     // Ambos
    public String getEndereco_info(Connection conn, String table_name, String id, String usuario){
        Statement statement;
        ResultSet rs;
        try {
            String query = String.format("select endereco from %s where %s='%s'", table_name, id, usuario);
            statement = conn.createStatement();
            rs = statement.executeQuery(query);
            while (rs.next()){
                return rs.getString("endereco");
            }

        }catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        return null;
    }                     // Ambos

    public String getIdCliente_info(Connection conn,  String idCliente){
        Statement statement;
        ResultSet rs;
        try {
            String query = String.format("select idCliente from cliente where idCliente='%s'", idCliente);
            statement = conn.createStatement();
            rs = statement.executeQuery(query);
            while (rs.next()){
                return rs.getString("idCliente");
            }

        }catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        return null;
    }                                               // CLIENTES
    public String getIdUser_info(Connection conn, String idCliente){
        Statement statement;
        ResultSet rs;
        try {
            String query = String.format("select fk_usuario_usuario from cliente where idCliente='%s'", idCliente);
            statement = conn.createStatement();
            rs = statement.executeQuery(query);
            while (rs.next()){
                return rs.getString("fk_usuario_usuario");
            }

        }catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        return null;
    }                                                   // CLIENTES
    public String getUser_info(Connection conn, String usuario) {
        Statement statement;
        ResultSet rs;
        try {
            String query = String.format("select usuario from usuario where usuario='%s'", usuario);
            statement = conn.createStatement();
            rs = statement.executeQuery(query);
            while (rs.next()) {
                return rs.getString("usuario");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return null;
    }                                                      // USUARIOS
    public String getSenha_info(Connection conn, String usuario){
        Statement statement;
        ResultSet rs;
        try {
            String query = String.format("SELECT senha FROM usuario WHERE usuario='%s'", usuario);
            statement = conn.createStatement();
            rs = statement.executeQuery(query);
            while (rs.next()){
                return rs.getString("senha");
            }

        }catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        return null;
    }                                                      // USUARIOS
    public String getUsuarioTipo_info(Connection conn, String usuario){
        Statement statement;
        ResultSet rs;
        try {
            String query = String.format("select usuariotipo from usuario where usuario='%s'", usuario);
            statement = conn.createStatement();
            rs = statement.executeQuery(query);
            while (rs.next()){
                return rs.getString("usuariotipo");
            }

        }catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        return null;
    }                                                // USARIOS
    public String getDataCadastro_info(Connection conn, String table_name, String id, String usuario){
        Statement statement;
        ResultSet rs;
        try {
            String query = String.format("select datacadastro from %s where %s='%s'", table_name, id, usuario);
            statement = conn.createStatement();
            rs = statement.executeQuery(query);
            while (rs.next()){
                return rs.getString("datacadastro");
            }

        }catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        return null;
    }                 // Ambos

    public String getProductID_info(Connection conn, Integer idproduto){
        Statement statement;
        ResultSet rs;
        try {
            String query = String.format("select idproduto from produto where idproduto='%s'", idproduto);
            statement = conn.createStatement();
            rs = statement.executeQuery(query);
            while (rs.next()){
                return rs.getString("idproduto");
            }

        }catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        return null;
    }                                               // Produtos
    public String getPrecoCompra_info(Connection conn, Integer idproduto){
        Statement statement;
        ResultSet rs;
        try {
            String query = String.format("select precocompra from produto where idproduto='%s'", idproduto);
            statement = conn.createStatement();
            rs = statement.executeQuery(query);
            while (rs.next()){
                return rs.getString("precocompra");
            }

        }catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        return null;
    }                                             // Produtos
    public String getPrecoVenda_info(Connection conn, Integer idproduto){
        Statement statement;
        ResultSet rs;
        try {
            String query = String.format("SELECT precovenda FROM produto WHERE idproduto='%s'", idproduto);
            statement = conn.createStatement();
            rs = statement.executeQuery(query);
            while (rs.next()){
                return rs.getString("precovenda");
            }

        }catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        return null;
    }                                              // Produtos

    public void precTotal(Integer idproduto, String quantidade) {
        DbFunctions db = new DbFunctions();
        Connection conn = db.connect_to_db("InfoTech", "postgres", "lbj23kb24mj45");
        String precoVend = String.valueOf(db.getPrecoVenda_info(conn, idproduto));
        Double precTot = Double.parseDouble(precoVend)*Double.parseDouble(quantidade);
        JOptionPane.showMessageDialog(null, precTot);
    }

    public String getQtdVendas_info(Connection conn, String usuario){
        Statement statement;
        ResultSet rs;
        try {
            String query = String.format("SELECT qtdvendas FROM usuario WHERE usuario='%s'", usuario);
            statement = conn.createStatement();
            rs = statement.executeQuery(query);
            while (rs.next()){
                return rs.getString("qtdvendas");
            }
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        return null;
    }

    public void vendaEfetuada(Connection conn, String usuario, String quantidade){
        Statement statement;
        String qtdVendas = String.valueOf(Integer.parseInt(getQtdVendas_info(conn, usuario)));

        try{
            String queryI = String.format("UPDATE usuario SET qtdvendas = '%s' WHERE usuario='%s'", Integer.parseInt(qtdVendas)+1, usuario);
            statement=conn.createStatement();
            statement.executeUpdate(queryI);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public String getQuantidadeItem(Connection conn, String idproduto) {
        Statement statement;
        ResultSet rs;
        try {
            String query = String.format("SELECT quantidade FROM produto WHERE idproduto='%s'", idproduto) ;
            statement= conn.createStatement();
            rs=statement.executeQuery(query);
            while (rs.next()) {
                return rs.getString("quantidade");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);

        }
        return null;
    }

    public void updateQtdItens(Connection conn, String idproduto, String quantidade) {
        Statement statement;
        try {
            String query= String.format("UPDATE produto SET quantidade = '%s' WHERE idproduto = '%s'", Integer.parseInt(getQuantidadeItem(conn, idproduto))-Integer.parseInt(quantidade), Integer.parseInt(idproduto));
            statement=conn.createStatement();
            statement.executeUpdate(query);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    // Update Usuário
    public void update_user(Connection conn, String table_name, String usuario, String novoNome, String novoTelefone,
                            String novoEndereco, String novoUser, String novoSenha, String novoqtdVendas,
                            String novoUsuarioTipo, String novoDataCadastro){
        Statement statement;
        try{
            String queryName =          String.format("UPDATE %s SET nome =         '%s' WHERE usuario = '%s'", table_name, novoNome,           usuario);
            String queryTelefone =      String.format("UPDATE %s SET telefone =     '%s' WHERE usuario = '%s'", table_name, novoTelefone,       usuario);
            String queryEndereco =      String.format("UPDATE %s SET endereco =     '%s' WHERE usuario = '%s'", table_name, novoEndereco,       usuario);
            String queryUsuario=        String.format("UPDATE %s SET usuario =      '%s' WHERE usuario = '%s'", table_name, novoUser,           usuario);
            String querySenha =         String.format("UPDATE %s SET senha =        '%s' WHERE usuario = '%s'", table_name, novoSenha,          usuario);
            String queryQtdVendas =     String.format("UPDATE %s SET qtdvendas =    '%s' WHERE usuario = '%s'", table_name, novoqtdVendas,      usuario);
            String queryUsuarioTipo =   String.format("UPDATE %s SET usuariotipo =  '%s' WHERE usuario = '%s'", table_name, novoUsuarioTipo,    usuario);
            String queryDataCadastro =  String.format("UPDATE %s SET datacadastro = '%s' WHERE usuario = '%s'", table_name, novoDataCadastro,   usuario);

            statement = conn.createStatement();
            statement.executeUpdate(queryName);
            statement = conn.createStatement();
            statement.executeUpdate(queryTelefone);
            statement = conn.createStatement();
            statement.executeUpdate(queryEndereco);
            statement = conn.createStatement();
            statement.executeUpdate(queryUsuario);
            statement = conn.createStatement();
            statement.executeUpdate(querySenha);
            statement = conn.createStatement();
            statement.executeUpdate(queryQtdVendas);
            statement = conn.createStatement();
            statement.executeUpdate(queryUsuarioTipo);
            statement = conn.createStatement();
            statement.executeUpdate(queryDataCadastro);
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    // Update Cliente
    public void update_client(Connection conn, String table_name, String idCliente, String novoNome,
                              String novoTelefone, String novoEndereco, String novoUserUsuario, String novoDataCadastro) {
        Statement statement;
        try{
            String queryName =          String.format("UPDATE %s SET nome =         '%s'        WHERE idCliente = '%s'", table_name, novoNome,         idCliente);
            String queryTelefone =      String.format("UPDATE %s SET telefone =     '%s'        WHERE idCliente = '%s'", table_name, novoTelefone,     idCliente);
            String queryEndereco =      String.format("UPDATE %s SET endereco =     '%s'        WHERE idCliente = '%s'", table_name, novoEndereco,     idCliente);
            String queryUserUsuario =   String.format("UPDATE %s SET fk_usuario_usuario =  '%s' WHERE idCliente = '%s'", table_name, novoUserUsuario,  idCliente);
            String queryDataCadastro =  String.format("UPDATE %s SET datacadastro = '%s'        WHERE idCliente = '%s'", table_name, novoDataCadastro, idCliente);

            statement = conn.createStatement();
            statement.executeUpdate(queryName);
            statement = conn.createStatement();
            statement.executeUpdate(queryTelefone);
            statement = conn.createStatement();
            statement.executeUpdate(queryEndereco);
            statement = conn.createStatement();
            statement.executeUpdate(queryUserUsuario);
            statement = conn.createStatement();
            statement.executeUpdate(queryDataCadastro);
            statement = conn.createStatement();

        }catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }

    // Update Produto
    public void update_produto(Connection conn, String table_name, String idProduto, String PnovoNome,
                               String PTelefone, String PEnd, String Pprecocompra, String PprecoVenda, String PData) {
        Statement statement;
        try{
            String queryPNome =         String.format("UPDATE %s SET nome =                 '%s' WHERE idproduto = '%s'", table_name,   PnovoNome,      idProduto);
            String queryPTelefone =     String.format("UPDATE %s SET telefone =             '%s' WHERE idproduto = '%s'", table_name,   PTelefone,      idProduto);
            String queryPEndereco =     String.format("UPDATE %s SET endereco =             '%s' WHERE idproduto = '%s'", table_name,   PEnd,           idProduto);
            String queryPPrecoCompra =  String.format("UPDATE %s SET precocompra =          '%s' WHERE idproduto = '%s'", table_name,   Pprecocompra,   idProduto);
            String queryPPrecoVenda =   String.format("UPDATE %s SET precovenda =           '%s' WHERE idproduto = '%s'", table_name,   PprecoVenda,    idProduto);
            String queryPData =         String.format("UPDATE %s SET datacadastro =         '%s' WHERE idproduto = '%s'", table_name,   PData,          idProduto);

            statement = conn.createStatement();
            statement.executeUpdate(queryPNome);
            statement = conn.createStatement();
            statement.executeUpdate(queryPTelefone);
            statement = conn.createStatement();
            statement.executeUpdate(queryPEndereco);
            statement = conn.createStatement();
            statement.executeUpdate(queryPPrecoCompra);
            statement = conn.createStatement();
            statement.executeUpdate(queryPPrecoVenda);
            statement = conn.createStatement();
            statement.executeUpdate(queryPData);

        }catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }

    // Ler dados Usuarios
    public List<Usuario> read_dataUsuarios(Connection conn){
        PreparedStatement statement1;
        List<Usuario> usuariosList = new ArrayList<>();
        try{
            statement1=conn.prepareStatement("SELECT * FROM usuario");
            ResultSet rs1=statement1.executeQuery();
            while (rs1.next()){
                Usuario usuario = new Usuario();
                usuario.setUser(rs1.getString("usuario"));
                usuario.setNome(rs1.getString("nome"));
                usuario.setTelefone(rs1.getString("telefone"));
                usuario.setEndereco(rs1.getString("endereco"));
                usuario.setSenha(rs1.getString("senha"));
                usuario.setQtdVendas(Integer.parseInt(rs1.getString("qtdvendas")));
                usuario.setUsuarioTipo(rs1.getString("usuariotipo"));
                usuario.setDataCadastro(rs1.getString("datacadastro"));
                usuariosList.add(usuario);
            }
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        return usuariosList;
    }
    public List<String> read_idUsuario(Connection conn) {
        PreparedStatement statement;
        List<String> idUsuarioList = new ArrayList<>();
        try{
            statement=conn.prepareStatement("SELECT usuario FROM usuario");
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                String idUser = rs.getString("usuario");
                idUsuarioList.add(idUser);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return idUsuarioList;
    }
    public boolean verificarUsuario(String usuario, List nomeUsuarioList) {
        DbFunctions db = new DbFunctions();
        Connection conn = db.connect_to_db("InfoTech", "postgres", "lbj23kb24mj45");
        nomeUsuarioList=db.read_idUsuario(conn);
        if(nomeUsuarioList.contains(usuario)) {
            return true;
        }
        else {
            return false;
        }
    }

    // Ler dados Clientes
    public List<String> read_idCliente(Connection conn) {
        PreparedStatement statement;
        List<String> idClienteList = new ArrayList<>();
        try{
            statement=conn.prepareStatement("SELECT idcliente FROM cliente");
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                String idUser = rs.getString("idcliente");
                idClienteList.add(idUser);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return idClienteList;
    }
    public List<Cliente> read_dataClientes(Connection conn){
        PreparedStatement statement2;
        List<Cliente> clienteList = new ArrayList<>();
        try{
            statement2= conn.prepareStatement("SELECT * FROM cliente");
            ResultSet rs2=statement2.executeQuery();
            while (rs2.next()) {
                Cliente cliente = new Cliente();
                cliente.setIdCliente(rs2.getString("idcliente"));
                cliente.setNome(rs2.getString("nome"));
                cliente.setTelefone(rs2.getString("telefone"));
                cliente.setEndereco(rs2.getString("endereco"));
                cliente.setUserUsuario(rs2.getString("fk_usuario_usuario"));
                cliente.setDataCadastro(rs2.getString("datacadastro"));
                clienteList.add(cliente);
            }
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        return clienteList;
    }
    public boolean verificarCliente(String idcliente, List idClienteList) {
        DbFunctions db = new DbFunctions();
        Connection conn = db.connect_to_db("InfoTech", "postgres", "lbj23kb24mj45");
        idClienteList=db.read_idCliente(conn);
        if(idClienteList.contains(idcliente)) {
            return true;
        }
        else {
            return false;
        }
    }

    // Ler dados Produtos
    public List<Produto> read_dataProdutos(Connection conn){
        PreparedStatement statement3;
        List<Produto> produtoList = new ArrayList<>();
        try{
            statement3 = conn.prepareStatement("SELECT * FROM produto");
            ResultSet rs3=statement3.executeQuery();
            while (rs3.next()){
                Produto produto = new Produto();
                produto.setIdProduto(rs3.getString("idproduto"));
                produto.setProdutoNome(rs3.getString("nome"));
                produto.setTelefoneImportadora(rs3.getString("telefone"));
                produto.setEnderecoImportadora(rs3.getString("endereco"));
                produto.setQuantidade(Integer.parseInt(rs3.getString("quantidade")));
                produto.setPrecoCompra(String.valueOf(rs3.getString("precocompra")));
                produto.setPrecoVenda(String.valueOf(rs3.getString("precovenda")));
                produto.setDatacadastro(rs3.getString("datacadastro"));
                produtoList.add(produto);
            }
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        return produtoList;
    }

    public List<String> read_idProduto(Connection conn) {
        PreparedStatement statement;
        List<String> idProdutoList = new ArrayList<>();
        try{
            statement=conn.prepareStatement("SELECT idproduto FROM produto");
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                String idUser = rs.getString("idproduto");
                idProdutoList.add(idUser);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return idProdutoList;
    }
    public boolean verificarProduto(String idproduto, List idProdutoList) {
        DbFunctions db = new DbFunctions();
        Connection conn = db.connect_to_db("InfoTech", "postgres", "lbj23kb24mj45");
        idProdutoList=db.read_idProduto(conn);
        if(idProdutoList.contains(idproduto)) {
            return true;
        }
        else {
            return false;
        }
    }


    // Ler dados Vendas
    public List<Venda> read_dataVendas(Connection conn){
        PreparedStatement statement3;
        List<Venda> vendasList = new ArrayList<>();
        try {
            statement3 = conn.prepareStatement("SELECT * FROM venda");
            ResultSet rs3 = statement3.executeQuery();
            while (rs3.next()){
                Venda venda = new Venda();
                venda.setIdVenda(rs3.getString("idvenda"));
                venda.setDescricao(rs3.getString("descricao"));
                venda.setIdCliente(String.valueOf(rs3.getString("fk_cliente_idcliente")));
                venda.setIdUsuario(rs3.getString("fk_usuario_usuario"));
                venda.setPrecoTotal(String.valueOf(rs3.getString("precototal")));
                venda.setDataVenda(rs3.getString("datavenda"));
                vendasList.add(venda);
            }
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        return vendasList;
    }



    public static void main(String[] args) {
        DbFunctions db = new DbFunctions();
        Connection conn = db.connect_to_db("InfoTech", "postgres", "lbj23kb24mj45");
    }
}
