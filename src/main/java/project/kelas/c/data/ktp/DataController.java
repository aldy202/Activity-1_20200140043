/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.kelas.c.data.ktp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author hp
 */
@Controller
public class DataController {
    
    @RequestMapping("/dataktp")
    //@ResponseBody
    public String getKTP(Model data){
        
        ArrayList<List<String>> ktp = new ArrayList<>();
        ktp.add(Arrays.asList("ID","Nomer KTP","Nama","Alamat"));
        ktp.add(Arrays.asList("001","67330022033401","aldy ahmad fauzi",
                "gejilg"));
        ktp.add(Arrays.asList("002","33002204500242","Muhammad bahrul",
                "kajen"));
        ktp.add(Arrays.asList("003","33032459603453","faishal agus","nyamok"));
        ktp.add(Arrays.asList("004","33034220034354","fitriani ningsih",
                "watubela"));
        ktp.add(Arrays.asList("005","56703495640035","saputra jaya wiyarto",
                "bojong"));
        ktp.add(Arrays.asList("006","33578003469906","sari wandi bibirasi",
                "podo"));
        ktp.add(Arrays.asList("007","32350021755607","coronasaputri",
                "watuireng"));
        ktp.add(Arrays.asList("008","33045200775638","juliavirus",
                "kayugritan"));
        ktp.add(Arrays.asList("009","33034905620049","kevin alviansa",
                "tanjung"));
        ktp.add(Arrays.asList("010","33034208840610","senocation","bubak"));
        ktp.add(Arrays.asList("011","33003456706011","covito lionadro",
                "salit"));
        ktp.add(Arrays.asList("012","33034567834012","agung saputri",
                "sambiroto"));
        ktp.add(Arrays.asList("013","33003456783413","sunti lawastri",
                "sibeduk"));
        ktp.add(Arrays.asList("014","33004556023614","jarumi suntikanti",
                "kebonagung"));
        ktp.add(Arrays.asList("015","33456783002315","cetiamol","watu gajah"));
        ktp.add(Arrays.asList("016","33034023445616","ayu diningsih",
                "banyuurip"));
        ktp.add(Arrays.asList("017","44567300200017","maluki mujawansi",
                "kajen"));
        ktp.add(Arrays.asList("018","33040030201018","mijru angsih","kesesi"));
        ktp.add(Arrays.asList("019","33034002200219","sudiman","podosari"));
        ktp.add(Arrays.asList("020","33030200300320","acika wirusih",
                "tanjungkulon"));
        
        
        data.addAttribute("dataktp", ktp);
        return "dataviewer";
    }
    
}
