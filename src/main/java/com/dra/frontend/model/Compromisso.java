package com.dra.frontend.model;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Compromisso {
	@NotBlank
	private String descricao;
	@NotBlank
	private String local;
	@NotBlank
	private Data data;
	
	private String status;
	 
	public void aceitar() {
	    
	this.status = "ACEITO";
	    
	 }
	
	public void delete() {
    
    }

    public static void setStatus(String string) {
		

	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getLocal() {
		return local;
	}

	public void setLocal(String local) {
		this.local = local;
	}

	public Data getData() {
		return data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public String getStatus() {
		return status;
	}
	
}

    
