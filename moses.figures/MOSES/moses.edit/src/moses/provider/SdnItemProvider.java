/**
 */
package moses.provider;


import java.util.Collection;
import java.util.List;

import moses.MosesFactory;
import moses.MosesPackage;
import moses.Sdn;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link moses.Sdn} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SdnItemProvider 
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SdnItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

		}
		return itemPropertyDescriptors;
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(MosesPackage.Literals.SDN__NODES);
			childrenFeatures.add(MosesPackage.Literals.SDN__APPS);
			childrenFeatures.add(MosesPackage.Literals.SDN__RULE_OBJECTS);
			childrenFeatures.add(MosesPackage.Literals.SDN__GROUPS);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns Sdn.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Sdn"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_Sdn_type");
	}


	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(Sdn.class)) {
			case MosesPackage.SDN__NODES:
			case MosesPackage.SDN__APPS:
			case MosesPackage.SDN__RULE_OBJECTS:
			case MosesPackage.SDN__GROUPS:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(MosesPackage.Literals.SDN__NODES,
				 MosesFactory.eINSTANCE.createController()));

		newChildDescriptors.add
			(createChildParameter
				(MosesPackage.Literals.SDN__NODES,
				 MosesFactory.eINSTANCE.createHost()));

		newChildDescriptors.add
			(createChildParameter
				(MosesPackage.Literals.SDN__NODES,
				 MosesFactory.eINSTANCE.createSwitch()));

		newChildDescriptors.add
			(createChildParameter
				(MosesPackage.Literals.SDN__APPS,
				 MosesFactory.eINSTANCE.createApp()));

		newChildDescriptors.add
			(createChildParameter
				(MosesPackage.Literals.SDN__APPS,
				 MosesFactory.eINSTANCE.createAppMonitor()));

		newChildDescriptors.add
			(createChildParameter
				(MosesPackage.Literals.SDN__RULE_OBJECTS,
				 MosesFactory.eINSTANCE.createRule()));

		newChildDescriptors.add
			(createChildParameter
				(MosesPackage.Literals.SDN__RULE_OBJECTS,
				 MosesFactory.eINSTANCE.createCondition()));

		newChildDescriptors.add
			(createChildParameter
				(MosesPackage.Literals.SDN__RULE_OBJECTS,
				 MosesFactory.eINSTANCE.createTraffic()));

		newChildDescriptors.add
			(createChildParameter
				(MosesPackage.Literals.SDN__RULE_OBJECTS,
				 MosesFactory.eINSTANCE.createTime()));

		newChildDescriptors.add
			(createChildParameter
				(MosesPackage.Literals.SDN__RULE_OBJECTS,
				 MosesFactory.eINSTANCE.createPacketHeader()));

		newChildDescriptors.add
			(createChildParameter
				(MosesPackage.Literals.SDN__GROUPS,
				 MosesFactory.eINSTANCE.createGroup()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return MosesEditPlugin.INSTANCE;
	}

}
