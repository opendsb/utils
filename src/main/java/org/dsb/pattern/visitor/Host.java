package org.dsb.pattern.visitor;


public interface Host<T> {
	public void accept(TreeVisitor<T> visitor);
}
