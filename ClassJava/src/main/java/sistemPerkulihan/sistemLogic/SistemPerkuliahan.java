/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemPerkulihan.sistemLogic;

import sistemLogic.*;

/**
 *
 * @author A-11
 */
public class SistemPerkuliahan {
    private Perkuliahan[] dataPerkuliahans;
    private Dosen[] dataDosens;
    private Mahasiswa[] datamahasiswas;
    private Staf[] dataStafs;

//    insert code pilih constructor jangan dipilih karena kita isi sendiri
    public SistemPerkuliahan() {
        
    }

    public SistemPerkuliahan(int maxPerkuliahan, int maxDosen, Mahasiswa[] datamahasiswas, Staf[] dataStafs) {
        this.dataPerkuliahans = dataPerkuliahans;
        this.dataDosens = dataDosens;
        this.datamahasiswas = datamahasiswas;
        this.dataStafs = dataStafs;
    }
    
    
}
