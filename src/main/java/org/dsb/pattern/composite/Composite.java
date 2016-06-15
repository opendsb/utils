package org.dsb.pattern.composite;

import java.util.stream.Stream;

public interface Composite<T> extends Part<T> {
	public Stream<T> getChildren();
}
