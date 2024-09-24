/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author se180663
 */
public class i4idol {
     String  ho_ten;
        int vong_mot;
        double chieu_cao;

    public i4idol() {
    }

    public i4idol(String ho_ten, int vong_mot, double chieu_cao) {
        this.ho_ten = ho_ten;
        this.vong_mot = vong_mot;
        this.chieu_cao = chieu_cao;
    }

    @Override
    public String toString() {
        return "{" + "ho_ten=" + ho_ten + ", vong_mot=" + vong_mot + ", chieu_cao=" + chieu_cao + '}';
    }
        
       
    
}
