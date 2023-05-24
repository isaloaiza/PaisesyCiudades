import java.util.ArrayList;
import java.util.HashMap;

import javax.swing.JOptionPane;

public class PaisesPorCiudad {
	String pais;
	String ciudad;
	HashMap <String, ArrayList<String>> mapCuidades;
	ArrayList<String>ciudades;
	
	public PaisesPorCiudad() {
		mapCuidades= new HashMap <String, ArrayList<String>>();
		
	}
	
void iniciar() {
		
		String menu = "Menu\n";
		menu +="1.  Registrar Pais\n";
		menu +="2. Registrar Ciudades\n";
		menu +="3. Consultar Pais\n";
		menu +="4. Ciudades\n";
		menu +="salir\n";
		menu += "SELECIONE UNA OPCION";
		int opt = 0;
		do {
			opt = Integer.parseInt(JOptionPane.showInputDialog(menu));
			menu(opt);
		} while (opt != 4);

	}

	private void menu(int opt) {
		switch (opt) {
		case 1:
				pedirPais();
			break;
		case 2:
			pedirCiudad();
			break;
		case 3:
			consultarPais();
			break;
		case 4:
			consultarCiudad();

			break;
		case 5:
			System.out.println("¡¡¡¡¡chao!!!!");

			break;

		default:
			break;
		}

	}
	
	public void pedirPais() {
		pais= JOptionPane.showInputDialog("Ingrese el pais");
	}
	
	public void pedirCiudad() {
		ciudades= new ArrayList<>();
		String res= " ";
		
		do {
			ciudad=JOptionPane.showInputDialog("Ingrese la cuidad");
			
			ciudades.add(ciudad);
			
			res=JOptionPane.showInputDialog("ingrese si, si desea ingresar otra ciudad");
		}while(res.equalsIgnoreCase("si"));
		
		
		mapCuidades.put(pais, ciudades);
		
	
	}
	
	public void consultarPais() {
		
			pais = JOptionPane.showInputDialog("Ingrese el pais a buscar");
		if(mapCuidades.containsKey(pais)) {
			System.out.println(mapCuidades.get(pais));
		}else {
			JOptionPane.showMessageDialog(null, "El pais no existe");
		}
	}
	
	public void consultarCiudad() {
		
		    String ciudadBuscada = JOptionPane.showInputDialog("Ingrese la ciudad a buscar");

		    boolean encontrado = false;

		    for (String pais : mapCuidades.keySet()) {
		        if (mapCuidades.get(pais).contains(ciudadBuscada)) {
		            System.out.println(" La cuidad de " +ciudadBuscada+ " Pertenece al pais de " +pais);
		            encontrado = true;
		        }
		    }

		    if (!encontrado) {
		        System.out.println("No se encontró la ciudad.");
		    }
		}
		






}
