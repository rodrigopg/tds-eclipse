package br.com.totvs.tds.ui.sdk;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.jface.util.IPropertyChangeListener;
import org.eclipse.jface.util.PropertyChangeEvent;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

import br.com.totvs.tds.ui.TDSMessageHandler;
import br.com.totvs.tds.ui.sdk.preference.ISDKPreferenceKeys;

/**
 * The activator class controls the plug-in life cycle
 */
public class SdkUIActivator extends AbstractUIPlugin implements IPropertyChangeListener {

	// The plug-in ID
	public static final String PLUGIN_ID = "br.com.totvs.tds.ui.sdk"; //$NON-NLS-1$

	// The shared instance
	private static SdkUIActivator plugin;

	/**
	 * The constructor
	 */
	public SdkUIActivator() {

	}

	@Override
	public void start(final BundleContext context) throws Exception {
		super.start(context);
		plugin = this;

		getPreferenceStore().addPropertyChangeListener(this);
	}

	@Override
	public void stop(final BundleContext context) throws Exception {
		plugin = null;
		super.stop(context);
	}

	/**
	 * Returns the shared instance
	 *
	 * @return the shared instance
	 */
	public static SdkUIActivator getDefault() {
		return plugin;
	}

	/**
	 * Utility method to create status.
	 *
	 * @param level
	 * @param message
	 * @param thr
	 * @return status
	 */
	public static IStatus showStatus(final int level, final String message, final Object... args) {
		final IStatus status = TDSMessageHandler.createStatus(level, PLUGIN_ID, message, args);
		TDSMessageHandler.showMessage(status);

		getDefault().getLog().log(status);

		return status;
	}

	public static IStatus logStatus(final int level, final String message, final Object... args) {
		final IStatus status = TDSMessageHandler.createStatus(level, PLUGIN_ID, message, args);
		TDSMessageHandler.logMessage(status);

		getDefault().getLog().log(status);

		return status;
	}

	@Override
	public void propertyChange(final PropertyChangeEvent event) {
		if (event.getProperty().equals(ISDKPreferenceKeys.RESULT_SEARCH)) {
			System.out.println("SdkUIActivator.propertyChange()"); //$NON-NLS-1$
			System.out.println("RESULT_SEARCH"); //$NON-NLS-1$
		}

	}

}
