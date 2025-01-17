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

import moses.diagram.edit.commands.ConditionConditionPacketCreateCommand;
import moses.diagram.edit.commands.ConditionConditionPacketReorientCommand;
import moses.diagram.edit.commands.ConditionConditionTimeCreateCommand;
import moses.diagram.edit.commands.ConditionConditionTimeReorientCommand;
import moses.diagram.edit.commands.ConditionConditionTrafficCreateCommand;
import moses.diagram.edit.commands.ConditionConditionTrafficReorientCommand;
import moses.diagram.edit.commands.RuleRuleConditionCreateCommand;
import moses.diagram.edit.commands.RuleRuleConditionReorientCommand;
import moses.diagram.edit.parts.ConditionConditionPacketEditPart;
import moses.diagram.edit.parts.ConditionConditionTimeEditPart;
import moses.diagram.edit.parts.ConditionConditionTrafficEditPart;
import moses.diagram.edit.parts.RuleRuleConditionEditPart;
import moses.diagram.part.MosesVisualIDRegistry;
import moses.diagram.providers.MosesElementTypes;

/**
 * @generated
 */
public class ConditionItemSemanticEditPolicy extends MosesBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public ConditionItemSemanticEditPolicy() {
		super(MosesElementTypes.Condition_2006);
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
			if (MosesVisualIDRegistry.getVisualID(incomingLink) == RuleRuleConditionEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(incomingLink.getSource().getElement(), null,
						incomingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
		}
		for (Iterator<?> it = view.getSourceEdges().iterator(); it.hasNext();) {
			Edge outgoingLink = (Edge) it.next();
			if (MosesVisualIDRegistry.getVisualID(outgoingLink) == ConditionConditionTimeEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(outgoingLink.getSource().getElement(), null,
						outgoingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (MosesVisualIDRegistry.getVisualID(outgoingLink) == ConditionConditionTrafficEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(outgoingLink.getSource().getElement(), null,
						outgoingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (MosesVisualIDRegistry.getVisualID(outgoingLink) == ConditionConditionPacketEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(outgoingLink.getSource().getElement(), null,
						outgoingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
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
		if (MosesElementTypes.RuleRuleCondition_4006 == req.getElementType()) {
			return null;
		}
		if (MosesElementTypes.ConditionConditionTime_4012 == req.getElementType()) {
			return getGEFWrapper(new ConditionConditionTimeCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (MosesElementTypes.ConditionConditionTraffic_4013 == req.getElementType()) {
			return getGEFWrapper(new ConditionConditionTrafficCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (MosesElementTypes.ConditionConditionPacket_4014 == req.getElementType()) {
			return getGEFWrapper(new ConditionConditionPacketCreateCommand(req, req.getSource(), req.getTarget()));
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getCompleteCreateRelationshipCommand(CreateRelationshipRequest req) {
		if (MosesElementTypes.RuleRuleCondition_4006 == req.getElementType()) {
			return getGEFWrapper(new RuleRuleConditionCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (MosesElementTypes.ConditionConditionTime_4012 == req.getElementType()) {
			return null;
		}
		if (MosesElementTypes.ConditionConditionTraffic_4013 == req.getElementType()) {
			return null;
		}
		if (MosesElementTypes.ConditionConditionPacket_4014 == req.getElementType()) {
			return null;
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
		case RuleRuleConditionEditPart.VISUAL_ID:
			return getGEFWrapper(new RuleRuleConditionReorientCommand(req));
		case ConditionConditionTimeEditPart.VISUAL_ID:
			return getGEFWrapper(new ConditionConditionTimeReorientCommand(req));
		case ConditionConditionTrafficEditPart.VISUAL_ID:
			return getGEFWrapper(new ConditionConditionTrafficReorientCommand(req));
		case ConditionConditionPacketEditPart.VISUAL_ID:
			return getGEFWrapper(new ConditionConditionPacketReorientCommand(req));
		}
		return super.getReorientReferenceRelationshipCommand(req);
	}

}
