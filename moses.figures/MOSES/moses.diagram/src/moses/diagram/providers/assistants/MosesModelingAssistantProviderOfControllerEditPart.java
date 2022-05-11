/*
 * 
 */
package moses.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

import moses.diagram.edit.parts.ControllerEditPart;
import moses.diagram.providers.MosesElementTypes;
import moses.diagram.providers.MosesModelingAssistantProvider;

/**
 * @generated
 */
public class MosesModelingAssistantProviderOfControllerEditPart extends MosesModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnTarget((ControllerEditPart) targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnTarget(ControllerEditPart target) {
		List<IElementType> types = new ArrayList<IElementType>(3);
		types.add(MosesElementTypes.SwitchSwitchController_4002);
		types.add(MosesElementTypes.AppAppToNetworkNode_4009);
		types.add(MosesElementTypes.AppControllerApp_4010);
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForSource(IAdaptable target, IElementType relationshipType) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForSource((ControllerEditPart) targetEditPart, relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForSource(ControllerEditPart target, IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == MosesElementTypes.SwitchSwitchController_4002) {
			types.add(MosesElementTypes.Switch_2003);
		} else if (relationshipType == MosesElementTypes.AppAppToNetworkNode_4009) {
			types.add(MosesElementTypes.AppMonitor_2004);
			types.add(MosesElementTypes.App_2010);
		} else if (relationshipType == MosesElementTypes.AppControllerApp_4010) {
			types.add(MosesElementTypes.AppMonitor_2004);
			types.add(MosesElementTypes.App_2010);
		}
		return types;
	}

}
