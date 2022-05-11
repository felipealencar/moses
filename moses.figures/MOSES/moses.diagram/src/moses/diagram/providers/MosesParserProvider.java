/*
 * 
 */
package moses.diagram.providers;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.service.AbstractProvider;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.GetParserOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParserProvider;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserService;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.ui.services.parser.ParserHintAdapter;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.parsers.EnumParser;

import moses.MosesPackage;
import moses.diagram.edit.parts.AppMonitorNameEditPart;
import moses.diagram.edit.parts.AppNameEditPart;
import moses.diagram.edit.parts.ConditionConditionEditPart;
import moses.diagram.edit.parts.ControllerNameEditPart;
import moses.diagram.edit.parts.GroupNameEditPart;
import moses.diagram.edit.parts.HostName2EditPart;
import moses.diagram.edit.parts.HostNameEditPart;
import moses.diagram.edit.parts.PacketHeaderOperatorHeaderValueEditPart;
import moses.diagram.edit.parts.RuleNameEditPart;
import moses.diagram.edit.parts.SwitchNameEditPart;
import moses.diagram.edit.parts.TimeOperatorBeginDateEndDatEditPart;
import moses.diagram.edit.parts.TrafficOperatorUnitValueEditPart;
import moses.diagram.parsers.MessageFormatParser;
import moses.diagram.part.MosesVisualIDRegistry;

/**
 * @generated
 */
public class MosesParserProvider extends AbstractProvider implements IParserProvider {

	/**
	* @generated
	*/
	private IParser controllerName_5001Parser;

	/**
	* @generated
	*/
	private IParser getControllerName_5001Parser() {
		if (controllerName_5001Parser == null) {
			EAttribute[] features = new EAttribute[] { MosesPackage.eINSTANCE.getNetworkNode_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			controllerName_5001Parser = parser;
		}
		return controllerName_5001Parser;
	}

	/**
	* @generated
	*/
	private IParser hostName_5002Parser;

	/**
	* @generated
	*/
	private IParser getHostName_5002Parser() {
		if (hostName_5002Parser == null) {
			EAttribute[] features = new EAttribute[] { MosesPackage.eINSTANCE.getNetworkNode_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			hostName_5002Parser = parser;
		}
		return hostName_5002Parser;
	}

	/**
	* @generated
	*/
	private IParser switchName_5003Parser;

	/**
	* @generated
	*/
	private IParser getSwitchName_5003Parser() {
		if (switchName_5003Parser == null) {
			EAttribute[] features = new EAttribute[] { MosesPackage.eINSTANCE.getNetworkNode_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			switchName_5003Parser = parser;
		}
		return switchName_5003Parser;
	}

	/**
	* @generated
	*/
	private IParser appMonitorName_5004Parser;

	/**
	* @generated
	*/
	private IParser getAppMonitorName_5004Parser() {
		if (appMonitorName_5004Parser == null) {
			EAttribute[] features = new EAttribute[] { MosesPackage.eINSTANCE.getApp_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			appMonitorName_5004Parser = parser;
		}
		return appMonitorName_5004Parser;
	}

	/**
	* @generated
	*/
	private IParser ruleName_5005Parser;

	/**
	* @generated
	*/
	private IParser getRuleName_5005Parser() {
		if (ruleName_5005Parser == null) {
			EAttribute[] features = new EAttribute[] { MosesPackage.eINSTANCE.getAppObject_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			ruleName_5005Parser = parser;
		}
		return ruleName_5005Parser;
	}

	/**
	* @generated
	*/
	private IParser conditionCondition_5006Parser;

	/**
	* @generated
	*/
	private IParser getConditionCondition_5006Parser() {
		if (conditionCondition_5006Parser == null) {
			EAttribute editableFeature = MosesPackage.eINSTANCE.getCondition_Condition();
			EnumParser parser = new EnumParser(editableFeature);
			conditionCondition_5006Parser = parser;
		}
		return conditionCondition_5006Parser;
	}

	/**
	* @generated
	*/
	private IParser trafficOperatorUnitValue_5007Parser;

	/**
	* @generated
	*/
	private IParser getTrafficOperatorUnitValue_5007Parser() {
		if (trafficOperatorUnitValue_5007Parser == null) {
			EAttribute[] features = new EAttribute[] { MosesPackage.eINSTANCE.getTraffic_Operator(),
					MosesPackage.eINSTANCE.getTraffic_Unit(), MosesPackage.eINSTANCE.getTraffic_Value() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("{0}: {2}{1}"); //$NON-NLS-1$
			parser.setEditorPattern("{0}: {2}{1}"); //$NON-NLS-1$
			parser.setEditPattern("{0}: {2}{1}"); //$NON-NLS-1$
			trafficOperatorUnitValue_5007Parser = parser;
		}
		return trafficOperatorUnitValue_5007Parser;
	}

	/**
	* @generated
	*/
	private IParser timeOperatorBeginDateEndDate_5008Parser;

	/**
	* @generated
	*/
	private IParser getTimeOperatorBeginDateEndDate_5008Parser() {
		if (timeOperatorBeginDateEndDate_5008Parser == null) {
			EAttribute[] features = new EAttribute[] { MosesPackage.eINSTANCE.getTime_Operator(),
					MosesPackage.eINSTANCE.getTime_BeginDate(), MosesPackage.eINSTANCE.getTime_EndDate() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("{0}: {1} - {2}"); //$NON-NLS-1$
			parser.setEditorPattern("{0}: {1} - {2}"); //$NON-NLS-1$
			parser.setEditPattern("{0}: {1} - {2}"); //$NON-NLS-1$
			timeOperatorBeginDateEndDate_5008Parser = parser;
		}
		return timeOperatorBeginDateEndDate_5008Parser;
	}

	/**
	* @generated
	*/
	private IParser packetHeaderOperatorHeaderValue_5009Parser;

	/**
	* @generated
	*/
	private IParser getPacketHeaderOperatorHeaderValue_5009Parser() {
		if (packetHeaderOperatorHeaderValue_5009Parser == null) {
			EAttribute[] features = new EAttribute[] { MosesPackage.eINSTANCE.getPacketHeader_Operator(),
					MosesPackage.eINSTANCE.getPacketHeader_Header(), MosesPackage.eINSTANCE.getPacketHeader_Value() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("{0}: [{1}] {2}"); //$NON-NLS-1$
			parser.setEditorPattern("{0}: [{1}] {2}"); //$NON-NLS-1$
			parser.setEditPattern("{0}: [{1}] {2}"); //$NON-NLS-1$
			packetHeaderOperatorHeaderValue_5009Parser = parser;
		}
		return packetHeaderOperatorHeaderValue_5009Parser;
	}

	/**
	* @generated
	*/
	private IParser appName_5010Parser;

	/**
	* @generated
	*/
	private IParser getAppName_5010Parser() {
		if (appName_5010Parser == null) {
			EAttribute[] features = new EAttribute[] { MosesPackage.eINSTANCE.getApp_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			appName_5010Parser = parser;
		}
		return appName_5010Parser;
	}

	/**
	* @generated
	*/
	private IParser groupName_5012Parser;

	/**
	* @generated
	*/
	private IParser getGroupName_5012Parser() {
		if (groupName_5012Parser == null) {
			EAttribute[] features = new EAttribute[] { MosesPackage.eINSTANCE.getGroup_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			groupName_5012Parser = parser;
		}
		return groupName_5012Parser;
	}

	/**
	* @generated
	*/
	private IParser hostName_5011Parser;

	/**
	* @generated
	*/
	private IParser getHostName_5011Parser() {
		if (hostName_5011Parser == null) {
			EAttribute[] features = new EAttribute[] { MosesPackage.eINSTANCE.getNetworkNode_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			hostName_5011Parser = parser;
		}
		return hostName_5011Parser;
	}

	/**
	* @generated
	*/
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case ControllerNameEditPart.VISUAL_ID:
			return getControllerName_5001Parser();
		case HostNameEditPart.VISUAL_ID:
			return getHostName_5002Parser();
		case SwitchNameEditPart.VISUAL_ID:
			return getSwitchName_5003Parser();
		case AppMonitorNameEditPart.VISUAL_ID:
			return getAppMonitorName_5004Parser();
		case RuleNameEditPart.VISUAL_ID:
			return getRuleName_5005Parser();

		case ConditionConditionEditPart.VISUAL_ID:
			return getConditionCondition_5006Parser();
		case TrafficOperatorUnitValueEditPart.VISUAL_ID:
			return getTrafficOperatorUnitValue_5007Parser();
		case TimeOperatorBeginDateEndDatEditPart.VISUAL_ID:
			return getTimeOperatorBeginDateEndDate_5008Parser();
		case PacketHeaderOperatorHeaderValueEditPart.VISUAL_ID:
			return getPacketHeaderOperatorHeaderValue_5009Parser();
		case AppNameEditPart.VISUAL_ID:
			return getAppName_5010Parser();
		case GroupNameEditPart.VISUAL_ID:
			return getGroupName_5012Parser();
		case HostName2EditPart.VISUAL_ID:
			return getHostName_5011Parser();
		}
		return null;
	}

	/**
	* Utility method that consults ParserService
	* @generated
	*/
	public static IParser getParser(IElementType type, EObject object, String parserHint) {
		return ParserService.getInstance().getParser(new HintAdapter(type, object, parserHint));
	}

	/**
	* @generated
	*/
	public IParser getParser(IAdaptable hint) {
		String vid = (String) hint.getAdapter(String.class);
		if (vid != null) {
			return getParser(MosesVisualIDRegistry.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(MosesVisualIDRegistry.getVisualID(view));
		}
		return null;
	}

	/**
	* @generated
	*/
	public boolean provides(IOperation operation) {
		if (operation instanceof GetParserOperation) {
			IAdaptable hint = ((GetParserOperation) operation).getHint();
			if (MosesElementTypes.getElement(hint) == null) {
				return false;
			}
			return getParser(hint) != null;
		}
		return false;
	}

	/**
	* @generated
	*/
	private static class HintAdapter extends ParserHintAdapter {

		/**
		* @generated
		*/
		private final IElementType elementType;

		/**
		* @generated
		*/
		public HintAdapter(IElementType type, EObject object, String parserHint) {
			super(object, parserHint);
			assert type != null;
			elementType = type;
		}

		/**
		* @generated
		*/
		public Object getAdapter(Class adapter) {
			if (IElementType.class.equals(adapter)) {
				return elementType;
			}
			return super.getAdapter(adapter);
		}
	}

}
