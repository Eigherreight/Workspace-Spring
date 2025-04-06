package characters;

public class Character {
	private String nome;
	private String classe1;
	private String classe2;
	private String stirpe;
	int livello1;
	int livello2;

	public Character(String nome, String classe1, String stirpe, int livello1)
	{
		this.nome = nome;
		this.classe1 = classe1;
		this.stirpe = stirpe;
		this.livello1 = livello1;
	}
	
	public Character(String nome, String classe1, String classe2, String stirpe, int livello1, int livello2)
	{
		this.nome = nome;
		this.classe1 = classe1;
		this.classe2 = classe2;
		this.stirpe = stirpe;
		this.livello1 = livello1;
		this.livello2 = livello2;
	}

	public String getClasse1() {
		return classe1;
	}
	public String getClasse2() {
		return classe2;
	}
	public int getLivello1() {
		return livello1;
	}
	public int getLivello2() {
		return livello2;
	}
	public String getNome() {
		return nome;
	}
	public String getStirpe() {
		return stirpe;
	}
	public void setClasse1(String classe1) {
		this.classe1 = classe1;
	}
	public void setClasse2(String classe2) {
		this.classe2 = classe2;
	}
	public void setLivello1(int livello1) {
		this.livello1 = livello1;
	}
	public void setLivello2(int livello2) {
		this.livello2 = livello2;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setStirpe(String stirpe) {
		this.stirpe = stirpe;
	}
}
