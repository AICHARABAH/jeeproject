package es.microforum.serviceapi;

import java.util.List;
import es.microforum.model.Empleado;

public interface EmpleadoService {

	public abstract void agregarModificarEmpleado(Empleado empleado);
	public abstract void eliminarEmpleado(Empleado empleado);
	public abstract Empleado consultarEmpleadoPorDni(String dni);
	public abstract List<Empleado> consultarEmpleados();
	
}
