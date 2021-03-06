package org.bndly.schema.vendor;

/*-
 * #%L
 * Schema Vendor
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

import org.bndly.schema.api.db.Table;
import org.bndly.schema.api.tx.TransactionTemplate;

/**
 *
 * @author cybercon &lt;bndly@cybercon.de&gt;
 */
public interface IndexExistenceAdapter {
	// create index ACT_IDX_MODEL_SOURCE_EXTRA on ACT_RE_MODEL(EDITOR_SOURCE_EXTRA_VALUE_ID_);
	public boolean isIndexDefinedOnTableColumn(String dbSchemaName, String indexName, Table table, TransactionTemplate template);
	public boolean isPrimaryKeyIndexedAutomatically();
	public boolean isUniqueColumnIndexedAutomatically();
}
