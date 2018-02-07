package ipiranga;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class IpirangaImpostoSimplesBR implements IpirangaIf{
	private ArrayList<Contribuinte> listaContribuintes = new ArrayList<Contribuinte>();
	
	public void adicionarTaxista(String nome, String cpf, int quilometros, int passageiros) throws Exception{
		try{
			Taxista taxista =  new Taxista(nome, cpf, quilometros, passageiros);
			if(procuraContribuinte(cpf)){
				listaContribuintes.add(taxista);				
			}
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
	}

	public void adicionarCaminhoneiro(String nome, String cpf, int quilometros, int carga) throws Exception{
		try{
			Caminhoneiro caminhoneiro = new Caminhoneiro(nome, cpf, quilometros, carga);
			if(procuraContribuinte(cpf)){
				listaContribuintes.add(caminhoneiro);				
			}
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
	}

	public void adicionarProfessor(String nome, String cpf, double despesas, double salario) throws Exception{
		try{
			Professor professor = new Professor(nome, cpf, despesas, salario);
			if(procuraContribuinte(cpf)){
				listaContribuintes.add(professor);				
			}
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
	}
	
	public boolean removerContribuinte(String cpf) throws Exception{
		for (Contribuinte contribuinte : listaContribuintes) {
			if(contribuinte.getCpf().equals(cpf)){
				listaContribuintes.remove(contribuinte);
				return true;
			}
		}
		return false;
	}
	
	public double calcularImpostos(String cpf) throws Exception{
		for (Contribuinte contribuinte : listaContribuintes) {
			if(contribuinte.getCpf().equals(cpf)){
				return contribuinte.getImposto();
			}
		}
		return 0;
	}
	
	public void adicionarBem(String cpf, double valor) throws Exception{
		for (Contribuinte contribuinte : listaContribuintes) {
			if(contribuinte.getCpf().equals(cpf)){
				contribuinte.setBens(valor);
			}
		}
	}
	
	public double getBens(String cpf){
		for (Contribuinte contribuinte : listaContribuintes) {
			if(contribuinte.getCpf().equals(cpf)){
				return contribuinte.getbens();
			}
		}
		return 0;
	}
	
	public String getString(String cpf){
		for (Contribuinte contribuinte : listaContribuintes) {
			if(contribuinte.getCpf().equals(cpf)){
				return contribuinte.toString();
			}
		}
		return null;
	}
	
	public double getImposto(String cpf){
		for (Contribuinte contribuinte : listaContribuintes) {
			if(contribuinte.getCpf().equals(cpf)){
				return contribuinte.getImposto();
			}
		}
		return 0;
	}
	
	public boolean procuraContribuinte(String cpf){
		for (Contribuinte contribuinte : listaContribuintes) {
			if(contribuinte.getCpf().equals(cpf)){
				return true;
			}
		}
		return false;
	}
	
	public Set<String> getContribuintesAcimaLimiar(){
		Set<String> acimalimiar = new HashSet<String>();
		for (Contribuinte contribuinte: listaContribuintes) {
			if(contribuinte.getLimiar()){
				acimalimiar.add(contribuinte.getNome());
			}
		}
		return acimalimiar;
	}
}
