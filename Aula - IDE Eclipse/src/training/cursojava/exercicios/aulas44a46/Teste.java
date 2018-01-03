package training.cursojava.exercicios.aulas44a46;

public class Teste {

	public static void main(String[] args) {
		Quadrado quadrado = new Quadrado();
		quadrado.setLado(2);
		quadrado.setNome("Quadrado");
		
		Circulo circulo = new Circulo();
		circulo.setRaio(2);
		circulo.setNome("circulo");
		
		Triangulo triangulo = new Triangulo();
		triangulo.setAltura(2);
		triangulo.setBase(3);
		triangulo.setNome("Triangulo");
		
		Cubo cubo = new Cubo();
		cubo.setLado(3);
		cubo.setNome("Cubo");
		
		Cilindro cilindro = new Cilindro();
		cilindro.setAltura(3);
		cilindro.setRaio(2);
		cilindro.setNome("Cilindro");
		
		Piramide piramide = new Piramide();
		piramide.setAltura(3);
		piramide.setApotema(4);
		piramide.setArestaBase(2);
		piramide.setNumeroPolignoBase(4);
		piramide.setBase(quadrado);
		piramide.setNome("Piramide");
		
		
		FiguraGeometrica[] figuraGeometricas = new FiguraGeometrica[6];
		figuraGeometricas[0] = quadrado;
		figuraGeometricas[1] = circulo;
		figuraGeometricas[2] = triangulo;
		figuraGeometricas[3] = cubo;
		figuraGeometricas[4] = cilindro;
		figuraGeometricas[5] = piramide;
		
		for (FiguraGeometrica figuraGeometrica : figuraGeometricas) {
			System.out.println("--------------------------");
			System.out.println(figuraGeometrica.getNome());
			if (figuraGeometrica instanceof Figura2D ) {
				Figura2D figura2d = (Figura2D) figuraGeometrica;
				System.out.println("Area:" +figura2d.calcularArea());
			}
			else if (figuraGeometrica instanceof Figura3D ) {
				Figura3D figura3d = (Figura3D) figuraGeometrica;
				System.out.println("Area:" +figura3d.calcularArea());
				System.out.println("Volume:" +figura3d.calcularVolume());
			}
			System.out.println("");
		}
	}

}
