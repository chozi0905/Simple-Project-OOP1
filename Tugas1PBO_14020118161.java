public class Tugas1PBO_14020118161{
	public static void main(String[] args){
		int dataDosen = 0;
		int toGajiDosen = 0;
		int toGajiStaf = 0;
		int dataStafTu = 0;
		TenagaPendidikan dosenTetap =  new DosenTetap("MF", "1", "193011");
		TenagaPendidikan stafTu =  new StafTU("SR", "1");
		TenagaPendidikan dosenTetap1 =  new DosenTetap("GG", "2", "193012");
		TenagaPendidikan stafTu1 =  new StafTU("BB", "2");
		TenagaPendidikan dosenTetap2 =  new DosenTetap("BR", "3", "193013");
		TenagaPendidikan stafTu2 =  new StafTU("MR", "3");
		TenagaPendidikan dosenTetap3 =  new DosenTetap("AZ", "4", "193014");
		TenagaPendidikan[] tenagaPendik = {dosenTetap, dosenTetap1, dosenTetap2, dosenTetap3, stafTu, stafTu1, stafTu2};
		for (int i = 0; i < tenagaPendik.length; i++) {
			if(tenagaPendik[i] instanceof DosenTetap){
				DosenTetap dt = (DosenTetap) tenagaPendik[i];
				System.out.println(dt.getInfo());
				dataDosen += 1;
				toGajiDosen += dt.getGajiPokok();
			}
		}
		System.out.println("Jumlah Data dosen tetap: " + dataDosen);
		System.out.println("Total gaji dosen tetap: Rp. " + toGajiDosen + "\n");
		for (int a = 0; a < tenagaPendik.length; a++) {
			if(tenagaPendik[a] instanceof StafTU){
				StafTU st = (StafTU) tenagaPendik[a];
				System.out.println(st.getInfo());
				dataStafTu += 1;
				toGajiStaf += st.getGajiPokok();
			}
		}
		System.out.println("Jumlah data staftu: " + dataStafTu);
		System.out.println("Total gaji staftu: Rp. " + toGajiStaf+"\n");
		SivitasAkademika mhs = new MahasiswaLokal("MF", "1");
		SivitasAkademika mhs1 = new MahasiswaInt("HH", "2");
		SivitasAkademika mhs2 = new MahasiswaLokal("GG", "3");
		SivitasAkademika mhs3 = new MahasiswaInt("BR", "4");
		SivitasAkademika mhs4 = new MahasiswaLokal("AR", "5");
		SivitasAkademika mhs5 = new MahasiswaInt("AZ", "6");
		System.out.println(mhs.getInfo());
		System.out.println(mhs1.getInfo());
		System.out.println(mhs2.getInfo());
		System.out.println(mhs3.getInfo());
		System.out.println(mhs4.getInfo());
		System.out.println(mhs5.getInfo());

	}
}