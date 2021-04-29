
public class Contato { // CLASSE ABSTRATA DAS INFORMAÇÕES DE CONTATO REFERENTE A PESSOA
	
	String zap; // NUMERO DE TELEFONE
	String email;
	String tt; // TWITTER\
	
	public String getZap() {
		return zap;
	}
	public void setZap(String zap) {
		this.zap = zap;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTt() {
		return tt;
	}
	public void setTt(String tt) {
		this.tt = tt;
	}
	@Override
	public String toString() { // PRINTA AS INFOS
		return "Contato \n zap: " + zap + "\n email: " + email + "\n tt: " + tt ;
	}

	
	
	
	

}
