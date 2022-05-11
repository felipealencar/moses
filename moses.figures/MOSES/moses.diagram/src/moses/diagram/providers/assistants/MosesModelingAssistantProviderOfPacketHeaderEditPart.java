/*
 * 
 */
package moses.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

import moses.diagram.edit.parts.PacketHeaderEditPart;
import moses.diagram.providers.MosesElementTypes;
import moses.diagram.providers.MosesModelingAssistantProvider;

/**
 * @generated
 */
public class MosesModelingAssistantProviderOfPacketHeaderEditPart extends MosesModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnTarget((PacketHeaderEditPart) targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnTarget(PacketHeaderEditPart target) {
		List<IElementType> types = new ArrayList<IElementType>(2);
		types.add(MosesElementTypes.AppActionPacketHeader_4008);
		types.add(MosesElementTypes.ConditionConditionPacket_4014);
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForSource(IAdaptable target, IElementType relationshipType) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForSource((PacketHeaderEditPart) targetEditPart, relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForSource(PacketHeaderEditPart target, IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == MosesElementTypes.AppActionPacketHeader_4008) {
			types.add(MosesElementTypes.AppMonitor_2004);
			types.add(MosesElementTypes.App_2010);
		} else if (relationshipType == MosesElementTypes.ConditionConditionPacket_4014) {
			types.add(MosesElementTypes.Condition_2006);
		}
		return types;
	}

}
