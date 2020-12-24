import java.util.*;

public class App {
    public static void main(String[] args) {

        List <Jogador> mandante = new ArrayList<>();
        List <Jogador> visitante = new ArrayList<>();

        //* Id, Nome, Data de nascimento, salario
        Tecnico TecnicoMandante = new Tecnico(0, "Carlos", "23/12/1578", 2000);

        for (int i = 0; i < 23; i++) {
            Jogador jogador = new Jogador();
            //* Id, Nome, Data de nascimento, Numero, posição, qualidade, cartões, suspenso, treino
            jogador.setId(i + 1);
            jogador.setNome("nome" + i);
            jogador.setDataNascimento("23/12/1965");
            jogador.setNumero(i);
            jogador.setPosicao("Meio campo " + i);
            jogador.setQualidade(1000+i);
            jogador.setCartoes(0);
            jogador.setSuspenso(false);
            jogador.setTreino(true);

            mandante.add(jogador);
        }

        //* Id, Nome, Data de nascimento, salario
        Tecnico TecnicoVisitante = new Tecnico(0, "Pedro", "23/12/1578", 2000);

        for (int i = 0; i < 23; i++) {
            Jogador jogador = new Jogador();
            //* Id, Nome, Data de nascimento, Numero, posição, qualidade, cartões, suspenso, treino
            jogador.setId(i + 1);
            jogador.setNome("nome" + i);
            jogador.setDataNascimento("23/12/1965");
            jogador.setNumero(i);
            jogador.setPosicao("Meio campo " + i);
            jogador.setQualidade(1000+i);
            jogador.setCartoes(0);
            jogador.setSuspenso(false);
            jogador.setTreino(false);

            visitante.add(jogador);
        }

        Time TimeMandante = new Time("Afogados", "AFC", TecnicoMandante, mandante);
        Time TimeVisitante = new Time("Salva vidas", "ASV", TecnicoVisitante, visitante);

        System.out.println(TimeMandante.toString());
        System.out.println("-----------------------------------------------------------------------------------------");
        System.out.println(TimeVisitante.toString());

        //* Time mandante, Time visitante, String dataDoJogo, String estadio, String cidade, int placarMandante, int placarVisitante
        Jogo jogo = new Jogo(TimeMandante, TimeVisitante, "23/12/2020", "Nárnia", "Blumenau-SC", 0, 0);

        jogo.mostrarQualidade(TimeMandante.getRelacionados());
        jogo.mostrarQualidade(TimeVisitante.getRelacionados());
        jogo.gerarLesoes();
        jogo.mostrarQualidade(TimeMandante.getRelacionados());
        jogo.mostrarQualidade(TimeVisitante.getRelacionados());

        jogo.mostrarCartoes(TimeMandante.getRelacionados());
        System.out.println("Cartões do time mandante");
        jogo.mostrarCartoes(TimeVisitante.getRelacionados());
        System.out.println("Cartões do time visitante");
        jogo.gerarCartoes();
        System.out.println("Cartões gerados");
        jogo.mostrarCartoes(TimeMandante.getRelacionados());
        System.out.println("Cartões do time mandante");
        jogo.mostrarCartoes(TimeVisitante.getRelacionados());
        System.out.println("Cartões do time visitante");
        System.out.println("----------------------------------");
        System.out.println("Treino do primeiro time");
        jogo.mostrarTreino(TimeVisitante.getRelacionados());
        System.out.println("Treino do segundo time");
        jogo.mostrarTreino(TimeMandante.getRelacionados());
        jogo.permitirTreinamento();
        System.out.println("Jogo acabou aqui");
        jogo.mostrarTreino(TimeVisitante.getRelacionados());
        System.out.println("Treino do segundo time");
        jogo.mostrarTreino(TimeMandante.getRelacionados());

        System.out.println("Fim do jogo");

        jogo.gerarResultado();


        /* //* Id, Nome, Data de nascimento, Numero, posição, qualidade, cartões, suspenso, treino
        Jogador Jogador1 = new Jogador(1, "Dadir", "23/12/1578", 0, "Goleiro", 1000, 0, false, false);
        Jogador Jogador2 = new Jogador(2, "Norlon", "23/12/1578", 1, "Meio de campo", 1001, 0, false, false);
        Jogador Jogador3 = new Jogador(3, "Nikiu", "23/12/1578", 3, "Meio de campo", 1003, 0, false, false);
        Jogador Jogador4 = new Jogador(4, "Glanhi", "23/12/1578", 2, "Meio de campo", 1002, 0, false, false);
        Jogador Jogador5 = new Jogador(5, "Nurgugan", "23/12/1578", 4, "Meio de campo", 1004, 0, false, false);
        Jogador Jogador6 = new Jogador(6, "Duarn", "23/12/1578", 5, "Meio de campo", 1005, 0, false, false);
        Jogador Jogador7 = new Jogador(7, "Pustili", "23/12/1578", 6, "Meio de campo", 1006, 0, false, false);
        Jogador Jogador8 = new Jogador(8, "Fathalion", "23/12/1578", 7, "Meio de campo", 1007, 0, false, false);
        Jogador Jogador9 = new Jogador(9, "Fathalion", "23/12/1578", 8, "Meio de campo", 1008, 0, false, false);
        Jogador Jogador10 = new Jogador(10, "Reuin", "23/12/1578",9, "Meio de campo", 1009, 0, false, false);
        Jogador Jogador11 = new Jogador(11, "Luetexe", "23/12/1578",10, "Meio de campo", 1010, 0, false, false);
        Jogador Jogador12 = new Jogador(12, "Koziel", "23/12/1578",11, "Meio de campo", 1011, 0, false, false);
        Jogador Jogador13 = new Jogador(13, "Koziel", "23/12/1578",12, "Meio de campo", 1012, 0, false, false);
        Jogador Jogador14 = new Jogador(14, "Guburor", "23/12/1578",13, "Meio de campo", 1013, 0, false, false);
        Jogador Jogador15 = new Jogador(15, "Dwlon", "23/12/1578",14, "Meio de campo", 1014, 0, false, false);
        Jogador Jogador16 = new Jogador(16, "Xulas", "23/12/1578",15, "Meio de campo", 1015, 0, false, false);
        Jogador Jogador17 = new Jogador(17, "Werut", "23/12/1578",16, "Meio de campo", 1016, 0, false, false);
        Jogador Jogador18 = new Jogador(18, "Suykon", "23/12/1578",17, "Meio de campo", 1017, 0, false, false);
        Jogador Jogador19 = new Jogador(19, "Bauclovo", "23/12/1578",18, "Meio de campo", 1018, 0, false, false);
        Jogador Jogador20 = new Jogador(20, "Osisl", "23/12/1578",19, "Meio de campo", 1019, 0, false, false);
        Jogador Jogador21 = new Jogador(21, "Adanxa", "23/12/1578",20, "Meio de campo", 1020, 0, false, false);
        Jogador Jogador22 = new Jogador(22, "Dolusoak", "23/12/1578",21, "Meio de campo", 1021, 0, false, false);
        Jogador Jogador23 = new Jogador(23, "Kiukub", "23/12/1578",22, "Meio de campo", 1022, 0, false, false); 

        List<Jogador> plantel1 = new ArrayList<>();
        
        plantel1.add(Jogador1);
        plantel1.add(Jogador2);
        plantel1.add(Jogador3);
        plantel1.add(Jogador4);
        plantel1.add(Jogador5);
        plantel1.add(Jogador6);
        plantel1.add(Jogador7);
        plantel1.add(Jogador8);
        plantel1.add(Jogador9);
        plantel1.add(Jogador10);
        plantel1.add(Jogador11);
        plantel1.add(Jogador12);
        plantel1.add(Jogador13);
        plantel1.add(Jogador14);
        plantel1.add(Jogador15);
        plantel1.add(Jogador16);
        plantel1.add(Jogador17);
        plantel1.add(Jogador18);
        plantel1.add(Jogador19);
        plantel1.add(Jogador20);
        plantel1.add(Jogador21);
        plantel1.add(Jogador22);
        plantel1.add(Jogador23); */
        
        

    }
}