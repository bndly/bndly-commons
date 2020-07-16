package org.bndly.common.json.impl;

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

import org.bndly.common.json.api.ConversionContext;
import org.bndly.common.json.api.Deserializer;
import org.bndly.common.json.api.Serializer;
import org.bndly.common.json.model.JSString;
import org.bndly.common.json.model.JSValue;
import java.lang.reflect.Type;

/**
 *
 * @author cybercon &lt;bndly@cybercon.de&gt;
 */
public class StringDeSerializer implements Serializer, Deserializer {

	@Override
	public boolean canSerialize(Type sourceType, ConversionContext conversionContext, Object javaValue) {
		return String.class.equals(sourceType) && javaValue != null;
	}

	@Override
	public JSValue serialize(Type sourceType, ConversionContext conversionContext, Object javaValue) {
		if (!String.class.isInstance(javaValue)) {
			throw new IllegalArgumentException("the provided java value was not a string");
		}
		return new JSString((String) javaValue);
	}

	@Override
	public boolean canDeserialize(Type targetType, ConversionContext conversionContext, JSValue value) {
		return String.class.equals(targetType) && JSString.class.isInstance(value);
	}

	@Override
	public Object deserialize(Type targetType, ConversionContext conversionContext, JSValue value) {
		return ((JSString)value).getValue();
	}
	
}
