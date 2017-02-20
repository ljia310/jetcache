/**
 * Created on  13-10-17 22:34
 */
package com.alicp.jetcache.embedded;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @author <a href="mailto:yeli.hl@taobao.com">huangli</a>
 */
public interface InnerMap {
    Object getValue(Object key);

    List getAllValues(List keys);

    void putValue(Object key, Object value);

    void putAllValues(Map map);

    boolean removeValue(Object key);

    boolean putIfAbsentValue(Object key, Object value);

    void removeAllValues(Set keys);
}
