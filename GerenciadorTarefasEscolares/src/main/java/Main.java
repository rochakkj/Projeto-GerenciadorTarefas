import org.hibernate.Session;
import org.hibernate.Transaction;
import entity.Disciplinas;
import entity.Login;
import entity.Tarefas;
import util.HibernateUtil;
import java.util.List;

public class Main
{
    public static void main(String[] args)
    {
        Login.CriaLogin(null,null,null,null,null,null);
        Tarefas.CriaTarefas(null,null,null,null);
        Disciplinas.CriaDisciplinas(null,null,null,null,null,new Tarefas[10]);
    }
}
