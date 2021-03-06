package org.bndly.schema.impl.db;

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

import org.bndly.schema.api.db.AttributeColumn;
import org.bndly.schema.api.db.UniqueConstraintTable;
import org.bndly.schema.model.UniqueConstraint;
import java.util.ArrayList;
import java.util.List;

public class UniqueConstraintTableImpl extends TableImpl implements UniqueConstraintTable {

    private final UniqueConstraint uniqueConstraint;
    private final List<AttributeColumn> holderColumns;

    public UniqueConstraintTableImpl(UniqueConstraint uniqueConstraint, String tableName) {
        super(tableName, new ArrayList<AttributeColumn>());
        this.uniqueConstraint = uniqueConstraint;
        this.holderColumns = new ArrayList<>();
    }

	@Override
    public UniqueConstraint getUniqueConstraint() {
        return uniqueConstraint;
    }

	@Override
    public List<AttributeColumn> getHolderColumns() {
        return holderColumns;
    }

}
