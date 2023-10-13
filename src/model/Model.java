/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author huynh
 */
public class Model 
{
    private String English;
    private String VietNam;

    public Model() {
    }

    public Model(String English, String VietNam) {
        this.English = English;
        this.VietNam = VietNam;
    }

    public String getEnglish() {
        return English;
    }

    public void setEnglish(String English) {
        this.English = English;
    }

    public String getVietNam() {
        return VietNam;
    }

    public void setVietNam(String VietNam) {
        this.VietNam = VietNam;
    }
    
}
