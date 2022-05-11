package moses.figures;

import org.eclipse.draw2d.ImageFigure;

import moses.figures.activator.Activator;

public class SwitchFigure extends ImageFigure {

 public SwitchFigure() { 
  super(Activator.imageDescriptorFromPlugin(Activator.PLUGIN_ID,"images/Switch.png").createImage(), 0);
 }

}