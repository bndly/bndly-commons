package org.bndly.rest.entity.resources;

/*-
 * #%L
 * REST Entity Resource
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

import org.bndly.common.mapper.MappingPostInterceptor;
import org.bndly.common.mapper.MappingState;
import java.util.ArrayList;
import java.util.List;

public class DelegatingMappingPostInterceptor implements MappingPostInterceptor {

    private List<MappingPostInterceptor> delegatedTo = new ArrayList<>();
    
    @Override
    public void postIntercept(MappingState state) {
        for (MappingPostInterceptor mappingPostInterceptor : delegatedTo) {
            mappingPostInterceptor.postIntercept(state);
        }
    }
    
    public void addInterceptor(MappingPostInterceptor interceptor) {
        delegatedTo.add(interceptor);
    }
}
