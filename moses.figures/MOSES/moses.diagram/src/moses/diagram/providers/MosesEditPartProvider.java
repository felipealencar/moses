/*
 * 
 */
package moses.diagram.providers;

import org.eclipse.gmf.tooling.runtime.providers.DefaultEditPartProvider;

import moses.diagram.edit.parts.MosesEditPartFactory;
import moses.diagram.edit.parts.SdnEditPart;
import moses.diagram.part.MosesVisualIDRegistry;

/**
 * @generated
 */
public class MosesEditPartProvider extends DefaultEditPartProvider {

	/**
	* @generated
	*/
	public MosesEditPartProvider() {
		super(new MosesEditPartFactory(), MosesVisualIDRegistry.TYPED_INSTANCE, SdnEditPart.MODEL_ID);
	}

}
