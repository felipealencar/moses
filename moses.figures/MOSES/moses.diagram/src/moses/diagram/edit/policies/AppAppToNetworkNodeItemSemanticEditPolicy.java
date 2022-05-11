/*
* 
*/
package moses.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyReferenceCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest;

import moses.diagram.providers.MosesElementTypes;

/**
 * @generated
 */
public class AppAppToNetworkNodeItemSemanticEditPolicy extends MosesBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public AppAppToNetworkNodeItemSemanticEditPolicy() {
		super(MosesElementTypes.AppAppToNetworkNode_4009);
	}

	/**
	* @generated
	*/
	protected Command getDestroyReferenceCommand(DestroyReferenceRequest req) {
		return getGEFWrapper(new DestroyReferenceCommand(req));
	}

}
