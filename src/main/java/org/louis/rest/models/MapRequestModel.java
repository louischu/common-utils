package org.louis.rest.models;

import org.apache.commons.lang3.builder.EqualsBuilder;

import java.util.HashMap;
import java.util.Map;

/**
 * @param <V>
 * @author luyenchu
 */
public class MapRequestModel<V> extends BaseRequestModel {
    private static final long serialVersionUID = -826139113265345319L;
    private Map<String, V> mapValue;

    public MapRequestModel() {
        this.mapValue = new HashMap<>();
    }

    public Map<String, V> getMapValue() {
        return mapValue;
    }

    public void addValue(String key, V value) {
        mapValue.put(key, value);
    }

    public V getValue(String key) {
        return mapValue.get(key);
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + ((mapValue == null) ? 0 : mapValue.hashCode());
        return result;
    }

    @SuppressWarnings("rawtypes")
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        MapRequestModel toCompare = (MapRequestModel) obj;
        return new EqualsBuilder()
                .append(mapValue, toCompare.getMapValue())
                .isEquals();
    }
}
