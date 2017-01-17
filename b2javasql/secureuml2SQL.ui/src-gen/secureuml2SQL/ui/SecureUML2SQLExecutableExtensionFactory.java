/*
 * generated by Xtext 2.10.0
 */
package secureuml2SQL.ui;

import com.google.inject.Injector;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;
import secureuml2SQL.ui.internal.Secureuml2SQLActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class SecureUML2SQLExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return Secureuml2SQLActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return Secureuml2SQLActivator.getInstance().getInjector(Secureuml2SQLActivator.SECUREUML2SQL_SECUREUML2SQL);
	}
	
}