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

import moses.diagram.edit.parts.AppMonitorEditPart;
import moses.diagram.edit.parts.ControllerEditPart;
import moses.diagram.edit.parts.Host2EditPart;
import moses.diagram.edit.parts.HostEditPart;
import moses.diagram.edit.parts.PacketHeaderEditPart;
import moses.diagram.edit.parts.RuleEditPart;
import moses.diagram.edit.parts.SwitchEditPart;
import moses.diagram.providers.MosesElementTypes;
import moses.diagram.providers.MosesModelingAssistantProvider;

/**
 * @generated
 */
public class MosesModelingAssistantProviderOfAppMonitorEditPart extends MosesModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSource((AppMonitorEditPart) sourceEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSource(AppMonitorEditPart source) {
		List<IElementType> types = new ArrayList<IElementType>(4);
		types.add(MosesElementTypes.AppActionPacketHeader_4008);
		types.add(MosesElementTypes.AppAppToNetworkNode_4009);
		types.add(MosesElementTypes.AppControllerApp_4010);
		types.add(MosesElementTypes.AppAppRule_4011);
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnSourceAndTarget(IAdaptable source, IAdaptable target) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSourceAndTarget((AppMonitorEditPart) sourceEditPart, targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSourceAndTarget(AppMonitorEditPart source,
			IGraphicalEditPart targetEditPart) {
		List<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof PacketHeaderEditPart) {
			types.add(MosesElementTypes.AppActionPacketHeader_4008);
		}
		if (targetEditPart instanceof ControllerEditPart) {
			types.add(MosesElementTypes.AppAppToNetworkNode_4009);
		}
		if (targetEditPart instanceof HostEditPart) {
			types.add(MosesElementTypes.AppAppToNetworkNode_4009);
		}
		if (targetEditPart instanceof SwitchEditPart) {
			types.add(MosesElementTypes.AppAppToNetworkNode_4009);
		}
		if (targetEditPart instanceof Host2EditPart) {
			types.add(MosesElementTypes.AppAppToNetworkNode_4009);
		}
		if (targetEditPart instanceof ControllerEditPart) {
			types.add(MosesElementTypes.AppControllerApp_4010);
		}
		if (targetEditPart instanceof RuleEditPart) {
			types.add(MosesElementTypes.AppAppRule_4011);
		}
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForTarget(IAdaptable source, IElementType relationshipType) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForTarget((AppMonitorEditPart) sourceEditPart, relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForTarget(AppMonitorEditPart source, IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == MosesElementTypes.AppActionPacketHeader_4008) {
			types.add(MosesElementTypes.PacketHeader_2009);
		} else if (relationshipType == MosesElementTypes.AppAppToNetworkNode_4009) {
			types.add(MosesElementTypes.Controller_2001);
			types.add(MosesElementTypes.Host_2002);
			types.add(MosesElementTypes.Switch_2003);
			types.add(MosesElementTypes.Host_3001);
		} else if (relationshipType == MosesElementTypes.AppControllerApp_4010) {
			types.add(MosesElementTypes.Controller_2001);
		} else if (relationshipType == MosesElementTypes.AppAppRule_4011) {
			types.add(MosesElementTypes.Rule_2005);
		}
		return types;
	}

}
