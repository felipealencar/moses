/*
 * 
 */
package moses.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

import moses.diagram.edit.parts.Host2EditPart;
import moses.diagram.edit.parts.SwitchEditPart;
import moses.diagram.providers.MosesElementTypes;
import moses.diagram.providers.MosesModelingAssistantProvider;

/**
 * @generated
 */
public class MosesModelingAssistantProviderOfHost2EditPart extends MosesModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSource((Host2EditPart) sourceEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSource(Host2EditPart source) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(MosesElementTypes.HostHostSwitch_4001);
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnSourceAndTarget(IAdaptable source, IAdaptable target) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSourceAndTarget((Host2EditPart) sourceEditPart, targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSourceAndTarget(Host2EditPart source, IGraphicalEditPart targetEditPart) {
		List<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof SwitchEditPart) {
			types.add(MosesElementTypes.HostHostSwitch_4001);
		}
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForTarget(IAdaptable source, IElementType relationshipType) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForTarget((Host2EditPart) sourceEditPart, relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForTarget(Host2EditPart source, IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == MosesElementTypes.HostHostSwitch_4001) {
			types.add(MosesElementTypes.Switch_2003);
		}
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnTarget((Host2EditPart) targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnTarget(Host2EditPart target) {
		List<IElementType> types = new ArrayList<IElementType>(3);
		types.add(MosesElementTypes.RuleSourceHostRule_4004);
		types.add(MosesElementTypes.RuleTargetHostRule_4005);
		types.add(MosesElementTypes.AppAppToNetworkNode_4009);
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForSource(IAdaptable target, IElementType relationshipType) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForSource((Host2EditPart) targetEditPart, relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForSource(Host2EditPart target, IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == MosesElementTypes.RuleSourceHostRule_4004) {
			types.add(MosesElementTypes.Rule_2005);
		} else if (relationshipType == MosesElementTypes.RuleTargetHostRule_4005) {
			types.add(MosesElementTypes.Rule_2005);
		} else if (relationshipType == MosesElementTypes.AppAppToNetworkNode_4009) {
			types.add(MosesElementTypes.AppMonitor_2004);
			types.add(MosesElementTypes.App_2010);
		}
		return types;
	}

}
