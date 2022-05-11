/*
* 
*/
package moses.diagram.part;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.update.DiagramUpdater;

import moses.App;
import moses.AppMonitor;
import moses.AppObject;
import moses.Condition;
import moses.Controller;
import moses.Group;
import moses.Host;
import moses.MosesPackage;
import moses.NetworkNode;
import moses.PacketHeader;
import moses.Rule;
import moses.Sdn;
import moses.Switch;
import moses.Time;
import moses.Traffic;
import moses.diagram.edit.parts.AppActionPacketHeaderEditPart;
import moses.diagram.edit.parts.AppAppRuleEditPart;
import moses.diagram.edit.parts.AppAppToNetworkNodeEditPart;
import moses.diagram.edit.parts.AppControllerAppEditPart;
import moses.diagram.edit.parts.AppEditPart;
import moses.diagram.edit.parts.AppMonitorEditPart;
import moses.diagram.edit.parts.ConditionConditionPacketEditPart;
import moses.diagram.edit.parts.ConditionConditionTimeEditPart;
import moses.diagram.edit.parts.ConditionConditionTrafficEditPart;
import moses.diagram.edit.parts.ConditionEditPart;
import moses.diagram.edit.parts.ControllerEditPart;
import moses.diagram.edit.parts.GroupEditPart;
import moses.diagram.edit.parts.GroupGroupHostsGroupCompartmentEditPart;
import moses.diagram.edit.parts.Host2EditPart;
import moses.diagram.edit.parts.HostEditPart;
import moses.diagram.edit.parts.HostHostSwitchEditPart;
import moses.diagram.edit.parts.PacketHeaderEditPart;
import moses.diagram.edit.parts.RuleEditPart;
import moses.diagram.edit.parts.RuleRuleConditionEditPart;
import moses.diagram.edit.parts.RuleSourceHostRuleEditPart;
import moses.diagram.edit.parts.RuleTargetGroupRuleEditPart;
import moses.diagram.edit.parts.RuleTargetHostRuleEditPart;
import moses.diagram.edit.parts.SdnEditPart;
import moses.diagram.edit.parts.SwitchEditPart;
import moses.diagram.edit.parts.SwitchSwitchControllerEditPart;
import moses.diagram.edit.parts.SwitchSwitchesEditPart;
import moses.diagram.edit.parts.TimeEditPart;
import moses.diagram.edit.parts.TrafficEditPart;
import moses.diagram.providers.MosesElementTypes;

/**
 * @generated
 */
public class MosesDiagramUpdater {

	/**
	* @generated
	*/
	public static boolean isShortcutOrphaned(View view) {
		return !view.isSetElement() || view.getElement() == null || view.getElement().eIsProxy();
	}

	/**
	* @generated
	*/
	public static List<MosesNodeDescriptor> getSemanticChildren(View view) {
		switch (MosesVisualIDRegistry.getVisualID(view)) {
		case SdnEditPart.VISUAL_ID:
			return getSdn_1000SemanticChildren(view);
		case GroupGroupHostsGroupCompartmentEditPart.VISUAL_ID:
			return getGroupGroupHostsGroupCompartment_7001SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<MosesNodeDescriptor> getSdn_1000SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		Sdn modelElement = (Sdn) view.getElement();
		LinkedList<MosesNodeDescriptor> result = new LinkedList<MosesNodeDescriptor>();
		for (Iterator<?> it = modelElement.getNodes().iterator(); it.hasNext();) {
			NetworkNode childElement = (NetworkNode) it.next();
			int visualID = MosesVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == ControllerEditPart.VISUAL_ID) {
				result.add(new MosesNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == HostEditPart.VISUAL_ID) {
				result.add(new MosesNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == SwitchEditPart.VISUAL_ID) {
				result.add(new MosesNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getApps().iterator(); it.hasNext();) {
			App childElement = (App) it.next();
			int visualID = MosesVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == AppMonitorEditPart.VISUAL_ID) {
				result.add(new MosesNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AppEditPart.VISUAL_ID) {
				result.add(new MosesNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getRuleObjects().iterator(); it.hasNext();) {
			AppObject childElement = (AppObject) it.next();
			int visualID = MosesVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == RuleEditPart.VISUAL_ID) {
				result.add(new MosesNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ConditionEditPart.VISUAL_ID) {
				result.add(new MosesNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == TrafficEditPart.VISUAL_ID) {
				result.add(new MosesNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == TimeEditPart.VISUAL_ID) {
				result.add(new MosesNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == PacketHeaderEditPart.VISUAL_ID) {
				result.add(new MosesNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getGroups().iterator(); it.hasNext();) {
			Group childElement = (Group) it.next();
			int visualID = MosesVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == GroupEditPart.VISUAL_ID) {
				result.add(new MosesNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<MosesNodeDescriptor> getGroupGroupHostsGroupCompartment_7001SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Group modelElement = (Group) containerView.getElement();
		LinkedList<MosesNodeDescriptor> result = new LinkedList<MosesNodeDescriptor>();
		for (Iterator<?> it = modelElement.getHostsGroup().iterator(); it.hasNext();) {
			Host childElement = (Host) it.next();
			int visualID = MosesVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Host2EditPart.VISUAL_ID) {
				result.add(new MosesNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<MosesLinkDescriptor> getContainedLinks(View view) {
		switch (MosesVisualIDRegistry.getVisualID(view)) {
		case SdnEditPart.VISUAL_ID:
			return getSdn_1000ContainedLinks(view);
		case ControllerEditPart.VISUAL_ID:
			return getController_2001ContainedLinks(view);
		case HostEditPart.VISUAL_ID:
			return getHost_2002ContainedLinks(view);
		case SwitchEditPart.VISUAL_ID:
			return getSwitch_2003ContainedLinks(view);
		case AppMonitorEditPart.VISUAL_ID:
			return getAppMonitor_2004ContainedLinks(view);
		case RuleEditPart.VISUAL_ID:
			return getRule_2005ContainedLinks(view);
		case ConditionEditPart.VISUAL_ID:
			return getCondition_2006ContainedLinks(view);
		case TrafficEditPart.VISUAL_ID:
			return getTraffic_2007ContainedLinks(view);
		case TimeEditPart.VISUAL_ID:
			return getTime_2008ContainedLinks(view);
		case PacketHeaderEditPart.VISUAL_ID:
			return getPacketHeader_2009ContainedLinks(view);
		case AppEditPart.VISUAL_ID:
			return getApp_2010ContainedLinks(view);
		case GroupEditPart.VISUAL_ID:
			return getGroup_2011ContainedLinks(view);
		case Host2EditPart.VISUAL_ID:
			return getHost_3001ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<MosesLinkDescriptor> getIncomingLinks(View view) {
		switch (MosesVisualIDRegistry.getVisualID(view)) {
		case ControllerEditPart.VISUAL_ID:
			return getController_2001IncomingLinks(view);
		case HostEditPart.VISUAL_ID:
			return getHost_2002IncomingLinks(view);
		case SwitchEditPart.VISUAL_ID:
			return getSwitch_2003IncomingLinks(view);
		case AppMonitorEditPart.VISUAL_ID:
			return getAppMonitor_2004IncomingLinks(view);
		case RuleEditPart.VISUAL_ID:
			return getRule_2005IncomingLinks(view);
		case ConditionEditPart.VISUAL_ID:
			return getCondition_2006IncomingLinks(view);
		case TrafficEditPart.VISUAL_ID:
			return getTraffic_2007IncomingLinks(view);
		case TimeEditPart.VISUAL_ID:
			return getTime_2008IncomingLinks(view);
		case PacketHeaderEditPart.VISUAL_ID:
			return getPacketHeader_2009IncomingLinks(view);
		case AppEditPart.VISUAL_ID:
			return getApp_2010IncomingLinks(view);
		case GroupEditPart.VISUAL_ID:
			return getGroup_2011IncomingLinks(view);
		case Host2EditPart.VISUAL_ID:
			return getHost_3001IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<MosesLinkDescriptor> getOutgoingLinks(View view) {
		switch (MosesVisualIDRegistry.getVisualID(view)) {
		case ControllerEditPart.VISUAL_ID:
			return getController_2001OutgoingLinks(view);
		case HostEditPart.VISUAL_ID:
			return getHost_2002OutgoingLinks(view);
		case SwitchEditPart.VISUAL_ID:
			return getSwitch_2003OutgoingLinks(view);
		case AppMonitorEditPart.VISUAL_ID:
			return getAppMonitor_2004OutgoingLinks(view);
		case RuleEditPart.VISUAL_ID:
			return getRule_2005OutgoingLinks(view);
		case ConditionEditPart.VISUAL_ID:
			return getCondition_2006OutgoingLinks(view);
		case TrafficEditPart.VISUAL_ID:
			return getTraffic_2007OutgoingLinks(view);
		case TimeEditPart.VISUAL_ID:
			return getTime_2008OutgoingLinks(view);
		case PacketHeaderEditPart.VISUAL_ID:
			return getPacketHeader_2009OutgoingLinks(view);
		case AppEditPart.VISUAL_ID:
			return getApp_2010OutgoingLinks(view);
		case GroupEditPart.VISUAL_ID:
			return getGroup_2011OutgoingLinks(view);
		case Host2EditPart.VISUAL_ID:
			return getHost_3001OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MosesLinkDescriptor> getSdn_1000ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MosesLinkDescriptor> getController_2001ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MosesLinkDescriptor> getHost_2002ContainedLinks(View view) {
		Host modelElement = (Host) view.getElement();
		LinkedList<MosesLinkDescriptor> result = new LinkedList<MosesLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Host_HostSwitch_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<MosesLinkDescriptor> getSwitch_2003ContainedLinks(View view) {
		Switch modelElement = (Switch) view.getElement();
		LinkedList<MosesLinkDescriptor> result = new LinkedList<MosesLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Switch_SwitchController_4002(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Switch_Switches_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<MosesLinkDescriptor> getAppMonitor_2004ContainedLinks(View view) {
		AppMonitor modelElement = (AppMonitor) view.getElement();
		LinkedList<MosesLinkDescriptor> result = new LinkedList<MosesLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_App_ActionPacketHeader_4008(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_App_AppToNetworkNode_4009(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_App_ControllerApp_4010(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_App_AppRule_4011(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<MosesLinkDescriptor> getRule_2005ContainedLinks(View view) {
		Rule modelElement = (Rule) view.getElement();
		LinkedList<MosesLinkDescriptor> result = new LinkedList<MosesLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Rule_SourceHostRule_4004(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Rule_TargetHostRule_4005(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Rule_RuleCondition_4006(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Rule_TargetGroupRule_4007(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<MosesLinkDescriptor> getCondition_2006ContainedLinks(View view) {
		Condition modelElement = (Condition) view.getElement();
		LinkedList<MosesLinkDescriptor> result = new LinkedList<MosesLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Condition_ConditionTime_4012(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Condition_ConditionTraffic_4013(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Condition_ConditionPacket_4014(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<MosesLinkDescriptor> getTraffic_2007ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MosesLinkDescriptor> getTime_2008ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MosesLinkDescriptor> getPacketHeader_2009ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MosesLinkDescriptor> getApp_2010ContainedLinks(View view) {
		App modelElement = (App) view.getElement();
		LinkedList<MosesLinkDescriptor> result = new LinkedList<MosesLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_App_ActionPacketHeader_4008(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_App_AppToNetworkNode_4009(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_App_ControllerApp_4010(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_App_AppRule_4011(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<MosesLinkDescriptor> getGroup_2011ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MosesLinkDescriptor> getHost_3001ContainedLinks(View view) {
		Host modelElement = (Host) view.getElement();
		LinkedList<MosesLinkDescriptor> result = new LinkedList<MosesLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Host_HostSwitch_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<MosesLinkDescriptor> getController_2001IncomingLinks(View view) {
		Controller modelElement = (Controller) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<MosesLinkDescriptor> result = new LinkedList<MosesLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Switch_SwitchController_4002(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_App_AppToNetworkNode_4009(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_App_ControllerApp_4010(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<MosesLinkDescriptor> getHost_2002IncomingLinks(View view) {
		Host modelElement = (Host) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<MosesLinkDescriptor> result = new LinkedList<MosesLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Rule_SourceHostRule_4004(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Rule_TargetHostRule_4005(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_App_AppToNetworkNode_4009(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<MosesLinkDescriptor> getSwitch_2003IncomingLinks(View view) {
		Switch modelElement = (Switch) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<MosesLinkDescriptor> result = new LinkedList<MosesLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Host_HostSwitch_4001(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Switch_Switches_4003(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_App_AppToNetworkNode_4009(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<MosesLinkDescriptor> getAppMonitor_2004IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MosesLinkDescriptor> getRule_2005IncomingLinks(View view) {
		Rule modelElement = (Rule) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<MosesLinkDescriptor> result = new LinkedList<MosesLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_App_AppRule_4011(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<MosesLinkDescriptor> getCondition_2006IncomingLinks(View view) {
		Condition modelElement = (Condition) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<MosesLinkDescriptor> result = new LinkedList<MosesLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Rule_RuleCondition_4006(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<MosesLinkDescriptor> getTraffic_2007IncomingLinks(View view) {
		Traffic modelElement = (Traffic) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<MosesLinkDescriptor> result = new LinkedList<MosesLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Condition_ConditionTraffic_4013(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<MosesLinkDescriptor> getTime_2008IncomingLinks(View view) {
		Time modelElement = (Time) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<MosesLinkDescriptor> result = new LinkedList<MosesLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Condition_ConditionTime_4012(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<MosesLinkDescriptor> getPacketHeader_2009IncomingLinks(View view) {
		PacketHeader modelElement = (PacketHeader) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<MosesLinkDescriptor> result = new LinkedList<MosesLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_App_ActionPacketHeader_4008(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Condition_ConditionPacket_4014(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<MosesLinkDescriptor> getApp_2010IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MosesLinkDescriptor> getGroup_2011IncomingLinks(View view) {
		Group modelElement = (Group) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<MosesLinkDescriptor> result = new LinkedList<MosesLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Rule_TargetGroupRule_4007(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<MosesLinkDescriptor> getHost_3001IncomingLinks(View view) {
		Host modelElement = (Host) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<MosesLinkDescriptor> result = new LinkedList<MosesLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Rule_SourceHostRule_4004(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Rule_TargetHostRule_4005(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_App_AppToNetworkNode_4009(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<MosesLinkDescriptor> getController_2001OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MosesLinkDescriptor> getHost_2002OutgoingLinks(View view) {
		Host modelElement = (Host) view.getElement();
		LinkedList<MosesLinkDescriptor> result = new LinkedList<MosesLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Host_HostSwitch_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<MosesLinkDescriptor> getSwitch_2003OutgoingLinks(View view) {
		Switch modelElement = (Switch) view.getElement();
		LinkedList<MosesLinkDescriptor> result = new LinkedList<MosesLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Switch_SwitchController_4002(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Switch_Switches_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<MosesLinkDescriptor> getAppMonitor_2004OutgoingLinks(View view) {
		AppMonitor modelElement = (AppMonitor) view.getElement();
		LinkedList<MosesLinkDescriptor> result = new LinkedList<MosesLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_App_ActionPacketHeader_4008(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_App_AppToNetworkNode_4009(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_App_ControllerApp_4010(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_App_AppRule_4011(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<MosesLinkDescriptor> getRule_2005OutgoingLinks(View view) {
		Rule modelElement = (Rule) view.getElement();
		LinkedList<MosesLinkDescriptor> result = new LinkedList<MosesLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Rule_SourceHostRule_4004(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Rule_TargetHostRule_4005(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Rule_RuleCondition_4006(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Rule_TargetGroupRule_4007(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<MosesLinkDescriptor> getCondition_2006OutgoingLinks(View view) {
		Condition modelElement = (Condition) view.getElement();
		LinkedList<MosesLinkDescriptor> result = new LinkedList<MosesLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Condition_ConditionTime_4012(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Condition_ConditionTraffic_4013(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Condition_ConditionPacket_4014(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<MosesLinkDescriptor> getTraffic_2007OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MosesLinkDescriptor> getTime_2008OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MosesLinkDescriptor> getPacketHeader_2009OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MosesLinkDescriptor> getApp_2010OutgoingLinks(View view) {
		App modelElement = (App) view.getElement();
		LinkedList<MosesLinkDescriptor> result = new LinkedList<MosesLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_App_ActionPacketHeader_4008(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_App_AppToNetworkNode_4009(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_App_ControllerApp_4010(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_App_AppRule_4011(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<MosesLinkDescriptor> getGroup_2011OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MosesLinkDescriptor> getHost_3001OutgoingLinks(View view) {
		Host modelElement = (Host) view.getElement();
		LinkedList<MosesLinkDescriptor> result = new LinkedList<MosesLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Host_HostSwitch_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<MosesLinkDescriptor> getIncomingFeatureModelFacetLinks_Host_HostSwitch_4001(Switch target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<MosesLinkDescriptor> result = new LinkedList<MosesLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == MosesPackage.eINSTANCE.getHost_HostSwitch()) {
				result.add(new MosesLinkDescriptor(setting.getEObject(), target, MosesElementTypes.HostHostSwitch_4001,
						HostHostSwitchEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<MosesLinkDescriptor> getIncomingFeatureModelFacetLinks_Switch_SwitchController_4002(
			Controller target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<MosesLinkDescriptor> result = new LinkedList<MosesLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == MosesPackage.eINSTANCE.getSwitch_SwitchController()) {
				result.add(new MosesLinkDescriptor(setting.getEObject(), target,
						MosesElementTypes.SwitchSwitchController_4002, SwitchSwitchControllerEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<MosesLinkDescriptor> getIncomingFeatureModelFacetLinks_Switch_Switches_4003(Switch target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<MosesLinkDescriptor> result = new LinkedList<MosesLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == MosesPackage.eINSTANCE.getSwitch_Switches()) {
				result.add(new MosesLinkDescriptor(setting.getEObject(), target, MosesElementTypes.SwitchSwitches_4003,
						SwitchSwitchesEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<MosesLinkDescriptor> getIncomingFeatureModelFacetLinks_Rule_SourceHostRule_4004(
			Host target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<MosesLinkDescriptor> result = new LinkedList<MosesLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == MosesPackage.eINSTANCE.getRule_SourceHostRule()) {
				result.add(new MosesLinkDescriptor(setting.getEObject(), target,
						MosesElementTypes.RuleSourceHostRule_4004, RuleSourceHostRuleEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<MosesLinkDescriptor> getIncomingFeatureModelFacetLinks_Rule_TargetHostRule_4005(
			Host target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<MosesLinkDescriptor> result = new LinkedList<MosesLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == MosesPackage.eINSTANCE.getRule_TargetHostRule()) {
				result.add(new MosesLinkDescriptor(setting.getEObject(), target,
						MosesElementTypes.RuleTargetHostRule_4005, RuleTargetHostRuleEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<MosesLinkDescriptor> getIncomingFeatureModelFacetLinks_Rule_RuleCondition_4006(
			Condition target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<MosesLinkDescriptor> result = new LinkedList<MosesLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == MosesPackage.eINSTANCE.getRule_RuleCondition()) {
				result.add(new MosesLinkDescriptor(setting.getEObject(), target,
						MosesElementTypes.RuleRuleCondition_4006, RuleRuleConditionEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<MosesLinkDescriptor> getIncomingFeatureModelFacetLinks_Rule_TargetGroupRule_4007(
			Group target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<MosesLinkDescriptor> result = new LinkedList<MosesLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == MosesPackage.eINSTANCE.getRule_TargetGroupRule()) {
				result.add(new MosesLinkDescriptor(setting.getEObject(), target,
						MosesElementTypes.RuleTargetGroupRule_4007, RuleTargetGroupRuleEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<MosesLinkDescriptor> getIncomingFeatureModelFacetLinks_App_ActionPacketHeader_4008(
			PacketHeader target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<MosesLinkDescriptor> result = new LinkedList<MosesLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == MosesPackage.eINSTANCE.getApp_ActionPacketHeader()) {
				result.add(new MosesLinkDescriptor(setting.getEObject(), target,
						MosesElementTypes.AppActionPacketHeader_4008, AppActionPacketHeaderEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<MosesLinkDescriptor> getIncomingFeatureModelFacetLinks_App_AppToNetworkNode_4009(
			NetworkNode target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<MosesLinkDescriptor> result = new LinkedList<MosesLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == MosesPackage.eINSTANCE.getApp_AppToNetworkNode()) {
				result.add(new MosesLinkDescriptor(setting.getEObject(), target,
						MosesElementTypes.AppAppToNetworkNode_4009, AppAppToNetworkNodeEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<MosesLinkDescriptor> getIncomingFeatureModelFacetLinks_App_ControllerApp_4010(
			Controller target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<MosesLinkDescriptor> result = new LinkedList<MosesLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == MosesPackage.eINSTANCE.getApp_ControllerApp()) {
				result.add(new MosesLinkDescriptor(setting.getEObject(), target,
						MosesElementTypes.AppControllerApp_4010, AppControllerAppEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<MosesLinkDescriptor> getIncomingFeatureModelFacetLinks_App_AppRule_4011(Rule target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<MosesLinkDescriptor> result = new LinkedList<MosesLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == MosesPackage.eINSTANCE.getApp_AppRule()) {
				result.add(new MosesLinkDescriptor(setting.getEObject(), target, MosesElementTypes.AppAppRule_4011,
						AppAppRuleEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<MosesLinkDescriptor> getIncomingFeatureModelFacetLinks_Condition_ConditionTime_4012(
			Time target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<MosesLinkDescriptor> result = new LinkedList<MosesLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == MosesPackage.eINSTANCE.getCondition_ConditionTime()) {
				result.add(new MosesLinkDescriptor(setting.getEObject(), target,
						MosesElementTypes.ConditionConditionTime_4012, ConditionConditionTimeEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<MosesLinkDescriptor> getIncomingFeatureModelFacetLinks_Condition_ConditionTraffic_4013(
			Traffic target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<MosesLinkDescriptor> result = new LinkedList<MosesLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == MosesPackage.eINSTANCE.getCondition_ConditionTraffic()) {
				result.add(new MosesLinkDescriptor(setting.getEObject(), target,
						MosesElementTypes.ConditionConditionTraffic_4013, ConditionConditionTrafficEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<MosesLinkDescriptor> getIncomingFeatureModelFacetLinks_Condition_ConditionPacket_4014(
			PacketHeader target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<MosesLinkDescriptor> result = new LinkedList<MosesLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == MosesPackage.eINSTANCE.getCondition_ConditionPacket()) {
				result.add(new MosesLinkDescriptor(setting.getEObject(), target,
						MosesElementTypes.ConditionConditionPacket_4014, ConditionConditionPacketEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<MosesLinkDescriptor> getOutgoingFeatureModelFacetLinks_Host_HostSwitch_4001(Host source) {
		LinkedList<MosesLinkDescriptor> result = new LinkedList<MosesLinkDescriptor>();
		Switch destination = source.getHostSwitch();
		if (destination == null) {
			return result;
		}
		result.add(new MosesLinkDescriptor(source, destination, MosesElementTypes.HostHostSwitch_4001,
				HostHostSwitchEditPart.VISUAL_ID));
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<MosesLinkDescriptor> getOutgoingFeatureModelFacetLinks_Switch_SwitchController_4002(
			Switch source) {
		LinkedList<MosesLinkDescriptor> result = new LinkedList<MosesLinkDescriptor>();
		for (Iterator<?> destinations = source.getSwitchController().iterator(); destinations.hasNext();) {
			Controller destination = (Controller) destinations.next();
			result.add(new MosesLinkDescriptor(source, destination, MosesElementTypes.SwitchSwitchController_4002,
					SwitchSwitchControllerEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<MosesLinkDescriptor> getOutgoingFeatureModelFacetLinks_Switch_Switches_4003(
			Switch source) {
		LinkedList<MosesLinkDescriptor> result = new LinkedList<MosesLinkDescriptor>();
		for (Iterator<?> destinations = source.getSwitches().iterator(); destinations.hasNext();) {
			Switch destination = (Switch) destinations.next();
			result.add(new MosesLinkDescriptor(source, destination, MosesElementTypes.SwitchSwitches_4003,
					SwitchSwitchesEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<MosesLinkDescriptor> getOutgoingFeatureModelFacetLinks_Rule_SourceHostRule_4004(
			Rule source) {
		LinkedList<MosesLinkDescriptor> result = new LinkedList<MosesLinkDescriptor>();
		for (Iterator<?> destinations = source.getSourceHostRule().iterator(); destinations.hasNext();) {
			Host destination = (Host) destinations.next();
			result.add(new MosesLinkDescriptor(source, destination, MosesElementTypes.RuleSourceHostRule_4004,
					RuleSourceHostRuleEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<MosesLinkDescriptor> getOutgoingFeatureModelFacetLinks_Rule_TargetHostRule_4005(
			Rule source) {
		LinkedList<MosesLinkDescriptor> result = new LinkedList<MosesLinkDescriptor>();
		for (Iterator<?> destinations = source.getTargetHostRule().iterator(); destinations.hasNext();) {
			Host destination = (Host) destinations.next();
			result.add(new MosesLinkDescriptor(source, destination, MosesElementTypes.RuleTargetHostRule_4005,
					RuleTargetHostRuleEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<MosesLinkDescriptor> getOutgoingFeatureModelFacetLinks_Rule_RuleCondition_4006(
			Rule source) {
		LinkedList<MosesLinkDescriptor> result = new LinkedList<MosesLinkDescriptor>();
		for (Iterator<?> destinations = source.getRuleCondition().iterator(); destinations.hasNext();) {
			Condition destination = (Condition) destinations.next();
			result.add(new MosesLinkDescriptor(source, destination, MosesElementTypes.RuleRuleCondition_4006,
					RuleRuleConditionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<MosesLinkDescriptor> getOutgoingFeatureModelFacetLinks_Rule_TargetGroupRule_4007(
			Rule source) {
		LinkedList<MosesLinkDescriptor> result = new LinkedList<MosesLinkDescriptor>();
		for (Iterator<?> destinations = source.getTargetGroupRule().iterator(); destinations.hasNext();) {
			Group destination = (Group) destinations.next();
			result.add(new MosesLinkDescriptor(source, destination, MosesElementTypes.RuleTargetGroupRule_4007,
					RuleTargetGroupRuleEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<MosesLinkDescriptor> getOutgoingFeatureModelFacetLinks_App_ActionPacketHeader_4008(
			App source) {
		LinkedList<MosesLinkDescriptor> result = new LinkedList<MosesLinkDescriptor>();
		for (Iterator<?> destinations = source.getActionPacketHeader().iterator(); destinations.hasNext();) {
			PacketHeader destination = (PacketHeader) destinations.next();
			result.add(new MosesLinkDescriptor(source, destination, MosesElementTypes.AppActionPacketHeader_4008,
					AppActionPacketHeaderEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<MosesLinkDescriptor> getOutgoingFeatureModelFacetLinks_App_AppToNetworkNode_4009(
			App source) {
		LinkedList<MosesLinkDescriptor> result = new LinkedList<MosesLinkDescriptor>();
		NetworkNode destination = source.getAppToNetworkNode();
		if (destination == null) {
			return result;
		}
		result.add(new MosesLinkDescriptor(source, destination, MosesElementTypes.AppAppToNetworkNode_4009,
				AppAppToNetworkNodeEditPart.VISUAL_ID));
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<MosesLinkDescriptor> getOutgoingFeatureModelFacetLinks_App_ControllerApp_4010(
			App source) {
		LinkedList<MosesLinkDescriptor> result = new LinkedList<MosesLinkDescriptor>();
		for (Iterator<?> destinations = source.getControllerApp().iterator(); destinations.hasNext();) {
			Controller destination = (Controller) destinations.next();
			result.add(new MosesLinkDescriptor(source, destination, MosesElementTypes.AppControllerApp_4010,
					AppControllerAppEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<MosesLinkDescriptor> getOutgoingFeatureModelFacetLinks_App_AppRule_4011(App source) {
		LinkedList<MosesLinkDescriptor> result = new LinkedList<MosesLinkDescriptor>();
		for (Iterator<?> destinations = source.getAppRule().iterator(); destinations.hasNext();) {
			Rule destination = (Rule) destinations.next();
			result.add(new MosesLinkDescriptor(source, destination, MosesElementTypes.AppAppRule_4011,
					AppAppRuleEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<MosesLinkDescriptor> getOutgoingFeatureModelFacetLinks_Condition_ConditionTime_4012(
			Condition source) {
		LinkedList<MosesLinkDescriptor> result = new LinkedList<MosesLinkDescriptor>();
		Time destination = source.getConditionTime();
		if (destination == null) {
			return result;
		}
		result.add(new MosesLinkDescriptor(source, destination, MosesElementTypes.ConditionConditionTime_4012,
				ConditionConditionTimeEditPart.VISUAL_ID));
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<MosesLinkDescriptor> getOutgoingFeatureModelFacetLinks_Condition_ConditionTraffic_4013(
			Condition source) {
		LinkedList<MosesLinkDescriptor> result = new LinkedList<MosesLinkDescriptor>();
		Traffic destination = source.getConditionTraffic();
		if (destination == null) {
			return result;
		}
		result.add(new MosesLinkDescriptor(source, destination, MosesElementTypes.ConditionConditionTraffic_4013,
				ConditionConditionTrafficEditPart.VISUAL_ID));
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<MosesLinkDescriptor> getOutgoingFeatureModelFacetLinks_Condition_ConditionPacket_4014(
			Condition source) {
		LinkedList<MosesLinkDescriptor> result = new LinkedList<MosesLinkDescriptor>();
		PacketHeader destination = source.getConditionPacket();
		if (destination == null) {
			return result;
		}
		result.add(new MosesLinkDescriptor(source, destination, MosesElementTypes.ConditionConditionPacket_4014,
				ConditionConditionPacketEditPart.VISUAL_ID));
		return result;
	}

	/**
	* @generated
	*/
	public static final DiagramUpdater TYPED_INSTANCE = new DiagramUpdater() {
		/**
		* @generated
		*/
		@Override

		public List<MosesNodeDescriptor> getSemanticChildren(View view) {
			return MosesDiagramUpdater.getSemanticChildren(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<MosesLinkDescriptor> getContainedLinks(View view) {
			return MosesDiagramUpdater.getContainedLinks(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<MosesLinkDescriptor> getIncomingLinks(View view) {
			return MosesDiagramUpdater.getIncomingLinks(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<MosesLinkDescriptor> getOutgoingLinks(View view) {
			return MosesDiagramUpdater.getOutgoingLinks(view);
		}
	};

}
