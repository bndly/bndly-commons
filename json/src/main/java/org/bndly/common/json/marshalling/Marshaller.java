package org.bndly.common.json.marshalling;

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
import org.bndly.common.json.api.ConversionContextBuilder;
import org.bndly.common.json.model.JSNull;
import org.bndly.common.json.model.JSValue;

public class Marshaller {

	public JSValue marshall(Object sourceObject) {
		return marshall(sourceObject, false);
	}

	public JSValue marshall(Object sourceObject, boolean stopAtCycles) {
		if (sourceObject == null) {
			return JSNull.INSTANCE;
		}

		ConversionContextBuilder builder = new ConversionContextBuilder().initDefaults();

		if (stopAtCycles) {
			builder.stopAtCycles();
		}
		ConversionContext conversionContext = builder.build();
		JSValue root = conversionContext.serialize(sourceObject.getClass(), sourceObject);
		return root;
	}

}
