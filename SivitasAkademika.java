public class SivitasAkademika{
	private String nama;
	private String id;
	public SivitasAkademika(String nama, String id){
		this.nama = nama;
		this.id = id;
	}
	public void setNama(String nama){
		this.nama = nama;
	}
	public void setId(String id){
		this.id = id;
	}
	public String getNama(){
		return nama;
	}
	public String getId(){
		return id;
	}
	public String getInfo(){
		return String.format("ID %s \nNama %s ", getId(), getNama());
	}
}