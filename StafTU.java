public class StafTU extends TenagaPendidikan{
	public StafTU(String nama, String id){
		super(nama, id);
		this.setId(id);
		this.setGajiPokok(super.getGajiPokok());
	}
	public void setId(String id){
		super.setId("200-" + id);
	}
	public void setGajiPokok(int gajiPokok){
		super.setGajiPokok((5*gajiPokok/100) + gajiPokok);;
	}
	public String getInfo(){
		return String.format("%s \nGaji staffRp. %,d\n", super.getInfo(), super.getGajiPokok());
	}
}