package entity;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.util.Scanner;


//Classe para Login do Usuário
@Entity
@Table(name = "Usuário")
public class Login
{
    //Atributos para realização segura de Login
    private String Nome;
    private String DatadeNasc;
    private String CPF;
    private String RG;
    private String Email;
    private String Senha;

    //Construtor
    public Login(String nome, String datadeNasc, String CPF, String RG, String email, String senha)
    {
        Nome = nome;
        DatadeNasc = datadeNasc;
        this.CPF = CPF;
        this.RG = RG;
        Email = email;
        Senha = senha;
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

    public String getDatadeNasc()
    {
        return DatadeNasc;
    }

    public void setDatadeNasc(String datadeNasc)
    {
        DatadeNasc = datadeNasc;
    }

    public String getCPF()
    {
        return CPF;
    }

    public void setCPF(String CPF)
    {
        this.CPF = CPF;
    }

    public String getRG()
    {
        return RG;
    }

    public void setRG(String RG)
    {
        this.RG = RG;
    }

    public String getEmail()
    {
        return Email;
    }

    public void setEmail(String email)
    {
        Email = email;
    }

    public String getSenha()
    {
        return Senha;
    }

    public void setSenha(String senha)
    {
        Senha = senha;
    }

    //ToString

    @Override
    public String toString()
    {
        return "Login{" +
                "Nome='" + Nome + '\'' +
                ", DatadeNasc='" + DatadeNasc + '\'' +
                ", CPF='" + CPF + '\'' +
                ", RG='" + RG + '\'' +
                ", Email='" + Email + '\'' +
                ", Senha='" + Senha + '\'' +
                '}';
    }

    public static void CriaLogin(String nome, String datadeNasc, String CPF, String RG, String email, String senha)
    {
        int i, f = 0;
        Login login[] = new Login[10];
        do
        {
            Scanner scanner = new Scanner(System.in);
            System.out.println("BEM VINDO!!!");
            System.out.println("Faça seu LOGIN");
            System.out.println("Qual é o seu NOME? ");
            nome = scanner.nextLine();
            System.out.println("Quando você NASCEU? ");
            datadeNasc = scanner.nextLine();
            System.out.println("Qual é o seu CPF? ");
            CPF = scanner.nextLine();
            System.out.println("Qual é o seu RG? ");
            RG = scanner.nextLine();
            System.out.println("Digite o seu EMAIL: ");
            email = scanner.nextLine();
            System.out.println("Crie uma SENHA: ");
            senha = scanner.nextLine();


            login[f] = new Login(nome,datadeNasc, CPF, RG, email, senha);
            System.out.println("LOGIN FEITO!!");
            System.out.println(login[f]);
            System.out.println("Deseja continuar? Digite [0] para NÃO e [1] para SIM: ");
            i = scanner.nextInt();
            f++;
        }while (i == 1);
    }
}
