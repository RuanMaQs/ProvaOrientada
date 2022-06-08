
public class Cidade {
	private String nome;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	@Override
    public String toString() {
        return "Cidade" + 
                "\n Nome:" + nome;
              
    }
}
