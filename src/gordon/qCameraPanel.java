/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gordon; 

import org.bytedeco.javacpp.opencv_core.IplImage;
import org.bytedeco.javacv.FrameGrabber;
import org.bytedeco.javacv.VideoInputFrameGrabber;
import java.awt.image.BufferedImage;

/**
 *
 * @author bradlye
 */
public class qCameraPanel extends javax.swing.JPanel {
    IplImage image = null;
    BufferedImage buffImage = null;
    
    public BufferedImage getRawImage(){
            
        //Set up our framework to grab images
        FrameGrabber grabber = new VideoInputFrameGrabber(0);
        
        //Try to grab an image
        try {
            
            //Start (open up) the frame buffer
            grabber.start();
            
            //Sanity Delay
            Thread.sleep(100);
            
            //Grab The Image
            image = grabber.grab();
            
            //If we actually have an image, lets buffer it
            //The less time we spend in OpenCV, the less headaches I get about not having a native application!
            if(image != null){
                buffImage = image.getBufferedImage();
            }
            
            //Another Sanity Delay
            Thread.sleep(100);
            
        } catch(Exception e){
            //At the momeent we aren't doing anything with the excpetion, 
            //But as the application moves out of the debug/development stage,
            //We can write this to the log file
        }
        return buffImage;
    }
    
}
