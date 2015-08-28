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
public class ExDay2Sem3 {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Avilable Processors: " + Runtime.getRuntime().availableProcessors());
        Thread t1 = new Thread1();
        Thread t2 = new Thread2();
        Thread t3 = new Thread3();
        long start = System.nanoTime();
        t1.start();
        t2.start();
        t3.start();
        t1.join();
        t2.join();
        t3.join();
        long end =
System.nanoTime();
        ImageBites im = new ImageBites();
    ImageBites im2 = new ImageBites();
    ImageBites im3 = new ImageBites();
    byte[] s =im.getBytesFromUrl("https://fronter.com/cphbusiness/design_images/images.php/Classic/login/fronter_big-logo.png");
    byte[] e = im2.getBytesFromUrl("https://fronter.com/cphbusiness/design_images/images.php/Classic/login/folder-image-transp.png");
   byte[] d = im3.getBytesFromUrl("https://fronter.com/volY12-cache/cache/img/design_images/Classic/other_images/button_bg.png"); 
        int sum = 0;
        
        for (byte x : s) {
            sum+=x;
        }
        for (byte x : e) {
            sum+=x;
        }
        for (byte x : d) {
            sum+=x;
        }
        
    
    
        System.out.println(sum); 
System.out.println("Time Sequental: "+(end - start));
        
    }
        
}
