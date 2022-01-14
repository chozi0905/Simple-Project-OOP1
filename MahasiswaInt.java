public class MahasiswaInt extends Mahasiswa{
	public MahasiswaInt(String nama, String id){
		super(nama, id);
		this.setId(id);
		this.setBayaranPokok(super.getBayaranPokok());
	}
	public void setId(String id){
		super.setId("140-2019-" + id);
	}
	public void setBayaranPokok(int bayaranPokok){
		super.setBayaranPokok((20*bayaranPokok/100) + bayaranPokok);
	}
	public String getInfo(){
		return String.format("%s \nBayaran mahasiswa internasional Rp. %,d\n", super.getInfo(), super.getBayaranPokok());
	}
}