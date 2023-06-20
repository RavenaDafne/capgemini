package projetoTarefas.controller;

import projetoTarefas.model.Task;
import projetoTarefas.util.ConnectionFactory;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class TaskController {
    public void save(Task task){
        //criando uma string com script sql
      String sql = "INSERT INTO tasks (idProject, name, description, completed, observation, deadline, createdAt, updatedAt) VALUES(?,?,?,?,?,?,?,?)";

      Connection connection =  null;
      PreparedStatement statement =  null;

      try {
          connection = ConnectionFactory.getConnection();
          statement = connection.prepareStatement(sql);
          statement.setInt(1,task.getIdProject());
          statement.setString(2, task.getName());
          statement.setString(3, task.getDescription());
          statement.setBoolean(4,task.isCompleted());
          statement.setString(5,task.getObservation());
          statement.setDate(6,new Date(task.getDeadline().getTime()));
          statement.setDate(7,new Date(task.getCreatedAt().getTime()));
          statement.setDate(8,new Date(task.getUpdatedAt().getTime()));
          statement.execute();

      }catch (Exception ex){
          throw new RuntimeException("Erro ao Salvar a tarefa! " + ex.getMessage(),ex);

      } finally {ConnectionFactory.closeConnection(connection,statement);

      }
    }
    public void update(Task task){

String sql = "UPDATE tasks SET idProject = ?, name = ?, description = ?, completed = ?, observation = ?, deadline = ?, createdAt = ?,  updatedAt = ? WHERE id= ?";

  Connection connection = null;
  PreparedStatement statement = null;

  try{
      //Estabelecendo a conexão com o Banco de Dados
      connection = ConnectionFactory.getConnection();

      //Setando os valores do statement
      statement = connection.prepareStatement(sql);
      statement.setInt(1, task.getIdProject());
      statement.setString(2, task.getName());
      statement.setString(3, task.getDescription());
      statement.setBoolean(4, task.isCompleted());
      statement.setString(5, task.getObservation());
      statement.setDate(6, new java.sql.Date(task.getDeadline().getTime()));
      statement.setDate(7, new java.sql.Date(task.getCreatedAt().getTime()));
      statement.setDate(8, new java.sql.Date(task.getUpdatedAt().getTime()));
      statement.setInt(9,task.getId());
      statement.execute();

      //Executando a query

  }catch(Exception ex){
        throw new RuntimeException("Erro ao atualizar a tarefa!" + ex.getMessage(), ex);
    }
    }
    public void removeById(int taskId) throws SQLException {
      String sql = "DELETE FROM tasks WHERE id = ?";


        Connection connection =  null;
        PreparedStatement statement = null;

        try{
            //Criação da Conxeção do Banco de Dados
          connection = ConnectionFactory.getConnection();
            //Preparando a Query
          statement = connection.prepareStatement(sql);
            //Setando os valores
          statement.setInt(1,taskId);
            //Executando a Query
          statement.execute();

        }catch (Exception ex){
            throw new RuntimeException("Erro ao deletar a tarefa" + ex.getMessage(), ex);
        }finally {
             ConnectionFactory.closeConnection(connection,statement);
        }

    }
    public List<Task> getAll() {

        String sql = "SELECT * FROM tasks";

        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;

        // Lista de tarefas que será devolvida quando a chamada do método acontecer

        List<Task> tasks = new ArrayList<Task>();

        try {
            //Criação da Conexão
            connection = ConnectionFactory.getConnection();
            statement = connection.prepareStatement(sql);

            //Valor retornado pela execução da query
            resultSet = statement.executeQuery();

            //Enquanto houveram valores a serem percorridos no meu resultSet
            while (resultSet.next()) {

                Task task = new Task();
                task.setId(resultSet.getInt("id"));
                task.setIdProject(resultSet.getInt("idProject"));
                task.setName(resultSet.getString("name"));
                task.setDescription(resultSet.getString("description"));
                task.setObservation(resultSet.getString("observation"));
                task.setDeadline(resultSet.getDate("deadline"));
                task.setCompleted(resultSet.getBoolean("completed"));
                task.setCreatedAt(resultSet.getDate("createdAt"));
                task.setCreatedAt(resultSet.getDate("updatedAt"));

                tasks.add(task);
            }

        } catch (Exception ex) {
            throw new RuntimeException("Erro ao inserir a tarefa" + ex.getMessage(), ex);
        } finally {
            ConnectionFactory.closeConnection(connection,statement, resultSet);
        }

// Retornando a Lista de Tarefas, criada e e carregada do Banco de Dados

    return tasks;
    }
    public List<Task> getByProjectId(int id) {
        String sql = "SELECT * FROM tasks where idProject = ?";

        List<Task> tasks = new ArrayList<>();

        Connection connection= null;
        PreparedStatement statement = null;

        //Classe que vai recuperar os dados do banco de dados
        ResultSet resultSet = null;

        try {
            connection = ConnectionFactory.getConnection();
            statement = connection.prepareStatement(sql);

            statement.setInt(1, id);

            resultSet = statement.executeQuery();

            //Enquanto existir dados no banco de dados, fa�a
            while (resultSet.next()) {

                Task task = new Task();

                task.setId(resultSet.getInt("id"));
                task.setIdProject(resultSet.getInt("idProject"));
                task.setName(resultSet.getString("name"));
                task.setDescription(resultSet.getString("description"));
                task.setObservation(resultSet.getString("observation"));
                task.setDeadline(resultSet.getDate("deadline"));
                task.setCompleted(resultSet.getBoolean("completed"));
                task.setCreatedAt(resultSet.getDate("createdAt"));
                task.setCreatedAt(resultSet.getDate("updatedAt"));

                //Adiciono o contato recuperado, a lista de contatos
                tasks.add(task);
            }
        } catch (SQLException ex) {
            throw new RuntimeException("Erro ao buscar as tarefas", ex);
        } finally {
            try {
                if (resultSet != null) {
                    resultSet.close();
                }
                if (statement!= null) {
                    statement.close();
                }
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException ex) {
                throw new RuntimeException("Erro ao fechar a conexão", ex);
            }
        }
        return tasks;
    }

}
