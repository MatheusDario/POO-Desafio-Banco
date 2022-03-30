import java.util.List;

public class Banco {
	
	private String nome;
	private List <Conta> contas;
	protected Banco bradesco;
	
	public Banco(Banco bradesco) {
		this.bradesco = bradesco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Conta> getContas() {
		return contas;
	}

	public void setContas(List<Conta> contas) {
		this.contas = contas;
	}
	
	public void clientes() {
	}

}
