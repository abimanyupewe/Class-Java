/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemPerkulihan;

import sistemPerkulihan_UI.TextUi;
import sistemLogic.SistemPerkuliahan;

/**
 *
 * @author A-11
 */
public class Main {
    public static void main(String[] args) {
//        jika inisialisasi baru jangan lupa dikasi new
        SistemPerkuliahan sistemPerkuliahan = new SistemPerkuliahan();
        
        TextUi ui = new TextUi();
        ui.run();
    }
}
