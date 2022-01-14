public class Internasional extends Mahasiswa{
	public Internasional(String nama, String id){
		super(nama, id);
		this.setId(id);
		this.setbayaranPokok(super.getbayaranPokok());
	}
	public void setId(String id){
		super.setId("100-" + id);
	}
	public void setBayaranPokok(int bayaranPokok){
		super.setBayaranPokok((20*bayaranPokok/100) + bayaranPokok);
	}
	public String getInfo(){
		return String.format("%s Rp. %d", super.getInfo(), super.getBayaranPokok());
	}
}