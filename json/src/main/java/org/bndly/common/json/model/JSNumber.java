package org.bndly.common.json.model;

/*-
 * #%L
 * JSON
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

import java.math.BigDecimal;

public final class JSNumber extends JSValue {

	private BigDecimal value;

	public JSNumber() {
	}

	public JSNumber(BigDecimal value) {
		this.value = value;
	}

	public JSNumber(long value) {
		this(new BigDecimal(value));
	}

	public JSNumber(int value) {
		this(new BigDecimal(value));
	}

	public JSNumber(short value) {
		this(new BigDecimal(value));
	}

	public JSNumber(byte value) {
		this(new BigDecimal(value));
	}

	public JSNumber(double value) {
		this(new BigDecimal(value));
	}

	public JSNumber(float value) {
		this(new BigDecimal(value));
	}

	public BigDecimal getValue() {
		return value;
	}

	public void setValue(BigDecimal value) {
		this.value = value;
	}

}
