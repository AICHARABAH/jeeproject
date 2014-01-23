package es.microforum.serviceapi;

import java.util.List;
import es.microforum.model.Empresa;

public interface EmpresaService {
	
	public abstract void agregarModificarEmpresa(Empresa empresa);
	public abstract void eliminarEmpresa(Empresa empresa);
	public abstract Empresa consultarEmpresaPorNif(String nif);
	public abstract List<Empresa> consultarEmpresas();
	
}
