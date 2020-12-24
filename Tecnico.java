public class Tecnico extends Pessoa {
    private double salario;

    public Tecnico() {}

	public Tecnico(int id, String nome, String dataNascimento, double salario) {
		super(id, nome, dataNascimento);
		this.salario = salario;
	}

	@Override
	public String getNome() {
		return "Tecnico - " + nome;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String toString() {
		return "\nId: " + this.id + "\nNome: " + this.getNome() + "\nData de nascimento: " + this.dataNascimento + "\nSalario do Técnico: " + this.salario;
	}

}
