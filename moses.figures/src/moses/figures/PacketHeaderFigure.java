package moses.figures;

import org.eclipse.draw2d.ImageFigure;

import moses.figures.activator.Activator;

public class PacketHeaderFigure extends ImageFigure {

 public PacketHeaderFigure() { 
  super(Activator.imageDescriptorFromPlugin(Activator.PLUGIN_ID,"images/PacketHeader.png").createImage(), 0);
 }

}