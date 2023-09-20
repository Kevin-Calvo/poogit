package reproductores;

// esta clase hereda de la clase letra los metodos para solicitar la informacion, y se encarga de crear la musica a partir de esos metodos
// es abstracta para que no se pueda instanciar y no es una interface para definir los metodos aqui mismo
public abstract class musica  {

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
