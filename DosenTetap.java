public class DosenTetap extends TenagaPendidikan{
	private String nidn;
	public DosenTetap(String nama, String id, String nidn){
		super(nama, id);
		this.setId(id);
		this.setNidn(nidn);
		this.setGajiPokok(super.getGajiPokok());
	}
	public void setId(String id){
		super.setId("100-" + id);
	}
	public void setGajiPokok(int gajiPokok){
		super.setGajiPokok((15*gajiPokok/100) + gajiPokok);
	}
	public void setNidn(String nidn){
		this.nidn = nidn;
	}
	public String getNidn(){
		return nidn;
	}
	public String getInfo(){
		return String.format("%s \nNIDN %s \nGaji dosen Rp. %,d\n", super.getInfo(), getNidn(), super.getGajiPokok());
	}
}