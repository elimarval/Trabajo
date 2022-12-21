package com;

/**
 * This class was automatically generated by the data modeler tool.
 */

@org.kie.api.definition.type.Description("Es un BackboneElement que puede representar persona, localización, helthcareService o dispositivo")
public class Participant implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@org.kie.api.definition.type.Label(value = "Rol del participante")
	private com.CodeableConcept type;
	@org.kie.api.definition.type.Label(value = "Referencia a: Person, Location/HealthcareService or Device")
	private com.Reference actor;

	public Participant() {
	}

	public com.CodeableConcept getType() {
		return this.type;
	}

	public void setType(com.CodeableConcept type) {
		this.type = type;
	}

	public com.Reference getActor() {
		return this.actor;
	}

	public void setActor(com.Reference actor) {
		this.actor = actor;
	}

	public Participant(com.CodeableConcept type, com.Reference actor) {
		this.type = type;
		this.actor = actor;
	}

}