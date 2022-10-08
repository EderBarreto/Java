package controller;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import model.Task;
import util.ConnectionFactory;
import javax.management.RuntimeErrorException;

/**
 *
 * @author ederson
 */
public class TaskController {

    public void save(Task task){

        String sql = "INSERT INTO tasks(idProject"
                + " name,"
                + " description,"
                + " completed,"
                + " notes,"
                + " deadline,"
                + " createdAt,"
                + " updateAt) VALUES (?,?,?,?,?,?,?,?)";

        Connection connection = null;
        PreparedStatement statement = null;

        try {
            connection = ConnectionFactory.getConnection();
            statement = connection.prepareStatement(sql);
            statement.setInt(1, task.getIdProject());
            statement.setString(2, task.getName());
            statement.setString(3, task.getDescription());
            statement.setBoolean(4, task.isIsCompleted());
            statement.setString(5, task.getNotes());
            statement.setDate(6, new Date(task.getDeadline().getTime()));
            statement.setDate(7, new Date(task.getCreatedAt().getTime()));
            statement.setDate(8, new Date(task.getUpdateAt().getTime()));
            statement.execute();
        } catch (Exception ex) {
            throw new RuntimeException("Erro ao salvar tarefa" + ex.getMessage(), ex);
        } finally {
            ConnectionFactory.closeConnection(connection, statement);
        }    
    }
}


public void update(Task task){
        String sql = "UPDATE tasks SET "
        + "IdProject = ?, "
        +  "name = ?, " 
        + "description = ?, "
        + "notes = ?, "
        + "completed = ?, "
        + "deadline = ?, "
        + "createdAt = ?, "
        + "updateAt = ?, "
        + "WHERE Id = ? ";

        Connection connection= null;
        PreparedStatement statement = null;

        try {
//Estabelecendo conexão com BD
            connection = ConnectionFactory.getConnection();
//Preeparando a query
            statement = connection.prepareStatement(sql);
//setando os valores statement
            statement.setInt(1,task.getIdProject());
            statement.setString(2,task.getName());
            statement.setString(3,task.getDescription());
            statement.setString(4,task.getNotes());
            statement.setBoolean(5,task.isIsCompleted());
            statement.setDate(6, new Date(task.getDeadline().getTime()));
            statement.setDate(7, new Date(task.getCreatedAt().getTime()));
            statement.setDate(8, new Date(task.getUpdateAt().getTime()));
            statement.setInt(9, taskgetId());
//Executando a query
            statement.execute();

        } catch (Exception ex) {
            throw new RuntimeException("Erro ao atualizar a tarefa "+ ex.getMessage(),ex);
        }
        

    }
    
    public void removeById(int taskId) throws SQLException{
        
        String sql = "DELETE FROM tasks WHERE id = ?";
        
        Connection connection = null;
        PreparedStatement statement = null;
        
        try {
           //criação da conexão com BD 
            connection  = ConnectionFactory.getConnection();
//Preparando a query
            statement = connection.prepareStatement(sql);
//setando valores
            statement.setInt(1,taskId);
//executando a query
            statement.execute();
        } catch (Exception ex) {
            throw new RuntimeErrorException("Erro ao deletar a tarefa"+ ex.getMessage(),ex);
                
        }finally{
            ConnectionFactory.closeConnection(connection, statement);
        } 
   
    }
    
    public List<Task> getAll (int idProject){
        
        String sql = "SELECT * FROM tasks WHERE idProject = ?";

        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;


//lista de terefas que será devolvida quando o método acontecer
        List<Tasks> tasks = new ArrayList<Tasks>();
        try{
//criação de conexao
            connection  = ConnectionFactory.getConnection();

            statement = connection.prepareStatement(sql);
//setando o valor que corresponde ao filtro de busca
            statement.setInt(1,idProject);
//Valor retornado pela execução da query
            resultSet = statement.executeQuery();
            //Enquanto houverem valores  SEREM PERCORRIDOS no meu resultSet
            while(resultSet.next()){
                Task task = new Task();
                task.setid(resultSet.getInt("id"));
                task.setIdProject(resultSet.getInt("idProject"));
                task.setName(resultSet.getString("name"));
                task.setDescription(resultSet.getString("description"));
                task.setNotes(resultSet.getString("notes"));
                task.setIsCompleted(resultSet.getBoolean("completed"));
                task.setDeadLine(resultSet.getDate("deadline"));
                task.setCreatedAt(resultSet.getDate("createdAt"));
                task.setUpdatedAt(resultSet.getDate("upDateAt"));

                tasks.add(tasks);
            }
                
        }catch (Exception ex) {
            throw new RuntimeErrorException("Erro ao inserir a tarefa"+ ex.getMessage(),ex);
                
        }finally{
            ConnectionFactory.closeConnection(connection, statement, resultSet);
        } 

//lista de tarefas que foi criada e carregada do BD
        return tasks;
    }
    
    
}
