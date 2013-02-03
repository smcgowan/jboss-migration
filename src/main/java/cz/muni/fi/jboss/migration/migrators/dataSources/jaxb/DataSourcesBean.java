package cz.muni.fi.jboss.migration.migrators.dataSources.jaxb;


import javax.xml.bind.annotation.*;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

/**
 * Class for unmarshalling and representing datasources (AS5)
 *
 * @author Roman Jakubco
 * Date: 8/26/12
 * Time: 1:12 PM
 */

@XmlRootElement(name = "datasources" )
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "datasources")

public class DataSourcesBean {

    @XmlElements(@XmlElement(name = "local-tx-datasource", type = DatasourceAS5Bean.class))
    private Set<DatasourceAS5Bean> localDatasourceAS5s;

    @XmlElements(@XmlElement(name = "xa-datasource", type = XaDatasourceAS5Bean.class))
    private Set<XaDatasourceAS5Bean> xaDatasourceAS5s;

    public Set<XaDatasourceAS5Bean> getXaDatasourceAS5s() {
        return xaDatasourceAS5s;
    }

    public void setXaDatasourceAS5s(Collection<XaDatasourceAS5Bean> xaDatasourceAS5s) {
        Set<XaDatasourceAS5Bean> temp = new HashSet();
        temp.addAll(xaDatasourceAS5s);
        this.xaDatasourceAS5s = temp;
    }

    public Set<DatasourceAS5Bean> getLocalDatasourceAS5s() {
        return localDatasourceAS5s;
    }

    public void setLocalDatasourceAS5s(Collection<DatasourceAS5Bean> localDatasourceAS5s) {
        Set<DatasourceAS5Bean> temp = new HashSet();
        temp.addAll(localDatasourceAS5s);
        this.localDatasourceAS5s = temp;
    }
}