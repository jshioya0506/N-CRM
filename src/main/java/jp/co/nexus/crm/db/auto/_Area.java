package jp.co.nexus.crm.db.auto;

import java.util.List;

import org.apache.cayenne.CayenneDataObject;

import jp.co.nexus.crm.db.Employee;
import jp.co.nexus.crm.db.NCCalldoc;
import jp.co.nexus.crm.db.NCCustomer;
import jp.co.nexus.crm.db.NCDivision;
import jp.co.nexus.crm.db.NCPerson;

/**
 * Class _Area was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _Area extends CayenneDataObject {

    public static final String AREA_CD_PROPERTY = "areaCd";
    public static final String LIMIT_YMD_PROPERTY = "limitYmd";
    public static final String LOST_YMD_PROPERTY = "lostYmd";
    public static final String MODIFIED_PROPERTY = "modified";
    public static final String NAME_PROPERTY = "name";
    public static final String SHORT_NAME_PROPERTY = "shortName";
    public static final String CALLDOCS_PROPERTY = "calldocs";
    public static final String CUSTOMERS_PROPERTY = "customers";
    public static final String DIVISIONS_PROPERTY = "divisions";
    public static final String EMPLOYEES_PROPERTY = "employees";
    public static final String PERSONS_PROPERTY = "persons";

    public static final String AREACD_PK_COLUMN = "AREACD";

    public void setAreaCd(int areaCd) {
        writeProperty(AREA_CD_PROPERTY, areaCd);
    }
    public int getAreaCd() {
        Object value = readProperty(AREA_CD_PROPERTY);
        return (value != null) ? (Integer) value : 0;
    }

    public void setLimitYmd(int limitYmd) {
        writeProperty(LIMIT_YMD_PROPERTY, limitYmd);
    }
    public int getLimitYmd() {
        Object value = readProperty(LIMIT_YMD_PROPERTY);
        return (value != null) ? (Integer) value : 0;
    }

    public void setLostYmd(int lostYmd) {
        writeProperty(LOST_YMD_PROPERTY, lostYmd);
    }
    public int getLostYmd() {
        Object value = readProperty(LOST_YMD_PROPERTY);
        return (value != null) ? (Integer) value : 0;
    }

    public void setModified(int modified) {
        writeProperty(MODIFIED_PROPERTY, modified);
    }
    public int getModified() {
        Object value = readProperty(MODIFIED_PROPERTY);
        return (value != null) ? (Integer) value : 0;
    }

    public void setName(String name) {
        writeProperty(NAME_PROPERTY, name);
    }
    public String getName() {
        return (String)readProperty(NAME_PROPERTY);
    }

    public void setShortName(String shortName) {
        writeProperty(SHORT_NAME_PROPERTY, shortName);
    }
    public String getShortName() {
        return (String)readProperty(SHORT_NAME_PROPERTY);
    }

    public void addToCalldocs(NCCalldoc obj) {
        addToManyTarget(CALLDOCS_PROPERTY, obj, true);
    }
    public void removeFromCalldocs(NCCalldoc obj) {
        removeToManyTarget(CALLDOCS_PROPERTY, obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<NCCalldoc> getCalldocs() {
        return (List<NCCalldoc>)readProperty(CALLDOCS_PROPERTY);
    }


    public void addToCustomers(NCCustomer obj) {
        addToManyTarget(CUSTOMERS_PROPERTY, obj, true);
    }
    public void removeFromCustomers(NCCustomer obj) {
        removeToManyTarget(CUSTOMERS_PROPERTY, obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<NCCustomer> getCustomers() {
        return (List<NCCustomer>)readProperty(CUSTOMERS_PROPERTY);
    }


    public void addToDivisions(NCDivision obj) {
        addToManyTarget(DIVISIONS_PROPERTY, obj, true);
    }
    public void removeFromDivisions(NCDivision obj) {
        removeToManyTarget(DIVISIONS_PROPERTY, obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<NCDivision> getDivisions() {
        return (List<NCDivision>)readProperty(DIVISIONS_PROPERTY);
    }


    public void addToEmployees(Employee obj) {
        addToManyTarget(EMPLOYEES_PROPERTY, obj, true);
    }
    public void removeFromEmployees(Employee obj) {
        removeToManyTarget(EMPLOYEES_PROPERTY, obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<Employee> getEmployees() {
        return (List<Employee>)readProperty(EMPLOYEES_PROPERTY);
    }


    public void addToPersons(NCPerson obj) {
        addToManyTarget(PERSONS_PROPERTY, obj, true);
    }
    public void removeFromPersons(NCPerson obj) {
        removeToManyTarget(PERSONS_PROPERTY, obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<NCPerson> getPersons() {
        return (List<NCPerson>)readProperty(PERSONS_PROPERTY);
    }


}
