package co.edu.unbosque.model;

public class PackageDTO {
	
	private long serialNumber;
	private String packageContent;
	private String issuerName;
	private String receiverName;
	private int weight;
	
	public PackageDTO() {
		// TODO Auto-generated constructor stub
	}

	public PackageDTO(long serialNumber, String packageContent, String issuerName, String receiverName, int weight) {
		super();
		this.serialNumber = serialNumber;
		this.packageContent = packageContent;
		this.issuerName = issuerName;
		this.receiverName = receiverName;
		this.weight = weight;
	}

	public long getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(long serialNumber) {
		this.serialNumber = serialNumber;
	}

	public String getPackageContent() {
		return packageContent;
	}

	public void setPackageContent(String packageContent) {
		this.packageContent = packageContent;
	}

	public String getIssuerName() {
		return issuerName;
	}

	public void setIssuerName(String issuerName) {
		this.issuerName = issuerName;
	}

	public String getReceiverName() {
		return receiverName;
	}

	public void setReceiverName(String receiverName) {
		this.receiverName = receiverName;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "PackageDTO [serialNumber=" + serialNumber + ", packageContent=" + packageContent + ", issuerName="
				+ issuerName + ", receiverName=" + receiverName + ", weight=" + weight + "]";
	}
	
	

}