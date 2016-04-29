package es.upm.dit.isst.t4.dao;

import java.util.List;

import es.upm.dit.isst.t4.model.TFG;

public interface TFGDAO {
	
	public TFG create (String autor, String titulo, String resumen, String tutor);
	public List<TFG> read();
	public TFG update (TFG tfg);
	public void delete (String id);

}