/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exday2sem3;

/**
 *
 * @author user
 */
public class Thread1 extends  Thread {
    ImageBites im = new ImageBites();
    
    public void run(){
       im.getBytesFromUrl("https://fronter.com/cphbusiness/design_images/images.php/Classic/login/fronter_big-logo.png");
        System.out.println(getBytes());
    }
    public byte getBytes(){
        byte[] s =im.getBytesFromUrl("https://fronter.com/cphbusiness/design_images/images.php/Classic/login/fronter_big-logo.png");
        byte sum = 0;
        
        for (byte x : s) {
        sum+=x;
        }
    return sum;

}
    
}
