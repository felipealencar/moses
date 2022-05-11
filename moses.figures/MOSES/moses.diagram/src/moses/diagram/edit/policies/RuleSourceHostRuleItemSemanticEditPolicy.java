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
public class RuleSourceHostRuleItemSemanticEditPolicy extends MosesBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public RuleSourceHostRuleItemSemanticEditPolicy() {
		super(MosesElementTypes.RuleSourceHostRule_4004);
	}

	/**
	* @generated
	*/
	protected Command getDestroyReferenceCommand(DestroyReferenceRequest req) {
		return getGEFWrapper(new DestroyReferenceCommand(req));
	}

}
