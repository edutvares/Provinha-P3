public class Tecnico {
    private double salario;

    public Tecnico() {}

	public Tecnico(double salario) {
		this.salario = salario;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String toString() {
		return "Salario do Técnico: " + this.salario;
	}
}
