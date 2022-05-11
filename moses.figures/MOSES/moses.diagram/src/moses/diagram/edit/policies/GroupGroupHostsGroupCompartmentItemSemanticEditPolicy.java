/*
* 
*/
package moses.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import moses.diagram.edit.commands.Host2CreateCommand;
import moses.diagram.providers.MosesElementTypes;

/**
 * @generated
 */
public class GroupGroupHostsGroupCompartmentItemSemanticEditPolicy extends MosesBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public GroupGroupHostsGroupCompartmentItemSemanticEditPolicy() {
		super(MosesElementTypes.Group_2011);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (MosesElementTypes.Host_3001 == req.getElementType()) {
			return getGEFWrapper(new Host2CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
