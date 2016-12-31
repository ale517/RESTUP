
package up.cloudcomputing.bean;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PersistenceBean {

    private List<DB> dB = null;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public List<DB> getDB() {
        return dB;
    }

    public void setDB(List<DB> dB) {
        this.dB = dB;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
