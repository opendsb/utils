package org.dsb.pattern.navigator;

import org.dsb.pattern.composite.Part;
import org.dsb.pattern.visitor.TreeVisitor;

public interface Navigator<T extends Part<T>> {
	public void navigateAndApplyVisitor(Part<T> host, TreeVisitor<T> visitor);
}
