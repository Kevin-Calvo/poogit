package reproductores;

// esta clase hereda de la clase letra los metodos para solicitar la informacion, y se encarga de crear la musica a partir de esos metodos
// es abstracta para que no se pueda instanciar y no es una interface para definir los metodos aqui mismo
public abstract class musica extends letra {

	void generarLetra(String Base)
	{
		System.out.print(Base);
	} 
	
	void generarCancion(String ritmo)
	{
		System.out.print(ritmo);
	}
	
	void mixgeneros(String ritmo1, String ritmo2)
	{
		System.out.print(ritmo1 + ritmo2); 
	}
	
}
