
public class Pessoa { // CLASSE ABSTRATA DA PESSOA

	private String nome;
	private Contato contato;
	
	public Pessoa(String nome) {
		this.nome = nome;
		contato = new Contato();
	}
	
	public Contato getContato() {
		return contato;
	}
	
	public void setContato( String zap, String email, String tt) { // ADICIONA O CONTATO A PESSOA
		contato.setEmail(email);
		contato.setTt(tt);
		contato.setZap(zap);
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	public String toString() {
		return "Pessoa \n nome: " + nome + "\n" + contato;
	}
	
	

	
	
}
