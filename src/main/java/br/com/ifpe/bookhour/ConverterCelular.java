package br.com.ifpe.bookhour;

import java.util.StringTokenizer;
import java.util.regex.Pattern;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.ConverterException;
import javax.faces.convert.FacesConverter;

import br.com.ifpe.bookhour.Celular;

/**
 * Refer�ncia: http://www.javabeat.net/using-converters-in-jsf/
 * 
 * @author jaindsonvs
 */
@FacesConverter(forClass =  Celular.class)
public class ConverterCelular implements Converter<Celular>{

	private Pattern pattern = Pattern.compile("\\d+-\\d+-\\d+");

	public Celular getAsObject(FacesContext context, UIComponent component, String value) {
		if (value == null || (value.trim().length() == 0)) {
			return null;
		}

		// Verificar se a string est� no formato esperado. Ex: 55-83-123456789
		if (!pattern.matcher(value).matches()) {
			String msgErroStr = String.format(
					"Erro de convers�o! N�o foi poss�vel realizar a convers�o da string '%s' para o tipo esperado.",
					value);
			FacesMessage msgErro = new FacesMessage(FacesMessage.SEVERITY_ERROR, msgErroStr, msgErroStr);
			throw new ConverterException(msgErro);
		}

		// Construir o objeto a partir da string
		StringTokenizer hyphenTokenizer = new StringTokenizer(value, "-");
		
		Integer codigoArea = Integer.parseInt(hyphenTokenizer.nextToken());
		Long numero = Long.parseLong(hyphenTokenizer.nextToken());

		return new Celular(codigoArea, numero);
	}

	public String getAsString(FacesContext context, UIComponent component, Celular value) {

		if (!(value instanceof Celular)) {
			return null;
		}

		Celular celular = (Celular) value;

		return celular.getCodigoarea() + "-" + celular.getNumero();
	}

}


