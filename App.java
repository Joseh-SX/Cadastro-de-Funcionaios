import java.util.ArrayList;
import java.util.Scanner;

public class App {
    //implementação da Array onde serão armazenados os objetos funcionario
    private static ArrayList <Pessoa> listaFuncionarios = new ArrayList<>();
    private static int id = 0;

    public static void main(String[] args) {
        //Estrutura de repetição para exibirMenu
        int opcao = -1;
        while(opcao != 0) {
            opcao = exibirMenu(); 
        }
        }

    public static int exibirMenu(){
        
        Scanner scanner = new Scanner(System.in);
        int opcao;
        
        System.out.println("");
        System.out.println("Escolha uma opção: ");
        System.out.println("1 - Cadastrar funcionário - construtor 1");
        System.out.println("2 - Cadastrar funcionário - construtor 2");
        System.out.println("3 - Consultar funcionário");
        System.out.println("4 - Listar todos os funcionários");
        System.out.println("0 - Sair do sistema");

        //Estrutura de seleção
        opcao = scanner.nextInt();
        scanner.nextLine();
	        
        switch (opcao) {
        case 1:
            cadastrar1(scanner);
            break;
        case 2:
            cadastrar2(scanner);
            break;
        case 3:
            consultar(scanner);
            break;
        case 4:
            listar();
            break;
        case 0:
            System.out.println("Saindo do sistema...");
            break;
        default:
            System.out.println("Opção inválida. Tente novamente.");
            break;
        }
        //Retorno usado no método de repetição de apresentarMenu
        return opcao;
    }

    public static void cadastrar1 (Scanner scanner) {
        //Método para solicitar, ler e armazenar informações em variáveis
        System.out.println("Dígite o nome do funcionário.");
        String nome = scanner.nextLine();
        System.out.println("Dígite quais alergias o funcionário possui.");
        String alergia = scanner.nextLine();
        System.out.println("Dígite os problemas de saúde do funcionário.");
        String problema = scanner.nextLine();
        System.out.println("Dígite o telefone do funcionário.");
        String telefone = scanner.nextLine();
        System.out.println("Dígite o email do funcionário.");
        String email = scanner.nextLine();
        System.out.println("Dígite o cargo.");
        String cargo = scanner.nextLine();

        //método para ciar novo objeto funcionario
        Funcionario funcionario = (Funcionario) new Funcionario (id, nome, alergia, problema, telefone, email, cargo);
        listaFuncionarios.add(funcionario);
        System.out.println("");
        System.out.println("Funcionário cadastrado com sucesso.");
        id++;
    }
    
    public static void cadastrar2 (Scanner scanner) {
        Funcionario funcionario = (Funcionario) new Funcionario ();
        
        //Método para solicitar, ler e armazenar informações em variáveis
        System.out.println("Dígite o nome do funcionário.");
        funcionario.setNome(scanner.nextLine());
        System.out.println("Dígite quais alergias o funcionário possui.");
        funcionario.setAlergia(scanner.nextLine());
        System.out.println("Dígite os problemas de saúde do funcionário.");
        funcionario.setProblemas(scanner.nextLine());
        System.out.println("Dígite o telefone do funcionário.");
        funcionario.setTelefone(scanner.nextLine());
        System.out.println("Dígite o email do funcionário.");
        funcionario.setEmail(scanner.nextLine());
        System.out.println("Dígite o cargo.");
        funcionario.setCargo(scanner.nextLine());

        //método para ciar novo objeto funcionario
        
        listaFuncionarios.add(funcionario);
        System.out.println("");
        System.out.println("Funcionário cadastrado com sucesso.");
        id++;
    }

    public static void consultar(Scanner scanner) {
        System.out.println("Dígite o Id do funcionário que deseja consultar");
        int i = scanner.nextInt();
        Funcionario funcionario = (Funcionario) listaFuncionarios.get(i);
        System.out.println("");
        System.out.print("id: ");
        System.out.println(funcionario.getId());
        System.out.print("nome: ");
        System.out.println(funcionario.getNome());
        System.out.print("Alergia: ");
        System.out.println(funcionario.getAlergia());
        System.out.print("Problemas de saúde: ");
        System.out.println(funcionario.getProblemas());
        System.out.print("Telefone: ");
        System.out.println(funcionario.getTelefone());
        System.out.print("Email: ");
        System.out.println(funcionario.getEmail());
        System.out.print("Cargo: ");
        System.out.println(funcionario.getCargo());
        System.out.println("");
    }

    public static void listar() {
        //extrutura de repetição para listar todos os objetos e suas respectivas variáveis
        for(int i = 0; i < listaFuncionarios.size(); i++) {
            Funcionario funcionario = (Funcionario) listaFuncionarios.get(i);
            System.out.println("");
            System.out.print("id: ");
            System.out.println(funcionario.getId());
            System.out.print("nome: ");
            System.out.println(funcionario.getNome());
            System.out.print("Alergia: ");
            System.out.println(funcionario.getAlergia());
            System.out.print("Problemas de saúde: ");
            System.out.println(funcionario.getProblemas());
            System.out.print("Telefone: ");
            System.out.println(funcionario.getTelefone());
            System.out.print("Email: ");
            System.out.println(funcionario.getEmail());
            System.out.print("Cargo: ");
            System.out.println(funcionario.getCargo());
            System.out.println("");
        }
    }
}

class Pessoa {
    //Atributos Pessoa
    int id;
    String nome;
    String alergia;
    String problemas;
    String telefone;
    String email;
    
    //Método construtor
    public Pessoa (int id, String nome, String alergia, String problemas, String telefone, String email) {
    this.id = id;
    this.nome = nome;
    this.alergia = alergia;
    this.problemas = problemas;
    this.telefone = telefone;
    this.email = email;
    }
    
    public Pessoa () {
    }
    
    //Getters
    public int getId(){
        return id;
        }
    public String getNome(){
    return nome;
    }
    public String getAlergia(){
    return alergia;
    }
    public String getProblemas(){
    return problemas;
    }
    public String getTelefone(){
    return telefone;
    }
    public String getEmail(){
    return email;
    }

    //Setters
    public void setId(int i){
        this.id = i;
    }
    public void setNome(String n){
        this.nome = n;
    }
    public void setAlergia(String a){
        this.alergia = a;
    }
    public void setProblemas(String p){
        this.problemas = p;
    }
    public void setTelefone(String t){
        this.telefone = t;
    }
    public void setEmail(String e){
        this.email = e;
    }
}

class Funcionario extends Pessoa{
    String cargo;
    //Método construtor
    Funcionario (int id, String nome, String alergia, String problemas, String telefone, String email, String cargo) {
        this.id = id;
        this.nome = nome;
        this.alergia = alergia;
        this.problemas = problemas;
        this.telefone = telefone; 
        this.email = email;
        this.cargo = cargo;
    }
    
    Funcionario () {
    }
    
    //Getter
    public String getCargo(){
    return cargo;
    }
    
    //Setter
    public void setCargo(String c){
    this.cargo = c;
    }
}

