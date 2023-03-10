package com;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class CodeableConcept implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@org.kie.api.definition.type.Label(value = "código")
	private com.Coding coding;
	private java.lang.Long id;
	@org.kie.api.definition.type.Label(value = "descripción")
	private java.lang.String text;

	public CodeableConcept() {
	}

	public com.Coding getCoding() {
		return this.coding;
	}

	public void setCoding(com.Coding coding) {
		this.coding = coding;
	}

	public java.lang.Long getId() {
		return this.id;
	}

	public void setId(java.lang.Long id) {
		this.id = id;
	}

	public java.lang.String getText() {
		return this.text;
	}

	public void setText(java.lang.String text) {
		this.text = text;
	}

	public CodeableConcept(com.Coding coding, java.lang.Long id,
			java.lang.String text) {
		this.coding = coding;
		this.id = id;
		this.text = text;
	}

}