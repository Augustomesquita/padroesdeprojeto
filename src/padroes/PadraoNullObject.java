package padroes;

public class PadraoNullObject implements PadraoInterface {

    @Override
    public void execute() {
        // Ao invés de fazermos uma atribuição assim:
        Pessoa pessoa = null;
        metodoParaApresentarNomeDePessoaNulaSemPadrao(pessoa);

        // Fazemos isso:
        Pessoa pessoaNula = new PessoaNula();
        metodoParaApresentarNomeDePessoaNulaComPadrao(pessoaNula);
    }

    private void metodoParaApresentarNomeDePessoaNulaSemPadrao(Pessoa pessoa) {
        System.out.println(pessoa != null ? pessoa.nome : "Nome ainda não atribuído");
    }

    private void metodoParaApresentarNomeDePessoaNulaComPadrao(Pessoa pessoaNula) {
        System.out.println(pessoaNula.nome);
    }


    private static class Pessoa {
        public String nome;
    }

    private static class PessoaNula extends Pessoa {
        public PessoaNula() {
            nome = "Nome ainda não atribuído";
        }
    }

}
