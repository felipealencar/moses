
/*
 * 
 */
package moses.diagram.part;

import java.util.ArrayList;
import java.util.Collections;

import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteDrawer;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.tooling.runtime.part.DefaultLinkToolEntry;
import org.eclipse.gmf.tooling.runtime.part.DefaultNodeToolEntry;

import moses.diagram.providers.MosesElementTypes;

/**
 * @generated
 */
public class MosesPaletteFactory {

	/**
	* @generated
	*/
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createObjects1Group());
		paletteRoot.add(createConnections2Group());
	}

	/**
	* Creates "Objects" palette tool group
	* @generated
	*/
	private PaletteContainer createObjects1Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(Messages.Objects1Group_title);
		paletteContainer.setId("createObjects1Group"); //$NON-NLS-1$
		paletteContainer.add(createApp1CreationTool());
		paletteContainer.add(createAppMonitor2CreationTool());
		paletteContainer.add(createCondition3CreationTool());
		paletteContainer.add(createController4CreationTool());
		paletteContainer.add(createGroup5CreationTool());
		paletteContainer.add(createHost6CreationTool());
		paletteContainer.add(createPacketHeader7CreationTool());
		paletteContainer.add(createRule8CreationTool());
		paletteContainer.add(createSwitch9CreationTool());
		paletteContainer.add(createTime10CreationTool());
		paletteContainer.add(createTraffic11CreationTool());
		return paletteContainer;
	}

	/**
	* Creates "Connections" palette tool group
	* @generated
	*/
	private PaletteContainer createConnections2Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(Messages.Connections2Group_title);
		paletteContainer.setId("createConnections2Group"); //$NON-NLS-1$
		paletteContainer.add(createActionPacketHeader1CreationTool());
		paletteContainer.add(createAppRule2CreationTool());
		paletteContainer.add(createAppToNetworkNode3CreationTool());
		paletteContainer.add(createConditionPacket4CreationTool());
		paletteContainer.add(createConditionTime5CreationTool());
		paletteContainer.add(createConditionTraffic6CreationTool());
		paletteContainer.add(createControllerApp7CreationTool());
		paletteContainer.add(createHostSwitch8CreationTool());
		paletteContainer.add(createRuleCondition9CreationTool());
		paletteContainer.add(createSourceHostRule10CreationTool());
		paletteContainer.add(createSwitchController11CreationTool());
		paletteContainer.add(createSwitches12CreationTool());
		paletteContainer.add(createTargetGroupRule13CreationTool());
		paletteContainer.add(createTargetHostRule14CreationTool());
		return paletteContainer;
	}

	/**
	* @generated
	*/
	private ToolEntry createApp1CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.App1CreationTool_title,
				Messages.App1CreationTool_desc, Collections.singletonList(MosesElementTypes.App_2010));
		entry.setId("createApp1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(MosesDiagramEditorPlugin.findImageDescriptor("/moses.edit/icons/full/obj16/action.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createAppMonitor2CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.AppMonitor2CreationTool_title,
				Messages.AppMonitor2CreationTool_desc, Collections.singletonList(MosesElementTypes.AppMonitor_2004));
		entry.setId("createAppMonitor2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(MosesDiagramEditorPlugin.findImageDescriptor("/moses.edit/icons/full/obj16/action.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createCondition3CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Condition3CreationTool_title,
				Messages.Condition3CreationTool_desc, Collections.singletonList(MosesElementTypes.Condition_2006));
		entry.setId("createCondition3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(MosesDiagramEditorPlugin.findImageDescriptor("/moses.edit/icons/full/obj16/condition.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createController4CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Controller4CreationTool_title,
				Messages.Controller4CreationTool_desc, Collections.singletonList(MosesElementTypes.Controller_2001));
		entry.setId("createController4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(MosesDiagramEditorPlugin.findImageDescriptor("/moses.edit/icons/full/obj16/controller.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createGroup5CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Group5CreationTool_title,
				Messages.Group5CreationTool_desc, Collections.singletonList(MosesElementTypes.Group_2011));
		entry.setId("createGroup5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(MosesElementTypes.getImageDescriptor(MosesElementTypes.Group_2011));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createHost6CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(MosesElementTypes.Host_2002);
		types.add(MosesElementTypes.Host_3001);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Host6CreationTool_title,
				Messages.Host6CreationTool_desc, types);
		entry.setId("createHost6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(MosesDiagramEditorPlugin.findImageDescriptor("/moses.edit/icons/full/obj16/host.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createPacketHeader7CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.PacketHeader7CreationTool_title,
				Messages.PacketHeader7CreationTool_desc,
				Collections.singletonList(MosesElementTypes.PacketHeader_2009));
		entry.setId("createPacketHeader7CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(
				MosesDiagramEditorPlugin.findImageDescriptor("/moses.edit/icons/full/obj16/packetheader.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createRule8CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Rule8CreationTool_title,
				Messages.Rule8CreationTool_desc, Collections.singletonList(MosesElementTypes.Rule_2005));
		entry.setId("createRule8CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(MosesDiagramEditorPlugin.findImageDescriptor("/moses.edit/icons/full/obj16/policy.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createSwitch9CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Switch9CreationTool_title,
				Messages.Switch9CreationTool_desc, Collections.singletonList(MosesElementTypes.Switch_2003));
		entry.setId("createSwitch9CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(MosesDiagramEditorPlugin.findImageDescriptor("/moses.edit/icons/full/obj16/switch.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createTime10CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Time10CreationTool_title,
				Messages.Time10CreationTool_desc, Collections.singletonList(MosesElementTypes.Time_2008));
		entry.setId("createTime10CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(MosesDiagramEditorPlugin.findImageDescriptor("/moses.edit/icons/full/obj16/time.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createTraffic11CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Traffic11CreationTool_title,
				Messages.Traffic11CreationTool_desc, Collections.singletonList(MosesElementTypes.Traffic_2007));
		entry.setId("createTraffic11CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(MosesDiagramEditorPlugin.findImageDescriptor("/moses.edit/icons/full/obj16/traffic.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createActionPacketHeader1CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(Messages.ActionPacketHeader1CreationTool_title,
				Messages.ActionPacketHeader1CreationTool_desc,
				Collections.singletonList(MosesElementTypes.AppActionPacketHeader_4008));
		entry.setId("createActionPacketHeader1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(MosesElementTypes.getImageDescriptor(MosesElementTypes.AppActionPacketHeader_4008));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createAppRule2CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(Messages.AppRule2CreationTool_title,
				Messages.AppRule2CreationTool_desc, Collections.singletonList(MosesElementTypes.AppAppRule_4011));
		entry.setId("createAppRule2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(MosesElementTypes.getImageDescriptor(MosesElementTypes.AppAppRule_4011));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createAppToNetworkNode3CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(Messages.AppToNetworkNode3CreationTool_title,
				Messages.AppToNetworkNode3CreationTool_desc,
				Collections.singletonList(MosesElementTypes.AppAppToNetworkNode_4009));
		entry.setId("createAppToNetworkNode3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(MosesElementTypes.getImageDescriptor(MosesElementTypes.AppAppToNetworkNode_4009));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createConditionPacket4CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(Messages.ConditionPacket4CreationTool_title,
				Messages.ConditionPacket4CreationTool_desc,
				Collections.singletonList(MosesElementTypes.ConditionConditionPacket_4014));
		entry.setId("createConditionPacket4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(MosesElementTypes.getImageDescriptor(MosesElementTypes.ConditionConditionPacket_4014));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createConditionTime5CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(Messages.ConditionTime5CreationTool_title,
				Messages.ConditionTime5CreationTool_desc,
				Collections.singletonList(MosesElementTypes.ConditionConditionTime_4012));
		entry.setId("createConditionTime5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(MosesElementTypes.getImageDescriptor(MosesElementTypes.ConditionConditionTime_4012));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createConditionTraffic6CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(Messages.ConditionTraffic6CreationTool_title,
				Messages.ConditionTraffic6CreationTool_desc,
				Collections.singletonList(MosesElementTypes.ConditionConditionTraffic_4013));
		entry.setId("createConditionTraffic6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(MosesElementTypes.getImageDescriptor(MosesElementTypes.ConditionConditionTraffic_4013));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createControllerApp7CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(Messages.ControllerApp7CreationTool_title,
				Messages.ControllerApp7CreationTool_desc,
				Collections.singletonList(MosesElementTypes.AppControllerApp_4010));
		entry.setId("createControllerApp7CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(MosesElementTypes.getImageDescriptor(MosesElementTypes.AppControllerApp_4010));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createHostSwitch8CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(Messages.HostSwitch8CreationTool_title,
				Messages.HostSwitch8CreationTool_desc,
				Collections.singletonList(MosesElementTypes.HostHostSwitch_4001));
		entry.setId("createHostSwitch8CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(MosesElementTypes.getImageDescriptor(MosesElementTypes.HostHostSwitch_4001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createRuleCondition9CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(Messages.RuleCondition9CreationTool_title,
				Messages.RuleCondition9CreationTool_desc,
				Collections.singletonList(MosesElementTypes.RuleRuleCondition_4006));
		entry.setId("createRuleCondition9CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(MosesElementTypes.getImageDescriptor(MosesElementTypes.RuleRuleCondition_4006));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createSourceHostRule10CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(Messages.SourceHostRule10CreationTool_title,
				Messages.SourceHostRule10CreationTool_desc,
				Collections.singletonList(MosesElementTypes.RuleSourceHostRule_4004));
		entry.setId("createSourceHostRule10CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(MosesElementTypes.getImageDescriptor(MosesElementTypes.RuleSourceHostRule_4004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createSwitchController11CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(Messages.SwitchController11CreationTool_title,
				Messages.SwitchController11CreationTool_desc,
				Collections.singletonList(MosesElementTypes.SwitchSwitchController_4002));
		entry.setId("createSwitchController11CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(MosesElementTypes.getImageDescriptor(MosesElementTypes.SwitchSwitchController_4002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createSwitches12CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(Messages.Switches12CreationTool_title,
				Messages.Switches12CreationTool_desc, Collections.singletonList(MosesElementTypes.SwitchSwitches_4003));
		entry.setId("createSwitches12CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(MosesElementTypes.getImageDescriptor(MosesElementTypes.SwitchSwitches_4003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createTargetGroupRule13CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(Messages.TargetGroupRule13CreationTool_title,
				Messages.TargetGroupRule13CreationTool_desc,
				Collections.singletonList(MosesElementTypes.RuleTargetGroupRule_4007));
		entry.setId("createTargetGroupRule13CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(MosesElementTypes.getImageDescriptor(MosesElementTypes.RuleTargetGroupRule_4007));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createTargetHostRule14CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(Messages.TargetHostRule14CreationTool_title,
				Messages.TargetHostRule14CreationTool_desc,
				Collections.singletonList(MosesElementTypes.RuleTargetHostRule_4005));
		entry.setId("createTargetHostRule14CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(MosesElementTypes.getImageDescriptor(MosesElementTypes.RuleTargetHostRule_4005));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

}
