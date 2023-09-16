package project_web;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class SaludoBean {
	private String mensaje="Bienvenido!!!";
	
	public String getMensaje() {
		return mensaje;
	}
	
	public void setMensaje(String mensaje) {
		this.mensaje= mensaje;
	}
}
