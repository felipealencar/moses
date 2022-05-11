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

import moses.diagram.edit.parts.ConditionEditPart;
import moses.diagram.edit.parts.GroupEditPart;
import moses.diagram.edit.parts.Host2EditPart;
import moses.diagram.edit.parts.HostEditPart;
import moses.diagram.edit.parts.RuleEditPart;
import moses.diagram.providers.MosesElementTypes;
import moses.diagram.providers.MosesModelingAssistantProvider;

/**
 * @generated
 */
public class MosesModelingAssistantProviderOfRuleEditPart extends MosesModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSource((RuleEditPart) sourceEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSource(RuleEditPart source) {
		List<IElementType> types = new ArrayList<IElementType>(4);
		types.add(MosesElementTypes.RuleSourceHostRule_4004);
		types.add(MosesElementTypes.RuleTargetHostRule_4005);
		types.add(MosesElementTypes.RuleRuleCondition_4006);
		types.add(MosesElementTypes.RuleTargetGroupRule_4007);
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnSourceAndTarget(IAdaptable source, IAdaptable target) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSourceAndTarget((RuleEditPart) sourceEditPart, targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSourceAndTarget(RuleEditPart source, IGraphicalEditPart targetEditPart) {
		List<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof HostEditPart) {
			types.add(MosesElementTypes.RuleSourceHostRule_4004);
		}
		if (targetEditPart instanceof Host2EditPart) {
			types.add(MosesElementTypes.RuleSourceHostRule_4004);
		}
		if (targetEditPart instanceof HostEditPart) {
			types.add(MosesElementTypes.RuleTargetHostRule_4005);
		}
		if (targetEditPart instanceof Host2EditPart) {
			types.add(MosesElementTypes.RuleTargetHostRule_4005);
		}
		if (targetEditPart instanceof ConditionEditPart) {
			types.add(MosesElementTypes.RuleRuleCondition_4006);
		}
		if (targetEditPart instanceof GroupEditPart) {
			types.add(MosesElementTypes.RuleTargetGroupRule_4007);
		}
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForTarget(IAdaptable source, IElementType relationshipType) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForTarget((RuleEditPart) sourceEditPart, relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForTarget(RuleEditPart source, IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == MosesElementTypes.RuleSourceHostRule_4004) {
			types.add(MosesElementTypes.Host_2002);
			types.add(MosesElementTypes.Host_3001);
		} else if (relationshipType == MosesElementTypes.RuleTargetHostRule_4005) {
			types.add(MosesElementTypes.Host_2002);
			types.add(MosesElementTypes.Host_3001);
		} else if (relationshipType == MosesElementTypes.RuleRuleCondition_4006) {
			types.add(MosesElementTypes.Condition_2006);
		} else if (relationshipType == MosesElementTypes.RuleTargetGroupRule_4007) {
			types.add(MosesElementTypes.Group_2011);
		}
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnTarget((RuleEditPart) targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnTarget(RuleEditPart target) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(MosesElementTypes.AppAppRule_4011);
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForSource(IAdaptable target, IElementType relationshipType) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForSource((RuleEditPart) targetEditPart, relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForSource(RuleEditPart target, IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == MosesElementTypes.AppAppRule_4011) {
			types.add(MosesElementTypes.AppMonitor_2004);
			types.add(MosesElementTypes.App_2010);
		}
		return types;
	}

}
