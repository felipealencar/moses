/*
 * 
 */
package moses.diagram.providers;

import moses.diagram.part.MosesDiagramEditorPlugin;

/**
 * @generated
 */
public class ElementInitializers {

	protected ElementInitializers() {
		// use #getInstance to access cached instance
	}

	/**
	* @generated
	*/
	public static ElementInitializers getInstance() {
		ElementInitializers cached = MosesDiagramEditorPlugin.getInstance().getElementInitializers();
		if (cached == null) {
			MosesDiagramEditorPlugin.getInstance().setElementInitializers(cached = new ElementInitializers());
		}
		return cached;
	}
}
