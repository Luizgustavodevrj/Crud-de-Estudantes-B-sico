import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        StudentService dao = new StudentService();

        while(true){
            System.out.println("\n1 - Cadastrar");
            System.out.println("2 - Listar");
            System.out.println("3 - Atualizar");
            System.out.println("4 - Deletar");
            System.out.println("0 - Sair");

            System.out.println("O que deseja fazer? ");
            int option = input.nextInt();
            input.nextLine();

            switch (option){
                case 1:
                    System.out.println("Escreva seu nome: ");
                    String nome = input.nextLine();
                    System.out.println("Qual sua idade? ");
                    int idade = input.nextInt();
                    input.nextLine();
                    System.out.print("Qual seu curso? ");
                    String curso = input.nextLine();

                    dao.createStudent(new Student(0, nome, idade, curso));
                    break;
                case 2:
                    for (Student a : dao.readStudent()) {
                        System.out.println(a.getId() + " - " + a.getName());
                    }
                    break;

                case 3:
                    System.out.print("Digite o id: ");
                    int idAtualizar = input.nextInt();
                    input.nextLine();
                    System.out.print("Novo nome: ");
                    String novoNome = input.nextLine();

                    dao.updateStudent(idAtualizar, novoNome);
                    break;

                case 4:
                    System.out.println("Id de quem deseja deletar: ");
                    int idDeletar = input.nextInt();

                    dao.deleteStudent(idDeletar);
                    break;

                case 0:
                    System.out.println("Saindo...");
                    return;
            }

        }


    }
}
