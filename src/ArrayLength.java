package AST;
import AST.Visitor.Visitor;

public class ArrayLength extends Exp {

	public Exp exp;

	public ArrayLength(Exp exp, int lineNumber) {
		super(lineNumber);
		this.exp = exp; 
	}

	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}
	
}
