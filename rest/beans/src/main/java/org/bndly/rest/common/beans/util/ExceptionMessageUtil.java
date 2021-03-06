package org.bndly.rest.common.beans.util;

/*-
 * #%L
 * REST Common Beans
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

import org.bndly.rest.common.beans.error.ErrorKeyValuePairRestBean;
import org.bndly.rest.common.beans.error.ErrorRestBean;
import java.util.ArrayList;
import java.util.List;

public final class ExceptionMessageUtil {

	private ExceptionMessageUtil() {
	}

	public static void createKeyValue(ErrorRestBean errorBean, String key, String value) {
		List<ErrorKeyValuePairRestBean> desc = errorBean.getDescription();
		if (desc == null) {
			desc = new ArrayList<>();
			errorBean.setDescription(desc);
		}
		ErrorKeyValuePairRestBean kv = new ErrorKeyValuePairRestBean();
		kv.setKey(key);
		kv.setStringValue(value);
		desc.add(kv);
	}
}
