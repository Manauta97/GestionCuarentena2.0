package iodatos;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import agendaDinamica.Contacto;
/**
 * 
 * @author a112
 * @version 0.1.0
 *
 */
public class IOdatos {
	public static final String dir="./datos";
	public static final String dirpol="./datos/personas.dat";
	public static final String dirsal="./datos/salida.dat";

	/**
	 * crea directorio para los ficheros que se van a usar
	 * 
	 */
	private static void mkdirectorio() {
		File f=new File(dir);
		if (!f.exists()) {
			f.mkdir();
		}
	}
	/**
	 * @param vPers
	 * guarda vector de persona
	 */
	public static void guardarPers(Persona vPers[]) {
		mkdirectorio();
		File f=new File(dirpol);
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		
		
		if (!f.exists()) {
			f.createNewFile();
		}else {
			try {
				fos = new FileOutputStream(f);
				oos = new ObjectOutputStream(fos);

				oos.writeObject(vPers);

			} catch (FileNotFoundException e) {
				// e.printStackTrace();
			} catch (IOException e) {
				// e.printStackTrace();
			} finally {
				try {
					oos.close();
					fos.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			
		}
		
	}
	/**
	 * @param vSal
	 * guarda vectro de salida
	 */
	public static void guardarSal(Salida vSal[]) {
		mkdirectorio();
		
		File f=new File(dirsal);
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		
		
		if (!f.exists()) {
			f.createNewFile();
		}else {
			try {
				fos = new FileOutputStream(f);
				oos = new ObjectOutputStream(fos);

				oos.writeObject(vSal);

			} catch (FileNotFoundException e) {
				// e.printStackTrace();
			} catch (IOException e) {
				// e.printStackTrace();
			} finally {
				try {
					oos.close();
					fos.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			
		}
		
		
	}
	
/**
 * devuelve vector de persona tras cargar de disco
 */
	
	public static Persona[] cargarpersona() {
		mkdirectorio();
		ArrayList<Persona> vContact = new ArrayList<Persona>();
		
		File file =new File(dirpol);
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		

		if (!file.exists()) {
			try {
				file.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return vContact;
		}
		try {
			fis = new FileInputStream(file);
			ois = new ObjectInputStream(fis);
//				ois.readObject();
			vContact = (ArrayList<Persona>) ois.readObject();

		} catch (FileNotFoundException e) {
			// e.printStackTrace();
		} catch (IOException e) {
			// e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// e.printStackTrace();
		} finally {
			try {
				if (ois!=null)
					ois.close();
				fis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				// e.printStackTrace();
			}
		}

		return vContact;
	}
	/**
	 * devuelve vector de salida tras cargar de disco
	 */	
	public static Salida[] cargarSalida() {
		mkdirectorio();
		ArrayList<Salida> vContact = new ArrayList<Salida>();
		
		File file =new File(dirsal);
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		
		

		if (!file.exists()) {
			try {
				file.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return vContact;
		}
		try {
			fis = new FileInputStream(file);
			ois = new ObjectInputStream(fis);
//				ois.readObject();
			vContact = (ArrayList<Salida>) ois.readObject();

		} catch (FileNotFoundException e) {
			// e.printStackTrace();
		} catch (IOException e) {
			// e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// e.printStackTrace();
		} finally {
			try {
				if (ois!=null)
					ois.close();
				fis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				// e.printStackTrace();
			}
		}

		return vContact;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
