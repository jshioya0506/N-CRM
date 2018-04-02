package jp.co.nexus.crm.db.auto;

import org.apache.cayenne.CayenneDataObject;

import jp.co.nexus.crm.db.Area;
import jp.co.nexus.crm.db.Employee;

/**
 * Class _NCCalldoc was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _NCCalldoc extends CayenneDataObject {

    public static final String CALL_DOC_PROPERTY = "callDoc";
    public static final String CALL_TIME_PROPERTY = "callTime";
    public static final String CALL_YMD_PROPERTY = "callYmd";
    public static final String CUSTOMER_CD_PROPERTY = "customerCd";
    public static final String CUSTOMER_CD_ED_PROPERTY = "customerCdEd";
    public static final String DIVISION_CD_PROPERTY = "divisionCd";
    public static final String DIVISION_CD_ED_PROPERTY = "divisionCdEd";
    public static final String LIMIT_YMD_PROPERTY = "limitYmd";
    public static final String LOST_YMD_PROPERTY = "lostYmd";
    public static final String MODIFIED_PROPERTY = "modified";
    public static final String PERSON_NO_PROPERTY = "personNo";
    public static final String SALES_EMP_ED_PROPERTY = "salesEmpEd";
    public static final String AREA_PROPERTY = "area";
    public static final String EMPLOYEE_PROPERTY = "employee";

    public static final String SALES_EMPNO_PK_COLUMN = "SALES_EMPNO";

    public void setCallDoc(String callDoc) {
        writeProperty(CALL_DOC_PROPERTY, callDoc);
    }
    public String getCallDoc() {
        return (String)readProperty(CALL_DOC_PROPERTY);
    }

    public void setCallTime(int callTime) {
        writeProperty(CALL_TIME_PROPERTY, callTime);
    }
    public int getCallTime() {
        Object value = readProperty(CALL_TIME_PROPERTY);
        return (value != null) ? (Integer) value : 0;
    }

    public void setCallYmd(int callYmd) {
        writeProperty(CALL_YMD_PROPERTY, callYmd);
    }
    public int getCallYmd() {
        Object value = readProperty(CALL_YMD_PROPERTY);
        return (value != null) ? (Integer) value : 0;
    }

    public void setCustomerCd(int customerCd) {
        writeProperty(CUSTOMER_CD_PROPERTY, customerCd);
    }
    public int getCustomerCd() {
        Object value = readProperty(CUSTOMER_CD_PROPERTY);
        return (value != null) ? (Integer) value : 0;
    }

    public void setCustomerCdEd(int customerCdEd) {
        writeProperty(CUSTOMER_CD_ED_PROPERTY, customerCdEd);
    }
    public int getCustomerCdEd() {
        Object value = readProperty(CUSTOMER_CD_ED_PROPERTY);
        return (value != null) ? (Integer) value : 0;
    }

    public void setDivisionCd(int divisionCd) {
        writeProperty(DIVISION_CD_PROPERTY, divisionCd);
    }
    public int getDivisionCd() {
        Object value = readProperty(DIVISION_CD_PROPERTY);
        return (value != null) ? (Integer) value : 0;
    }

    public void setDivisionCdEd(int divisionCdEd) {
        writeProperty(DIVISION_CD_ED_PROPERTY, divisionCdEd);
    }
    public int getDivisionCdEd() {
        Object value = readProperty(DIVISION_CD_ED_PROPERTY);
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

    public void setPersonNo(int personNo) {
        writeProperty(PERSON_NO_PROPERTY, personNo);
    }
    public int getPersonNo() {
        Object value = readProperty(PERSON_NO_PROPERTY);
        return (value != null) ? (Integer) value : 0;
    }

    public void setSalesEmpEd(int salesEmpEd) {
        writeProperty(SALES_EMP_ED_PROPERTY, salesEmpEd);
    }
    public int getSalesEmpEd() {
        Object value = readProperty(SALES_EMP_ED_PROPERTY);
        return (value != null) ? (Integer) value : 0;
    }

    public void setArea(Area area) {
        setToOneTarget(AREA_PROPERTY, area, true);
    }

    public Area getArea() {
        return (Area)readProperty(AREA_PROPERTY);
    }


    public void setEmployee(Employee employee) {
        setToOneTarget(EMPLOYEE_PROPERTY, employee, true);
    }

    public Employee getEmployee() {
        return (Employee)readProperty(EMPLOYEE_PROPERTY);
    }


}
