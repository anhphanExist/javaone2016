package com.medallia.dsl.ast;

public interface AggVisitor<T> {
	T visit(StatsAggregate statsAggregate);
}
