public class Mahasiswa extends SivitasAkademika{
	private int bayaranPokok = 3500000;
	public Mahasiswa(String nama, String id){
		super(nama, id);
	}
	public void setBayaranPokok(int bayaranPokok){
		this.bayaranPokok = bayaranPokok;
	}
	public int getBayaranPokok(){
		return bayaranPokok;
	}
}