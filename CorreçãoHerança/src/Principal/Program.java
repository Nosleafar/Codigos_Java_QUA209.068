package Principal;

		import java.util.Scanner;
		import entities.Chefia;
		import entities.FuncionarioeChefia;

		public class Program {

			public static void main(String[] args) {
			
				FuncionarioeChefia funcionario = new FuncionarioeChefia();
				FuncionarioeChefia gerente = new Chefia();
				
				
				funcionario.setNome("Rafaelson");
				funcionario.setIdade(23);
				funcionario.setSalarioBruto(1300.00);
				
				funcionario.obterDadosFuncionario();
				
				gerente.setNome("Rafaelson");
				gerente.setIdade(23);
				gerente.setSalarioBruto(1300.00);
				
				gerente.obterDadosFuncionario();
			}


		}