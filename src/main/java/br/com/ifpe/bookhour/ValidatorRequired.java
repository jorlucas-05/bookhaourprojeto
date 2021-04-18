package br.com.ifpe.bookhour;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ViewScoped
@ManagedBean
public class ValidatorRequired {

		private String required;

		public String getRequired() {
			return required;
		}

		public void setRequired(String required) {
			this.required = required;
		}
}
