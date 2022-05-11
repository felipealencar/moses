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

import moses.diagram.edit.parts.ControllerEditPart;
import moses.diagram.edit.parts.SwitchEditPart;
import moses.diagram.providers.MosesElementTypes;
import moses.diagram.providers.MosesModelingAssistantProvider;

/**
 * @generated
 */
public class MosesModelingAssistantProviderOfSwitchEditPart extends MosesModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSource((SwitchEditPart) sourceEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSource(SwitchEditPart source) {
		List<IElementType> types = new ArrayList<IElementType>(2);
		types.add(MosesElementTypes.SwitchSwitchController_4002);
		types.add(MosesElementTypes.SwitchSwitches_4003);
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnSourceAndTarget(IAdaptable source, IAdaptable target) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSourceAndTarget((SwitchEditPart) sourceEditPart, targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSourceAndTarget(SwitchEditPart source, IGraphicalEditPart targetEditPart) {
		List<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof ControllerEditPart) {
			types.add(MosesElementTypes.SwitchSwitchController_4002);
		}
		if (targetEditPart instanceof SwitchEditPart) {
			types.add(MosesElementTypes.SwitchSwitches_4003);
		}
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForTarget(IAdaptable source, IElementType relationshipType) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForTarget((SwitchEditPart) sourceEditPart, relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForTarget(SwitchEditPart source, IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == MosesElementTypes.SwitchSwitchController_4002) {
			types.add(MosesElementTypes.Controller_2001);
		} else if (relationshipType == MosesElementTypes.SwitchSwitches_4003) {
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
		return doGetRelTypesOnTarget((SwitchEditPart) targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnTarget(SwitchEditPart target) {
		List<IElementType> types = new ArrayList<IElementType>(3);
		types.add(MosesElementTypes.HostHostSwitch_4001);
		types.add(MosesElementTypes.SwitchSwitches_4003);
		types.add(MosesElementTypes.AppAppToNetworkNode_4009);
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForSource(IAdaptable target, IElementType relationshipType) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForSource((SwitchEditPart) targetEditPart, relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForSource(SwitchEditPart target, IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == MosesElementTypes.HostHostSwitch_4001) {
			types.add(MosesElementTypes.Host_2002);
			types.add(MosesElementTypes.Host_3001);
		} else if (relationshipType == MosesElementTypes.SwitchSwitches_4003) {
			types.add(MosesElementTypes.Switch_2003);
		} else if (relationshipType == MosesElementTypes.AppAppToNetworkNode_4009) {
			types.add(MosesElementTypes.AppMonitor_2004);
			types.add(MosesElementTypes.App_2010);
		}
		return types;
	}

}
