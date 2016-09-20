
package es.uam.sara.tfg.ast;

import org.eclipse.jdt.core.ICompilationUnit;
import org.eclipse.jdt.core.dom.AST;
import org.eclipse.jdt.core.dom.ASTParser;
import org.eclipse.jdt.core.dom.ASTVisitor;
import org.eclipse.jdt.core.dom.CompilationUnit;

public class ParserAst {

	//use ASTParse to parse string
	public static CompilationUnit parse(String str, ASTVisitor visitor) {
		
		ASTParser parser = ASTParser.newParser(AST.JLS8);
		parser.setResolveBindings(true);
		parser.setBindingsRecovery(true);
		parser.setSource(str.toCharArray());
		parser.setKind(ASTParser.K_COMPILATION_UNIT);
		
		final CompilationUnit cu = (CompilationUnit) parser.createAST(null);
		cu.accept(visitor);
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
