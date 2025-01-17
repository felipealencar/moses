/**
 */
package moses.provider;

import java.util.ArrayList;
import java.util.Collection;

import moses.util.MosesAdapterFactory;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class MosesItemProviderAdapterFactory extends MosesAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MosesItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link moses.Sdn} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SdnItemProvider sdnItemProvider;

	/**
	 * This creates an adapter for a {@link moses.Sdn}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSdnAdapter() {
		if (sdnItemProvider == null) {
			sdnItemProvider = new SdnItemProvider(this);
		}

		return sdnItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link moses.Controller} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ControllerItemProvider controllerItemProvider;

	/**
	 * This creates an adapter for a {@link moses.Controller}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createControllerAdapter() {
		if (controllerItemProvider == null) {
			controllerItemProvider = new ControllerItemProvider(this);
		}

		return controllerItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link moses.Host} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HostItemProvider hostItemProvider;

	/**
	 * This creates an adapter for a {@link moses.Host}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createHostAdapter() {
		if (hostItemProvider == null) {
			hostItemProvider = new HostItemProvider(this);
		}

		return hostItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link moses.Switch} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SwitchItemProvider switchItemProvider;

	/**
	 * This creates an adapter for a {@link moses.Switch}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSwitchAdapter() {
		if (switchItemProvider == null) {
			switchItemProvider = new SwitchItemProvider(this);
		}

		return switchItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link moses.OpenFlowSwitch} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OpenFlowSwitchItemProvider openFlowSwitchItemProvider;

	/**
	 * This creates an adapter for a {@link moses.OpenFlowSwitch}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createOpenFlowSwitchAdapter() {
		if (openFlowSwitchItemProvider == null) {
			openFlowSwitchItemProvider = new OpenFlowSwitchItemProvider(this);
		}

		return openFlowSwitchItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link moses.Rule} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RuleItemProvider ruleItemProvider;

	/**
	 * This creates an adapter for a {@link moses.Rule}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRuleAdapter() {
		if (ruleItemProvider == null) {
			ruleItemProvider = new RuleItemProvider(this);
		}

		return ruleItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link moses.App} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AppItemProvider appItemProvider;

	/**
	 * This creates an adapter for a {@link moses.App}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAppAdapter() {
		if (appItemProvider == null) {
			appItemProvider = new AppItemProvider(this);
		}

		return appItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link moses.Condition} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConditionItemProvider conditionItemProvider;

	/**
	 * This creates an adapter for a {@link moses.Condition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createConditionAdapter() {
		if (conditionItemProvider == null) {
			conditionItemProvider = new ConditionItemProvider(this);
		}

		return conditionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link moses.Traffic} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TrafficItemProvider trafficItemProvider;

	/**
	 * This creates an adapter for a {@link moses.Traffic}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTrafficAdapter() {
		if (trafficItemProvider == null) {
			trafficItemProvider = new TrafficItemProvider(this);
		}

		return trafficItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link moses.Time} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TimeItemProvider timeItemProvider;

	/**
	 * This creates an adapter for a {@link moses.Time}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTimeAdapter() {
		if (timeItemProvider == null) {
			timeItemProvider = new TimeItemProvider(this);
		}

		return timeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link moses.PacketHeader} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PacketHeaderItemProvider packetHeaderItemProvider;

	/**
	 * This creates an adapter for a {@link moses.PacketHeader}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPacketHeaderAdapter() {
		if (packetHeaderItemProvider == null) {
			packetHeaderItemProvider = new PacketHeaderItemProvider(this);
		}

		return packetHeaderItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link moses.AppMonitor} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AppMonitorItemProvider appMonitorItemProvider;

	/**
	 * This creates an adapter for a {@link moses.AppMonitor}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAppMonitorAdapter() {
		if (appMonitorItemProvider == null) {
			appMonitorItemProvider = new AppMonitorItemProvider(this);
		}

		return appMonitorItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link moses.Flow} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FlowItemProvider flowItemProvider;

	/**
	 * This creates an adapter for a {@link moses.Flow}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createFlowAdapter() {
		if (flowItemProvider == null) {
			flowItemProvider = new FlowItemProvider(this);
		}

		return flowItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link moses.Group} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GroupItemProvider groupItemProvider;

	/**
	 * This creates an adapter for a {@link moses.Group}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createGroupAdapter() {
		if (groupItemProvider == null) {
			groupItemProvider = new GroupItemProvider(this);
		}

		return groupItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link moses.Instruction} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InstructionItemProvider instructionItemProvider;

	/**
	 * This creates an adapter for a {@link moses.Instruction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createInstructionAdapter() {
		if (instructionItemProvider == null) {
			instructionItemProvider = new InstructionItemProvider(this);
		}

		return instructionItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose() {
		if (sdnItemProvider != null) sdnItemProvider.dispose();
		if (controllerItemProvider != null) controllerItemProvider.dispose();
		if (hostItemProvider != null) hostItemProvider.dispose();
		if (switchItemProvider != null) switchItemProvider.dispose();
		if (openFlowSwitchItemProvider != null) openFlowSwitchItemProvider.dispose();
		if (ruleItemProvider != null) ruleItemProvider.dispose();
		if (appItemProvider != null) appItemProvider.dispose();
		if (conditionItemProvider != null) conditionItemProvider.dispose();
		if (trafficItemProvider != null) trafficItemProvider.dispose();
		if (timeItemProvider != null) timeItemProvider.dispose();
		if (packetHeaderItemProvider != null) packetHeaderItemProvider.dispose();
		if (appMonitorItemProvider != null) appMonitorItemProvider.dispose();
		if (flowItemProvider != null) flowItemProvider.dispose();
		if (groupItemProvider != null) groupItemProvider.dispose();
		if (instructionItemProvider != null) instructionItemProvider.dispose();
	}

}
