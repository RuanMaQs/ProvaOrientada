
public class Passagem {
	private String data;

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}
	@Override
	public String toString() {
        return "Compania" + 
                "\n Nome:" + data;
                
	}
	
}
