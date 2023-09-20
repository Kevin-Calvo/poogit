package reproductores;

// esta clase pide la informacion de la musica que va a generar, la base de la letra, la cantidad de canciones, y los posibles ritmos y mixes
//es abstracta para que no se pueda instanciar y no es una interface para definir los metodos aqui mismo
public abstract class letra {

	String pedirBase()
	{
		return("aaa"); 
	}
	
	String pedirRitmo()
	{
		return("aaa"); 
	}
	
	String pedirMix()
	{
		return("aaa bbb");
	}
	
	String pedirNCanciones()
	{
		return("###"); 
	}
	
}
