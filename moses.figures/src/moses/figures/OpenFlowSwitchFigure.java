package moses.figures;

import org.eclipse.draw2d.ImageFigure;

import moses.figures.activator.Activator;

public class OpenFlowSwitchFigure extends ImageFigure {

 public OpenFlowSwitchFigure() { 
  super(Activator.imageDescriptorFromPlugin(Activator.PLUGIN_ID,"images/Switch.png").createImage(), 0);
 }

}