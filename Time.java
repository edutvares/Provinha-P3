import java.util.*;

public class Time{
    private String nome;
    private String apelido;
    private Tecnico tecnico;
    private List<Jogador> plantel;
    private List<Jogador> relacionados;

	public Time() {
    }

	public Time(String nome, String apelido, Tecnico tecnico, List<Jogador> plantel) {
		this.nome = nome;
		this.apelido = apelido;
		this.tecnico = tecnico;
		this.plantel = plantel;
		this.relacionados = this.relacionarJogadores();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getApelido() {
		return apelido;
	}

	public void setApelido(String apelido) {
		this.apelido = apelido;
	}

	public Tecnico getTecnico() {
		return tecnico;
	}

	public void setTecnico(Tecnico tecnico) {
		this.tecnico = tecnico;
	}

	public List<Jogador> getPlantel() {
		return plantel;
	}

	public void setPlantel(List<Jogador> plantel) {
		this.plantel = plantel;
	}

	public List<Jogador> getRelacionados() {
		return relacionados;
	}

	public void setRelacionados(List<Jogador> relacionados) {
		this.relacionados = relacionados;
	}
    
    public List<Jogador> relacionarJogadores () {
		List<Jogador> copy = new ArrayList<>(this.plantel);
		//copy.addAll(this.plantel);
		Collections.sort(copy);

		return copy.subList(0,11);
	}

	@Override
	public String toString() {
		return "----------------------------Time---------------------------- \nApelido: " + apelido + "\nNome: " + nome + "\nPlantel: \n\n" + plantel + "\nRelacionados: \n\n" + relacionados
				+ "\nTecnico: " + tecnico + "\n\n\n\n";
    }
    
}
