package moses.figures;

import org.eclipse.draw2d.ImageFigure;

import moses.figures.activator.Activator;

public class ActionFigure extends ImageFigure {

 public ActionFigure() { 
  super(Activator.imageDescriptorFromPlugin(Activator.PLUGIN_ID,"images/Action.png").createImage(), 0);
 }

}