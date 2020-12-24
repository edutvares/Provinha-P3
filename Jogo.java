import java.util.*;

public class Jogo {
    private Time mandante;
    private Time visitante;
    private String dataDoJogo;
    private String estadio;
    private String cidade;
    private int placarMandante;
    private int placarVisitante;

    public Jogo() {
    }

    public Jogo(Time mandante, Time visitante, String dataDoJogo, String estadio, String cidade, int placarMandante,
            int placarVisitante) {
        this.mandante = mandante;
        this.visitante = visitante;
        this.dataDoJogo = dataDoJogo;
        this.estadio = estadio;
        this.cidade = cidade;
        this.placarMandante = placarMandante;
        this.placarVisitante = placarVisitante;
    }

    public void gerarResultado() {

        int valorTime1 = 0;
        int valorTime2 = 0;

        /*
         * mandante.getRelacionados().forEach(jogador->valorTime1 +=
         * jogador.getQualidade());
         * 
         * mandante.getRelacionados().stream().map(jogador ->
         * jogador.getQualidade()).reduce(0, (a, b) -> a + b);
         * 
         * mandante.getRelacionados().forEach(jogador -> { valorTime2 +=
         * jogador.getQualidade(); });
         */

        for (Jogador jogador : mandante.getRelacionados()) {
            valorTime1 += jogador.getQualidade();
        }

        for (Jogador jogador : visitante.getRelacionados()) {
            valorTime2 += jogador.getQualidade();
        }

        Random gerador = new Random();
        int valorAleatorio = gerador.nextInt(101);

        if (valorTime1 * valorAleatorio > valorTime2 * valorAleatorio) {
            // time 1 vence
        } else {
            // time 2 vence
        }

    }

    public void mostrarQualidade(List<Jogador> relacionados) {
        int valorTime = 0;
        for (Jogador jogador : relacionados) {
            valorTime += jogador.getQualidade();
        }
        System.out.println(valorTime);
    }

    public void mostrarCartoes(List<Jogador> jogadores) {
        for (Jogador jogador : jogadores) {
            if (jogador.getCartoes() != 0)
                System.out.println(jogador.getId() + "-" + jogador.getCartoes());
        }
    }

    public void mostrarTreino(List<Jogador> jogadores) {
        for (Jogador jogador : jogadores) {
            if (jogador.isTreino())
                System.out.println(jogador.getId() + "- Ta treinadinho");
        }
    }

    public void gerarLesoes() {

        Random gerador = new Random();
        int quantidadeDeLesoes = gerador.nextInt(2);

        for (; quantidadeDeLesoes > 0; quantidadeDeLesoes--) {
            int jogador = gerador.nextInt(21);
            if (jogador > 10) {
                // * lesao no time 2
                mandante.getRelacionados().get(jogador - 11).sofrerLesao();

            } else {
                // * lesao time 1
                visitante.getRelacionados().get(jogador).sofrerLesao();
            }
        }

    }

    public void gerarCartoes() {

        Random gerador = new Random();
        int quantidadeDeCartoes = gerador.nextInt(10);
        //int quantidadeDeCartoes = 10;

        for (; quantidadeDeCartoes > 0; quantidadeDeCartoes--) {
            int jogador = gerador.nextInt(21);
            if (jogador > 10) {
                // * Cartão no time 2
                mandante.getRelacionados().get(jogador - 11).aplicarCartao(1);

            } else {
                // * Cartão time 1
                visitante.getRelacionados().get(jogador).aplicarCartao(1);
            }
        }

    }

    public void permitirTreinamento() {
        for(Jogador jogador : mandante.getRelacionados()) {
            jogador.setTreino(false);
        }
        for(Jogador jogador : visitante.getRelacionados()) {
            jogador.setTreino(false);
        }
    }

    public Time getMandante() {
        return mandante;
    }

    public void setMandante(Time mandante) {
        this.mandante = mandante;
    }

    public Time getVisitante() {
        return visitante;
    }

    public void setVisitante(Time visitante) {
        this.visitante = visitante;
    }

    public String getDataDoJogo() {
        return dataDoJogo;
    }

    public void setDataDoJogo(String dataDoJogo) {
        this.dataDoJogo = dataDoJogo;
    }

    public String getEstadio() {
        return estadio;
    }

    public void setEstadio(String estadio) {
        this.estadio = estadio;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public int getPlacarMandante() {
        return placarMandante;
    }

    public void setPlacarMandante(int placarMandante) {
        this.placarMandante = placarMandante;
    }

    public int getPlacarVisitante() {
        return placarVisitante;
    }

    public void setPlacarVisitante(int placarVisitante) {
        this.placarVisitante = placarVisitante;
    }

    @Override
    public String toString() {
        return "Jogo [cidade=" + cidade + ", dataDoJogo=" + dataDoJogo + ", estadio=" + estadio + ", mandante="
                + mandante + ", placarMandante=" + placarMandante + ", placarVisitante=" + placarVisitante
                + ", visitante=" + visitante + "]";
    }

}
