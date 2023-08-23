package entities;

public class Chefia  extends FuncionarioeChefia{

	
	@Override
	public double getBonus() {
		return (salarioBruto *0.05);
	}
}