import java.util.*;

public class App {
    public static void main(String[] args) {

        Tecnico Tecnico1 = new Tecnico(2000);

        //* Numero, posição, qualidade, cartões, suspenso, treino
        Jogador Jogador1 = new Jogador(0, "Meio de campo", 1000, 0, false, false);
        Jogador Jogador2 = new Jogador(1, "Meio de campo", 1001, 0, false, false);
        Jogador Jogador3 = new Jogador(3, "Meio de campo", 1003, 0, false, false);
        Jogador Jogador4 = new Jogador(2, "Meio de campo", 1002, 0, false, false);
        Jogador Jogador5 = new Jogador(4, "Meio de campo", 1004, 0, false, false);
        Jogador Jogador6 = new Jogador(5, "Meio de campo", 1005, 0, false, false);
        Jogador Jogador7 = new Jogador(6, "Meio de campo", 1006, 0, false, false);
        Jogador Jogador8 = new Jogador(7, "Meio de campo", 1007, 0, false, false);
        Jogador Jogador9 = new Jogador(8, "Meio de campo", 1008, 0, false, false);
        Jogador Jogador10 = new Jogador(9, "Meio de campo", 1009, 0, false, false);
        Jogador Jogador11 = new Jogador(10, "Meio de campo", 1010, 0, false, false);
        Jogador Jogador12 = new Jogador(11, "Meio de campo", 1011, 0, false, false);
        Jogador Jogador13 = new Jogador(12, "Meio de campo", 1012, 0, false, false);
        Jogador Jogador14 = new Jogador(13, "Meio de campo", 1013, 0, false, false);
        Jogador Jogador15 = new Jogador(14, "Meio de campo", 1014, 0, false, false);
        Jogador Jogador16 = new Jogador(15, "Meio de campo", 1015, 0, false, false);
        Jogador Jogador17 = new Jogador(16, "Meio de campo", 1016, 0, false, false);
        Jogador Jogador18 = new Jogador(17, "Meio de campo", 1017, 0, false, false);
        Jogador Jogador19 = new Jogador(18, "Meio de campo", 1018, 0, false, false);
        Jogador Jogador20 = new Jogador(19, "Meio de campo", 1019, 0, false, false);
        Jogador Jogador21 = new Jogador(20, "Meio de campo", 1020, 0, false, false);
        Jogador Jogador22 = new Jogador(21, "Meio de campo", 1021, 0, false, false);
        Jogador Jogador23 = new Jogador(22, "Meio de campo", 1022, 0, false, false);

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
        plantel1.add(Jogador23);
        
        Time Time1 = new Time("Afogados", "AFC", Tecnico1, plantel1);

        System.out.println(Time1.toString());

    }
}