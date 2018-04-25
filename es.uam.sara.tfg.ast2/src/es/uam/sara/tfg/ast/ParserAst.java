
package es.uam.sara.tfg.ast;

import java.util.Map;

import org.eclipse.jdt.core.ICompilationUnit;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.core.dom.AST;
import org.eclipse.jdt.core.dom.ASTParser;
import org.eclipse.jdt.core.dom.ASTVisitor;
import org.eclipse.jdt.core.dom.CompilationUnit;

public class ParserAst {
	/**
	 * Funcion para crear el AST de un código JAva
	 * 
	 * @param str String con el código Java
	 * @param visitor visitor del AST, recorre todo el árbol
	 * @return CompilationUnit
	 */
	public static CompilationUnit parse(String str, ASTVisitor visitor) {
		
		ASTParser parser = ASTParser.newParser(AST.JLS8); //creamos objeto ASTParser asignando una versión de Java, en este caso Java 8
		parser.setResolveBindings(true); //Configuracion de algunas opciones.
		parser.setBindingsRecovery(true);
		parser.setSource(str.toCharArray());//Se pasa la cadena de caracteres con el codigo para parsear.
		parser.setKind(ASTParser.K_COMPILATION_UNIT);
		Map<String, String> options = JavaCore.getOptions(); //Configurancion de opciones para poder acceder a los tipos Enumerados.
		options.put(JavaCore.COMPILER_SOURCE, JavaCore.VERSION_1_5); 
		parser.setCompilerOptions(options);
		
		//Se crea el AST
		final CompilationUnit cu = (CompilationUnit) parser.createAST(null);
		//Se le añade el visitor.
		cu.accept(visitor);
		if (visitor instanceof UnitVisitor){
			((UnitVisitor)visitor).setComp(cu);
		}
		return cu;
	}
	
	//use ASTParse to parse string
		public static CompilationUnit parse(ICompilationUnit str, ASTVisitor visitor) {
			
			ASTParser parser = ASTParser.newParser(AST.JLS8);
			parser.setResolveBindings(true);
			parser.setBindingsRecovery(true);
			parser.setSource(str);
			parser.setKind(ASTParser.K_COMPILATION_UNIT);
			
			final CompilationUnit cu = (CompilationUnit) parser.createAST(null);
			cu.accept(visitor);
			return cu;
		}	
}
