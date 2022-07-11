
import java.applet.*;
import java.awt.*;

public class Font1 extends Applet{ 
    public void paint(Graphics g){

      
        Font currentFont = g.getFont();
 
        String fontName = currentFont.getName();
        
        int size = currentFont.getSize();
        
        int style = currentFont.getStyle();
        String fontStyle = "";
        
        if( (style & Font.BOLD) == Font.BOLD)
            fontStyle = "Bold";
        
        if( (style & Font.ITALIC) == Font.ITALIC)
            fontStyle = "Italic";
        
        if( (style & Font.PLAIN) == Font.PLAIN)
            fontStyle = "Plain";
        
        
        String family = currentFont.getFamily();
        
        g.drawString("Font Name   : " + fontName, 60, 60);
        g.drawString("Font size   : " + size, 60, 80);
        g.drawString("Font Family : " + family, 60, 100);
        g.drawString("Font Style  : " + fontStyle, 60, 120);
    }
}

/*
<applet code="Font1" width="1000" height="1000">
</applet>
*/