public class App {
    public static void main(String[] args) throws Exception {
        JogadorStats[] jogadores = new JogadorStats[3];

        jogadores[0] = new JogadorStats("Emanuel", 19, "12660-53");
        jogadores[1] = new JogadorStats("Juninho", 23, "15326-78");
        jogadores[2] = new JogadorStats("Dida", 22, "96759-66");

        pessoas(jogadores);
    }

    public static void pessoas(JogadorStats[] jogadores) {
        for (int x = 0; x < jogadores.length; x++) {
            JogadorStats jogador = jogadores[x];
            System.out.println("Nome: " + jogador.getNome());
            System.out.println("Idade: " + jogador.getIdade());
            System.out.println("Endereço: " + jogador.getEndereco());
            System.out.println("Avaliações:");
            System.out.println("Tronco: " + jogador.getTronco(x));
            System.out.println("Perna Direita: " + jogador.getPernaDireita(x));
            System.out.println("Perna Esquerda: " + jogador.getPernaEsquerda(x));
            System.out.println("Cabeça: " + jogador.getCabeca(x));
            System.out.println("Comportamentos:");
            System.out.println("Velocidade (média em KM): "+ jogador.getVelocidade(x));
            System.out.println("Salto (média em METROS): "+ jogador.getSalto(x));
            System.out.println("Média de chutes com gol: " + jogador.getChute(x));
            System.out.println();
        }
    }
}
