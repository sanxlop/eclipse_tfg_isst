package es.upm.dit.isst.t4.dao;

import java.util.List;

import es.upm.dit.isst.t4.model.TFG;

public interface TFGDAO {
	
	public TFG create (String autor, String titulo, String resumen, String tutor);
	public List<TFG> read();
	/*public List<TFG> readTutor (String profesor);
	public List<TFG> readSecretario (String profesor);
	public List<TFG> readEstado (int estado);
	public TFG readAlumno (String autor);*/
	public TFG update (TFG tfg);
	public void delete (String id);

}