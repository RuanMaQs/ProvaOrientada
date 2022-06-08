
public class Compania {
	private String nome;
	private String assento;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getAssento() {
		return assento;
	}
	public void setAssento(String assento) {
		this.assento = assento;
	}
	@Override
    public String toString() {
        return "Compania" + 
                "\n Nome:" + nome+
                "\n Assento" + assento;
              
    }
}
