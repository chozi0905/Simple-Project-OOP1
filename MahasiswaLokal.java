public class MahasiswaLokal extends Mahasiswa{
	public MahasiswaLokal(String nama, String id){
		super(nama, id);
		this.setId(id);
		this.setBayaranPokok(super.getBayaranPokok());
	}
	public void setId(String id){
		super.setId("140-2019-" + id);
	}
	public void setBayaranPokok(int bayaranPokok){
		super.setBayaranPokok((5*bayaranPokok/100) + bayaranPokok);
	}
	public String getInfo(){
		return String.format("%s \nBayaran mahasiswa lokal Rp. %,d\n", super.getInfo(), super.getBayaranPokok());
	}
}