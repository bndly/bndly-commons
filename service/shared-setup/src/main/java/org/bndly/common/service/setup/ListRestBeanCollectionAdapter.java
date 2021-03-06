package org.bndly.common.service.setup;

/*-
 * #%L
 * Service Shared Client Setup
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

import org.bndly.common.mapper.CollectionTypeAdapter;
import org.bndly.common.mapper.MappingState;
import org.bndly.common.reflection.InstantiationUtil;
import org.bndly.rest.common.beans.ListRestBean;

/**
 *
 * @author cybercon &lt;bndly@cybercon.de&gt;
 */
public class ListRestBeanCollectionAdapter implements CollectionTypeAdapter {

	@Override
	public void addObjectToCollection(Object entry, Object collection, MappingState state) {
		((ListRestBean) collection).add(entry);
	}

	@Override
	public void iterate(Object collection, CollectionTypeAdapter.IterationHandler handler, MappingState state) {
		for (Object entry : ((ListRestBean) collection)) {
			handler.handle(entry, state);
		}
	}

	@Override
	public Class<?> getSupportedCollectionType() {
		return ListRestBean.class;
	}

	@Override
	public Object newCollectionInstance(Class<?> type) {
		Object instance = InstantiationUtil.instantiateType(type);
		if (instance == null) {
			throw new IllegalStateException("could not instantiate " + type.toString());
		}
		return instance;
	}
}
