package fxml;


import org.controlsfx.control.Notifications;

import javafx.fxml.FXML;
import javafx.geometry.Pos;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginControlador {
	
	@FXML
	private TextField campoEmail;
	
	@FXML
	private PasswordField campoSenha;
	
	public void entrar() {
		boolean emailValido = campoEmail.getText().equals("cmaan@gmail.com");
		boolean senhaValido = campoSenha.getText().equals("159753864a");
		
		if(emailValido && senhaValido) {
			Notifications.create()
			.position(Pos.TOP_RIGHT)
				.title("Login FXML")
				.text("Login Efetuado Com Sucesso!")
				.showInformation();
		} else {
			Notifications.create()
			.position(Pos.BOTTOM_RIGHT)
			.title("Login FXML")
			.text("Usuario e/ou Senha Inválidos")
			.showError();
			
			System.out.println("Falha");
		}
		
		System.out.println(campoEmail.getText());
		System.out.println(campoSenha.getText());
	}
}