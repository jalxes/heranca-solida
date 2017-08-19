
public class Main {

	public static void main(String[] args) {
		Cilindro cilindro = new Cilindro();
		cilindro.setRaio(12);
		cilindro.setAltura(12);
		System.out.println("Cilindro: " + cilindro.getVolume());

		Cubo cubo = new Cubo();
		cubo.setAltura(12);
		System.out.println("Cubo: " + cubo.getVolume());

		Piramide piramide = new Piramide();
		piramide.setBaseLargura(2);
		piramide.setBaseProfundidade(12);
		piramide.setAltura(12);
		System.out.println("Piramide: " + piramide.getVolume());

		Prisma prisma = new Prisma();
		prisma.setBaseLargura(2);
		prisma.setBaseProfundidade(12);
		prisma.setAltura(12);
		System.out.println("Prisma: " + prisma.getVolume());

	}

}
