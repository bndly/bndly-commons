package org.bndly.rest.security.beans;

/*-
 * #%L
 * REST Security Resource Beans
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

import org.bndly.rest.atomlink.api.JAXBMessageClassProvider;
import java.util.Collection;
import java.util.HashSet;
import org.osgi.service.component.annotations.Component;

/**
 *
 * @author cybercon &lt;bndly@cybercon.de&gt;
 */
@Component(service = JAXBMessageClassProvider.class, immediate = true)
public class JAXBMessageClassProviderImpl implements JAXBMessageClassProvider {
	private static final Collection<Class<?>> classes;

	static {
		classes = new HashSet<>();
		classes.add(AbstractAccountRestBean.class);
		classes.add(AccountActivationTokenRestBean.class);
		classes.add(AccountCreationRestBean.class);
		classes.add(AccountLookupRestBean.class);
		classes.add(AccountPasswordRestBean.class);
		classes.add(AccountRestBean.class);
	}

	@Override
	public Collection<Class<?>> getJAXBMessageClasses() {
		return classes;
	}
}
