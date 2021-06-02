import java.util.ArrayList;
import java.util.List;

public class App {
	public static void main(String[] args) throws Exception {
		final List<Vendedor> vendedores = new ArrayList<Vendedor>();
		final List<Gerente> gerentes = new ArrayList<Gerente>();

		gerarDados(vendedores, gerentes);

		for (Gerente ger : gerentes) {
			System.out.println("******************************************");
			for (Vendedor ven : vendedores) {
				if (ven.getMatriculaGerente() == ger.getMatricula()) {
					System.out.println(String.format("Salário de %s: R$ %s.",
							ven.getNome(), ven.getSalario()));
				}
			}
			System.out.println(String.format("Salário de %s: R$ %s.",
					ger.getNome(), ger.getSalario(vendedores)));
		}

	}

	private static void gerarDados(List<Vendedor> vendedores,
			List<Gerente> gerentes) {

		gerentes.add(new Gerente("Gerente1", "M", 53, "000000", "2021-01-01",
				"PE", 0.05));
		gerentes.add(new Gerente("Gerente2", "F", 53, "111111", "2021-01-01",
				"CE", 0.05));

		vendedores.add(new Vendedor("Vendedor1", "M", 30, "222222",
				"2021-01-01", 150000, 0.01, "000000"));
		vendedores.add(new Vendedor("Vendedor2", "F", 30, "333333",
				"2021-01-01", 170000, 0.01, "000000"));
		vendedores.add(new Vendedor("Vendedor3", "M", 30, "444444",
				"2021-01-01", 200000, 0.01, "111111"));
		vendedores.add(new Vendedor("Vendedor4", "F", 30, "555555",
				"2021-01-01", 50000, 0.01, "111111"));
	}
}
