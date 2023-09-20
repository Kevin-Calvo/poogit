package reproductores;

// esta clase pide la informacion de la musica que va a generar, la base de la letra, la cantidad de canciones, y los posibles ritmos y mixes
//es abstracta para que no se pueda instanciar y no es una interface para definir los metodos aqui mismo
public abstract class letra extends musica {

	void generarLetra(String Base, String ritmo)
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
		String ritmo = ritmo1 + ritmo2; 
	}
	
}
