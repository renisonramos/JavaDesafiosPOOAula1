public class Main {


    public static void main(String[] args) {

        // Desafio 1 //
        // Cria um objeto da classe Pessoa.
        Pessoa pessoa = new Pessoa();

        //Chama o metodo exibir Mensagem.
        pessoa.displaysMessage();


        // Desafio 2 //
        // Cria um objeto da classe Calculadora.
        Calculadora calculadora = new Calculadora();

        // Define o numero que queremos calcular
        int numero = 9;

        // Chama o metodo calcularDobro e armazena o resultado
        int resultado = calculadora.calcularDobro(numero);

        // Exibe o resultado no console
        System.out.println("O dobro de " + numero + " é " + resultado);


        // Desafio 3 //

        // Cria um objeto da classe Música.
        Musica musica = new Musica();

        // Define os valores para cada atributo do objeto
        musica.titulo = "Olho de Tigre";
        musica.artista = "Djonga";
        musica.anoLancamento = 2017;

        // Invoca o metodo exibeFichaTecnica
        musica.exibieFichaTecnica();

        // Invoca o metodo avaliarMusica e passa uma nota como parametro.
        musica.avaliarMusica(8);
        musica.avaliarMusica(10);

        // Invoca o metodo pegaMedia e trabalha na médias das avaliações.
        musica.pegaMedia();
        double mediaAvaliacoes = musica.pegaMedia();
        System.out.println("Média das avaliações: " + mediaAvaliacoes);


        // Desafio 4 //
        Carro carro = new Carro();
        carro.modelo = "BMW X6";
        carro.ano = 2017;
        carro.cor = "Preto";
        carro.exibeFichaTecnica();

        // Calcular idade do carro
        System.out.println("Idade do carro: " + carro.calculaIdade() + " anos");


        // Desafio 5 //
        Aluno aluno = new Aluno();
        aluno.nome = "Renison Borralho Ramos";
        aluno.idade = 26;

        aluno.exibeDadosAluno();
    }
}
