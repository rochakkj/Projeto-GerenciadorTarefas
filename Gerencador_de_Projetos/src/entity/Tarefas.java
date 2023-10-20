package entity;

//Classe para definir e controlar tarefas
public class Tarefas
{
    //Atributos para criação de Tarefa
    private String Nome;
    private String Data;
    private Double Nota;
    private Disciplinas disciplinas;

    //Construtor
    public Tarefas(String nome, String data, Double nota, Disciplinas discipliinas)
    {
        Nome = nome;
        Data = data;
        Nota = nota;
        this.disciplinas = disciplinas;
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

    public Disciplinas getDiscipliinas()
    {
        return disciplinas;
    }

    public void setDiscipliinas(Disciplinas discipliinas)
    {
        this.disciplinas = discipliinas;
    }

    //ToString

    @Override
    public String toString()
    {
        return "Tarefas{" +
                "Nome='" + Nome + '\'' +
                ", Data='" + Data + '\'' +
                ", Nota=" + Nota +
                ", disciplinas=" + disciplinas +
                '}';
    }
}
