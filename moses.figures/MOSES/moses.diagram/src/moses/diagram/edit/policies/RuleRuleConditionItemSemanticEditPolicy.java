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
public class RuleRuleConditionItemSemanticEditPolicy extends MosesBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public RuleRuleConditionItemSemanticEditPolicy() {
		super(MosesElementTypes.RuleRuleCondition_4006);
	}

	/**
	* @generated
	*/
	protected Command getDestroyReferenceCommand(DestroyReferenceRequest req) {
		return getGEFWrapper(new DestroyReferenceCommand(req));
	}

}
