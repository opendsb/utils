package org.dsb.pattern.visitor;


public interface Visitor<T> {
	public void visit(T host);
}
