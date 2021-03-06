package org.apache.velocity;

/*-
 * #%L
 * Velocity OSGI
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

import java.io.InputStream;
import org.apache.commons.collections.ExtendedProperties;
import org.apache.velocity.exception.ResourceNotFoundException;
import org.apache.velocity.runtime.resource.Resource;
import org.apache.velocity.runtime.resource.loader.ResourceLoader;
import org.osgi.service.component.annotations.Component;

/**
 *
 * @author cybercon &lt;bndly@cybercon.de&gt;
 */
@Component(service = ResourceLoaderAdapter.class, immediate = true)
public class ResourceLoaderAdapter extends ResourceLoader {

	private static ResourceLoader delegate;

	public static void setDelegate(ResourceLoader delegate) {
		ResourceLoaderAdapter.delegate = delegate;
		if (delegate != null) {
			delegate.init(configuration);
		}
	}

	public static ResourceLoader getDelegate() {
		return delegate;
	}
	private static ExtendedProperties configuration;
	
	@Override
	public void init(ExtendedProperties configuration) {
		this.configuration = configuration;
		if (delegate != null) {
			delegate.init(configuration);
		}
	}

	@Override
	public InputStream getResourceStream(String sourceName) throws ResourceNotFoundException {
		if (delegate != null) {
			return delegate.getResourceStream(sourceName);
		}
		throw new ResourceNotFoundException("could not find resource " + sourceName);
	}

	@Override
	public boolean isSourceModified(Resource resource) {
		if (delegate != null) {
			return delegate.isSourceModified(resource);
		}
		return false;
	}

	@Override
	public long getLastModified(Resource resource) {
		if (delegate != null) {
			return delegate.getLastModified(resource);
		}
		return 0;
	}

}
