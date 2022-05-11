package moses.figures;

import org.eclipse.draw2d.ImageFigure;

import moses.figures.activator.Activator;

public class RuleFigure extends ImageFigure {

 public RuleFigure() { 
  super(Activator.imageDescriptorFromPlugin(Activator.PLUGIN_ID,"images/Traffic.png").createImage(), 0);
 }

}