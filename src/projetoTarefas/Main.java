package projetoTarefas;

import projetoTarefas.controller.ProjectController;
import projetoTarefas.controller.TaskController;
import projetoTarefas.model.Project;
import projetoTarefas.model.Task;
import projetoTarefas.util.ConnectionFactory;

import java.sql.Connection;
import java.util.Date;
import java.util.List;

/**
 *  ------------- Nome Projeto:  Aplicativo Tarefas -----------------
 * Descrição: Aplicação para gerenciamento de projetos e suas tarefas
 * Objetivo: Resolver a questão de organização de tarefas de um ou vários projetos.
 * Entidades:
 *  - Projeto;
 *     - Atributos:
 *        Nome;
 *        Descrição;
 *        Data de Criação;
 *        Data de Atualização;
 *  - Tarefa:
 *        Nome;
 *        Descrição;
 *        Status;
 *        Observações;
 *        Prazo;
 *        Data de Criação;
 *        Data de Atualização.
 *  -----------------------------------------------------------------
 * Requisitos:
 *  - Permitir criar o  Projetos;
 *  - Permitir alterar o Projetos;
 *  - Permitir deletar o Projetos;
 *  - Permitir criar a Tarefas;
 *  - Permitir alterar a Tarefas;
 *  - Permitir deletar a Tarefas.
 *  -----------------------------------------------------------------
 *  Regras de Negócio:
 *  - Não irá conter um Sistema de Login;
 *  - Não haverá o conceito de usuário;
 *  - Toda tarefa deve pertencer a uma lista;
 *  - Não pode haver tags repetidas numa mesma tarefa;
 *  -----------------------------------------------------------------
 *  Tecnologias Utilizadas:
 *  - Java;
 *  - MySQL;
 *
 *  Criando as classes:
 *  Modelo MVC: MODEL;VIEWS;CONTROLERS.
 */

/**
 * Criando a concecção e fechando.
 */
public class Main {
    public static void main(String[] args) {

        ProjectController projectController = new ProjectController();

        Project project = new Project();



       /** project.setId(0);
       project.setName("Novo nome do Projeto StarLink");
        projectController.update(project);
*/
        List<Project> projects = projectController.getAll();
        System.out.println("Total de Projetos: " + projects.size());
        System.out.println("O nome dos Porjetos" + projects);


        projectController.update(project);
        System.out.println("O projeto atualizado : " + project);

        projectController.removeById(2);

        TaskController taskController = new TaskController();
        Task task = new Task();
        task.setIdProject(5);
        task.setName("Criar o wareframe 10");
        task.setDescription("Usando o Figma");
        task.setObservation("Projeto web para criação de venda do servico de internet StarLink!");
        task.setCompleted(false);
        task.setDeadline(new Date());


        taskController.save(task);

        task.setName("Criar o web site");
        taskController.update(task);
        List<Task> tasks = taskController.getAll();
        System.out.println("Total de tarefas: " + tasks.size());
    }

}
