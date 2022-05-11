package moses.figures;

import org.eclipse.draw2d.ImageFigure;

import moses.figures.activator.Activator;

public class TimeFigure extends ImageFigure {

 public TimeFigure() { 
  super(Activator.imageDescriptorFromPlugin(Activator.PLUGIN_ID,"images/Time.png").createImage(), 0);
 }

}