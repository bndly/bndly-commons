package org.bndly.common.service.cache;

/*-
 * #%L
 * Service Cache
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

import org.bndly.common.service.cache.api.ApplicationCache;
import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import net.sf.ehcache.Cache;
import net.sf.ehcache.CacheManager;
import net.sf.ehcache.Ehcache;

public class ApplicationCacheImpl extends MethodInvocationKeyedCache implements ApplicationCache {
    
    private CacheManager cacheManager;

    @PostConstruct
    public void init() {
        Ehcache cache = new Cache(NAME, 10000, true, true, 0, 0);
        cacheManager.addCache(cache);
        setEhCache(cache);
    }

    @Resource(name = EHCacheManagerFactory.NAME)
    public void setCacheManager(CacheManager cacheManager) {
        this.cacheManager = cacheManager;
    }
    
}
