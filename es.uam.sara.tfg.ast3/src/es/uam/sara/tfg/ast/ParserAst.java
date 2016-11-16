
package es.uam.sara.tfg.ast;

import java.util.Map;

import org.eclipse.jdt.core.ICompilationUnit;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.core.dom.AST;
import org.eclipse.jdt.core.dom.ASTParser;
import org.eclipse.jdt.core.dom.CompilationUnit;

public class ParserAst {

	//use ASTParse to parse string
	public static CompilationUnit parse(String str, UnitVisitor visitor) {
		
		ASTParser parser = ASTParser.newParser(AST.JLS8);
		parser.setResolveBindings(true);
		parser.setBindingsRecovery(true);
		parser.setSource(str.toCharArray());
		parser.setKind(ASTParser.K_COMPILATION_UNIT);
		Map<String, String> options = JavaCore.getOptions();
		options.put(JavaCore.COMPILER_SOURCE, JavaCore.VERSION_1_5); //or newer version
		parser.setCompilerOptions(options);
		
		final CompilationUnit cu = (CompilationUnit) parser.createAST(null);
		cu.accept(visitor);
		visitor.setComp(cu);
		return cu;
	}
	
	//use ASTParse to parse string
		public static CompilationUnit parse(ICompilationUnit str, UnitVisitor visitor) {
			
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
