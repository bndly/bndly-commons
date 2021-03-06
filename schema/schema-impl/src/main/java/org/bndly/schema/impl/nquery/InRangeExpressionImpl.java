package org.bndly.schema.impl.nquery;

/*-
 * #%L
 * Schema Impl
 * %%
 * Copyright (C) 2013 - 2020 Cybercon GmbH
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */

/**
 *
 * @author cybercon &lt;bndly@cybercon.de&gt;
 */
public class InRangeExpressionImpl extends ExpressionImpl implements InRangeExpression {
	private boolean negated;
	private ContextVariable upperBorder;
	private ContextVariable lowerBorder;
	private ContextVariable field;

	public InRangeExpressionImpl(String statement) {
		super(statement);
	}

	@Override
	public ContextVariable getField() {
		return field;
	}

	@Override
	public ContextVariable getLowerBorder() {
		return lowerBorder;
	}

	@Override
	public ContextVariable getUpperBorder() {
		return upperBorder;
	}

	@Override
	public boolean isNegated() {
		return negated;
	}
	
	public void setNegated(boolean negated) {
		this.negated = negated;
	}

	public void setUpperBorder(ContextVariable upperBorder) {
		this.upperBorder = upperBorder;
	}

	public void setLowerBorder(ContextVariable lowerBorder) {
		this.lowerBorder = lowerBorder;
	}

	public void setField(ContextVariable field) {
		this.field = field;
	}
	
}
