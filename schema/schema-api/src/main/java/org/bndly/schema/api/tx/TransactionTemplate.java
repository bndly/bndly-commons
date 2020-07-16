package org.bndly.schema.api.tx;

/*-
 * #%L
 * Schema API
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

/**
 * The TransactionTemplate provides access to a SQL transaction to a passed in callback object.
 * The callback receives a {@link TransactionStatus}, that provides access to the SQL connection.
 * The callback may also enforce a rollback via the {@link TransactionStatus#setRollbackOnly()}.
 */
public interface TransactionTemplate {
	// run any statement in an encapsulated transaction
	<E> E doInTransaction(TransactionCallback<E> transactionCallback);
}
