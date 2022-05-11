package moses.figures;

import org.eclipse.draw2d.ImageFigure;

import moses.figures.activator.Activator;

public class TrafficFigure extends ImageFigure {

 public TrafficFigure() { 
  super(Activator.imageDescriptorFromPlugin(Activator.PLUGIN_ID,"images/Traffic.png").createImage(), 0);
 }

}