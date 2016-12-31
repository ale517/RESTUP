
package up.cloudcomputing.bean;

import java.util.HashMap;
import java.util.Map;

public class DB {

    private Properties properties;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
