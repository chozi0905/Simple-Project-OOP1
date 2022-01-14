public class Lokal extends Mahasiswa{
	public Lokal(String nama, String id){
		super(nama, id);
		this.setId(id);
		this.setbayaranPokok(super.getbayaranPokok());
	}
	public void setId(String id){
		super.setId("100-" + id);
	}
	public void setBayaranPokok(int bayaranPokok){
		super.setBayaranPokok((5*bayaranPokok/100) + bayaranPokok);
	}
	public String getInfo(){
		return String.format("%s Rp. %d", super.getInfo(), super.getBayaranPokok());
	}
}