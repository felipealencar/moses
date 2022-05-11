/*
 * 
 */
package moses.diagram.providers;

import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.tooling.runtime.providers.DiagramElementTypeImages;
import org.eclipse.gmf.tooling.runtime.providers.DiagramElementTypes;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;

import moses.MosesPackage;
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
import moses.diagram.part.MosesDiagramEditorPlugin;

/**
 * @generated
 */
public class MosesElementTypes {

	/**
	* @generated
	*/
	private MosesElementTypes() {
	}

	/**
	* @generated
	*/
	private static Map<IElementType, ENamedElement> elements;

	/**
	* @generated
	*/
	private static DiagramElementTypeImages elementTypeImages = new DiagramElementTypeImages(
			MosesDiagramEditorPlugin.getInstance().getItemProvidersAdapterFactory());

	/**
	* @generated
	*/
	private static Set<IElementType> KNOWN_ELEMENT_TYPES;

	/**
	* @generated
	*/
	public static final IElementType Sdn_1000 = getElementType("moses.diagram.Sdn_1000"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Controller_2001 = getElementType("moses.diagram.Controller_2001"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Host_2002 = getElementType("moses.diagram.Host_2002"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Switch_2003 = getElementType("moses.diagram.Switch_2003"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType AppMonitor_2004 = getElementType("moses.diagram.AppMonitor_2004"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Rule_2005 = getElementType("moses.diagram.Rule_2005"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Condition_2006 = getElementType("moses.diagram.Condition_2006"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Traffic_2007 = getElementType("moses.diagram.Traffic_2007"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Time_2008 = getElementType("moses.diagram.Time_2008"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType PacketHeader_2009 = getElementType("moses.diagram.PacketHeader_2009"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType App_2010 = getElementType("moses.diagram.App_2010"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Group_2011 = getElementType("moses.diagram.Group_2011"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Host_3001 = getElementType("moses.diagram.Host_3001"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType HostHostSwitch_4001 = getElementType("moses.diagram.HostHostSwitch_4001"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType SwitchSwitchController_4002 = getElementType(
			"moses.diagram.SwitchSwitchController_4002"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType SwitchSwitches_4003 = getElementType("moses.diagram.SwitchSwitches_4003"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType RuleSourceHostRule_4004 = getElementType("moses.diagram.RuleSourceHostRule_4004"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType RuleTargetHostRule_4005 = getElementType("moses.diagram.RuleTargetHostRule_4005"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType RuleRuleCondition_4006 = getElementType("moses.diagram.RuleRuleCondition_4006"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType RuleTargetGroupRule_4007 = getElementType(
			"moses.diagram.RuleTargetGroupRule_4007"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType AppActionPacketHeader_4008 = getElementType(
			"moses.diagram.AppActionPacketHeader_4008"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType AppAppToNetworkNode_4009 = getElementType(
			"moses.diagram.AppAppToNetworkNode_4009"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType AppControllerApp_4010 = getElementType("moses.diagram.AppControllerApp_4010"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType AppAppRule_4011 = getElementType("moses.diagram.AppAppRule_4011"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType ConditionConditionTime_4012 = getElementType(
			"moses.diagram.ConditionConditionTime_4012"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType ConditionConditionTraffic_4013 = getElementType(
			"moses.diagram.ConditionConditionTraffic_4013"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType ConditionConditionPacket_4014 = getElementType(
			"moses.diagram.ConditionConditionPacket_4014"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static ImageDescriptor getImageDescriptor(ENamedElement element) {
		return elementTypeImages.getImageDescriptor(element);
	}

	/**
	* @generated
	*/
	public static Image getImage(ENamedElement element) {
		return elementTypeImages.getImage(element);
	}

	/**
	* @generated
	*/
	public static ImageDescriptor getImageDescriptor(IAdaptable hint) {
		return getImageDescriptor(getElement(hint));
	}

	/**
	* @generated
	*/
	public static Image getImage(IAdaptable hint) {
		return getImage(getElement(hint));
	}

	/**
	* Returns 'type' of the ecore object associated with the hint.
	* 
	* @generated
	*/
	public static ENamedElement getElement(IAdaptable hint) {
		Object type = hint.getAdapter(IElementType.class);
		if (elements == null) {
			elements = new IdentityHashMap<IElementType, ENamedElement>();

			elements.put(Sdn_1000, MosesPackage.eINSTANCE.getSdn());

			elements.put(Controller_2001, MosesPackage.eINSTANCE.getController());

			elements.put(Host_2002, MosesPackage.eINSTANCE.getHost());

			elements.put(Switch_2003, MosesPackage.eINSTANCE.getSwitch());

			elements.put(AppMonitor_2004, MosesPackage.eINSTANCE.getAppMonitor());

			elements.put(Rule_2005, MosesPackage.eINSTANCE.getRule());

			elements.put(Condition_2006, MosesPackage.eINSTANCE.getCondition());

			elements.put(Traffic_2007, MosesPackage.eINSTANCE.getTraffic());

			elements.put(Time_2008, MosesPackage.eINSTANCE.getTime());

			elements.put(PacketHeader_2009, MosesPackage.eINSTANCE.getPacketHeader());

			elements.put(App_2010, MosesPackage.eINSTANCE.getApp());

			elements.put(Group_2011, MosesPackage.eINSTANCE.getGroup());

			elements.put(Host_3001, MosesPackage.eINSTANCE.getHost());

			elements.put(HostHostSwitch_4001, MosesPackage.eINSTANCE.getHost_HostSwitch());

			elements.put(SwitchSwitchController_4002, MosesPackage.eINSTANCE.getSwitch_SwitchController());

			elements.put(SwitchSwitches_4003, MosesPackage.eINSTANCE.getSwitch_Switches());

			elements.put(RuleSourceHostRule_4004, MosesPackage.eINSTANCE.getRule_SourceHostRule());

			elements.put(RuleTargetHostRule_4005, MosesPackage.eINSTANCE.getRule_TargetHostRule());

			elements.put(RuleRuleCondition_4006, MosesPackage.eINSTANCE.getRule_RuleCondition());

			elements.put(RuleTargetGroupRule_4007, MosesPackage.eINSTANCE.getRule_TargetGroupRule());

			elements.put(AppActionPacketHeader_4008, MosesPackage.eINSTANCE.getApp_ActionPacketHeader());

			elements.put(AppAppToNetworkNode_4009, MosesPackage.eINSTANCE.getApp_AppToNetworkNode());

			elements.put(AppControllerApp_4010, MosesPackage.eINSTANCE.getApp_ControllerApp());

			elements.put(AppAppRule_4011, MosesPackage.eINSTANCE.getApp_AppRule());

			elements.put(ConditionConditionTime_4012, MosesPackage.eINSTANCE.getCondition_ConditionTime());

			elements.put(ConditionConditionTraffic_4013, MosesPackage.eINSTANCE.getCondition_ConditionTraffic());

			elements.put(ConditionConditionPacket_4014, MosesPackage.eINSTANCE.getCondition_ConditionPacket());
		}
		return (ENamedElement) elements.get(type);
	}

	/**
	* @generated
	*/
	private static IElementType getElementType(String id) {
		return ElementTypeRegistry.getInstance().getType(id);
	}

	/**
	* @generated
	*/
	public static boolean isKnownElementType(IElementType elementType) {
		if (KNOWN_ELEMENT_TYPES == null) {
			KNOWN_ELEMENT_TYPES = new HashSet<IElementType>();
			KNOWN_ELEMENT_TYPES.add(Sdn_1000);
			KNOWN_ELEMENT_TYPES.add(Controller_2001);
			KNOWN_ELEMENT_TYPES.add(Host_2002);
			KNOWN_ELEMENT_TYPES.add(Switch_2003);
			KNOWN_ELEMENT_TYPES.add(AppMonitor_2004);
			KNOWN_ELEMENT_TYPES.add(Rule_2005);
			KNOWN_ELEMENT_TYPES.add(Condition_2006);
			KNOWN_ELEMENT_TYPES.add(Traffic_2007);
			KNOWN_ELEMENT_TYPES.add(Time_2008);
			KNOWN_ELEMENT_TYPES.add(PacketHeader_2009);
			KNOWN_ELEMENT_TYPES.add(App_2010);
			KNOWN_ELEMENT_TYPES.add(Group_2011);
			KNOWN_ELEMENT_TYPES.add(Host_3001);
			KNOWN_ELEMENT_TYPES.add(HostHostSwitch_4001);
			KNOWN_ELEMENT_TYPES.add(SwitchSwitchController_4002);
			KNOWN_ELEMENT_TYPES.add(SwitchSwitches_4003);
			KNOWN_ELEMENT_TYPES.add(RuleSourceHostRule_4004);
			KNOWN_ELEMENT_TYPES.add(RuleTargetHostRule_4005);
			KNOWN_ELEMENT_TYPES.add(RuleRuleCondition_4006);
			KNOWN_ELEMENT_TYPES.add(RuleTargetGroupRule_4007);
			KNOWN_ELEMENT_TYPES.add(AppActionPacketHeader_4008);
			KNOWN_ELEMENT_TYPES.add(AppAppToNetworkNode_4009);
			KNOWN_ELEMENT_TYPES.add(AppControllerApp_4010);
			KNOWN_ELEMENT_TYPES.add(AppAppRule_4011);
			KNOWN_ELEMENT_TYPES.add(ConditionConditionTime_4012);
			KNOWN_ELEMENT_TYPES.add(ConditionConditionTraffic_4013);
			KNOWN_ELEMENT_TYPES.add(ConditionConditionPacket_4014);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	* @generated
	*/
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case SdnEditPart.VISUAL_ID:
			return Sdn_1000;
		case ControllerEditPart.VISUAL_ID:
			return Controller_2001;
		case HostEditPart.VISUAL_ID:
			return Host_2002;
		case SwitchEditPart.VISUAL_ID:
			return Switch_2003;
		case AppMonitorEditPart.VISUAL_ID:
			return AppMonitor_2004;
		case RuleEditPart.VISUAL_ID:
			return Rule_2005;
		case ConditionEditPart.VISUAL_ID:
			return Condition_2006;
		case TrafficEditPart.VISUAL_ID:
			return Traffic_2007;
		case TimeEditPart.VISUAL_ID:
			return Time_2008;
		case PacketHeaderEditPart.VISUAL_ID:
			return PacketHeader_2009;
		case AppEditPart.VISUAL_ID:
			return App_2010;
		case GroupEditPart.VISUAL_ID:
			return Group_2011;
		case Host2EditPart.VISUAL_ID:
			return Host_3001;
		case HostHostSwitchEditPart.VISUAL_ID:
			return HostHostSwitch_4001;
		case SwitchSwitchControllerEditPart.VISUAL_ID:
			return SwitchSwitchController_4002;
		case SwitchSwitchesEditPart.VISUAL_ID:
			return SwitchSwitches_4003;
		case RuleSourceHostRuleEditPart.VISUAL_ID:
			return RuleSourceHostRule_4004;
		case RuleTargetHostRuleEditPart.VISUAL_ID:
			return RuleTargetHostRule_4005;
		case RuleRuleConditionEditPart.VISUAL_ID:
			return RuleRuleCondition_4006;
		case RuleTargetGroupRuleEditPart.VISUAL_ID:
			return RuleTargetGroupRule_4007;
		case AppActionPacketHeaderEditPart.VISUAL_ID:
			return AppActionPacketHeader_4008;
		case AppAppToNetworkNodeEditPart.VISUAL_ID:
			return AppAppToNetworkNode_4009;
		case AppControllerAppEditPart.VISUAL_ID:
			return AppControllerApp_4010;
		case AppAppRuleEditPart.VISUAL_ID:
			return AppAppRule_4011;
		case ConditionConditionTimeEditPart.VISUAL_ID:
			return ConditionConditionTime_4012;
		case ConditionConditionTrafficEditPart.VISUAL_ID:
			return ConditionConditionTraffic_4013;
		case ConditionConditionPacketEditPart.VISUAL_ID:
			return ConditionConditionPacket_4014;
		}
		return null;
	}

	/**
	* @generated
	*/
	public static final DiagramElementTypes TYPED_INSTANCE = new DiagramElementTypes(elementTypeImages) {

		/**
		* @generated
		*/
		@Override

		public boolean isKnownElementType(IElementType elementType) {
			return moses.diagram.providers.MosesElementTypes.isKnownElementType(elementType);
		}

		/**
		* @generated
		*/
		@Override

		public IElementType getElementTypeForVisualId(int visualID) {
			return moses.diagram.providers.MosesElementTypes.getElementType(visualID);
		}

		/**
		* @generated
		*/
		@Override

		public ENamedElement getDefiningNamedElement(IAdaptable elementTypeAdapter) {
			return moses.diagram.providers.MosesElementTypes.getElement(elementTypeAdapter);
		}
	};

}
