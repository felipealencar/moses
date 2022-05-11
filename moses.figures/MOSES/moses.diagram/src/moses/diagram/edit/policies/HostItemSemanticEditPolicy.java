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

import moses.diagram.edit.commands.AppAppToNetworkNodeCreateCommand;
import moses.diagram.edit.commands.AppAppToNetworkNodeReorientCommand;
import moses.diagram.edit.commands.HostHostSwitchCreateCommand;
import moses.diagram.edit.commands.HostHostSwitchReorientCommand;
import moses.diagram.edit.commands.RuleSourceHostRuleCreateCommand;
import moses.diagram.edit.commands.RuleSourceHostRuleReorientCommand;
import moses.diagram.edit.commands.RuleTargetHostRuleCreateCommand;
import moses.diagram.edit.commands.RuleTargetHostRuleReorientCommand;
import moses.diagram.edit.parts.AppAppToNetworkNodeEditPart;
import moses.diagram.edit.parts.HostHostSwitchEditPart;
import moses.diagram.edit.parts.RuleSourceHostRuleEditPart;
import moses.diagram.edit.parts.RuleTargetHostRuleEditPart;
import moses.diagram.part.MosesVisualIDRegistry;
import moses.diagram.providers.MosesElementTypes;

/**
 * @generated
 */
public class HostItemSemanticEditPolicy extends MosesBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public HostItemSemanticEditPolicy() {
		super(MosesElementTypes.Host_2002);
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
			if (MosesVisualIDRegistry.getVisualID(incomingLink) == RuleSourceHostRuleEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(incomingLink.getSource().getElement(), null,
						incomingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (MosesVisualIDRegistry.getVisualID(incomingLink) == RuleTargetHostRuleEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(incomingLink.getSource().getElement(), null,
						incomingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (MosesVisualIDRegistry.getVisualID(incomingLink) == AppAppToNetworkNodeEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(incomingLink.getSource().getElement(), null,
						incomingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
		}
		for (Iterator<?> it = view.getSourceEdges().iterator(); it.hasNext();) {
			Edge outgoingLink = (Edge) it.next();
			if (MosesVisualIDRegistry.getVisualID(outgoingLink) == HostHostSwitchEditPart.VISUAL_ID) {
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
		if (MosesElementTypes.HostHostSwitch_4001 == req.getElementType()) {
			return getGEFWrapper(new HostHostSwitchCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (MosesElementTypes.RuleSourceHostRule_4004 == req.getElementType()) {
			return null;
		}
		if (MosesElementTypes.RuleTargetHostRule_4005 == req.getElementType()) {
			return null;
		}
		if (MosesElementTypes.AppAppToNetworkNode_4009 == req.getElementType()) {
			return null;
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getCompleteCreateRelationshipCommand(CreateRelationshipRequest req) {
		if (MosesElementTypes.HostHostSwitch_4001 == req.getElementType()) {
			return null;
		}
		if (MosesElementTypes.RuleSourceHostRule_4004 == req.getElementType()) {
			return getGEFWrapper(new RuleSourceHostRuleCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (MosesElementTypes.RuleTargetHostRule_4005 == req.getElementType()) {
			return getGEFWrapper(new RuleTargetHostRuleCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (MosesElementTypes.AppAppToNetworkNode_4009 == req.getElementType()) {
			return getGEFWrapper(new AppAppToNetworkNodeCreateCommand(req, req.getSource(), req.getTarget()));
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
		case HostHostSwitchEditPart.VISUAL_ID:
			return getGEFWrapper(new HostHostSwitchReorientCommand(req));
		case RuleSourceHostRuleEditPart.VISUAL_ID:
			return getGEFWrapper(new RuleSourceHostRuleReorientCommand(req));
		case RuleTargetHostRuleEditPart.VISUAL_ID:
			return getGEFWrapper(new RuleTargetHostRuleReorientCommand(req));
		case AppAppToNetworkNodeEditPart.VISUAL_ID:
			return getGEFWrapper(new AppAppToNetworkNodeReorientCommand(req));
		}
		return super.getReorientReferenceRelationshipCommand(req);
	}

}
