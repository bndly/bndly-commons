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

import org.bndly.schema.api.nquery.BooleanOperator;
import org.bndly.schema.api.nquery.WrapperBooleanStatement;
import org.bndly.schema.api.nquery.BooleanStatement;

/**
 *
 * @author cybercon &lt;bndly@cybercon.de&gt;
 */
public class WrapperBooleanStatementImpl implements WrapperBooleanStatement {
	private BooleanStatement wrapped;
	private BooleanOperator nextOperator;
	private BooleanStatement next;

	@Override
	public BooleanStatement getWrapped() {
		return wrapped;
	}

	@Override
	public BooleanStatement getNext() {
		return next;
	}

	@Override
	public BooleanOperator getNextOperator() {
		return nextOperator;
	}

	public void setWrapped(BooleanStatement wrapped) {
		this.wrapped = wrapped;
	}

	public void setNextOperator(BooleanOperator nextOperator) {
		this.nextOperator = nextOperator;
	}

	public void setNext(BooleanStatement next) {
		this.next = next;
	}
}
