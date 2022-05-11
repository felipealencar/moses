/*
* 
*/
package moses.diagram.edit.policies;

import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.commands.core.commands.DuplicateEObjectsCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DuplicateElementsRequest;

import moses.diagram.edit.commands.AppCreateCommand;
import moses.diagram.edit.commands.AppMonitorCreateCommand;
import moses.diagram.edit.commands.ConditionCreateCommand;
import moses.diagram.edit.commands.ControllerCreateCommand;
import moses.diagram.edit.commands.GroupCreateCommand;
import moses.diagram.edit.commands.HostCreateCommand;
import moses.diagram.edit.commands.PacketHeaderCreateCommand;
import moses.diagram.edit.commands.RuleCreateCommand;
import moses.diagram.edit.commands.SwitchCreateCommand;
import moses.diagram.edit.commands.TimeCreateCommand;
import moses.diagram.edit.commands.TrafficCreateCommand;
import moses.diagram.providers.MosesElementTypes;

/**
 * @generated
 */
public class SdnItemSemanticEditPolicy extends MosesBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public SdnItemSemanticEditPolicy() {
		super(MosesElementTypes.Sdn_1000);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (MosesElementTypes.Controller_2001 == req.getElementType()) {
			return getGEFWrapper(new ControllerCreateCommand(req));
		}
		if (MosesElementTypes.Host_2002 == req.getElementType()) {
			return getGEFWrapper(new HostCreateCommand(req));
		}
		if (MosesElementTypes.Switch_2003 == req.getElementType()) {
			return getGEFWrapper(new SwitchCreateCommand(req));
		}
		if (MosesElementTypes.AppMonitor_2004 == req.getElementType()) {
			return getGEFWrapper(new AppMonitorCreateCommand(req));
		}
		if (MosesElementTypes.Rule_2005 == req.getElementType()) {
			return getGEFWrapper(new RuleCreateCommand(req));
		}
		if (MosesElementTypes.Condition_2006 == req.getElementType()) {
			return getGEFWrapper(new ConditionCreateCommand(req));
		}
		if (MosesElementTypes.Traffic_2007 == req.getElementType()) {
			return getGEFWrapper(new TrafficCreateCommand(req));
		}
		if (MosesElementTypes.Time_2008 == req.getElementType()) {
			return getGEFWrapper(new TimeCreateCommand(req));
		}
		if (MosesElementTypes.PacketHeader_2009 == req.getElementType()) {
			return getGEFWrapper(new PacketHeaderCreateCommand(req));
		}
		if (MosesElementTypes.App_2010 == req.getElementType()) {
			return getGEFWrapper(new AppCreateCommand(req));
		}
		if (MosesElementTypes.Group_2011 == req.getElementType()) {
			return getGEFWrapper(new GroupCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

	/**
	* @generated
	*/
	protected Command getDuplicateCommand(DuplicateElementsRequest req) {
		TransactionalEditingDomain editingDomain = ((IGraphicalEditPart) getHost()).getEditingDomain();
		return getGEFWrapper(new DuplicateAnythingCommand(editingDomain, req));
	}

	/**
	* @generated
	*/
	private static class DuplicateAnythingCommand extends DuplicateEObjectsCommand {

		/**
		* @generated
		*/
		public DuplicateAnythingCommand(TransactionalEditingDomain editingDomain, DuplicateElementsRequest req) {
			super(editingDomain, req.getLabel(), req.getElementsToBeDuplicated(), req.getAllDuplicatedElementsMap());
		}

	}

}
