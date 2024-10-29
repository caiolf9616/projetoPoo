public class Pessoaatributo {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();

        p1.setCpf("005544555");
        p1.setIdade(27);
        p1.setNome("João");
        



        System.out.println("Nome: " + p1.getNome());
        System.out.println("CPF: " + p1.getCpf());
        System.out.println("Idade: " + p1.getIdade());
    }
    
    
}
