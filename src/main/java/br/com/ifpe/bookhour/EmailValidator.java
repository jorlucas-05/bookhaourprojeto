package br.com.ifpe.bookhour;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

@FacesValidator("emailValidator")
public class EmailValidator implements Validator<String> {

	private Pattern pattern = Pattern
			.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");

	public void validate(FacesContext context, UIComponent component, String value) throws ValidatorException {
		Matcher matcher = pattern.matcher(value.trim());

		if (!matcher.matches()) {
			FacesMessage msg = new FacesMessage("Erro de validação de e-mail.", "Formato esperado: abcd@abc.com");
			msg.setSeverity(FacesMessage.SEVERITY_ERROR);
			throw new ValidatorException(msg);
		}
	}

}
