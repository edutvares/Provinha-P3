import java.util.Random;

public class Jogador extends Pessoa implements Comparable<Jogador>{
    private int numero;
    private String posicao;
    private int qualidade;
    private int cartoes;
	private boolean suspenso;
	private boolean treino;

	//* Construtores

	public Jogador () {

	}

	public Jogador(int id, String nome, String dataNascimento, int numero, String posicao, int qualidade, int cartoes, boolean suspenso, boolean treino) {
		super(id, nome, dataNascimento);
		this.numero = numero;
		this.posicao = posicao;
		this.qualidade = qualidade;
		this.cartoes = cartoes;
		this.suspenso = suspenso;
		this.treino = treino;
	}

	//* get set

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getPosicao() {
		return posicao;
	}

	public void setPosicao(String posicao) {
		this.posicao = posicao;
	}

	public int getQualidade() {
		return qualidade;
	}

	public void setQualidade(int qualidade) {
		this.qualidade = qualidade;
	}

	public int getCartoes() {
		return cartoes;
	}

	public void setCartoes(int cartoes) {
		this.cartoes = cartoes;
	}

	public boolean isSuspenso() {
		return suspenso;
	}

	public void setSuspenso(boolean suspenso) {
        this.suspenso = suspenso;
	}
	
	public boolean isTreino() {
		return treino;
	}

	public void setTreino(boolean treino) {
		this.treino = treino;
	}

	//* -------------------------------------------------------
	
	@Override
	public String getNome() {
		return "Jogador - " + nome;
	}

    public boolean verificarCondicaoDejogo() {
        if( this.cartoes == 3 || this.suspenso) {
            return false;
        }
        return true;
    }


    public void aplicarCartao(int qtdCartoes) {
        this.cartoes = this.cartoes + qtdCartoes;
        if(this.cartoes >= 3) {
			this.suspenso = true;
		}
    }


    public void cumprirSuspencao() {
		this.cartoes = 0;
		this.suspenso = false;
	}


    public void sofrerLesao() {
		// 5, 10, 15, 30, 40
		//instância um objeto da classe Random usando o construtor básico
		Random gerador = new Random();
		int valorAleatorio = gerador.nextInt(101);

		if(valorAleatorio <= 5) {
			// - 15%
			Double porcentagem = this.qualidade - (this.qualidade * 0.15);
			this.qualidade = porcentagem.intValue();
		}else if(valorAleatorio > 5 && valorAleatorio <= 15) {
			// - 10%
			Double porcentagem = this.qualidade - (this.qualidade * 0.10);
			this.qualidade = porcentagem.intValue();
		}else if(valorAleatorio > 15 && valorAleatorio <= 30) {
			// - 5%
			Double porcentagem = this.qualidade - (this.qualidade * 0.5);
			this.qualidade = porcentagem.intValue();
		}else if(valorAleatorio > 30 && valorAleatorio <= 60) {
			// - 2 pontos
			this.qualidade -= 2;
		}else if(valorAleatorio > 60 && valorAleatorio <= 100) {
			// - 1 ponto
			this.qualidade -= 1;
		}
	}


    public void executarTreinamento() {
		if(!treino) {
			Random gerador = new Random();
			int valorAleatorio = gerador.nextInt(101);

			if(valorAleatorio <= 5) {
				// + 5 pontos
				this.qualidade += 5;
			}else if(valorAleatorio > 5 && valorAleatorio <= 15) {
				// + 4 pontos
				this.qualidade += 4;
			}else if(valorAleatorio > 15 && valorAleatorio <= 30) {
				// + 3 pontos
				this.qualidade += 3;
			}else if(valorAleatorio > 30 && valorAleatorio <= 60) {
				// + 2 pontos
				this.qualidade += 2;
			}else if(valorAleatorio > 60 && valorAleatorio <= 100) {
				// + 1 ponto
				this.qualidade += 1;
			}
		}
		this.treino = true;
	}


	@Override
	public int compareTo(Jogador oJogador) {
		return (oJogador.getQualidade() - this.qualidade);
	}

	public String toString() {
		return "--- Jogador --- \n\n" + "Id: " + this.id + "\nNome: " + this.getNome() + "\nData de nascimento: " + this.dataNascimento + "\nCartoes: " + this.cartoes + " \nNumero: " + this.numero + "\nPosicao: " + this.posicao + "\nQualidade: " + this.qualidade + "\nSuspenso: " + this.suspenso + "\n\n";
	}
}
