package entity;
import jakarta.persistence.*;

import java.util.Scanner;

@Entity
@Table
public class Tarefas {

    //Atributos para criação de Tarefa

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private String Nome;

    @Column
    private String Data;

    @Column
    private Double Nota;

    @Column
    private Boolean A;
    //Construtor
    public Tarefas(String nome, String data, Double nota, Boolean A)
    {
        Nome = nome;
        Data = data;
        Nota = nota;
        this.A = A;
    }

    //Getter e Setter
    public String getNome()
    {
        return Nome;
    }

    public void setNome(String nome)
    {
        Nome = nome;
    }

    public String getData()
    {
        return Data;
    }

    public void setData(String data)
    {
        Data = data;
    }

    public Double getNota()
    {
        return Nota;
    }

    public void setNota(Double nota)
    {
        Nota = nota;
    }



    //ToString

    @Override
    public String toString()
    {
        return "Tarefas{" +
                "Nome='" + Nome + '\'' +
                ", Data='" + Data + '\'' +
                ", Nota=" + Nota +
                '}';
    }

    public static void CriaTarefas(String nome, String data, Double nota, Boolean A)
    {
        int j, h = 0;
        Tarefas tarefa[] = new Tarefas[10];
        Scanner scanner = new Scanner(System.in);
        do
        {
            System.out.println("CRIE UMA TAREFA!");
            System.out.println("Qual é o NOME da tarefa? ");
            nome = scanner.nextLine();
            System.out.println("Qual é a DATA da tarefa? ");
            data = scanner.nextLine();
            System.out.println("Qual foi a sua nota? ");
            nota = scanner.nextDouble();
            System.out.println("Você já realizou a tarefa? [true] ou [false]");
            A = scanner.nextBoolean();

            tarefa[h] = new Tarefas(nome, data, nota, A);
            System.out.println("TAREFA CRIADA!!");
            System.out.println(tarefa[h]);
            h++;
            System.out.println("Deseja continuar? Digite [0] para NÃO e [1] para SIM: ");
            j = scanner.nextInt();
            h++;
        }while (j == 1);
    }
}