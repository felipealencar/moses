/*
* 
*/
package moses.diagram.part;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.structure.DiagramStructure;

import moses.MosesPackage;
import moses.Sdn;
import moses.diagram.edit.parts.AppActionPacketHeaderEditPart;
import moses.diagram.edit.parts.AppAppRuleEditPart;
import moses.diagram.edit.parts.AppAppToNetworkNodeEditPart;
import moses.diagram.edit.parts.AppControllerAppEditPart;
import moses.diagram.edit.parts.AppEditPart;
import moses.diagram.edit.parts.AppMonitorEditPart;
import moses.diagram.edit.parts.AppMonitorNameEditPart;
import moses.diagram.edit.parts.AppNameEditPart;
import moses.diagram.edit.parts.ConditionConditionEditPart;
import moses.diagram.edit.parts.ConditionConditionPacketEditPart;
import moses.diagram.edit.parts.ConditionConditionTimeEditPart;
import moses.diagram.edit.parts.ConditionConditionTrafficEditPart;
import moses.diagram.edit.parts.ConditionEditPart;
import moses.diagram.edit.parts.ControllerEditPart;
import moses.diagram.edit.parts.ControllerNameEditPart;
import moses.diagram.edit.parts.GroupEditPart;
import moses.diagram.edit.parts.GroupGroupHostsGroupCompartmentEditPart;
import moses.diagram.edit.parts.GroupNameEditPart;
import moses.diagram.edit.parts.Host2EditPart;
import moses.diagram.edit.parts.HostEditPart;
import moses.diagram.edit.parts.HostHostSwitchEditPart;
import moses.diagram.edit.parts.HostName2EditPart;
import moses.diagram.edit.parts.HostNameEditPart;
import moses.diagram.edit.parts.PacketHeaderEditPart;
import moses.diagram.edit.parts.PacketHeaderOperatorHeaderValueEditPart;
import moses.diagram.edit.parts.RuleEditPart;
import moses.diagram.edit.parts.RuleNameEditPart;
import moses.diagram.edit.parts.RuleRuleConditionEditPart;
import moses.diagram.edit.parts.RuleSourceHostRuleEditPart;
import moses.diagram.edit.parts.RuleTargetGroupRuleEditPart;
import moses.diagram.edit.parts.RuleTargetHostRuleEditPart;
import moses.diagram.edit.parts.SdnEditPart;
import moses.diagram.edit.parts.SwitchEditPart;
import moses.diagram.edit.parts.SwitchNameEditPart;
import moses.diagram.edit.parts.SwitchSwitchControllerEditPart;
import moses.diagram.edit.parts.SwitchSwitchesEditPart;
import moses.diagram.edit.parts.TimeEditPart;
import moses.diagram.edit.parts.TimeOperatorBeginDateEndDatEditPart;
import moses.diagram.edit.parts.TrafficEditPart;
import moses.diagram.edit.parts.TrafficOperatorUnitValueEditPart;
import moses.diagram.edit.parts.WrappingLabel10EditPart;
import moses.diagram.edit.parts.WrappingLabel11EditPart;
import moses.diagram.edit.parts.WrappingLabel12EditPart;
import moses.diagram.edit.parts.WrappingLabel13EditPart;
import moses.diagram.edit.parts.WrappingLabel14EditPart;
import moses.diagram.edit.parts.WrappingLabel2EditPart;
import moses.diagram.edit.parts.WrappingLabel3EditPart;
import moses.diagram.edit.parts.WrappingLabel4EditPart;
import moses.diagram.edit.parts.WrappingLabel5EditPart;
import moses.diagram.edit.parts.WrappingLabel6EditPart;
import moses.diagram.edit.parts.WrappingLabel7EditPart;
import moses.diagram.edit.parts.WrappingLabel8EditPart;
import moses.diagram.edit.parts.WrappingLabel9EditPart;
import moses.diagram.edit.parts.WrappingLabelEditPart;

/**
 * This registry is used to determine which type of visual object should be
 * created for the corresponding Diagram, Node, ChildNode or Link represented
 * by a domain model object.
 * 
 * @generated
 */
public class MosesVisualIDRegistry {

	/**
	* @generated
	*/
	private static final String DEBUG_KEY = "moses.diagram/debug/visualID"; //$NON-NLS-1$

	/**
	* @generated
	*/
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (SdnEditPart.MODEL_ID.equals(view.getType())) {
				return SdnEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return moses.diagram.part.MosesVisualIDRegistry.getVisualID(view.getType());
	}

	/**
	* @generated
	*/
	public static String getModelID(View view) {
		View diagram = view.getDiagram();
		while (view != diagram) {
			EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
			if (annotation != null) {
				return (String) annotation.getDetails().get("modelID"); //$NON-NLS-1$
			}
			view = (View) view.eContainer();
		}
		return diagram != null ? diagram.getType() : null;
	}

	/**
	* @generated
	*/
	public static int getVisualID(String type) {
		try {
			return Integer.parseInt(type);
		} catch (NumberFormatException e) {
			if (Boolean.TRUE.toString().equalsIgnoreCase(Platform.getDebugOption(DEBUG_KEY))) {
				MosesDiagramEditorPlugin.getInstance()
						.logError("Unable to parse view type as a visualID number: " + type);
			}
		}
		return -1;
	}

	/**
	* @generated
	*/
	public static String getType(int visualID) {
		return Integer.toString(visualID);
	}

	/**
	* @generated
	*/
	public static int getDiagramVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (MosesPackage.eINSTANCE.getSdn().isSuperTypeOf(domainElement.eClass()) && isDiagram((Sdn) domainElement)) {
			return SdnEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	* @generated
	*/
	public static int getNodeVisualID(View containerView, EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		String containerModelID = moses.diagram.part.MosesVisualIDRegistry.getModelID(containerView);
		if (!SdnEditPart.MODEL_ID.equals(containerModelID) && !"moses".equals(containerModelID)) { //$NON-NLS-1$
			return -1;
		}
		int containerVisualID;
		if (SdnEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = moses.diagram.part.MosesVisualIDRegistry.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = SdnEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case SdnEditPart.VISUAL_ID:
			if (MosesPackage.eINSTANCE.getController().isSuperTypeOf(domainElement.eClass())) {
				return ControllerEditPart.VISUAL_ID;
			}
			if (MosesPackage.eINSTANCE.getHost().isSuperTypeOf(domainElement.eClass())) {
				return HostEditPart.VISUAL_ID;
			}
			if (MosesPackage.eINSTANCE.getSwitch().isSuperTypeOf(domainElement.eClass())) {
				return SwitchEditPart.VISUAL_ID;
			}
			if (MosesPackage.eINSTANCE.getAppMonitor().isSuperTypeOf(domainElement.eClass())) {
				return AppMonitorEditPart.VISUAL_ID;
			}
			if (MosesPackage.eINSTANCE.getRule().isSuperTypeOf(domainElement.eClass())) {
				return RuleEditPart.VISUAL_ID;
			}
			if (MosesPackage.eINSTANCE.getCondition().isSuperTypeOf(domainElement.eClass())) {
				return ConditionEditPart.VISUAL_ID;
			}
			if (MosesPackage.eINSTANCE.getTraffic().isSuperTypeOf(domainElement.eClass())) {
				return TrafficEditPart.VISUAL_ID;
			}
			if (MosesPackage.eINSTANCE.getTime().isSuperTypeOf(domainElement.eClass())) {
				return TimeEditPart.VISUAL_ID;
			}
			if (MosesPackage.eINSTANCE.getPacketHeader().isSuperTypeOf(domainElement.eClass())) {
				return PacketHeaderEditPart.VISUAL_ID;
			}
			if (MosesPackage.eINSTANCE.getApp().isSuperTypeOf(domainElement.eClass())) {
				return AppEditPart.VISUAL_ID;
			}
			if (MosesPackage.eINSTANCE.getGroup().isSuperTypeOf(domainElement.eClass())) {
				return GroupEditPart.VISUAL_ID;
			}
			break;
		case GroupGroupHostsGroupCompartmentEditPart.VISUAL_ID:
			if (MosesPackage.eINSTANCE.getHost().isSuperTypeOf(domainElement.eClass())) {
				return Host2EditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	* @generated
	*/
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = moses.diagram.part.MosesVisualIDRegistry.getModelID(containerView);
		if (!SdnEditPart.MODEL_ID.equals(containerModelID) && !"moses".equals(containerModelID)) { //$NON-NLS-1$
			return false;
		}
		int containerVisualID;
		if (SdnEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = moses.diagram.part.MosesVisualIDRegistry.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = SdnEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case SdnEditPart.VISUAL_ID:
			if (ControllerEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (HostEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SwitchEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AppMonitorEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RuleEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ConditionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TrafficEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TimeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PacketHeaderEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AppEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (GroupEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ControllerEditPart.VISUAL_ID:
			if (ControllerNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case HostEditPart.VISUAL_ID:
			if (HostNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SwitchEditPart.VISUAL_ID:
			if (SwitchNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AppMonitorEditPart.VISUAL_ID:
			if (AppMonitorNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case RuleEditPart.VISUAL_ID:
			if (RuleNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ConditionEditPart.VISUAL_ID:
			if (ConditionConditionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case TrafficEditPart.VISUAL_ID:
			if (TrafficOperatorUnitValueEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case TimeEditPart.VISUAL_ID:
			if (TimeOperatorBeginDateEndDatEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PacketHeaderEditPart.VISUAL_ID:
			if (PacketHeaderOperatorHeaderValueEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AppEditPart.VISUAL_ID:
			if (AppNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case GroupEditPart.VISUAL_ID:
			if (GroupNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (GroupGroupHostsGroupCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Host2EditPart.VISUAL_ID:
			if (HostName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case GroupGroupHostsGroupCompartmentEditPart.VISUAL_ID:
			if (Host2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case HostHostSwitchEditPart.VISUAL_ID:
			if (WrappingLabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SwitchSwitchControllerEditPart.VISUAL_ID:
			if (WrappingLabel2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SwitchSwitchesEditPart.VISUAL_ID:
			if (WrappingLabel3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case RuleSourceHostRuleEditPart.VISUAL_ID:
			if (WrappingLabel4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case RuleTargetHostRuleEditPart.VISUAL_ID:
			if (WrappingLabel5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case RuleRuleConditionEditPart.VISUAL_ID:
			if (WrappingLabel6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case RuleTargetGroupRuleEditPart.VISUAL_ID:
			if (WrappingLabel7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AppActionPacketHeaderEditPart.VISUAL_ID:
			if (WrappingLabel8EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AppAppToNetworkNodeEditPart.VISUAL_ID:
			if (WrappingLabel9EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AppControllerAppEditPart.VISUAL_ID:
			if (WrappingLabel10EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AppAppRuleEditPart.VISUAL_ID:
			if (WrappingLabel11EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ConditionConditionTimeEditPart.VISUAL_ID:
			if (WrappingLabel12EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ConditionConditionTrafficEditPart.VISUAL_ID:
			if (WrappingLabel13EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ConditionConditionPacketEditPart.VISUAL_ID:
			if (WrappingLabel14EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		}
		return false;
	}

	/**
	* @generated
	*/
	public static int getLinkWithClassVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		return -1;
	}

	/**
	* User can change implementation of this method to handle some specific
	* situations not covered by default logic.
	* 
	* @generated
	*/
	private static boolean isDiagram(Sdn element) {
		return true;
	}

	/**
	* @generated
	*/
	public static boolean checkNodeVisualID(View containerView, EObject domainElement, int candidate) {
		if (candidate == -1) {
			//unrecognized id is always bad
			return false;
		}
		int basic = getNodeVisualID(containerView, domainElement);
		return basic == candidate;
	}

	/**
	* @generated
	*/
	public static boolean isCompartmentVisualID(int visualID) {
		switch (visualID) {
		case GroupGroupHostsGroupCompartmentEditPart.VISUAL_ID:
			return true;
		default:
			break;
		}
		return false;
	}

	/**
	* @generated
	*/
	public static boolean isSemanticLeafVisualID(int visualID) {
		switch (visualID) {
		case SdnEditPart.VISUAL_ID:
			return false;
		case ControllerEditPart.VISUAL_ID:
		case HostEditPart.VISUAL_ID:
		case SwitchEditPart.VISUAL_ID:
		case AppMonitorEditPart.VISUAL_ID:
		case RuleEditPart.VISUAL_ID:
		case ConditionEditPart.VISUAL_ID:
		case TrafficEditPart.VISUAL_ID:
		case TimeEditPart.VISUAL_ID:
		case PacketHeaderEditPart.VISUAL_ID:
		case AppEditPart.VISUAL_ID:
		case Host2EditPart.VISUAL_ID:
			return true;
		default:
			break;
		}
		return false;
	}

	/**
	* @generated
	*/
	public static final DiagramStructure TYPED_INSTANCE = new DiagramStructure() {
		/**
		* @generated
		*/
		@Override

		public int getVisualID(View view) {
			return moses.diagram.part.MosesVisualIDRegistry.getVisualID(view);
		}

		/**
		* @generated
		*/
		@Override

		public String getModelID(View view) {
			return moses.diagram.part.MosesVisualIDRegistry.getModelID(view);
		}

		/**
		* @generated
		*/
		@Override

		public int getNodeVisualID(View containerView, EObject domainElement) {
			return moses.diagram.part.MosesVisualIDRegistry.getNodeVisualID(containerView, domainElement);
		}

		/**
		* @generated
		*/
		@Override

		public boolean checkNodeVisualID(View containerView, EObject domainElement, int candidate) {
			return moses.diagram.part.MosesVisualIDRegistry.checkNodeVisualID(containerView, domainElement, candidate);
		}

		/**
		* @generated
		*/
		@Override

		public boolean isCompartmentVisualID(int visualID) {
			return moses.diagram.part.MosesVisualIDRegistry.isCompartmentVisualID(visualID);
		}

		/**
		* @generated
		*/
		@Override

		public boolean isSemanticLeafVisualID(int visualID) {
			return moses.diagram.part.MosesVisualIDRegistry.isSemanticLeafVisualID(visualID);
		}
	};

}
