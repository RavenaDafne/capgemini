package projetoTarefas.controller;

import projetoTarefas.model.Project;
import projetoTarefas.util.ConnectionFactory;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public class ProjectController {
    public void save(Project project){
        String sql = "INSERT INTO project (name, description, createdAt, updatedAt) VALUES (?,?,?,?)";

        Connection connection = null;
        PreparedStatement statement = null;

        try {
            //Cria uma Conecxão com o Banco de Dados
            connection =  ConnectionFactory.getConnection();
            // Cria um PreparedSatment, classe usada para executar uma query
            statement = connection.prepareStatement(sql);

            statement.setString(1, project.getName());
            statement.setString(2, project.getDescription());
            statement.setDate(3,new Date(project.getCreatedAt().getTime()));
            statement.setDate(4,new Date(project.getUpdatedAt().getTime()));

            //Executa a sql para inserção dos Dados
            statement.execute();

        } catch (SQLException ex) {
            throw new RuntimeException("Erro ao salvar Projeto!" + ex.getMessage(),ex);
        }finally {
            ConnectionFactory.closeConnection(connection,statement);


        }


    }
    public void update(Project project){

        String sql = "UPDATE project SET name = ?, description = ?,createdAt = ?,updatedAt = ? WHERE id = ?";

        Connection connection = null;
        PreparedStatement statement = null;

        try{
            //Estabelecendo a conexão com o Banco de Dados
            connection = ConnectionFactory.getConnection();

            //Setando os valores do statement
            statement = connection.prepareStatement(sql);
            statement.setString(1, project.getName());
            statement.setString(2, project.getDescription());
            statement.setDate(3,new Date(project.getCreatedAt().getTime()));
            statement.setDate(4,new Date(project.getUpdatedAt().getTime()));
            statement.setInt(5,project.getId());
            statement.execute();

            //Executando a query

        }catch(Exception ex){
            throw new RuntimeException("Erro ao atualizar o Projeto!" + ex.getMessage(), ex);
        }finally {
            ConnectionFactory.closeConnection(connection,statement);
        }
    }

    public List<Project> getAll() {
        String sql = "SELECT * FROM project";
        List<Project> projects = new ArrayList<>();

        Connection connection = null;
        PreparedStatement statement = null;

        ResultSet resultSet = null;

        try {
            connection = ConnectionFactory.getConnection();
            statement = connection.prepareStatement(sql);
            resultSet = statement.executeQuery();

            while ( resultSet.next()){

                Project projectItem = new Project();

                projectItem.setId(resultSet.getInt("id"));
                projectItem.setName(resultSet.getString("name"));
                projectItem.setDescription(resultSet.getString("description"));
                projectItem.setCreatedAt(resultSet.getDate("createdAt"));
                projectItem.setCreatedAt(resultSet.getDate("updatedAt"));

               /** Project projectItem =  new Project();

                projectItem.setId(resultSet.getInt("id"));
                projectItem.setName(resultSet.getString("name"));
                projectItem.setDescription(resultSet.getString("description"));
                projectItem.setCreatedAt(new Date(resultSet.getDate("createdAt").getTime()));
                projectItem.setUpdatedAt(new Date(resultSet.getDate("updatedAt").getTime()));
*/
                projects.add(projectItem);
            }

        } catch (SQLException ex) {
            throw new RuntimeException("Erro ao buscar os projetos ", ex);
        } finally {
            ConnectionFactory.closeConnection(connection, statement,resultSet);
        }
        return projects;
    }
    public void removeById(int idProject) {

        String sql = "DELETE FROM project WHERE id = ?";


        Connection connection =  null;
        PreparedStatement statement = null;

        try{
            //Criação da Conxeção do Banco de Dados
            connection = ConnectionFactory.getConnection();
            //Preparando a Query
            statement = connection.prepareStatement(sql);
            //Setando os valores
            statement.setInt(1,idProject);
            //Executando a Query
            statement.execute();

        }catch (SQLException ex){
            throw new RuntimeException("Erro ao deletar o Projeto" + ex.getMessage(), ex);
        }finally {
            ConnectionFactory.closeConnection(connection,statement);
        }

    }
}
