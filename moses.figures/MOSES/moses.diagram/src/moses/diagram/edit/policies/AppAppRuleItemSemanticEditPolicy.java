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
public class AppAppRuleItemSemanticEditPolicy extends MosesBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public AppAppRuleItemSemanticEditPolicy() {
		super(MosesElementTypes.AppAppRule_4011);
	}

	/**
	* @generated
	*/
	protected Command getDestroyReferenceCommand(DestroyReferenceRequest req) {
		return getGEFWrapper(new DestroyReferenceCommand(req));
	}

}
