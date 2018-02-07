
public class UsuarioVeterano extends Usuario{
	
	public UsuarioVeterano(String nome, String login){
		super(nome, login, 1000);
		desconto = 0.2;
	}
	
	@Override
	public String toString() {
		return getNome() + " - Usuario Veterano\n";
	}

}
