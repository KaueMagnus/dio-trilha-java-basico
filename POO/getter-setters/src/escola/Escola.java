package escola;

public class Escola {
    public static void main(String[] args) {
        Aluno felipe = new Aluno();
        felipe.setNome("Felipe");
        felipe.setIdade(14);

        System.out.println("O aluno " + felipe.getNome() + " tem " + felipe.getIdade() + " anos");
        // O aluno Felipe tem 15 anos.
    }
}
