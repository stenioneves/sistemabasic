package sistema.model;

public enum TipoConta {
  NUBANK("Nubank"), OUROCARD("Cartão Ourocard"),SANTANDER("Cartão Santander"),ONDA("Onda Livre"),RIACHUELO("RCHLO"),
  UNIGRANRIO("Unigranrio"),TRANSPORTE("Transporte"),OUTROS("Outros");
	
  private String label;
	
	private TipoConta(String label) {
		this.label = label;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}
}
