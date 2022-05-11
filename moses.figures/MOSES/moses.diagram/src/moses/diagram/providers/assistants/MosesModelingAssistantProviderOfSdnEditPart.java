/*
 * 
 */
package moses.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

import moses.diagram.providers.MosesElementTypes;
import moses.diagram.providers.MosesModelingAssistantProvider;

/**
 * @generated
 */
public class MosesModelingAssistantProviderOfSdnEditPart extends MosesModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForPopupBar(IAdaptable host) {
		List<IElementType> types = new ArrayList<IElementType>(11);
		types.add(MosesElementTypes.Controller_2001);
		types.add(MosesElementTypes.Host_2002);
		types.add(MosesElementTypes.Switch_2003);
		types.add(MosesElementTypes.AppMonitor_2004);
		types.add(MosesElementTypes.Rule_2005);
		types.add(MosesElementTypes.Condition_2006);
		types.add(MosesElementTypes.Traffic_2007);
		types.add(MosesElementTypes.Time_2008);
		types.add(MosesElementTypes.PacketHeader_2009);
		types.add(MosesElementTypes.App_2010);
		types.add(MosesElementTypes.Group_2011);
		return types;
	}

}
