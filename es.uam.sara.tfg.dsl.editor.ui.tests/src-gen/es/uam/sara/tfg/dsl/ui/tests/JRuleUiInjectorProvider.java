/*
 * generated by Xtext 2.9.2
 */
package es.uam.sara.tfg.dsl.ui.tests;

import com.google.inject.Injector;
import es.uam.sara.tfg.dsl.editor.ui.internal.EditorActivator;
import org.eclipse.xtext.junit4.IInjectorProvider;

public class JRuleUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return EditorActivator.getInstance().getInjector("es.uam.sara.tfg.dsl.JRule");
	}

}
