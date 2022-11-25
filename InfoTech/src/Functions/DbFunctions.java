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
            String querySequence = "CREATE SEQUENCE IF NOT EXISTS incremento INCREMENT 1 MINVALUE 1 MAXVALUE 9999999 START 1;";
            statement = conn.createStatement();
            statement.executeUpdate(querySequence);

            String queryCreateTableCliente = "CREATE TABLE IF NOT EXISTS Cliente (idcliente int PRIMARY KEY DEFAULT nextval('incremento'), nome text, telefone text, endereco text, fk_Usuario_usuario text, dataCadastro text);";
            statement = conn.createStatement();
            statement.executeUpdate(queryCreateTableCliente);

            String queryCreateTableUsuario = "CREATE TABLE IF NOT EXISTS Usuario (usuario text PRIMARY KEY, nome text, telefone text, endereco text, senha text, qtdvendas int, usuariotipo text, datacadastro text);";
            statement = conn.createStatement();
            statement.executeUpdate(queryCreateTableUsuario);

            String queryCreateTableProduto = "CREATE TABLE IF NOT EXISTS Produto (idproduto int PRIMARY KEY DEFAULT nextval('incremento'), nome text, telefone text, endereco text, quantidade int, precocompra float, precovenda float, datacadastro text);";
            statement = conn.createStatement();
            statement.executeUpdate(queryCreateTableProduto);

            String queryCreateTableVenda = "CREATE TABLE IF NOT EXISTS Venda (idVenda int PRIMARY KEY DEFAULT nextval('incremento'), fk_Cliente_idCliente int, fk_Usuario_usuario text, preçoTotal float, dataVenda text);";
            statement = conn.createStatement();
            statement.executeUpdate(queryCreateTableVenda);

            String queryAlterTableCliente = "ALTER TABLE Cliente ADD CONSTRAINT FK_Cliente_2 FOREIGN KEY (fk_Usuario_usuario) REFERENCES Usuario (usuario) ON DELETE CASCADE;";
            statement = conn.createStatement();
            statement.executeUpdate(queryAlterTableCliente);

            String queryAlterTableVenda1 =  "ALTER TABLE Venda ADD CONSTRAINT FK_Venda_2 FOREIGN KEY (fk_Cliente_idcliente) REFERENCES Cliente (idcliente) ON DELETE CASCADE;";
            statement = conn.createStatement();
            statement.executeUpdate(queryAlterTableVenda1);

            String queryAlterTableVenda2 =  "ALTER TABLE Venda ADD CONSTRAINT FK_Venda_3 FOREIGN KEY (fk_Usuario_usuario) REFERENCES Usuario(usuario) ON DELETE CASCADE;";
            statement = conn.createStatement();
            statement.executeUpdate(queryAlterTableVenda2);
        }catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public void resetCounter(Connection conn, String table_name, String collum_name) {
        Statement statement;
        try{
            String query = String.format("SELECT setval(pg_get_serial_sequence('%s', '%s'), coalesce(MAX(%s), 0)) from %s;",table_name, collum_name, collum_name, table_name);
            statement=conn.createStatement();
            statement.executeUpdate(query);
            JOptionPane.showMessageDialog(null, "Contador resetado");
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

    public void insert_row_cliente(Connection conn, String table_name, String name, String number, String address, String date, String userUsuario){
        Statement statement;
        try{
            String query = String.format("insert into %s(nome, telefone, endereco, fk_usuario_usuario, datacadastro) values('%s', '%s', '%s', '%s', '%s');", table_name, name, number, address, userUsuario, date);
            statement=conn.createStatement();
            statement.executeUpdate(query);
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public void insert_row_produto(Connection conn, String table_name, String name, String number, String address, Integer qtd, String precoCompra, String precoVenda, String datacadastro){
        Statement statement;
        try {
            String query = String.format("insert into %s(nome, telefone, endereco, quantidade, precoCompra, precoVenda, datacadastro) values ('%s', '%s', '%s', '%s', '%s', '%s', '%s');", table_name, name, number, address, qtd, precoCompra, precoVenda, datacadastro);
            statement = conn.createStatement();
            statement.executeUpdate(query);
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public void insert_row_venda(Connection conn, String table_name, Integer idCliente, String userUsuario, Float precototal, String datavenda){
        Statement statement;
        try {
            String query = String.format("INSERT INTO %s(fk_cliente_idCliente, fk_usuario_usuario, precototal, datavenda) VALUES ('%s', '%s', '%s', '%s');", table_name, idCliente, userUsuario, precototal, datavenda);
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

    public void read_data(Connection conn, String table_name){
        Statement statement;
        ResultSet rs;
        try{
            String query = String.format("select * from %s", table_name);
            statement= conn.createStatement();
            rs = statement.executeQuery(query);
            while (rs.next()){
                JOptionPane.showMessageDialog(null,
                        rs.getString("idCliente")+ " "+"\n"+
                                rs.getString("nome")+" "+"\n"+
                                rs.getString("telefone")+" "+"\n"+
                                rs.getString("endereco")+" "+"\n");
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }

    // Get Information
    public String getNome_info(Connection conn, String table_name, String id, String usuario){
        Statement statement;
        ResultSet rs;
        try {
            String query = String.format("select nome from %s where %s='%s'", table_name, id, usuario);
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
    public String getTelefone_info(Connection conn, String table_name, String id, String usuario){
        Statement statement;
        ResultSet rs;
        try {
            String query = String.format("select telefone from %s where %s='%s'", table_name, id, usuario);
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

    public String getIdCliente_info(Connection conn, String table_name, String idCliente){
        Statement statement;
        ResultSet rs;
        try {
            String query = String.format("select idCliente from %s where idCliente='%s'", table_name, idCliente);
            statement = conn.createStatement();
            rs = statement.executeQuery(query);
            while (rs.next()){
                return rs.getString("idCliente");
            }

        }catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        return null;
    }                             // CLIENTES
    public String getIdUser_info(Connection conn, String table_name, String idCliente){
        Statement statement;
        ResultSet rs;
        try {
            String query = String.format("select userusuario from %s where idCliente='%s'", table_name, idCliente);
            statement = conn.createStatement();
            rs = statement.executeQuery(query);
            while (rs.next()){
                return rs.getString("userusuario");
            }

        }catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        return null;
    }                                // CLIENTES
    public String getUser_info(Connection conn, String table_name, String usuario) {
        Statement statement;
        ResultSet rs;
        try {
            String query = String.format("select usuario from %s where usuario='%s'", table_name, usuario);
            statement = conn.createStatement();
            rs = statement.executeQuery(query);
            while (rs.next()) {
                return rs.getString("usuario");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return null;
    }                                   // USUARIOS
    public String getSenha_info(Connection conn, String table_name, String usuario){
        Statement statement;
        ResultSet rs;
        try {
            String query = String.format("select senha from %s where usuario='%s'", table_name, usuario);
            statement = conn.createStatement();
            rs = statement.executeQuery(query);
            while (rs.next()){
                return rs.getString("senha");
            }

        }catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        return null;
    }                                   // USUARIOS
    public String getQtdVendas_info(Connection conn, String table_name, String usuario){
        Statement statement;
        ResultSet rs;
        try {
            String query = String.format("select qtdvendas from %s where usuario='%s'", table_name, usuario);
            statement = conn.createStatement();
            rs = statement.executeQuery(query);
            while (rs.next()){
                return rs.getString("qtdvendas");
            }

        }catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        return null;
    }                               // USUARIOS
    public String getUsuarioTipo_info(Connection conn, String table_name, String usuario){
        Statement statement;
        ResultSet rs;
        try {
            String query = String.format("select usuariotipo from %s where usuario='%s'", table_name, usuario);
            statement = conn.createStatement();
            rs = statement.executeQuery(query);
            while (rs.next()){
                return rs.getString("usuariotipo");
            }

        }catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        return null;
    }                             // USARIOS
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
    public String getProductID_info(Connection conn, String table_name, Integer idproduto){
        Statement statement;
        ResultSet rs;
        try {
            String query = String.format("select idproduto from %s where idproduto='%s'", table_name, idproduto);
            statement = conn.createStatement();
            rs = statement.executeQuery(query);
            while (rs.next()){
                return rs.getString("idproduto");
            }

        }catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        return null;
    }                             // Produtos
    public String getProductFone_info(Connection conn, String table_name, Integer idproduto){
        Statement statement;
        ResultSet rs;
        try {
            String query = String.format("select telefoneimportadora from %s where idproduto='%s'", table_name, idproduto);
            statement = conn.createStatement();
            rs = statement.executeQuery(query);
            while (rs.next()){
                return rs.getString("telefoneimportadora");
            }

        }catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        return null;
    }                           // Produtos
    public String getProductEndereco_info(Connection conn, String table_name, Integer idproduto){
        Statement statement;
        ResultSet rs;
        try {
            String query = String.format("select enderecoimportadora from %s where idproduto='%s'", table_name, idproduto);
            statement = conn.createStatement();
            rs = statement.executeQuery(query);
            while (rs.next()){
                return rs.getString("enderecoimportadora");
            }

        }catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        return null;
    }                       // Produtos
    public String getPrecoCompra_info(Connection conn, String table_name, Integer idproduto){
        Statement statement;
        ResultSet rs;
        try {
            String query = String.format("select precocompra from %s where idproduto='%s'", table_name, idproduto);
            statement = conn.createStatement();
            rs = statement.executeQuery(query);
            while (rs.next()){
                return rs.getString("precocompra");
            }

        }catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        return null;
    }                           // Produtos
    public String getPrecoVenda_info(Connection conn, String table_name, Integer idproduto){
        Statement statement;
        ResultSet rs;
        try {
            String query = String.format("SELECT precovenda FROM %s WHERE idproduto='%s'", table_name, idproduto);
            statement = conn.createStatement();
            rs = statement.executeQuery(query);
            while (rs.next()){
                return rs.getString("precovenda");
            }

        }catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        return null;
    }                            // Produtos

    public int getQuantidade(Connection conn, Integer idproduto){
        Statement statement;
        try{
            String query = String.format("SELECT quantidade FROM produto WHERE idproduto='%s';", idproduto);
            statement= conn.createStatement();
            return statement.executeUpdate(query);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return -1;
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

    public void vendaEfetuada(Connection conn, String usuario){
        Statement statement;
        try{
            String query = String.format("UPDATE %s SET qtdvendas = '%s' WHERE usuario  = '%s'", usuario);
            statement=conn.createStatement();
            statement.executeUpdate(query);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    // Update Cliente
    public void update_client(Connection conn, String table_name, String idCliente, String novoNome,
                              String novoTelefone, String novoEndereco, String novoUserUsuario, String novoDataCadastro) {
        Statement statement;
        try{
            String queryName =          String.format("update %s set nome =         '%s' where idCliente = '%s'", table_name, novoNome,         idCliente);
            String queryTelefone =      String.format("update %s set telefone =     '%s' where idCliente = '%s'", table_name, novoTelefone,     idCliente);
            String queryEndereco =      String.format("update %s set endereco =     '%s' where idCliente = '%s'", table_name, novoEndereco,     idCliente);
            String queryUserUsuario =   String.format("update %s set userusuario =  '%s' where idCliente = '%s'", table_name, novoUserUsuario,  idCliente);
            String queryDataCadastro =  String.format("update %s set datacadastro = '%s' where idCliente = '%s'", table_name, novoDataCadastro, idCliente);

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
            String queryPNome =         String.format("update %s set nome =                 '%s' where idproduto = '%s'", table_name,   PnovoNome,      idProduto);
            String queryPTelefone =     String.format("update %s set telefoneimportadora =  '%s' where idproduto = '%s'", table_name,   PTelefone,      idProduto);
            String queryPEndereco =     String.format("update %s set enderecoimportadora =  '%s' where idproduto = '%s'", table_name,   PEnd,           idProduto);
            String queryPPrecoCompra =  String.format("update %s set precocompra =          '%s' where idproduto = '%s'", table_name,   Pprecocompra,   idProduto);
            String queryPPrecoVenda =   String.format("update %s set precovenda =           '%s' where idproduto = '%s'", table_name,   PprecoVenda,    idProduto);
            String queryPData =         String.format("update %s set datacadastro =         '%s' where idproduto = '%s'", table_name,   PData,          idProduto);

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

    // Ler os dados das tabelas
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

    public List<Produto> read_dataProdutos(Connection conn){
        PreparedStatement statement3;
        List<Produto> produtoList = new ArrayList<>();
        try{
            statement3 = conn.prepareStatement("SELECT * FROM produto");
            ResultSet rs3=statement3.executeQuery();
            while (rs3.next()){
                Produto produto = new Produto();
                produto.setIdProduto(Integer.parseInt(rs3.getString("idproduto")));
                produto.setProdutoNome(rs3.getString("nome"));
                produto.setTelefoneImportadora(rs3.getString("telefone"));
                produto.setEnderecoImportadora(rs3.getString("endereco"));
                produto.setQuantidade(Integer.parseInt(rs3.getString("quantidade")));
                produto.setPrecoCompra(rs3.getString("precocompra"));
                produto.setPrecoVenda(rs3.getString("precovenda"));
                produto.setDatacadastro(rs3.getString("datacadastro"));
                produtoList.add(produto);
            }
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        return produtoList;
    }

    public List<Venda> read_dataVendas(Connection conn){
        PreparedStatement statement3;
        List<Venda> vendasList = new ArrayList<>();
        try {
            statement3 = conn.prepareStatement("SELECT * FROM venda");
            ResultSet rs3 = statement3.executeQuery();
            while (rs3.next()){
                Venda venda = new Venda();
                venda.setIdVenda(rs3.getString(""));
                venda.setPrecoTotal(Float.valueOf(rs3.getString("")));
                venda.setDataVenda(rs3.getString(""));
                venda.setIdCliente(Integer.parseInt(rs3.getString("")));
                venda.setIdUsuario(rs3.getString(""));
                venda.setQtdItem(Integer.valueOf(rs3.getString("")));
                venda.setIdProduto(rs3.getString(""));
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
