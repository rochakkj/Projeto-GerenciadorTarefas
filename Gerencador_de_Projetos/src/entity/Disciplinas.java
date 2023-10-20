package entity;

//Classe para definir e controlar Disciplinas
public class Disciplinas
{
    //Atributos para definição de Disciplinas
    private String Nome;
    private String Codigo;
    private String Professor;
    private String Tipo;
    private String Bloco;
    private Tarefas tarefas;

    //Construtor
    public Disciplinas(String nome, String codigo, String professor, String tipo, String bloco, Tarefas tarefas)
    {
        Nome = nome;
        Codigo = codigo;
        Professor = professor;
        Tipo = tipo;
        Bloco = bloco;
        this.tarefas = tarefas;
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
}
