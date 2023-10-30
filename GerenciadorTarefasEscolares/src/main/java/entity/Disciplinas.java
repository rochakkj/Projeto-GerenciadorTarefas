package entity;

import jakarta.persistence.*;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.HibernateUtil;

import java.util.List;
import java.util.Scanner;

//Classe para definir e controlar Disciplinas
@Entity
@Table
public class Disciplinas
{
    //Atributos para definição de Disciplinas
    @Column
    private String Nome;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String Codigo;

    @Column
    private String Professor;

    @Column
    private String Tipo;

    @Column
    private String Bloco;


    @Column
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn (name = "tarefas_id")
    private Tarefas tarefas;

    //Construtor
    public Disciplinas(String nome, String codigo, String professor, String tipo, String bloco)
    {
        Nome = nome;
        Codigo = codigo;
        Professor = professor;
        Tipo = tipo;
        Bloco = bloco;
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

    public String getCodigo()
    {
        return Codigo;
    }

    public void setCodigo(String codigo)
    {
        Codigo = codigo;
    }

    public String getProfessor()
    {
        return Professor;
    }

    public void setProfessor(String professor)
    {
        Professor = professor;
    }

    public String getTipo()
    {
        return Tipo;
    }

    public void setTipo(String tipo)
    {
        Tipo = tipo;
    }

    public String getBloco()
    {
        return Bloco;
    }

    public void setBloco(String bloco)
    {
        Bloco = bloco;
    }

    public Tarefas getTarefas()
    {
        return tarefas;
    }

    public void setTarefas(Tarefas tarefas)
    {
        this.tarefas = tarefas;
    }

    //ToString
    @Override
    public String toString()
    {
        return "Disciplinas{" +
                "Nome='" + Nome + '\'' +
                ", Codigo='" + Codigo + '\'' +
                ", Professor='" + Professor + '\'' +
                ", Tipo='" + Tipo + '\'' +
                ", Bloco='" + Bloco + '\'' +
                ", tarefas=" + tarefas +
                '}';
    }

    public static void CriaDisciplinas(String nome, String codigo, String professor, String tipo, String bloco, Tarefas tarefa[])
    {
        int k, g = 0;
        Disciplinas disciplina[] = new Disciplinas[10];
        do{

            Scanner scanner = new Scanner(System.in);
            System.out.println("Qual o NOME da disciplina? ");
            nome = scanner.nextLine();
            System.out.println("Qual o CODIGO da disciplina? ");
            codigo = scanner.nextLine();
            System.out.println("Qual o PROFESSOR da disciplina? ");
            professor = scanner.nextLine();
            System.out.println("Qual o TIPO da disciplina? ");
            tipo = scanner.nextLine();
            System.out.println("Qual o BLOCO da disciplina? ");
            bloco = scanner.nextLine();

            int B;
            disciplina[g] = new Disciplinas(nome, codigo, professor, tipo, bloco);
            System.out.println("Gostaria de adicionar alguma TAREFA a essa disciplina? Digite [0] para NÃO e [1] para SIM: ");
            B = scanner.nextInt();
            if (B == 1)
            {
                disciplina[g] = new Disciplinas(nome,codigo,professor,tipo,bloco);
                disciplina[g].setTarefas(tarefa[g]);

                Session session1 = HibernateUtil.getSessionFactory().openSession();

                Transaction transaction1 = session1.beginTransaction();


                session1.persist(disciplina[g]);

                transaction1.commit();

                List<Disciplinas> disciplinas = session1.createQuery("from Disciplinas", Disciplinas.class).list();

                disciplinas.forEach(v -> System.out.println(v));

                System.out.println(disciplinas.get(0));
            }
            System.out.println("DISCIPLINA CRIADA!!");
            System.out.println(disciplina[g]);
            System.out.println("Deseja continuar? Digite [0] para NÃO e [1] para SIM: ");
            k = scanner.nextInt();
            g++;
        }while (k == 1);
    }
}