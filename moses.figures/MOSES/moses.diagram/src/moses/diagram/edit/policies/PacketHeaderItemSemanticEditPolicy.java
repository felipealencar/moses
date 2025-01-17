/*
* 
*/
package moses.diagram.edit.policies;

import java.util.Iterator;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand;
import org.eclipse.gmf.runtime.emf.commands.core.command.CompositeTransactionalCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyReferenceCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientReferenceRelationshipRequest;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.View;

import moses.diagram.edit.commands.AppActionPacketHeaderCreateCommand;
import moses.diagram.edit.commands.AppActionPacketHeaderReorientCommand;
import moses.diagram.edit.commands.ConditionConditionPacketCreateCommand;
import moses.diagram.edit.commands.ConditionConditionPacketReorientCommand;
import moses.diagram.edit.parts.AppActionPacketHeaderEditPart;
import moses.diagram.edit.parts.ConditionConditionPacketEditPart;
import moses.diagram.part.MosesVisualIDRegistry;
import moses.diagram.providers.MosesElementTypes;

/**
 * @generated
 */
public class PacketHeaderItemSemanticEditPolicy extends MosesBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public PacketHeaderItemSemanticEditPolicy() {
		super(MosesElementTypes.PacketHeader_2009);
	}

	/**
	* @generated
	*/
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		View view = (View) getHost().getModel();
		CompositeTransactionalCommand cmd = new CompositeTransactionalCommand(getEditingDomain(), null);
		cmd.setTransactionNestingEnabled(false);
		for (Iterator<?> it = view.getTargetEdges().iterator(); it.hasNext();) {
			Edge incomingLink = (Edge) it.next();
			if (MosesVisualIDRegistry.getVisualID(incomingLink) == AppActionPacketHeaderEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(incomingLink.getSource().getElement(), null,
						incomingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (MosesVisualIDRegistry.getVisualID(incomingLink) == ConditionConditionPacketEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(incomingLink.getSource().getElement(), null,
						incomingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
		}
		EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
		if (annotation == null) {
			// there are indirectly referenced children, need extra commands: false
			addDestroyShortcutsCommand(cmd, view);
			// delete host element
			cmd.add(new DestroyElementCommand(req));
		} else {
			cmd.add(new DeleteCommand(getEditingDomain(), view));
		}
		return getGEFWrapper(cmd.reduce());
	}

	/**
	 * @generated
	 */
	protected Command getCreateRelationshipCommand(CreateRelationshipRequest req) {
		Command command = req.getTarget() == null ? getStartCreateRelationshipCommand(req)
				: getCompleteCreateRelationshipCommand(req);
		return command != null ? command : super.getCreateRelationshipCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getStartCreateRelationshipCommand(CreateRelationshipRequest req) {
		if (MosesElementTypes.AppActionPacketHeader_4008 == req.getElementType()) {
			return null;
		}
		if (MosesElementTypes.ConditionConditionPacket_4014 == req.getElementType()) {
			return null;
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getCompleteCreateRelationshipCommand(CreateRelationshipRequest req) {
		if (MosesElementTypes.AppActionPacketHeader_4008 == req.getElementType()) {
			return getGEFWrapper(new AppActionPacketHeaderCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (MosesElementTypes.ConditionConditionPacket_4014 == req.getElementType()) {
			return getGEFWrapper(new ConditionConditionPacketCreateCommand(req, req.getSource(), req.getTarget()));
		}
		return null;
	}

	/**
	 * Returns command to reorient EReference based link. New link target or source
	 * should be the domain model element associated with this node.
	 * 
	 * @generated
	 */
	protected Command getReorientReferenceRelationshipCommand(ReorientReferenceRelationshipRequest req) {
		switch (getVisualID(req)) {
		case AppActionPacketHeaderEditPart.VISUAL_ID:
			return getGEFWrapper(new AppActionPacketHeaderReorientCommand(req));
		case ConditionConditionPacketEditPart.VISUAL_ID:
			return getGEFWrapper(new ConditionConditionPacketReorientCommand(req));
		}
		return super.getReorientReferenceRelationshipCommand(req);
	}

}
