package cn.springmvc.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class AaaLoginFtpLogExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AaaLoginFtpLogExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andAaaLoginFtpLogIdIsNull() {
            addCriterion("AAA_LOGIN_FTP_LOG_ID is null");
            return (Criteria) this;
        }

        public Criteria andAaaLoginFtpLogIdIsNotNull() {
            addCriterion("AAA_LOGIN_FTP_LOG_ID is not null");
            return (Criteria) this;
        }

        public Criteria andAaaLoginFtpLogIdEqualTo(String value) {
            addCriterion("AAA_LOGIN_FTP_LOG_ID =", value, "aaaLoginFtpLogId");
            return (Criteria) this;
        }

        public Criteria andAaaLoginFtpLogIdNotEqualTo(String value) {
            addCriterion("AAA_LOGIN_FTP_LOG_ID <>", value, "aaaLoginFtpLogId");
            return (Criteria) this;
        }

        public Criteria andAaaLoginFtpLogIdGreaterThan(String value) {
            addCriterion("AAA_LOGIN_FTP_LOG_ID >", value, "aaaLoginFtpLogId");
            return (Criteria) this;
        }

        public Criteria andAaaLoginFtpLogIdGreaterThanOrEqualTo(String value) {
            addCriterion("AAA_LOGIN_FTP_LOG_ID >=", value, "aaaLoginFtpLogId");
            return (Criteria) this;
        }

        public Criteria andAaaLoginFtpLogIdLessThan(String value) {
            addCriterion("AAA_LOGIN_FTP_LOG_ID <", value, "aaaLoginFtpLogId");
            return (Criteria) this;
        }

        public Criteria andAaaLoginFtpLogIdLessThanOrEqualTo(String value) {
            addCriterion("AAA_LOGIN_FTP_LOG_ID <=", value, "aaaLoginFtpLogId");
            return (Criteria) this;
        }

        public Criteria andAaaLoginFtpLogIdLike(String value) {
            addCriterion("AAA_LOGIN_FTP_LOG_ID like", value, "aaaLoginFtpLogId");
            return (Criteria) this;
        }

        public Criteria andAaaLoginFtpLogIdNotLike(String value) {
            addCriterion("AAA_LOGIN_FTP_LOG_ID not like", value, "aaaLoginFtpLogId");
            return (Criteria) this;
        }

        public Criteria andAaaLoginFtpLogIdIn(List<String> values) {
            addCriterion("AAA_LOGIN_FTP_LOG_ID in", values, "aaaLoginFtpLogId");
            return (Criteria) this;
        }

        public Criteria andAaaLoginFtpLogIdNotIn(List<String> values) {
            addCriterion("AAA_LOGIN_FTP_LOG_ID not in", values, "aaaLoginFtpLogId");
            return (Criteria) this;
        }

        public Criteria andAaaLoginFtpLogIdBetween(String value1, String value2) {
            addCriterion("AAA_LOGIN_FTP_LOG_ID between", value1, value2, "aaaLoginFtpLogId");
            return (Criteria) this;
        }

        public Criteria andAaaLoginFtpLogIdNotBetween(String value1, String value2) {
            addCriterion("AAA_LOGIN_FTP_LOG_ID not between", value1, value2, "aaaLoginFtpLogId");
            return (Criteria) this;
        }

        public Criteria andChargeTpyeIsNull() {
            addCriterion("CHARGE_TPYE is null");
            return (Criteria) this;
        }

        public Criteria andChargeTpyeIsNotNull() {
            addCriterion("CHARGE_TPYE is not null");
            return (Criteria) this;
        }

        public Criteria andChargeTpyeEqualTo(String value) {
            addCriterion("CHARGE_TPYE =", value, "chargeTpye");
            return (Criteria) this;
        }

        public Criteria andChargeTpyeNotEqualTo(String value) {
            addCriterion("CHARGE_TPYE <>", value, "chargeTpye");
            return (Criteria) this;
        }

        public Criteria andChargeTpyeGreaterThan(String value) {
            addCriterion("CHARGE_TPYE >", value, "chargeTpye");
            return (Criteria) this;
        }

        public Criteria andChargeTpyeGreaterThanOrEqualTo(String value) {
            addCriterion("CHARGE_TPYE >=", value, "chargeTpye");
            return (Criteria) this;
        }

        public Criteria andChargeTpyeLessThan(String value) {
            addCriterion("CHARGE_TPYE <", value, "chargeTpye");
            return (Criteria) this;
        }

        public Criteria andChargeTpyeLessThanOrEqualTo(String value) {
            addCriterion("CHARGE_TPYE <=", value, "chargeTpye");
            return (Criteria) this;
        }

        public Criteria andChargeTpyeLike(String value) {
            addCriterion("CHARGE_TPYE like", value, "chargeTpye");
            return (Criteria) this;
        }

        public Criteria andChargeTpyeNotLike(String value) {
            addCriterion("CHARGE_TPYE not like", value, "chargeTpye");
            return (Criteria) this;
        }

        public Criteria andChargeTpyeIn(List<String> values) {
            addCriterion("CHARGE_TPYE in", values, "chargeTpye");
            return (Criteria) this;
        }

        public Criteria andChargeTpyeNotIn(List<String> values) {
            addCriterion("CHARGE_TPYE not in", values, "chargeTpye");
            return (Criteria) this;
        }

        public Criteria andChargeTpyeBetween(String value1, String value2) {
            addCriterion("CHARGE_TPYE between", value1, value2, "chargeTpye");
            return (Criteria) this;
        }

        public Criteria andChargeTpyeNotBetween(String value1, String value2) {
            addCriterion("CHARGE_TPYE not between", value1, value2, "chargeTpye");
            return (Criteria) this;
        }

        public Criteria andAccessTypeIsNull() {
            addCriterion("ACCESS_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andAccessTypeIsNotNull() {
            addCriterion("ACCESS_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andAccessTypeEqualTo(String value) {
            addCriterion("ACCESS_TYPE =", value, "accessType");
            return (Criteria) this;
        }

        public Criteria andAccessTypeNotEqualTo(String value) {
            addCriterion("ACCESS_TYPE <>", value, "accessType");
            return (Criteria) this;
        }

        public Criteria andAccessTypeGreaterThan(String value) {
            addCriterion("ACCESS_TYPE >", value, "accessType");
            return (Criteria) this;
        }

        public Criteria andAccessTypeGreaterThanOrEqualTo(String value) {
            addCriterion("ACCESS_TYPE >=", value, "accessType");
            return (Criteria) this;
        }

        public Criteria andAccessTypeLessThan(String value) {
            addCriterion("ACCESS_TYPE <", value, "accessType");
            return (Criteria) this;
        }

        public Criteria andAccessTypeLessThanOrEqualTo(String value) {
            addCriterion("ACCESS_TYPE <=", value, "accessType");
            return (Criteria) this;
        }

        public Criteria andAccessTypeLike(String value) {
            addCriterion("ACCESS_TYPE like", value, "accessType");
            return (Criteria) this;
        }

        public Criteria andAccessTypeNotLike(String value) {
            addCriterion("ACCESS_TYPE not like", value, "accessType");
            return (Criteria) this;
        }

        public Criteria andAccessTypeIn(List<String> values) {
            addCriterion("ACCESS_TYPE in", values, "accessType");
            return (Criteria) this;
        }

        public Criteria andAccessTypeNotIn(List<String> values) {
            addCriterion("ACCESS_TYPE not in", values, "accessType");
            return (Criteria) this;
        }

        public Criteria andAccessTypeBetween(String value1, String value2) {
            addCriterion("ACCESS_TYPE between", value1, value2, "accessType");
            return (Criteria) this;
        }

        public Criteria andAccessTypeNotBetween(String value1, String value2) {
            addCriterion("ACCESS_TYPE not between", value1, value2, "accessType");
            return (Criteria) this;
        }

        public Criteria andBelongNetIsNull() {
            addCriterion("BELONG_NET is null");
            return (Criteria) this;
        }

        public Criteria andBelongNetIsNotNull() {
            addCriterion("BELONG_NET is not null");
            return (Criteria) this;
        }

        public Criteria andBelongNetEqualTo(String value) {
            addCriterion("BELONG_NET =", value, "belongNet");
            return (Criteria) this;
        }

        public Criteria andBelongNetNotEqualTo(String value) {
            addCriterion("BELONG_NET <>", value, "belongNet");
            return (Criteria) this;
        }

        public Criteria andBelongNetGreaterThan(String value) {
            addCriterion("BELONG_NET >", value, "belongNet");
            return (Criteria) this;
        }

        public Criteria andBelongNetGreaterThanOrEqualTo(String value) {
            addCriterion("BELONG_NET >=", value, "belongNet");
            return (Criteria) this;
        }

        public Criteria andBelongNetLessThan(String value) {
            addCriterion("BELONG_NET <", value, "belongNet");
            return (Criteria) this;
        }

        public Criteria andBelongNetLessThanOrEqualTo(String value) {
            addCriterion("BELONG_NET <=", value, "belongNet");
            return (Criteria) this;
        }

        public Criteria andBelongNetLike(String value) {
            addCriterion("BELONG_NET like", value, "belongNet");
            return (Criteria) this;
        }

        public Criteria andBelongNetNotLike(String value) {
            addCriterion("BELONG_NET not like", value, "belongNet");
            return (Criteria) this;
        }

        public Criteria andBelongNetIn(List<String> values) {
            addCriterion("BELONG_NET in", values, "belongNet");
            return (Criteria) this;
        }

        public Criteria andBelongNetNotIn(List<String> values) {
            addCriterion("BELONG_NET not in", values, "belongNet");
            return (Criteria) this;
        }

        public Criteria andBelongNetBetween(String value1, String value2) {
            addCriterion("BELONG_NET between", value1, value2, "belongNet");
            return (Criteria) this;
        }

        public Criteria andBelongNetNotBetween(String value1, String value2) {
            addCriterion("BELONG_NET not between", value1, value2, "belongNet");
            return (Criteria) this;
        }

        public Criteria andVisitNetIsNull() {
            addCriterion("VISIT_NET is null");
            return (Criteria) this;
        }

        public Criteria andVisitNetIsNotNull() {
            addCriterion("VISIT_NET is not null");
            return (Criteria) this;
        }

        public Criteria andVisitNetEqualTo(String value) {
            addCriterion("VISIT_NET =", value, "visitNet");
            return (Criteria) this;
        }

        public Criteria andVisitNetNotEqualTo(String value) {
            addCriterion("VISIT_NET <>", value, "visitNet");
            return (Criteria) this;
        }

        public Criteria andVisitNetGreaterThan(String value) {
            addCriterion("VISIT_NET >", value, "visitNet");
            return (Criteria) this;
        }

        public Criteria andVisitNetGreaterThanOrEqualTo(String value) {
            addCriterion("VISIT_NET >=", value, "visitNet");
            return (Criteria) this;
        }

        public Criteria andVisitNetLessThan(String value) {
            addCriterion("VISIT_NET <", value, "visitNet");
            return (Criteria) this;
        }

        public Criteria andVisitNetLessThanOrEqualTo(String value) {
            addCriterion("VISIT_NET <=", value, "visitNet");
            return (Criteria) this;
        }

        public Criteria andVisitNetLike(String value) {
            addCriterion("VISIT_NET like", value, "visitNet");
            return (Criteria) this;
        }

        public Criteria andVisitNetNotLike(String value) {
            addCriterion("VISIT_NET not like", value, "visitNet");
            return (Criteria) this;
        }

        public Criteria andVisitNetIn(List<String> values) {
            addCriterion("VISIT_NET in", values, "visitNet");
            return (Criteria) this;
        }

        public Criteria andVisitNetNotIn(List<String> values) {
            addCriterion("VISIT_NET not in", values, "visitNet");
            return (Criteria) this;
        }

        public Criteria andVisitNetBetween(String value1, String value2) {
            addCriterion("VISIT_NET between", value1, value2, "visitNet");
            return (Criteria) this;
        }

        public Criteria andVisitNetNotBetween(String value1, String value2) {
            addCriterion("VISIT_NET not between", value1, value2, "visitNet");
            return (Criteria) this;
        }

        public Criteria andTicketSourceIsNull() {
            addCriterion("TICKET_SOURCE is null");
            return (Criteria) this;
        }

        public Criteria andTicketSourceIsNotNull() {
            addCriterion("TICKET_SOURCE is not null");
            return (Criteria) this;
        }

        public Criteria andTicketSourceEqualTo(String value) {
            addCriterion("TICKET_SOURCE =", value, "ticketSource");
            return (Criteria) this;
        }

        public Criteria andTicketSourceNotEqualTo(String value) {
            addCriterion("TICKET_SOURCE <>", value, "ticketSource");
            return (Criteria) this;
        }

        public Criteria andTicketSourceGreaterThan(String value) {
            addCriterion("TICKET_SOURCE >", value, "ticketSource");
            return (Criteria) this;
        }

        public Criteria andTicketSourceGreaterThanOrEqualTo(String value) {
            addCriterion("TICKET_SOURCE >=", value, "ticketSource");
            return (Criteria) this;
        }

        public Criteria andTicketSourceLessThan(String value) {
            addCriterion("TICKET_SOURCE <", value, "ticketSource");
            return (Criteria) this;
        }

        public Criteria andTicketSourceLessThanOrEqualTo(String value) {
            addCriterion("TICKET_SOURCE <=", value, "ticketSource");
            return (Criteria) this;
        }

        public Criteria andTicketSourceLike(String value) {
            addCriterion("TICKET_SOURCE like", value, "ticketSource");
            return (Criteria) this;
        }

        public Criteria andTicketSourceNotLike(String value) {
            addCriterion("TICKET_SOURCE not like", value, "ticketSource");
            return (Criteria) this;
        }

        public Criteria andTicketSourceIn(List<String> values) {
            addCriterion("TICKET_SOURCE in", values, "ticketSource");
            return (Criteria) this;
        }

        public Criteria andTicketSourceNotIn(List<String> values) {
            addCriterion("TICKET_SOURCE not in", values, "ticketSource");
            return (Criteria) this;
        }

        public Criteria andTicketSourceBetween(String value1, String value2) {
            addCriterion("TICKET_SOURCE between", value1, value2, "ticketSource");
            return (Criteria) this;
        }

        public Criteria andTicketSourceNotBetween(String value1, String value2) {
            addCriterion("TICKET_SOURCE not between", value1, value2, "ticketSource");
            return (Criteria) this;
        }

        public Criteria andInitialSourceIsNull() {
            addCriterion("INITIAL_SOURCE is null");
            return (Criteria) this;
        }

        public Criteria andInitialSourceIsNotNull() {
            addCriterion("INITIAL_SOURCE is not null");
            return (Criteria) this;
        }

        public Criteria andInitialSourceEqualTo(String value) {
            addCriterion("INITIAL_SOURCE =", value, "initialSource");
            return (Criteria) this;
        }

        public Criteria andInitialSourceNotEqualTo(String value) {
            addCriterion("INITIAL_SOURCE <>", value, "initialSource");
            return (Criteria) this;
        }

        public Criteria andInitialSourceGreaterThan(String value) {
            addCriterion("INITIAL_SOURCE >", value, "initialSource");
            return (Criteria) this;
        }

        public Criteria andInitialSourceGreaterThanOrEqualTo(String value) {
            addCriterion("INITIAL_SOURCE >=", value, "initialSource");
            return (Criteria) this;
        }

        public Criteria andInitialSourceLessThan(String value) {
            addCriterion("INITIAL_SOURCE <", value, "initialSource");
            return (Criteria) this;
        }

        public Criteria andInitialSourceLessThanOrEqualTo(String value) {
            addCriterion("INITIAL_SOURCE <=", value, "initialSource");
            return (Criteria) this;
        }

        public Criteria andInitialSourceLike(String value) {
            addCriterion("INITIAL_SOURCE like", value, "initialSource");
            return (Criteria) this;
        }

        public Criteria andInitialSourceNotLike(String value) {
            addCriterion("INITIAL_SOURCE not like", value, "initialSource");
            return (Criteria) this;
        }

        public Criteria andInitialSourceIn(List<String> values) {
            addCriterion("INITIAL_SOURCE in", values, "initialSource");
            return (Criteria) this;
        }

        public Criteria andInitialSourceNotIn(List<String> values) {
            addCriterion("INITIAL_SOURCE not in", values, "initialSource");
            return (Criteria) this;
        }

        public Criteria andInitialSourceBetween(String value1, String value2) {
            addCriterion("INITIAL_SOURCE between", value1, value2, "initialSource");
            return (Criteria) this;
        }

        public Criteria andInitialSourceNotBetween(String value1, String value2) {
            addCriterion("INITIAL_SOURCE not between", value1, value2, "initialSource");
            return (Criteria) this;
        }

        public Criteria andAccountIsNull() {
            addCriterion("ACCOUNT is null");
            return (Criteria) this;
        }

        public Criteria andAccountIsNotNull() {
            addCriterion("ACCOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andAccountEqualTo(String value) {
            addCriterion("ACCOUNT =", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountNotEqualTo(String value) {
            addCriterion("ACCOUNT <>", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountGreaterThan(String value) {
            addCriterion("ACCOUNT >", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountGreaterThanOrEqualTo(String value) {
            addCriterion("ACCOUNT >=", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountLessThan(String value) {
            addCriterion("ACCOUNT <", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountLessThanOrEqualTo(String value) {
            addCriterion("ACCOUNT <=", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountLike(String value) {
            addCriterion("ACCOUNT like", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountNotLike(String value) {
            addCriterion("ACCOUNT not like", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountIn(List<String> values) {
            addCriterion("ACCOUNT in", values, "account");
            return (Criteria) this;
        }

        public Criteria andAccountNotIn(List<String> values) {
            addCriterion("ACCOUNT not in", values, "account");
            return (Criteria) this;
        }

        public Criteria andAccountBetween(String value1, String value2) {
            addCriterion("ACCOUNT between", value1, value2, "account");
            return (Criteria) this;
        }

        public Criteria andAccountNotBetween(String value1, String value2) {
            addCriterion("ACCOUNT not between", value1, value2, "account");
            return (Criteria) this;
        }

        public Criteria andAccessDescIsNull() {
            addCriterion("ACCESS_DESC is null");
            return (Criteria) this;
        }

        public Criteria andAccessDescIsNotNull() {
            addCriterion("ACCESS_DESC is not null");
            return (Criteria) this;
        }

        public Criteria andAccessDescEqualTo(String value) {
            addCriterion("ACCESS_DESC =", value, "accessDesc");
            return (Criteria) this;
        }

        public Criteria andAccessDescNotEqualTo(String value) {
            addCriterion("ACCESS_DESC <>", value, "accessDesc");
            return (Criteria) this;
        }

        public Criteria andAccessDescGreaterThan(String value) {
            addCriterion("ACCESS_DESC >", value, "accessDesc");
            return (Criteria) this;
        }

        public Criteria andAccessDescGreaterThanOrEqualTo(String value) {
            addCriterion("ACCESS_DESC >=", value, "accessDesc");
            return (Criteria) this;
        }

        public Criteria andAccessDescLessThan(String value) {
            addCriterion("ACCESS_DESC <", value, "accessDesc");
            return (Criteria) this;
        }

        public Criteria andAccessDescLessThanOrEqualTo(String value) {
            addCriterion("ACCESS_DESC <=", value, "accessDesc");
            return (Criteria) this;
        }

        public Criteria andAccessDescLike(String value) {
            addCriterion("ACCESS_DESC like", value, "accessDesc");
            return (Criteria) this;
        }

        public Criteria andAccessDescNotLike(String value) {
            addCriterion("ACCESS_DESC not like", value, "accessDesc");
            return (Criteria) this;
        }

        public Criteria andAccessDescIn(List<String> values) {
            addCriterion("ACCESS_DESC in", values, "accessDesc");
            return (Criteria) this;
        }

        public Criteria andAccessDescNotIn(List<String> values) {
            addCriterion("ACCESS_DESC not in", values, "accessDesc");
            return (Criteria) this;
        }

        public Criteria andAccessDescBetween(String value1, String value2) {
            addCriterion("ACCESS_DESC between", value1, value2, "accessDesc");
            return (Criteria) this;
        }

        public Criteria andAccessDescNotBetween(String value1, String value2) {
            addCriterion("ACCESS_DESC not between", value1, value2, "accessDesc");
            return (Criteria) this;
        }

        public Criteria andAccessAddIsNull() {
            addCriterion("ACCESS_ADD is null");
            return (Criteria) this;
        }

        public Criteria andAccessAddIsNotNull() {
            addCriterion("ACCESS_ADD is not null");
            return (Criteria) this;
        }

        public Criteria andAccessAddEqualTo(String value) {
            addCriterion("ACCESS_ADD =", value, "accessAdd");
            return (Criteria) this;
        }

        public Criteria andAccessAddNotEqualTo(String value) {
            addCriterion("ACCESS_ADD <>", value, "accessAdd");
            return (Criteria) this;
        }

        public Criteria andAccessAddGreaterThan(String value) {
            addCriterion("ACCESS_ADD >", value, "accessAdd");
            return (Criteria) this;
        }

        public Criteria andAccessAddGreaterThanOrEqualTo(String value) {
            addCriterion("ACCESS_ADD >=", value, "accessAdd");
            return (Criteria) this;
        }

        public Criteria andAccessAddLessThan(String value) {
            addCriterion("ACCESS_ADD <", value, "accessAdd");
            return (Criteria) this;
        }

        public Criteria andAccessAddLessThanOrEqualTo(String value) {
            addCriterion("ACCESS_ADD <=", value, "accessAdd");
            return (Criteria) this;
        }

        public Criteria andAccessAddLike(String value) {
            addCriterion("ACCESS_ADD like", value, "accessAdd");
            return (Criteria) this;
        }

        public Criteria andAccessAddNotLike(String value) {
            addCriterion("ACCESS_ADD not like", value, "accessAdd");
            return (Criteria) this;
        }

        public Criteria andAccessAddIn(List<String> values) {
            addCriterion("ACCESS_ADD in", values, "accessAdd");
            return (Criteria) this;
        }

        public Criteria andAccessAddNotIn(List<String> values) {
            addCriterion("ACCESS_ADD not in", values, "accessAdd");
            return (Criteria) this;
        }

        public Criteria andAccessAddBetween(String value1, String value2) {
            addCriterion("ACCESS_ADD between", value1, value2, "accessAdd");
            return (Criteria) this;
        }

        public Criteria andAccessAddNotBetween(String value1, String value2) {
            addCriterion("ACCESS_ADD not between", value1, value2, "accessAdd");
            return (Criteria) this;
        }

        public Criteria andAccessSignIsNull() {
            addCriterion("ACCESS_SIGN is null");
            return (Criteria) this;
        }

        public Criteria andAccessSignIsNotNull() {
            addCriterion("ACCESS_SIGN is not null");
            return (Criteria) this;
        }

        public Criteria andAccessSignEqualTo(String value) {
            addCriterion("ACCESS_SIGN =", value, "accessSign");
            return (Criteria) this;
        }

        public Criteria andAccessSignNotEqualTo(String value) {
            addCriterion("ACCESS_SIGN <>", value, "accessSign");
            return (Criteria) this;
        }

        public Criteria andAccessSignGreaterThan(String value) {
            addCriterion("ACCESS_SIGN >", value, "accessSign");
            return (Criteria) this;
        }

        public Criteria andAccessSignGreaterThanOrEqualTo(String value) {
            addCriterion("ACCESS_SIGN >=", value, "accessSign");
            return (Criteria) this;
        }

        public Criteria andAccessSignLessThan(String value) {
            addCriterion("ACCESS_SIGN <", value, "accessSign");
            return (Criteria) this;
        }

        public Criteria andAccessSignLessThanOrEqualTo(String value) {
            addCriterion("ACCESS_SIGN <=", value, "accessSign");
            return (Criteria) this;
        }

        public Criteria andAccessSignLike(String value) {
            addCriterion("ACCESS_SIGN like", value, "accessSign");
            return (Criteria) this;
        }

        public Criteria andAccessSignNotLike(String value) {
            addCriterion("ACCESS_SIGN not like", value, "accessSign");
            return (Criteria) this;
        }

        public Criteria andAccessSignIn(List<String> values) {
            addCriterion("ACCESS_SIGN in", values, "accessSign");
            return (Criteria) this;
        }

        public Criteria andAccessSignNotIn(List<String> values) {
            addCriterion("ACCESS_SIGN not in", values, "accessSign");
            return (Criteria) this;
        }

        public Criteria andAccessSignBetween(String value1, String value2) {
            addCriterion("ACCESS_SIGN between", value1, value2, "accessSign");
            return (Criteria) this;
        }

        public Criteria andAccessSignNotBetween(String value1, String value2) {
            addCriterion("ACCESS_SIGN not between", value1, value2, "accessSign");
            return (Criteria) this;
        }

        public Criteria andSessionIdIsNull() {
            addCriterion("SESSION_ID is null");
            return (Criteria) this;
        }

        public Criteria andSessionIdIsNotNull() {
            addCriterion("SESSION_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSessionIdEqualTo(String value) {
            addCriterion("SESSION_ID =", value, "sessionId");
            return (Criteria) this;
        }

        public Criteria andSessionIdNotEqualTo(String value) {
            addCriterion("SESSION_ID <>", value, "sessionId");
            return (Criteria) this;
        }

        public Criteria andSessionIdGreaterThan(String value) {
            addCriterion("SESSION_ID >", value, "sessionId");
            return (Criteria) this;
        }

        public Criteria andSessionIdGreaterThanOrEqualTo(String value) {
            addCriterion("SESSION_ID >=", value, "sessionId");
            return (Criteria) this;
        }

        public Criteria andSessionIdLessThan(String value) {
            addCriterion("SESSION_ID <", value, "sessionId");
            return (Criteria) this;
        }

        public Criteria andSessionIdLessThanOrEqualTo(String value) {
            addCriterion("SESSION_ID <=", value, "sessionId");
            return (Criteria) this;
        }

        public Criteria andSessionIdLike(String value) {
            addCriterion("SESSION_ID like", value, "sessionId");
            return (Criteria) this;
        }

        public Criteria andSessionIdNotLike(String value) {
            addCriterion("SESSION_ID not like", value, "sessionId");
            return (Criteria) this;
        }

        public Criteria andSessionIdIn(List<String> values) {
            addCriterion("SESSION_ID in", values, "sessionId");
            return (Criteria) this;
        }

        public Criteria andSessionIdNotIn(List<String> values) {
            addCriterion("SESSION_ID not in", values, "sessionId");
            return (Criteria) this;
        }

        public Criteria andSessionIdBetween(String value1, String value2) {
            addCriterion("SESSION_ID between", value1, value2, "sessionId");
            return (Criteria) this;
        }

        public Criteria andSessionIdNotBetween(String value1, String value2) {
            addCriterion("SESSION_ID not between", value1, value2, "sessionId");
            return (Criteria) this;
        }

        public Criteria andAppIpIsNull() {
            addCriterion("APP_IP is null");
            return (Criteria) this;
        }

        public Criteria andAppIpIsNotNull() {
            addCriterion("APP_IP is not null");
            return (Criteria) this;
        }

        public Criteria andAppIpEqualTo(String value) {
            addCriterion("APP_IP =", value, "appIp");
            return (Criteria) this;
        }

        public Criteria andAppIpNotEqualTo(String value) {
            addCriterion("APP_IP <>", value, "appIp");
            return (Criteria) this;
        }

        public Criteria andAppIpGreaterThan(String value) {
            addCriterion("APP_IP >", value, "appIp");
            return (Criteria) this;
        }

        public Criteria andAppIpGreaterThanOrEqualTo(String value) {
            addCriterion("APP_IP >=", value, "appIp");
            return (Criteria) this;
        }

        public Criteria andAppIpLessThan(String value) {
            addCriterion("APP_IP <", value, "appIp");
            return (Criteria) this;
        }

        public Criteria andAppIpLessThanOrEqualTo(String value) {
            addCriterion("APP_IP <=", value, "appIp");
            return (Criteria) this;
        }

        public Criteria andAppIpLike(String value) {
            addCriterion("APP_IP like", value, "appIp");
            return (Criteria) this;
        }

        public Criteria andAppIpNotLike(String value) {
            addCriterion("APP_IP not like", value, "appIp");
            return (Criteria) this;
        }

        public Criteria andAppIpIn(List<String> values) {
            addCriterion("APP_IP in", values, "appIp");
            return (Criteria) this;
        }

        public Criteria andAppIpNotIn(List<String> values) {
            addCriterion("APP_IP not in", values, "appIp");
            return (Criteria) this;
        }

        public Criteria andAppIpBetween(String value1, String value2) {
            addCriterion("APP_IP between", value1, value2, "appIp");
            return (Criteria) this;
        }

        public Criteria andAppIpNotBetween(String value1, String value2) {
            addCriterion("APP_IP not between", value1, value2, "appIp");
            return (Criteria) this;
        }

        public Criteria andCallingNoIsNull() {
            addCriterion("CALLING_NO is null");
            return (Criteria) this;
        }

        public Criteria andCallingNoIsNotNull() {
            addCriterion("CALLING_NO is not null");
            return (Criteria) this;
        }

        public Criteria andCallingNoEqualTo(String value) {
            addCriterion("CALLING_NO =", value, "callingNo");
            return (Criteria) this;
        }

        public Criteria andCallingNoNotEqualTo(String value) {
            addCriterion("CALLING_NO <>", value, "callingNo");
            return (Criteria) this;
        }

        public Criteria andCallingNoGreaterThan(String value) {
            addCriterion("CALLING_NO >", value, "callingNo");
            return (Criteria) this;
        }

        public Criteria andCallingNoGreaterThanOrEqualTo(String value) {
            addCriterion("CALLING_NO >=", value, "callingNo");
            return (Criteria) this;
        }

        public Criteria andCallingNoLessThan(String value) {
            addCriterion("CALLING_NO <", value, "callingNo");
            return (Criteria) this;
        }

        public Criteria andCallingNoLessThanOrEqualTo(String value) {
            addCriterion("CALLING_NO <=", value, "callingNo");
            return (Criteria) this;
        }

        public Criteria andCallingNoLike(String value) {
            addCriterion("CALLING_NO like", value, "callingNo");
            return (Criteria) this;
        }

        public Criteria andCallingNoNotLike(String value) {
            addCriterion("CALLING_NO not like", value, "callingNo");
            return (Criteria) this;
        }

        public Criteria andCallingNoIn(List<String> values) {
            addCriterion("CALLING_NO in", values, "callingNo");
            return (Criteria) this;
        }

        public Criteria andCallingNoNotIn(List<String> values) {
            addCriterion("CALLING_NO not in", values, "callingNo");
            return (Criteria) this;
        }

        public Criteria andCallingNoBetween(String value1, String value2) {
            addCriterion("CALLING_NO between", value1, value2, "callingNo");
            return (Criteria) this;
        }

        public Criteria andCallingNoNotBetween(String value1, String value2) {
            addCriterion("CALLING_NO not between", value1, value2, "callingNo");
            return (Criteria) this;
        }

        public Criteria andMacNumIsNull() {
            addCriterion("MAC_NUM is null");
            return (Criteria) this;
        }

        public Criteria andMacNumIsNotNull() {
            addCriterion("MAC_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andMacNumEqualTo(String value) {
            addCriterion("MAC_NUM =", value, "macNum");
            return (Criteria) this;
        }

        public Criteria andMacNumNotEqualTo(String value) {
            addCriterion("MAC_NUM <>", value, "macNum");
            return (Criteria) this;
        }

        public Criteria andMacNumGreaterThan(String value) {
            addCriterion("MAC_NUM >", value, "macNum");
            return (Criteria) this;
        }

        public Criteria andMacNumGreaterThanOrEqualTo(String value) {
            addCriterion("MAC_NUM >=", value, "macNum");
            return (Criteria) this;
        }

        public Criteria andMacNumLessThan(String value) {
            addCriterion("MAC_NUM <", value, "macNum");
            return (Criteria) this;
        }

        public Criteria andMacNumLessThanOrEqualTo(String value) {
            addCriterion("MAC_NUM <=", value, "macNum");
            return (Criteria) this;
        }

        public Criteria andMacNumLike(String value) {
            addCriterion("MAC_NUM like", value, "macNum");
            return (Criteria) this;
        }

        public Criteria andMacNumNotLike(String value) {
            addCriterion("MAC_NUM not like", value, "macNum");
            return (Criteria) this;
        }

        public Criteria andMacNumIn(List<String> values) {
            addCriterion("MAC_NUM in", values, "macNum");
            return (Criteria) this;
        }

        public Criteria andMacNumNotIn(List<String> values) {
            addCriterion("MAC_NUM not in", values, "macNum");
            return (Criteria) this;
        }

        public Criteria andMacNumBetween(String value1, String value2) {
            addCriterion("MAC_NUM between", value1, value2, "macNum");
            return (Criteria) this;
        }

        public Criteria andMacNumNotBetween(String value1, String value2) {
            addCriterion("MAC_NUM not between", value1, value2, "macNum");
            return (Criteria) this;
        }

        public Criteria andCalledNoIsNull() {
            addCriterion("CALLED_NO is null");
            return (Criteria) this;
        }

        public Criteria andCalledNoIsNotNull() {
            addCriterion("CALLED_NO is not null");
            return (Criteria) this;
        }

        public Criteria andCalledNoEqualTo(String value) {
            addCriterion("CALLED_NO =", value, "calledNo");
            return (Criteria) this;
        }

        public Criteria andCalledNoNotEqualTo(String value) {
            addCriterion("CALLED_NO <>", value, "calledNo");
            return (Criteria) this;
        }

        public Criteria andCalledNoGreaterThan(String value) {
            addCriterion("CALLED_NO >", value, "calledNo");
            return (Criteria) this;
        }

        public Criteria andCalledNoGreaterThanOrEqualTo(String value) {
            addCriterion("CALLED_NO >=", value, "calledNo");
            return (Criteria) this;
        }

        public Criteria andCalledNoLessThan(String value) {
            addCriterion("CALLED_NO <", value, "calledNo");
            return (Criteria) this;
        }

        public Criteria andCalledNoLessThanOrEqualTo(String value) {
            addCriterion("CALLED_NO <=", value, "calledNo");
            return (Criteria) this;
        }

        public Criteria andCalledNoLike(String value) {
            addCriterion("CALLED_NO like", value, "calledNo");
            return (Criteria) this;
        }

        public Criteria andCalledNoNotLike(String value) {
            addCriterion("CALLED_NO not like", value, "calledNo");
            return (Criteria) this;
        }

        public Criteria andCalledNoIn(List<String> values) {
            addCriterion("CALLED_NO in", values, "calledNo");
            return (Criteria) this;
        }

        public Criteria andCalledNoNotIn(List<String> values) {
            addCriterion("CALLED_NO not in", values, "calledNo");
            return (Criteria) this;
        }

        public Criteria andCalledNoBetween(String value1, String value2) {
            addCriterion("CALLED_NO between", value1, value2, "calledNo");
            return (Criteria) this;
        }

        public Criteria andCalledNoNotBetween(String value1, String value2) {
            addCriterion("CALLED_NO not between", value1, value2, "calledNo");
            return (Criteria) this;
        }

        public Criteria andStartTimeIsNull() {
            addCriterion("START_TIME is null");
            return (Criteria) this;
        }

        public Criteria andStartTimeIsNotNull() {
            addCriterion("START_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andStartTimeEqualTo(String value) {
            addCriterion("START_TIME =", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotEqualTo(String value) {
            addCriterion("START_TIME <>", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThan(String value) {
            addCriterion("START_TIME >", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThanOrEqualTo(String value) {
            addCriterion("START_TIME >=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThan(String value) {
            addCriterion("START_TIME <", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThanOrEqualTo(String value) {
            addCriterion("START_TIME <=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLike(String value) {
            addCriterion("START_TIME like", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotLike(String value) {
            addCriterion("START_TIME not like", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeIn(List<String> values) {
            addCriterion("START_TIME in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotIn(List<String> values) {
            addCriterion("START_TIME not in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeBetween(String value1, String value2) {
            addCriterion("START_TIME between", value1, value2, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotBetween(String value1, String value2) {
            addCriterion("START_TIME not between", value1, value2, "startTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNull() {
            addCriterion("END_TIME is null");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNotNull() {
            addCriterion("END_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andEndTimeEqualTo(String value) {
            addCriterion("END_TIME =", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotEqualTo(String value) {
            addCriterion("END_TIME <>", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThan(String value) {
            addCriterion("END_TIME >", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThanOrEqualTo(String value) {
            addCriterion("END_TIME >=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThan(String value) {
            addCriterion("END_TIME <", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThanOrEqualTo(String value) {
            addCriterion("END_TIME <=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLike(String value) {
            addCriterion("END_TIME like", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotLike(String value) {
            addCriterion("END_TIME not like", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIn(List<String> values) {
            addCriterion("END_TIME in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotIn(List<String> values) {
            addCriterion("END_TIME not in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeBetween(String value1, String value2) {
            addCriterion("END_TIME between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotBetween(String value1, String value2) {
            addCriterion("END_TIME not between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andCallTimeIsNull() {
            addCriterion("CALL_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCallTimeIsNotNull() {
            addCriterion("CALL_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCallTimeEqualTo(BigDecimal value) {
            addCriterion("CALL_TIME =", value, "callTime");
            return (Criteria) this;
        }

        public Criteria andCallTimeNotEqualTo(BigDecimal value) {
            addCriterion("CALL_TIME <>", value, "callTime");
            return (Criteria) this;
        }

        public Criteria andCallTimeGreaterThan(BigDecimal value) {
            addCriterion("CALL_TIME >", value, "callTime");
            return (Criteria) this;
        }

        public Criteria andCallTimeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CALL_TIME >=", value, "callTime");
            return (Criteria) this;
        }

        public Criteria andCallTimeLessThan(BigDecimal value) {
            addCriterion("CALL_TIME <", value, "callTime");
            return (Criteria) this;
        }

        public Criteria andCallTimeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CALL_TIME <=", value, "callTime");
            return (Criteria) this;
        }

        public Criteria andCallTimeIn(List<BigDecimal> values) {
            addCriterion("CALL_TIME in", values, "callTime");
            return (Criteria) this;
        }

        public Criteria andCallTimeNotIn(List<BigDecimal> values) {
            addCriterion("CALL_TIME not in", values, "callTime");
            return (Criteria) this;
        }

        public Criteria andCallTimeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CALL_TIME between", value1, value2, "callTime");
            return (Criteria) this;
        }

        public Criteria andCallTimeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CALL_TIME not between", value1, value2, "callTime");
            return (Criteria) this;
        }

        public Criteria andInDischargeIsNull() {
            addCriterion("IN_DISCHARGE is null");
            return (Criteria) this;
        }

        public Criteria andInDischargeIsNotNull() {
            addCriterion("IN_DISCHARGE is not null");
            return (Criteria) this;
        }

        public Criteria andInDischargeEqualTo(String value) {
            addCriterion("IN_DISCHARGE =", value, "inDischarge");
            return (Criteria) this;
        }

        public Criteria andInDischargeNotEqualTo(String value) {
            addCriterion("IN_DISCHARGE <>", value, "inDischarge");
            return (Criteria) this;
        }

        public Criteria andInDischargeGreaterThan(String value) {
            addCriterion("IN_DISCHARGE >", value, "inDischarge");
            return (Criteria) this;
        }

        public Criteria andInDischargeGreaterThanOrEqualTo(String value) {
            addCriterion("IN_DISCHARGE >=", value, "inDischarge");
            return (Criteria) this;
        }

        public Criteria andInDischargeLessThan(String value) {
            addCriterion("IN_DISCHARGE <", value, "inDischarge");
            return (Criteria) this;
        }

        public Criteria andInDischargeLessThanOrEqualTo(String value) {
            addCriterion("IN_DISCHARGE <=", value, "inDischarge");
            return (Criteria) this;
        }

        public Criteria andInDischargeLike(String value) {
            addCriterion("IN_DISCHARGE like", value, "inDischarge");
            return (Criteria) this;
        }

        public Criteria andInDischargeNotLike(String value) {
            addCriterion("IN_DISCHARGE not like", value, "inDischarge");
            return (Criteria) this;
        }

        public Criteria andInDischargeIn(List<String> values) {
            addCriterion("IN_DISCHARGE in", values, "inDischarge");
            return (Criteria) this;
        }

        public Criteria andInDischargeNotIn(List<String> values) {
            addCriterion("IN_DISCHARGE not in", values, "inDischarge");
            return (Criteria) this;
        }

        public Criteria andInDischargeBetween(String value1, String value2) {
            addCriterion("IN_DISCHARGE between", value1, value2, "inDischarge");
            return (Criteria) this;
        }

        public Criteria andInDischargeNotBetween(String value1, String value2) {
            addCriterion("IN_DISCHARGE not between", value1, value2, "inDischarge");
            return (Criteria) this;
        }

        public Criteria andOutDischargeIsNull() {
            addCriterion("OUT_DISCHARGE is null");
            return (Criteria) this;
        }

        public Criteria andOutDischargeIsNotNull() {
            addCriterion("OUT_DISCHARGE is not null");
            return (Criteria) this;
        }

        public Criteria andOutDischargeEqualTo(String value) {
            addCriterion("OUT_DISCHARGE =", value, "outDischarge");
            return (Criteria) this;
        }

        public Criteria andOutDischargeNotEqualTo(String value) {
            addCriterion("OUT_DISCHARGE <>", value, "outDischarge");
            return (Criteria) this;
        }

        public Criteria andOutDischargeGreaterThan(String value) {
            addCriterion("OUT_DISCHARGE >", value, "outDischarge");
            return (Criteria) this;
        }

        public Criteria andOutDischargeGreaterThanOrEqualTo(String value) {
            addCriterion("OUT_DISCHARGE >=", value, "outDischarge");
            return (Criteria) this;
        }

        public Criteria andOutDischargeLessThan(String value) {
            addCriterion("OUT_DISCHARGE <", value, "outDischarge");
            return (Criteria) this;
        }

        public Criteria andOutDischargeLessThanOrEqualTo(String value) {
            addCriterion("OUT_DISCHARGE <=", value, "outDischarge");
            return (Criteria) this;
        }

        public Criteria andOutDischargeLike(String value) {
            addCriterion("OUT_DISCHARGE like", value, "outDischarge");
            return (Criteria) this;
        }

        public Criteria andOutDischargeNotLike(String value) {
            addCriterion("OUT_DISCHARGE not like", value, "outDischarge");
            return (Criteria) this;
        }

        public Criteria andOutDischargeIn(List<String> values) {
            addCriterion("OUT_DISCHARGE in", values, "outDischarge");
            return (Criteria) this;
        }

        public Criteria andOutDischargeNotIn(List<String> values) {
            addCriterion("OUT_DISCHARGE not in", values, "outDischarge");
            return (Criteria) this;
        }

        public Criteria andOutDischargeBetween(String value1, String value2) {
            addCriterion("OUT_DISCHARGE between", value1, value2, "outDischarge");
            return (Criteria) this;
        }

        public Criteria andOutDischargeNotBetween(String value1, String value2) {
            addCriterion("OUT_DISCHARGE not between", value1, value2, "outDischarge");
            return (Criteria) this;
        }

        public Criteria andAllDischargeIsNull() {
            addCriterion("ALL_DISCHARGE is null");
            return (Criteria) this;
        }

        public Criteria andAllDischargeIsNotNull() {
            addCriterion("ALL_DISCHARGE is not null");
            return (Criteria) this;
        }

        public Criteria andAllDischargeEqualTo(String value) {
            addCriterion("ALL_DISCHARGE =", value, "allDischarge");
            return (Criteria) this;
        }

        public Criteria andAllDischargeNotEqualTo(String value) {
            addCriterion("ALL_DISCHARGE <>", value, "allDischarge");
            return (Criteria) this;
        }

        public Criteria andAllDischargeGreaterThan(String value) {
            addCriterion("ALL_DISCHARGE >", value, "allDischarge");
            return (Criteria) this;
        }

        public Criteria andAllDischargeGreaterThanOrEqualTo(String value) {
            addCriterion("ALL_DISCHARGE >=", value, "allDischarge");
            return (Criteria) this;
        }

        public Criteria andAllDischargeLessThan(String value) {
            addCriterion("ALL_DISCHARGE <", value, "allDischarge");
            return (Criteria) this;
        }

        public Criteria andAllDischargeLessThanOrEqualTo(String value) {
            addCriterion("ALL_DISCHARGE <=", value, "allDischarge");
            return (Criteria) this;
        }

        public Criteria andAllDischargeLike(String value) {
            addCriterion("ALL_DISCHARGE like", value, "allDischarge");
            return (Criteria) this;
        }

        public Criteria andAllDischargeNotLike(String value) {
            addCriterion("ALL_DISCHARGE not like", value, "allDischarge");
            return (Criteria) this;
        }

        public Criteria andAllDischargeIn(List<String> values) {
            addCriterion("ALL_DISCHARGE in", values, "allDischarge");
            return (Criteria) this;
        }

        public Criteria andAllDischargeNotIn(List<String> values) {
            addCriterion("ALL_DISCHARGE not in", values, "allDischarge");
            return (Criteria) this;
        }

        public Criteria andAllDischargeBetween(String value1, String value2) {
            addCriterion("ALL_DISCHARGE between", value1, value2, "allDischarge");
            return (Criteria) this;
        }

        public Criteria andAllDischargeNotBetween(String value1, String value2) {
            addCriterion("ALL_DISCHARGE not between", value1, value2, "allDischarge");
            return (Criteria) this;
        }

        public Criteria andCountryIsNull() {
            addCriterion("COUNTRY is null");
            return (Criteria) this;
        }

        public Criteria andCountryIsNotNull() {
            addCriterion("COUNTRY is not null");
            return (Criteria) this;
        }

        public Criteria andCountryEqualTo(String value) {
            addCriterion("COUNTRY =", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryNotEqualTo(String value) {
            addCriterion("COUNTRY <>", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryGreaterThan(String value) {
            addCriterion("COUNTRY >", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryGreaterThanOrEqualTo(String value) {
            addCriterion("COUNTRY >=", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryLessThan(String value) {
            addCriterion("COUNTRY <", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryLessThanOrEqualTo(String value) {
            addCriterion("COUNTRY <=", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryLike(String value) {
            addCriterion("COUNTRY like", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryNotLike(String value) {
            addCriterion("COUNTRY not like", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryIn(List<String> values) {
            addCriterion("COUNTRY in", values, "country");
            return (Criteria) this;
        }

        public Criteria andCountryNotIn(List<String> values) {
            addCriterion("COUNTRY not in", values, "country");
            return (Criteria) this;
        }

        public Criteria andCountryBetween(String value1, String value2) {
            addCriterion("COUNTRY between", value1, value2, "country");
            return (Criteria) this;
        }

        public Criteria andCountryNotBetween(String value1, String value2) {
            addCriterion("COUNTRY not between", value1, value2, "country");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}