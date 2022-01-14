public class TenagaPendidikan extends SivitasAkademika{
	private int gajiPokok = 4500000;
	public TenagaPendidikan(String nama, String id){
		super(nama, id);
	}
	public void setGajiPokok(int gajiPokok){
		this.gajiPokok = gajiPokok;
	}
	public int getGajiPokok(){
		return gajiPokok;
	}
}