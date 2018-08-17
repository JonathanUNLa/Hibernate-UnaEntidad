package test;
import datos.Cliente;
import negocio.ClienteABM;

public class TestActualizarCliente {
	public static void main(String[] args){
		ClienteABM abm = new ClienteABM();
		long id=5;
		try {
			Cliente c=abm.traerCliente(id);
			System.out.println( "Cliente a Modificar -->" +c);
			c.setDni(11222333);
			abm.modificar(c);
			int dni=11222333;
			Cliente cModif=abm.traerCliente(dni);
			System.out.println("Cliente Modificado -->"+cModif);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}