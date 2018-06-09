package FrameDesign;

import javax.swing.ImageIcon;


public class ImageLoader {
    public static ImageIcon createImageIcon(String path,String description) {
        java.net.URL imgURL = demo.class.getResource(path);
        if (imgURL != null) {
            return new ImageIcon(imgURL, description);
        } else {
            System.err.println("Couldn't find file: " + path);
            return null;
        }
    }

}